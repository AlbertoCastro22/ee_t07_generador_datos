/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author Usersone
 */
import java.awt.Container;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import Modelo.Util;

public class VentanaGeneradora extends JFrame {

	private JLabel lblNumero= new JLabel(Util.NUMERO);
	private JTextField txtCantidad = new JTextField();
	private JButton btnGenerar= new JButton(Util.CREAR);

	private Container contenedor = getContentPane(); 
	
	public VentanaGeneradora(){
		setTitle("Ventana Generadora");
		setSize(350,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		cargarControles();
	}
	
	private void cargarControles(){
		contenedor.setLayout(null);
		lblNumero.setBounds(10, 100,50,30);
		txtCantidad.setBounds(75,100,100,30);
		btnGenerar.setBounds(10, 180, 300, 50);
		lblNumero.setHorizontalAlignment(SwingConstants.RIGHT);
			
			contenedor.add(lblNumero);
			contenedor.add(btnGenerar);
			contenedor.add(txtCantidad);
	}
	public void listenerMenu(ActionListener listener){
		btnGenerar.addActionListener(listener);

	}

	public JLabel getLblNumero() {
		return lblNumero;
	}

	public void setLblNumero(JLabel lblNumero) {
		this.lblNumero = lblNumero;
	}

	public int getTxtCantidad() {
		return Integer.parseInt(txtCantidad.getText());
	}

	public void setTxtCantidad(JTextField txtCantidad) {
		this.txtCantidad = txtCantidad;
	}

	public JButton getBtnGenerar() {
		return btnGenerar;
	}

	public void setBtnGenerar(JButton btnGenerar) {
		this.btnGenerar = btnGenerar;
	}

	public Container getContenedor() {
		return contenedor;
	}

	public void setContenedor(Container contenedor) {
		this.contenedor = contenedor;
	}
	
}