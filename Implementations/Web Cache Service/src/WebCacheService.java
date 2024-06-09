import java.util.HashMap;

public class WebCacheService {
    private HashMap<String, String> cache;

    public WebCacheService(){
        cache = new HashMap<>();
    }

    private String fetchWebPageContent(String url){
        return "Content of "+ url;
    }

    public String getWebPageContent(String url){
        if(cache.containsKey(url)){
            System.out.println("Fetching From Cache: "+url);
            return cache.get(url);
        } else {
            System.out.println("Fetching From Network: "+ url);
            String content = fetchWebPageContent(url);
            cache.put(url, content);
            return content;
        }
    }
    public static void main(String[] args) {
        WebCacheService WebPageCache = new WebCacheService();
        
        String url1 = "https://www.visageshare.vercel.app";
        String url2 = "https://creativeminds-devsire.vercel.app";

        System.out.println(WebPageCache.getWebPageContent(url1)); // Fetched From Network
        System.out.println(WebPageCache.getWebPageContent(url2));

        System.out.println(WebPageCache.getWebPageContent(url1)); // Fetched From Cache
        System.out.println(WebPageCache.getWebPageContent(url2));
    }
}
