package no.hib.h181189.exercise6;

import java.util.Arrays;

import no.hib.h181189.exercises.Problem;

public class Problem6_2 implements Problem {
	final int[] array = new int[10000000];
	final int[] array2 = new int[1000000];
	final int[] array3 = new int[100000];
	
	@Override
	public void solve() {
		fillArray(array);
		fillArray(array2);
		fillArray(array3);
		
		
		print(array);
		print(array2);
		print(array3);
	}
	
	private void print(int[] array) {
		System.out.printf("Sorting an array of the size %d elements, took %d ms.", array.length, sort(array));
	}
	
	private void fillArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 1000);
		}
	}
	
	public long sort(int[] array) {
		long then = System.currentTimeMillis();
		Arrays.sort(array);
		long now = System.currentTimeMillis();
		
		return now - then;
	}
}
