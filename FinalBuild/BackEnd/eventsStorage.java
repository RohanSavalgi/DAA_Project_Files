package FinalBuild.BackEnd;
import java.util.*;
public class eventsStorage 
{
    public static Vector<event> week = new Vector<event>();

    public static void placeDay(Vector<event> thisDay)
    {
        for(event i : thisDay)
        {
            week.addElement(i);
        }
    }
}
