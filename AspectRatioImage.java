import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import javax.imageio.ImageIO;

public class AspectRatioImage {

    public static void main(String[] args) {
        BufferedImage image = null;

        try {
            URL url = new URL("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png");
            image = ImageIO.read(url);

            int width = image.getWidth();
            int height = image.getHeight();
            int MCD = maximoComunDivisor(width, height);

            String ratio = width / MCD + ":" + height / MCD;
            System.out.println(width + "x" + height + "px" + "\n" + ratio);
        } catch (MalformedURLException e) {
            System.out.println("La url está mal escrita o tiene un formato no válido");
        } catch (IOException e) {
            System.out.println("Error de lectura, intentelo de nuevo");
        } catch (NullPointerException e) {
            System.out.println("La url pasada no contiene una imagen o está mal formada");
        } catch (Exception e) {
            System.out.println("Error desconocido, contacte con el desarrollador: " + e.getMessage());
        }

    }

    private static int maximoComunDivisor(int width, int height) {
        if (height == 0) {
            return width;
        }
        return maximoComunDivisor(height, width % height);
    }
}