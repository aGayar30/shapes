package shapes;

public class circle extends shape {

    private double radius;

    public circle(String name, String color, double radius) {
        super(name, color);
        this.radius = radius;
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 3.14*radius*radius;
    }

    @Override
    public double getParemeter(){
        return 2*3.14*radius;
    }
}
