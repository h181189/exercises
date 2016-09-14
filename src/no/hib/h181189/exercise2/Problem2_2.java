package no.hib.h181189.exercise2;

import java.util.Scanner;

import no.hib.h181189.exercises.Problem;

public class Problem2_2 implements Problem {

	@Override
	public void solve() {
		Scanner input = new Scanner(System.in);

		System.out.println("Find the biggest number of:");
		String[] numbersInput = input.nextLine().split(", ");
		int[] numbers = new int[numbersInput.length];
		for (int i = 0; i < numbersInput.length; i++) {
			numbers[i] = Integer.parseInt(numbersInput[i]);
		}

		int biggestNumber = numbers[0];
		for (int number : numbers) {
			if (number > biggestNumber)
				biggestNumber = number;
			// biggestNumber = Math.max(biggestNumber, number);
			// if(biggestNumber - number < 0) biggestNumber = number;
		}

		System.out.println(biggestNumber);
	}

}
