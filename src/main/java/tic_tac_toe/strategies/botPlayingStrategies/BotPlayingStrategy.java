package tic_tac_toe.strategies.botPlayingStrategies;

import tic_tac_toe.models.Board;
import tic_tac_toe.models.Cell;

public interface BotPlayingStrategy {

    //Here makeMove function returns cell means this method suggest Game class on which cell should bot move.
    //It's the work of GAME class now to Validate if cell comming from BotPlayingStrategy is valid to move by bot or not.
    //Valid means if its free or not, Isnt the cell is blocked, etc

    Cell makeMove(Board board);

}
