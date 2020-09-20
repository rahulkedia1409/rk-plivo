package com.plivo.test;

import com.plivo.client.Country;
import com.plivo.client.PlivoData;
import com.plivo.pojo.AccountPhoneNumber;
import com.plivo.pojo.request.Numbers;
import com.plivo.pojo.response.Account;
import com.plivo.pojo.response.Message;
import com.plivo.pojo.response.PricingMessage;
import com.plivo.pojo.response.smsResponse;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;
import java.util.Random;

public class Test {


    private List<AccountPhoneNumber> Accounts;

    @org.testng.annotations.Test
    public void testUserDetails() {

        SoftAssert softAssert = new SoftAssert();
        // get two different numbers
        PlivoData plivoData = new PlivoData();
        Numbers numbers = plivoData.getNumbers();
        Accounts = numbers.getObjects();
        Random random = new Random();

        int rand_int1 = random.nextInt(Accounts.size());
        int rand_int2 = random.nextInt(Accounts.size());

        while (rand_int1 == rand_int2) {
            rand_int1 = random.nextInt(Accounts.size());
            rand_int2 = random.nextInt(Accounts.size());
        }
        String senderNumber = Accounts.get(rand_int1).getNumber();
        String receiverNumber = Accounts.get(rand_int2).getNumber();

        // send message
        smsResponse messageResponse = plivoData.sendMessage(senderNumber, receiverNumber, "Hello there!!!");
        String msg_uuid = messageResponse.getMessage_uuid().get(0);
        Message messageDetails = plivoData.getMessageDetails(msg_uuid);
        // get amount deducted
        String amountDeducted = messageDetails.getTotal_rate();

        PricingMessage pricing = plivoData.getPricing(Country.US);
        String outboundRate = pricing.getMessage().outbound.rate;
        softAssert.assertEquals(amountDeducted, outboundRate, "rate and the price deducted for the sending message not same!!");

        Account accountDetails = plivoData.getAccountDetails();
        String account_cash_credit = accountDetails.getCash_credits();
        if (Math.abs(Integer.parseInt(account_cash_credit)) < Integer.parseInt(amountDeducted)) {
            softAssert.assertTrue(true, "account cash credit\n" +
                    "should be less than by the deducted amount.");
        } else {
            softAssert.assertFalse(false, "cash credit is more!!!");
        }
        softAssert.assertAll();

    }
}