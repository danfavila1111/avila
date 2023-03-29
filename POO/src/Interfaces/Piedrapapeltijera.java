package Interfaces;

import java.util.Random;
import java.util.Scanner;


public class Piedrapapeltijera implements Juego {

        private int figura;
        private String jugador;
        private int eleccion;
    
    Scanner captura = new Scanner(System.in);
    //solicitar datos dentro de metodo
    public void iniciar() {
        System.out.println("Porfavor digite el nombre del jugador");
        jugador=captura.next();
        
    }

    public void jugar() {
        System.out.println(jugador + "realice su elección. \n 0 para piedra, 1 para papel , 2 para tijera");
        eleccion=captura.nextInt();
        Random resultado = new Random();
        figura = resultado.nextInt(3);
        System.out.println("*juega*");
        
    }

    public void finalizar() {
        
        if( eleccion == 0 && figura== 0 || eleccion == 1 && figura== 1 || eleccion == 2 && figura== 2){
            System.out.println("Empate, nadie gana");
        } else if ( eleccion == 0 && figura== 1)  {
            System.out.println("Perdiste, la maquina sacó papel");
        } else if ( eleccion == 0 && figura== 2)  {
            System.out.println("Ganaste, la maquina sacó tijeras");
        } else if ( eleccion == 1 && figura== 0)  {
            System.out.println("Ganaste, la maquina sacó piedra");
        } else if ( eleccion == 1 && figura== 2)  {
            System.out.println("Perdiste, la maquina sacó tijeras");
        } else if ( eleccion == 2 && figura== 0)  {
            System.out.println("Perdiste, la maquina sacó piedra");
        } else if ( eleccion == 2 && figura== 1)  {
            System.out.println("Ganaste, la maquina sacó papel");
        }

    }
    
}