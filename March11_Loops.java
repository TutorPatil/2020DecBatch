package com.corejava;

public class March11_Loops {

	public static void main(String[] args) {
		
		checkPrime();
		
	}

	public static void checkEvenOrOdd()
	{
		int num = 48;
		
		if( num % 2 == 0)
		{
			System.out.println("The number  is Even ");
		}
		else
		{
			System.out.println("The number  is odd");
		}
		
	}
	
	public static void checkEven1To100()
	{
		int num = 1;

		while ( num < 100)
		{
			if( num % 2 == 0)
			{
				System.out.println("The number "+num+"  is Even");
			}
		num++;
		}
			
	}
	
	public static void checkPrime()
	{
		
		int num = 49;
		int x = 2;
		boolean isPrime = false;
		
		while ( x < num)
		{
			if( num % x == 0)
			{
				isPrime = false;
				break;
			}
			else
			{
				isPrime = true;
			}
			x++;
		}
		
		if ( isPrime )
		{
			System.out.println("The number  is prime");
		}
		else
		{
			System.out.println("The number  is not prime");
		}
		
	}
	
	
}
