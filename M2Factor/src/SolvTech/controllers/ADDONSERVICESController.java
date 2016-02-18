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

public class ADDONSERVICESController extends BaseController {
    /**
     * Initialize the base controller using the given http client
     */
    public ADDONSERVICESController() {
        super();
    }

    /**
     * Initialize the base controller using the given http client
     *
     * @param _client The given http client */
    public ADDONSERVICESController(HttpClient _client) {
        super(_client);
    }

    /**
     * Check Balance For Addon Services
     * @param    apiKey    Required parameter: 2Factor account API Key
     * @param    serviceName    Required parameter: Name of the addon service
	 * @return	Returns the CheckBalanceAddonServicesModel response from the API call*/
    public void getCheckBalanceAddonServicesAsync(
            final String apiKey,
            final String serviceName,
            final APICallBack<CheckBalanceAddonServicesModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/V1/{api_key}/ADDON_SERVICES/BAL/{service_name}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5409122281592144654L;
            {
                    put( "api_key", apiKey );
                    put( "service_name", serviceName );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5037131286232572379L;
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
                            CheckBalanceAddonServicesModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<CheckBalanceAddonServicesModel>(){});

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
     * Pull Delivery Report - Transactional SMS
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    sessionId    Required parameter: Session Id Returned By Send SMS Step
	 * @return	Returns the LinkedHashMap<String, Object> response from the API call*/
    public void getPullDeliveryReportAsync(
            final String apiKey,
            final String sessionId,
            final APICallBack<LinkedHashMap<String, Object>> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/V1/{api_key}/ADDON_SERVICES/RPT/TSMS/{session_id}");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5760719616217960259L;
            {
                    put( "api_key", apiKey );
                    put( "session_id", sessionId );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5280944965405123320L;
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
                            LinkedHashMap<String, Object> result = APIHelper.deserialize(((HttpStringResponse)response).getBody());

                            //let the caller know of the success
                            callBack.onSuccess(context, result);
                        } catch (APIException error) {
                            //let the caller know of the error
                            callBack.onFailure(context, error);
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
     * Send Single / Bulk Transactional Messages / Schedule SMS
     * @param    apiKey    Required parameter: API Obtained From 2Factor.in
     * @param    from    Required parameter: 6 Character Alphabet Sender Id
     * @param    msg    Required parameter: SMS Body To Be Sent
     * @param    to    Required parameter: Comma Separated list Of Phone Numbers
     * @param    sendAt    Optional parameter: This Parameter Is Used For Scheduling SMS - Optional parameter
     * @param    fieldParameters    Additional optional form parameters are supported by this endpoint
	 * @return	Returns the SendTransactionalSmsModel response from the API call*/
    public void createSendTransactionalSMSAsync(
            final String apiKey,
            final String from,
            final String msg,
            final String to,
            final String sendAt,
            Map<String, Object> fieldParameters,
            final APICallBack<SendTransactionalSmsModel> callBack
    ) {
        //the base uri for api requests
        String baseUri = Configuration.baseUri;

        //prepare query string for API call
        StringBuilder queryBuilder = new StringBuilder(baseUri);
        queryBuilder.append("/V1/{api_key}/ADDON_SERVICES/SEND/TSMS");

        //process template parameters
        APIHelper.appendUrlWithTemplateParameters(queryBuilder, new HashMap<String, Object>() {
            private static final long serialVersionUID = 5747647995542971627L;
            {
                    put( "api_key", apiKey );
            }});
        //validate and preprocess url
        String queryUrl = APIHelper.cleanUrl(queryBuilder);

        //load all headers for the outgoing API request
        Map<String, String> headers = new HashMap<String, String>() {
            private static final long serialVersionUID = 5551538088515400250L;
            {
                    put( "user-agent", "2Factor" );
                    put( "accept", "application/json" );
            }
        };

        //load all fields for the outgoing API request
        Map<String, Object> parameters = new HashMap<String, Object>() {
            private static final long serialVersionUID = 5251357670811824492L;
            {
                    put( "From", from );
                    put( "Msg", msg );
                    put( "To", to );
                    put( "SendAt", (null != sendAt) ? sendAt : "2019-01-01 00:00:01" );
            }
        };
        parameters.putAll( fieldParameters );

        //prepare and invoke the API call request to fetch the response
        final HttpRequest request = clientInstance.post(queryUrl, headers, APIHelper.prepareFormFields(parameters));

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
                            SendTransactionalSmsModel result = APIHelper.deserialize(((HttpStringResponse)response).getBody(),
                                                        new TypeReference<SendTransactionalSmsModel>(){});

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