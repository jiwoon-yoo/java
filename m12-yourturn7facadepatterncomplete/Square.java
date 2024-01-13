package yourturn7facadepatterncomplete;

import yourturn6polymporphismcomplete.Rectangle;

public class Square  {
    private Rectangle rect;

    public Square (double sidesLength, String colour)
    {
        rect = new Rectangle(sidesLength, sidesLength, colour);
    }

    public void descibeSquare ()
    {
        System.out.println ("The "+rect.getColour()+" square has an area of "+rect.getArea());
    }
}
