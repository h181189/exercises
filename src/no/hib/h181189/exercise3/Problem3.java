package no.hib.h181189.exercise3;

import no.hib.h181189.exercises.Problem;

public class Problem3 implements Problem {

	@Override
	public int solution() {
		return (int) b(5, 3.5);
	}
	
	private int a(double a, double b) {
		return (int)Math.pow(a, b);
	}
	
	private int b(double a, double b) {
		int total = 1;
		while(b > 0) {
			if(b >= 1) {
				total *= a;
			} else {
				total *= Math.pow(a, b);
			}
			b--;
		}
		return total;
	}
	
}
