package org.main;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double total = 0.0;
		
		Scanner myscan = new Scanner(System.in);
		System.out.println("Number of Peaches");
		int numPeaches = myscan.nextInt();
		System.out.println("Number of Avocados");
		int numAvocados = myscan.nextInt();
		System.out.println("Number of Mangos");
		int numMangos = myscan.nextInt();
		
		if (numPeaches >= 4)
			total = numPeaches * 0.50;
		else
			total = numPeaches * 0.75;
		if (numAvocados >= 1 )
			total += numAvocados * 2;
		if (numMangos >= 2)
		{
			numMangos /= 2;
			total += numMangos * 2;
		}  
		
		System.out.println("Total: ");
		System.out.println(total);
		
	}

}
