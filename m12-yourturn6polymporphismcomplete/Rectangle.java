package yourturn6polymporphismcomplete;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String colour) {
        super(colour);
        
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }

    @Override
    public String describeShape() {
        return "The " + colour + " rectangle has an area of " + getArea();
    }

}
