package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import Modelo.Modelo;
import Modelo.ModeloExcepcion;
import Vista.Calculadora1;

public class Controlador implements ActionListener {

	private Calculadora1 calculadora;
	private Modelo modelo;


	public Controlador(Calculadora1 calculadora) {
		this.calculadora = calculadora;
		registrarComponentes();
	}


	private void registrarComponentes() {

		calculadora.getBoton0().addActionListener(this);
		calculadora.getBoton1().addActionListener(this);
		calculadora.getBoton2().addActionListener(this);
		calculadora.getBoton3().addActionListener(this);
		calculadora.getBoton4().addActionListener(this);
		calculadora.getBoton5().addActionListener(this);
		calculadora.getBoton6().addActionListener(this);
		calculadora.getBoton7().addActionListener(this);
		calculadora.getBoton8().addActionListener(this);
		calculadora.getBoton9().addActionListener(this);
		calculadora.getBotonPor().addActionListener(this);
		calculadora.getBotonMas().addActionListener(this);
		calculadora.getBotonDividir().addActionListener(this);
		calculadora.getBotonMenos().addActionListener(this);
		calculadora.getBotonIgual().addActionListener(this);
		calculadora.getBotonC().addActionListener(this);

	}


	@Override
	public void actionPerformed(ActionEvent e) {

		String texto = calculadora.getTextField().getText();
	//	System.out.println(texto);
		String boton = ((JButton) e.getSource()).getText();
	//	System.out.println(boton);


		switch (boton) {
		case "C":
			//calculadora.getTextField().setText("");
			calculadora.getTextField().setText("0");
			break;
		case "=":
			try {
				modelo = new Modelo(texto);
				calculadora.getTextField().setText(modelo.devolverResultado() + "");
			} catch (ModeloExcepcion e1) {
				calculadora.getTextField().setText("Error");
				calculadora.lanzarDialogo("Error de calculo");
			}
			break;

		default:
			texto += ((JButton) e.getSource()).getText();
			calculadora.getTextField().setText(texto);
			break;
		}

	}


}
