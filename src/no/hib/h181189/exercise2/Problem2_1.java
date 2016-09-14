package no.hib.h181189.exercise2;

import no.hib.h181189.exercises.Problem;

public class Problem2_1 implements Problem {
	
	@Override
	public int solution() {
		int i;
		
		System.out.println("Test av repetisjonssetning.");
		System.out.println("***************************");
		
		i = 1;
		while (i <= 10) {
			System.out.println("Dette er linje nr. " + i);
			if (i == 4) {
				System.out.println();
			}
			if (i == 8) {
				System.out.println();
			}
			i = i + 1;
		}
		
		return 0;
	}
	
}
