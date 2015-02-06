
//  Sigma
//
//  Created by Brandy Camacho on 2/5/15.
//  Copyright (c) 2015 Brandy Camacho. All rights reserved.
//
import java.util.Scanner;


class Sigma 
	{
	static int n;
	
	private static Scanner newScanner = new Scanner(System.in);

public static void main(String[] args) {
		
		do
		{
			try 
				{
				System.out.println("positive number please: ");
		 		n = Integer.parseInt(newScanner.nextLine());
				}
			catch(Exception e)
				{
				System.out.println("Only numbers!");
		    	}
		}
		
		while (n < 1);
		{
			long answer = sigma(n);
			// We needed a way to get rid of .0 at the end of any string but allow non-integral values to survive
			System.out.println(String.valueOf(answer).replace("\\.0+$", ""));
		}
	}

public static long sigma(long m) 
	{
		
		if (m<=0)
		{
			return 0;
		}
		else 
		{
		return m + sigma(m -1);
		}
	}
}

