/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionsita;

import java.io.EOFException;
import javax.swing.JOptionPane;

/**
 *
 * @author perez
 */
public class propia {
    public static void main(String[] args) {
        int a=2;
        try{
            debitarCuenta(a);
        }
        catch(EOFException e){
            System.out.println("No c");
        }
    }
    static boolean debitarCuenta (int valor) throws EOFException {
        int balance=1;
        int sobregiro=2;
        int sobrecanje=3;
        if (balance+sobregiro+sobrecanje < valor){
            throw new EOFException();
        }
        return false;
    }    
}
