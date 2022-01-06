package br.com.alura.defaultMethods;

import java.util.Comparator;

public class ComparadorDePalavras implements Comparator<String> {

	@Override
	public int compare(String p1, String p2) {
		if (p1.length() > p2.length()) {
			return 1;
		} else if(p1.length() < p2.length()) {
			return -1;
		}
			return 0;
	}

}
