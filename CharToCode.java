/*
* Victor Bieniek
* 9/28/17
* This class asks for a character and prints the acii code for that character
*/
import java.util.Scanner;

public class CharToCode
{
	public static void main(String[] args)
	{
		char ch;
		int code;
		String input;
		Scanner scan = new Scanner(System.in);

		while(true)
		{
			System.out.print("Enter a character: ");
			input = scan.next();
			if(input.length() > 1)
			{
				if(input.equalsIgnoreCase("quit")) 
				{
					System.out.println("Thank you and Good Bye");
					System.exit(0);
				}
				System.out.println("Please enter one character at a time.");
				continue;
			}
			ch = input.charAt(0);
			code = (int) ch;

			System.out.println("Code is " + code);

		}//end of loop
	}
}