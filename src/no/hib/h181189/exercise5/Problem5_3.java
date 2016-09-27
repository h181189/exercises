package no.hib.h181189.exercise5;

import java.util.Arrays;

import no.hib.h181189.exercises.Problem;

public class Problem5_3 implements Problem {
	
	int[] array = new int[10000000];
	
	@Override
	public void solve() {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000);
		}
		
		long then = System.currentTimeMillis();
		Arrays.sort(array);
		long now = System.currentTimeMillis();
		
		System.out.println(now - then);
	}

}
