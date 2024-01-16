package com.flexmoney.learnspringframework;

public class MarioGame implements GamingConsole {
    public void up() {
        System.out.println("UP");
    }

    public void down() {
        System.out.println("DOWN mario");
    }

    public void left() {
        System.out.println("Left, go slow");
    }

    public void right() {
        System.out.println("Right, accelerate");
    }
}
