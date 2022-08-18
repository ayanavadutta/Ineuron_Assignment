//WAP to count number of special characters.
import java.util.Scanner;

public class Q8SpecialCharecters 
{
	public static void main(String[] args) {
		int i, notspl, spl;
		i  = notspl = spl = 0;
		char ch;
		
		Scanner sc= new Scanner(System.in);

		System.out.println("Please Enter String With Special Charecters =  ");
		String s1 = sc.nextLine();
		
		while(i < s1.length())
		{
			ch = s1.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' || ch >= '0' && ch <= '9') 
			{
				notspl++;
			}
			else 
			{
				spl++;
			}
			i++;
		}		
		System.out.println("Number of Special Characters   =  " + spl);
	}
}
