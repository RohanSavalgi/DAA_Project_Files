import java.util.*;
public class prioritySelector 
{
    static event nextEvent()
    {   
        for(event i : priorityBucket.bucket1)
        {
            if(i.flag == 0)
            {
                i.flag = 1;
                return i;
            }
        }
        for(event i : priorityBucket.bucket2)
        {
            if(i.flag == 0)
            {
                i.flag = 1;
                return i;
            }
        }
        for(event i : priorityBucket.bucket3)
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