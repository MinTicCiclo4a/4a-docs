package com.citas.citas_ms.models;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Persona {

    @Id
    private String document;
    private Integer phone;
    private Date date_of_birth;
    private String address;
    private String city;

    public Persona(String document, Integer phone, Date date_of_birth, String address, String city) {
        this.document = document;
        this.phone = phone;
        this.date_of_birth = date_of_birth;
        this.address = address;
        this.city = city;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
