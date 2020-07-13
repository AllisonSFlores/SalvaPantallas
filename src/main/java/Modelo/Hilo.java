/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import static java.lang.Thread.sleep;
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
    }
    @Override
    public void run() {
        while(true){
            if (label.getX() == 0 || label.getY() == 0){
                int j = (int) Math.floor(Math.random()*2);
                if (j%2==0){
                    j = (int) Math.floor(Math.random()*(height-265));
                    moverBordeDerecho(j);
                }
                else{
                    j = (int) Math.floor(Math.random()*(width-269));
                    moverBordeInferior(j);
                }       
            }
    
            if(label.getX() == width-269 || label.getY() == height-265){
                int j = (int) Math.floor(Math.random()*2);
                if (j%2==0){
                    j = (int) Math.floor(Math.random()*(height-265));
                    moverBordeIzquierdo(j);
                }
                else{
                    j = (int) Math.floor(Math.random()*(width-269));
                    moverBordeSuperior(j);
                }
            }
            else{
                int j = (int) Math.floor(Math.random()*4);
                iniciarMovimiento(j);
            }
    }
    }
    
    
    /**
     * Mueve el JLabel a Y=0 y un X aleatorio=j
     * @param j 
     */
    private void moverBordeSuperior(int j){
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
                            sleep(7);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
    }
    /**
     * Mueve el JLabel a X=0 y un Y aleatorio=j
     * @param j 
     */
    private void moverBordeIzquierdo(int j){
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
                            sleep(7);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        }
    }
    /**
     * Mueve el JLabel al border inferior a un x aleatorio=j
     * @param j 
     */
    private void moverBordeInferior(int j){
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
                            sleep(7);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                         }
                    try {
                            label.setLocation( label.getX()+1, label.getY());
                            System.out.println("x "+label.getX()+" y "+label.getY());
                            sleep(7);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    
    }
    /**
     * mueve el JLabel hacia el borde derecho a una altura aleatoria=j
     * @param j 
     */
    private void moverBordeDerecho(int j){
                if (j%2==0){
                    j = (int) Math.floor(Math.random()*(height-265));
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
                            sleep(7);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
    }
    /**
     * Si el JLabel se encuentra en medio de la pantalla lo mueve hacia un borde aleatorio
     * @param j 
     */
    private void iniciarMovimiento(int j){
        try {
            switch(j){
                case 0:
                    while(label.getX() != 0){
                        label.setLocation(label.getX()-1,label.getY());
                        sleep(7);
                    }
                    break;
                case 1:
                    while(label.getY() != 0){
                        label.setLocation(label.getX(),label.getY()-1);
                        sleep(7);
                    }
                    break;
                case 2:
                    while(label.getX() != width-269){
                        label.setLocation(label.getX()+1,label.getY());
                        sleep(7);
                    }
                    break;
                case 3:
                    while(label.getY() != height-265){
                        label.setLocation(label.getX(),label.getY()+1);
                        sleep(7);
                    }
                    break;
            }
            } catch (InterruptedException ex) {
                            Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
                        }
    }
}
