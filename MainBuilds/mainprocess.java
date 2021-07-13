package MainBuilds;
import java.util.*;
public class mainprocess
{
    public static Vector<event> singleDay = new Vector<event>();

    public static Vector<event> passVector(Vector<event> passVector)
    {
        return(passVector);
    }
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
        mainprocess.passVector(singleDay); 
        
        eventsFill.eventAllocator();
    }



    event minEvent(Vector<event> vec)
    {
        event minRatioEvent = null;
        for(event i : vec)
        {
            if(vec.get(0) == i)
            {
                minRatioEvent = vec.get(0);
            }
            else if (minRatioEvent.ratio > i.ratio)
            {
                minRatioEvent = i;
            }
        }
        return minRatioEvent;
    }
}
