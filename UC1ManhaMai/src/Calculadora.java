import java.util.Scanner;

public class Calculadora {

		public void mostrarValorPar(int n) {
		for(int i = 0; i <=n; i++) {
			if (i%2 == 0) {
				System.out.println("Número par: " + i);	
			}
		}
	}
	public void mostrarValorImpar(int n) {
		for(int i = 0; i < n; i++) {
			if (i%2 == 1) {
				System.out.println("Número ímpar: " + i);
			}
		}
	}
//	EXERCÍCIOS SOBRE ESTRUTURA DE REPETIÇÃO - USE FUNÇÃO E ESTRUTURA DE REPETIÇÃO

//1.
	public void mostrarValor(int n) {
		for(int i = 0; i < n ; i++) {
			System.out.println(i);
	}
}

//2.
//	public void questao2() {
//		Scanner scanner = new Scanner(System.in);
//		for(int i = 0; i < 10; i++) {
//			scanner.nextInt();
//		}
//	}
//	
	
	

	public void apresentarFrase(int n) {
		int i = n;
		while(i != 0){
		System.out.println("Hello world");
		i--;
		}
	}
	
	
	
	public int somarNumero(int n) {
		int i = 0;
		int soma = 0;
		while(i <= 100) {
			soma = soma + i;
			i++;
		}
		System.out.println("O valor da soma é " + soma);
		return soma;
	}

	public double somarIterativamente() {
		Scanner input = new Scanner(System.in);
		double soma = 0;
		double valor = 1;
		while(valor != 0) {
			System.out.println("Insira o valor: ");
			valor = input.nextFloat();
			soma = soma + valor;
		}
		input.close();
		System.out.println("O valor da soma é: " + soma);
		return soma;
	}

	public double multiplicarIterativamente() {
		double mult = 1;
		double valor = 1;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Digite o valor: ");
			valor = input.nextDouble();
			if(valor!= 0) {
				mult = mult * valor;
			}else {
				
			}
			
		}while(valor != 0);
		input.close();
		return mult;
}

		
}
