import java.util.*;

public class Client {
    public static ArrayList<ArrayList<Integer>> inputGrid = new ArrayList<>(
        // Arrays.asList(
        //     new ArrayList<>(Arrays.asList(1, 0, 0, 1, 0, 0, 0, 0)),
        //     new ArrayList<>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0)),
        //     new ArrayList<>(Arrays.asList(0, 0, 0, 1, 0, 0, 1, 0)),
        //     new ArrayList<>(Arrays.asList(9, 0, 0, 1, 0, 0, 0, 0)),
        //     new ArrayList<>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0)),
        //     new ArrayList<>(Arrays.asList(0, 0, 0, 1, 0, 0, 0, 0)),
        //     new ArrayList<>(Arrays.asList(0, 0, 0, 1, 2, 0, 0, 0)),
        //     new ArrayList<>(Arrays.asList(1, 0, 0, 1, 1, 1, 1, 1))
        // )
        Arrays.asList(
            new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0)),
            new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0)),
            new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0)),
            new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0)),
            new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0)),
            new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0)),
            new ArrayList<>(Arrays.asList(1,0,0,0,0,0,0,0)),
            new ArrayList<>(Arrays.asList(1,1,1,1,1,1,1,1))
        )
    );

    public static void main(String[] args) {
        PathFinder pathFinder = new PathFinder(inputGrid);
        ArrayList<Coordinate> path = pathFinder.findPath();

        System.out.println("Final Path:");
        pathFinder.printPath(path);
    }
}