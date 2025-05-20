import java.util.*;
class Visualizer {
    public static void printPath(Grid grid, ArrayList<String> path) {
        System.out.println("\nGrid Path Visualization:");
        String[][] display = new String[grid.rows][grid.cols];
        for (int r = 0; r < grid.rows; r++) {
            for (int c = 0; c < grid.cols; c++) {
                display[r][c] = " ";
            }
        }

        for (String coord : path) {
            String[] parts = coord.replace("A[", "").replace("]", "").split("\\[|\\]");
            int row = Integer.parseInt(parts[0]);
            int col = Integer.parseInt(parts[1]);
            display[row][col] = "1";
        }

        for (int r = 0; r < grid.rows; r++) {
            System.out.println(Arrays.toString(display[r]));
        }
    }
}
