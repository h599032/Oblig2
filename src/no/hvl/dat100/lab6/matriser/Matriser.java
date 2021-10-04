package no.hvl.dat100.lab6.matriser;

public class Matriser {

	// a)
	public static void skrivUt(int[][] matrise) {

		for (int[] rad : matrise) {
			for (int v : rad) {
				System.out.print(v + " ");
			}
			System.out.println();
		}
	}

	// b)
	public static String tilStreng(int[][] matrise) {

		String b = ("");
		for (int i = 0; i < matrise.length; i++) {
			for (int j = 0; j < matrise[i].length; j++) {
				if (j < matrise[i].length - 1) {
					b += (matrise[i][j] + " ");
				} else {
					b += (matrise[i][j] + " \n");
				}
			}
		}
		return b;
	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		int[][] nytab = new int[matrise.length][];

		for (int i = 0; i < matrise.length; i++) {
			if (i == 0) {
				nytab = new int[matrise.length][matrise[i].length];
			}
			for (int j = 0; j < matrise[i].length; j++) {

				nytab[i][j] = matrise[i][j] * tall;
			}
		}

		return nytab;
	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		boolean erLik = true;

		if (a.length != b.length) {
			erLik = false;
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] != b[i][j]) {
					erLik = false;
				}
				}
			}
		
		return erLik;

	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
