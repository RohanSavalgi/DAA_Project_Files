package practiseFiles;
import java.util.*;
import java.text.SimpleDateFormat;

class eventTimes
{
    String name;
    int dhh,dmm;
    Calendar startTime = Calendar.getInstance();
    SimpleDateFormat commonDateFormats = new SimpleDateFormat("hh:mm a ");
    static int eventCounter = 0;

    eventTimes()
    {
        eventCounter++;
    }

    int minuteConv()
    {
        if(dhh == 0)
        {
            return dmm;
        }
        else
        {
            return((dhh * 60) + dmm);
        }
    }

    void getStartingTime()
    {
        Scanner input = new Scanner(System.in);
        int HH,mm;
        System.out.println("Enter the starting time in HH:mm");
        HH = input.nextInt();
        mm = input.nextInt();
        startTime.set(2021, 7, 10, HH, mm);
        //StringBuffer sb = new StringBuffer("Date:");
        System.out.println(commonDateFormats.format(startTime.getTime()));
        input.close();
    }
    void getData()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        name = input.next();
        System.out.println("Enter the duration : ");
        dhh = input.nextInt();dmm = input.nextInt();
        startTime.add(Calendar.HOUR,dhh);
        startTime.add(Calendar.MINUTE,dmm);
        //System.out.println("End timings : " + commonDateFormat.format(startTime.getTime()));
        input.close();
    }
}
public class dateCalling
{
    public static void main(String[] args)
    {
        eventTimes today = new eventTimes();
        if(eventTimes.eventCounter == 1)
        {
            today.getStartingTime();
        }
        //today.getData();
        System.out.println(today.minuteConv());
    }
}
//we need starting time and duration for the whole block of time where a person can work(static and const)
//we also need a recurring time to set the starting times for each event(static)
//for every event we need starting time and duration - end time calculatable(varaible and local)

//for the priority we will divide it into 
//rapidEvents(due events which have deadline) , 
//minorEvents(secondary activities in which deadlines are in a farther date) , 
//reminders (need gental remainder).


//completed :


