package com.beginfarming.kafkaexample.streamkafka;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

@EnableKafka
public interface GreetingsStreams {


    String INPUT = "greetings-in";
    String OUTPUT = "greetings-out";


    @Input(INPUT)
    SubscribableChannel inboundGreetings();

    @Output(OUTPUT)
    MessageChannel outboundGreetings();
}