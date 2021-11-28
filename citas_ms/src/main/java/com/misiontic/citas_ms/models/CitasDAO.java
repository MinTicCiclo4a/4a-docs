package com.misiontic.citas_ms.models;

import nonapi.io.github.classgraph.json.Id;

import java.time.LocalDate;

public class CitasDAO {

    @Id
    private Integer Document;
    private String name;
    private String are;
    private LocalDate date;

    public Integer getDocument() {
        return Document;
    }

    public void setDocument(Integer document) {
        Document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAre() {
        return are;
    }

    public void setAre(String are) {
        this.are = are;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
