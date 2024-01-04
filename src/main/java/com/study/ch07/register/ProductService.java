package com.study.ch07.register;

public class ProductService {
    //boolean이면 is
    boolean isEmptyString(String str) {
        if (str == null) {
            return true;
        }
        return str.isBlank();
    }

    void registerProductService(Product product) {
        ProductRepository productRepository = new ProductRepository();

        System.out.println("서비스까지 데이터 전달함.");

        productRepository.saveProduct(product);
    }

}
