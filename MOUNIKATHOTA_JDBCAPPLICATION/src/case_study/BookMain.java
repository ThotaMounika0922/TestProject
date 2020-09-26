
package case_study;

import java.util.Scanner;

public class BookMain {
	static int ch=0,result;
	static Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
		
		try
		{
			do
			{
		
		
		System.out.println("Choose below one.....");
		System.out.println("1.Insert book");
		System.out.println("2.Fetch book details");
		System.out.println("3.Update Details");
		System.out.println("4.Delete ");
		ch=scan.nextInt();
		
				switch(ch)
				{
				case 1:
					 result=Book.Insert();
					break;
				case 2:
					Book.Fetch();
					break;
				case 3:
					Book.Update();
					break;
				case 4:
					Book.Delete();
					break;
					
				}
			}
			while(ch !=0);
			System.out.println("press 0 to continue ");
				
				
			}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
