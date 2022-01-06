package br.com.alura.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class TestaCurso {

	public static void main(String[] args) {
		
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("logica", 120));
		cursos.add(new Curso("java", 80));
		cursos.add(new Curso("phyton", 220));
		cursos.add(new Curso("css", 20));
		
		cursos.sort(Comparator.comparing(c -> c.getAlunos()));
		
		cursos.forEach(System.out::println);
		
		cursos.stream().filter(c -> c.getAlunos() >= 50).forEach(System.out::println);
		cursos.stream().filter(c -> c.getAlunos() >= 50).map(c -> c.getNome()).forEach(System.out::println);
		
		// usando o filter para a quantidade maior que 50 e depois usa apenas a quantidade de aluno e depois imprime
//		cursos.stream()
//		   .filter(c -> c.getAlunos() > 50)
//		   .map(Curso::getAlunos)
//		   .forEach(System.out::println);
		
		//usando o filter para a quantidade maior que 50 e pega o primeiro da listae, depois imprime
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .findFirst().ifPresent(System.out::println);
		
		cursos.stream()
		.filter(c -> c.getAlunos() > 50)
		   .mapToInt(Curso::getAlunos)
		   .average().ifPresent(System.out::println);
		
		List<Curso> collect = cursos.stream()
		.filter(c -> c.getAlunos() > 50).collect(Collectors.toList());
		   
	}

}
