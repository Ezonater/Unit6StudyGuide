package StaticFactory;

public class Coordinate {
    private double x_cord;
    private double y_cord;

    public Coordinate(double x, double y){
        this.x_cord = x;
        this.y_cord = y;
    }

    public static final Coordinate fromXY(double x, double y){
        return new Coordinate(x,y);
    }

    public static final Coordinate fromPolar(double distance, double angle){
        return new Coordinate(distance * Math.cos(angle), distance * Math.sin(angle));
    }
}
