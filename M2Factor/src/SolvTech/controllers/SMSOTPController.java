/*
 * M2Factor
 *
 * This file was automatically generated for 2Factor by APIMATIC BETA v2.0 on 02/18/2016
 */
package SolvTech.controllers;

import java.io.*;
import java.util.*;
import java.util.concurrent.*;
import com.fasterxml.jackson.core.type.TypeReference;

import SolvTech.http.client.HttpClient;
import SolvTech.http.client.HttpContext;
import SolvTech.http.request.HttpRequest;
import SolvTech.http.response.HttpResponse;
import SolvTech.http.response.HttpStringResponse;
import SolvTech.http.client.APICallBack;
import SolvTech.*;
import SolvTech.models.*;

public class SMSOTPController extends BaseController {
    /**
     * Initialize the base controller using the given http client
     */
    public SMSOTPController() {
        super();
    }

    /**
     * Initialize the base controller using the given http client
     *
     * @param _client The given http client */
    public SMSOTPController(HttpClient _client) {
        super(_client);
    }

    /**
     * This endpoint is used to check SMS OTP balance
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
	 * @return	Returns the CheckSmsBalanceModel response from the API call*/
    public void getCheckSMSBalanceAsync(
            final String apiKey,
            final APICallBack<CheckSmsBalanceModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/API/V1/{api_key}/BAL/SMS");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5705455041563516354L;
            {
                    put( "api_key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4680371899198633968L;
            {
                    put( "user-agent", "2Factor" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            CheckSmsBalanceModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<CheckSmsBalanceModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
    /**
     * This endpoint is used to send Auto Generated SMS OTP to India
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    phoneNumber    Required parameter: 10 Digit Indian Phone Number
	 * @return	Returns the SendingSmsOtpAutoGeneratedOtpModel response from the API call*/
    public void getSendingSMSOTPAutoGeneratedOTPAsync(
            final String apiKey,
            final String phoneNumber,
            final APICallBack<SendingSmsOtpAutoGeneratedOtpModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/API/V1/{api_key}/SMS/{phone_number}/AUTOGEN");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5415154524945062801L;
            {
                    put( "api_key", apiKey );
                    put( "phone_number", phoneNumber );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 4656965171094298583L;
            {
                    put( "user-agent", "2Factor" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            SendingSmsOtpAutoGeneratedOtpModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<SendingSmsOtpAutoGeneratedOtpModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
    /**
     * This endpoint is used to send Custom SMS OTP to India
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    otp    Required parameter: 4-6 Digit ( Numeric ) OTP code to be sent
     * @param    phoneNumber    Required parameter: 10 Digit Indian Phone Number
	 * @return	Returns the SendingSmsOtpModel response from the API call*/
    public void getSendingSMSOTPCustomOTPAsync(
            final String apiKey,
            final String otp,
            final String phoneNumber,
            final APICallBack<SendingSmsOtpModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/API/V1/{api_key}/SMS/{phone_number}/{otp}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5665648404774476708L;
            {
                    put( "api_key", apiKey );
                    put( "otp", otp );
                    put( "phone_number", phoneNumber );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5300651693188765537L;
            {
                    put( "user-agent", "2Factor" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            SendingSmsOtpModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<SendingSmsOtpModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
    /**
     * This endpoint is useful in verifying user entered OTP with sent OTP
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    otpInput    Required parameter: OTP Value input by end user
     * @param    sessionId    Required parameter: Verification session id returned in send OTP step
	 * @return	Returns the VerifyOtpInputModel response from the API call*/
    public void getVerifySMSOTPInputAsync(
            final String apiKey,
            final String otpInput,
            final String sessionId,
            final APICallBack<VerifyOtpInputModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/API/V1/{api_key}/SMS/VERIFY/{session_id}/{otp_input}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4850071765362699475L;
            {
                    put( "api_key", apiKey );
                    put( "otp_input", otpInput );
                    put( "session_id", sessionId );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5356542016830879311L;
            {
                    put( "user-agent", "2Factor" );
                    put( "accept", "application/json" );
            }
        };

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.get(queryUrl, headers, null);

        //invoke request and get response
        Runnable responseTask = new Runnable() {
            public void run() {
                //make the API call
                clientInstance.executeAsStringAsync(request, new APICallBack<HttpResponse>() {
                    public void onSuccess(HttpContext context, HttpResponse response) {
                        try {
                            //Error handling using HTTP status codes
                            int responseCode = response.getStatusCode();
                            if ((responseCode < 200) || (responseCode > 206)) //[200,206] = HTTP OK
                                throw new APIException("HTTP Response Not OK", responseCode, response.getRawBody());

                            //extract result from the http response
                            VerifyOtpInputModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<VerifyOtpInputModel>(){});

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
                        } catch (IOException ioException) {
                            //let the caller know of the caught IO Exception
                            callBack.onFailure(context, ioException);
                        } catch (Exception exception) {
                            //let the caller know of the caught Exception
                            callBack.onFailure(context, exception);
                        }
                    }
                    public void onFailure(HttpContext context, Throwable error) {
                        //let the caller know of the failure
                        callBack.onFailure(context, error);
                    }
                });
            }
        };

        //execute async using thread pool
        APIHelper.getScheduler().execute(responseTask);
    }
        
}