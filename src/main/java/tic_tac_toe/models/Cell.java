package tic_tac_toe.models;

public class Cell {
    int row;
    int col;
    private CellState cellState;
    private Player player;


    public Cell(int i,int j) {
        this.row=i;
        this.col=j;
        this.cellState = CellState.EMPTY;
    }

    public Cell(Player player, int i,int j,CellState cellState){
        this.player=player;
        this.row=i;
        this.col=j;
        this.cellState=cellState;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }
}
