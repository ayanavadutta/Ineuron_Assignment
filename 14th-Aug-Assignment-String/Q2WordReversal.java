//WAP to reverse a sentence while preserving the position.
//Input : “Think Twice”
//Output : “kniht eciwt”
public class Q2WordReversal {

	public static void main(String[] args) 
	{
	
		String s1="Think Twice";
		String s2 = "";
		String a[]=s1.split(" ");
		//System.out.println(a.length);
	      for (int i=0; i< a.length; i++)
	      {
	    	  String g=a[i];
	    	  //System.out.println(g);
	    	  String rev_str = "";
	    	  for (int j=g.length()-1; j>=0; j--)
		      {
		        rev_str= rev_str+g.charAt(j);
		      }
	    	  s2=s2+rev_str+" ";
	      }
	      System.out.println("Reversed word sentence: "+ s2);
	}

}
