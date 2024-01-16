package com.flexmoney.learnspringframework;

public class ContraGame implements GamingConsole {
    public void up() {
        System.out.println("UP");
    }

    public void down() {
        System.out.println("DOWN contra");
    }

    public void left() {
        System.out.println("Left, go slow contra");
    }

    public void right() {
        System.out.println("Right, accelerate");
    }

}
