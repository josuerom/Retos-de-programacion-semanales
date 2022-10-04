public class SucesionFibonacci {

   public static void main(String[] args) {
      long[] fibo = new long[50];
      fibo[0] = 0; fibo[1] = 1;

      for (int i = 2; i < fibo.length; i++) {
         fibo[i] = (long) (fibo[i-2] + fibo[i-1]);
      }
      for (long e : fibo) {
         System.out.print(e + " ");
      }
   }
}
