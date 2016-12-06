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

public class ModeloEmpresas extends Thread {

	

	public int nume;
	
	public  int numero(int num){
		
		   return nume = num;
		

	}
@Override
public void run() {	
Random al=new Random();
al.nextInt(6);
String []direcciones={"s.a de c.v","c.v de s.a","a.f de l.c","m.e de a.g","v.r de c.z","cha de ino"};
String []empresas={"Coca Cola","Pepsi","Bimbo","Jumex","Costeña","Sabritas"};

File archivo = new File("Empresas.txt");
//directorio.mkdir();

try {
	FileWriter escribirArchivo = new FileWriter(archivo);
	PrintWriter imprimirArchivo = new PrintWriter(escribirArchivo);
	for (int b=0; b<nume; b++){
		imprimirArchivo.printf("('%s%s%s'); \n",empresas[al.nextInt(6)],",",direcciones[al.nextInt(6)]);
		
	}
	
	imprimirArchivo.close();
	escribirArchivo.close();
	System.out.printf("Archivo %s se creo correctamente",archivo.getName());
	
	
	
	
} catch (IOException e) {
	System.out.printf("error al crear el archivo %s",e.getMessage());
	e.printStackTrace();
}
	}


public int getNume() {
	return nume;
}
public void setNume(int nume) {
	this.nume = nume;
}

}
