package br.com.bytebank.banco.test;

import br.com.bytebank.banco.especial.ContaEspecial;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SaldoInsuficienteException;

public class TesteContas {

	public static void main(String[] args) throws SaldoInsuficienteException {
		ContaCorrente cc= new ContaCorrente(123, 321);
		cc.deposita(100.00);

		
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		cp.deposita(200.00);
		
		cc.transfere(10.00,cp);
		
		System.out.println("CC:" +cc.getSaldo());
		System.out.println("CP:" +cp.getSaldo());
		
		ContaEspecial ce = new ContaEspecial(123, 5555);
		
        Object cca = new ContaCorrente(22, 33);
        Object cpa = new ContaPoupanca(33, 22);

        System.out.println(cca);
        System.out.println(cpa);		
	}

}
