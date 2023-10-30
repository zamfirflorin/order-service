package com.polarbookshop.orderservice;

public record Book(
        String isbn,
        String title,

        String author,
        Double price
) {
}
