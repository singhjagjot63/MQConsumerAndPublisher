//package com.mqconsumer.demo.domain;
//
//import jakarta.xml.bind.annotation.XmlElement;
//import jakarta.xml.bind.annotation.XmlRootElement;
//
//@XmlRootElement
//class Root {
//
//    private String meldingshode;
//    private String subscriber;
//    private String subscriberStatus;
//
//    @XmlElement
//    public String getMeldingshode() {
//        return meldingshode;
//    }
//
//    public void setMeldingshode(String meldingshode) {
//        this.meldingshode = meldingshode;
//    }
//
//    @XmlElement
//    public String getSubscriber() {
//        return subscriber;
//    }
//
//    public void setSubscriber(String subscriber) {
//        this.subscriber = subscriber;
//    }
//
//    @XmlElement
//    public String getSubscriberStatus() {
//        return subscriberStatus;
//    }
//
//    public void setSubscriberStatus(String subscriberStatus) {
//        this.subscriberStatus = subscriberStatus;
//    }
//
//    @Override
//    public String toString() {
//        return "Root{" +
//                "meldingshode='" + meldingshode + '\'' +
//                ", subscriber='" + subscriber + '\'' +
//                ", subscriberStatus='" + subscriberStatus + '\'' +
//                '}';
//    }
//}