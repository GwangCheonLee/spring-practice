package com.momentslee.learnspringframework;

import com.momentslee.learnspringframework.game.GameRunner;
import com.momentslee.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var game = new MarioGame();
//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}