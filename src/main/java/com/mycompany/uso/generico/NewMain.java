/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.uso.generico;

/**
 *
 * @author soporte
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //crea una referencia Gen para Integers
        Gen<Integer> iOb;
        iOb = new Gen<>(28);
        iOb.mostrarTipo();
        
        int v = iOb.getOb();
        System.out.println("Valor: " + v);
        System.out.println();
        
        //Crear un objeto Gen para Strings
        Gen<String> strObj;
        strObj = new Gen<>("prueba de genericos");
        strObj.mostrarTipo();
        String str = strObj.getOb();
        System.out.println("Valor: " + str);
        
    }
    
}
