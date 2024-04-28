package tic_tac_toe.models;

public class Bot extends Player{
    private  BotDifficultyLevel botDifficultyLevel;

    public Bot(Symbol symbol, String name, BotDifficultyLevel botDifficultyLevel) {
        super(symbol, name , PlayerType.BOT);
        this.botDifficultyLevel = botDifficultyLevel;
    }


    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
