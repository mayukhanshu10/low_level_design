package tic_tac_toe.strategies.botPlayingStrategies;

import tic_tac_toe.models.BotDifficultyLevel;

public class BotPlayingStrategyFactory {

    public static  BotPlayingStrategy getBotPlayingStrategyForDifficultyLevel(BotDifficultyLevel botDifficultyLevel){
        return switch (botDifficultyLevel){
            case EASY -> new EasyBotPlayingStrategy();
            case MEDIUM -> new MediumBotPlayingStrategy();
            case HARD -> new HardBotPlayingStrategy();
        };
    }


}
