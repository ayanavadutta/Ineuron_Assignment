package com.example;

public class Q1_ineuron_pattern {

	public static void main(String[] args) 
	{
		
		int n=9;
		
		for(int i=0;i<n;i++)
		{
			//printing I
			for(int j=0;j<n;j++)
			{
				if(i==0||i==n-1||j==(n-1)/2)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.printf(" ");
			//Printing N
			for(int j=0;j<n;j++)
			{
				 if (i==j||j==0||j==n-1)
		                System.out.printf("*");
		            else
		                System.out.printf(" ");
			}
			System.out.printf(" ");
			//Printing E
			for(int j=0;j<n;j++)
			{
				 if (i==0||i==n-1||j==0||i==(n-1)/2)
		                System.out.printf("*");
		            else
		                System.out.printf(" ");
			}
			System.out.printf(" ");
			//Printing U
			for(int j=0;j<n;j++)
			{
				 if (j==0||j==n-1||i==(n-1))
		                System.out.printf("*");
		            else
		                System.out.printf(" ");
			}
			System.out.printf(" ");
			//Printing R
			for(int j=0;j<n;j++)
			{
				 if (i==0||i==(n-1)/2||j==n-1&&i<(n-1)/2||i>(n-1)/2&&j>(n-1)/2&&i==j||j==0)
		                System.out.printf("*");
		            else
		                System.out.printf(" ");
			}
			System.out.printf(" ");
			//Printing O
			for(int j=0;j<n;j++)
			{
				 if (j==0||j==n-1||i==n-1||i==0)
		                System.out.printf("*");
		            else
		                System.out.printf(" ");
			}
			System.out.printf(" ");
			//Printing N
			for(int j=0;j<n;j++)
			{
				 if (i==j||j==0||j==n-1)
		                System.out.printf("*");
		            else
		                System.out.printf(" ");
			}
			System.out.println("\t");

		}
		
	}

}
