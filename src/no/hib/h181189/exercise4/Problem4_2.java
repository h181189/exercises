package no.hib.h181189.exercise4;

import no.hib.h181189.exercises.Problem;

public class Problem4_2 implements Problem {

	@Override
	public void solve() {
		int a = 5;
		int b = 5;

		System.out.println(a == b);
		System.out.println(a < b);
		System.out.println(a != b);
//		System.out.println(a.equals(b));
		System.out.println();
		
		String s = new String("Test");
		String t = new String("Test");
		
		System.out.println(s == t);
//		System.out.println(s < t);
		System.out.println(s != t);
		System.out.println(s.equals(t));
	}

}
