package no.hib.h181189.exercise3;

import java.util.ArrayList;
import java.util.Scanner;

import easyIO.In;
import no.hib.h181189.exercises.Problem;

public class Problem3_2 implements Problem {

	private String[] words;
	
	@Override
	public void solve() {
		In input = new In("assets/problem3_2.txt");
		int size = input.inInt();
		words = new String[size];
		for(int i = 0; i < size && input.hasNext(); i++) {
			words[i] = input.inWord();
		}
		
		System.out.println("Enter a pattern.");
		String userInput = new Scanner(System.in).nextLine();
		ArrayList<String> wordsHit = new ArrayList<>();
		for(String word : words) {
			if(word.contains(userInput)) {
				wordsHit.add(word);
			}
		}
		
		System.out.println("'" + userInput + "'" +  " has hit " + wordsHit.size() + " words:");
		System.out.println(wordsHit.toString());
		
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
