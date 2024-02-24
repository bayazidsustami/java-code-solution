package org.example.codesolution.hackerrank.minesweeper;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class MinesweeperTest {

    @Test
    void testMinesweeperTrue() {
        int N = 4;
        List<String> bombs = new ArrayList<>();
        bombs.add("1,4");
        bombs.add("3,1");
        bombs.add("4,1");
        bombs.add("3,5");

        List<String> items = Minesweeper.minesweeper(N, bombs);
        for (String item : items) {
            System.out.println(item);
        }

    }
}