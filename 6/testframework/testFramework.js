var TEST_RESULTS_LIST = 'testResults';
var TEST_RESULTS_CONTAINER = 'container';
var TEST_COUNT_DIV = 'testCount';

var currentTestDescription;

var expect = function(actual){  
  var invertComparison = false;

  var appendToTestResults = function(result) {  

    var span = document.createElement('span');
    span.className = result === true ? 'passingTest' : 'failingTest';

    var text = document.createTextNode(currentTestDescription);
    span.appendChild(text);

    var listItem = document.createElement('li');
    listItem.appendChild(span);

    var list = document.getElementById(TEST_RESULTS_LIST);
    list.appendChild(listItem);
  }

  var updateTestCount = function(){

    var removeExistingTestCount = function(){
      var div = document.getElementById(TEST_COUNT_DIV);
      while (div.firstChild) {
        div.removeChild(div.firstChild);
      }   
    }

    removeExistingTestCount();

    var span = document.createElement('span');

    var testCount = document.getElementById(TEST_RESULTS_LIST).childNodes.length;
    
    var text = document.createTextNode('Test count: ' + testCount);
    span.appendChild(text);

    var div = document.getElementById(TEST_COUNT_DIV);
    div.appendChild(span);
  }

  return {    

    not: function(){
      invertComparison = true;
      return this;
    },

    toEqual: function(expected){
      var result = invertComparison ? expected !== actual : expected === actual;
      appendToTestResults(result);
      updateTestCount();
    }

  }
}

var assert = function(description, testFunction){
  currentTestDescription = description;

  testFunction(); 

  currentTestDescription = undefined; 
};

(function(){

  var list = document.createElement('ul');
  list.id = TEST_RESULTS_LIST;

  document.getElementById(TEST_RESULTS_CONTAINER).appendChild(list);

}());

