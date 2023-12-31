//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.1 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.21 at 01:16:10 AM IST 
//


package com.mqconsumer.demo.schema;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Root" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="meldingshode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="subscriber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="subscriberStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="itemWeight" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
 *                   &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "root"
})
@XmlRootElement(name = "RootElement")
public class RootElement {

    @XmlElement(name = "Root", required = true)
    protected List<RootElement.Root> root;

    /**
     * Gets the value of the root property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the root property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RootElement.Root }
     * 
     * 
     */
    public List<RootElement.Root> getRoot() {
        if (root == null) {
            root = new ArrayList<RootElement.Root>();
        }
        return this.root;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="meldingshode" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="subscriber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="subscriberStatus" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="itemWeight" type="{http://www.w3.org/2001/XMLSchema}unsignedByte"/&gt;
     *         &lt;element name="itemName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "meldingshode",
        "subscriber",
        "subscriberStatus",
        "itemWeight",
        "itemName"
    })
    public static class Root {

        @XmlElement(required = true)
        protected String meldingshode;
        @XmlElement(required = true)
        protected String subscriber;
        @XmlElement(required = true)
        protected String subscriberStatus;
        @XmlSchemaType(name = "unsignedByte")
        protected short itemWeight;
        @XmlElement(required = true)
        protected String itemName;

        /**
         * Gets the value of the meldingshode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMeldingshode() {
            return meldingshode;
        }

        /**
         * Sets the value of the meldingshode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMeldingshode(String value) {
            this.meldingshode = value;
        }

        /**
         * Gets the value of the subscriber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriber() {
            return subscriber;
        }

        /**
         * Sets the value of the subscriber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriber(String value) {
            this.subscriber = value;
        }

        /**
         * Gets the value of the subscriberStatus property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubscriberStatus() {
            return subscriberStatus;
        }

        /**
         * Sets the value of the subscriberStatus property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubscriberStatus(String value) {
            this.subscriberStatus = value;
        }

        /**
         * Gets the value of the itemWeight property.
         * 
         */
        public short getItemWeight() {
            return itemWeight;
        }

        /**
         * Sets the value of the itemWeight property.
         * 
         */
        public void setItemWeight(short value) {
            this.itemWeight = value;
        }

        /**
         * Gets the value of the itemName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemName() {
            return itemName;
        }

        /**
         * Sets the value of the itemName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemName(String value) {
            this.itemName = value;
        }

    }

}
