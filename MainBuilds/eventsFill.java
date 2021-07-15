package MainBuilds;
import java.util.*;
public class eventsFill
{
    static Vector<event> doneEvent = new Vector<event>();
    static void eventAllocator()
    {
        double currentPriority = 0;
        double currentDuration = 0;
        //System.out.println("we will take the event to the next day ");
        event currentEvent = new event();
        System.out.println("\n\n-----------Event Considered are : ---------------");
        System.out.println("main duration : " + event.mainDuration);
        while(currentDuration < event.mainDuration)
        {
            currentEvent = prioritySelector.nextEvent(mainprocess.singleDay);
            
            if(currentEvent == null)
            {
                break;
            }
            setTimings(currentEvent);
            currentEvent.displayData();
 
            if(currentDuration + currentEvent.duration <= event.mainDuration)
            {
                currentDuration += currentEvent.duration;
                currentPriority += currentEvent.proirity;
            }
            else
            {
                currentPriority += ((currentEvent.ratio) * (event.mainDuration - currentPriority));
                System.out.println("Remaining Time occupied is :" + (event.mainDuration - currentDuration));
                //currentDuration += (event.mainDuration - currentEvent.duration); 
                currentDuration += (event.mainDuration - currentDuration);
            }
            doneEvent.add(currentEvent);
            
        }
        System.out.println("Final priority " + currentPriority);
        System.out.println("Final duration " + currentDuration);
    }
    static void setTimings(event eventOne)
    {
        eventOne.eventStartTime.setTime(event.startTime.getTime());
        event.startTime.add(Calendar.HOUR,eventOne.dhh);
        event.startTime.add(Calendar.MINUTE,eventOne.dmm);
    }
}