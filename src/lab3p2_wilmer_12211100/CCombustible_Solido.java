
package lab3p2_wilmer_12211100;

public class CCombustible_Solido extends Cohetes{
    protected int KilosComb;
    protected String Material;

    public CCombustible_Solido(double pesosop, String Nombre, int Serie, int Potencia, double Velocidad) {
        super(pesosop, Nombre, Serie, Potencia, Velocidad);
    }

    public CCombustible_Solido(int KilosComb, String Material, double pesosop, String Nombre, int Serie, int Potencia, double Velocidad) {
        super(pesosop, Nombre, Serie, Potencia, Velocidad);
        this.KilosComb = KilosComb;
        this.Material = Material;
    }

    public int getKilosComb() {
        return KilosComb;
    }

    public void setKilosComb(int KilosComb) {
        this.KilosComb = KilosComb;
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    @Override
    public String toString() {
        return super.toString() +  "CCombustible_Solido{" + "KilosComb=" + KilosComb + ", Material=" + Material + '}';
    }
    
    
    

}
