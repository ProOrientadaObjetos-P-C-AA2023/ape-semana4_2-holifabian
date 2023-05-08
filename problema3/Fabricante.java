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
public class Fabricante {
    private String nombre;
    private String ciudadOrigen;
    public Fabricante(String nombre, String ciudadOrigen) {
        this.nombre = nombre;
        this.ciudadOrigen = ciudadOrigen;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }
    public String toString(){
        return String.format("Nombre del Fabricante:%s"
                +"\nCiudad de Origen:%s"
                , getNombre()
                ,getCiudadOrigen());
    }
}
