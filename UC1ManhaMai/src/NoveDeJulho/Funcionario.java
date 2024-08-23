package NoveDeJulho;

public class Funcionario {
	String nome;
	double altura;
	int idade;
	String endereço;
	double salario;
	
	public Funcionario(String nome, double altura, int idade, String endereço, double salario) {
		this.nome = nome;
		this.altura = altura;
		this.idade = idade;
		this.endereço = endereço;
		this.salario = salario;	
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEndereço() {
		return endereço;
	}
	public void setEndereço(String endereço) {
		this.endereço = endereço;
	}
	public double getSalário() {
		return salario;
	}
	public void setSalário(double salário) {
		this.salario = salário;
	}
	
	public double apresentarSalario(double salario) {
		double salarioFinal = (salario) +(salario*0.08) * 12;
		System.out.println("O salário final é: " + salarioFinal);
		return salarioFinal;
	}
	public void apresentarMaiorOuMenor(int idade) {
		if (idade >= 18) {
			System.out.println("Maior de idade");
		}else {
			System.out.println("Menor de idade");}
		}

		public double retornarValorTransporte(double passagem) {
			double valor = passagem * 31;
			System.out.println("O valor a ser pago é " + valor);
			return valor;
		}
		
		public double retornarDiferencaEntreAltura(double alt1, double alt2) {
			double dif = alt1 - alt2;
			System.out.println("A diferença é " + dif);
			return dif;
		}
		
}
