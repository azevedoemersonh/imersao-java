package Services;

import java.util.List;
import java.util.Map;

public class ListMoviesService
{
    public void printListMovies(List<Map<String, String>> listOfMovies) {
        for (Map<String, String> movieDetails : listOfMovies) {
            String title = movieDetails.get("title");
            var rating = movieDetails.get("imDbRating");
            String image = movieDetails.get("image");

            System.out.println("\u001b[1m Title: " + title + "\u001b[m");
            System.out.println("\u001b[1m Poster:\u001b[m " + image);
            System.out.println("\u001b[38;5;226m\u001b[48;5;53m Rating " + rating + "\u001b[m");
            
            this.printStartsRating(Double.parseDouble(rating));

            System.out.println();
        }
    }

    private void printStartsRating(Double rating) {
        for (var i = 0; i <= rating; i++) {
            System.out.print("\u001b[5m\u001b[33m\u2b50" + " " + "\u001b[m");
        }
    }
}
