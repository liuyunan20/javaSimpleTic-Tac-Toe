package tictactoe;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String boardSymbols = scanner.next();
        printBoard(boardSymbols);
        String result = checkResult(boardSymbols);
        System.out.println(result);
    }
    static void printBoard(String symbols) {
        String dashes = "---------";
        System.out.println(dashes);
        for (int i = 0; i < 3; i++) {
            String line = "| ";
            for (int j = 0; j < 3; j++) {
                line = line + symbols.charAt(j + 3 * i) + " ";
            }
            line += "|";
            System.out.println(line);
        }
        System.out.println(dashes);
    }

    static String checkResult(String symbols) {
        int numX = 0, numO = 0;
        for (int i = 0; i < 9; i++) {
            if (symbols.charAt(i) == 'X') {
                numX++;
            } else if (symbols.charAt(i) == 'O') {
                numO++;
            }
        }
        if (numO - numX > 1 || numX - numO > 1) {
            return "Impossible";
        }
        boolean boardNotFull = symbols.contains("_");
        char [] winPatternX = {'X', 'X', 'X'};
        char [] winPatternO = {'O', 'O', 'O'};
        boolean xWin = false, oWin  = false;
        char [][] board = new char[3][3];
        for (int i = 0; i <3; i++) {
            board[i] = symbols.substring(3 * i, 3 * i + 3).toCharArray();
        }
        for (int i = 0; i <3; i++) {
            if (Arrays.equals(board[i], winPatternX)) {
                 xWin = true;
            } else if (Arrays.equals(board[i], winPatternO)) {
                oWin = true;
            }
            char [] column = {board[0][i], board[1][i], board[2][i]};
            if (Arrays.equals(column, winPatternX)) {
                xWin = true;
            } else if (Arrays.equals(column, winPatternO)) {
                oWin = true;
            }
        }
        char [] diagonal1 = {board[0][0], board[1][1], board[2][2]};
        char [] diagonal2 = {board[0][2], board[1][1], board[2][0]};
        if (Arrays.equals(diagonal1, winPatternX) || Arrays.equals(diagonal2, winPatternX)) {
            xWin = true;
        } else if (Arrays.equals(diagonal1, winPatternO) || Arrays.equals(diagonal2, winPatternO)) {
            oWin = true;
        }
        if (oWin && xWin) {
            return "Impossible";
        } else if (oWin) {
            return "O wins";
        } else if (xWin) {
            return "X wins";
        } else if (boardNotFull) {
            return "Game not finished";
        }
        return "Draw";
    }
}

