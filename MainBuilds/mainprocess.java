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
        keyboard.close();
    }
}
