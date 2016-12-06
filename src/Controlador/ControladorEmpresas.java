/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Usersone
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import Modelo.ModeloEmpresas;
import Vista.VentanaGeneradora;


public class ControladorEmpresas implements ActionListener {

	
		private VentanaGeneradora vista;
		private ModeloEmpresas modelo;
		
		public ControladorEmpresas(VentanaGeneradora vista, ModeloEmpresas modelo) {
			super();
			this.vista = vista;
			this.modelo = modelo;
			vista.listenerMenu(this);
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			try{
			int num = vista.getTxtCantidad();
			if (e.getSource().equals(vista.getBtnGenerar())) {
				JOptionPane.showMessageDialog(null, "Archivo Creado");
				modelo.setNume(num);
				modelo.start();
				
					ControladorEmpresas con=new ControladorEmpresas(vista, modelo);
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
	}

}
