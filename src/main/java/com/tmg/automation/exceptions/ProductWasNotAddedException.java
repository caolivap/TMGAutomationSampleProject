package com.tmg.automation.exceptions;

public class ProductWasNotAddedException extends AssertionError {
    public static final String PRODUCT_NOT_ADDED_SHOPPING_CART = "The product was not visible into shopping cart";
    public ProductWasNotAddedException(String message, Throwable cause) {
        super(message, cause);
    }

}
