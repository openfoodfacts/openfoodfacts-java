package pl.coderion.service.impl;

import io.micronaut.http.client.HttpClient;
import javax.inject.Singleton;
import lombok.extern.slf4j.Slf4j;
import pl.coderion.client.OpenFoodFactsApiLowLevelClient;
import pl.coderion.model.ProductResponse;
import pl.coderion.service.OpenFoodFactsWrapper;

@Slf4j
@Singleton
public class OpenFoodFactsWrapperImpl implements OpenFoodFactsWrapper {

  private OpenFoodFactsApiLowLevelClient client;

  public OpenFoodFactsWrapperImpl() {
    try {
      this.client = new OpenFoodFactsApiLowLevelClient(HttpClient.create(null));
    } catch (Exception e) {
      log.error(e.getMessage(), e);
      throw new RuntimeException(e);
    }
  }

  @Override
  public ProductResponse fetchProductByCode(String code) {
    return client.fetchProductByCode(code);
  }
}
