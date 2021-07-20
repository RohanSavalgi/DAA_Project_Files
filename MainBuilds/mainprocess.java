package MainBuilds;
import java.util.*;
public class mainprocess
{
    public static Vector<event> singleDay = new Vector<event>();
    public static Vector<event> remainingEvents = new Vector<event>();
    
    public static void main(String[] args)
    {
        weekTimeTable.multipleDay();
    }
    
    static void singleDayBlock()
    {
        Scanner keyboard = new Scanner(System.in);
        char yesNoChoice;
        System.out.println("Do you wish to add an Event : (Y/N)");
        yesNoChoice = keyboard.next().charAt(0);
        while (yesNoChoice == 'Y')
        {
            event thisEvent = new event();
            if(event.eventsCounter == 1)
            {
                event.getStartingTime();
            }
            thisEvent.collectData(thisEvent);
            singleDay.addElement(thisEvent);
            System.out.println("Do you wish to add an Event : (Y/N)");
			yesNoChoice = keyboard.next().charAt(0);
        }
        priorityBucket.bucketProcessing();
        sortTheVector();
        for(event  i : singleDay)
        {
            i.displayData();
        }
        System.out.println("Number of events : " + event.eventsCounter);
          
        eventsFill.eventAllocator();
        System.out.println("\nDONE EVENTS ARE : ");
        for(event i : eventsFill.doneEvent)
        {
            i.displayData();
        }
        eventsStorage.placeDay(eventsFill.doneEvent);
        eventsFill.doneEvent.removeAllElements();
        for(event i : singleDay)
        {
            if(i.flag == 0)
            {
                remainingEvents.addElement(i);
            }
        }
        singleDay.removeAllElements();
        for(event i : remainingEvents)
        {
            singleDay.add(i);
        }
        event.eventsCounter = 0;
    }
    public static void sortTheVector()
    {
        event temp = new event();
        int minIndex = -1;
        //sorting
        for(int i = 0; i < singleDay.size() - 1;i++)
        {
            minIndex =i;
            for(int j = i+1; j < singleDay.size();j++)
            {
                if(singleDay.elementAt(j).ratio < singleDay.elementAt(minIndex).ratio)
                    minIndex = j;
            }
            if(singleDay.elementAt(minIndex) != singleDay.elementAt(i))
            {
                temp = singleDay.elementAt(minIndex);
                singleDay.setElementAt(singleDay.elementAt(i),minIndex);
                singleDay.setElementAt(temp,i);
            }
        }
        System.out.println("\n\nSorted is : ");
        for(event i : singleDay)
        {
            i.displayData();
        }
    }
}