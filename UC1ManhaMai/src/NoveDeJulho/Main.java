package NoveDeJulho;

public class Main {

	public static void main(String[] args) {
		Funcionario marcos = new Funcionario("Marcos", 1.50, 60, "Largo Grimmoud, 12", 2000);
		marcos.apresentarSalario(marcos.getSalário());
		
		Funcionario joaopaulo = new Funcionario("João Paulo", 1.70, 19, "Alameda das glicínias", 1500);
		joaopaulo.apresentarMaiorOuMenor(joaopaulo.getIdade());
		
		Funcionario luan = new Funcionario("Luan", 1.72, 20, "rua dos Alfeneiros, 4", 1500);
		luan.retornarValorTransporte(12);
		
		Funcionario eduardo = new Funcionario("Eduardo", 1.74, 20, "rua das magnólias, 25", 800);
		Funcionario maria = new Funcionario("Maria", 1.59, 20, "rua das magnólias, 25", 800);
		
		eduardo.retornarDiferencaEntreAltura(eduardo.getAltura(), maria.getAltura());
		

	}

}
