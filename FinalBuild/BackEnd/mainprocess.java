package FinalBuild.BackEnd;
import java.util.*;
public class mainprocess
{
    public static Vector<event> singleDay = new Vector<event>();
    public static Vector<event> remainingEvents = new Vector<event>();
    
    public static void singleDayBlock()
    {
        Scanner keyboard = new Scanner(System.in);
        char yesNoChoice = 'Y';
        //System.out.println("Do you wish to add an Event : (Y/N)");
        //yesNoChoice = keyboard.next().charAt(0);
        if(yesNoChoice == 'N')
        {
            if(mainprocess.singleDay.size() != 0)
            {
                System.out.println("The remaining events which are not included are : ");
                // for(event i : singleDay)
                // {
                //     i.displayData();
                // }
            }
        }
        while (yesNoChoice == 'Y')
        {
            
            System.out.println("Do you wish to add an Event : (Y/N)");
            yesNoChoice = keyboard.next().charAt(0);  
        }
        processingAfterInputs();
    }
    public static void sortTheVector()
    {
        event temp = new event();
        int minIndex = -1;
        //sorting
        for(int i = 0; i < singleDay.size() - 1;i++)
        {
            minIndex =i;
            for(int j = i+1; j < singleDay.size();j++)
            {
                if(singleDay.elementAt(j).ratio < singleDay.elementAt(minIndex).ratio)
                    minIndex = j;
            }
            if(singleDay.elementAt(minIndex) != singleDay.elementAt(i))
            {
                temp = singleDay.elementAt(minIndex);
                singleDay.setElementAt(singleDay.elementAt(i),minIndex);
                singleDay.setElementAt(temp,i);
            }
        }
        System.out.println("\n\nSorted is : ");
        // for(event i : singleDay)
        // {
        //     i.displayData();
        // }
    }
    public static void sortTheSingleVector(Vector<event> thisVector)
    {
        event temp = new event();
        int minIndex = -1;
        //sorting
        for(int i = 0; i < thisVector.size() - 1;i++)
        {
            minIndex = i;
            for(int j = i+1; j < thisVector.size();j++)
            {
                if(thisVector.elementAt(j).ratio < thisVector.elementAt(minIndex).ratio)
                    minIndex = j;
            }
            if(thisVector.elementAt(minIndex) != thisVector.elementAt(i))
            {
                temp = thisVector.elementAt(minIndex);
                thisVector.setElementAt(thisVector.elementAt(i),minIndex);
                thisVector.setElementAt(temp,i);
            }
        }
    }
    public static void processingAfterInputs()
    {
        priorityBucket.pushingToMainBuckets();
        priorityBucket.bucketProcessing();
        priorityBucket.ratioCalculator(priorityBucket.mainBuckets);
        // for(event  i : singleDay)
        // {
        //     i.displayData();
        // }
        System.out.println("Number of events : " + event.eventsCounter);
        
        sortTheSingleVector(priorityBucket.bucket1);
        sortTheSingleVector(priorityBucket.bucket2);
        sortTheSingleVector(priorityBucket.bucket3);

        eventsFill.eventAllocator();
        System.out.println("\nDONE EVENTS ARE : ");
        for(event i : eventsFill.doneEvent)
        {
            i.displayData();
        }
        eventsStorage.placeDay(eventsFill.doneEvent);
        eventsFill.doneEvent.removeAllElements();
        for(event i : singleDay)
        {
            if(i.flag == 0)
            {
                i.proirity = 0;
                remainingEvents.addElement(i);
            }
        }
        singleDay.removeAllElements();
        priorityBucket.mainBuckets.removeAllElements();
        for(event i : priorityBucket.bucket1)
        {
            if(i.flag == 0)
            {
                i.proirity = 0;
                priorityBucket.tempBucket1.addElement(i);
            }
        }  
        priorityBucket.bucket1.removeAllElements();
        for(event i : priorityBucket.bucket2)
        {
            if(i.flag == 0)
            {
                i.proirity = 0;
                priorityBucket.tempBucket1.addElement(i);
            }
        }
        priorityBucket.bucket2.removeAllElements();
        for(event i : priorityBucket.bucket3)
        {
            if(i.flag == 0)
            {
                i.proirity = 0;
                priorityBucket.tempBucket2.addElement(i);
            }
        }
        priorityBucket.bucket3.removeAllElements();
        
        
        for(event i : priorityBucket.tempBucket1)
        {
            i.proirity = 0;
            priorityBucket.bucket1.addElement(i);
        } 
        for(event i : priorityBucket.tempBucket2)
        {
            i.proirity = 0;
            priorityBucket.bucket2.addElement(i);
        }  
        // System.out.println("B1 elements are : ");
        // for(event i : priorityBucket.bucket1)
        // {
        //     i.displayData();
        // }
        System.out.println("The remaining events are : ");
        for(event i : remainingEvents)
        {
            i.displayData();
        }
        priorityBucket.mainPriority = 1;
        for(event i : remainingEvents)
        {
            i.proirity = 0;
            singleDay.add(i);
        }
        remainingEvents.removeAllElements();
        event.eventsCounter = 0;
    }
}
