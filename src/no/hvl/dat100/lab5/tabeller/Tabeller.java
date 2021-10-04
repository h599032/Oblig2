package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		System.out.print("[ ");
		for (int i : tabell) {
			System.out.print(i + " ");
		}
		System.out.print(" ]");
	}

	// b)
	public static String tilStreng(int[] tabell) {

		String a = "[";
		String b = "";
		String c = "]";
		int i = 0;
		while (i < tabell.length) {
			if (i != tabell.length - 1)
				b += tabell[i] + ",";
			else
				b += tabell[i];
			i++;
		}
		return a + b + c;
	}

	// c)
	public static int summer(int[] tabell) {
		int sum = 0;
		for (int i = 0; i < tabell.length; i++) {
			sum += tabell[i];
		}
		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		int i = 0;
		boolean finnes = false;
		while (!finnes && i < tabell.length) {
			if (tabell[i] == tall) {
				finnes = true;
			} else
				i++;

		}
		return finnes;
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		int t = -1;
		for (int i = 0; i < tabell.length; i++) {
			if (tall == tabell[i]) {
				t = i;
			}
		}
		return t;
	}

	// f)
	public static int[] reverser(int[] tabell) {

		int[] tab = new int[tabell.length];
		int i = 0;
		while (i < tabell.length) {

			tab[i] = tabell[tabell.length - (i + 1)];
			i++;
		}

		return tab;
	}

	// g)
	public static boolean erSortert(int[] tabell) {
		boolean sortert = true;
		int i = 1;
		while (sortert && i < tabell.length) {
			if (tabell[i - 1] <= tabell[i])
				sortert = true;
			else
				sortert = false;
			i++;

		}

		return sortert;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[] nytab = new int[tabell1.length + tabell2.length];

		for (int i = 0; i < tabell1.length; i++) {
			nytab[i] = tabell1[i];
		}
		for (int j = 0; j < tabell2.length; j++) {
			nytab[tabell1.length + j] = tabell2[j];
		}
		for (int k = 0; k < nytab.length; k++) {

		}

		return nytab;
	}
}
