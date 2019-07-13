package com.beginfarming.kafkaexample.model;


// lombok autogenerates getters, setters, toString() and a builder (see https://projectlombok.org/):
import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class Greetings {
    private long timestamp;
    private String message;
}