package com.example.view;

public class CandelabraGame {

    private char[][] surfaceGrid;
    //    private char[][] subSurfaceGrid;
    private int playerXPosition;
    private int playerYPosition;


    public CandelabraGame(int gridSize) {
        surfaceGrid = new char[gridSize][gridSize];
        for (int i = 0; i < gridSize; i++) {
            for (int j = 0; j < gridSize; j++) {
                surfaceGrid[i][j] = '-';
            }
        }
        playerXPosition = 2;
        playerYPosition = 2;
        surfaceGrid[playerXPosition][playerYPosition] = 'P';
    }

    public void printGrid() {
        for (char[] row : surfaceGrid) {
            for (char cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }

    public void movePlayer(String direction) {
        surfaceGrid[playerXPosition][playerYPosition] = '-';

        // Update player position based on direction
        if (direction.equalsIgnoreCase("N") && playerXPosition > 0) {
            playerXPosition--;
        } else if (direction.equalsIgnoreCase("S") && playerXPosition < surfaceGrid.length - 1) {
            playerXPosition++;
        } else if (direction.equalsIgnoreCase("W") && playerYPosition > 0) {
            playerYPosition--;
        } else if (direction.equalsIgnoreCase("E") && playerYPosition < surfaceGrid.length - 1) {
            playerYPosition++;
        }

        surfaceGrid[playerXPosition][playerYPosition] = 'P';
    }

}

