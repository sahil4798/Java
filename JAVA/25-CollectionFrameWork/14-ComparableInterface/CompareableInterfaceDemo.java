import java.util.*;

class Point implements Comparable {

    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

    @Override
    public int compareTo(Object o) {
        Point p = (Point) o;

        if (x > p.x)
            return 1;
        if (x < p.x)
            return -1;
        else {
            if (y > p.y)
                return 1;
            if (y < p.y)
                return -1;
            else
                return 0;

        }

    }

}

class CompareableInterfaceDemo {

    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1, 1));
        ts.add(new Point(1, 3));
        ts.add(new Point(2, 1));

        System.out.println(ts);

    }
}