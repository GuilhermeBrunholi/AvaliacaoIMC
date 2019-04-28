package view;
import entidade.Pessoa;

public class Relatorio {
	
	public static void mostrar(Pessoa pessoa) {
		
		System.out.println("\n*****");
		System.out.println("Nome: " + pessoa.getNome());
		System.out.println("Altura: " + pessoa.getAltura());
		System.out.println("Peso: " + pessoa.getPeso());
		System.out.println("~~~~~");
		System.out.println("Avaliaçao: " + pessoa.getAvaliacao().getData());
		System.out.println("Indice IMC: " + pessoa.getAvaliacao().getIndice());
		System.out.println("Situação IMC: " + pessoa.getAvaliacao().getSituacao());
		
		System.out.println("\n");
		
	}
	
}
