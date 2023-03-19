import java.util.Scanner;

public class Reto8 {

    public static void main(String[] args) {
        Scanner lectura_avila = new Scanner(System.in);

        int opcion;
        int desicion=1;

        String nombre;
        String documento;
        String documentoRegistrado = "";

        do {
            System.out.print("Ingrese el nombre del estudiante: ");
            nombre = lectura_avila.nextLine();

            System.out.print("Ingrese el número de documento del estudiante: ");
            documento = lectura_avila.nextLine();
            

            // verificación de si el documento ya ha sido registrado
            if (documento.equals(documentoRegistrado)) {
                System.out.println("El número de documento ya ha sido registrado. Intente nuevamente.");
                continue; // inicia denuevo el ciclo
            }

            // registrar el número de documento
            documentoRegistrado = documento;    

            int auxiliosAsignados = 0;

            while (auxiliosAsignados < 1) {
                System.out.println("Seleccione el tipo de auxilio que desea asignar al estudiante:");
                System.out.println("1. Auxilio de alimentación");
                System.out.println("2. Apoyo de sostenimiento");
                System.out.println("3. Auxilio de transporte");
                System.out.print("Opción: ");
                opcion = lectura_avila.nextInt();
                System.out.println();// salto de la línea para separar la opcion elegida
                

                switch (opcion) {
                    case 1:
                        if (auxiliosAsignados == 0) {
                            auxiliosAsignados++;
                            System.out.println("Se ha asignado el auxilio de alimentación al estudiante " + nombre + " con numero de documento " + documentoRegistrado);
                        } else {
                            System.out.println("El estudiante " + nombre + " con numero de documento " + documentoRegistrado +  " ya tiene asignado un auxilio");
                        }
                        break;
                    case 2:
                        if (auxiliosAsignados == 0) {
                            auxiliosAsignados++;
                            System.out.println("Se ha asignado el apoyo de sostenimiento al estudiante " + nombre + " con numero de documento " + documentoRegistrado);
                        } else {
                            System.out.println("El estudiante " + nombre + " con numero de documento " + documentoRegistrado +  " ya tiene asignado un auxilio");
                        }
                        break;
                    case 3:
                        if (auxiliosAsignados == 0) {
                            auxiliosAsignados++;
                            System.out.println("Se ha asignado el auxilio de transporte al estudiante " + nombre + " con numero de documento " + documentoRegistrado);
                        } else {
                            System.out.println("El estudiante " + nombre + " con numero de documento " + documentoRegistrado + " ya tiene asignado un auxilio");
                        }
                        break;
                        default:
                        System.out.println("Esta opción no existe");
                        break;
                }
            }

            System.out.print("¿Desea registrar otro estudiante? (presione 1 para si o 2 para no): ");
            desicion = lectura_avila.nextInt();
            System.out.println(); // salto de la línea para separar los registros

        } while (desicion == 1);

        lectura_avila.close();
    }

}

