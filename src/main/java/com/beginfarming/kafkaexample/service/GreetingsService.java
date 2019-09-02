package com.beginfarming.kafkaexample.service;

import com.beginfarming.kafkaexample.model.Greetings;

public interface GreetingsService {

    void sendGreeting(final Greetings greetings);
}
