import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalABinario {

   public static void main(String[] args) {
       pc2Read();
   }

   public static void convertBinary(int decimal) {
        String binario = "";

        while (decimal >= 1) {
            binario += decimal % 2;
            decimal /= 2;
        }
        for (int i = binario.length()-1, space = 0; i >= 0; i--) {
            System.out.print(binario.charAt(i));
            if (++space % 4 == 0) {
                System.out.print(" ");
            }
        }
        System.out.println();
   }

   public static void pc2Read() {
        String line;
        int decimal;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
           line = buffer.readLine();
           decimal = Integer.parseInt(line);

           while (decimal != 0) {
               convertBinary(decimal);
               line = buffer.readLine();
               decimal = Integer.parseInt(line);
           }
           buffer.close();
        } catch (NullPointerException e) {
           e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
