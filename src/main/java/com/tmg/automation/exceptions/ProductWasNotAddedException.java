package com.tmg.automation.exceptions;

public class ProductWasNotAddedException extends AssertionError {

    public static final String PRODUCT_NOT_ADDED_SHOPPING_CART = "The product message was added to shopping cart successfully is not visible";

    public ProductWasNotAddedException(String message, Throwable cause) {
        super(message, cause);
    }

}
