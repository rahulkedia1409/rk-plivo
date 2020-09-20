package com.plivo.pojo.response;

public class Account {
    public String account_type;
    public String address;
    public String auth_id;
    public boolean auto_recharge;
    public String billing_mode;
    public String state;
    public String cash_credits;
    public String city;
    public String name;
    public String resource_uri;
    public String timezone;

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAuth_id() {
        return auth_id;
    }

    public void setAuth_id(String auth_id) {
        this.auth_id = auth_id;
    }

    public boolean isAuto_recharge() {
        return auto_recharge;
    }

    public void setAuto_recharge(boolean auto_recharge) {
        this.auto_recharge = auto_recharge;
    }

    public String getBilling_mode() {
        return billing_mode;
    }

    public void setBilling_mode(String billing_mode) {
        this.billing_mode = billing_mode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCash_credits() {
        return cash_credits;
    }

    public void setCash_credits(String cash_credits) {
        this.cash_credits = cash_credits;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResource_uri() {
        return resource_uri;
    }

    public void setResource_uri(String resource_uri) {
        this.resource_uri = resource_uri;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    @Override
    public String toString() {
        return "Account{" +
                "account_type='" + account_type + '\'' +
                ", address='" + address + '\'' +
                ", auth_id='" + auth_id + '\'' +
                ", auto_recharge=" + auto_recharge +
                ", billing_mode='" + billing_mode + '\'' +
                ", state='" + state + '\'' +
                ", cash_credits='" + cash_credits + '\'' +
                ", city='" + city + '\'' +
                ", name='" + name + '\'' +
                ", resource_uri='" + resource_uri + '\'' +
                ", timezone='" + timezone + '\'' +
                '}';
    }
}
