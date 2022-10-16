package com.netbiis.sisrestaurante;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Redirect;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublisher;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.file.Paths;
import java.time.Duration;

public class ClienteHttp {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		HttpClient client = HttpClient.newBuilder()
		        .version(Version.HTTP_1_1)
		        .followRedirects(Redirect.NORMAL)
		        .build();
		
		HttpRequest request = HttpRequest.newBuilder()
		        .uri(URI.create("https://www.google.com/"))
		        .timeout(Duration.ofMinutes(2))
		        .header("Content-Type", "application/json")
		        .build();
		
		
		HttpResponse<String> response = client.send(request, BodyHandlers.ofString());	
		
		System.out.println(response);

	}

}
