package Backtracking;

public class Backtracking {

    // > Rat maze question via recursion
    // // Rat can only go down or right
    // static void twoDirectionMaze(int stRow, int stCol, int endRow, int endCol,
    // String str) {
    // if (stRow > endRow || stCol > endCol)
    // return;

    // if (stRow == endRow && stCol == endCol) {
    // System.out.println(str);
    // return;
    // }
    // twoDirectionMaze(stRow + 1, stCol, endRow, endCol, str + "D"); // down
    // twoDirectionMaze(stRow, stCol + 1, endRow, endCol, str + "R"); // right
    // }

    // public static void main(String[] args) {
    // int row = 3;
    // int col = 3;
    // twoDirectionMaze(1, 1, row, col, "");

    // }

    // > Rat maze question via backtracking
    // Rat can only go down or right
    // static void fourDirectionMaze(int stRow, int stCol, int endRow, int endCol,
    // String str, boolean[][] isVisited) {
    // if (stRow < 0 || stCol < 0)
    // return;
    // if (stRow > endRow || stCol > endCol)
    // return;
    // if (isVisited[stRow][stCol] == true)
    // return;
    // if (stRow == endRow && stCol == endCol) {
    // System.out.println(str);
    // return;
    // }
    // isVisited[stRow][stCol] = true;
    // // right
    // fourDirectionMaze(stRow, stCol + 1, endRow, endCol, str + "R", isVisited);
    // // down
    // fourDirectionMaze(stRow + 1, stCol, endRow, endCol, str + "D", isVisited);
    // // left
    // fourDirectionMaze(stRow, stCol - 1, endRow, endCol, str + "L", isVisited);
    // // up
    // fourDirectionMaze(stRow - 1, stCol, endRow, endCol, str + "U", isVisited);
    // // backtracking
    // isVisited[stRow][stCol] = false;
    // }

    // > Q1
    static void maze1(int stRow, int stCol, int endRow, int endCol, String str, int[][] maze) {
        if (stRow < 0 || stCol < 0)
            return;
        if (stRow > endRow || stCol > endCol)
            return;
        if (stRow == endRow && stCol == endCol) {
            System.out.println(str);
            return;
        }
        if (maze[stRow][stCol] == 0)
            return;
        if (maze[stRow][stCol] == -1)
            return;
        maze[stRow][stCol] = -1;

        // right
        maze1(stRow, stCol + 1, endRow, endCol, str + "R", maze);
        // down
        maze1(stRow + 1, stCol, endRow, endCol, str + "D", maze);
        // left
        maze1(stRow, stCol - 1, endRow, endCol, str + "L", maze);
        // up
        maze1(stRow - 1, stCol, endRow, endCol, str + "U", maze);
        maze[stRow][stCol] = 1;
    }

    // >Q2
    // Given an array nums of distinct integers, return all the possible
    // permutations. You can return the answer in any order.

    public static void main(String[] args) {
        // int row = 3;
        // int col = 3;
        // boolean[][] isVisited = new boolean[row][col];
        // fourDirectionMaze(0, 0, row - 1, col - 1, "", isVisited);

        // >Q1
        int row1 = 3;
        int col1 = 4;
        int[][] maze = {
                { 1, 0, 1, 1, },
                { 1, 1, 1, 1, },
                { 1, 1, 0, 1, },
        };
        maze1(0, 0, row1 - 1, col1 - 1, "", maze);

    }
}
