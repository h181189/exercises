package no.hib.h181189.exercise3;

import easyIO.In;
import easyIO.Out;
import no.hib.h181189.exercises.Problem;

public class Problem5 implements Problem {

	@Override
	public int solution() {
		solve();
		System.out.println();
		return 0;
	}

	private void solve() {
		Out output = new Out();
		In input = new In();
		String title = "Analyse av temperaturene"; 
		output.outln(title);
		for(int i = 0; i < title.length(); i++) {
			output.out("*");
		}
		output.outln("Skriv inn temperaturene:");
		int total = 0;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < 7; i++) {
			output.out((i + 1) + ". dag: ");
			int temp = input.inInt();
			total += temp;
			if(temp > max) max = temp;
		}
		
		output.outln("\n");
		output.outln("Gjennomsnittstemperaturen var " + (total / 7) + ".");
		output.outln("Maksimum for denne uken var " + max + ".");
		
	}

}
