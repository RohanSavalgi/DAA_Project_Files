package MainBuilds;
import java.util.*;
public class mainprocess
{
    public static Vector<event> singleDay = new Vector<event>();
    public static void main(String[] args)
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
                thisEvent.getStartingTime();
            }
            thisEvent.collectData();
            singleDay.addElement(thisEvent);
            System.out.println("Do you wish to add an Event : (Y/N)");
			yesNoChoice = keyboard.next().charAt(0);
        }
        
        for(event  i : singleDay)
        {
            i.displayData();
        }
        System.out.println("Number of events : " + event.eventsCounter);
        keyboard.close();  

        sortTheVector();
        prioritySelector.nextEvent(singleDay);
        eventsFill.eventAllocator();
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
        System.out.println("\n\nSOrted is : ");
        for(event i : singleDay)
        {
            i.displayData();
        }
    }
}