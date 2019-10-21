public class Point {

    private int x;
    private int y;

    public Point() {
        this(0, 0);
        System.out.println("Empty constructor called");
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance (){
        return Math.sqrt(((0 - this.x) * (0 - this.x)) + ((0 - this.y) * (0 - this.y)));
    }

    public double distance(int x, int y) {
        return Math.sqrt(((x - this.x) * (x - this.x)) + ((y - this.y) * (y - this.y)));
    }

    public double distance(Point point) {
        return Math.sqrt(((this.x - point.x) * (this.x - point.x)) + ((this.y - point.y) * (this.y - point.y)));
    }
}
