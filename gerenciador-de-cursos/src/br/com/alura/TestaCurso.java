package br.com.alura;

import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {

		Curso javaColecoes  = new Curso("Dominado as cole��es Java", "Paulo Silveira");

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Copiando Lists", 22));
		javaColecoes.adiciona(new Aula("Setando novas aulas", 23));

		System.out.println(javaColecoes.getAulas());

	}

}
