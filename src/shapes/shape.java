package shapes;

public  abstract class shape {

    private String name;
    private String color;
    private boolean isfilled;

    public shape(String name, String color, boolean isfilled) {
        this.name = name;
        this.color = color;
        this.isfilled = isfilled;
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

    public boolean isIsfilled() {
        return isfilled;
    }

    public void setIsfilled(boolean isfilled) {
        this.isfilled = isfilled;
    }

    public abstract double getArea();

    public abstract double getParemeter();
}
