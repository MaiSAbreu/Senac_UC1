package OitoDeJulho;

//import javax.swing.JOptionPane;
//
//public class Main {
//
//	public static void main(String[] args) {
//
//		String nomeCachorro = JOptionPane.showInputDialog(null, "Digite o nome do cachorro:", "Entrada de dados",
//				JOptionPane.QUESTION_MESSAGE);
//
//		int resposta = JOptionPane.showConfirmDialog(null, "Você quer manter o nome : " + nomeCachorro + "?",
//				"Confirmação", JOptionPane.YES_NO_CANCEL_OPTION
//
//		);
//		if (resposta == 0) {
//			Mamifero cachorro = new Mamifero(nomeCachorro, 17, 10);
//			JOptionPane.showMessageDialog(null, "Cuidado com o " + cachorro.getNome(), "Cuidado com o cão",
//					JOptionPane.WARNING_MESSAGE);
//
//			Mamifero gato = new Mamifero("Sandrinho", 3.5, 4);
//			gato.apresentarNomeAnimal();
//			gato.classificarAnimal(0);
//			gato.classificarPorIdade(1);
//
//			cachorro.apresentarNomeAnimal();
//			cachorro.classificarAnimal(1);
//			cachorro.classificarPorIdade(2);
//
//			Pessoa leonardo = new Pessoa("Leonardo", 27, 1.77, 80, 'g');
//			leonardo.apresentarNome();
//			leonardo.classificarPorIdade(2);
//			leonardo.trabalha(0);
//
//			Pessoa marcos = new Pessoa("Marcos", 60, 1.50, 50, 'p');
//			marcos.apresentarNome();
//			marcos.classificarPorIdade(3);
//			marcos.trabalha(1);
//
//			Pessoa eduardo = new Pessoa("Eduardo", 20, 1.74, 75, 'm');
//			eduardo.apresentarNome();
//			eduardo.classificarPorIdade(2);
//			eduardo.trabalha(1);
//
//			JOptionPane.showMessageDialog(null, "Programar é meio complicado.", "Programação",
//					JOptionPane.WARNING_MESSAGE);
//
//			JOptionPane.showMessageDialog(null, "Futebol é muito bobo.", "Futebol", JOptionPane.WARNING_MESSAGE);
//			JOptionPane.showMessageDialog(null, "Matemática é super legal!", "Matemática", JOptionPane.WARNING_MESSAGE);
//
//			String nome = JOptionPane.showInputDialog(null, "Digite seu nome:", "Questionário",
//					JOptionPane.QUESTION_MESSAGE);
//
//			String idade = JOptionPane.showInputDialog(null, "Digite sua idade:", "Questonário",
//					JOptionPane.QUESTION_MESSAGE);
//
//			int idadeFinal = Integer.parseInt(idade);
//			
//			String telefone = JOptionPane.showInputDialog(null, "Digite seu número de telefone:", "Questionário",
//					JOptionPane.QUESTION_MESSAGE);
//			
//			int telefoneFinal = Integer.parseInt(telefone);
//			
//			int resposta = JOptionPane.showConfirmDialog(
//					null, 
//					"Estas informações estão corretas?",
//					"Confirmação",
//					JOptionPane.YES_NO_CANCEL_OPTION
//					);
//					
//			Pessoa fulana = new Pessoa(nome, idadeFinal, 0.0, 0.0, '?', telefoneFinal);
//			JOptionPane.showInternalMessageDialog(
//					null,
//					"Nome: " + fulana.getNome() + "\n" +
//					"Idade: " + fulana.getIdade() + "\n" +
//					"Telefone: " + fulana.getTelefone(),
//					"Informações da pessoa",
//					JOptionPane.WARNING_MESSAGE
//					
//					);
//		
//		int resposta = JOptionPane.showConfirmDialog(
//				null, 
//				"Você tem certeza de que digitou os dados corretamente?",
//				"Confirmação",
//				JOptionPane.YES_NO_CANCEL_OPTION
//				);
//		
//		int resposta2 = JOptionPane.showConfirmDialog(
//				null, 
//				"Os correios entregaram sua encomenda?",
//				"Confirmação",
//				JOptionPane.YES_NO_CANCEL_OPTION
//				);
//		
//		String[] opcoes = {"Ceará", "Rio de Janeiro", "Maranhão"};
//		int escolha = JOptionPane.showOptionDialog(
//				null, 
//				"Selecione o estado em que você nasceu:",
//				"Questionário",
//				JOptionPane.DEFAULT_OPTION,
//				JOptionPane.INFORMATION_MESSAGE,
//				null,
//				opcoes,
//				opcoes[0]
//				);
//		
//		String[] opcoes = {"Sandero", "Clio", "Kwid"};
//		int escolha = JOptionPane.showOptionDialog(
//				null, 
//				"Selecione o seu carro:",
//				"Questionario",
//				JOptionPane.DEFAULT_OPTION,
//				JOptionPane.INFORMATION_MESSAGE,
//				null, 
//				opcoes, 
//				opcoes[0]
//				);
//		
//		String[] opcoes = {"Excel avançado", "Analista de dados", "Programador de sistemas"};
//		int escolha = JOptionPane.showOptionDialog(
//				null,
//				"Selecione o curso que você está cursando:",
//				"Questionário",
//				JOptionPane.DEFAULT_OPTION,
//				JOptionPane.INFORMATION_MESSAGE,
//				null,
//				opcoes,
//				opcoes[0]
//				);
//		}
//	}
//}
