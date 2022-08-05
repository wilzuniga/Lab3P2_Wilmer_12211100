
package lab3p2_wilmer_12211100;

public class Personas {
    protected String Nombre;
    protected int Edad;
    protected double Peso;

    public Personas() {
    }

    
    public Personas(String Nombre, int Edad, double Peso) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Peso = Peso;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return "Personas{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Peso=" + Peso + '}';
    }
    
    
}
