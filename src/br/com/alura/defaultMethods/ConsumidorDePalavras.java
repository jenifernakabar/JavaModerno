package br.com.alura.defaultMethods;

import java.util.function.Consumer;

public class ConsumidorDePalavras implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}

}
