import java.util.Scanner;

public class AreaDeUnPoligono {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
<<<<<<< HEAD
      System.out.print("Ingrese el nombre del poligono a calcular el area: ");
      float lado = 0f, base = 0f, altura = 0f;

      switch (sc.next()) {
         case "cuadrado": System.out.print("Ingrese el valor de un lado del Cuadrado: ");
            System.out.println("Area del cuadrado = " + cuadrado(sc.nextFloat()));
            break;
         case "rectangulo": System.out.print("Valor de la base: ");
            base = sc.nextFloat();
            System.out.print("Valor de la altura: ");
            altura = sc.nextFloat();
            System.out.println("Area del rectangulo = " + rectangulo(base, altura));
            break;
         case "triangulo": System.out.print("Valor de la base: ");
            base = sc.nextFloat();
            System.out.print("Valor de la altura: ");
            altura = sc.nextFloat();
            System.out.println("Area del triangulo = " + triangulo(base, altura));
            break;
         default:
            System.err.println("ERROR. Debes ingresar una de las 3 opciones validas, como: (cuadrado, rectangulo, triangulo)");
      }
   }

   public static float cuadrado(float lado1) {
      return lado1 * lado1;
   }

   public static float rectangulo(float base, float altura) {
      return base * altura;
=======
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
>>>>>>> e369557a1c9ff9d364e5c5e52dc0a82222f190f0
   }
}

<<<<<<< HEAD
   public static float triangulo(float base, float altura) {
      return (base * altura) / 2;
   }
}
=======
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
>>>>>>> e369557a1c9ff9d364e5c5e52dc0a82222f190f0
