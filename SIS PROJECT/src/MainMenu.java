import java.util.*;
import java.util.ArrayList;

public class MainMenu
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("What would you like to do?");
		System.out.println();
		System.out.println("1) add or delete a student");
		System.out.println("2) change student grades/schedule");
		System.out.println("3) sort students");
		System.out.println();
		int choice1 = in.nextInt();
				
		//skdlf;as
		if (choice1 == 1)
		{
			addOrDelete();
		}
				
		else if (choice1 == 1)
		{
			changeScheduleorGrades();
		}
				
		else if (choice1 == 1)
		{
			sortList();
		}
	}

	private static void addOrDelete()
	{
	}
	
	private static void changeScheduleorGrades()
	{
	}
	
	private static void sortList()
	{
	}
}