public class InvirtiendoCadenas {

   public static void main(String[] args) {
      System.out.println(pc2Read("Do geese see God"));
   }

   public static String pc2Read(String str) {
      /7System.out.println(str);
      char[] a = str.toCharArray();
      str = "";

      for (int i = a.length-1; i >= 0; i--) {
         str += a[i];
      }
      return str;
   }
}