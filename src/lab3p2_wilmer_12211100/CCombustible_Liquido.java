
package lab3p2_wilmer_12211100;

public class CCombustible_Liquido extends Cohetes{
    protected int LitrosComb;
    
    public CCombustible_Liquido(double pesosop, String Nombre, int Serie, int Potencia, double Velocidad) {
        super(pesosop, Nombre, Serie, Potencia, Velocidad);
    }

    public CCombustible_Liquido(int LitrosComb, double pesosop, String Nombre, int Serie, int Potencia, double Velocidad) {
        super(pesosop, Nombre, Serie, Potencia, Velocidad);
        this.LitrosComb = LitrosComb;
    }

    public int getLitrosComb() {
        return LitrosComb;
    }

    public void setLitrosComb(int LitrosComb) {
        this.LitrosComb = LitrosComb;
    }

    @Override
    public String toString() {
        return "CCombustible_Liquido{" + "LitrosComb=" + LitrosComb + '}';
    }
    
    
}
