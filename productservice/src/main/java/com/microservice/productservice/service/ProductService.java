package com.microservice.productservice.service;

import com.microservice.productservice.responsePayload.ProductRequest;
import com.microservice.productservice.responsePayload.ProductResponse;

public interface ProductService {

    long addProduct(ProductRequest productRequest);

    ProductResponse getProductById(long productId);

    void reduceQuantity(long productId, long quantity);

    public void deleteProductById(long productId);
}
