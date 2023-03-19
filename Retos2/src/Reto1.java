import java.util.Scanner;

public class Reto1{

    public static void main(String[] args) {
        
        Scanner lectura_avila = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de notas a evaluar:");
        int cantidadNotas = lectura_avila.nextInt();
        
        double[] notas = new double[cantidadNotas];
        double sumaNotas = 0;
        
        for (int contador = 0; contador < cantidadNotas; contador++) {
            System.out.println("Ingrese el valor de la nota " + (contador+1) + " (este valor debe ser entre 0,0 y 5,0):");
            notas[contador] = lectura_avila.nextDouble();
            sumaNotas += notas[contador];
        }
        
        double promedio = sumaNotas / cantidadNotas;
        
        System.out.println("El promedio final es: " + promedio);
        
        if (promedio < 3) {
            System.out.println("Reprobaste");
        } else if (promedio >= 3 && promedio < 4) {
            System.out.println("Pasaste raspando");
        } else {
            System.out.println("Aprobaste con buenos resultados");
        }
        
        lectura_avila.close();

    }

}