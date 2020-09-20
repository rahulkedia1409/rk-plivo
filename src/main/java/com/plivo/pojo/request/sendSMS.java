package com.plivo.pojo.request;

public class sendSMS {
    // Sender's phone number with country code
    public String src;
    public String dst;
    public String text;


    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getDst() {
        return dst;
    }

    public void setDst(String dst) {
        this.dst = dst;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "sendSMS{" +
                "src='" + src + '\'' +
                ", dst='" + dst + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
