import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DecimalABinario {

   public static void main(String[] args) {
       pc2Read();
   }

   public static void convertBinary(int decimal) {
        String invertido = "", binario = "";
        int numero = decimal;

        while (numero >= 1) {
            if (numero % 2 == 0) {
                invertido += "0";
            } else {
                invertido += "1";
            }
            numero /= 2;
        }

        for (int s = invertido.length()-1; s >= 0; s--) {
            binario += invertido.charAt(s);
        }
        System.out.printf("[%s], [%s]", binario, invertido);
   }

   public static void pc2Read() {
        String line;
        int n;

        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        try {
           line = buffer.readLine();
           n = Integer.parseInt(line);
           buffer.close();
           convertBinary(n);
        } catch (NullPointerException e) {
           e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
    }
}
