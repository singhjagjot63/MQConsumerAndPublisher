package com.mqconsumer.demo.service;

import com.mqconsumer.demo.schema.RootElement;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;


@Service
public class XmlParseDemoService {

    public void getParsedXml(String xmlString) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(RootElement.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        RootElement rootElement = (RootElement) unmarshaller.
                unmarshal(new StringReader(xmlString));
    }
}
