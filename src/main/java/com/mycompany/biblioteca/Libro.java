/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;


/**
 *
 * @author user
 */
public class Libro extends Recurso{

    //atributos
    private String autor;
//constructor

    public Libro( String titulo, boolean disponible, String autor) {
        super(titulo, disponible);
        this.autor = autor;
    }
    //metodos
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
  //toString
    @Override
    public String toString() {
        return super.toString()+ "autor del libro " + autor;
    }


    
    

}
