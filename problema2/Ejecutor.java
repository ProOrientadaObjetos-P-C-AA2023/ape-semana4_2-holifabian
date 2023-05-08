/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.problema2;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        Profesores profesor1 = new Profesores("Fabian", "Galarza", 687.55, "1950001733");
        Provincia provincia1 = new Provincia("Loja", 121606);
        profesor1.calcularSueldo();
        profesor1.setProvincia(provincia1);
        System.out.println(profesor1);
    }
    
}