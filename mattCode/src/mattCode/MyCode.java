package mattCode;

import java.util.Scanner;

public class MyCode 
{
	public static void main(String[] args)
	{
			System.out.print("Whats wrong");
			Scanner in = new Scanner(System.in);
			String q = in.next();
			String reverse = "";
			
			for(int i = q.length(); i > 0; i++)
			{
				reverse += q.charAt(i);
			}
			System.out.print(reverse);
	}
}
