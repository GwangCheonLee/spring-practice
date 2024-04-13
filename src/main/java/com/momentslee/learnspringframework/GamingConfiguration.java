package com.momentslee.learnspringframework;

import com.momentslee.learnspringframework.game.GamingConsole;
import com.momentslee.learnspringframework.game.PacmanGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole game() {
        var game = new PacmanGame();
        return game;
    }


}
