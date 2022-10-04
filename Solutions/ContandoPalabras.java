import java.util.Scanner;

public class ContandoPalabras {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String text = sc.nextLine();
      String[] arr = text.split("[ .,;!¡¿?] ?");
      Arrays.sort(arr);
      int c = 0;
      System.out.println(Arrays.deepToString(arr));

      repeat: for (int i = 0; i < arr.length-1; i++) {
         String key = arr[i];

         for (int j = i; j < arr.length-1; j++) {
            if (key.equals(arr[j+1])) {
               c++;
            }
         }
         continue  repeat;
         if (c != 0) {
               System.out.printf("[%s, %d]\n", arr[i], ++c);
         }
         c = 0;
      }
   }
}