package no.hib.h181189.exercise1;

import easyIO.Out;
import no.hib.h181189.exercises.Problem;

public class Problem5 implements Problem {

	@Override
	public int solve() {
		first();
		return 0;
	}
	
	private void first() {
		Out out = new Out();
		out.outln("a", 10, Out.CENTER);
		out.outln("a a", 10, Out.CENTER);
		out.outln("a b a", 10, Out.CENTER);
		out.outln("a c c a", 10, Out.CENTER);
		out.outln("a c d c a", 10, Out.CENTER);
	}

}