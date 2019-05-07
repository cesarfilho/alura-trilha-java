package bytebank;

public class TestaMetodos {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		contaDoPaulo.saca(20);
		System.out.println(contaDoPaulo.saldo);		
		
		Conta contaDaMarcela = new Conta();
		contaDaMarcela.deposita(1000);
		boolean sucessoTranferencia = contaDaMarcela.transfere(3000, contaDoPaulo);
		if (sucessoTranferencia) {
			System.out.println("sucesso");
		}else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}
}
