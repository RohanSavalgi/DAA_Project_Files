package MainBuilds;
import java.util.*;
public class mainprocess
{
    public static void main(String[] args)
    {
        Vector<event> singleDay = new Vector<event>();
        Scanner keyboard = new Scanner(System.in);
        char yesNoChoice;


        System.out.println("Do you wish to add an Event : (Y/N)");
        yesNoChoice = keyboard.next().charAt(0);
        while (yesNoChoice == 'Y')
        {
            event thisEvent = new event();
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
        //thisDisplayData(minEvent(singleDay));
        keyboard.close();        
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
    // static void thisDisplayData(event displayEvent)
    // {
    //     System.out.println("\nThe Event detail are : ");
    //     System.out.println("Name : " + displayEvent.name);
    //     System.out.println("Duration : " + displayEvent.duration);
    //     System.out.println("Starting Time : " + displayEvent.proirity);
    // }
}
