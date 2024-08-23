package DezoitoDeJulho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Exercicio {

	public static void call() {
		exercicio4();
		
	}
	
	public static void exercicio1() {
		HashMap<String, Integer> notaAlunos = new HashMap<String, Integer>();
		
		notaAlunos.put("Eduardo", 9);
		notaAlunos.put("Sandro", 10);
		notaAlunos.put("Mufasa", 8);
		notaAlunos.put("Luna", 9);
		notaAlunos.put("Pandora", 8);
		notaAlunos.put("Prata", 7);
		System.out.println(notaAlunos);
	}
	
	public static void exercicio3() {
		HashMap<String, Double> konbini = new HashMap<>();
		
		konbini.put("Fandangos", 2.5);
		konbini.put("Cheetos", 3.5);
		konbini.put("Salsicha", 8.89);
		konbini.put("Pringles", 10.99);
		
		List<String> produtosBaratos = mercado(konbini, 7.0);
		
		System.out.println("Lista de produtos de até 7 reais: " + produtosBaratos);
		
	}
	
	public static List<String> mercado(HashMap<String, Double> produtos, double precoMaximo) {
		List<String> produtosValidos = new ArrayList<>();
		
		for (String produto : produtos.keySet()) {
			if (produtos.get(produto) < precoMaximo) {
				produtosValidos.add(produto);
			}
		}	
		return produtosValidos;
	}
	
	public static void exercicio4() {
		HashMap<Long, String> alunosMatricula = new HashMap<>();
		
		alunosMatricula.put(202400775601L, "Eduardo");
		alunosMatricula.put(202400775604L, "Maria");
		alunosMatricula.put(202400775603L, "Marcos");
		alunosMatricula.put(202400775602L, "Luan");
		
		alunosMatricula.remove(202400775601L);
		
		System.out.println(alunosMatricula);
	}
	
	public static void removerAluno(HashMap<Long, String> alunos, long matricula) {
//		List<String> chaves = alunos.keySet().stream().collect(Collectors.toList());
//		for (String alunoNome : chaves) {
//			if (alunos.get(alunoNome) < 5) {
//				alunos.remove(alunoNome);
//			}
//		}

	alunos.remove(matricula);
	}
	
	
}
