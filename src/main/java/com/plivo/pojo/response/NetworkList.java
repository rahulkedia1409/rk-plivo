package com.plivo.pojo.response;

public class NetworkList {
    public String group_name;
    public String rate;

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "NetworkList{" +
                "group_name='" + group_name + '\'' +
                ", rate='" + rate + '\'' +
                '}';
    }
}
