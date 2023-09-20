package com.mqconsumer.demo.service;

import com.mqconsumer.demo.domain.MQData;
import com.mqconsumer.demo.repository.MQDataRepository;
import com.mqconsumer.demo.schema.RootElement;
import com.mqconsumer.demo.validate.ValidateData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;


@Service
public class XmlParseDemoService {

    private final MQDataRepository mqDataRepository;
    private final ValidateData validateData;

    @Autowired
    public XmlParseDemoService(MQDataRepository mqDataRepository, ValidateData validateData) {
        this.mqDataRepository = mqDataRepository;
        this.validateData = validateData;
    }

    public void getParsedXml(String xmlString) throws JAXBException {
        JAXBContext context = JAXBContext.newInstance(RootElement.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();
        RootElement rootElement = (RootElement) unmarshaller.
                unmarshal(new StringReader(xmlString));
       List<MQData> mqData = convertXMLObject(rootElement);
       if(validateData.dataValidation(mqData)) {
           for (MQData mq : mqData) {
               mqDataRepository.save(mq);
           }
       }
    }

    public List<MQData> convertXMLObject(RootElement rootElement) {
        List<MQData> mqData = new ArrayList<>();
        for (RootElement.Root root: rootElement.getRoot()) {
            MQData mqDataObj = new MQData();
            mqDataObj.setSubscriber(root.getSubscriber());
            mqDataObj.setStatus(root.getSubscriberStatus());
            mqDataObj.setCustomerNo(root.getMeldingshode());
            mqDataObj.setItemName(root.getItemName());
            mqDataObj.setIteamWeight(root.getItemWeight());
            mqData.add(mqDataObj);
        }
        return mqData;
    }
}
