package no.hib.h181189.exercise3;

import easyIO.Out;
import no.hib.h181189.exercises.Problem;

public class Problem3_4 implements Problem {

	@Override
	public int solution() {
		solve();
		System.out.println();
		return 0;
	}

	private void solve() {
		Out output = new Out();
		output.out("x i grader", 16, Out.RIGHT);
		output.out("x i radianer", 16, Out.RIGHT);
		output.out("sin(x)", 16, Out.RIGHT);
		output.outln("cos(x)", 16, Out.RIGHT);
		for(int i = 0; i < 64; i++) {
			output.out("-");
		}
		output.outln();
		for(int i = 0; i <= 180; i += 15) {
			output.out(i, 16, Out.RIGHT);
			output.out(Math.toRadians(i), 3, 16, Out.RIGHT);
			output.out(Math.sin(Math.toRadians(i)), 3, 16, Out.RIGHT);
			output.out(Math.cos(Math.toRadians(i)), 3, 16, Out.RIGHT);
			output.outln();
		}
		for(int i = 0; i < 64; i++) {
			output.out("-");
		}
	}
}
