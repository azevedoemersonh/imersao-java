import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        // hit api for get top 250 movies
        String url = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";
        URI address = URI.create(url);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();

        HttpResponse<String> response =  client.send(request, BodyHandlers.ofString());

        String body = response.body();

        // extract just important datas (title, image, rank)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listOfMovies = parser.parse(body);
        
        // Show and manipulate data
        for (Map<String,String> movie : listOfMovies) {
            System.out.println(movie.get("title"));
            System.out.println(movie.get("image"));
            System.out.println(movie.get("imDbRating"));
            System.out.println();
        }
    }
}
