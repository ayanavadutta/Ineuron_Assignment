//WAP to check if the String is Anagram or not.
import java.util.*;

class Anagram
{
	public void AnagramCheck(String s1,String s2)
	{	    
	    s1 = s1.toLowerCase();
	    s2 = s2.toLowerCase();

	    // check if length is same
	    if(s1.length() == s2.length()) 
	    {

		      // convert strings to char array
		      char[] charArr1 = s1.toCharArray();
		      char[] charArr2 = s2.toCharArray();
	
		      // sort the char array
		      Arrays.sort(charArr1);
		      Arrays.sort(charArr2);
	
		      // if sorted char arrays are same
		      // then the string is anagram
		      boolean result = Arrays.equals(charArr1, charArr2);
	
		      if(result) {
		        System.out.println(s1 + " and " + s2 + " are anagram.");
		      }
		      else {
		        System.out.println(s1 + " and " + s2 + " are not anagram.");
		      }
	    }
	    else 
	    {
	      System.out.println(s1 + " and " + s2 + " are not anagram.");
	    }
	}
}

public class Q3Anagram {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st string");
		String str1=sc.next();
		System.out.println("Enter 2nd string");
		String str2=sc.next();
		Anagram a=new Anagram();
		a.AnagramCheck(str1,str2);
		

	}

	
}
