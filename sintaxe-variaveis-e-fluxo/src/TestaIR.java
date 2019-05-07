
public class TestaIR {

	public static void main(String[] args) {
		double salario = 4500.0;
		
		if (salario >= 1900.0 && salario <= 2800.0) {
			System.out.println("ir é 7,5% e deduz R$142");
		} else {
			if (salario >= 2800.01 && salario <= 3751.0) {
				System.out.println("ir é 15% e deduz R$350");
			} else {
				if (salario >= 3751.01 && salario <= 4664.0) {
					System.out.println("ir é 22,5% e deduz R$636");
				}

			}
		}
	}
}
