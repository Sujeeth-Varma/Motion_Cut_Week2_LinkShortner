import java.util.HashMap;
import java.util.Map;

public class URLShortener {
    private Map<String, String> urlMap;

    public URLShortener() {
        this.urlMap = new HashMap<>();
    }

    private String generateShortCode(String url) {
        int hashCode = url.hashCode();
        return Integer.toHexString(hashCode);
    }

    public String shortenURL(String originalURL) {
        String shortCode = generateShortCode(originalURL);
        urlMap.put(shortCode, originalURL);
        return "http://tiny-url/" + shortCode;
    }

    public String expandURL(String shortCode) {
        return urlMap.get(shortCode);
    }
}
