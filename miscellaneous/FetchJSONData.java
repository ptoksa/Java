import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

import org.json.JSONObject;

public class FetchJSONData {

    public static void main(String[] args) throws IOException {
        // Create a URL object for the HeadAI endpoint
        URL url = new URL("https://api.headai.com/v1/articles");

        // Open a connection to the endpoint
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method to GET
        connection.setRequestMethod("GET");

        // Send the request and get the response
        int responseCode = connection.getResponseCode();
        if (responseCode != 200) {
            throw new IOException("Failed to fetch JSON data: " + responseCode);
        }

        // Get the response stream
        InputStream inputStream = connection.getInputStream();

        // Create a Scanner object to read the response stream
        Scanner scanner = new Scanner(inputStream);

        // Read the entire response stream into a string
        String jsonString = scanner.useDelimiter("\\A").next();

        // Close the Scanner object
        scanner.close();

        // Close the connection
        connection.disconnect();

        // Parse the JSON string into a JSONObject
        JSONObject jsonObject = new JSONObject(jsonString);

        // Print the JSON object to the console
        System.out.println(jsonObject.toString());
    }
}
