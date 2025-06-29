package com.goodies.distributor.goodies_distributor.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;


@Document(collection = "event_details")
public class EventDetails {

    @Id
    private String eventId;
    private String eventName;
    private Date startDate;
    private Date endDate;
    private String goodiesDesc;
    private String qrCodeUrl;

    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    public void setGoodiesDesc(String goodiesDesc){
        this.goodiesDesc = goodiesDesc;
    }

    public void setStartDate(Date date){
        this.startDate = date;
    }

    public void setEndDate(Date date){
        this.endDate = date;
    }

    public String getQrCodeUrl() {
        return qrCodeUrl;
    }

    public void setQrCodeUrl(String qrCode) {
        this.qrCodeUrl = qrCode;
    }

    public String getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getGoodiesDesc() {
        return goodiesDesc;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }
}