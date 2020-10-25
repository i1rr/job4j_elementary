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
}
