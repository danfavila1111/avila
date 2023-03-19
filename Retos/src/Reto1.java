import java.util.Scanner;

public class Reto1 {
    public static void main(String[] args) {
        Scanner lectura_avila =new Scanner(System.in);
        System.out.println("Porfavor ingrese la cantidad de grados °C (Centigrados) que desea converir a grados  °K (Kelvin)" );
        float grados_c = lectura_avila.nextInt();
        System.out.println("Porfavor ingrese la cantidad de personas que van a ingerir torta");
        int personas = lectura_avila.nextInt();
        float gr_harina = personas * 13;
        float kg_harina = gr_harina / 1000;
        System.out.println( grados_c + " Grados °C (Centigrados) equivalen a: " + (grados_c  + 273.15) +
        " grados °C °K (Kelvin). Y se necesitan " + kg_harina + " Kilogramos de harina para la torta.");

        lectura_avila.close();
    }
}
