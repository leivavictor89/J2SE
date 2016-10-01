/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2se.ar.com.educacionit.vehiculos.pruebas;

import j2se.ar.com.educacionit.base.entidades.Auto;
import j2se.ar.com.educacionit.base.entidades.Comprador;
import j2se.ar.com.educacionit.base.entidades.Vendedor;

/**
 *
 * @author educacionit
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto uno =new Auto("Ford", "EcoSport", "gris", 160, 260, 120);
        System.out.println(uno.toString());
        
        Comprador jonny = new Comprador(280000, "John", "Leiva", "34998876");
        System.out.println( jonny.toString());
        
        Vendedor juan = new Vendedor(3, "Juan", "Vendedor", "87865456");
        System.out.println(juan.toString());
        
    }
    
}
