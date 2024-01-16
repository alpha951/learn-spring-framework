package com.flexmoney.learnspringframework;

public class GameRunner {
    private final GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.left();
        game.right();
        game.up();
        game.down();
        System.out.println("Running game :" + game);
    }
}
