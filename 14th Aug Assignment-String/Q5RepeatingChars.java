//WAP to print repeatedly occurring characters in the given String.
public class Q5RepeatingChars 
{
    static void findRepeatingChars(String str)
    {

        int count[] = new int[256];
 
        int len = str.length();

        for (int i = 0; i < len; i++)
            count[str.charAt(i)]++;

        char ch[] = new char[str.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = str.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) 
            {
 
                // If any matches found
                if (str.charAt(i) == ch[j])
                    find++;
            }
             if (find == 1)
            	 if(count[str.charAt(i)]>1)
            		 System.out.println("Number of Occurrence of "+ str.charAt(i)+ " is:" + count[str.charAt(i)]);
        }
    }

    public static void main(String[] args)
    {
        String str = "aaaaaqaaaaaavvvvvvvvvvffffffffffeeeettthhh";
        findRepeatingChars(str);
    }
}