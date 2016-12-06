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

import Modelo.ModeloMenuDirecciones;
import Vista.VentanaGeneradora;

public class ControladorDirecciones implements ActionListener {

	private VentanaGeneradora vista;
	private ModeloMenuDirecciones modeloDirecciones;
	
	
	public ControladorDirecciones(VentanaGeneradora vista, ModeloMenuDirecciones modeloDirecciones) {
		super();
		this.vista = vista;
		this.modeloDirecciones = modeloDirecciones;
		vista.listenerMenu(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int num = vista.getTxtCantidad();
		if (e.getSource().equals(vista.getBtnGenerar())) {
			JOptionPane.showMessageDialog(null, "Archivo Creado");
			modeloDirecciones.setNume(num);
                        modeloDirecciones.start();
			//modeloDirecciones.numero(num);
                        
		ControladorDirecciones controladorDirecciones = new ControladorDirecciones(vista, modeloDirecciones);
		}
	}

}
