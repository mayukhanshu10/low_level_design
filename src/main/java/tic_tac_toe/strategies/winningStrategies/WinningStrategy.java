package tic_tac_toe.strategies.winningStrategies;

import tic_tac_toe.models.Board;
import tic_tac_toe.models.Move;

public interface WinningStrategy {

    boolean checkWinner(Board board, Move move);
}
