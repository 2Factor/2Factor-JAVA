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

public class VOICEOTPController extends BaseController {
    /**
     * Initialize the base controller using the given http client
     */
    public VOICEOTPController() {
        super();
    }

    /**
     * Initialize the base controller using the given http client
     *
     * @param _client The given http client */
    public VOICEOTPController(HttpClient _client) {
        super(_client);
    }

    /**
     * This endpoint is used to check VOICE OTP balance
     * @param    apiKey    Required parameter: Check VOICE OTP Balance
	 * @return	Returns the CheckVoiceBalanceModel response from the API call*/
    public void getCheckVoiceBalanceAsync(
            final String apiKey,
            final APICallBack<CheckVoiceBalanceModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/API/V1/{api_key}/BAL/VOICE");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5527861707149714634L;
            {
                    put( "api_key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5139366756972124683L;
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
                            CheckVoiceBalanceModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<CheckVoiceBalanceModel>(){});

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
     * This endpoint is used to send Auto Generated VOICE OTP to India
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    phoneNumber    Required parameter: 10 Digit Indian Phone Number
	 * @return	Returns the SendingVoiceOtpAutoGeneratedOtpModel response from the API call*/
    public void getSendingVOICEOTPAutoGeneratedOTPAsync(
            final String apiKey,
            final String phoneNumber,
            final APICallBack<SendingVoiceOtpAutoGeneratedOtpModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/API/V1/{api_key}/VOICE/{phone_number}/AUTOGEN");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5757594694281192606L;
            {
                    put( "api_key", apiKey );
                    put( "phone_number", phoneNumber );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5129856720709723372L;
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
                            SendingVoiceOtpAutoGeneratedOtpModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<SendingVoiceOtpAutoGeneratedOtpModel>(){});

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
     * This endpoint is used to send VOICE OTP to India
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    otp    Required parameter: 4 Digit ( Numeric ) OTP code to be sent
     * @param    phoneNumber    Required parameter: 10 Digit Indian Phone Number
	 * @return	Returns the SendingVoiceOtpModel response from the API call*/
    public void getSendingVoiceOTPCustomOTPAsync(
            final String apiKey,
            final int otp,
            final String phoneNumber,
            final APICallBack<SendingVoiceOtpModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/API/V1/{api_key}/VOICE/{phone_number}/{otp}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4708038206282278466L;
            {
                    put( "api_key", apiKey );
                    put( "otp", otp );
                    put( "phone_number", phoneNumber );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5008809405900216645L;
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
                            SendingVoiceOtpModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<SendingVoiceOtpModel>(){});

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
	 * @return	Returns the VerifyVoiceOtpInputModel response from the API call*/
    public void getVerifyVOICEOTPInputAsync(
            final String apiKey,
            final String otpInput,
            final String sessionId,
            final APICallBack<VerifyVoiceOtpInputModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/API/V1/{api_key}/VOICE/VERIFY/{session_id}/{otp_input}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 4662155727417314363L;
            {
                    put( "api_key", apiKey );
                    put( "otp_input", otpInput );
                    put( "session_id", sessionId );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5345636930385308580L;
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
                            VerifyVoiceOtpInputModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<VerifyVoiceOtpInputModel>(){});

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