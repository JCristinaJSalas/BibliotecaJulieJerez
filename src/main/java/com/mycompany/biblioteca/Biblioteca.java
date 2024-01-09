/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.biblioteca;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author user
 */
public class Biblioteca {

    public static void main(String[] args) {

        Recurso recurso1 = new Libro("Angeles y Demonios", true, "Dan Brown");
        Recurso recurso2 = new Libro("El origen", true, "Dan Brown");
        Recurso recurso3 = new Revista("La economia Colombiana", false, 4, TipoRevista.FINANZAS);
        Set<Recurso> recursos = new HashSet<>();
        recursos.add(recurso1);
        recursos.add(recurso2);
        recursos.add(recurso3);

        Scanner sccaner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                               
                               Bienvenidos a la Biblioteca
                               ------------------------------------------
                               (1) Ver Recursos
                               (2) Agregar Recursos
                               (3) Salir
                                """);
            int opcion = Integer.parseInt(sccaner.nextLine());

            if (opcion == 1) {
                System.out.println("Recursos");
                for (Recurso valor : recursos) {
                    System.out.println(valor);
                }
            } else if (opcion == 2) {
                System.out.println("""
                                   Elige el tipo de recurso
                                   (1) Libro
                                   (2) Revista
                                   (3) Salir
                                   """);
                int opcion2 = Integer.parseInt(sccaner.nextLine());
                if (opcion2 == 1) {
                    System.out.println("""
                                       Creando Libro
                                       Ingrese el titulo:
                                       """);
                    String titulo = sccaner.nextLine();
                    System.out.println("Ingrese Autor:");
                    String autor = sccaner.nextLine();
                    Recurso recurso4 = new Libro(titulo, true, autor);
                    recursos.add(recurso4);
                }
                else if (opcion2 == 2) {
                    System.out.println("""
                                       Creando Revista
                                       Ingrese el titulo:
                                       """);
                    String titulo = sccaner.nextLine();
                    System.out.println("Numero de revista:");
                    int numRevista =  Integer.parseInt(sccaner.nextLine());
                    System.out.println("Tipo de revista:");
                    for (TipoRevista tipo : TipoRevista.values()){
                        System.out.println(tipo);
                    }
                    String tipoRevista = sccaner.nextLine().toUpperCase();
                    
                    try{
                        Recurso recurso4 = new Revista(titulo, true, numRevista, TipoRevista.valueOf(tipoRevista));
                        recursos.add(recurso4);
                        System.out.println("Revista Creada");
                    }catch(Exception e){
                        System.out.println("Ocurrio un error, intente de nuevo");
                        e.printStackTrace();
                    }
                     
                }
                
            } else if (opcion == 3) {
                System.out.println(" Saliendo");
                break;
            } else {
                break;
            }

        }

    }

}
