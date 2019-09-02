package com.beginfarming.kafkaexample.service;

import com.beginfarming.kafkaexample.model.Greetings;
import com.beginfarming.kafkaexample.streamkafka.GreetingsStreams;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;
import org.springframework.util.MimeTypeUtils;


@Service
@EnableKafka
public class GreetingsServiceImpl implements GreetingsService {


    private final GreetingsStreams greetingsStreams;

    public GreetingsServiceImpl(GreetingsStreams greetingsStreams) {
        this.greetingsStreams = greetingsStreams;
    }

    public void sendGreeting(final Greetings greetings) {

        MessageChannel messageChannel = greetingsStreams.outboundGreetings();
        messageChannel.send(MessageBuilder
                .withPayload(greetings)
                .setHeader(MessageHeaders.CONTENT_TYPE, MimeTypeUtils.APPLICATION_JSON)
                .build());
    }
}