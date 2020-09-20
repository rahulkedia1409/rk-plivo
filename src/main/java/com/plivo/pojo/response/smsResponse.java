package com.plivo.pojo.response;

import java.util.List;

public class smsResponse {
    public String api_id;
    public String message;
    public List<String> message_uuid;

    public String getApi_id() {
        return api_id;
    }

    public void setApi_id(String api_id) {
        this.api_id = api_id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<String> getMessage_uuid() {
        return message_uuid;
    }

    public void setMessage_uuid(List<String> message_uuid) {
        this.message_uuid = message_uuid;
    }

    @Override
    public String toString() {
        return "smsResponse{" +
                "api_id='" + api_id + '\'' +
                ", message='" + message + '\'' +
                ", message_uuid=" + message_uuid +
                '}';
    }
}
