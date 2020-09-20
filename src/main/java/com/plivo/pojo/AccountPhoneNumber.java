package com.plivo.pojo;

public class AccountPhoneNumber {
    public String number;
    public String alias;
    public String subaccount;
    public String added_on;
    public String application;
    public String carrier;
    public String region;
    public String number_type;
    public String monthly_rental_rate;
    public boolean sms_enabled;
    public String sms_rate;
    public boolean mms_enabled;
    public String mms_rate;
    public boolean voice_enabled;
    public String voice_rate;
    public String resource_uri;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSubaccount() {
        return subaccount;
    }

    public void setSubaccount(String subaccount) {
        this.subaccount = subaccount;
    }

    public String getAdded_on() {
        return added_on;
    }

    public void setAdded_on(String added_on) {
        this.added_on = added_on;
    }

    public String getApplication() {
        return application;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getNumber_type() {
        return number_type;
    }

    public void setNumber_type(String number_type) {
        this.number_type = number_type;
    }

    public String getMonthly_rental_rate() {
        return monthly_rental_rate;
    }

    public void setMonthly_rental_rate(String monthly_rental_rate) {
        this.monthly_rental_rate = monthly_rental_rate;
    }

    public boolean isSms_enabled() {
        return sms_enabled;
    }

    public void setSms_enabled(boolean sms_enabled) {
        this.sms_enabled = sms_enabled;
    }

    public String getSms_rate() {
        return sms_rate;
    }

    public void setSms_rate(String sms_rate) {
        this.sms_rate = sms_rate;
    }

    public boolean isMms_enabled() {
        return mms_enabled;
    }

    public void setMms_enabled(boolean mms_enabled) {
        this.mms_enabled = mms_enabled;
    }

    public String getMms_rate() {
        return mms_rate;
    }

    public void setMms_rate(String mms_rate) {
        this.mms_rate = mms_rate;
    }

    public boolean isVoice_enabled() {
        return voice_enabled;
    }

    public void setVoice_enabled(boolean voice_enabled) {
        this.voice_enabled = voice_enabled;
    }

    public String getVoice_rate() {
        return voice_rate;
    }

    public void setVoice_rate(String voice_rate) {
        this.voice_rate = voice_rate;
    }

    public String getResource_uri() {
        return resource_uri;
    }

    public void setResource_uri(String resource_uri) {
        this.resource_uri = resource_uri;
    }

    @Override
    public String toString() {
        return "AccountPhoneNumber{" +
                "number='" + number + '\'' +
                ", alias='" + alias + '\'' +
                ", subaccount='" + subaccount + '\'' +
                ", added_on='" + added_on + '\'' +
                ", application='" + application + '\'' +
                ", carrier='" + carrier + '\'' +
                ", region='" + region + '\'' +
                ", number_type='" + number_type + '\'' +
                ", monthly_rental_rate='" + monthly_rental_rate + '\'' +
                ", sms_enabled=" + sms_enabled +
                ", sms_rate='" + sms_rate + '\'' +
                ", mms_enabled=" + mms_enabled +
                ", mms_rate='" + mms_rate + '\'' +
                ", voice_enabled=" + voice_enabled +
                ", voice_rate='" + voice_rate + '\'' +
                ", resource_uri='" + resource_uri + '\'' +
                '}';
    }
}
