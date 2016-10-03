package no.hib.h181189.exercise6;

import no.hib.h181189.exercises.Problem;

public class Problem6_1 implements Problem {

	@Override
	public void solve() {
		String a = "Hallo, jeg heter Bendik";
		System.out.println(a);
		System.out.println(reverseString(a));
		System.out.println();
		
		int[] sortedNumbers = {1, 2, 3, 5, 8, 19, 135};
		int[] unsortedNumbers = {1, 2, 3, 5, 8, 135, 19};
		
		System.out.println("Sorted: " + isSorted(sortedNumbers));
		for(int number : sortedNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Sorted: " + isSorted(unsortedNumbers));
		for(int number : unsortedNumbers) {
			System.out.print(number + " ");
		}
		System.out.println();
		System.out.println();
		
		String string = "hvilket ord i denne setningen er først i unicode?";
		System.out.println(string);
		String[] stringArray = string.split(" ");
		System.out.println(firstInUnicode(stringArray));
	}
	

	public static String reverseString(String string) {
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse += string.charAt(i);
		}
		return reverse;
		// return new StringBuilder(string).reverse().toString();
	}

	public static boolean isSorted(int[] array) {
		for (int i = 1; i < array.length; i++) {
			if (array[i] < array[i - 1]) {
				return false;
			}
		}
		return true;
	}

	public static String firstInUnicode(String[] array) {
		String first = array[0];
		for (int i = 1; i < array.length; i++) {
			if(compareStrings(first, array[i]) > 0) {
				first = array[i];
			}
		}

		return first;
	}
	
	public static int compareStrings(String string, String anotherString) {
		char[] array = string.toCharArray();
		char[] anotherArray = anotherString.toCharArray();
		for(int i = 0; i < Math.min(array.length, anotherArray.length); i++) {
			if(array[i] != anotherArray[i]) {
				return array[i] - anotherArray[i];
			}
		}
		return 0;
	}
	
}
