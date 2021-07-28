import java.text.SimpleDateFormat;
import java.util.*;
class event
{
    int flag;
    String name;
    int duration;
    static int mhh,mmm; 
    static int mainDuration;
    int dhh,dmm;
    int proirity;
    //static int mainPriority;
    static int eventsCounter = 0;
    double ratio;
    static Calendar startTime = Calendar.getInstance();
    Calendar eventStartTime = Calendar.getInstance();
    SimpleDateFormat commonDateFormat = new SimpleDateFormat("hh:mm a");

    event()
    {
        eventsCounter++;
        flag = 0;
    }

    void collectData(event thisEvent)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the NAME of the Event : ");
        //input.nextLine();
        name = input.nextLine();
        System.out.println("Enter the duration of the Event (hh:mm): ");
        dhh = input.nextInt();
        dmm = input.nextInt();
        priorityBucket.priorityBucketSelector(thisEvent);
        minuteConvertor();
    }
    void displayData()
    {
        System.out.println("\nThe Event detail are : ");
        System.out.println("Name : " + name);
        System.out.println("Starting Time : " + commonDateFormat.format(eventStartTime.getTime()));
        System.out.println("Duration : " + duration);
        System.out.println("Priority : " + proirity);
        System.out.println("Ratio : " + ratio);
        System.out.println("Flag : " + flag);
    }
    static void getStartingTime()
    {
        Scanner input = new Scanner(System.in);
        int HH,mm;
        System.out.println("Enter the starting time in hh:mm : ");
        HH = input.nextInt();
        mm = input.nextInt();
        startTime.set(2021, 7, 12, HH , mm);
        System.out.println("Enter the Total Duration : ");
        mhh = input.nextInt();
        mmm = input.nextInt();
        mainDuration = 0;
        if(mhh == 0)
        {
            mainDuration = mmm;
        }
        else
        {
            mainDuration += ((mhh * 60) + mmm);
        }
    }
    int minuteConvertor()
    {
        duration = 0;
        if(dhh == 0)
        {
            duration = dmm;
        }
        else
        {
            duration += ((dhh * 60) + dmm);
        }
        return duration;
    }
}