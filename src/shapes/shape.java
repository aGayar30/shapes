package shapes;

public  abstract class shape {

    private String name;
    private String color;

    public shape(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public shape() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getArea();

    public abstract double getParemeter();
}
