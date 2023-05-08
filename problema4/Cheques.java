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
public class Cheques {
    private Cliente cliente;
    private Banco banco;
    private double valorCheque;
    private double comision;
    public Cheques(){}
    public Cheques(double valorCheque){
        this.valorCheque = valorCheque;
    }
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public void setBanco(Banco banco){
        this.banco = banco;
    }
    public void setValorCheque(double valorCheque){
        this.valorCheque = valorCheque;
    }
    public void calcularComision(){
        this.comision = valorCheque * 0.003;
    }
    public Cliente getCliente(){
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public double getValorCheque() {
        return valorCheque;
    }

    public double getComision() {
        return comision;
    }
    public String toString(){
        return String.format("CHEQUE"
                +"\n" + cliente
                +"\n" + banco
                +"\nValor del cheque:%.2f"
                +"\nComision:%.2f"
                ,getValorCheque()
                ,getComision());
    }
}