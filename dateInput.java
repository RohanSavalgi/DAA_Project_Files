//package MainBuilds;

import java.util.*;
import java.text.SimpleDateFormat;
public class dateInput 
{
    public static void main(String[] args)
    {
        Date thisDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        System.out.println(dateFormat.format(thisDate));
        
        
    }
}
