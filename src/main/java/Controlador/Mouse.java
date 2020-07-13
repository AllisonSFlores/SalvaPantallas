/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Vista.Ventanaa;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author Allison
 */
public class Mouse extends MouseAdapter implements MouseListener{
    Ventanaa appWindow;

    public Mouse(Ventanaa appWindow) {
        this.appWindow = appWindow;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Controladora.crearLabel(e.getX(), e.getY());
        System.out.println("Mouse Pressed at : x:" + e.getX()
            + " y: "+e.getY());
        //this.appWindow.repaint();
    }
    
}
