package OitoDeJulho;

public class Pessoa {

	String nome;
	int idade;
	double altura;
	double peso;
	char tamanho;
	int telefone;
	
	public Pessoa(String nome, int idade, double altura, double peso, char tamanho, int telefone) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.tamanho = tamanho;
		this.telefone = telefone;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public char getTamanho() {
		return tamanho;
	}
	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void apresentarNome() {
		System.out.println(getNome());
	}
	public int classificarPorIdade(int opc) {
	 	if (opc == 0) {
	 		System.out.println("Criança");
	 		return 0;
	 	}else if(opc == 1) {
	 		System.out.println("Adolescente");
	 		return 1;
	 	}else if(opc == 2) {
	 		System.out.println("Adulto");
	 		return 2;
	 	}else
	 		System.out.println("Idoso");
	 	    return 3;
	}
	
	public int trabalha(int opc) {
		if (opc == 0) {
			System.out.println("Trabalha");
			return 0;
		}else
			System.out.println("Desempregado");
			return 1;
	}
}
