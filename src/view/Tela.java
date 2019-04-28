package view;
import entidade.Avaliacao;
import entidade.Pessoa;
import rule.IMC;

public class Tela {

	public void executar() {

		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Ariosvaldo");
		pessoa.setAltura(2.0);
		pessoa.setPeso(2.0);

		
		
		//double novoIndice = IMC.calcular(p.peso, p.altura);
		
		double novoIndice = IMC.calcular(pessoa);
		
		String novaSituacao = IMC.situacao(novoIndice);
		
		Avaliacao aval = new Avaliacao(novoIndice, novaSituacao);
		
		pessoa.setAvaliacao(aval);
		
		Relatorio.mostrar(pessoa);
		
		System.out.println("Fim");
	}

}
