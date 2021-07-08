package MainBuilds;
import java.util.*;
class event
{
    String name;
    int duration;
    int startingTime;
   

    void collectData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the NAME of the Event : ");
        name = input.next();
        System.out.println("Enter the duration of the Event : ");
        duration = input.nextInt();
        System.out.println("Enter the Starting Time of the Event : ");
        startingTime = input.nextInt();
        input.close();
    }
    void displayData()
    {
        System.out.println("The Event detail are : ");
        System.out.println("Name : " + name);
        System.out.println("Duration : " + duration);
        System.out.println("Starting Time : " + startingTime);
    }
}

public class mainprocess 
{
    public static void main(String[] args)
    {
        Vector<event> day = new Vector<event>();
        Scanner key = new Scanner(System.in);
        //int counter = 0;
        char choice;
        choice = key.next().charAt(0);
        while (choice == 'Y')
        {
            event thisEvent = new event();
            thisEvent.collectData();
            day.add(thisEvent);
			choice = key.next().charAt(0);
        }
        
        for(event  i : day)
        {
            i.displayData();
        }
        key.close();
    }
}
