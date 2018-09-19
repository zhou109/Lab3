import java.io.IOException;
import java.net.URL;
import java.util.Scanner;
public class Main {
    public static String urlToString(final String url) {
        Scanner urlScanner;
        try {
            urlScanner = new Scanner(new URL(url).openStream(), "UTF-8");
        } catch (IOException e) {
            return "";
        }
        String contents = urlScanner.useDelimiter("\\A").next();
        urlScanner.close();
        return contents;
    }

    public static void main(String[] args) {
        System.out.println(urlToString("https://www.bls.gov/tus/charts/chart9.txt"));
        System.out.println('c');
	// write your code here
    }
}
