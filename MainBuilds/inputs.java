package MainBuilds;
import java.text.SimpleDateFormat;
import java.util.*;
class event
{
    String name;
    int duration;
    static int mainDuration;
    int dhh,dmm;
    int proirity;
    static int mainPriority;
    static int eventsCounter = 0;
    double ratio;
    static Calendar startTime = Calendar.getInstance();
    Calendar eventStartTime = Calendar.getInstance();
    SimpleDateFormat commonDateFormat = new SimpleDateFormat("hh:mm a");
    int flag = 0;
    
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
        eventStartTime.setTime(startTime.getTime());
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
        System.out.println("Starting Time : " + commonDateFormat.format(eventStartTime.getTime()));
        System.out.println("Duration : " + duration);
        System.out.println("Priority : " + proirity);
        System.out.println("Flag : " + flag);
    }
    void getStartingTime()
    {
        Scanner input = new Scanner(System.in);
        int HH,mm;
        System.out.println("Enter the starting time in hh:mm : ");
        HH = input.nextInt();
        mm = input.nextInt();
        startTime.set(2021, 7, 12, HH , mm);
        System.out.println("Enter the Total Duration : ");
        mainDuration = input.nextInt();
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