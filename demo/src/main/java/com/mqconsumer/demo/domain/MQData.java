package com.mqconsumer.demo.domain;

import com.sun.istack.NotNull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "mq_data")
public class MQData {

    @Id
    @NotNull
    @Column(name = "customerno")
    private String customerNo;
    @NotNull
    @Column(name = "subscriber")
    private String subscriber;
    @NotNull
    @Column(name = "status")
    private String status;

    @Column(name = "itemname")
    private String itemName;

    @Column(name = "item_weight")
    private int iteamWeight;

    public String getCustomerNo() {
        return customerNo;
    }

    public void setCustomerNo(String customerNo) {
        this.customerNo = customerNo;
    }

    public String getSubscriber() {
        return subscriber;
    }

    public void setSubscriber(String subscriber) {
        this.subscriber = subscriber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getIteamWeight() {
        return iteamWeight;
    }

    public void setIteamWeight(int iteamWeight) {
        this.iteamWeight = iteamWeight;
    }
}
