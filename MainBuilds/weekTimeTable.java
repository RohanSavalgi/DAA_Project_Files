package MainBuilds;
import java.util.*;
public class weekTimeTable 
{
    static void multipleDay()
    {
        char yesNoDay;
        Scanner mainKeyboard = new Scanner(System.in);
        mainprocess.singleDayBlock();
        System.out.println("Do you wish continue to the next day : (Y/N)");
        yesNoDay = mainKeyboard.next().charAt(0);
        while(yesNoDay == 'Y')
        {
            mainprocess.singleDayBlock();
            System.out.println("Do you wish continue to the next day : (Y/N)");
			yesNoDay = mainKeyboard.next().charAt(0);
        }
    }
}
