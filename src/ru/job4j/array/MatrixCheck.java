package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean check = true;
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 'X') {
                check = false;
                break;
            }
        }
        return check;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean check = true;
        for (int row = 0; row < board.length; row++) {
            if (board[row][column] != 'X') {
                check = false;
                break;
            }
        }
        return check;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] result = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            result[i] = board[i][i];
        }
        return result;
    }
}
