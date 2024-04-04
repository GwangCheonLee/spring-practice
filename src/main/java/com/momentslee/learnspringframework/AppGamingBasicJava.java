package com.momentslee.learnspringframework;

import com.momentslee.learnspringframework.game.GameRunner;
import com.momentslee.learnspringframework.game.SuperContraGame;

public class AppGamingBasicJava {
    public static void main(String[] args) {
//        var marioGame = new MarioGame();
        var superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(superContraGame);
        gameRunner.run();
    }
}
