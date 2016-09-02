package no.hib.h181189.exercise1;

import javax.swing.JOptionPane;

import no.hib.h181189.exercises.Problem;

public class Problem3 implements Problem {

	@Override
	public int solve() {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter an amount of seconds");
//		int time = input.nextInt();		
		int time = Integer.parseInt(JOptionPane.showInputDialog("Enter a number of seconds"));
		
		int hours = time / 3600;
		int minutes = (time / 3600) % 60;
		int seconds = time % 60;
		
		String hourSolution = hours + (hours == 1 ? " hour, " : " hours, ");
		String minuteSolution = minutes + (minutes == 1 ? " minute, " : " minutes, ");
		String secondSolution = seconds + (seconds == 1 ? " second." : " seconds.");
		String solution = hourSolution + minuteSolution + secondSolution;

		System.out.println(solution);
		return 0;
	}

}
