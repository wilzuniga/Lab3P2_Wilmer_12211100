
package lab3p2_wilmer_12211100;

import java.util.ArrayList;

public class Cohetes {
    protected double Pesosop;
    protected String Nombre;
    protected int Serie;
    protected int Potencia;
    protected double Velocidad;
    protected ArrayList <Personas> Personas = new ArrayList();

    public Cohetes(double pesosop, String Nombre, int Serie, int Potencia, double Velocidad) {
        this.Pesosop = pesosop;
        this.Nombre = Nombre;
        this.Serie = Serie;
        this.Potencia = Potencia;
        this.Velocidad = Velocidad;
    }

    public double getPesosop() {
        return Pesosop;
    }

    public void setPesosop(double Pesosop) {
        this.Pesosop = Pesosop;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getSerie() {
        return Serie;
    }

    public void setSerie(int Serie) {
        this.Serie = Serie;
    }

    public int getPotencia() {
        return Potencia;
    }

    public void setPotencia(int Potencia) {
        this.Potencia = Potencia;
    }

    public double getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public ArrayList<Personas> getPersonas() {
        return Personas;
    }

    public void setPersonas(ArrayList<Personas> Personas) {
        this.Personas = Personas;
    }

    @Override
    public String toString() {
        return "Cohetes{" + "Pesosop=" + Pesosop + ", Nombre=" + Nombre + ", Serie=" + Serie + ", Potencia=" + Potencia + ", Velocidad=" + Velocidad + ", Personas=" + Personas + '}';
    }
    
    
    
    
}
