/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u1_a2_jugn;

/**
 *
 * @author Acer
 */

import javax.swing.*;

public class Menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        U1_A2_JUGN pcl=new U1_A2_JUGN();
        String opcion;
        int n;
        do{
            opcion=JOptionPane.showInputDialog ("Menu\n 1. Pilas\n 2. Cola\n 3. Lista\n 4. Salir");
            n=Integer.parseInt (opcion);
            switch(n){
                case 1:pcl.Pila ();break;
                case 2:pcl.Cola (); break;
                case 3:pcl.Lista ();break;
                case 4:System.exit (0);break;
            }
        }while(n!=4);}
    }