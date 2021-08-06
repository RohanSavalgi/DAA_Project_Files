package FinalBuild.BackEnd;
import java.util.*;
public class eventsStorage 
{
    public static Vector<Vector<event>> week = new Vector<Vector<event>>();

    public static void placeDay(Vector<event> thisDay)
    {
        week.addElement(thisDay);
    }
}
