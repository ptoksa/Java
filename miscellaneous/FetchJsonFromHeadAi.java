import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class FetchJsonFromHeadAi {

    public static void main(String[] args) throws IOException {
        // Create a URL object for the headai.com endpoint
        URL url = new URL("https://headai.com/api/v1/json");

        // Open a connection to the endpoint
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Set the request method to GET
        connection.setRequestMethod("GET");

        // Connect to the endpoint
        connection.connect();

        // Check the response code
        int responseCode = connection.getResponseCode();
        if (responseCode == 200) {
            // Success! Read the JSON data from the response
            InputStreamReader reader = new InputStreamReader(connection.getInputStream());
            StringBuilder json = new StringBuilder();
            char[] buffer = new char[1024];
            int read;
            while ((read = reader.read(buffer)) != -1) {
                json.append(buffer, 0, read);
            }

            // Close the reader
            reader.close();

            // Print the JSON data
            System.out.println(json.toString());
        } else {
            // Error!
            System.out.println("Error fetching JSON data: " + responseCode);
        }

        // Disconnect from the endpoint
        connection.disconnect();
    }
}
