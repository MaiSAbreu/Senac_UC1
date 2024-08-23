package DezDeJulho;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingUtilities;

public class Paises extends JFrame {
	
	private JTextField nomeField;
	private JTextField capitalField;
	private JTextField continenteField;
	private JTextField populacaoField;
	private JTextField idiomaField;
	private JTextField moedaField;
	private JTextField climaField;
	private JToggleButton cidadaniaToggle;
	private JTextField governoField;
	private JButton submitButton;
	
	public Paises() {
		setTitle("Informações do país");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));
		
		//////////////
		JLabel nomeJLabel = new JLabel("Nome: ");
		nomeField = new JTextField();
		
		JLabel capitalJLabel = new JLabel("Capital: ");
		capitalField = new JTextField();
		
		JLabel continenteJLabel = new JLabel("Continente: ");
		continenteField = new JTextField();
		
		JLabel populacaoJLabel = new JLabel("População: ");
		populacaoField = new JTextField();
		
		JLabel idiomaJLabel = new JLabel("Idioma: ");
		idiomaField = new JTextField();
		
		JLabel moedaJLabel = new JLabel("Moeda: ");
		moedaField = new JTextField();
		
		JLabel climaJLabel = new JLabel("Clima: ");
		climaField = new JTextField();
		
		
		JLabel governoJLabel = new JLabel("Tipo de governo: ");
		governoField = new JTextField();
		
		formPanel.add(nomeJLabel);
		formPanel.add(nomeField);
		formPanel.add(capitalJLabel);
		formPanel.add(capitalField);
		formPanel.add(continenteJLabel);
		formPanel.add(continenteField);
		formPanel.add(populacaoJLabel);
		formPanel.add(populacaoField);
		formPanel.add(idiomaJLabel);
		formPanel.add(idiomaField);
		formPanel.add(moedaJLabel);
		formPanel.add(moedaField);
		
		submitButton = new JButton("Enviar");
		submitButton.addActionListener(new SubmitButtonListener());
		
		mainPanel.add(formPanel, BorderLayout.CENTER);
		mainPanel.add(submitButton, BorderLayout.SOUTH);
		
		add(mainPanel);
		
		setVisible(true);	
	}
	
	private class SubmitButtonListener implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			String nome = nomeField.getText();
			String capital = capitalField.getText();
			String continente = continenteField.getText();
			String populacao = populacaoField.getText();
			String idioma = idiomaField.getText();
			String moeda = moedaField.getText();
			
			String message = String.format("Nome: %s\nCapital: %s\nContinente: %s\nPopulação: %s\nIdioma: %s\nMoeda: %s",
					nome, capital, continente, populacao, idioma, moeda);
			
			JOptionPane.showMessageDialog(
					Paises.this, 
					message,
					"Dados do país",
					JOptionPane.INFORMATION_MESSAGE
					);
		}

	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Paises();
			}
			
		});
	}

}

