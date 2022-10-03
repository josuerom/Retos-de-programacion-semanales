public class FizzBuzz {

   public static void main(String[] args) {
      byte n = 0;
      while (++n <= 100) {
         if (n % 3 == 0 && n % 5 == 0) {
            System.out.println("fizzbuzz");
         } else if (n % 3 == 0) {
            System.out.println("fizz");
         } else if (n % 5 == 0) {
            System.out.println("buzz");
         } else {
            System.out.println(n);
         }
      }
   }
}