import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodigoMorse {

   public static void main(String[] args) {
      pc2Read();
   }

   public static void convertMorse(String line) {
   }

   public static void convertNatural(String line) {
   }

   public static void pc2Read() {
      String line;

      BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

      try {
         line = buffer.readLine();
         buffer.close();
         String first = line.substring(0, 1);

         if (first.equals("-") || first.equals(".")) {
            convertNatural(line);
         } else {
            convertMorse(line);
         }
      } catch (NullPointerException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}