
package lab3p2_wilmer_12211100;

public class Rocosos extends Planetas{
   protected double Densidad;
   protected boolean Vida;

    public Rocosos(String Nombre, double Masa, double Radio, double Temperatura, double VelocidadEsc) {
        super(Nombre, Masa, Radio, Temperatura, VelocidadEsc);
    }

    public Rocosos(double Densidad, boolean Vida, String Nombre, double Masa, double Radio, double Temperatura, double VelocidadEsc) {
        super(Nombre, Masa, Radio, Temperatura, VelocidadEsc);
        this.Densidad = Densidad;
        this.Vida = Vida;
    }

    public double getDensidad() {
        return Densidad;
    }

    public void setDensidad(double Densidad) {
        this.Densidad = Densidad;
    }

    public boolean isVida() {
        return Vida;
    }

    public void setVida(boolean Vida) {
        this.Vida = Vida;
    }

    @Override
    public String toString() {
        return super.toString() + "Rocosos{" + "Densidad=" + Densidad + ", Vida=" + Vida + '}';
    }
    
    
}
