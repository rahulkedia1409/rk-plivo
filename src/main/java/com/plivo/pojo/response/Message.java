package com.plivo.pojo.response;

public class Message {
    public String message_uuid;
    public String message_time;
    public String message_direction;
    public String message_state;
    public String message_type;
    public String from_number;
    public String to_number;
    public int units;
    public String total_rate;
    public String total_amount;
    public String error_code;

    public String getMessage_uuid() {
        return message_uuid;
    }

    public void setMessage_uuid(String message_uuid) {
        this.message_uuid = message_uuid;
    }

    public String getMessage_time() {
        return message_time;
    }

    public void setMessage_time(String message_time) {
        this.message_time = message_time;
    }

    public String getMessage_direction() {
        return message_direction;
    }

    public void setMessage_direction(String message_direction) {
        this.message_direction = message_direction;
    }

    public String getMessage_state() {
        return message_state;
    }

    public void setMessage_state(String message_state) {
        this.message_state = message_state;
    }

    public String getMessage_type() {
        return message_type;
    }

    public void setMessage_type(String message_type) {
        this.message_type = message_type;
    }

    public String getFrom_number() {
        return from_number;
    }

    public void setFrom_number(String from_number) {
        this.from_number = from_number;
    }

    public String getTo_number() {
        return to_number;
    }

    public void setTo_number(String to_number) {
        this.to_number = to_number;
    }

    public int getUnits() {
        return units;
    }

    public void setUnits(int units) {
        this.units = units;
    }

    public String getTotal_rate() {
        return total_rate;
    }

    public void setTotal_rate(String total_rate) {
        this.total_rate = total_rate;
    }

    public String getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(String total_amount) {
        this.total_amount = total_amount;
    }

    public String getError_code() {
        return error_code;
    }

    public void setError_code(String error_code) {
        this.error_code = error_code;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message_uuid='" + message_uuid + '\'' +
                ", message_time='" + message_time + '\'' +
                ", message_direction='" + message_direction + '\'' +
                ", message_state='" + message_state + '\'' +
                ", message_type='" + message_type + '\'' +
                ", from_number='" + from_number + '\'' +
                ", to_number='" + to_number + '\'' +
                ", units=" + units +
                ", total_rate='" + total_rate + '\'' +
                ", total_amount='" + total_amount + '\'' +
                ", error_code='" + error_code + '\'' +
                '}';
    }
}
