package com.momentslee.learnspringframework;

import com.momentslee.learnspringframework.game.GameRunner;
import com.momentslee.learnspringframework.game.MarioGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        var marioGame = new MarioGame();
        var gameRunner = new GameRunner(marioGame);
        gameRunner.run();
    }
}
