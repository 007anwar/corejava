package com.java.core.javanine;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class AsyncHttpClientDemo {
    public static void main(String[] args) {
        try {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest builder = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities")).GET().build();
            HttpResponse<String> response = httpClient.send((HttpRequest) builder, HttpResponse.BodyHandlers.ofString());
            System.out.println(response.statusCode());
            System.out.println(response.body());
            System.out.println(response.headers());


            HttpRequest build = HttpRequest.newBuilder(new URI("https://fakerestapi.azurewebsites.net/api/v1/Activities"))
                    .POST(
                    HttpRequest.BodyPublishers.ofString("{\n" +
                            "  \"id\": 0,\n" +
                            "  \"title\": \"new\",\n" +
                            "  \"dueDate\": \"2021-11-11T11:47:43.307Z\",\n" +
                            "  \"completed\": true\n" +
                            "}")

            ).headers("Content-Type","application/json")


                    .build();
            CompletableFuture<HttpResponse<String>> send = httpClient.sendAsync(build, HttpResponse.BodyHandlers.ofString());
            System.out.println("Send status code : "+send.thenApply(HttpResponse::statusCode));
            System.out.println("Send response : "+send.thenApply(HttpResponse::body));



        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
