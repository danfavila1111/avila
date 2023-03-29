package FigurasGeometricas;

public class Cuadrado extends Figura {
    //crear atributos
    private float lado;
    //crear atributos

    //crear metodo constructor
    public Cuadrado (float lado){
        this.lado=lado;
    }
    //getters y setters metodos accesores
    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    //metodo de la subclase
    public void calcularArea() {
        float area = lado * lado;
        System.out.println("El lado del cuadrado es " + lado + " y su area es: " + area);
    }
    

}
