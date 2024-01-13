package yourturn6polymporphismcomplete;

public class Circle extends Shape {

    private double radius;
    
    public Circle (double radius, String colour) {
        super(colour);
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public String describeShape() {
        return "The "+ colour + " circle has an area of "+getArea();
    }
}
