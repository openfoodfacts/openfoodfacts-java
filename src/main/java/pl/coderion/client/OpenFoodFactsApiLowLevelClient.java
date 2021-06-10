package pl.coderion.client;

import io.micronaut.http.HttpHeaders;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.MediaType;
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import javax.inject.Singleton;
import pl.coderion.model.ProductResponse;

@Singleton
public class OpenFoodFactsApiLowLevelClient {

  private static final String API_URL = "https://world.openfoodfacts.org/api/v0";

  private final HttpClient httpClient;

  public OpenFoodFactsApiLowLevelClient(@Client HttpClient httpClient) throws Exception {
    this.httpClient = httpClient;
  }

  public ProductResponse fetchProductByCode(String code) {
    HttpRequest<?> request =
        HttpRequest.GET(String.format("%s/product/%s.json", API_URL, code))
            .header(HttpHeaders.CONTENT_TYPE, MediaType.TEXT_JSON);
    ProductResponse response = httpClient.toBlocking().retrieve(request, ProductResponse.class);
    return response;
  }
}
