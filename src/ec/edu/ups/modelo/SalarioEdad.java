/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.modelo;

/**
 *
 * @author USER
 */
public class SalarioEdad {
 private int edad;
    private int repeticiones;
    private double sumatoria;

    public SalarioEdad() {
        repeticiones = 1;
        sumatoria = 0;
    }

    public double getSumatoria() {
        return sumatoria;
    }

    public void setSumatoria(double sumatoria) {
        this.sumatoria = sumatoria;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRepeticiones() {
        return repeticiones;
    }

    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }
    
    public double obtenerPromedio(){
        return sumatoria / repeticiones;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.edad;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SalarioEdad other = (SalarioEdad) obj;
        if (this.edad != other.edad) {
            return false;
        }
        sumatoria += other.getSumatoria();
        repeticiones++;
        return true;
    }
       
}
