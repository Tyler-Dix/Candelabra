package com.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandelabraGame game = new CandelabraGame(5); // Grid size is 5x5

        while (true) {
            game.printGrid();
            System.out.print("Enter your move (W/A/S/D): ");
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

