function myFirstTest(){
  var actual = 1;
  var expected = 2;

  MyTestFramework.assertThat(actual, expected);
}

(function(){
  myFirstTest();
  //all test names goes here
})();
