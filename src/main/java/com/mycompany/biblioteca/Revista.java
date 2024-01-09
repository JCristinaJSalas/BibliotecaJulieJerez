/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.biblioteca;

/**
 *
 * @author user
 */
public class Revista extends Recurso {
    //atributos
    private int numRevista;
    private TipoRevista tipo;
//constructor
    public Revista( String titulo, boolean disponible,int numRevista,TipoRevista tipo) {
        super(titulo, disponible);
        this.numRevista=numRevista;
        this.tipo =tipo;
    }
    //metodos

    public int getNumRevista() {
        return numRevista;
    }

    public void setNumRevista(int numRevista) {
        this.numRevista = numRevista;
    }

    public TipoRevista getTipo() {
        return tipo;
    }

    public void setTipo(TipoRevista tipo) {
        this.tipo = tipo;
    }
    
    //toString

    @Override
    public String toString() {
         return super.toString()+ " tipo de la revista " + tipo + " con su version " + numRevista;
    }
    
}
