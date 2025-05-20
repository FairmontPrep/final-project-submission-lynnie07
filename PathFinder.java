import java.util.*;

class PathFinder {
    private final int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}}; // right, down, left, up
    private ArrayList<ArrayList<Integer>> grid;
    private boolean[][] visited;
    private boolean[][] route;
    private int rows, cols;
    private ArrayList<Coordinate> path = new ArrayList<Coordinate>();

    public PathFinder(ArrayList<ArrayList<Integer>> grid) {
        this.grid = grid;
        this.rows = grid.size();
        this.cols = grid.get(0).size();
        this.visited = new boolean[rows][cols];
        this.route = new boolean[rows][cols];
    }

    public ArrayList<Coordinate> findPath() {
        // Start from any edge with a 1
        for (int r = 0; r < rows; r++) {
            if (grid.get(r).get(0) == 1 && dfs(r,0,r,0)) return path;
            if (grid.get(r).get(cols - 1) == 1 && dfs(r, cols - 1, r, cols-1)) return path;
        }
        for (int c = 0; c < cols; c++) {
            if (grid.get(0).get(c) == 1 && dfs(0,c,0,c)) return path;
            if (grid.get(rows - 1).get(c) == 1 && dfs(rows - 1, c, rows-1, c)) return path;
        }
        return path;
    }

    private boolean dfs(int r, int c, int startR, int startC) {
        if (!inBounds(r, c) || visited[r][c] || grid.get(r).get(c) != 1) return false;
        visited[r][c] = true;
        path.add(new Coordinate(r, c));
        route[r][c] = true;

        for (int[] dir : directions) {
            int nr = r + dir[0];
            int nc = c + dir[1];
            if (dfs(nr, nc, startR, startC)) return true;
        }
        if(isEdge(r, c) && Math.abs(r-startR) > 0 && Math.abs(c-startC) > 0) {
            return true;
        } // end if touching a different wall than start
        path.removeLast();
        route[r][c] = false;
        return false;
    }

    private boolean inBounds(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }

    private boolean isEdge(int r, int c) {
        return r == 0 || r == rows - 1 || c == 0 || c == cols - 1;
    }

    public void printPath(ArrayList<Coordinate> path) {
        // System.out.print("{ ");
        // int pathLength = path.size();
        // for(int i = 0; i < pathLength; ++i){
        //     System.out.printf("\"%s\"", path.get(i).toString());
        //     if(i + 1 < pathLength) {
        //         System.out.print(", ");
        //     }
        // }
        // System.out.print(" }");
        for(int r = 0; r < rows; r++) {
            System.out.print("[ ");
            for(int c = 0; c < cols; c++) {
                if (c > 0) {
                     System.out.print(", ");
                }
                if(route[r][c]) {
                    System.out.print("1");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ]");
        }
    }
}