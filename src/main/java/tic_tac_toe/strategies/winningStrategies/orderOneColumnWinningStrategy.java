package tic_tac_toe.strategies.winningStrategies;

import tic_tac_toe.models.Board;
import tic_tac_toe.models.Move;

public class orderOneColumnWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move move) {
        return false;
    }
}
