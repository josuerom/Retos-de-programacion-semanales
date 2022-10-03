public class EsUnNumeroPrimo {

   public static void main(String[] args) {
      byte limite = 100;
      byte i = 1;

      while (++i <= 100) {
         byte j = i, aux = 0;

         while (j >= 1) {
            if (i % j == 0) {
               aux++;
            }
            j--;
         }
         if (aux == 2) {
            System.out.println(i);
         }
      }
   }
}