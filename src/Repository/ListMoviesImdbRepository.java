package Repository;

import java.io.IOException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import Component.ListMoviesImbdRequest;

public class ListMoviesImdbRepository 
{
    public HttpResponse<String> listMoviesImdbRepository() throws IOException, InterruptedException {
        ListMoviesImbdRequest requestList = new ListMoviesImbdRequest();
        
        HttpRequest request = requestList.listMoviesImbdRequest();

        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response =  client.send(request, BodyHandlers.ofString());

        return response;
    }    
}
