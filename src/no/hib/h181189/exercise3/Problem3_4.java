package no.hib.h181189.exercise3;

import easyIO.Out;
import no.hib.h181189.exercises.Problem;

public class Problem3_4 implements Problem {

	private final int WIDTH = 16;
	
	@Override
	public void solve() {
		Out output = new Out();
		output.out("x i grader", WIDTH, Out.RIGHT);
		output.out("x i radianer", WIDTH, Out.RIGHT);
		output.out("sin(x)", WIDTH, Out.RIGHT);
		output.outln("cos(x)", WIDTH, Out.RIGHT);
		for(int i = 0; i < WIDTH * 4; i++) {
			output.out("-");
		}
		output.outln();
		for(int i = 0; i <= 180; i += 15) {
			output.out(i, WIDTH, Out.RIGHT);
			output.out(Math.toRadians(i), 3, WIDTH, Out.RIGHT);
			output.out(Math.sin(Math.toRadians(i)), 3, WIDTH, Out.RIGHT);
			output.out(Math.cos(Math.toRadians(i)), 3, WIDTH, Out.RIGHT);
			output.outln();
		}
		for(int i = 0; i < WIDTH * 4; i++) {
			output.out("-");
		}
	}
}
