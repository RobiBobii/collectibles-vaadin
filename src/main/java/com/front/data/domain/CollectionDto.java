package com.front.data.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class CollectionDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("name")
    private String name;

    public CollectionDto(String name) {
        this.name = name;
    }
}