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
    public static void crearLabel(int x, int y){
        JLabel label = new JLabel(imagen());
        label.setBounds(x, y,269,265);
        //ventana.add(label);
        Hilo hilopropio = new Hilo(label,ventana.getDimension().width,ventana.getDimension().height);
        Thread hilo = new Thread(hilopropio);
        hilo.start();
    }
    public static  ImageIcon imagen(){
        System.out.println("imagen");
        //ImageIcon imagen = new ImageIcon("shenron.jpg");
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
