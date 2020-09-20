package com.plivo.pojo.request;

import com.plivo.pojo.AccountPhoneNumber;

import java.util.List;

public class Numbers {
    public String api_id;
    public List<AccountPhoneNumber> objects;

    public String getApi_id() {
        return api_id;
    }

    public void setApi_id(String api_id) {
        this.api_id = api_id;
    }

    public List<AccountPhoneNumber> getObjects() {
        return objects;
    }

    public void setObjects(List<AccountPhoneNumber> objects) {
        this.objects = objects;
    }

    @Override
    public String toString() {
        return "Numbers{" +
                "api_id='" + api_id + '\'' +
                ", objects=" + objects +
                '}';
    }
}
