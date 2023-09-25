package com.example.demo.exception;

import com.example.demo.dto.rest.base.ValidationItem;

import java.util.List;

public class ValidationException extends RuntimeException {
    private final transient List<ValidationItem> items;

    public ValidationException(List<ValidationItem> items) {
        this.items = items;
    }

    public List<ValidationItem> getItems() {
        return items;
    }

    public static ValidationException of(String name,
                                         Object value,
                                         String description) {
        return new ValidationException(List.of(
                new ValidationItem(name, String.valueOf(value), description)));
    }
}
