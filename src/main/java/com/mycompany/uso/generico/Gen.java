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

//un parametro es una variable en una definicion de metodo
//cuando se llama a un metodo los argumentos son los datos que se pasan a los parametros del metodo
//clase generica Gen
//T es un parametro de tipo que sera reemplazado por un tipo real cuando se crea un objeto de tipo Gen

public class Gen<T> {
    //Cuando una clase extiende a otra, hereda todos sus atributos y metodos
    //Object es la base de toda la jerarquia de clases de java. Si al definir una clase no se especifica la clase
    //que extiende, por default deriva de object.
    //variables miembro de la clase (atributos)
    //T es un parametro de tipo generico
    T ob; //declara un objeto de tipo T
    
    //Pase al constructor una referencia a un objeto de tipo T
    Gen(T o){
        this.ob = o;
    }
    
    //metodos de la clase
    T getOb(){
        return this.ob;
    }
    
    //Muestra el tipo de T
    void mostrarTipo(){
        System.out.println("El tipo de T es: " + ob.getClass().getName());
    }
    
    
}
