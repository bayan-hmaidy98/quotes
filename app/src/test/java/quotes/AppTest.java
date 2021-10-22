/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package quotes;

import com.google.gson.Gson;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test void randomQuoteTest(){
        Gson gson = new Gson();
        File input = new File("app/src/main/resources/recentquotes.json");
        try {
            Reader reader = new FileReader(input);
            Quotes []quotes = gson.fromJson(reader, Quotes[].class);
            assertTrue(Arrays.asList(quotes).contains("{author='Cassandra Clare', text=' “There is no pretending, Jace said with absolute clarity. I love you, and I will love you until I die, and if there is life after that, I'll love you then.�? '}"));
            assertFalse(Arrays.asList(quotes).contains("author='Bayan Hmaidy'"));
//            String actual = String.valueOf(quotes[0]);
//            System.out.println(quotes[16].toString());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Test void testApi() throws IOException {
        try {
            URL url = new URL("https://favqs.com/api/qotd");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.11 (KHTML, like Gecko) Chrome/23.0.1271.95 Safari/537.11");
            InputStream inputStream = connection.getInputStream();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
            BufferedReader input = new BufferedReader(inputStreamReader);
            String quoteFromApi = input.toString();
            assertNotEquals(quoteFromApi, null);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
}
