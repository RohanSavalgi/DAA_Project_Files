package InitialBuilds;
import java.util.*;
class vectorPushing
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Vector<Integer> vec = new Vector<Integer>();
		char choice;
		int i = 1;
		choice = sc.next().charAt(0);
		while (choice == 'Y')
		{
			System.out.println("element added");
			vec.addElement(i);
			i++;
			choice = sc.next().charAt(0);
		}
		System.out.println(vec);
	}
}