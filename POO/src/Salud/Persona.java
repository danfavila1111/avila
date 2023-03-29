package Salud;
import java.util.Scanner;

public class Persona {

   //Atributos
   private String tipoDoc; 
   private int documento;
   private String nombre;
   private String apellido;
   private double peso;
   private double estatura;
   private int edad;
   private String sexo;
   double imc = 0;

   public Persona(String tipoDoc, int documento, String nombre, String apellido) {
    this.tipoDoc = tipoDoc;
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
   
    }

//Getters y setters reto3
    public Persona(){
    }
public String getTipoDoc() {
    return tipoDoc;
}
public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}
public int getDocumento() {
    return documento;
}
public void setDocumento(int documento) {
    this.documento = documento;
}
public String getNombre() {
    return nombre;
}
public void setNombre(String nombre) {
    this.nombre = nombre;
}
public String getApellido() {
    return apellido;
}
public void setApellido(String apellido) {
    this.apellido = apellido;
}


//Metodos

public void pedirDatos(){
    Scanner captura=new Scanner(System.in);
    System.out.println("Digite su tipo de documento");
    tipoDoc=captura.next();
    System.out.println("Digite su numero de documento");
    documento=captura.nextInt();
    System.out.println("Digite su nombre");
    nombre=captura.next();
    System.out.println("Digite su apellido");
    apellido=captura.next();
    System.out.println("Digite su peso en kg");
    peso=captura.nextDouble();
    System.out.println("Digite su estatura en metros");
    estatura=captura.nextDouble();
    System.out.println("Digite su edad");
    edad=captura.nextInt();
    System.out.println("Digite su sexo");
    sexo=captura.next();
    captura.close();
   }
   public void mostrarPersona(){
    System.out.println("Tipo de documento: "+ tipoDoc);
    System.out.println("Numero de documento: "+documento);
    System.out.println("Nombre: "+nombre);
    System.out.println("Su apellido es "+apellido);
    System.out.println("Su peso es "+peso);
    System.out.println("Su estatura es "+estatura);
    System.out.println("Su edad es "+edad);
    System.out.println("Su sexo es "+sexo);
   
   }

/*  
SIN RETORNO (RETO 1)
   public void calcularImc(){
    imc =  peso / (estatura * estatura);
    System.out.println("Su indice de masa corporal es: " + imc );

    if (imc < 20) {
        System.out.println("El peso está por debajo de lo ideal");

    } else if (imc >= 20 && imc < 25) {
        System.out.println("El peso es ideal ");
    }
    else {
        System.out.println("Tiene sobrepeso");
    }
}
*/

 // reto 2 
 public double calcularImc() {
    imc = peso / (estatura * estatura);
    System.out.println("Su imc es : " + imc);
    if (imc < 20) {
        return 1;
    } else if (imc >= 20 && imc <= 25) {
        return 2;
    } else {
        return 3;
    }
}

   public void mayorEdad(){
    if (edad>=18){
        System.out.println("Usted es mayor de edad");
    }
    else{
        System.out.println("Usted es menor de edad");
    
    }
    
   }
  

}
