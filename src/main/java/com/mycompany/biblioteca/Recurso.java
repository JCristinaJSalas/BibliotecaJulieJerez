/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author user
 */
public class Recurso {
    //atributos
    private int id;
    private String titulo;
    private boolean disponible;
      private static int contador;
    
    //constructor

    public Recurso( String titulo, boolean disponible) {
        
        this.id = ++contador;
        this.titulo = titulo;
        this.disponible = disponible;
    }
    
    //metodos

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
  
    
    //toString

    @Override
    public String toString() {
        return  "El id " + id + ", del recurso: " + titulo + ", disponiblilidad: " + disponible +" ";
    }
    
    
}
