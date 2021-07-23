
import java.util.*;
public class eventsStorage 
{
    static Vector<Vector<event>> week = new Vector<Vector<event>>();

    static void placeDay(Vector<event> thisDay)
    {
        week.addElement(thisDay);
    }
}
