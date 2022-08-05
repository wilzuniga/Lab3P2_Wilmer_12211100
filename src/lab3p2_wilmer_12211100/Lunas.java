
package lab3p2_wilmer_12211100;


public class Lunas {
   protected String Luna; 
   protected int Crateres;

    public Lunas() {
    }

    public Lunas(String Luna, int Crateres) {
        this.Luna = Luna;
        this.Crateres = Crateres;
    }

    
    public String getLuna() {
        return Luna;
    }

    public void setLuna(String Luna) {
        this.Luna = Luna;
    }

    public int getCrateres() {
        return Crateres;
    }

    public void setCrateres(int Crateres) {
        this.Crateres = Crateres;
    }

    @Override
    public String toString() {
        return "Lunas{" + "Luna=" + Luna + ", Crateres=" + Crateres + '}';
    }
   
   
}
