
public class TesteFuncionario {

	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		
		Gerente nico = new Gerente();
		nico.setNome("Stepaff");
		nico.setCpf("59467854968-9");
		nico.setSalario(2600.00);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
