package MainBuilds;
import java.text.SimpleDateFormat;
import java.util.*;
class event
{
    String name;
    int duration;
    int dhh,dmm;
    int proirity;
    int mainPriority;
    static int eventsCounter = 0;
    float ratio;
    static Calendar startTime = Calendar.getInstance();
    Calendar eventStartTime = Calendar.getInstance();
    SimpleDateFormat commonDateFormat = new SimpleDateFormat("hh:mm a");

    event()
    {
        eventsCounter++;
    }

    void collectData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the NAME of the Event : ");
        name = input.next();
        System.out.println("Enter the duration of the Event (hh:mm): ");
        dhh= input.nextInt();
        dmm= input.nextInt();
        eventStartTime = startTime;
        startTime.add(Calendar.HOUR,dhh);
        startTime.add(Calendar.MINUTE,dmm);
        minuteConvertor();
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
    void getStartingTime()
    {
        Scanner input = new Scanner(System.in);
        int HH,mm;
        System.out.println("Enter the starting time in hh:mm : ");
        HH = input.nextInt();
        mm = input.nextInt();
        startTime.set(2021, 7, 12, HH , mm);
        //System.out.println(commonDateFormat.format(startTime.getTime()));
    }

    void minuteConvertor()
    {
        if(dhh == 0)
        {
            duration = dmm;
        }
        else
        {
            duration = ((dhh * 60) + dmm);
        }
    }
}
