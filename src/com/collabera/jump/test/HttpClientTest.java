package com.collabera.jump.test;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;



public class HttpClientTest {

	public static void main(String[] args) throws IOException, InterruptedException  {
		// TODO Auto-generated method stub
		HttpClient  httpClient = HttpClient.newBuilder()
				.version(Version.HTTP_2)
				.build();
		HttpRequest request = HttpRequest.newBuilder()
				.uri(URI.create("https://http2.github.io/"))
				//.uri(URI.create("https://finance.yahoo.com/"))
				.build();
		
		HttpResponse<String> response = httpClient.send(request, BodyHandlers.ofString());
		System.out.println("Response status code: "+response.statusCode());
		System.out.println("Response headers: "+response.headers());
		System.out.println("Response body: "+response.body());
		
		System.out.println("Response status code: "+response.statusCode());
		System.out.println("Response headers: "+response.headers());
		System.out.println("Response body: "+response.body());
		
		System.out.println("Response status code: "+response.statusCode());
		System.out.println("Response headers: "+response.headers());
		System.out.println("Response body: "+response.body());
		

	}

}
