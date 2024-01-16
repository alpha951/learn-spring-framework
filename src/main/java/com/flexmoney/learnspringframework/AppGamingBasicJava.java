package com.flexmoney.learnspringframework;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
//        var contraGame = new ContraGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}