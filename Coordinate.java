class Coordinate {
    int row, col;

    public Coordinate(int r, int c) {
        this.row = r;
        this.col = c;
    }

    public String toString() {
        return "A[" + row + "][" + col + "]";
    }
}