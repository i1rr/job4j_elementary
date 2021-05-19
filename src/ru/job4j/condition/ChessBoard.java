package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        if (bishopSteps(x1, y1, x2, y2) && inBoard(x1, y1, x2, y2)) {
            return Math.abs(x1 - x2);
        }
        return 0;
    }

    public static boolean inBoard(int x1, int y1, int x2, int y2) {
        return x1 >= 0 && x1 < 8
                && x2 >= 0 && x2 < 8
                && y1 >= 0 && y1 < 8
                && y2 >= 0 && y2 < 8;
    }

    public static boolean bishopSteps(int x1, int y1, int x2, int y2) {
        return Math.abs(x1 - y1) == Math.abs(x2 - y2);
    }
}