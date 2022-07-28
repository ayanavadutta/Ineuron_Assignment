package com.example;

public class Q4_pattern {

	public static void main(String[] args) 
	{
		int n=14;
		for(int i=0;i<n;i++)
		{
			//printing I
			for(int j=0;j<n;j++)
			{
				if(i-j>=(n-1)/2||i+j>=((3*(n-1))/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("\t");
		}
	}

}
