package tic_tac_toe.strategies.botPlayingStrategies;

import tic_tac_toe.models.Board;
import tic_tac_toe.models.Cell;

public interface BotPlayingStrategy {

    Cell makeMove(Board board);

}
