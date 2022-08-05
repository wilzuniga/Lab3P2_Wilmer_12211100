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

            Planets.add(new Gaseoso(50.2, 3, "Omicron", 2800.2, 5800, 102, 200));
            Planets.get(0).getLunas().add(new Lunas("BLA BLA", 18));

            Planets.add(new Gaseoso(50.2, 3, "Delta", 2600.2, 50000, 160, 1000));
            Planets.get(1).getLunas().add(new Lunas("Virgilio", 118));

            Planets.add(new Gaseoso(50.2, 3, "Aldo", 2800.2, 5900, 180, 100));
            Planets.get(2).getLunas().add(new Lunas("Dante", 918));

            Cohetes.add(new CCombustible_Solido(15500, "Fibra de Vidrio", 123456789, "Elton J", 852, 6, 200.2));
            Cohetes.get(0).getPersonas().add(new Personas("Andre", 42, 112.0));

            Cohetes.add(new CCombustible_Solido(15900, "Metal", 85296, "David B", 822, 8, 280.2));
            Cohetes.get(1).getPersonas().add(new Personas("Josephine", 62, 112.0));

            Cohetes.add(new CCombustible_Solido(155600, "Adamantio", 7418536, "Julio V", 812, 9, 2850.2));
            Cohetes.get(2).getPersonas().add(new Personas("Nicole", 22, 212.0));

            System.out.println(Planets.get(1));
            System.out.println(Cohetes.get(1));


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
                    case 1: {
                        System.out.println("---------------------------------------");
                        System.out.println("1 - Crear Cohete");
                        System.out.println("2 - Crear Planeta");
                        System.out.println("3 - Editar Cohete");//Personas
                    }
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println("Algo salio terriblemente mal, todos murieron.");
        }
    }

}
