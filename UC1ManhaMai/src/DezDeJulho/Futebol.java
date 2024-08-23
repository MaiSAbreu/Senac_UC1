package DezDeJulho;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Futebol extends JFrame {
	
	private JTextField timeField;
	private JRadioButton maleRadio;
	private JRadioButton femaleRadio;
	private JTextField numeroField;
	private JTextField lugarField;
	
	private JRadioButton bomRadio;
	private JRadioButton ruimRadio;
	private JCheckBox newsletterCheckBox;
	private JCheckBox termosCheckBox;
	private JCheckBox roboCheckBox;
	private JButton submitButton;
	
	
	public Futebol() {
		setTitle("Formulario sobre seu time de futebol");
		setSize(500,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(new BorderLayout(10,10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));
		
		JLabel timeJLabel = new JLabel("Nome do time: ");
		timeField = new JTextField();
		
		JLabel genderJLabel = new JLabel("Gênero da seleção:");
		maleRadio = new JRadioButton("Masculina");
		femaleRadio = new JRadioButton("Feminina");
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleRadio);
		genderGroup.add(femaleRadio);
		
		JLabel numeroJLabel = new JLabel("Número de jogadores: ");
		numeroField = new JTextField();
		
		JLabel lugarJLabel = new JLabel("De onde é o time: ");
		lugarField = new JTextField();
		
		JLabel bonJLabel = new JLabel("Nível do time: ");
		bomRadio = new JRadioButton("Bom");
		ruimRadio = new JRadioButton("Ruim");
		ButtonGroup bonGroup = new ButtonGroup();
		bonGroup.add(bomRadio);
		bonGroup.add(ruimRadio);
		
		JLabel newsletterJLabel = new JLabel("Aceito receber notícias do time");
		newsletterCheckBox = new JCheckBox();
		
		JLabel termosJLabel = new JLabel("Concordo com os termos de serviço");
		termosCheckBox = new JCheckBox();
		
		JLabel roboJLabel = new JLabel("Não sou um robô");
		roboCheckBox = new JCheckBox();
		
		formPanel.add(timeJLabel);
		formPanel.add(timeField);
		
		formPanel.add(genderJLabel);
		JPanel genderJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		genderJPanel.add(maleRadio);
		genderJPanel.add(femaleRadio);
		formPanel.add(genderJPanel);
		
		formPanel.add(numeroJLabel);
		formPanel.add(numeroField);
		
		formPanel.add(lugarJLabel);
		formPanel.add(lugarField);
		
		formPanel.add(bonJLabel);
		JPanel bonJPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		bonJPanel.add(bomRadio);
		bonJPanel.add(ruimRadio);
		formPanel.add(bonJPanel);
		
		formPanel.add(newsletterJLabel);
		formPanel.add(newsletterCheckBox);
		
		formPanel.add(termosJLabel);
		formPanel.add(termosCheckBox);
		
		formPanel.add(roboJLabel);
		formPanel.add(roboCheckBox);
		
		submitButton = new JButton("Confirmar");
		submitButton.addActionListener(new SubmitButtonListener());
		
		mainPanel.add(formPanel, BorderLayout.CENTER);
		mainPanel.add(submitButton, BorderLayout.SOUTH);
		
		add(mainPanel);
		setVisible(true);	
	}

	private class SubmitButtonListener implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			String time = timeField.getText();
			String gender = maleRadio.isSelected()?"Masculina"
					: femaleRadio.isSelected()? "Feminina": "Não especificado";
			String numero = numeroField.getText();
			String lugar = lugarField.getText();
			String bon = bomRadio.isSelected()?"Bom"
					: ruimRadio.isSelected()? "Ruim": "Não especificado";
			String newsletter = newsletterCheckBox.isSelected()? "Sim" : "Não";
			String termos = termosCheckBox.isSelected()? "Sim" : "Não";
			String robo = roboCheckBox.isSelected()? "Sim" : "Não";
			
			String message = String.format("""
					Nome do time: %s
					Gênero da seleção: %s
					Número de jogadores: %s
					De onde é o time: %s
					Nível do time: %s
					Aceito receber notícias do time: %s
					Concordo com os termos de serviço: %s
					Não sou um robô: %s
					""",
					time, gender, numero, lugar, bon, newsletter, termos, robo);
			JOptionPane.showMessageDialog(
					Futebol.this,
					message,
					"Dados do time",
					JOptionPane.INFORMATION_MESSAGE
				);
		}
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Futebol();
			}
		});

	}

}
