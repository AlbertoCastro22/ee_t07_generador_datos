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
import java.util.logging.Level;
import java.util.logging.Logger;

public class ModeloCorreo extends Thread {

    private int nume;

    /**
     * metodo para que retorne un numero entero
     */
    public int numero(int num) {
        return nume = num;

    }

    @Override
    public void run() {
        // TODO Auto-generated method stub

        Random random = new Random();
        random.nextInt(6);
        String[] nombre = {"Axel", "Alejandra", "Edgar", "Luis", "Andr�s", "Andrea"};
        String[] extencion = {"@hotel.com", "@outlook.com", "@hotmail.com", "@gmail.com", "@yahoo.com.mx", "@netu.com"};

        File archivo = new File("Correos.txt");

        try {
            FileWriter escribirArchivo = new FileWriter(archivo);
            PrintWriter imprimirArchivo = new PrintWriter(escribirArchivo);
            for (int b = 0; b < getNume(); b++) {
                imprimirArchivo.printf("('%s%s%s'); \n", nombre[random.nextInt(6)], " ", extencion[random.nextInt(6)]);

            }

            imprimirArchivo.close();
            escribirArchivo.close();
            System.out.printf("Archivo %s se creo correctamente", archivo.getName());

        } catch (IOException e) {
            System.out.printf("error al crear el archivo %s", e.getMessage());
            e.printStackTrace();

        }

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
