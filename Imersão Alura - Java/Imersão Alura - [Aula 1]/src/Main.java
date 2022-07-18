import java.net.http.*;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException, InterruptedException {
		System.out.println("Escolha o título do filme: ");
		
		Scanner input = new Scanner(System.in);
		
		String url = "https://moviesdatabase.p.rapidapi.com/titles/search/title/" + input.nextLine().replace(" ", "%20");;

		URI uri = URI.create(url);
		HttpClient client = HttpClient.newHttpClient();
		HttpRequest request = HttpRequest.newBuilder(uri)
				.headers("X-RapidAPI-Key", "525f8dcfcemsh2433dcce606951ep183fe0jsn652e72529109")
				.headers("X-RapidAPI-Host", "moviesdatabase.p.rapidapi.com")
				.build();
		String response = client.send(request, HttpResponse.BodyHandlers.ofString()).body();
		System.out.println(response);
		
		
		
	}
}
