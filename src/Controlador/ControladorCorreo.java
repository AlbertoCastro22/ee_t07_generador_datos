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

import java.awt.event.*;
import javax.swing.JOptionPane;
import Modelo.*;
import Vista.VentanaGeneradora;

public class ControladorCorreo implements ActionListener {

	private VentanaGeneradora vista;
	private ModeloCorreo modelo;

	public ControladorCorreo(VentanaGeneradora vista, ModeloCorreo modelo) {
		super();
		this.vista = vista;
		this.modelo = modelo;
		vista.listenerMenu(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int num = vista.getTxtCantidad();
		if (e.getSource().equals(vista.getBtnGenerar())) {
			JOptionPane.showMessageDialog(null, "Archivo Creado");		                                             
                        //FIXME
			modelo.setNume(num);
                        modelo.start();                                     			
                        ControladorCorreo controlador = new ControladorCorreo(vista, modelo);                        
                        while(modelo.isAlive()){}
		}
	}

}
