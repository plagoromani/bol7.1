package bol7.pkg1;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Programa {
    public int pedirNumero(){
    return (Integer.parseInt(JOptionPane.showInputDialog("teclea numero")));
    }
    public void compararNumero(int num){
        if (num>=0){
        System.out.println("numero" +num+ "es positivo");
    }
        else{ 
        System.out.println("numero negativo");
                }
    }  
    }
