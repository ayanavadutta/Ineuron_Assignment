//WAP to reverse a String.
//Input: “iNeuron”
//Output: “norueNi”
public class Q1StringReverse {

	public static void main(String[] args) 
	{
		String str="iNeuron";
		String rev_str = "";
		
	      for (int i=str.length()-1; i>=0; i--)
	      {
	        
	        rev_str= rev_str+str.charAt(i);
	      }
	      System.out.println("Reversed word: "+ rev_str);

	}

}
