package no.hib.h181189.exercise3;

import java.util.ArrayList;
import java.util.Scanner;

import easyIO.In;
import no.hib.h181189.exercises.Problem;

public class Problem3_2 implements Problem {

	private String[] words;
	
	@Override
	public int solution() {
		solve();
		return 0;
	}
	
	private void solve() {
		a();
		b();
		System.out.println();
		c();
	}
	
	private void a() {
		In input = new In("assets/problem3_2.txt");
		int size = input.inInt();
		words = new String[size];
		for(int i = 0; i < size; i++) {
			words[i] = input.inWord();
		}
	}
	
	private void b() {
		System.out.println("Enter a pattern.");
		String input = new Scanner(System.in).nextLine();
		ArrayList<String> wordsHit = new ArrayList();
		for(String word : words) {
			if(word.contains(input)) {
				wordsHit.add(word);
			}
		}
		
		System.out.println("'" + input + "'" +  " has hit " + wordsHit.size() + " words:");
		System.out.println(wordsHit.toString());
	}
	
	private void c() {
		for(String word : words) {
			if(word.length() == 1) {
				System.out.println(word);
			} else if(word.length() % 2 == 0) {
				int a = word.length() / 2 - 1;
				int b = a + 2;
				System.out.println(word.substring(a, b));
			} else if(word.length() % 2 == 1) {
				int a = word.length() / 2 - 1;
				int b = a + 3;
				System.out.println(word.substring(a, b));
			}
		}
	}
	
}
