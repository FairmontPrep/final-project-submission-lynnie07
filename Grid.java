import java.util.*;
class Grid {
    ArrayList<ArrayList<Integer>> map;
    int rows, cols;

    public Grid(ArrayList<ArrayList<Integer>> map) {
        this.map = map;
        this.rows = map.size();
        this.cols = map.get(0).size();
    }

    public boolean isInBounds(int r, int c) {
        return r >= 0 && r < rows && c >= 0 && c < cols;
    }

    public int getVal(int r, int c) {
        return map.get(r).get(c);
    }
}
