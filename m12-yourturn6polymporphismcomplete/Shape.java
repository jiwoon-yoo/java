package yourturn6polymporphismcomplete;

public abstract class Shape {
    protected String colour;

    public Shape(String colour) {
        this.colour = colour;
    }

    public String getColour ()
    {
        return colour;
    }

    public abstract String describeShape();
}
