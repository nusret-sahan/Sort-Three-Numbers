package csd;

import java.util.Scanner;

public class App {

	public static void main(String[] args)
	{
		for (;;)
			SortNumbers.run();
	}

}

class SortNumbers {
	public static void run()
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Üç tane sayı giriniz:");
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
			
		int min = Math.min(Math.min(a, b), c);
		int max = Math.max(Math.max(a, b), c);
		int mid = a + b + c - min - max;
			
		if (min < mid && mid < max)
			System.out.printf("%d < %d < %d%n",min, mid, max);
		else if (min == mid && mid < max)
			System.out.printf("%d = %d < %d%n",min, mid, max);
		else if (min < mid && mid == max)
			System.out.printf("%d < %d = %d%n",min, mid, max);
		else  
			System.out.printf("%d = %d = %d%n",min, mid, max);
			
	}
}
