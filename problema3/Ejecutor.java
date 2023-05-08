/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.problema2.problema3;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        Fabricante fabricante1 = new Fabricante("Toyota", "Tokio");
        Automotor automotor1 = new Automotor("1234567890", 2018, 15000.00);
        automotor1.setFabricante(fabricante1);
        automotor1.calcularValorMatric();

        Fabricante fabricante2 = new Fabricante("Ford", "Detroit");
        Automotor automotor2 = new Automotor("0987654321", 2015, 12000.00);
        automotor2.setFabricante(fabricante2);
        automotor2.calcularValorMatric();

        System.out.println("Información del primer automotor:");
        System.out.println(automotor1.toString());
        System.out.println("\nInformación del segundo automotor:");
        System.out.println(automotor2.toString());
    }
}