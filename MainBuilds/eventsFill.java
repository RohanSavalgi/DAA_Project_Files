package MainBuilds;
public class eventsFill
{
    static void eventAllocator()
    {
        int currentPriority = 0;
        int currentDuration = 0;
        //System.out.println("we will take the event to the next day ");
        event currentEvent = new event();
        currentEvent = prioritySelector.nextEvent(mainprocess.singleDay);
        
        while(currentDuration < event.mainDuration)
        {
            if(currentEvent == null)
            {
                break;
            }
            if(currentDuration + currentEvent.duration <= event.mainDuration)
            {
                currentDuration += currentEvent.duration;
                currentPriority += currentEvent.proirity;
            }
            else
            {
                currentPriority += (currentEvent.ratio) * (event.mainDuration - currentEvent.duration);
                currentDuration += (event.mainDuration - currentEvent.duration); 
            }
        }
        System.out.println("priority " + currentPriority);
        System.out.println("duration " + currentDuration);
    }
}
