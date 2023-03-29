package Principal;
import java.util.Scanner;
import Salud.Empleado;
import Salud.Persona;


public class Inicio {
    

    public static void main(String[] args) {
    String cargo, departamento;
    int valorhora, horastrabajadas;

    Scanner captura=new Scanner(System.in);
    Persona persona1 = new Persona();

    // reto 3
        System.out.println("Digite su cargo");
        cargo=captura.next();
        System.out.println("Digite su departamento");
        departamento=captura.next();
        System.out.println("Digite cuanto gana por hora");
        valorhora=captura.nextInt();
        System.out.println("Digite el numero de horas trabajadas");
        horastrabajadas=captura.nextInt();
        
        //crear un objeto->instancia de una clase
        persona1.pedirDatos();

        Empleado empleado1 =new Empleado(persona1.getTipoDoc(),persona1.getDocumento(),persona1.getNombre(),persona1.getApellido(), cargo, departamento,valorhora,horastrabajadas);
        //invocando un metodo
        persona1.mostrarPersona();
        empleado1.mostrarEmpleado();
        empleado1.calcularHonorarios();

        System.out.println("\nIMC de la persona:");
        double imc = persona1.calcularImc();
        if (imc == 1) {
            System.out.println("PESOBAJO");
        } else if (imc == 2) {
            System.out.println("PESOIDEAL");
        } else {
            System.out.println("SOBREPESO");
        }

        System.out.println("\nMayoría de edad:");
        persona1.mayorEdad(); 
   }

   
}