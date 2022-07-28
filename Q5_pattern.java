package com.example;

public class Q5_pattern {

	public static void main(String[] args) 
	{
		int n=14;
		for(int i=0;i<n;i++)
		{
			//printing I
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==0||i+j<=(n-1)/2||i-j>=((n-1)/2))
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("\t");
		}

	}

}
