package DezenoveDeJulho;

import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<String> nomeCachorro = new LinkedList<>();
		
		nomeCachorro.addFirst("Mayla");
		nomeCachorro.addLast("Amy");
		nomeCachorro.add(1, "Milly");
		System.out.println(nomeCachorro);
		
		//Acessando valores específicos da minha linkedlist
		System.out.println("Primeiro nome: " + nomeCachorro.getFirst());
		System.out.println("Último nome: " + nomeCachorro.getLast());
		System.out.println("Segundo nome: " + nomeCachorro.get(1));
		
		//Remover o primeiro valor da linkedlist
		nomeCachorro.remove(1);
		System.out.println();
		System.out.println(nomeCachorro);
		
		//Pegar o tamanho da LinkedList
		System.out.println("Tamanho do LinkedList " + nomeCachorro.size());
		
		//Limpar a LinkedList
		nomeCachorro.clear();
		
	}
}
