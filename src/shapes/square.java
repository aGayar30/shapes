package shapes;

public class square extends shape{
   private double side;

    public square(String name, String color,boolean isfilled, double side) {
        super(name, color,isfilled);
        if (side >0)
            this.side = side;
        else System.out.println("side can't be negative");
    }

    public square(double side) {
        if (side >0)
            this.side = side;
        else System.out.println("side can't be negative");
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side >0)
            this.side = side;
        else System.out.println("side can't be negative");
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
