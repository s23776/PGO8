public final class Point {

    private final int x;
    private final int y;

    private Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private Point(){
        this(0,0);
    }

    private static Point createPoint(){
        return new Point();
    }

    private static Point createPoint(int x, int y){
        return new Point(x, y);
    }

    private static Point translate(Point initialPoint, int x, int y){
        return new Point(initialPoint.x + x, initialPoint.y + y);
    }
}