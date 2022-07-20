import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;

import Repository.ListMoviesImdbRepository;
import Services.ListMoviesService;

public class App {
    public static void main(String[] args) throws Exception {
        // Get data about movies
        ListMoviesImdbRepository listMoviesImdbRepository = new ListMoviesImdbRepository();
        HttpResponse<String> response = listMoviesImdbRepository.listMoviesImdbRepository();

        String body = response.body();

        // extract just important datas (title, image, rank)
        JsonParser parser = new JsonParser();
        List<Map<String, String>> listOfMovies = parser.parse(body);
        
        // Show and manipulate data
        ListMoviesService listMoviesService = new ListMoviesService();
        listMoviesService.printListMovies(listOfMovies);
    }
}
