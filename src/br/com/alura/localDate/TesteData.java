package br.com.alura.localDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class TesteData {

	public static void main(String[] args) {

		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);
		
		LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(futuro);
		
		Period comparacao = Period.between(dataAtual, futuro);
		System.out.println(comparacao);
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println(formatador.format(dataAtual) );
	}

}
