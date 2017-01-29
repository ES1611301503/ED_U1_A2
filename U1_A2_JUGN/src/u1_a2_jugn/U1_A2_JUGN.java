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

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class U1_A2_JUGN {
    private int i,n;
    private String Print,Valor;
    /**
     * Metodo pila
     */
    public void Pila(){
        int num[]=new int [0];
        int num_tem[]=new int[0];
        String opcion;
        int dato;
        int elemento1 = 0, elemento2 = 0;
        do {
            opcion=JOptionPane.showInputDialog ("Menu Pila\n 1. Apilar \n 2. Desapilar\n 3. Top\n 4.Mostrar\n 5. Salir");
            dato=Integer.parseInt (opcion);
            switch(dato){
                case 1:
                    /**
                     * Se agrega un elemento a la pila.(push)
                     */
                    if(num.length==0){
                        num=new int[1];
                        num[0]=Integer.parseInt(JOptionPane.showInputDialog ("Ingrese el valor " ));
                    }
                    else if(num.length>0){
                        num_tem=new int [num.length+1];
                        for(int i=0;i<=(num.length-1);i++){
                            num_tem[i]=num[i];
                        }
                        num_tem[num_tem.length-1]=Integer.parseInt(JOptionPane.showInputDialog (null,"ingrese el valor " ));
                        num=new int [num_tem.length];
                        for(int i=0;i<=(num_tem.length-1);i++){
                            num[i]=num_tem[i];
                        }
                    } /**
                     * Fin else
                     */
                    break;
                    /**
                     * fin caso 1
                     */
                case 2:
                   if (num.length >= 1) {
                       Print= "Numero de Registros " + num.length + "\n\n";
                       for (i = 0; i <= (num.length - 1); i++) {
                           Print = Print + "Posición " + (i + 1) + ": " + num[i] + "\n";
                       }
                       Valor = JOptionPane.showInputDialog(null, "Cual es la posición del Registro que deseaModificar. " + Print, "Modificar valor de la pila", JOptionPane.QUESTION_MESSAGE);
                       if (Integer.parseInt(Valor) <= num.length) {
                           n = Integer.parseInt(Valor);
                           Valor = JOptionPane.showInputDialog(null, "Nuevo Valor de la Posición: " + n, "Modificar valor de la pila", JOptionPane.QUESTION_MESSAGE);
                           num[n - 1] = Integer.parseInt(Valor);
                           Print = "Numero de Registros " + num.length + "\n\n";
                           for (i = 0; i <= (num.length - 1); i++) {
                               Print= Print + "Posición " + (i + 1) + ": " + num[i] + "\n";
                           }
                           JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente! " +Print,"Moficicar valor de la pila", JOptionPane.INFORMATION_MESSAGE);
                       } else {
                           JOptionPane.showMessageDialog(null, "La Posición Seleccionada No existe en este vector!.", "Modificar valor de la pila", JOptionPane.ERROR_MESSAGE);
                       }
                   } else {
                       JOptionPane.showMessageDialog(null, "No hay Registros para Modificar.", "Modificar valor de la pila", JOptionPane.ERROR_MESSAGE);
                   }
                   break;
                   
                case 3:
                    if (num.length <= 0) if (num.length != 1) {
                        JOptionPane.showMessageDialog(null, "No hay Registros para Eliminar.", "Eliminar valor de la pila", JOptionPane.ERROR_MESSAGE);
                    } else {
                        num = new int[0];
                        num_tem = new int[0];
                        JOptionPane.showMessageDialog(null, "El Arreglo se encuentra Vacio. ", "Eliminar valor de la pila", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        Print= "Numero de Registros " + num.length + "\n\n";
                        for (i = 0; i <= (num.length - 1); i++) {
                            Print = Print + "Posición " + (i + 1) + " : " + num[i] + "\n";
                        }
                        Valor = JOptionPane.showInputDialog(null, "Cual es la posición del Registro que desea Eliminar. " + Print, "Eliminar datos de la pila", JOptionPane.QUESTION_MESSAGE);
                        elemento1 = Integer.parseInt(Valor) - 1;
                        if (elemento1 <= num.length - 1) {
                            for (i = elemento1; i <= (num.length - 1); i++) {
                                if (i != num.length - 1) {
                                    num_tem[i] = num[i + 1];
                                }
                            }
                            num= new int[num_tem.length - 1];
                            Print = "Numero de Registros " + num.length + "\n\n";
                            for (i = 0; i <= (num.length - 1); i++) {
                                num[i] = num_tem[i];
                                Print = Print + "Posición " + (i + 1) + ": " + num[i] + "\n";
                            }
                            num_tem = new int[num.length];
                            for (i = 0; i <= (num.length - 1); i++) {
                                num_tem[i] = num[i];
                            }
                            JOptionPane.showMessageDialog(null, "valor Eliminado Exitosamente! " + Print,"Eliminar valor de la pila", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Posición Seleccionada No existe en este arreglo.", "Eliminar valor de la pila", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    break;
                    
                case 4:
                    if (num.length >= 1) {
                        for (i = 0; i <= (num.length - 1); i++) {
                            for (n = 0; n <= (num.length - 2); n++) {
                                elemento1 = num[n + 1];
                                elemento2 = num[n];
                                if (elemento1 < elemento2) {
                                    num[n] = elemento1;
                                    num[n + 1] = elemento2;
                                }
                            }
                        }
                    Print = "Numero de Registros " + num.length + "\n\n";
                    for (i = 0; i <= (num.length - 1); i++) {
                        Print = Print + "Posición " + (i + 1) + ": " + num[i] + "\n";
                    }
                    JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos de la pil",JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos de la pila", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                    
                case 5:
                    System.exit (0);
                    break;
            }
            /**
             * Fin swic
             */
        } while(Integer.parseInt (opcion)!=6);
    } /**
     * Fin metodo
     */
    /**
     * Metodo cola
     */
    public void Cola() {
        double dato[]=new double [0];
        double dato_t[]=new double [0];
        String opcion;
        int dat;
        double elemen1 = 0, elemen2 = 0;
        do {
            opcion=JOptionPane.showInputDialog ("Menu Cola\n 1. Altas \n 2. Modificar\n 3. Eliminar\n 4. Mostrar\n 5. Salir");
            dat=Integer.parseInt (opcion);
            switch(dat) {
                case 1:
                    if(dato.length==0) {
                        dato=new double [1];
                        dato[0]=Integer.parseInt (JOptionPane.showInputDialog ("Ingrese el valor " ));
                    }
                    else if(dato.length>0){
                        dato_t=new double [dato.length+1];
                        for(int i=0;i<=(dato.length-1);i++) {
                            dato_t[i]=dato[i];
                        }
                        dato_t[dato_t.length-1]=Integer.parseInt (JOptionPane.showInputDialog(null,"ingrese el valor " ));
                        dato=new double [dato_t.length];
                        for(int i=0;i<=(dato_t.length-1);i++) {
                            dato[i]=dato_t[i];
                        }
                    }
                    /**
                    * Fin else
                    */
                    break;
                case 2:
                    if (dato.length >= 1) {
                        Print= "Numero de Registros " + dato.length + "\n\n";
                        for (i = 0; i <= (dato.length - 1); i++) {
                            Print = Print + "Posición " + (i + 1) + ": " + dato[i] + "\n";
                        }
                        Valor = JOptionPane.showInputDialog(null, "Cual es la posición del Registro que desea Modificar. " + Print, "Modificar valor de la cola", JOptionPane.QUESTION_MESSAGE);
                        if (Integer.parseInt(Valor) <= dato.length) {
                            n = Integer.parseInt(Valor);
                            Valor = JOptionPane.showInputDialog(null, "Nuevo Valor de la Posición: " + n, "Modificar valor de la cola", JOptionPane.QUESTION_MESSAGE);
                            dato[n - 1] = Integer.parseInt(Valor);
                            Print = "Numero de Registros " + dato.length + "\n\n";
                            for (i = 0; i <= (dato.length - 1); i++) {
                                Print= Print + "Posición " + (i + 1) + ": " + dato[i] + "\n";
                            }
                            JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente! " +Print, "Moficicar valor de la cola", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Posición Seleccionada No existe en este vector!.", "Modificar valor de la cola", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros para Modificar.", "Modificar valor de la cola", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 3:
                    if (dato.length > 1) {
                        Print= "Numero de Registros " + dato.length + "\n\n";
                        for (i = 0; i <= (dato.length - 1); i++) {
                            Print = Print + "Posición " + (i + 1) + " : " + dato[i] + "\n";
                        }
                        Valor= JOptionPane.showInputDialog(null, "Cual es la posición del Registro que desea Eliminar. " + Print, "Eliminar datos de la cola", JOptionPane.QUESTION_MESSAGE);
                        elemen1 = Double.parseDouble (Valor)-1;
                        int x;
                        x=(int)elemen1;
                        if (elemen1 <= dato.length - 1) {
                            for (i = x; i <= (dato.length - 1); i++) {
                                if (i != dato.length - 1) {
                                    dato_t[i] = dato[i + 1];
                                }
                            }
                            dato= new double [dato_t.length - 1];
                            Print = "Numero de Registros " + dato.length + "\n\n";
                            for (i = 0; i <= (dato.length - 1); i++) {
                                dato[i] = dato_t[i];
                                Print = Print + "Posición " + (i + 1) + ": " + dato[i] + "\n";
                            }
                            dato_t = new double [dato.length];
                            for (i = 0; i <= (dato.length - 1); i++) {
                                dato_t[i] = dato[i];
                            }
                            JOptionPane.showMessageDialog(null, "valor Eliminado Exitosamente! " + Print, "Eliminar valor de la cola", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Posición Seleccionada No existe en este arreglo.", "Eliminar valor de la cola", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if (dato.length == 1) {
                        dato = new double [0];
                        dato_t = new double [0];
                        JOptionPane.showMessageDialog(null, "El Arreglo se encuentra Vacio. ", "Eliminar valor de la cola", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros para Eliminar.", "Eliminar valor de la cola", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 4:
                    if (dato.length >= 1) {
                        for (i = 0; i <= (dato.length - 1); i++) {
                            for (n = 0; n <= (dato.length - 2); n++) {
                                elemen1 = dato[n + 1];
                                elemen2 = dato[n];
                                if (elemen1 < elemen2) {
                                    dato[n] = elemen1;
                                    dato[n + 1] = elemen2;
                                }
                            }
                        }
                        Print = "Numero de Registros " + dato.length + "\n\n";
                        for (i = 0; i <= (dato.length - 1); i++) {
                            Print = Print + "Posición " + (i + 1) + ": " + dato[i] + "\n";
                        }
                        JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos de la cola", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos de la cola", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                case 5:
                    System.exit (0);
                    break;
            }
        }while(Integer.parseInt (opcion)!=6);
    }
    /**
     * Fin metodo
     */
    /**
     * Metodo Lista
     */
    public void Lista() {
        int elemen1=0,elemen2=0;
        int dato;
        String opcion;
        String texto[]=new String [0];
        String texto_t[]=new String [0];
        do {
            opcion=JOptionPane.showInputDialog ("Menu Lista\n 1.Ingresar \n 2. Modificar\n 3. Eliminar\n 4. Mostrar\n 5. Salir");
            dato=Integer.parseInt (opcion);
            switch(dato) {
                
                case 1:
                    if(texto.length==0) {
                        texto=new String [1];
                        texto[0]=JOptionPane.showInputDialog ("Ingrese el dato " );
                    }
                    else if(texto.length>0) {
                        texto_t=new String [texto.length+1];
                        for(int i=0;i<=(texto.length-1);i++) {
                            texto_t[i]=texto[i];
                        }
                        texto_t[texto_t.length-1]=JOptionPane.showInputDialog (null,"ingrese el dato " );
                        texto=new String [texto_t.length];
                        for(int i=0;i<=(texto_t.length-1);i++) {
                            texto[i]=texto_t[i];
                        }
                    }
                    /**
                    * fin else
                    */
                    break;
                
                case 2:
                    if (texto.length >= 1) {
                        Print= "Numero de Registros " + texto.length + "\n\n";
                        for (i = 0; i <= (texto.length - 1); i++) {
                            Print = Print + "Posición " + (i + 1) + ": " + texto[i] + "\n";
                        }
                        Valor = JOptionPane.showInputDialog(null, "Cual es la posición del Registro que desea Modificar. " + Print, "Modificar valor de la lista", JOptionPane.QUESTION_MESSAGE);
                        if (Integer.parseInt(Valor) <= texto.length) {
                            n = Integer.parseInt(Valor);
                            texto[n - 1] = JOptionPane.showInputDialog(null,"Nuevo dato de la Posición: " + n, "Modificar valor de la lista", JOptionPane.QUESTION_MESSAGE);
                            Print = "Numero de Registros " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                Print= Print + "Posición " + (i + 1) + ": " + texto[i] + "\n";
                            }
                            JOptionPane.showMessageDialog(null, "Registro Modificado Exitosamente! " +Print, "Moficicar valor de la lista", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Posición Seleccionada No existe en este vector!.", "Modificar valor de la lista", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros para Modificar.", "Modificar valor de la lista", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                
                case 3:
                    if (texto.length > 1) {
                        Print= "Numero de Registros " + texto.length + "\n\n";
                        for (i = 0; i <= (texto.length - 1); i++) {
                            Print = Print + "Posición " + (i + 1) + " : " + texto[i] + "\n";
                        }
                        Valor= JOptionPane.showInputDialog(null, "Cual es la posición del Registro que desea Eliminar. " + Print, "Eliminar datos de la lista", JOptionPane.QUESTION_MESSAGE);
                        elemen1 =Integer.parseInt (Valor)-1;
                        if (elemen1 <= texto.length - 1) {
                            for (i =elemen1; i <= (texto.length - 1); i++) {
                                if (i != texto.length - 1) {
                                    texto_t[i] = texto[i + 1];
                                }
                            }
                            texto= new String[texto_t.length - 1];
                            Print = "Numero de Registros " + texto.length + "\n\n";
                            for (i = 0; i <= (texto.length - 1); i++) {
                                texto[i] = texto_t[i];
                                Print = Print + "Posición " + (i + 1) + ": " + texto[i] + "\n";
                            }
                            texto_t = new String [texto.length];
                            for (i = 0; i <= (texto.length - 1); i++) {
                                texto_t[i] = texto[i];
                            }
                            JOptionPane.showMessageDialog(null, "dato Eliminado Exitosamente! " + Print, "Eliminar dato de la lista", JOptionPane.INFORMATION_MESSAGE);
                        } else {
                            JOptionPane.showMessageDialog(null, "La Posición Seleccionada No existe en este arreglo.", "Eliminar valor de la lista", JOptionPane.ERROR_MESSAGE);
                        }
                    } else if (texto.length == 1) {
                        texto = new String [0];
                        texto_t= new String [0];
                        JOptionPane.showMessageDialog(null, "El Arreglo se encuentra Vacio. ", "Eliminar valor de la lista", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros para Eliminar.", "Eliminar valor de la lista", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                
                case 4:
                    String elem1,elem2;
                    if (texto.length >= 1) {
                        for (i = 0; i <= (texto.length - 1); i++) {
                            for (n = 0; n <= (texto.length - 2); n++) {
                                elem1 = texto[n + 1];
                                elem2 = texto[n];
                                if (elem1.length ()< elem2.length ()) {
                                    texto[n] = elem1;
                                    texto[n + 1] = elem2;
                                }
                            }
                        }
                        Print = "Numero de Registros " + texto.length + "\n\n";
                        for (i = 0; i <= (texto.length - 1); i++) {
                            Print = Print + "Posición " + (i + 1) + ": " + texto[i] + "\n";
                        }
                        JOptionPane.showMessageDialog(null, " " + Print, "Mostrar datos de la lista", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "No hay Registros en El arreglo", "Mostrar datos de la lista", JOptionPane.ERROR_MESSAGE);
                    }
                    break;
                
                case 5:
                    System.exit (0);
                    break;
            }
            /**
             * Fin swit
             */
        }while(dato!=6);
    }
    /**
     * Fin metodo
     */
}