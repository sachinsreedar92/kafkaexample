package com.beginfarming.kafkaexample.config;

import com.beginfarming.kafkaexample.streamkafka.GreetingsStreams;
import org.springframework.cloud.stream.annotation.EnableBinding;

@EnableBinding(GreetingsStreams.class)
public class StreamsConfig {
}
