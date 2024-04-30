package tic_tac_toe.Controller;

import tic_tac_toe.models.Game;
import tic_tac_toe.models.GameStatus;
import tic_tac_toe.models.Player;

import java.util.List;

public class GameController {


    public Game createGame(int size, List<Player> players){
        try{
            return Game.getGameBuilder()
                    .setSize(size)
                    .setPlayers(players)
                    .build();
        }catch (Exception e){
            return null;
        }
    }

    public void undo(){

    }

    public void displayBoard(Game game){
        game.displayBoard();
    }

    public Player getWinner(Game game){
        return game.getWinner();
    }

    public GameStatus gameStatus(Game game){
        return game.getGameStatus();
    }
}
