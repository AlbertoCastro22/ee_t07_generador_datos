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
import javax.swing.SwingConstants;

import Modelo.Util;

public class VentanaMenu extends JFrame {
	private JButton btnCorreo= new JButton(Util.CORREO);
	private JButton btnDirecciones = new JButton(Util.DIRECCIONES);
	private JButton btnEmpresas = new JButton(Util.EMPRESAS);
	private JLabel lblConsulta = new JLabel(Util.MENU);
	
	private Container contenedor = getContentPane();
	
	public VentanaMenu(){
		setTitle(Util.MENU);
		setSize(350,400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		cargarControles();
	}
	private void cargarControles(){
		contenedor.setLayout(null);
		btnCorreo.setBounds(10, 50, 300, 50);
		btnDirecciones.setBounds(10, 150, 300, 50);
		btnEmpresas.setBounds(10, 250, 300, 50);
		lblConsulta.setHorizontalAlignment(SwingConstants.RIGHT);
		
		contenedor.add(btnCorreo);
		contenedor.add(btnDirecciones);
		contenedor.add(btnEmpresas);
		contenedor.add(lblConsulta);
		
	}
	
	public void listenerMenu(ActionListener listener){
		btnCorreo.addActionListener(listener);
		btnDirecciones.addActionListener(listener);
		btnEmpresas.addActionListener(listener);

	}
	public JButton getBtnCorreo() {
		return btnCorreo;
	}
	public void setBtnCorreo(JButton btnCorreo) {
            
		this.btnCorreo = btnCorreo;
                this.dispose();
                
	}
	public JButton getBtnDirecciones() {
		return btnDirecciones;
	}
	public void setBtnDirecciones(JButton btnDirecciones) {
		this.btnDirecciones = btnDirecciones;
	}
	public JButton getBtnEmpresas() {
		return btnEmpresas;
	}
	public void setBtnEmpresas(JButton btnEmpresas) {
		this.btnEmpresas = btnEmpresas;
	}
	public Container getContenedor() {
		return contenedor;
	}
	public void setContenedor(Container contenedor) {
		this.contenedor = contenedor;
	}
	public JLabel getLblConsulta() {
		return lblConsulta;
	}
	public void setLblConsulta(JLabel lblConsulta) {
		this.lblConsulta = lblConsulta;
	}
	
	
}
