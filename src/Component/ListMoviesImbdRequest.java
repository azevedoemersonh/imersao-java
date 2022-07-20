package Component;

import java.net.URI;
import java.net.http.HttpRequest;

public class ListMoviesImbdRequest
{
    private static final String URL_MOVIES = "https://mocki.io/v1/9a7c1ca9-29b4-4eb3-8306-1adb9d159060";

    public HttpRequest listMoviesImbdRequest() {
        URI address = URI.create(URL_MOVIES);
        
        HttpRequest request = HttpRequest.newBuilder(address).GET().build();

        return request;
    }
}