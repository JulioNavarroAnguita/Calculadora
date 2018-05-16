package MVC;

import java.awt.EventQueue;

import Controlador.Controlador;
import Modelo.Modelo;
import Vista.Calculadora1;




public class Principal {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Calculadora1 calculadora = new Calculadora1();
					new Controlador(calculadora);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


}


