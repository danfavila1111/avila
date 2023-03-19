import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner lectura_avila = new Scanner(System.in);

        String teclado [][] = {{"Esc","f1","f2","f3","f4","f5","f6","f7","f8","f9","f10","f11","f12","BloqDespl","Imprpant","="},
        {"|","1","2","3","4","5","6","7","8","9","0","?","¿","<-"," "},
        {"tab","q","w","e","r","t","y","u","i","o","p","¨","*","Enter"," "," "},
        {"bloqMayus","a","s","d","f","g","h","j","k","l","ñ", "[" , "]"," "," "," "},
        {"<","z","x","c","v","b","n","m",",",".","-","Shift"," "," "," "," "},
        {"Ctrl","fn","windows","alt","espacio","altGr","pegar","Ctrl"," "," "," "," "," "," "," "," "}
        };

        for (int contador = 0; contador <6; contador ++){
            for (int contador2 = 0; contador2 <15; contador2 ++){
                    System.out.println(teclado [contador][contador2] + "  ");
            }
            System.out.println();

        }
    
        lectura_avila.close();
    }
}