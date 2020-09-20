package com.plivo.pojo.response;

public class Inbound {
    public String rate;

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Outbound{" +
                "rate='" + rate + '\'' +
                '}';
    }
}
