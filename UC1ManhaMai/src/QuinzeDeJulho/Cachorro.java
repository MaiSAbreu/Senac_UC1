package QuinzeDeJulho;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class Cachorro extends JFrame {
	private JTextField nomeField;
	private JTextField idadeField;
	private JTextField racaField;
	private JTextField corField;
	private JRadioButton maleRadio;
    private JRadioButton femaleRadio;
    private JButton submitButton;
    
    private DefaultTableModel tableModel;
    
    public Cachorro() {
		setTitle("Dados do Cachorro");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		
		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		
		JPanel formPanel = new JPanel(new GridLayout(5, 2, 10, 10));
		
		JLabel nomeLabel = new JLabel("Nome:");
		nomeField = new JTextField();
		JLabel idadeLabel = new JLabel("Idade:");
		idadeField = new JTextField();
		JLabel racaLabel = new JLabel("Raça:");
		racaField = new JTextField();
		JLabel corLabel = new JLabel("Cor:");
		corField = new JTextField();
		
		JLabel genderLabel = new JLabel("Sexo:");
		maleRadio = new JRadioButton("Macho");
		femaleRadio = new JRadioButton("Fêmea");
		ButtonGroup genderGroup = new ButtonGroup();
		genderGroup.add(maleRadio);
		genderGroup.add(femaleRadio);
		
		JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
		genderPanel.add(maleRadio);
		genderPanel.add(femaleRadio);
		
		
		formPanel.add(nomeLabel);
		formPanel.add(nomeField);
		formPanel.add(idadeLabel);
		formPanel.add(idadeField);
		formPanel.add(racaLabel);
		formPanel.add(racaField);
		formPanel.add(corLabel);
		formPanel.add(corField);
		formPanel.add(genderLabel);
		formPanel.add(genderPanel);
		
		submitButton = new JButton("Enviar");
		submitButton.addActionListener(new SubmitButtonListener());
		
		mainPanel.add(formPanel, BorderLayout.CENTER);
		mainPanel.add(submitButton, BorderLayout.SOUTH);
		
		add(mainPanel);

        setVisible(true);

        tableModel = new DefaultTableModel(new String[] {
        		"Nome", "Idade", "Raça",
        		"Cor", "Sexo"}, 0);
        
    }
    
    private class SubmitButtonListener implements ActionListener {
    	@Override
    	public void actionPerformed(ActionEvent e) {
    		
    		String nome = nomeField.getText();
    		String idade = idadeField.getText();
    		String raca = racaField.getText();
    		String cor = corField.getText();
    		String gender = maleRadio.isSelected()? "Macho"
    				: femaleRadio.isSelected()? "Fêmea" : "Não especifido";
    		
    		tableModel.addRow(new Object[] {
    				nome, idade, raca, cor, gender});
    		
    		new InfoFrame1(tableModel);
    	}
    }
    
    public static void main(String[] args) {
    	
    	SwingUtilities.invokeLater(new Runnable() {
    		@Override
    		public void run() {
    			new Cachorro();
    		}
    	});
    }
}

class InfoFrame1 extends JFrame {
	public InfoFrame1(DefaultTableModel tableModel) {
		
		setTitle("Dados dos cachorros");
		setSize(600,300);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JTable table  = new JTable(tableModel);
		
		JScrollPane scrollPane = new JScrollPane(table);
		add(scrollPane, BorderLayout.CENTER);
		
		setVisible(true);
	}
}