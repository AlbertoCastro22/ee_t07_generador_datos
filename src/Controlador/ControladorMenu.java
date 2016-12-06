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

import Modelo.ModeloCorreo;
import Modelo.ModeloEmpresas;
import Modelo.ModeloMenu;
import Modelo.ModeloMenuDirecciones;
import Vista.VentanaGeneradora;
import Vista.VentanaMenu;

public class ControladorMenu implements ActionListener {

	private VentanaMenu vista;
	private ModeloMenu modelo;
	

	
	
	public ControladorMenu(VentanaMenu vista, ModeloMenu modelo, ModeloMenuDirecciones modeloDirecciones) {
		super();
		this.vista = vista;
		this.modelo = modelo;
		this.vista.listenerMenu(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object boton = e.getSource();
		if(boton.equals(vista.getBtnCorreo())){
			JOptionPane.showMessageDialog(null, "Abriste Correo");
			VentanaGeneradora vista = new VentanaGeneradora();
	        vista.setVisible(true);
	        ModeloCorreo modelo = new ModeloCorreo();
	        ControladorCorreo controlador = new ControladorCorreo(vista, modelo);
		}else if(e.getSource().equals(vista.getBtnDirecciones())){
			JOptionPane.showMessageDialog(null, "Abriste Direcciones");
			VentanaGeneradora vista = new VentanaGeneradora();
			vista.setVisible(true);
			ModeloMenuDirecciones modeloDirecciones = new ModeloMenuDirecciones();
			ControladorDirecciones controlador = new ControladorDirecciones(vista, modeloDirecciones);
		}else if(e.getSource().equals(vista.getBtnEmpresas())){
			JOptionPane.showMessageDialog(null, "Abriste Empresas");
			VentanaGeneradora vista = new VentanaGeneradora();
			vista.setVisible(true);
			ModeloEmpresas modelo = new ModeloEmpresas();
			ControladorEmpresas controlador = new ControladorEmpresas(vista, modelo);
			
		}

	}

}