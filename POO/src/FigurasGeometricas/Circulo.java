package FigurasGeometricas;

public class Circulo extends Figura {

    private double radio;
    //crear atributos

    //crear metodo constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
    
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //metodo de la subclase
    public void calcularArea() {
        double areacir =  3.1416 * (radio * radio) ;
        System.out.println("El radio del circulo es " + radio + " y su area es: " + areacir + "cm^2");
    }



    

}
