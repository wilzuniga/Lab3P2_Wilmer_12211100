
package lab3p2_wilmer_12211100;

import java.util.ArrayList;

public class Gaseoso extends Planetas {
 protected double Presion;
 protected int Anillos;

    public Gaseoso(double Presion, int Anillos, String Nombre, double Masa, double Radio, double Temperatura, double VelocidadEsc) {
        super(Nombre, Masa, Radio, Temperatura, VelocidadEsc);
        this.Presion = Presion;
        this.Anillos = Anillos;
    }

    public Gaseoso(double Presion, int Anillos) {
        this.Presion = Presion;
        this.Anillos = Anillos;
    }

   
}
