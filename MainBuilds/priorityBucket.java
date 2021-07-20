package MainBuilds;
import java.util.*;
public class priorityBucket
{
    static Vector<event> bucket1 = new Vector<event>();//highest prio
    static Vector<event> bucket2 = new Vector<event>();//medium prio
    static Vector<event> bucket3 = new Vector<event>();//lowest prio

    static Vector<Vector<event>> mainBuckets = new Vector<Vector<event>>();

    static int mainPriority = 1;
    static public void priorityBucketSelector(event thisParameter)
    {
        //input
        Scanner keyInput = new Scanner(System.in);
        System.out.println("Enter which bucket u wanna put the event into : ");
        int bucketNumber = keyInput.nextInt();

        

        switch(bucketNumber)
        {
            case 1 : priorityBucket.bucket1.addElement(thisParameter);
            break;
            case 2 : priorityBucket.bucket2.addElement(thisParameter);
            break;
            case 3 : priorityBucket.bucket3.addElement(thisParameter);
            break;
        }
        priorityBucket.mainBuckets.addElement(bucket1);
        priorityBucket.mainBuckets.addElement(bucket2);
        priorityBucket.mainBuckets.addElement(bucket3);
    }
    static public void bucketProcessing()
    {
        //returning the exact prio number
        for(int i = 0;i < 3;i++)
        {
            for(event j : mainBuckets.elementAt(i))
            {
                j.proirity = mainPriority++;
            }
        }
        for(int i = 0;i < 3;i++)
        {
            for(event j : mainBuckets.elementAt(i))
            {
                System.out.println("Event prio is by machine " + j.proirity);
            }
        }
    }
}
