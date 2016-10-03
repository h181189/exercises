package no.hib.h181189.exercise6;

import java.util.Arrays;

import no.hib.h181189.exercises.Problem;

public class Problem6_2 implements Problem {
	final int[] array = new int[10000000];
	final int[] array2 = new int[1000000];
	final int[] array3 = new int[100000];
	
	@Override
	public void solve() {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000);
		}
		
		System.out.println(sort(array));
		System.out.println(sort(array2));
		System.out.println(sort(array3));
	}
	
	public long sort(int[] array) {
		long then = System.currentTimeMillis();
		Arrays.sort(array);
		long now = System.currentTimeMillis();
		
		return now - then;
	}
}
