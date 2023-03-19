import java.util.Scanner;
import java.util.Random;

public class Reto3 {
    public static void main(String[] args) {
        Scanner lectura_avila = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese la cantidad a apostar: ");
        int cantidad  = lectura_avila.nextInt();
        int cantidad_acumulada = 0;
        System.out.print("¿Cual cara de la moneda desea escojer? (0 para cara, 1 para sello): ");
        int cara_escogida = lectura_avila.nextInt();
        int resultado = random.nextInt(2);
        if (cara_escogida == resultado) {
            System.out.println("Usted ganó ");
            cantidad_acumulada += cantidad ;
            System.out.println("Monto actual: " + (cantidad_acumulada + cantidad));
        } else {
            System.out.println(" Usted perdió ");
            cantidad = 0;
            System.out.println("Monto actual: " + (cantidad_acumulada + cantidad));
        }
        
        lectura_avila.close();
    }
}
