
package lab3p2_wilmer_12211100;

import java.util.ArrayList;

public class CCombustible_Fases extends Cohetes {
    protected int Fases;
    protected int Motores;
    protected double Altura;

    public CCombustible_Fases(double pesosop, String Nombre, int Serie, int Potencia, double Velocidad) {
        super(pesosop, Nombre, Serie, Potencia, Velocidad);
    }
    
    

    public CCombustible_Fases(int Fases, int Motores, double Altura, double pesosop, String Nombre, int Serie, int Potencia, double Velocidad) {
        super(pesosop, Nombre, Serie, Potencia, Velocidad);
        this.Fases = Fases;
        this.Motores = Motores;
        this.Altura = Altura;
    }

    public int getFases() {
        return Fases;
    }

    public void setFases(int Fases) {
        this.Fases = Fases;
    }

    public int getMotores() {
        return Motores;
    }

    public void setMotores(int Motores) {
        this.Motores = Motores;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    @Override
    public String toString() {
        return "CCombustible_Fases{" + "Fases=" + Fases + ", Motores=" + Motores + ", Altura=" + Altura + '}';
    }
    
    
    


    
    

}
