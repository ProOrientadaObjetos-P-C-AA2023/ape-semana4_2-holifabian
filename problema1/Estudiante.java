/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;

/**
 *
 * @author SALA I
 */
class Estudiante{
    private String nombreEst;
    private double nota1;
    private double nota2;
    private double nota3;
    private double promedio;
    private Universidad universidad;
    public Estudiante(){}
    public Estudiante(String nombreEst, double nota1, double nota2, double nota3, Universidad universidad){
        this.nombreEst = nombreEst;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.universidad = universidad;
    }

    public String getNombreEst() {
        return nombreEst;
    }

    public void setNombreEst(String nombreEst) {
        this.nombreEst = nombreEst;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getPromedio() {
        return promedio;
    }

    public Universidad getUniversidad() {
        return universidad;
    }

    public void setUniversidad(Universidad universidad) {
        this.universidad = universidad;
    }
    

    public void calcularPromedio(double promedio) {
        this.promedio = (getNota1() + getNota2() + nota3) / 3;
    }
    public String toString(){
        return String.format("NOTAS DEL ESTUDIANTE:\n"
                +"\nNombre del estudiante:\n%s"
                +"\nNota1:%.2f"
                +"\nNota2:%.2f"
                +"\nNota3:%.2f"
                +"\nPromedio:%.2f"
                +"\n" + universidad
                ,getNombreEst()
                , getNota1()
                ,getNota2()
                ,getNota3()
                ,getPromedio()
                ,getUniversidad()
        );
    }
}
class Universidad{
    private String nombreUniv;
    private String direccion;

    public Universidad() {
    }

    public Universidad(String nombreUniv, String direccion) {
        this.nombreUniv = nombreUniv;
        this.direccion = direccion;
    }

    public void setNombreUniv(String nombreUniv) {
        this.nombreUniv = nombreUniv;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombreUniv() {
        return nombreUniv;
    }

    public String getDireccion() {
        return direccion;
    }

    @Override
    public String toString() {
        return "Universidad: " + nombreUniv + "\n"+ "Direccion: "+ direccion + '}';
    }
    
}

