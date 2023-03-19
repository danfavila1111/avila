import java.util.Scanner;
import java.util.Random;

public class Reto6 {
    public static void main(String[] args) {
        Scanner lectura_avila = new Scanner(System.in);
        Random random = new Random();
        int contador;
        int vidas=3;
        System.out.print("Usted tiene " + vidas + " vidas");
        System.out.println();
        System.out.print("Ingrese la cantidad a apostar: ");
        int cantidad_inicial = lectura_avila.nextInt();
        int cantidad_acumulada = 0;
        boolean juego = true;  // remplazo de contaodr para hacer que el ciclo sea infinito.
        while (juego) {
            vidas = 3;
            cantidad_acumulada = 0;
            for(contador =0; vidas > 0; contador ++){
                System.out.print("¿Cual cara de la moneda desea escoger? (0 para cara, 1 para sello): ");
                int cara_escogida = lectura_avila.nextInt();
                int resultado = random.nextInt(2);
                if (cara_escogida == resultado) {
                    System.out.println("Usted ganó ");
                    cantidad_acumulada += cantidad_inicial ;
                    System.out.println("Monto actual: " + (cantidad_acumulada + cantidad_inicial));
                } else {
                    System.out.println("Usted perdió, le quedan " + (vidas-1) + " vidas");
                    cantidad_acumulada -= cantidad_inicial;
                    System.out.println("Monto actual: " + (cantidad_acumulada + cantidad_inicial));
                    vidas--;
                }
            }
            System.out.println("Usted jugó " + contador + " veces y su acumulado total es:" + (cantidad_acumulada + cantidad_inicial));
            System.out.println("¿Desea volver a jugar? (presione 1 para si o 2 para no)");
            int respuesta = lectura_avila.nextInt();
            if (respuesta == 2) {
                juego = false; // hacer que termine el ciclo 
            }
        }
        lectura_avila.close();
    }
}
