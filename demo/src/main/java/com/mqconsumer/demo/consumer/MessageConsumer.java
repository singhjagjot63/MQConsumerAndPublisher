package com.mqconsumer.demo.consumer;

import com.mqconsumer.demo.domain.SystemMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;


@Component
public class MessageConsumer {

    private static final Logger LOG = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "whiteHouse-extSystem")
    public void MessageListener(SystemMessage message) {

        LOG.info("Message Received {}",message);
    }



}
