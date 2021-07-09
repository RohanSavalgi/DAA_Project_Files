package MainBuilds;
import java.util.*;
class event
{
    String name;
    int duration;
    int startingTime;
    static int eventsCounter = 0;

    event()
    {
        eventsCounter++;
    }

    void collectData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the NAME of the Event : ");
        name = input.next();
        System.out.println("Enter the duration of the Event : ");
        duration = input.nextInt();
        System.out.println("Enter the Starting Time of the Event : ");
        startingTime = input.nextInt();
    }
    void displayData()
    {
        System.out.println("\nThe Event detail are : ");
        System.out.println("Name : " + name);
        System.out.println("Duration : " + duration);
        System.out.println("Starting Time : " + startingTime);
    }
}
