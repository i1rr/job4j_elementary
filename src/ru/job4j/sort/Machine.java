package ru.job4j.sort;

import java.util.Arrays;

public class Machine {
    private static final int[] COINS = {10, 5, 2, 1};

    public int[] change(int money, int price) {
        int change = money - price;
        int[] totalChange = new int[100];
        int totalChangeMultiplier = 0;
        for (int coinValue = 0; coinValue < 4; coinValue++) {
            while (change - COINS[coinValue] >= 0) {
                change = change - COINS[coinValue];
                totalChange[totalChangeMultiplier++] = COINS[coinValue];
            }
        }
        return Arrays.copyOf(totalChange, totalChangeMultiplier);
    }
}
