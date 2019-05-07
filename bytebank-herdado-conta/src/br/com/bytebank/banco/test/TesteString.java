package br.com.bytebank.banco.test;

public class TesteString {
	public static void main(String[] args) {

		String nome = "Mario";
		String outra = new String("Alura");
		String novo = nome.replace("Al", "aL");
		System.out.println(nome);		
		System.out.println(outra);
		System.out.println(novo);
		
		String novoa = nome.toLowerCase();
		System.out.println(novoa);
		String novob = nome.toUpperCase();
		System.out.println(novob);		

		int a = 3;
		char c = 'A';
		System.out.println(c);
		
		int pos = nome.indexOf("rio");
		System.out.println(pos);
		
		String sub = nome.substring(1);
		System.out.println(sub);
		
		for (int i = 0; i < nome.length(); i++) {
			System.out.println(nome.charAt(i));
		}
		
	}
}
