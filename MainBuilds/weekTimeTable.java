import java.util.*;
public class weekTimeTable 
{
    static void multipleDay()
    {
        try
        {
            char yesNoDay;
            Scanner mainKeyboard = new Scanner(System.in);
            //priorityBucket.mainPriority = 1;
            mainprocess.singleDayBlock();
            System.out.println("Do you wish continue to the next day : (Y/N)");
            yesNoDay = mainKeyboard.next().charAt(0);
            
            if(yesNoDay == 'Y')
            {
                while(yesNoDay == 'Y')
                {
                    //priorityBucket.mainPriority = 0; 
                    mainprocess.singleDayBlock();     
                    System.out.println("Do you wish continue to the next day : (Y/N)");
                    yesNoDay = mainKeyboard.next().charAt(0);   
                                  
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return;
        }
    }
}