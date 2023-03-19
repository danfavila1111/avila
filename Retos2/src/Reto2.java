import java.util.Scanner;

public class Reto2 {
    
    public static void main(String[] args) {
        
        Scanner lectura_avila = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de participantes: ");
        int n_participantes = lectura_avila.nextInt();
        
        // Arrays para almacenar los nombres y tiempos de los participantes
        double[] tiempos = new double[n_participantes];
        String[] nombres = new String[n_participantes];

        for (int contador = 0; contador < n_participantes; contador++) {
            System.out.println("Ingrese el nombre del participante " + (contador+1) + ": ");
            nombres[contador] = lectura_avila.next();
            System.out.println("Ingrese el tiempo del participante " + (contador+1) + ": ");
            tiempos[contador] = lectura_avila.nextDouble();
        }
        
        // Variables para almacenar los mejores tiempos
        double mejor_tiempo = 1000;
        double segundo_mejor_tiempo = 1000;
        double tercer_mejor_tiempo = 1000;
        String mejor_nombre = "";
        String segundo_mejor_nombre = "";
        String tercer_mejor_nombre = "";

        for (int contador = 0; contador < n_participantes; contador++) {
            if (tiempos[contador] < mejor_tiempo) {                 //esta estructura if - else hace que el menor tiempo ingresado 
                tercer_mejor_tiempo = segundo_mejor_tiempo;         //se almacene en cada variable indivivual para los 3 participantes
                tercer_mejor_nombre = segundo_mejor_nombre;         //que se van a imprimir (3 mejores) organizandolos 
                segundo_mejor_tiempo = mejor_tiempo;                //de menor a mayor.
                segundo_mejor_nombre = mejor_nombre;
                mejor_tiempo = tiempos[contador];
                mejor_nombre = nombres[contador];
            } else if (tiempos[contador] < segundo_mejor_tiempo) {
                tercer_mejor_tiempo = segundo_mejor_tiempo;
                tercer_mejor_nombre = segundo_mejor_nombre;
                segundo_mejor_tiempo = tiempos[contador];
                segundo_mejor_nombre = nombres[contador];
            } else if (tiempos[contador] < tercer_mejor_tiempo) {
                tercer_mejor_tiempo = tiempos[contador];
                tercer_mejor_nombre = nombres[contador];
            }
        }
        
        System.out.println("Los tres mejores tiempos son:");
        System.out.println("1. " + mejor_nombre + ": " + mejor_tiempo);
        System.out.println("2. " + segundo_mejor_nombre + ": " + segundo_mejor_tiempo);
        System.out.println("3. " + tercer_mejor_nombre + ": " + tercer_mejor_tiempo);
        lectura_avila.close();
    }
    
}
