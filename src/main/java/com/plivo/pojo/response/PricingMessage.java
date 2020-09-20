package com.plivo.pojo.response;

public class PricingMessage {
    public String country;
    public int country_code;
    public String country_iso;
    public PricingMessagee message;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getCountry_code() {
        return country_code;
    }

    public void setCountry_code(int country_code) {
        this.country_code = country_code;
    }

    public String getCountry_iso() {
        return country_iso;
    }

    public void setCountry_iso(String country_iso) {
        this.country_iso = country_iso;
    }

    public PricingMessagee getMessage() {
        return message;
    }

    public void setMessage(PricingMessagee message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "PricingMessage{" +
                "country='" + country + '\'' +
                ", country_code=" + country_code +
                ", country_iso='" + country_iso + '\'' +
                ", message=" + message +
                '}';
    }
}
