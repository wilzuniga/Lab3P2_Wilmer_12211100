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
            
            boolean opcioncitita = true;
            
            while (opcioncitita == true) {
                System.out.println("---------------------------------------");
                System.out.println("0 - Salir");
                System.out.println("1 - Crear Planeta");
                System.out.println("2 - Crear Cohete");
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
                        System.out.println("1 - Crear planeta rocoso");
                        System.out.println("2 - Crear planeta gaseoso");
                        System.out.println("---------------------------------------");
                        System.out.println("Ingrese la opcion que desea: ");
                        lea = new Scanner(System.in);
                        int planetasopci = lea.nextInt();
                        System.out.println("");
                        
                        switch (planetasopci) {
                            case 1: {
                                System.out.println("Ingrese el nombre de el Planeta: ");
                                lea = new Scanner(System.in);
                                String Nombre = lea.nextLine();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de la masa: ");
                                lea = new Scanner(System.in);
                                double Masa = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de el radio: ");
                                lea = new Scanner(System.in);
                                double Radio = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de la temperatura: ");
                                lea = new Scanner(System.in);
                                double Temperatura = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de la Velocidad de escape: ");
                                lea = new Scanner(System.in);
                                double VelocidadEsc = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de la densidad: ");
                                lea = new Scanner(System.in);
                                double Densidad = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de la Vida (0=si/1=no): ");
                                lea = new Scanner(System.in);
                                int siono = lea.nextInt();
                                System.out.println("");
                                
                                if (siono == 0) {
                                    boolean Vida = true;
                                } else {
                                    boolean Vida = false;
                                }
                                
                                Planets.add(new Rocosos(Densidad, opcioncitita, Nombre, Masa, Radio, Temperatura, VelocidadEsc));
                            }
                            break;
                            
                            case 2: {
                                System.out.println("Ingrese el nombre de el Planeta: ");
                                lea = new Scanner(System.in);
                                String Nombre = lea.nextLine();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de la masa: ");
                                lea = new Scanner(System.in);
                                double Masa = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de el radio: ");
                                lea = new Scanner(System.in);
                                double Radio = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de la temperatura: ");
                                lea = new Scanner(System.in);
                                double Temperatura = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de la Velocidad de escape: ");
                                lea = new Scanner(System.in);
                                double VelocidadEsc = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el valor de la presion: ");
                                lea = new Scanner(System.in);
                                double Presion = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese la cantidad de anillos: ");
                                lea = new Scanner(System.in);
                                int Anillos = lea.nextInt();
                                System.out.println("");
                                
                                Planets.add(new Gaseoso(Presion, Anillos, Nombre, Masa, Radio, Temperatura, VelocidadEsc));
                                
                            }
                            break;
                            
                            default: {
                                System.out.println("Algo salio terriblemente mal, los habitantes de tu planeta murieron.");
                            }
                        }
                    }
                    break;
                    
                    case 2:{
                        System.out.println("---------------------------------------");
                        System.out.println("1 - Crear cohete de combustible solido");
                        System.out.println("2 - Crear cojete de combustible liquido");
                        System.out.println("3 - Crear cojete de combustible de fase");
                        System.out.println("---------------------------------------");
                        System.out.println("Ingrese la opcion que desea: ");
                        lea = new Scanner(System.in);
                        int cohetesopci = lea.nextInt();
                        System.out.println("");
                        switch(cohetesopci){
                            case 1:{
                                System.out.println("Ingrese el peso soportado por el cohete: ");
                                lea = new Scanner(System.in);
                                double Pesosop = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el nombre de el Cohete: ");
                                lea = new Scanner(System.in);
                                String Nombre = lea.nextLine();
                                System.out.println("");
                                
                                System.out.println("Ingrese el numero de serie de el cohete: ");
                                lea = new Scanner(System.in);
                                int Serie = lea.nextInt();
                                System.out.println("");
                                
                                System.out.println("Ingrese el indice de potencia(0-9) de el cohete: ");
                                lea = new Scanner(System.in);
                                int Potencia = lea.nextInt();
                                System.out.println("");
                                
                                System.out.println("Ingrese la velocidad de el cohete: ");
                                lea = new Scanner(System.in);
                                double Presion = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el numero de kilos de combustible de el cohete: ");
                                lea = new Scanner(System.in);
                                int KilosComb = lea.nextInt();
                                System.out.println("");
                                
                                System.out.println("Ingrese el material de el combustible de el Cohete: ");
                                lea = new Scanner(System.in);
                                String Material = lea.nextLine();
                                System.out.println("");
                                
                                Cohetes.add(new CCombustible_Solido(KilosComb, Material, Pesosop, Nombre, Serie, Potencia, Pesosop));
                            }break;
                            
                            case 2:{
                                System.out.println("Ingrese el peso soportado por el cohete: ");
                                lea = new Scanner(System.in);
                                double Pesosop = lea.nextDouble();
                                System.out.println("");

                                System.out.println("Ingrese el nombre de el Cohete: ");
                                lea = new Scanner(System.in);
                                String Nombre = lea.nextLine();
                                System.out.println("");

                                System.out.println("Ingrese el numero de serie de el cohete: ");
                                lea = new Scanner(System.in);
                                int Serie = lea.nextInt();
                                System.out.println("");

                                System.out.println("Ingrese el indice de potencia(0-9) de el cohete: ");
                                lea = new Scanner(System.in);
                                int Potencia = lea.nextInt();
                                System.out.println("");

                                System.out.println("Ingrese la velocidad de el cohete: ");
                                lea = new Scanner(System.in);
                                double Presion = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el numero de LITROS de combustible de el cohete: ");
                                lea = new Scanner(System.in);
                                int LitrosComb = lea.nextInt();
                                System.out.println("");
                                
                                Cohetes.add(new CCombustible_Liquido(LitrosComb, Pesosop, Nombre, Serie, Potencia, Pesosop));
                                
                            }break;
                            
                            case 3:{
                                System.out.println("Ingrese el peso soportado por el cohete: ");
                                lea = new Scanner(System.in);
                                double Pesosop = lea.nextDouble();
                                System.out.println("");

                                System.out.println("Ingrese el nombre de el Cohete: ");
                                lea = new Scanner(System.in);
                                String Nombre = lea.nextLine();
                                System.out.println("");

                                System.out.println("Ingrese el numero de serie de el cohete: ");
                                lea = new Scanner(System.in);
                                int Serie = lea.nextInt();
                                System.out.println("");

                                System.out.println("Ingrese el indice de potencia(0-9) de el cohete: ");
                                lea = new Scanner(System.in);
                                int Potencia = lea.nextInt();
                                System.out.println("");

                                System.out.println("Ingrese la velocidad de el cohete: ");
                                lea = new Scanner(System.in);
                                double Presion = lea.nextDouble();
                                System.out.println("");
                                
                                System.out.println("Ingrese el numero de Fases de el cohete: ");
                                lea = new Scanner(System.in);
                                int Fases = lea.nextInt();
                                System.out.println("");
                                
                                System.out.println("Ingrese el numero de motores de el cohete: ");
                                lea = new Scanner(System.in);
                                int Motores = lea.nextInt();
                                System.out.println("");
                                
                                System.out.println("Ingrese la altura de el cohete: ");
                                lea = new Scanner(System.in);
                                double Altura = lea.nextDouble();
                                System.out.println("");
                                
                                Cohetes.add(new CCombustible_Fases(Fases, Motores, Altura, Pesosop, Nombre, Serie, Potencia, Altura));

                                
                            }break;
                            
                            default:{
                                System.out.println("Algo salio terriblemente mal, El cohete estallo.");
                                System.out.println("Hay pedacitos de tripulates por todas partes");
                            }
                        }
                    }break;
                }
                
            }
        } catch (Exception e) {
            System.out.println("Algo salio terriblemente mal, todos murieron.");
        }
    }
    
}
