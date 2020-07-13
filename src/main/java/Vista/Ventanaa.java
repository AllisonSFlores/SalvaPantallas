/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controladora;
import Controlador.Mouse;
import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Allison
 */
public class Ventanaa extends JFrame{
    private final Dimension dimension;
    private JLabel fondo;
 
    public Ventanaa(){
        ImageIcon imagen = new ImageIcon("shenron.jpg");
        fondo =new JLabel();
        dimension=super.getToolkit().getScreenSize();   //tomar tamannio de la pantalla
        fondo.setBounds(0, 0, dimension.width, dimension.height);
        fondo.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(dimension.width, dimension.height, Image.SCALE_SMOOTH)));
        fondo.setVisible(true);
        this.add(fondo);
        super.setSize(dimension);
        super.setUndecorated(true);
        super.setVisible(true);
        addMouseListener(new Mouse(this)); 
        paint(this.getGraphics());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    public JLabel getFondo(){
        return fondo;
    }
    public Dimension getDimension(){
        return dimension;
    }
    public static void main(String wil[]){
        Controladora a = new Controladora(new Ventanaa());
    }
}
