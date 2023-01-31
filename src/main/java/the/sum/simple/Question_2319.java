package the.sum.simple;

public class Question_2319 {
    // 0,3  1,2 2,1 3,0
    public static boolean checkXMatrix(int[][] grid) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (((i == j) || (i + j) == grid.length - 1) && (grid[i][j] == 0)) {
                    return false;
                }
                if (((i != j) && (i + j) != grid.length - 1) && (grid[i][j] != 0)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int[][] grid2;
        grid2 = new int[][]{{2, 0, 0, 1}, {0, 3, 1, 0}, {0, 5, 2, 0}, {4, 0, 0, 2}};
        System.out.println(checkXMatrix(grid2));
    }
}
