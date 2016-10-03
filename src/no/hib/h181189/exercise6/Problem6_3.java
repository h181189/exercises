package no.hib.h181189.exercise6;

import no.hib.h181189.exercises.Problem;

public class Problem6_3 implements Problem {

	@Override
	public void solve() {
		DiceTable d = new DiceTable(100);
		DieSimulator sim = new DieSimulator(d);

		sim.printTable();
		System.out.println();
		System.out.println();

		d.rollDice(100);
		sim.printTable();
	}

}
