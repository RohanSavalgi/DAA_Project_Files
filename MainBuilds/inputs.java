package MainBuilds;
import java.util.*;
class event
{
    String name;
    int duration;
    int proirity;
    int mainPriority;
    static int eventsCounter = 0;
    float ratio;

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
        System.out.println("Enter the Priority of the Event : ");
        proirity = input.nextInt();
        ratio = proirity/duration;
    }
    void displayData()
    {
        System.out.println("\nThe Event detail are : ");
        System.out.println("Name : " + name);
        System.out.println("Duration : " + duration);
        System.out.println("Starting Time : " + proirity);
    }

}
