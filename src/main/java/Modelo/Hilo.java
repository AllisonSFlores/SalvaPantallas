/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.Thread.sleep;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author Allison
 */
public class Hilo implements Runnable{
    JLabel label;
    int width;
    int height;
    public Hilo (JLabel plabel,int px, int py){
        label = plabel;
        width = px;
        height = py;
        
        System.out.println("posicion del label "+label.getBounds().x+"x"+label.getBounds().y);
        System.out.println(width+"x"+height);
    }
    @Override
    public void run() {
        while(true){
            if (label.getX() == 0 || label.getY() == 0){
                int j = (int) Math.floor(Math.random()*2);
                System.out.println("j>"+j);
                if (j%2==0){
                    j = (int) Math.floor(Math.random()*(height-265));
                    System.out.println("moviendo a "+j);
                    while(label.getX()!= width-269||label.getY()!= j){
                        if((label.getX()==width-269)==false){
                            label.setLocation(label.getX()+1,label.getY());
                        }
                        if((label.getY()==j)==false){
                            if(label.getY()<j){
                           label.setLocation( label.getX(),label.getY()+1);}
                            else{
                                label.setLocation( label.getX(),label.getY()-1);
                            }
                        }
                        System.out.println("x "+label.getX()+" y "+label.getY());
                        try {
                            sleep(15);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                        
                }
                
                
                else{
                    j = (int) Math.floor(Math.random()*(width-269));
                    System.out.println("moviendo a "+j);
                    while(label.getY() != height-265 ||label.getX()!= j){
                         if ((label.getX()==j)==false){
                             if(label.getX()<j){
                                label.setLocation( label.getX()+1,label.getY());}
                            else{
                                label.setLocation( label.getX()-1,label.getY());
                            }
                             
                         }
                         if((label.getY()==height-265)==false)
                            label.setLocation( label.getX(), label.getY()+1);
                        try {
                            System.out.println("x "+label.getX()+" y "+label.getY());
                            sleep(15);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                         }
                    try {
                            label.setLocation( label.getX()+1, label.getY());
                            System.out.println("x "+label.getX()+" y "+label.getY());
                            sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }       
                }
    
        System.out.println("MITADDDDDDDDDDDDDDDDDDDDDDDDDDDDDD");
        if(label.getX() == width-269 || label.getY() == height-265){
            System.out.println("HOLAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
                int j = (int) Math.floor(Math.random()*2);
                System.out.println("j>"+j);
                if (j%2==0){
                    j = (int) Math.floor(Math.random()*(height-265));
                    System.out.println("moviendo a "+j);
                    while(label.getX()!= 0||label.getY()!= j){
                        if((label.getX()==0)==false){
                            label.setLocation(label.getX()-1,label.getY());
                        }
                        if((label.getY()==j)==false){
                            if(label.getY()>j){
                               label.setLocation( label.getX(),label.getY()-1);
                            }
                            else{
                                label.setLocation( label.getX(),label.getY()+1);
                            }
                        }
                        System.out.println("x "+label.getX()+" y "+label.getY());
                        try {
                            sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        }
                }
                
                else{
                    j = (int) Math.floor(Math.random()*(width-269));
                    System.out.println("moviendo a "+j);
                    while(label.getY() != 0 ||label.getX()!= j){
                         if ((label.getX()==j)==false){
                             if(label.getX()>j){
                               label.setLocation( label.getX()-1,label.getY());
                            }
                            else{
                                label.setLocation( label.getX()+1,label.getY());
                            }
                         }
                         if((label.getY()==0)==false)
                             
                            label.setLocation( label.getX(), label.getY()-1);
                        try {
                            System.out.println("x "+label.getX()+" y "+label.getY());
                            sleep(10);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
        }
        else{
            int j = (int) Math.floor(Math.random()*4);
            try {
            switch(j){
                case 0:
                    while(label.getX() != 0){
                        label.setLocation(label.getX()-1,label.getY());
                        sleep(10);
                    }
                    break;
                case 1:
                    while(label.getY() != 0){
                        label.setLocation(label.getX(),label.getY()-1);
                        sleep(10);
                    }
                    break;
                case 2:
                    while(label.getX() != width-269){
                        label.setLocation(label.getX()+1,label.getY());
                        sleep(10);
                    }
                    break;
                case 3:
                    while(label.getY() != height-265){
                        label.setLocation(label.getX(),label.getY()+1);
                        sleep(10);
                    }
                    break;
            }
            } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
        }
    }
    }
}
