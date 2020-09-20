package com.plivo.client;

import com.plivo.helper.LoggerHelper;
import io.restassured.RestAssured;
import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.testng.Assert;

public class ApiClient {
    public static Logger logger = LoggerHelper.getLogger(ApiClient.class);


    public Response execute(String URL, String bodyAsString, String authId, String authToken, Method method, StatusCode expectedStatusCode) {


        RequestSpecification requestSpecification = RestAssured.given()
                .auth()
                .preemptive()
                .basic(authId, authToken);
        requestSpecification.accept("application/json");
        requestSpecification.contentType("application/json");


        Response response = null;
        if (method.equals(Method.POST)) {
            requestSpecification.body(bodyAsString);
            try {
                response = requestSpecification.post(URL);
            } catch (Exception e) {
                logger.log(Priority.INFO, e.getMessage());
            }

        } else {
            try {
                response = requestSpecification.get(URL);
            } catch (Exception e) {
                logger.log(Priority.INFO, e.getMessage());
            }

        }
        Assert.assertEquals(response.getStatusCode(), expectedStatusCode.getId(), "The Api is not responding");
        logger.log(Priority.INFO, "GET is successfull");
        return response;
    }

    public static void main(String[] args) {

        //  execute("https://api.plivo.com/v1/Account/MAMWU1M2FKMZCXMWUZOG/Number/", null, Const.AUTH_ID, Const.AUTH_TOKEN, Method.GET);

    }

}
