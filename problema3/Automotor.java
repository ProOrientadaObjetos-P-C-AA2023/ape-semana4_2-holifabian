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
public class Automotor {
    private String cedulaDueno;
    private int anioFabri;
    private double valor;
    private double valorMatric;
    private Fabricante fabricante;
    public Automotor(String cedulaDueno, int anioFabri, double valor){
        this.cedulaDueno = cedulaDueno;
        this.anioFabri = anioFabri;
        this.valor = valor;
    }
    public void setCedulaDueno(String cedulaDueno){
        this.cedulaDueno = cedulaDueno;
    }
    public void setAnioFabri(int anioFabri) {
        this.anioFabri = anioFabri;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public void setFabricante(Fabricante fabricante){
        this.fabricante = fabricante;
    }
    public void calcularValorMatric(){
        this.valorMatric = (valor * 0.002) * (2023 - anioFabri);
    }

    public String getCedulaDueno() {
        return cedulaDueno;
    }
    public int getAnioFabri() {
        return anioFabri;
    }

    public double getValor() {
        return valor;
    }

    public double getValorMatric() {
        return valorMatric;
    }
    public Fabricante getFabricante(){
        return fabricante;
    }
    public String toString(){
        return String.format("CARACTERISICAS DE AUTOMOTOR:"
                +"\nCedula del Duenio:%s"
                +"\n" + fabricante
                +"\nAnio de Fabricacion:%d"
                +"\nValor de vehiculo:%.2f"
                +"\nValor de Matricula:%.2f"
                , getCedulaDueno()
                ,getAnioFabri()
                ,getValor()
                ,getValorMatric());
    }
}