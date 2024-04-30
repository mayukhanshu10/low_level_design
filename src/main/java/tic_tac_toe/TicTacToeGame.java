package tic_tac_toe;

import tic_tac_toe.Controller.GameController;
import tic_tac_toe.exceptions.InvalidGameBuildException;
import tic_tac_toe.models.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) throws InvalidGameBuildException {
        Scanner scanner = new Scanner(System.in);

        //Setting Game Board Size
        System.out.println("Enter the size of the game");
        int size = scanner.nextInt();

        //Setting Number of players to be playing
        List<Player> players = new ArrayList<>();
        int numberOfPlayers = size-1;

        //Setting Bot in the game
        System.out.println("Will there be any BOT player? Y/N");
        String isBot = scanner.next();

        if(isBot.equals("Y")){
            numberOfPlayers-=1;
            System.out.println("What is name of the BOT? ");
            String name = scanner.next();

            System.out.println("Enter the Symbol of BOT: ");
            char symbol = scanner.next().charAt(0);

            //GET the difficulty Level of bot
            //It can be done by 1,2,3 1->Easy 2-> Medium etc........
            Player botPlayer = new Bot(symbol,name, BotDifficultyLevel.EASY);
            players.add(botPlayer);

        }


        //Setting Number of players in game
        //If bot there then size -2 Human Players else size-1 Human Players
        for(int i =0;i<numberOfPlayers;i++){
            //There is many diff things you can do to set player detail

            System.out.println("Enter name of player: "+(i+1));
            String name = scanner.next();
            System.out.println("Enter the Symbol: ");
            char symbol = scanner.next().charAt(0);

            players.add(new Player(symbol,name, PlayerType.HUMAN));

        }


        //Creating Game Controller Object to interact with Game API's
        //Api's are called in GameController Class
        GameController gc = new GameController();
        Game game = gc.createGame(size,players);
        gc.displayBoard(game);


    }
}

