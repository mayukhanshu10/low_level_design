package tic_tac_toe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {

    //Board will be of Given size*size ie 2D matrix

    private int size;
    private List<List<Cell>> board; //2D arraylist


    public Board(int size) {
        this.size=size;
        this.board = new ArrayList<>();
        for(int i=0;i<size;++i){
            board.add(new ArrayList<>());
            for(int j = 0;j<size;++j){
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public void display(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(board.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    System.out.print("| |");
                }else{
                    System.out.print("| "+board.get(i).get(j).getPlayer().getSymbol()+" |");
                }
            }
            System.out.println();
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
}
