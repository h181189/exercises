package no.hib.h181189.exercise7;

import no.hib.h181189.exercises.Problem;

public class Problem7_3 implements Problem {

	@Override
	public void solve() {
		Payroll p = new Payroll("Google", 10);
		
		Employee[] e = {
				new Employee("Ole Olsen", 37.5, 100, 20),
				new Employee("Lise Jensen", 40, 150, 40),
				new Employee("Ola Normann", 5, 90, 1),
				new Employee("Fornavn Etternavn", 45, 200, 40),
		};
		
		p.add(e);
		
		p.printOverview(10);
	}

}
