package pl.coderion.service;

import pl.coderion.model.ProductResponse;

public interface OpenFoodFactsWrapper {

  /**
   * Returns product by code.
   *
   * @param code product code
   * @return product
   */
  ProductResponse fetchProductByCode(String code);
}
