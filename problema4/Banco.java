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
public class Banco {
    private String nombre;
    private int nSucur;
    public Banco(){}
    public Banco(String nombre, int nSucur) {
        this.nombre = nombre;
        this.nSucur = nSucur;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setnSucur(int nSucur) {
        this.nSucur = nSucur;
    }

    public String getNombre() {
        return nombre;
    }

    public int getnSucur() {
        return nSucur;
    }
    public String toString(){
        return String.format("Nombre del Banco:%s"
                +"\nN. Sucursales:%d"
                , getNombre()
                ,getnSucur());
    }
}