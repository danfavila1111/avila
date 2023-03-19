import java.util.Scanner;

public class Reto4 {
    public static void main(String[] args) {
        Scanner lectura_avila = new Scanner(System.in);
        int desicion=1;

        do { 

        System.out.println("Bienvenido al sudoku, a continuación digite el tamaño del tablero que desea jugar: ");
        System.out.println();

        int tamaño = lectura_avila.nextInt();
        int suma = 0;
        for (int i = 1; i <= tamaño; i++) {
            suma += i;
        }

        int filas = tamaño;
        int columnas = tamaño;


        int[][] num = new int[filas][columnas];

        System.out.println("Recuerde que el numero a insertar, debe se un numero del 1 al " + tamaño);
        System.out.println("Digite el numero que quiere insertar en la casilla:");
        

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("[" + i + "][" + j + "]: ");
                num[i][j] = lectura_avila.nextInt();
            }
        }

        // Sumar valores de cada fila y columna
        int[] suma_filas = new int[tamaño];
        int[] suma_columnas = new int[tamaño];
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                suma_filas[i] += num[i][j];
                suma_columnas[j] += num[i][j];
            }
        }
        // Mostrar la matriz y la suma de cada fila y columna
        System.out.println("Aquí su tablero de sudoku :");
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println("| " + suma_filas[i]);
        }


        for (int j = 0; j < suma_columnas.length; j++) {
            System.out.print("----\t");
        }
        System.out.println();


        for (int j = 0; j < suma_columnas.length; j++) {
            System.out.print(suma_columnas[j] + "\t");
        }

        System.out.println();

        System.out.println("Si la suma de cada fila y cada columna es igual a " + suma + " su tablero de sudoku está resuelto, de no ser así , porfavor intentelo denuevo." );
        System.out.println();
        System.out.print("¿Desea intentarlo de nuevo? (1 - Sí / 2 - No): ");
        desicion = lectura_avila.nextInt();
        System.out.println(); // salto de la línea para empezar de nuevo

    } while (desicion == 1);

        lectura_avila.close();
    }
}

