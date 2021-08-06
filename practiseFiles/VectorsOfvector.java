package practiseFiles;
import java.util.*;
public class VectorsOfvector 
{
    public static void main(String[] args)
    {
        //Vector<Vector<int>> mainV = new Vector<Vector<int>>();
        Vector<String> one = new Vector<String>();
        Vector<String> two = new Vector<String>();
        one.addElement("Rohan");
        one.addElement("Rak");
        two.addElement("Nish");
        two.addElement("Manv");

        for(String i : one)
        {
            System.out.println(i);
        }

        Vector<Vector<String>> mainV = new Vector<Vector<String>> mainV();
    }
}
