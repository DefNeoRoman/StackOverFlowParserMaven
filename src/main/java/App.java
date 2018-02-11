import model.UsersList;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

public class App {
    public static void main(String[] args) throws URISyntaxException {

        HttpClient httpClient = HttpClientBuilder.create().build();
        ClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpClient);
        String url = "https://api.stackexchange.com/2.2/users?order=desc&sort=reputation&site=stackoverflow&filter=!G*klMw.bdPL7GIqCsR2z1uOH5e";
        RestTemplate restTemplate = new RestTemplate(requestFactory);


       UsersList dto =  restTemplate.getForObject(new URI(url),   UsersList.class);
        System.out.println(dto);
    }
}
