/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcionsita;

/**
 *
 * @author perez
 */
public class Excepcionsita {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
        //formatoNumero();
        //formatoNumero1();
        //desborde();
        //aritmetico();
    }
    //excepción sin tratar
    public static void formatoNumero(){
        int numero;
        String cadena=" 1";
        numero = Integer.parseInt(cadena);
    }
    //excepción tratada
    public static void formatoNumero1(){
        int numero;
        String cadena=" 1";
        try{
            numero = Integer.parseInt(cadena);
        }
        catch(NumberFormatException ex){
            System.out.println("No es un número, es una cadena de texto."+ex.getMessage());
        }
    }
    public static void desborde(){
        int v[]= new int[3];
        for(int i =0; i<5;i++){
            v[i]=i;
        }
    }
    public static void aritmetico(){
        int numero=5, resultado;
        resultado= numero/0;
    }
}