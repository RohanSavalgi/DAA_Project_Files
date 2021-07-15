package MainBuilds;
import java.util.*;
public class prioritySelector 
{
    static event nextEvent(Vector<event> vecEvent)
    {   
        //System.out.println("Flag inside : " + vecEvent.elementAt(0).chosen);
        for(event i : vecEvent)
        {
            if(i.flag == 0)
            {
                i.flag = 1;
                return i;
            }
        }
        return null;
    }
}