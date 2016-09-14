package no.hib.h181189.exercise2;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import no.hib.h181189.exercises.Problem;

public class Problem2_4 implements Problem {

	@Override
	public int solution() {
		
		int min = Integer.parseInt(JOptionPane.showInputDialog("Enter a minimum limit:"));
		int max = Integer.parseInt(JOptionPane.showInputDialog("Enter a maximum limit:"));
		
		if(min % 2 == 0) {
			min++;
		}
		
		ArrayList<Integer> oddNumbers = new ArrayList<>();
		for(int i = min; i <= max; i += 2) {
			oddNumbers.add(i);
		}
		
		JOptionPane.showMessageDialog(null, "The result is:\n" + oddNumbers.toString());
		
		return 0;
	}
	
}
