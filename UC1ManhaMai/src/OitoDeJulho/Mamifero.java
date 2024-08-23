package OitoDeJulho;

public class Mamifero {
	String nome;
	double peso;
	int idade;

	public Mamifero(String nome, double peso, int idade) {
		this.nome = nome;
		this.peso = peso;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String especie) {
		this.nome = especie;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return idade;
	}

	public void setAltura(int idade) {
		this.idade = idade;
	}

	public void apresentarNomeAnimal() {
		System.out.println(getNome());
	}

	public int classificarAnimal(int opc) {
		if (opc == 0) {
			System.out.println("Pequeno porte");
			return 0;
		}else if(opc ==1) {
			System.out.println("Medio porte");
			return 1;
		}else {
			System.out.println("Grande porte");
			return 2;
		}
	}
	public int classificarPorIdade(int opc) {
		if (opc ==0) {
			System.out.println("Filhote");
			return 0;
		}else if(opc ==1) {
			System.out.println("Adulto");
			return 1;
		}else {
			System.out.println("Idoso");
			return 2;
		}
			
	}
}
