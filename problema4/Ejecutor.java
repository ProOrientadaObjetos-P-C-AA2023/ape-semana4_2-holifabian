/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1.problema2.problema3.problema4;

/**
 *
 * @author SALA I
 */
public class Ejecutor {
    public static void main(String[] args) {
        Cheques cheque1 = new Cheques(999.99);
        Cliente cliente1 = new Cliente("Edisson F.", "Chamba A.", "1950001733");
        Banco banco1 = new Banco("Banco de Loja", 3);
        cheque1.setCliente(cliente1);
        cheque1.setBanco(banco1);
        cheque1.calcularComision();
        System.out.println(cheque1);
    }
    
}