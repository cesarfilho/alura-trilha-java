package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws IOException {

		Scanner scanner = new Scanner(new File("contas.csv"),"UTF-8");

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US);
			linhaScanner.useDelimiter(",");

			String tipoConta = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();

			String valorFormatado = String.format(new Locale("pt", "BR"), "%s - %04d-%05d, %20s: %08.2f", tipoConta,
					agencia, numero, titular, saldo);
			System.out.println(valorFormatado);
		}

		scanner.close();
		// chave, valor
		/*
		 * Properties props = new Properties(); props.setProperty("login", "alura");
		 * props.setProperty("senha", "alurapass"); props.setProperty("endereco",
		 * "www.alura.com.br"); props.store(new FileWriter("conf.properties"),
		 * "algum comentário");
		 */
	}

}
