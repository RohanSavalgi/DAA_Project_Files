package FinalBuild.BackEnd;
import java.text.SimpleDateFormat;
import java.util.*;
public class event
{
    static String eventDay;
    int flag;
    public String day;
    public String name;//
    public int duration;//
    static int mhh,mmm; 
    static int mainDuration;
    int dhh,dmm;
    int proirity;
    //static int mainPriority;
    public static int eventsCounter = 0;
    double ratio;
    static Calendar startTime = Calendar.getInstance();
    public Calendar eventStartTime = Calendar.getInstance();
    SimpleDateFormat commonDateFormat = new SimpleDateFormat("hh:mm a");

    public event()
    {
        eventsCounter++;
        flag = 0;
    }

    public void collectData(event thisEvent)
    {
        //Scanner input = new Scanner(System.in);
        //System.out.println("Enter the NAME of the Event : ");
        //input.nextLine();
        name = FinalBuild.FrontEnd.compile.nameOfEvent;
        //System.out.println("Enter the duration of the Event (hh:mm): ");
        dhh = FinalBuild.FrontEnd.compile.dhEvent;
        dmm = FinalBuild.FrontEnd.compile.dmEvent;
        System.out.println(name);
        priorityBucket.priorityBucketSelector(thisEvent);
        minuteConvertor();
    }
    public void displayData()
    {
        System.out.println("\nThe Event detail are : ");
        System.out.println("Name : " + name);
        System.out.println("Starting Time : " + commonDateFormat.format(eventStartTime.getTime()));
        System.out.println("Duration : " + duration);
        System.out.println("Priority : " + proirity);
        System.out.println("Ratio : " + ratio);
        System.out.println("Flag : " + flag);
    }
    public static void getStartingTime()
    {
        //Scanner input = new Scanner(System.in);
        int HH,mm;
        //System.out.println("Enter the starting time in hh:mm : ");
        //HH = input.nextInt();
        //mm = input.nextInt();
        HH = FinalBuild.FrontEnd.compile.startingHour;
        mm = FinalBuild.FrontEnd.compile.startingMin;
        // System.out.println(HH);
        // System.out.println(mm);
        startTime.set(2021, 7, 12, HH , mm);
        //System.out.println("Enter the Total Duration : ");
        mhh = FinalBuild.FrontEnd.compile.dHour;
        mmm = FinalBuild.FrontEnd.compile.dMin;
        // System.out.println(mhh);
        // System.out.println(mmm);
        eventDay = FinalBuild.FrontEnd.compile.day;
        //System.out.println(eventDay);
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