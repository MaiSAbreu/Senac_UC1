package CincoDeJulho;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
//		Pessoa eduardo = new Pessoa("Eduardo", 20, 1.74);
//		System.out.println(eduardo.getNome());
//		eduardo.setNome("Eduardo Ribeiro");
//		System.out.println(eduardo.getNome());
//		eduardo.apresentarSalario(5000);
//		
//		Pessoa joaoPaulo = new Pessoa("João Paulo", 19, 1.75);
//		System.out.println(joaoPaulo.getNome());
//		joaoPaulo.apresentarSalario(7000);
//		
//		Pessoa marcos = new Pessoa ("Marcos", 60, 1.55);
//		System.out.println(marcos.getNome());
//		marcos.setNome("Marcos Paulino");
//		
//		Pessoa luan = new Pessoa("Luan", 23, 1.75);
//		
//		JOptionPane.showMessageDialog(
//				null,
//				"Nome : " + luan.getNome() + "\n"+
//				"Idade : " + luan.getIdade() + "\n"+
//				"Altura : " + luan.getAltura(),
//				"INFORMAÇÕES DA PESSOA",
//				JOptionPane.WARNING_MESSAGE);
//		
//		
		String nome = JOptionPane.showInputDialog(
				null,
				"Qual é seu nome",
				"Entrada de dados",
				JOptionPane.QUESTION_MESSAGE
				
		);
		String idade = JOptionPane.showInputDialog(
				null,
				"Qual é sua idade",
				"Entrada de dados",
				JOptionPane.QUESTION_MESSAGE
		);	
		int idadeFinal = Integer.parseInt(idade);
		
		String altura = JOptionPane.showInputDialog(
				null,
				"Qual é sua altura",
				"Entrada de dados",
				JOptionPane.QUESTION_MESSAGE
								
		);
		
		double alturaFinal = Double.parseDouble(altura);
		int resposta = JOptionPane.showConfirmDialog(
				null,
				"Você deseja continuar?",
				"Confirmação",
				JOptionPane.YES_NO_CANCEL_OPTION
				
		);
//		//SIM - 0 //NÃO - 1 //CANCELAR - 2
		Pessoal maria = new Pessoal(nome, idadeFinal, alturaFinal);
		JOptionPane.showInternalMessageDialog(
				null,
				"Nome : " + maria.getNome() + "\n"+
				"Idade : " + maria.getIdade() + "\n"+
				"Altura : " + maria.getAltura(),
				"INFORMAÇÕES DA PESSOA",
				JOptionPane.WARNING_MESSAGE);
				
		
		String [] opcoes = {"Opção 1", "Opção 2", "Opção 3"};
		int escolha = JOptionPane.showOptionDialog(
				null,
				"Escolha uma opção: ",
				"Seleção",
				JOptionPane.DEFAULT_OPTION,
				JOptionPane.INFORMATION_MESSAGE,
				null,
				opcoes,
				opcoes[0]
		);
//		
//		JOptionPane.showMessageDialog(
//				null,
//				"Programar é meio complicado.",
//				"Programação",
//				JOptionPane.WARNING_MESSAGE
//				);
//		
//		JOptionPane.showMessageDialog(
//				null,
//				"Futebol é muito bobo.",
//				"Futebol",
//				JOptionPane.WARNING_MESSAGE
//				);
//		JOptionPane.showMessageDialog(
//				null,
//				"Matemática é super legal!",
//				"Matemática",
//				JOptionPane.WARNING_MESSAGE
//				);
//		
//		String nome = JOptionPane.showInputDialog(
//				null,
//				"Digite seu nome:",
//				"Questionário",
//				JOptionPane.QUESTION_MESSAGE
//				);
//		
//		String idade = JOptionPane.showInputDialog(
//				null,
//				"Digite sua idade:",
//				"Questonário",
//				JOptionPane.QUESTION_MESSAGE
//				);
//		
//		String telefone = JOptionPane.showInputDialog(
//				null,
//				"Digite seu número de telefone:",
//				"Questionário",
//				JOptionPane.QUESTION_MESSAGE
//				);
//		
//				
	}


}


