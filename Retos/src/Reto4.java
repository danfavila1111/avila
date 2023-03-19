import java.util.Scanner;
import java.util.Random;

public class Reto4 {
    public static void main(String[] args) {
        Scanner lectura_avila = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Ingrese la cantidad a apostar: ");
        int cantidad = lectura_avila.nextInt();
        int cantidad_acumulada = 0;
        System.out.print("¿Cual figura desea escojer? (0 para piedra, 1 para papel , 2 para tijera ): ");
        int figura_escogida = lectura_avila.nextInt();
        int resultado = random.nextInt(3);
        if (figura_escogida == resultado) {
            System.out.println("Usted ganó ");
            cantidad_acumulada += cantidad ;
            System.out.println("Monto actual: " + (cantidad_acumulada + cantidad));
        } else if (figura_escogida == resultado) {
            System.out.println(" Usted perdió ");
            cantidad = 0;
            System.out.println("Monto actual: " + (cantidad_acumulada + cantidad));
        }
        else {
            System.out.println("Empate, nadie gana. ");
            cantidad_acumulada = cantidad ;
            System.out.println("Monto actual: " + (cantidad_acumulada + cantidad));
        }
        
        lectura_avila.close();
    }
}
