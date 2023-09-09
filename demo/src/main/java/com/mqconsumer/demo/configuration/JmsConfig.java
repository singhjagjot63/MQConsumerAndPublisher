package com.mqconsumer.demo.configuration;

import jakarta.jms.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

@Configuration
@EnableJms
public class JmsConfig {

    @Bean
    DefaultJmsListenerContainerFactory defaultJmsListenerContainerFactory(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory jmsListenerContainerFactory =
                new DefaultJmsListenerContainerFactory();
        jmsListenerContainerFactory.setConnectionFactory(connectionFactory);
        jmsListenerContainerFactory.setConcurrency("5-10");

        return jmsListenerContainerFactory;
    }
}
