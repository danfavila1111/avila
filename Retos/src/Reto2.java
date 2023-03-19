import java.util.Scanner;

public class Reto2 {
    public static void main(String[] args) {
        Scanner lectura_avila =new Scanner(System.in);
        System.out.println("Porfavor ingrese el nombre del medico tratante");
        String nombredr = lectura_avila.nextLine();
        System.out.println("Porfavor ingrese el nombre de la madre del paciente");
        String nombremadre = lectura_avila.nextLine();
        System.out.println("Porfavor ingrese el nombre del paciente");
        String nombrebebe = lectura_avila.nextLine();
        System.out.println("Porfavor ingrese el mes actual");
        int mes_actual = lectura_avila.nextInt();
        System.out.println("Porfavor ingrese el mes de nacimiento de " + nombrebebe);
        int mes_nacimiento = lectura_avila.nextInt();
        System.out.println("Porfavor ingrese el año actual");
        int ano_actual = lectura_avila.nextInt();
        System.out.println("Porfavor ingrese el año de nacimiento de " + nombrebebe);
        int ano_nacimiento = lectura_avila.nextInt();
        int mes = mes_actual - mes_nacimiento;
        int ano = ano_actual- ano_nacimiento;
        int ano_en_meses = ano * 12;
        int edad = ano_en_meses + mes ;
        System.out.println(" la edad de " + nombrebebe + " es " + edad + " meses ");
        System.out.println("Porfavor ingrese el peso del paciente en KG");
        int peso = lectura_avila.nextInt();
        System.out.println( "El DR. " + nombredr + " informa a " + nombremadre 
        + " que la cantidad de dosis que se debe aplicar a " + nombrebebe +" es de "
        + (peso + (15 / edad * 10)) * 8 + " mL." ) ;


        lectura_avila.close();
    }
}

