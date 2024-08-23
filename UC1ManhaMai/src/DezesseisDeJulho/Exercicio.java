package DezesseisDeJulho;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
	public static void questao11() {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		System.out.println(list);
		}
	public static void questao12() {
		
		List<String> list = new ArrayList<>();
		
		list.add("Vermelho");
		list.add("Laranja");
		list.add("Amarelo");
		list.add("Verde");
		list.add("Azul");
		
		System.out.println(list.get(2));
		}
	public static void questao13() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Maçã");
		list.add("Mamão");
		list.add("Tangerina");
		list.add("Laranja");
		list.add("Melancia");
		
		list.remove(1);
		System.out.println(list);
		}
	public static void questao14() {
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		list.set(3, 10);
		System.out.println(list);
		}
	public static void questao15() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Gato");
		list.add("Elefante");
		list.add("Formiga");
		list.add("Cachorro");
		list.add("Cobra");
		
		boolean contains = list.contains("Cachorro");
		System.out.println("Contains " + contains);	
		}
	public static void questao21() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Brasil");
		list.add("Austrália");
		list.add("Bélgica");
		list.add("Quênia");
		list.add("Tailândia");
		
		int sizeList = list.size();
		System.out.println("A lista tem " + sizeList + " países." );
		}
	public static void questao22() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Sandero");
		list.add("Clio");
		list.add("Kwid");
		list.add("Argo");
		list.add("Celta");
		
		for(String elemento : list) {
			System.out.println(elemento);
		}
	}
	public static void questao23() {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Sandero");
		
	}
}

