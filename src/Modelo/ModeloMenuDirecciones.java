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
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import javax.swing.JOptionPane;
public class ModeloMenuDirecciones extends Thread{
	

	private int nume;
        
        public void run(){
            numero(nume);
        }
	
	public  int numero(int num){
	Random al=new Random();
	al.nextInt(6);
	String []calles={"Calle Venustiano Carranza ", "Calle Roble de sedro", "Calle Palma de lopez", "Calle Azucena de flores", "Calle Lirios olvidos", "Calle Fresas con crema "};
	String []call={"Colonia La Condesa del df", "Colonia Los Olivos  de ozumbilla", "Colonia Hacienda de Ojo de Agua", "Colonia Ozumbilla",
			"Colonia San Martin","Av.Flojas"};
	
	File archivo = new File("Direcciones.txt");
	
	
	try {
		FileWriter escribirArchivo = new FileWriter(archivo);
		PrintWriter imprimirArchivo = new PrintWriter(escribirArchivo);
		for (int b=0; b<num; b++){
			imprimirArchivo.printf("('%s%s%s'); \n",call[al.nextInt(6)],",",calles[al.nextInt(6)]);
			
		}
		
		imprimirArchivo.close();
		escribirArchivo.close();

		System.out.printf("Archivo creado",archivo.getName());
		
		
		
		
	} catch (IOException e) {
		System.out.printf("error al crear su archivo",e.getMessage());
		e.printStackTrace();
	}
	return nume=num;
	}

    /**
     * @return the nume
     */
    public int getNume() {
        return nume;
    }

    /**
     * @param nume the nume to set
     */
    public void setNume(int nume) {
        this.nume = nume;
    }
}
