package no.hib.h181189.exercise2;

import javax.swing.JOptionPane;

import no.hib.h181189.exercises.Problem;

public class Problem2_5 implements Problem {

	final int MAX_LIMIT = 100;
	final int MIN_LIMIT = 0;

	@Override
	public void solve() {
		for (int i = 0; i < 10; i++) {
			int score;
			do {
				score = Integer.parseInt(
						JOptionPane.showInputDialog("Enter a score between 0 and 100 for the " + (i + 1) + " person."));
				if (isIllegal(score)) {
					JOptionPane.showMessageDialog(null, "Please enter a valid score between 0 and 100.");
				}
			} while (isIllegal(score));

			char grade = getGrade(score);
			JOptionPane.showMessageDialog(null, "The grade for this student is " + grade + ".");
		}
	}

	private boolean isIllegal(int score) {
		return score < MIN_LIMIT || score > MAX_LIMIT;
	}

	private char getGrade(int score) {
		if (score >= 90) {
			return 'A';
		} else if (score >= 80) {
			return 'B';
		} else if (score >= 60) {
			return 'C';
		} else if (score >= 50) {
			return 'D';
		} else if (score >= 40) {
			return 'E';
		}
		return 'F';
	}
}
