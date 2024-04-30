package tic_tac_toe.models;

import tic_tac_toe.exceptions.InvalidGameBuildException;
import tic_tac_toe.strategies.winningStrategies.WinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Move> moves;
    private Board board;
    private List<Player> players;
    private int  currentMovePlayerIndex;
    List<WinningStrategy> winningStrategies;
    private GameStatus gameStatus;
    private Player winner;

    public Game(int dimension, List<Player> players, List<WinningStrategy> winningStrategies) {
        this.moves = new ArrayList<>();
        this.board = new Board(dimension);
        this.players = players;
        this.currentMovePlayerIndex = 0;
        this.winningStrategies = winningStrategies;
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public Game(){

    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public int getCurrentMovePlayerIndex() {
        return currentMovePlayerIndex;
    }

    public void setCurrentMovePlayerIndex(int currentMovePlayerIndex) {
        this.currentMovePlayerIndex = currentMovePlayerIndex;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public GameStatus getGameStatus() {
        return gameStatus;
    }

    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }



    //Now Since we have too much of validations to put before commencment of game
    //Therefore we will use Builder Pattern to validate all those validation

    public static GameBuilder getGameBuilder(){
        return new GameBuilder();
    }


    public static class GameBuilder{

        //1) To build the game, we first atleast need a board to get created but we can create board once game start.
        // We just need Size at first to create size*size board.
        //2) Players are required while creating game,cauz if players are not there and for 3*3 board 4 players come afterword,
        // it ll not be allowed. So Players are needed while creation of game.
        //3) List<Move> is not required at the start of the game (i.e. no moves at start of game)
        // Game Status will be IN_PROGRESS while starting of game, there not needed to initalize in builder.

        private int size;
        private List<Player> players;

        public int getSize() {
            return size;
        }

        public GameBuilder setSize(int size) {
            this.size = size;
            return this;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public GameBuilder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        private boolean isValid() throws InvalidGameBuildException {
            if(this.size<3){
                throw new InvalidGameBuildException("Invalid GameBoard Size, It is less then 3`");
            }
            if (this.players.size() != (this.size-1)){
                throw new InvalidGameBuildException("Issue with number of players");
            }

            //More Validations
            return true;
        }

        public Game build() throws InvalidGameBuildException {

            isValid(); // If any validation fails, then from this line error will be thrown

            Game game = new Game();
            game.setBoard(new Board(size));
            game.setGameStatus(GameStatus.IN_PROGRESS);
            game.setPlayers(players);
            game.setMoves(new ArrayList<>());
            game.setCurrentMovePlayerIndex(0);
            return game;
        }

    }

    public void displayBoard(){
        this.board.display();
    }



}
