package FigurasGeometricas;

public class Rectangulo extends Figura {

    private float base;
    private float altura;
    //crear atributos

    //crear metodo constructor


    public Rectangulo(float base, float altura) {
        this.base = base;
        this.altura = altura;
    }


    public float getBase() {
        return base;
    }


    public void setBase(float base) {
        this.base = base;
    }


    public float getAltura() {
        return altura;
    }


    public void setAltura(float altura) {
        this.altura = altura;
    }


    //metodo de la subclase
    public void calcularArea() {
        float arearec = base * altura;
        System.out.println("La base del triangulo es " + base + " y su altura es: " + altura 
        + " por lo tanto su area es: " + arearec);
    }

    
    

}
