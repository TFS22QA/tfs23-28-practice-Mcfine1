package ru.tinkoff.fintech.qa.apiModel;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;

public class User {

    @JsonProperty("id")
    Integer id;

    @JsonProperty("fio")
    String fio;

    @JsonProperty("phone")
    String phone;

    @JsonProperty("passportSeries")
    Integer passwordSeries;

    @JsonProperty("passportNumber")
    Integer passwordNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getPasswordSeries() {
        return passwordSeries;
    }

    public void setPasswordSeries(Integer passwordSeries) {
        this.passwordSeries = passwordSeries;
    }

    public Integer getPasswordNumber() {
        return passwordNumber;
    }

    public void setPasswordNumber(Integer passwordNumber) {
        this.passwordNumber = passwordNumber;
    }
}
