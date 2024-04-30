package tic_tac_toe.models;

public class Bot extends Player{
    private  BotDifficultyLevel botDifficultyLevel;

    public Bot(char symbol, String name, BotDifficultyLevel botDifficultyLevel) {
        //Whenever we are building child class, what child class does is, it call parent class default constructor.
        // Since here we have declared our own constructor in parent class, therefore we have to initalize Parent
        // attributes by calling super() and passing value.
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
