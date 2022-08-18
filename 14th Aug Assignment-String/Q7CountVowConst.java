//WAP to count the number of Vowels and Consonants of a String value.
import java.util.Scanner;

public class Q7CountVowConst {


	public static void main(String[] args) 
	{
		int i=0;
		int consonants=0;
		int vowels=0;
		char ch;
		
		Scanner sc= new Scanner(System.in);

		System.out.print("\nPlease Enter a String =  ");
		String s1 = sc.nextLine();
		
		while(i < s1.length())
		{
			ch = s1.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) 
			{
				if(ch == 'a' || ch == 'e'|| ch == 'i'|| ch == 'o'|| ch == 'u' ) 
				{
					vowels++;	
				}
				else
				{
					consonants++;
				}
			}
			i++;
		}		
		System.out.println("\nNumber of Vowel Characters  =  " + vowels);
		System.out.println("\nNumber of Consonant Characters  =  " + consonants);

	}
}
