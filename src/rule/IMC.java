package rule;
import entidade.Pessoa;

public class IMC {
	
	@Deprecated
	public static double calcula(double p, double a) {

		return calcularGeral(p, a);
		
	}
	
	public static double calcular(Pessoa pessoa) {

		return calcularGeral(pessoa.getPeso(), pessoa.getAltura());
	
	}
	
	private static double calcularGeral(double peso, double altura) {

		return peso / (peso * altura);
	
	}


	public static String situacao(double indice) {
		String situacao;
		
		if (indice <= 20 ) {
			situacao = "Magro";
		} else if (indice > 20) {
			situacao = "Acima do peso";
		} else {
			situacao = "Normal";
		}
		
		return situacao;
	}
}
