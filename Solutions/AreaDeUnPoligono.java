import java.util.Scanner;

public class AreaDeUnPoligono {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String pol = sc.next();

      Poligono poligono;

      if (pol.equals("cuadrado")) {
        float lado = sc.nextFloat();
        poligono = new Poligono(lado);
        poligono.cuadrado();
      } else if (pol.equals("rectangulo")) {
        float base = sc.nextFloat();
        float altura = sc.nextFloat();
        poligono = new Poligono(base, altura);
        poligono.rectangulo();
      } else if (pol.equals("triangulo")) {
        float base = sc.nextFloat();
        float altura = sc.nextFloat();
        poligono = new Poligono(base, altura);
        poligono.triangulo();
      }
   }
}

class Poligono {
    private float lado1;
    private float lado2;

    public Poligono(float lado1) {
        this.lado1 = lado1;
    }

    public Poligono(float lado1, float lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public void cuadrado() {
        float resultado = (lado1 * lado1);
        System.out.println("Área del cuadrado: " + resultado);
    }

    public void rectangulo() {
        float resultado = (lado1 * lado2);
        System.out.println("Área del rectángulo: " + resultado);
    }

    public void triangulo() {
        float resultado = (lado1 * lado2) / 2;
        System.out.println("Área del triángulo: " + resultado);
    }
}
