package no.hib.h181189.exercise1;

import easyIO.Out;
import no.hib.h181189.exercises.Problem;

public class Problem1_5 implements Problem {

	final int WIDTH = 10;

	@Override
	public void solve() {
		Out out = new Out();
		out.outln("a", WIDTH, Out.CENTER);
		out.outln("a a", WIDTH, Out.CENTER);
		out.outln("a b a", WIDTH, Out.CENTER);
		out.outln("a c c a", WIDTH, Out.CENTER);
		out.outln("a c d c a", WIDTH, Out.CENTER);
	}
	
}
