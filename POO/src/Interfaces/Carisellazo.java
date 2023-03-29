package Interfaces;


import java.util.Random;
import java.util.Scanner;


public class Carisellazo implements Juego {

    private int moneda;
    private String jugador;
    private int eleccion;
    
    Scanner captura = new Scanner(System.in);
    //solicitar datos dentro de metodo
    public void iniciar() {
        System.out.println("Porfavor digite el nombre del jugador");
        jugador=captura.next();
        
    }

    public void jugar() {
        System.out.println(jugador + "realice su elección. \n 0 para cara, 1 para sello");
        eleccion=captura.nextInt();
        Random resultado = new Random();
        moneda = resultado.nextInt(2);
        System.out.println("*se lanza la moneda*");
        
    }

    public void finalizar() {
        
        if( eleccion == 0 && moneda== 0){
            System.out.println("Cayó cara, ganaste " + jugador);
        } else if ( eleccion == 1 && moneda== 1)  {
            System.out.println("Cayó sello, ganaste " + jugador);
        } else if ( eleccion == 0 && moneda== 1)  {
            System.out.println("Cayó sello, perdiste " + jugador);
        } else if ( eleccion == 1 && moneda== 0) {
            System.out.println("Cayó cara, perdiste " + jugador);
        }

    }
    
}
