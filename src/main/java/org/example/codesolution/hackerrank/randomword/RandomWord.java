package org.example.codesolution.hackerrank.randomword;

import java.util.ArrayList;
import java.util.List;

public class RandomWord {

    public static List<String> find(List<String> words, List<String> wordToFind) {
        if (words == null || words.isEmpty() || wordToFind == null || wordToFind.isEmpty()) {
            return new ArrayList<>();
        }

        int rowSize = words.size();
        int columnSize = words.get(0).length();

        char[][] grid = new char[rowSize][columnSize];

        for (int i = 0; i < rowSize; i++) {
            String row = words.get(i);
            for (int j = 0; j < columnSize; j++) {
                grid[i][j] = row.charAt(j);
            }
        }

        List<String> result = new ArrayList<>();
        for (String word : wordToFind) {
            if (findWord(grid, word)) {
                result.add("YA");
            } else {
                result.add("TIDAK");
            }
        }

        return result;
    }

    public static boolean findWord(char[][] board, String word) {
        int rows = board.length;
        int cols = board[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (searchWord(board, word, 0, i, j)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    private static boolean searchWord(char[][] board, String word, int index, int row, int col) {
        int rows = board.length;
        int cols = board[0].length;

        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= rows || col < 0 || col >= cols || board[row][col] != word.charAt(index)) {
            return false;
        }

        boolean found = searchWord(board, word, index + 1, (row - 1 + rows) % rows, col) // Up
                || searchWord(board, word, index + 1, (row + 1) % rows, col) // Down
                || searchWord(board, word, index + 1, row, (col - 1 + cols) % cols) // Left
                || searchWord(board, word, index + 1, row, (col + 1) % cols) // Right
                || searchWord(board, word, index + 1, (row - 1 + rows) % rows, (col - 1 + cols) % cols) // Top left diagonal
                || searchWord(board, word, index + 1, (row - 1 + rows) % rows, (col + 1) % cols) // Top right diagonal
                || searchWord(board, word, index + 1, (row + 1) % rows, (col - 1 + cols) % cols) // Bottom left diagonal
                || searchWord(board, word, index + 1, (row + 1) % rows, (col + 1) % cols); // Bottom right diagonal

        return found;
    }
}
