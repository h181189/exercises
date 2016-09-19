package no.hib.h181189.exercise4;

import no.hib.h181189.exercises.Problem;

public class Problem4_3 implements Problem {

	@Override
	public void solve() {

	}

	public static void printReverseString(String string) {
		for (int i = string.length() - 1; i >= 0; i--) {
			System.out.print(string.charAt(i));
		}
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
        int len1 = string.length();
        int len2 = anotherString.length();
        int lim = Math.min(len1, len2);
        char v1[] = string.toCharArray();
        char v2[] = anotherString.toCharArray();

        int k = 0;
        while (k < lim) {
            char c1 = v1[k];
            char c2 = v2[k];
            if (c1 != c2) {
                return c1 - c2;
            }
            k++;
        }
        return len1 - len2;
	}

}
