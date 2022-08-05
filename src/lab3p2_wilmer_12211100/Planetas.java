
package lab3p2_wilmer_12211100;

import java.util.ArrayList;


public class Planetas {

protected String Nombre;
    protected double  Masa;
    protected double Radio;
    protected double Temperatura;
    protected double VelocidadEsc;//
    protected ArrayList <Lunas> Lunas;

    public Planetas(String Nombre, double Masa, double Radio, double Temperatura, double VelocidadEsc) {
        this.Nombre = Nombre;
        this.Masa = Masa;
        this.Radio = Radio;
        this.Temperatura = Temperatura;
        this.VelocidadEsc = VelocidadEsc;
    }

    public Planetas() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getMasa() {
        return Masa;
    }

    public void setMasa(double Masa) {
        this.Masa = Masa;
    }

    public double getRadio() {
        return Radio;
    }

    public void setRadio(double Radio) {
        this.Radio = Radio;
    }

    public double getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(double Temperatura) {
        this.Temperatura = Temperatura;
    }

    public double getVelocidadEsc() {
        return VelocidadEsc;
    }

    public void setVelocidadEsc(double VelocidadEsc) {
        this.VelocidadEsc = VelocidadEsc;
    }

    public ArrayList<Lunas> getLunas() {
        return Lunas;
    }

    public void setLunas(ArrayList<Lunas> Lunas) {
        this.Lunas = Lunas;
    }

    @Override
    public String toString() {
        return "Planetas{" + "Nombre=" + Nombre + ", Masa=" + Masa + ", Radio=" + Radio + ", Temperatura=" + Temperatura + ", VelocidadEsc=" + VelocidadEsc + ", Lunas=" + Lunas + '}';
    }
    
    
    
}
