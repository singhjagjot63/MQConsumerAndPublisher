package com.mqconsumer.demo.consumer;

import com.mqconsumer.demo.service.XmlParseDemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import javax.xml.bind.JAXBException;

@Component
public class MessageConsumer {

    @Autowired
    XmlParseDemoService xmlParseDemoService;
    private static final Logger LOG = LoggerFactory.getLogger(MessageConsumer.class);

    @JmsListener(destination = "extSystem")
    public void MessageListener(String message) throws JAXBException {
        if (!StringUtils.hasLength(message)) {
            throw new RuntimeException("Message is Empty");
        }
        xmlParseDemoService.getParsedXml(message);
        LOG.info("Message Received {}",message);
    }

}
