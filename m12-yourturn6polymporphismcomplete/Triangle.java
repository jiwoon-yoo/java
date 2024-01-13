package yourturn6polymporphismcomplete;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height, String colour) {
        super(colour);
        this.base = base;
        this.height = height;
    }

    protected double getArea() {
        return base / 2 * height;
    }

    @Override
    public String describeShape() {
        return "The " + colour + " triangle has an area of " + getArea();
    }
}
