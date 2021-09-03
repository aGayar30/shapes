package shapes;

public class square extends shape{
   private double side;

    public square(String name, String color, double side) {
        super(name, color);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea(){
       return side*side;
   }

   @Override
   public double getParemeter(){
        return side*4;
   }
}
