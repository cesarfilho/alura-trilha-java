package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		List<Conta> lista = new ArrayList<Conta>();

		Conta cc = new ContaCorrente(22, 11);
		lista.add(cc);

		Conta cc2 = new ContaCorrente(44, 33);
		lista.add(cc2);

		System.out.println(lista.size());

		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0);
		System.out.println(lista.size());

		Conta cc3 = new ContaCorrente(55, 66);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(77, 88);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) {
			Conta oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("------------------");

		for (Conta oRef : lista) {
			System.out.println(oRef);
		}
	}

}
