import java.util.Arrays;

public class EsUnAnagrama {

   public static void main(String[] args) {
      System.out.println(pc2Read("Rata", "tara"));
   }

   public static boolean pc2Read(String word1, String word2) {
      if (word1.equalsIgnoreCase(word2)) {
         return false;
      } else {
         String wd1 = word1.toLowerCase();
         String wd2 = word2.toLowerCase();

         char a[] = wd1.toCharArray();
         char b[] = wd2.toCharArray();
         Arrays.sort(a);
         Arrays.sort(b);

         if (Arrays.equals(a, b)) {
            return true;
         } else {
            return false;
         }
      }
   }
}