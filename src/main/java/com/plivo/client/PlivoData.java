package com.plivo.client;

import com.google.gson.Gson;
import com.plivo.pojo.request.Numbers;
import com.plivo.pojo.request.sendSMS;
import com.plivo.pojo.response.Account;
import com.plivo.pojo.response.Message;
import com.plivo.pojo.response.PricingMessage;
import com.plivo.pojo.response.smsResponse;
import io.restassured.response.Response;

public class PlivoData {
    public static String numberURI = "https://api.plivo.com/v1/Account/";
    public static String messageURI = "https://api.plivo.com/v1/Account/";
    public static String messageDetails = "https://api.plivo.com/v1/Account/" + Const.AUTH_ID + "/Message/";
    public static String pricing = "https://api.plivo.com/v1/Account/" + Const.AUTH_ID + "/Pricing/?country_iso=";
    public static String account = "https://api.plivo.com/v1/Account/" + Const.AUTH_ID + "/";


    public Numbers getNumbers() {
        String url = numberURI + Const.AUTH_ID + "/Number/";
        ApiClient apiClient = new ApiClient();
        Response response = apiClient.execute(url, null, Const.AUTH_ID, Const.AUTH_TOKEN, Method.GET, StatusCode.HTTP_OK);
        Gson gson = new Gson();
        Numbers numbersResponse = gson.fromJson(response.getBody().asString(), Numbers.class);
        return numbersResponse;
    }

    public smsResponse sendMessage(String src, String dst, String message) {
        String url = messageURI + Const.AUTH_ID + "/Message/";
        sendSMS sendSMS = new sendSMS();
        sendSMS.setSrc(src);
        sendSMS.setDst(dst);
        sendSMS.setText(message);
        ApiClient apiClient = new ApiClient();
        Gson gson = new Gson();
        String requestString = gson.toJson(sendSMS);
        Response response = apiClient.execute(url, requestString, Const.AUTH_ID, Const.AUTH_TOKEN, Method.POST, StatusCode.HTTP_ACCEPTED);
        smsResponse smsResponse = gson.fromJson(response.getBody().asString(), smsResponse.class);
        return smsResponse;
    }

    public Message getMessageDetails(String message_uuid) {
        String url = messageDetails + message_uuid + "/";
        ApiClient apiClient = new ApiClient();
        Response response = apiClient.execute(url, null, Const.AUTH_ID, Const.AUTH_TOKEN, Method.GET, StatusCode.HTTP_OK);
        Gson gson = new Gson();
        Message messageResponse = gson.fromJson(response.getBody().asString(), Message.class);
        return messageResponse;


    }

    public PricingMessage getPricing(Country country) {
        String url = pricing + country;
        ApiClient apiClient = new ApiClient();
        Response response = apiClient.execute(url, null, Const.AUTH_ID, Const.AUTH_TOKEN, Method.GET, StatusCode.HTTP_OK);
        Gson gson = new Gson();
        PricingMessage pricingMessage = gson.fromJson(response.getBody().asString(), PricingMessage.class);
        return pricingMessage;


    }

    public Account getAccountDetails() {
        ApiClient apiClient = new ApiClient();
        Response response = apiClient.execute(account, null, Const.AUTH_ID, Const.AUTH_TOKEN, Method.GET, StatusCode.HTTP_OK);
        Gson gson = new Gson();
        Account account = gson.fromJson(response.getBody().asString(), Account.class);
        return account;

    }

    public static void main(String[] args) {
        // getNumbers();
        //  sendMessage("17012531547","15186552109","hello there!!");
        //  getMessageDetails("e484a138-fb02-11ea-b9a4-0242ac110003");
        //  getPricing(Country.US);
        //  getAccountDetails();

    }
}

