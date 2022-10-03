import java.net.URL;
import java.net.URLConnection;
import java.net.MalformedURLException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.InputStream;

public class AspectRatioImage {

    public static void main(String[] args) {
        try { //TODO: no pude resolver éste problema, lo resolvería buscando en internet pero eso no haré.
            URL url = new URL("https://raw.githubusercontent.com/mouredev/mouredev/master/mouredev_github_profile.png");
            URLConnection conexion = url.openConnection();

            System.out.println(conexion);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}