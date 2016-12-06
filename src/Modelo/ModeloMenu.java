/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Usersone
 */
import Vista.VentanaGeneradora;
import Vista.VentanaMenu;


public class ModeloMenu {

	public void abrirVentanaCorreo(){
		VentanaGeneradora correo=new VentanaGeneradora();
		correo.setVisible(true);
	}
	public void abrirVentanaDirecciones(){
		VentanaGeneradora direcciones=new VentanaGeneradora();
		direcciones.setVisible(true);
	}
	public void abrirVentanaEmpresas(){
		VentanaGeneradora empresas=new VentanaGeneradora();
		empresas.setVisible(true);
	}
	/*public void abrirVentana(Ventana ventana){
		ventana.setVisible(true);
	}*/
	
	
}
