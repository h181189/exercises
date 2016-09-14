package no.hib.h181189.exercise2;

import java.util.Scanner;

import no.hib.h181189.exercises.Problem;

public class Problem2_3 implements Problem {

	@Override
	public void solve() {
		int number;
		do {
			System.out.println("Enter a number:");
			Scanner input = new Scanner(System.in);
			number = input.nextInt();
			String[] districts = { "Gamle Oslo", "Grünerløkka", "Sagene", "St. Hanshaugen", "Frogner", "Ullern",
					"Vestre Aker", "Nordre Aker", "Bjerke", "Grorud", "Stovner", "Alna", "Østensjø", "Nordstrand",
					"Søndre Nordstrand" };
			System.out.println("Bydel " + number + " heter " + districts[number - 1]);
		} while(number != 10);
	}
}
