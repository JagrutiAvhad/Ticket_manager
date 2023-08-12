/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ticket;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URI;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.ArrayList;


public class Api {
    public static void main(String[]args) throws IOException, InterruptedException {
        HttpRequest request = HttpRequest.newBuilder()
		.uri(URI.create("https://trains.p.rapidapi.com/"))
		.header("content-type", "application/json")
		.header("X-RapidAPI-Key", "b38cbc028bmsh2f46e4a474a0bc0p110244jsn9c73c62441a7")
		.header("X-RapidAPI-Host", "trains.p.rapidapi.com")
		.method("POST", HttpRequest.BodyPublishers.ofString("{\r\n    \"search\": \"Rajdhani\"\r\n}"))
		.build();
HttpResponse<String> response = HttpClient.newHttpClient().send(request, HttpResponse.BodyHandlers.ofString());
System.out.println(response.body());

    }
}
