package com.mqconsumer.demo.validate;

import com.mqconsumer.demo.domain.MQData;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ValidateData {
    public Boolean dataValidation(List<MQData> mqData) {
        List<MQData> mqDataList = new ArrayList<>();
        mqDataList = mqData.stream().filter(x -> x.getIteamWeight() > 20).collect(Collectors.toList());
        mqDataList=mqDataList.stream().sorted(Comparator.comparingInt(MQData::getIteamWeight).reversed()).collect(Collectors.toList());
        if(!mqDataList.isEmpty()) {
            return true;
        }
        return false;
    }
}
