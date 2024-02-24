package org.example.codesolution.hackerrank.minesweeper;

import java.util.ArrayList;
import java.util.List;

public class Minesweeper {

    public static List<String> minesweeper(int N, List<String> bom) {

        int row = 10, column = 10;
        char[][] mapChar = new char[10][10];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                mapChar[i][j] = '.';
            }
        }

        for (String coordinate : bom) {
            String[] parts = coordinate.split(",");
            int x = Integer.parseInt(parts[0]) - 1;
            int y = Integer.parseInt(parts[1]) - 1;
            mapChar[x][y] = 'x';
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (mapChar[i][j] == 'x') {
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int x = i + di;
                            int y = j + dj;
                            if (x >= 0 && x < row && y >= 0 && y < column && mapChar[x][y] != 'x') {
                                mapChar[x][y]++;
                            }
                        }
                    }
                }
            }
        }

        List<String> items = new ArrayList<>();

        for (char[] chars : mapChar) {
            StringBuilder rowString = new StringBuilder();
            for (char aChar : chars) {
                if (aChar != 'x' && aChar != '.') {
                    var newChars = Character.getNumericValue(aChar);
                    newChars += 2;
                    rowString.append(newChars);
                } else {
                    rowString.append(aChar);
                }
            }
            items.add(rowString.toString());
        }

        return items;
    }
}
