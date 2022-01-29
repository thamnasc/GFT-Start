package com.dio;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

public class postRequest {

    public static final String URL_POST = "http://httpbin.org/forms/post";
    public static final String FILE_JSON = "pedido.json";

    public static void main(String[] args) throws IOException, InterruptedException {

        //cliente HTTP
        HttpClient client = HttpClient.newHttpClient();

        //criando requisição
        //funciona como default com método GET
        //para funcionar com POST, seria preciso de um servidor APACHE para conseguir a permissão
        HttpRequest request = HttpRequest.newBuilder()
                //.POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON))) //especifica o que quer enviar
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_POST))
                .build();

        //requisição assíncrona
       client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
               .thenApply(HttpResponse::body) //pega o body da resposta
               .thenAccept(System.out::println)
               .join(); //não tem uma variável recebendo
    }
}
