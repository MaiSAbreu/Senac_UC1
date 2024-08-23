package DezesseteDeJulho;

import java.util.Vector;

public class Exercicios {

	public static void call() {
		exercicio1();
		exercicio3();
		exercicio4();
		exercicio22();
	}
	
	public static void exercicio1() {
		int[] numeros = new int [10];
		for (int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
	}
	public static void exercicio3() {
		int[] valores = {10,20,30,40,50};
		valores[3] = 100;
		for(int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
	}
	public static void exercicio4() {
		int[] numeros = {10,20,30,40,50};
		for(int numero : numeros) {
			System.out.println(numero);
		}
	}
	public static void exercicio22() {
		int[] valores = {10, 20, 30, 40, 50};
		int tamanhoArray = valores.length;
		System.out.println(tamanhoArray);
	}
	public static void exercicio23() {
		
		Vector<String> frutas = new Vector<>();
		frutas.add("Maça");
		frutas.add("Laranja");
		
		
	}
}
