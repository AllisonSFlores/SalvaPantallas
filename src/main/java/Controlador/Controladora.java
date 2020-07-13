/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Hilo;
import Vista.Ventanaa;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author Allison
 */
public class  Controladora {
    public static Ventanaa ventana;
    private static int cant;
    public Controladora(Ventanaa a){
        ventana = a;
        cant=1;
    }
    /**
     * crea el label y se lo pasa al hilo
     * @param x
     * @param y 
     */
    public static void crearLabel(int x, int y){
        JLabel label = new JLabel(imagen());
        label.setBounds(x, y,269,265);
        ventana.getFondo().add(label);
        creaHilo(label);
        
    }
    /**
     * crea y emmpieza el hilo con el label que recibe
     * @param label 
     */
    private static void creaHilo(JLabel label){
        Hilo hilopropio = new Hilo(label,ventana.getDimension().width,ventana.getDimension().height);
        Thread hilo = new Thread(hilopropio);
        hilo.start();
    }
    /**
     * lleva el orden de las imagenes 
     * @return 
     */
    public static  ImageIcon imagen(){
        ImageIcon imagen = new ImageIcon("esfera"+Integer.toString(cant)+".png");
        if (cant == 7){
            cant=1;
        }
        else{
            cant++;
        }
        return imagen;
    }
}
