package no.hib.h181189.exercise2;

import java.util.Scanner;

import no.hib.h181189.exercises.Problem;

public class Problem3 implements Problem {

	@Override
	public int solve() {
		second();
		return 0;
	}
	
	private int first() {
		System.out.println("Enter a number:");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		String[] districts = { "Gamle Oslo", "Grünerløkka", "Sagene", "St. Hanshaugen", "Frogner", "Ullern",
				"Vestre Aker", "Nordre Aker", "Bjerke", "Grorud", "Stovner", "Alna", "Østensjø", "Nordstrand",
				"Søndre Nordstrand" };
		System.out.println("Bydel " + number + " heter " + districts[number - 1]);
		return number;
	}
	
	private void second() {
		int number;
		do {
			number = first();
		} while(number != 10);
	}
	
}
