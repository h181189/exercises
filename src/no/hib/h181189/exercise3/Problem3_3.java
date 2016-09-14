package no.hib.h181189.exercise3;

import java.util.Scanner;

import no.hib.h181189.exercises.Problem;

public class Problem3_3 implements Problem {

	@Override
	public void solve() {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int a = input.nextInt();
		
		System.out.print("Raise " + a + " in the power off: ");
		int b = input.nextInt();
		
		System.out.println("Math.pow(" + a + ", " + b + ") = " + a(a, b) + ".");
		System.out.println("Method 2: " + b(a, b));		
	}
	
	private int a(int a, int b) {
		return (int) Math.pow(a, b);
	}
	
	
	private int b(int a, int b) {
		int total = 1;
		while(b > 0) {
			total *= a;
			b--;
		}
		return total;
	}
	
}
