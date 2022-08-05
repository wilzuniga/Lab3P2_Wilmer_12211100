package lab3p2_wilmer_12211100;

import java.util.Scanner;
import java.util.ArrayList;

public class Lab3P2_Wilmer_12211100 {

    static Scanner lea = new Scanner(System.in);
    static double G = Math.pow(6.67 * 10, -11);

    public static void main(String[] args) {
        try {
            ArrayList<Planetas> Planets = new ArrayList();
            ArrayList<Cohetes> Cohetes = new ArrayList();

            Planets.add(new Gaseoso(50.2, 3, "Omicron", 2800.2 , 5800, 102, 200));
            Planets.get(0).getLunas().add(new Lunas("BLA BLA", 18));
            
            Planets.add(new Gaseoso(50.2, 3, "Delta", 2600.2, 50000, 160, 1000));
            Planets.get(1).getLunas().add(new Lunas("Virgilio", 118));
            
            Planets.add(new Gaseoso(50.2, 3, "Aldo", 2800.2, 5900, 180, 100));
            Planets.get(2).getLunas().add(new Lunas("Dante", 918));
            
            System.out.println(Planets.get(1));
            
            boolean opcioncitita = false;

            while (opcioncitita == true) {
                System.out.println("---------------------------------------");
                System.out.println("0 - Salir");
                System.out.println("1 - Crear Cohete");
                System.out.println("2 - Crear Planeta");
                System.out.println("3 - Editar Cohete");//Personas
                System.out.println("4 - Editar Planeta");//Lunas
                System.out.println("5 - Listar  Cohete");
                System.out.println("6 - Probar Cohete");
                System.out.println("---------------------------------------");
                System.out.println("Ingrese la opcion que desea: ");
                lea = new Scanner(System.in);
                int opcion = lea.nextInt();
                System.out.println("");

                switch (opcion) {
                    case 1:{
                        System.out.println("---------------------------------------");
                        System.out.println("1 - Crear Cohete");
                        System.out.println("2 - Crear Planeta");
                        System.out.println("3 - Editar Cohete");//Personas
                    }break;
                }

            }
        } catch (Exception e) {
            System.out.println("Algo salio terriblemente mal, todos murieron.");
        }
    }

}
