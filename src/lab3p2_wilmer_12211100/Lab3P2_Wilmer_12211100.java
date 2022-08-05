package lab3p2_wilmer_12211100;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class Lab3P2_Wilmer_12211100 {

    static Scanner lea = new Scanner(System.in);
    static Random r = new Random();
    static double G = Math.sqrt(6.67 * Math.pow(10, -11));

    ;

    public static void main(String[] args) {
        try {
            ArrayList<Planetas> Planets = new ArrayList();
            ArrayList<Cohetes> Cohetes = new ArrayList();

            Planets.add(new Gaseoso(50.2, 3, "Omicron", 2800.2, 5800, 102, 200));
            Planets.get(0).getLunas().add(new Lunas("BLA BLA", 18));

            Planets.add(new Gaseoso(50.2, 3, "Delta", 2600.2, 50000, 160, 1541561));
            Planets.get(1).getLunas().add(new Lunas("Virgilio", 118));

            Planets.add(new Gaseoso(50.2, 3, "Aldo", 2800.2, 5900, 180, 100));
            Planets.get(2).getLunas().add(new Lunas("Dante", 918));

            Cohetes.add(new CCombustible_Solido(15500, "Fibra de Vidrio", 123456789, "Elton J", 852, 6, 200.2));
            Cohetes.get(0).getPersonas().add(new Personas("Andre", 42, 112.0));

            Cohetes.add(new CCombustible_Solido(15900, "Metal", 85296, "David B", 822, 8, 280.2));
            Cohetes.get(1).getPersonas().add(new Personas("Josephine", 62, 112.0));

            Cohetes.add(new CCombustible_Solido(155600, "Adamantio", 7418536, "Julio V", 812, 9, 2850.2));
            Cohetes.get(2).getPersonas().add(new Personas("Nicole", 22, 212.0));

            //System.out.println(Planets.get(1));
            //System.out.println(Cohetes.get(1));
            boolean opcioncitita = true;

            while (opcioncitita == true) {
                System.out.println("---------------------------------------");
                System.out.println("0 - Salir");//
                System.out.println("1 - Crear Planeta");//
                System.out.println("2 - Crear Cohete");//
                System.out.println("3 - Editar Cohete");//Personas//
                System.out.println("4 - Editar Planeta");//Lunas
                System.out.println("5 - Listar  Cohete");
                System.out.println("6 - Probar Cohete");
                System.out.println("---------------------------------------");
                System.out.println("Ingrese la opcion que desea: ");
                lea = new Scanner(System.in);
                int opcion = lea.nextInt();
                System.out.println("");

                switch (opcion) {
                    case 0: {
                        opcioncitita = false;
                    }
                    break;

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
                                System.out.println("");
                            }
                        }
                    }
                    break;

                    case 2: {
                        System.out.println("---------------------------------------");
                        System.out.println("1 - Crear cohete de combustible solido");
                        System.out.println("2 - Crear cojete de combustible liquido");
                        System.out.println("3 - Crear cojete de combustible de fase");
                        System.out.println("---------------------------------------");
                        System.out.println("Ingrese la opcion que desea: ");
                        lea = new Scanner(System.in);
                        int cohetesopci = lea.nextInt();
                        System.out.println("");
                        switch (cohetesopci) {
                            case 1: {
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

//                                System.out.println("Ingrese la velocidad de el cohete: ");
//                                lea = new Scanner(System.in);
//                                double Presion = lea.nextDouble();
//                                System.out.println("");
                                System.out.println("Ingrese el numero de kilos de combustible de el cohete: ");
                                lea = new Scanner(System.in);
                                int KilosComb = lea.nextInt();
                                System.out.println("");

                                System.out.println("Ingrese el material de el combustible de el Cohete: ");
                                lea = new Scanner(System.in);
                                String Material = lea.nextLine();
                                System.out.println("");

                                Cohetes.add(new CCombustible_Solido(KilosComb, Material, Pesosop, Nombre, Serie, Potencia, Pesosop));
                            }
                            break;

                            case 2: {
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

                                System.out.println("Ingrese el numero de LITROS de combustible de el cohete: ");
                                lea = new Scanner(System.in);
                                int LitrosComb = lea.nextInt();
                                System.out.println("");

                                Cohetes.add(new CCombustible_Liquido(LitrosComb, Pesosop, Nombre, Serie, Potencia, Pesosop));

                            }
                            break;

                            case 3: {
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

                            }
                            break;

                            default: {
                                System.out.println("Algo salio terriblemente mal, El cohete estallo.");
                                System.out.println("Hay pedacitos de tripulates por todas partes");
                                System.out.println("");

                            }
                        }
                    }
                    break;

                    case 3: {
                        System.out.println("---------------------------------------");
                        System.out.println("1 - Crear Persona");
                        System.out.println("2 - Modificar Perdona");
                        System.out.println("---------------------------------------");
                        System.out.println("Ingrese la opcion que desea: ");
                        lea = new Scanner(System.in);
                        int cohetesopci = lea.nextInt();
                        System.out.println("");

                        switch (cohetesopci) {
                            case 1: {
                                System.out.println("ingrese el indice de la el cohete: ");
                                lea = new Scanner(System.in);
                                int ind = lea.nextInt();
                                System.out.println("");

                                if (ind > Cohetes.size()) {
                                    System.out.println("Ingrese un indice Correcto.");
                                } else {
                                    System.out.println("");
                                    System.out.println("Ingrese el nombre de el pasajero: ");
                                    lea = new Scanner(System.in);
                                    String Nombre = lea.nextLine();
                                    System.out.println("");

                                    System.out.println("Ingrese la edad de el pasajero ");
                                    lea = new Scanner(System.in);
                                    int Edad = lea.nextInt();
                                    System.out.println("");

                                    System.out.println("Ingrese el peso de el pasajero: ");
                                    lea = new Scanner(System.in);
                                    double Peso = lea.nextDouble();
                                    System.out.println("");

                                    Cohetes.get(ind).getPersonas().add(new Personas(Nombre, Edad, Peso));
                                }
                            }
                            break;

                            case 2: {
                                System.out.println("---------------------------------------");
                                System.out.println("1 - Modificar Nombre");
                                System.out.println("2 - Modificar edad");
                                System.out.println("3 - Modificar peso");
                                System.out.println("4 - Eliminar luna");

                                System.out.println("---------------------------------------");
                                System.out.println("Ingrese la opcion que desea: ");
                                lea = new Scanner(System.in);
                                int personita = lea.nextInt();
                                System.out.println("ingrese el indice de la ep cohete: ");
                                lea = new Scanner(System.in);
                                int indcoh = lea.nextInt();
                                System.out.println("");

                                System.out.println("ingrese el indice de la persona: ");
                                lea = new Scanner(System.in);
                                int ind = lea.nextInt();
                                System.out.println("");

                                if (indcoh > Cohetes.size() && ind > Cohetes.get(indcoh).getPersonas().size()) {
                                    System.out.println("Ingrese un indice Correcto.");
                                } else {
                                    System.out.println("");
                                    switch (personita) {
                                        case 1: {
                                            System.out.println("Ingrese el nombre de el pasajero: ");
                                            lea = new Scanner(System.in);
                                            String Nombre = lea.nextLine();
                                            System.out.println("");
                                            Cohetes.get(indcoh).getPersonas().get(ind).setNombre(Nombre);

                                        }
                                        break;

                                        case 2: {
                                            System.out.println("Ingrese la edad de el pasajero ");
                                            lea = new Scanner(System.in);
                                            int Edad = lea.nextInt();
                                            System.out.println("");

                                            Cohetes.get(indcoh).getPersonas().get(ind).setEdad(Edad);
                                        }
                                        break;

                                        case 3: {
                                            System.out.println("Ingrese el peso de el pasajero: ");
                                            lea = new Scanner(System.in);
                                            double Peso = lea.nextDouble();
                                            System.out.println("");
                                            Cohetes.get(indcoh).getPersonas().get(ind).setPeso(Peso);

                                        }
                                        break;

                                        case 4: {
                                            Planets.get(indcoh).getLunas().remove(ind);

                                        }
                                        break;

                                        default: {
                                            System.out.println("Algo salio mal, probablemente la persona murio.");
                                        }
                                    }
                                }

                            }
                            break;

                        }
                    }
                    break;//5000 + variable . nextInt(20000)

                    case 4: {
                        System.out.println("---------------------------------------");
                        System.out.println("1 - Crear Luna");
                        System.out.println("2 - Modificar Luna");
                        System.out.println("---------------------------------------");
                        System.out.println("Ingrese la opcion que desea: ");
                        lea = new Scanner(System.in);
                        int cohetesopci = lea.nextInt();
                        System.out.println("");

                        switch (cohetesopci) {
                            case 1: {
                                System.out.println("ingrese el indice de el planeta: ");
                                lea = new Scanner(System.in);
                                int ind = lea.nextInt();
                                System.out.println("");

                                if (ind > Planets.size()) {
                                    System.out.println("Ingrese un indice Correcto.");
                                } else {
                                    System.out.println("");
                                    System.out.println("Ingrese el nombre de la luna: ");
                                    lea = new Scanner(System.in);
                                    String Nombre = lea.nextLine();
                                    System.out.println("");

                                    System.out.println("Ingrese la cantidad de crateres de la luna ");
                                    lea = new Scanner(System.in);
                                    int Crateres = lea.nextInt();
                                    System.out.println("");

                                    Planets.get(ind).getLunas().add(new Lunas(Nombre, Crateres));
                                }
                            }
                            break;

                            case 2: {
                                System.out.println("---------------------------------------");
                                System.out.println("1 - Modificar Nombre");
                                System.out.println("2 - Modificar Crateres");
                                System.out.println("3 - Eliminar luna");
                                System.out.println("---------------------------------------");
                                System.out.println("Ingrese la opcion que desea: ");
                                lea = new Scanner(System.in);
                                int personita = lea.nextInt();
                                System.out.println("ingrese el indice de el planeta: ");
                                lea = new Scanner(System.in);
                                int indcoh = lea.nextInt();
                                System.out.println("");

                                System.out.println("ingrese el indice de la luna: ");
                                lea = new Scanner(System.in);
                                int ind = lea.nextInt();
                                System.out.println("");

                                if (indcoh > Planets.size() && ind > Planets.get(indcoh).getLunas().size()) {
                                    System.out.println("Ingrese un indice Correcto.");
                                } else {
                                    System.out.println("");
                                    switch (personita) {
                                        case 1: {
                                            System.out.println("Ingrese el nombre de la luna: ");
                                            lea = new Scanner(System.in);
                                            String Nombre = lea.nextLine();
                                            System.out.println("");
                                            Planets.get(indcoh).getLunas().get(ind).setLuna(Nombre);

                                        }
                                        break;

                                        case 2: {
                                            System.out.println("Ingrese la cantidad de crateres de la luna ");
                                            lea = new Scanner(System.in);
                                            int Crateres = lea.nextInt();
                                            System.out.println("");

                                            Planets.get(indcoh).getLunas().get(ind).setCrateres(Crateres);
                                        }
                                        break;

                                        case 3: {

                                            Cohetes.get(indcoh).getPersonas().remove(ind);

                                        }
                                        break;

                                        default: {
                                            System.out.println("Algo salio mal, probablemente el planeta estallo y murio.");
                                        }
                                    }
                                }

                            }
                            break;

                        }
                    }
                    break;

                    case 5: {
                        for (Cohetes Cohete : Cohetes) {
                            System.out.println("Cohete " + Cohetes.indexOf(Cohete));
                            System.out.println(Cohete);
                        }
                    }
                    break;

                    case 6: {
                        System.out.println("Ingrese el indice de el planeta que al que desea lanzar: ");
                        lea = new Scanner(System.in);
                        int indiceplanet = lea.nextInt();
                        System.out.println("");

                        System.out.println("---------------------------------------");
                        System.out.println("1 - Lanzar todos");
                        System.out.println("2 - Lanzar individual");
                        System.out.println("---------------------------------------");
                        System.out.println("Ingrese la opcion que desea: ");
                        lea = new Scanner(System.in);
                        int cohetesopci = lea.nextInt();
                        System.out.println("");

                        switch (cohetesopci) {
                            case 1: {
                                int coso = 5000 + r.nextInt(20000);
                                int fallo = 0;
                                int exito = 0;
                                for (Cohetes Cohete : Cohetes) {
                                    if (coso * Cohetes.get(Cohetes.indexOf(Cohete)).getPotencia() < Planets.get(indiceplanet).getVelocidadEsc()) {
                                        fallo++;
                                    } else {
                                        exito++;
                                    }

                                }
                                System.out.println("lanzamientos exitosos: " +exito );
                                System.out.println("lanzamientos fallidos: " + fallo);
                            }break;
                            
                            case 2:{
                                System.out.println("Ingrese el indice de el cohete  que desea lanzar: ");
                                lea = new Scanner(System.in);
                                int indicohet = lea.nextInt();
                                System.out.println("");
                                int coso = 5000 + r.nextInt(20000);
                                int fallo = 0;
                                int exito = 0;
                                
                                if (coso * Cohetes.get(Cohetes.indexOf(indicohet)).getPotencia() < Planets.get(indiceplanet).getVelocidadEsc()) {
                                    fallo++;
                                } else {
                                    exito++;
                                }
                                
                                System.out.println("lanzamientos exitosos: " + exito);
                                System.out.println("lanzamientos fallidos: " + fallo);
                            }break;
                            
                            default:{
                                System.out.println("Opcion incorrecta, es muy posible que el cohete estallara");
                                System.out.println("queda en su conciencia");
                            }

                        }
                    }
                    break;
                }

            }
        } catch (Exception e) {
            System.out.println("Algo salio terriblemente mal, todos murieron.");
        }
    }

}
