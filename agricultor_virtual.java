import java.util.Scanner;
public class agricultor_virtual {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] cultivos = new String[10];
        String[] tipos = new String[10];
        int[] plantas = new int[10];
        String[] fechasSiembra = new String[10];
        int[] cosechas = new int[10];
        double[] agua = new double[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //------------------------------------------//
        //--|menu_principal_de_agricultor_virtual|--//
        //------------------------------------------//
        do {
            System.out.println("menu principal de agricultor virtual");
            System.out.println("1) Registrar cultivo");
            System.out.println("2) Editar cultivo");
            System.out.println("3) Listar cultivos");
            System.out.println("4) Buscar cultivo");
            System.out.println("5) Eliminar cultivo");
            System.out.println("6) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //-----------------------//
                //--|registrar_cultivo|--//
                //-----------------------//
                case 1:
                    int id = total + 1;
                    System.out.println("registro del cultivo");
                    System.out.println("id del cultivo a registrar: " + id);
                    System.out.print("nombre del cultivo: ");
                    cultivos[total] = entrada.nextLine();
                    System.out.print("tipo de cultivo: ");
                    tipos[total] = entrada.nextLine();
                    System.out.print("cantidad de plantas: ");
                    plantas[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("fecha de siembra: ");
                    fechasSiembra[total] = entrada.nextLine();
                    System.out.print("tiempo estimado de cosecha en dias: ");
                    cosechas[total] = entrada.nextInt();
                    System.out.print("cantidad de agua diaria en litros: ");
                    agua[total] = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.print("estado del cultivo: ");
                    estados[total] = entrada.nextLine();
                    System.out.println("Cultivo registrado correctamente.");
                    total++;
                    break;
                //--------------------//
                //--|editar_cultivo|--//
                //--------------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen cultivos registrados.");
                        break;
                    }
                    System.out.println("Datos de los cultivos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Cultivo: " + cultivos[i] + " | Tipo: " + tipos[i] + " | Plantas: " + plantas[i] + " | Siembra: " + fechasSiembra[i] + " | Cosecha: " + cosechas[i] + " dias | Agua: " + agua[i] + " litros diarios | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del cultivo: ");
                    int idBuscar = entrada.nextInt();
                    entrada.nextLine();
                    if (idBuscar >= 1 && idBuscar <= total) {
                        int posicion = idBuscar - 1;
                        System.out.println("Editar el dato del cultivo");
                        System.out.print("Nuevo nombre del cultivo: ");
                        cultivos[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tipo de cultivo: ");
                        tipos[posicion] = entrada.nextLine();
                        System.out.print("Nueva cantidad de plantas: ");
                        plantas[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("Nueva fecha de siembra: ");
                        fechasSiembra[posicion] = entrada.nextLine();
                        System.out.print("Nuevo tiempo de cosecha en dias: ");
                        cosechas[posicion] = entrada.nextInt();
                        System.out.print("Nueva cantidad de agua diaria en litros: ");
                        agua[posicion] = entrada.nextDouble();
                        entrada.nextLine();
                        System.out.print("Nuevo estado del cultivo: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Cultivo actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|listar_cultivos|--//
                //---------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen cultivos registrados.");
                    } else {
                        System.out.println("Lista de cultivos");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Cultivo: " + cultivos[i] + " | Tipo: " + tipos[i] + " | Plantas: " + plantas[i] + " | Siembra: " + fechasSiembra[i] + " | Cosecha: " + cosechas[i] + " dias | Agua: " + agua[i] + " litros diarios | Estado: " + estados[i]);
                        }
                    }
                    break;
                //--------------------//
                //--|buscar_cultivo|--//
                //--------------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen cultivos registrados.");
                        break;
                    }
                    System.out.println("busqueda de cultivo");
                    System.out.print("ingresa la id para buscar cultivo: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("Datos del cultivo encontrado:");
                        System.out.println("ID: " + idBusqueda + " | Cultivo: " + cultivos[posicion] + " | Tipo: " + tipos[posicion] + " | Plantas: " + plantas[posicion] + " | Siembra: " + fechasSiembra[posicion] + " | Cosecha: " + cosechas[posicion] + " dias | Agua: " + agua[posicion] + " litros diarios | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //----------------------//
                //--|eliminar_cultivo|--//
                //----------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen cultivos registrados.");
                        break;
                    }
                    System.out.println("Datos de los cultivos");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Cultivo: " + cultivos[i] + " | Tipo: " + tipos[i] + " | Plantas: " + plantas[i] + " | Siembra: " + fechasSiembra[i] + " | Cosecha: " + cosechas[i] + " dias | Agua: " + agua[i] + " litros diarios | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del cultivo a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            cultivos[i] = cultivos[i + 1];
                            tipos[i] = tipos[i + 1];
                            plantas[i] = plantas[i + 1];
                            fechasSiembra[i] = fechasSiembra[i + 1];
                            cosechas[i] = cosechas[i + 1];
                            agua[i] = agua[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Cultivo eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 6:
                    System.out.println("Gracias por utilizar Agricultor Virtual.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 6);
        entrada.close();
    }
}