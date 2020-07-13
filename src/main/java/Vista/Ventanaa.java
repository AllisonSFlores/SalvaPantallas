/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controladora;
import Controlador.Mouse;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Allison
 */
public class Ventanaa extends JFrame{
    private final Dimension dimension;
 
    public Ventanaa(){
        JLabel fondo =new JLabel(new ImageIcon("shenron.jpg"));
        fondo.setVisible(true);
        this.add(fondo);
        dimension=super.getToolkit().getScreenSize();   //tomar tamannio de la pantalla
        super.setSize(dimension);
        super.setUndecorated(true);
        super.setVisible(true);
        addMouseListener(new Mouse(this)); 
        paint(this.getGraphics());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    public Dimension getDimension(){
        return dimension;
    }
           
            /*
    @Override
    public void paint(Graphics e){
        super.paint(e);
        Graphics2D circulo = (Graphics2D) e;
        circulo.setStroke(new BasicStroke(10));
        circulo.setPaint(Color.BLACK);
        circulo.drawOval(10, 10, 20, 20);
        
        
    }*/
    public static void main(String wil[]){
        Controladora a = new Controladora(new Ventanaa());
    }
}
