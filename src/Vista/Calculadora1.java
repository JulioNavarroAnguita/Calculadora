package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;


import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculadora1 {

	public JTextField getTextField() {
		return textField;
	}

	public JButton getBoton7() {
		return boton7;
	}

	public JButton getBoton9() {
		return boton9;
	}

	public JButton getBotonMas() {
		return botonMas;
	}

	public JButton getBoton4() {
		return boton4;
	}

	public JButton getBoton8() {
		return boton8;
	}

	public JButton getBoton6() {
		return boton6;
	}

	public JButton getBotonMenos() {
		return botonMenos;
	}

	public JButton getBoton1() {
		return boton1;
	}

	public JButton getBoton5() {
		return boton5;
	}

	public JButton getBoton3() {
		return boton3;
	}

	public JButton getBotonPor() {
		return botonPor;
	}

	public JButton getBoton0() {
		return boton0;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public JButton getBotonC() {
		return botonC;
	}

	public JButton getBotonIgual() {
		return botonIgual;
	}

	public JButton getBotonDividir() {
		return botonDividir;
	}

	private JFrame frame;
	private JTextField textField;
	private JButton boton7;
	private JButton boton9;
	private JButton botonMas;
	private JButton boton4;
	private JButton boton8;
	private JButton boton6;
	private JButton botonMenos;
	private JButton boton1;
	private JButton boton5;
	private JButton boton3;
	private JButton botonPor;
	private JButton boton0;
	private JButton boton2;
	private JButton botonC;
	private JButton botonIgual;
	private JButton botonDividir;

	/**
	 * Launch the application.
	 */
	/*public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}*/

	/**
	 * Create the application.
	 */
	public Calculadora1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 250, 300);
		//frame.setSize(300,380);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setTitle("Calculadora sencilla");
		frame.setVisible(true);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.setForeground(new Color(0, 191, 255));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setEditable(false);
		//textField.setText("0");
		textField.setFont(new Font("Dialog", Font.BOLD, 16));
		panel.add(textField);
		textField.setColumns(27);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(new GridLayout(0, 4, 0, 0));
		
		boton7 = new JButton("7");
		panel_1.add(boton7);
		
		boton8 = new JButton("8");
		panel_1.add(boton8);
		
		boton9 = new JButton("9");
		panel_1.add(boton9);
		
		botonMas = new JButton("+");
		panel_1.add(botonMas);
		
		boton4 = new JButton("4");
		panel_1.add(boton4);
		
		boton5 = new JButton("5");
		panel_1.add(boton5);
		
		boton6 = new JButton("6");
		panel_1.add(boton6);
		
		botonMenos = new JButton("-");
		panel_1.add(botonMenos);
		
		boton1 = new JButton("1");
		panel_1.add(boton1);
		
		boton2 = new JButton("2");
		panel_1.add(boton2);
		
		boton3 = new JButton("3");
		panel_1.add(boton3);
		
		botonPor = new JButton("*");
		panel_1.add(botonPor);
		
		boton0 = new JButton("0");
		panel_1.add(boton0);
		
		botonC = new JButton("C");
		panel_1.add(botonC);
		
		botonIgual = new JButton("=");
		panel_1.add(botonIgual);
		
		botonDividir = new JButton("/");
		panel_1.add(botonDividir);
		
		
	}
	
	public void lanzarDialogo(String frase) {
		JOptionPane dialogo = new JOptionPane();
		dialogo.showMessageDialog(frame, frase, 
				"INFORMACION DE CALCULADORA", JOptionPane.ERROR_MESSAGE);


	}

}
