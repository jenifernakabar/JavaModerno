package br.com.alura.defaultMethods;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class testeConsumer {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<>();
		palavras.add("Alura On");
		palavras.add("Treinando");
		palavras.add("finish");
		
//		Comparator<String> comparadorDePalavras = new ComparadorDePalavras();
//		palavras.sort(comparadorDePalavras );
//		
//		Consumer<? super String> consumer = new ConsumidorDePalavras();
//		palavras.forEach(consumer );
//		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
//		palavras.forEach(palavra -> System.out.println(palavra));
		
		
//		new Thread(() -> System.out.println("Executando um Runnable")).start();
		
		palavras.sort(Comparator.comparing(s -> s.length()));
		
		palavras.sort(Comparator.comparing(String::length));
		
		palavras.sort(String.CASE_INSENSITIVE_ORDER);
		
		palavras.forEach(System.out::println);
	}

}
