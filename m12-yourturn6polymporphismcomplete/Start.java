package yourturn6polymporphismcomplete;

import java.util.ArrayList;
import java.util.Arrays;

public class Start {
    public static void main (String [] args)
    {
        Shape [] shapesArray = {
            new Rectangle(5, 7, "blue"),
            new Circle ( 9, "green"),
            new Triangle(56, 72, "red"),
        };

        for (Shape shape : shapesArray) {
            System.out.println(shape.describeShape());
        }
        
        ArrayList<Shape> shapesArrayList = new ArrayList<>();
        shapesArrayList.addAll(Arrays.asList(shapesArray));
        shapesArrayList.stream().forEach(e -> System.out.println (e.describeShape()));
    }
}
