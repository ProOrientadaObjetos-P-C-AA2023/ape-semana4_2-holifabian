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
public class Provincia {
    private String nombreProv;
    private int numHabit;
    public Provincia(){}
    public Provincia(String nombreProv, int numHabit){
        this.nombreProv = nombreProv;
        this.numHabit = numHabit;
    }
    public void setNombreProv(String nombreProv){
        this.nombreProv = nombreProv;
    }
    public void setNumHabit(int numHabit){
        this.numHabit = numHabit;
    }
    public String getNombreProv(){
        return nombreProv;
    }

    public int getNumHabit() {
        return numHabit;
    }
    public String toString(){
        return String.format("\nProvincia:%s"
                +"\nNumero de habitantes:%d"
                , getNombreProv()
                ,getNumHabit());
    }
}