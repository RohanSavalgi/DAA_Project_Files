package MainBuilds;
import java.util.*;
public class prioritySelector 
{
    static event nextEvent(Vector<event> vecEvent)
    {  
        for(int i = 0;i < vecEvent.size();i++)
        {
            if(vecEvent.elementAt(i).flag == 0)
            {
                vecEvent.elementAt(i).flag = 1;
                return vecEvent.elementAt(i);
            }
        }
        return null;
    }
}