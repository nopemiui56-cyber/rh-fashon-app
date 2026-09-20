package com.rhfashon.app;

public final class Api {
    public static final String BASE = "https://rh.free.je";
    public static final String STORE = BASE + "/wp-json/wc/store/v1";
    public static final String PRODUCTS = STORE + "/products";
    public static final String CATEGORIES = STORE + "/products/categories";
    public static final String CHECKOUT = BASE + "/checkout/";
    public static final String ACCOUNT = BASE + "/my-account/";
    private Api() {}
}
