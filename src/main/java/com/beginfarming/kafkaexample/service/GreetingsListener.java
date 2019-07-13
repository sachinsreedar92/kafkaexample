package com.beginfarming.kafkaexample.service;

import com.beginfarming.kafkaexample.model.Greetings;
import com.beginfarming.kafkaexample.streamkafka.GreetingsStreams;
import org.apache.kafka.streams.kstream.KStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

@Component
@EnableKafka
public class GreetingsListener {

    private final static Logger logger = LoggerFactory.getLogger(GreetingsListener.class);


    @StreamListener(GreetingsStreams.INPUT)
    @SendTo("greetings-out")
    public KStream<?, Greetings> handleGreetings(@Payload Greetings greetings) {
        logger.info("Received greetings: {}", greetings);
        return null;
    }
}
