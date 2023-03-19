import java.util.Scanner;

public class Reto5 {

    public static void main(String[] args) {
        Scanner lectura_avila = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del empleado:");
        String nombreEmpleado = lectura_avila.nextLine();
        
        System.out.println("Ingrese el nombre del cliente:");
        String nombreCliente = lectura_avila.nextLine();
        
        int precioTotal = 0;
        int cantidadProductos = 0;
        
        int respuesta;
        do {
            System.out.println("Ingrese el precio del producto:");
            precioTotal += lectura_avila.nextInt();
            cantidadProductos++;
            
            System.out.println("¿Desea agregar otro producto? (1 para Si, 2 para No)");
            respuesta = lectura_avila.nextInt();
        } while (respuesta == 1);
        
        System.out.println("Empleado: " + nombreEmpleado);
        System.out.println("Cliente: " + nombreCliente);
        System.out.println("Cantidad de productos comprados: " + cantidadProductos);
        System.out.println("Total de la compra: $" + precioTotal);
        lectura_avila.close();
    }
}