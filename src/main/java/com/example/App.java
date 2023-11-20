package com.example;

import com.example.entities.Player;

import java.util.Scanner;

public class App {
    private static final String[] MENU_OPTIONS = {};
    private static final String MENU_OPTION_MOVE = "Move";
    private static final String MENU_OPTION_EXAMINE = "Move";
    private static final String[] MOVE_MENU_OPTIONS = {};






    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandelabraGame game = new CandelabraGame(5); // Grid size is 5x5

//        Player player = new Player(); //Attributes need to be figured out here

        while (true) {
            game.printGrid();
            System.out.print("Which direction will you move? (N/S/E/W): ");
            String move = scanner.nextLine();

            if (move.equalsIgnoreCase("Q")) {
                System.out.println("Thanks for playing! Goodbye!");
                break;
            }

            game.movePlayer(move);
        }

        scanner.close();
    }
}

