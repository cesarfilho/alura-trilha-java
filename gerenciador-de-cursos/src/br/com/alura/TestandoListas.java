package br.com.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Desenvolvendo em linux";
		String aula2 = "Programação para todos";
		String aula3 = "Aula de matrizes";

		ArrayList<String> cursos = new ArrayList<>(); 
		
		cursos.add(aula1);
		cursos.add(aula2);
		cursos.add(aula3);
		
		System.out.println(cursos);
		
		cursos.remove(0);
		
		System.out.println("O primeira aula é:"+ cursos.get(0));
		
		for (String aula : cursos) {
			System.out.println(aula);
		}
		
		Collections.sort(cursos);
		
		System.out.println(cursos);
		
	}

}
