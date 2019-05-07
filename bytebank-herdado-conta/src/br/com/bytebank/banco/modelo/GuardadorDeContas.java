package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Object[] referencias;
	private int posicaolivre;
	
	public GuardadorDeContas(){
		this.referencias = new Object[10];
		this.posicaolivre = 0;
	}

	public void adiciona(Object ref) {
		referencias[this.posicaolivre] = ref;
		this.posicaolivre++;
		
	}

	public int getQuantidadeDeElementos() {
		return this.posicaolivre;
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
