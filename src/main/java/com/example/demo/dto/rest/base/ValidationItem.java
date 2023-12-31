package com.example.demo.dto.rest.base;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ValidationItem {

    @JsonProperty("name")
    private final String name;

    @JsonProperty("value")
    private final String value;

    @JsonProperty("description")
    private final String description;


    public ValidationItem(@JsonProperty("name") String name,
                          @JsonProperty("value") String value,
                          @JsonProperty("description") String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }
}
