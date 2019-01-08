package mattCode;

import java.util.Scanner;

public class MyCode 
{
	public static void main(String[] args)
	{
			System.out.print("Enter a string");

			Scanner in = new Scanner(System.in);

			String input = "";

			while ( in.hasNext() )
			{
				input += in.next();
			}

			String reverse = "";

			for(int i = input.length()- 1; i >= 0; i--)
			{
				reverse += input.charAt(i);
			}

			System.out.print(reverse);
	}
}
