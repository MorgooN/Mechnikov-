package com.company.problems;
import java.util.*;
import javafx.util.Pair;



public class Islands {
    public int Solution(char[][] grid) {

        int count = 0; // setting initial count

        for (int i = 0; i < grid.length; ++i) {           // processing rows of 2d-array
            for (int j = 0; j < grid[i].length; ++j) {    // processing columns
                if (grid[i][j] == '1') {
                    count += 1;
                    callBFS(grid,i, j);
                }
            }
        }
        return count;
    }

    public void callBFS(char[][] grid,  int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[i].length || grid[i][j]==0) { // boundry check
            return;
        }

        grid[i][j] = '0'; // see '1' and turning into '0'

        callBFS(grid, i+1, j); // checking up
        callBFS(grid, i-1, j);  // checking down
        callBFS(grid, i, j-1);  // check left
        callBFS(grid, i, j+1); // check right

    }
}
