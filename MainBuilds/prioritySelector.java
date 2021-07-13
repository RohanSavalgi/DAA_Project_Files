package MainBuilds;
import java.util.*;
public class prioritySelector 
{
    static event nextEvent(Vector<event> vecEvent)
    {
        event minObj =  new event();
        minObj = vecEvent.elementAt(0);//vecEvent.elementAt(vecEvent.size() + 1)
        int counter = 1;
        for(event i = vecEvent.elementAt(counter);i != null ; counter++)
        { 
            if(i.ratio < minObj.ratio && minObj.flag == 0)
            {
                minObj = i;
            } 
        }
        minObj.flag = 1;
        return minObj;
    }
}
