package tic_tac_toe.models;

public class Move {

    //Who is the player making the move and on which cell he is making the move
    private Player player;
    private  Cell cell;


    public Move(Player player, Cell cell) {
        this.player = player;
        this.cell = cell;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Cell getCell() {
        return cell;
    }

    public void setCell(Cell cell) {
        this.cell = cell;
    }
}
