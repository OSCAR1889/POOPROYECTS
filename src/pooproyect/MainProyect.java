package poo;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainProyect {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        Proyect[] proyect;
        System.out.print("De que tamaño quieres la cartera: ");
        int tam = sc.nextInt();
        int a = 0, b = 0;
        String nom;
        proyect = new Proyect[tam];
        for (int i = 0; i < proyect.length; i++) {
            proyect[i] = new Proyect();
        }
        int opc = 104343000;
        int opc2 = 10221001;
        System.out.println("---------Menu de Opciones---------");
        while (opc != 4) {
            System.out.println("1) Agregar cliente");
            System.out.println("2) Mostrar clientes");
            System.out.println("3) Buscar cliente");
            System.out.println("4) Cerrar sistema");
            System.out.println("---------Elige una opcion---------");
            opc = sc.nextInt();
            System.out.println("");
            switch (opc) {
                case 1:
                    try {
                        if (a < tam) {
                            System.out.println("---------Ingresar Cliente---------");
                            System.out.print("CodigoCliente: ");
                            proyect[a].setCodigoCliente(sc.nextInt());
                            System.out.print("NombreCliente: ");
                            proyect[a].setNombre(bf.readLine());
                            System.out.print("ApellidoPaternoCliente: ");
                            proyect[a].setApellidoPaterno(bf.readLine());
                            System.out.print("ApellidoMaternoCliente: ");
                            proyect[a].setApellidoMaterno(bf.readLine());
                            System.out.print("TelefonoCliente: ");
                            proyect[a].setTelefono(bf.readLine());
                            System.out.print("DireccionoCliente: ");
                            proyect[a].setDireccion(bf.readLine());
                            System.out.print("EdadCliente: ");
                            proyect[a].setEdad(sc.nextInt());
                            a++;
                            System.out.println("");
                            System.out.println("---------Menu de Opciones---------");
                        } else {
                            System.out.println("---------No hay espacio--------- ");
                            System.out.println("");
                            System.out.println("---------Menu de Opciones---------");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    for (int i = 0; i < proyect.length; i++) {
                        System.out.println("---------Lista de Clientes---------");
                        System.out.println("CodigoCliente: " + proyect[i].getCodigoCliente());
                        System.out.println("Nombre: " + proyect[i].getNombre());
                        System.out.println("ApellidoPaterno: " + proyect[i].getApellidoPaterno());
                        System.out.println("ApellidoMaterno: " + proyect[i].getApellidoMaterno());
                        System.out.println("Telefono: " + proyect[i].getTelefono());
                        System.out.println("Direcciono: " + proyect[i].getDireccion());
                        System.out.println("Edad: " + proyect[i].getEdad());
                        System.out.println("");
                    }
                    break;
                case 3:
                    while (opc2 != 3) {
                        System.out.println("---------Menu de Opciones---------");
                        System.out.println("Cliente a consultar?: ");
                        System.out.println("1) Buscar por codigo ");
                        System.out.println("2) Buscar por nombre");
                        System.out.println("3) Regresar al menu anterior");
                        System.out.println("---------Elige una opcion---------");
                        opc2 = sc.nextInt();
                        switch (opc2) {
                            case 1:
                                System.out.println("Ingresar el codigo");
                                b = sc.nextInt();

                                for (int i = 0; i < proyect.length; i++) {
                                    if (b == proyect[i].getCodigoCliente()) {
                                        System.out.println("---------Clientes es: ---------");
                                        System.out.println("CodigoCliente: " + proyect[i].getCodigoCliente());
                                        System.out.println("Nombre: " + proyect[i].getNombre());
                                        System.out.println("ApellidoPaterno: " + proyect[i].getApellidoPaterno());
                                        System.out.println("ApellidoMaterno: " + proyect[i].getApellidoMaterno());
                                        System.out.println("Telefono: " + proyect[i].getTelefono());
                                        System.out.println("Direcciono: " + proyect[i].getDireccion());
                                        System.out.println("Edad: " + proyect[i].getEdad());
                                        System.out.println("");
                                    }
                                }
                                break;
                            case 2:
                                try {
                                    System.out.println("Ingresar el Nombre");
                                    nom = bf.readLine();
                                    for (int i = 0; i < proyect.length; i++) {
                                        if (nom.equals(proyect[i].getNombre())) {
                                            System.out.println("---------Clientes es: ---------");
                                            System.out.println("CodigoCliente: " + proyect[i].getCodigoCliente());
                                            System.out.println("Nombre: " + proyect[i].getNombre());
                                            System.out.println("ApellidoPaterno: " + proyect[i].getApellidoPaterno());
                                            System.out.println("ApellidoMaterno: " + proyect[i].getApellidoMaterno());
                                            System.out.println("Telefono: " + proyect[i].getTelefono());
                                            System.out.println("Direcciono: " + proyect[i].getDireccion());
                                            System.out.println("Edad: " + proyect[i].getEdad());
                                            System.out.println("");
                                        }
                                    }
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                break;
                            case 3:
                                System.out.println("");
                                System.out.println("---------Rgresar al Menu---------");
                                System.out.println("");
                                break;
                        }
                    }
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("---------Gracias---------");
            }
        }
    }

}
