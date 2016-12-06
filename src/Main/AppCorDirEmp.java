/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Usersone
 */


import Controlador.ControladorMenu;
import Modelo.ModeloMenu;
import Modelo.ModeloMenuDirecciones;
import Vista.VentanaGeneradora;
import Vista.VentanaMenu;

public class AppCorDirEmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VentanaMenu vista = new VentanaMenu();
		ModeloMenu modelo = new ModeloMenu();
		ModeloMenuDirecciones modeloDirecciones = new ModeloMenuDirecciones();
		ControladorMenu controlador = new ControladorMenu(vista, modelo, modeloDirecciones);
	}
	

}

