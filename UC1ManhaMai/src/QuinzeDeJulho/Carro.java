package QuinzeDeJulho;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

public class Carro extends JFrame {
	private JTextField marcaField;
	private JTextField modeloField;
	private JTextField anoField;
	private JTextField corField;
	private JToggleButton portaToggle;
	private JButton submitButton;
	
	private DefaultTableModel tablemodel;
	
	public Carro() {
		
		setTitle("Informações do Carro");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
		JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
		mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
		JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));
		
		JLabel marcaLabel = new JLabel("Marca");
		marcaField = new JTextField();
		JLabel modeloLabel = new JLabel("Modelo:");
		modeloField = new JTextField();
		JLabel anoLabel = new JLabel("Ano:");
		anoField = new JTextField();
		JLabel corLabel = new JLabel("Cor:");
		corField = new JTextField();
		
		JLabel portaLabel = new JLabel("Quantidade de portas:");
		portaToggle = new JToggleButton("4 portas");
		portaToggle.addItemListener(e -> {
            if (portaToggle.isSelected()) {
                portaToggle.setText("2 portas");
            } else {
                portaToggle.setText("4 portas");
            }
        });

		formPanel.add(marcaLabel);
		formPanel.add(marcaField);
		formPanel.add(modeloLabel);
		formPanel.add(modeloField);
		formPanel.add(anoLabel);
		formPanel.add(anoField);
		formPanel.add(corLabel);
		formPanel.add(corField);
		formPanel.add(portaLabel);
		formPanel.add(portaToggle);
		
	}

}
