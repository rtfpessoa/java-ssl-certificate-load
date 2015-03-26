import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception {
        SSLHelper.loadCerts();
        ApiClient apiClient = new ApiClient("https", "www.startssl.com", 443);
        System.out.println(apiClient.request("GET", "/", new HashMap<>()));
    }
}
