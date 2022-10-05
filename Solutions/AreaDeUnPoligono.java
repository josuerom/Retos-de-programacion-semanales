import java.util.Scanner;

public class AreaDeUnPoligono {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
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
   }

   public static float triangulo(float base, float altura) {
      return (base * altura) / 2;
   }
}