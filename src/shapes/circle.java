package shapes;

public class circle extends shape {

    private double radius;

    public circle(String name, String color,boolean isfilled, double radius) {
        super(name, color, isfilled);
        if (radius >0)
        this.radius = radius;
        else System.out.println("radius can't be negative");
    }

    public circle(double radius) {
        if (radius >0)
            this.radius = radius;
        else System.out.println("radius can't be negative");
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius >0)
            this.radius = radius;
        else System.out.println("radius can't be negative");
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
