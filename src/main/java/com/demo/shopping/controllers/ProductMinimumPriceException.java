package com.demo.shopping.controllers;

public class ProductMinimumPriceException extends RuntimeException {

    public ProductMinimumPriceException( ) {
        this("min price must be greater than or equals to zero");
    }
    public ProductMinimumPriceException(String message ) {
        super(message);
    }
    public ProductMinimumPriceException(double min) {
        this("min price must be greater than or equals to zero but was "+min);
    }
}
