package MainBuilds;
import java.util.*;
public class prioritySelector 
{
    static event nextEvent(Vector<event> vecEvent)
    {  
        event minObj =  new event();
        minObj = vecEvent.elementAt(0);
        vecEvent.elementAt(0).flag = 1;
        for(int i = 1; i < vecEvent.size();i++)
        {
            if(vecEvent.elementAt(i).flag == 0)
            {
                if(vecEvent.elementAt(i).ratio < minObj.ratio)
                {

                    vecEvent.elementAt(i).flag = 1;
                    minObj = vecEvent.elementAt(i);
                }
            }  
        }
        if(minObj != vecEvent.elementAt(0))
        {
            vecEvent.elementAt(0).flag = 0;
        }
        return minObj;
    }
}