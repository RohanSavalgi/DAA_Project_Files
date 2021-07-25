
import java.util.*;
public class weekTimeTable 
{
    static void multipleDay()
    {
        try
        {
            char yesNoDay;
            Scanner mainKeyboard = new Scanner(System.in);
            mainprocess.singleDayBlock();
            System.out.println("Do you wish continue to the next day : (Y/N)");
            yesNoDay = mainKeyboard.next().charAt(0);
            if(yesNoDay == 'N')
            {
                if(mainprocess.singleDay.size() != 0)
                {
                    mainprocess.processingAfterInputs();
                }
            }
            while(yesNoDay == 'Y')
            {
                mainprocess.singleDayBlock();
                System.out.println("Do you wish continue to the next day : (Y/N)");
                yesNoDay = mainKeyboard.next().charAt(0);
            }
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            return;
        }
    }
}
