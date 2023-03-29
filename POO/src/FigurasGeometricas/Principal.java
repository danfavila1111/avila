package FigurasGeometricas;

import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        float lado;
        float base;
        float altura;
        float radio;
        int desicion=1;
        int respuesta;

        do{
        Scanner captura = new Scanner(System.in);
        System.out.println("Porfavor seleccione la figura de la que desea conocer el area "
        + "1 para cuadrado, 2 para triangulo, 3 para rectangulo,\no en su defecto 4 para circulo");
        respuesta=captura.nextInt();

        if(respuesta==1){
        System.out.println("Porfavor digite el valor del lado del cuadrado");
        lado = captura.nextFloat();
        //crear el objeto de la subclase Cuadrado
        Cuadrado c1 = new Cuadrado(lado);
        c1.calcularArea();
        System.out.println();

        } else if (respuesta==2){
        System.out.println("Porfavor digite el valor de la base del triangulo");
        base = captura.nextFloat();
        System.out.println("Porfavor digite el valor de la altura del triangulo");
        altura = captura.nextFloat();
        //crear el objeto de la subclase Cuadrado
        Triangulo t1 = new Triangulo(base, altura);
        t1.calcularArea();
        System.out.println();

        } else if (respuesta==3){
        System.out.println("Porfavor digite el valor de la base del recangulo");
        base = captura.nextFloat();
        System.out.println("Porfavor digite el valor de la altura del recangulo");
        altura = captura.nextFloat();
        //crear el objeto de la subclase Cuadrado
        Rectangulo r1 = new Rectangulo(base, altura);
        r1.calcularArea();
        System.out.println();
        } else {
        System.out.println("Porfavor digite el valor del radio del circulo");
        radio = captura.nextFloat();
        //crear el objeto de la subclase Cuadrado
        Circulo cr1 = new Circulo(radio);
        cr1.calcularArea();
        System.out.println();
         }
         System.out.println("Desea consultar el area de otra figura ? digite 1 para Sí y 2 para No");
         desicion=captura.nextInt();
         
        }

        
        while(desicion==1);

        
    }
}