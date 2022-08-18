//WAP to sort a String Alphabetically.
import java.util.Scanner;

class BubbleSort
{
    void bubbleSort(char arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) 
                {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
    }
}

public class Q6SortAlphabetically 
{
	
	public static void main(String[] args)
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = sc.nextLine();

		char[] chars = str.toCharArray();
		BubbleSort ob=new BubbleSort();
		ob.bubbleSort(chars);

		System.out.println("The sorted string is : ");
		for (int i = 0; i < chars.length; i++) 
		{
			System.out.print(chars[i]);
		}

	}
}
