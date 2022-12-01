import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    int rowNumber, columnNumber;
    int[][] minedMap;
    int[][] gameBoard;
    boolean game = true;

    Scanner scan = new Scanner(System.in);

    public MineSweeper(int rowNumber, int columnNumber) {
        this.rowNumber = rowNumber;
        this.columnNumber = columnNumber;
        this.minedMap = new int[rowNumber][columnNumber];
        this.gameBoard = new int[rowNumber][columnNumber];
    }

    public void run() {
        System.out.println("** Welcome to the Minesweeper game **");
        int success = 0;
        minedMap();
        print(minedMap);
        while (game) {
            print(gameBoard);
            System.out.print("Row Number: ");
            int row = scan.nextInt();
            System.out.print("Column Number: ");
            int column = scan.nextInt();

            if (row < 0 || row >= rowNumber || column < 0 || column >= columnNumber) {
                System.out.println("You have entered an invalid coordinate.");
                continue;
            }
            if (minedMap[row][column] != -1) {
                check(row, column);
                success++;
                if (success == (rowNumber * columnNumber) - (rowNumber * columnNumber / 4)) {
                    print(minedMap);
                    System.out.println("You Win!");
                    break;
                }
            } else {
                game = false;
                System.out.println("Game Over!");

            }
        }
    }

    public void check(int r, int c) {
        if (minedMap[r][c] == 0) {
            if (c < columnNumber - 1 && minedMap[r][c + 1] == -1) {
                gameBoard[r][c]++;
            }
            if (r > 0 && c < columnNumber - 1 && minedMap[r - 1][c + 1] == -1) {
                gameBoard[r][c]++;
            }
            if (r > 0 && minedMap[r - 1][c] == -1) {
                gameBoard[r][c]++;
            }
            if (r > 0 && c > 0 && minedMap[r - 1][c - 1] == -1) {
                gameBoard[r][c]++;
            }
            if (c > 0 && minedMap[r][c - 1] == -1) {
                gameBoard[r][c]++;
            }
            if (c > 0 && r < rowNumber - 1 && minedMap[r + 1][c - 1] == -1) {
                gameBoard[r][c]++;
            }
            if (r < rowNumber - 1 && minedMap[r + 1][c] == -1) {
                gameBoard[r][c]++;
            }
            if (c < columnNumber - 1 && r < rowNumber - 1 && minedMap[r + 1][c + 1] == -1) {
                gameBoard[r][c]++;
            }
            if (gameBoard[r][c] == 0) {
                gameBoard[r][c] = -2;
            }
        }
    }

    public void minedMap() {
        int count = 0;
        while (count != (rowNumber * columnNumber / 4)) {
            int randRow = (int) (Math.random() * this.rowNumber);
            int randCol = (int) (Math.random() * this.columnNumber);
            if (minedMap[randRow][randCol] != 1) {
                minedMap[randRow][randCol] = -1;
                count++;
            }
        }
    }

    public void print(int[][] arr) {
        for (int[] i : arr) {
            for (int j = 0; j < arr[0].length; j++) {
                if (i[j] >= 0) {
                    System.out.print(" ");
                }
                System.out.print(i[j] + " ");
            }
            System.out.println();
        }
    }
}