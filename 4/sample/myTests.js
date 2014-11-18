function myFirstTest(){
  var game = MyGame;
  var actual = game.init(2,3);
  var expected = 5;

  MyTestFramework.assertThat(actual, expected);
}

(function(){
  myFirstTest();
  //all test names goes here
})();
