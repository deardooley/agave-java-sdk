

package org.agave.client.api;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.agave.client.ApiCallback;
import org.agave.client.ApiClient;
import org.agave.client.ApiException;
import org.agave.client.ApiResponse;
import org.agave.client.Configuration;
import org.agave.client.Pair;
import org.agave.client.ProgressRequestBody;
import org.agave.client.ProgressResponseBody;
import org.agave.client.model.ClientRequest;
import org.agave.client.model.ClientSubscriptionRequest;
import org.agave.client.model.EmptyClientResponse;
import org.agave.client.model.MultipleClientResponse;
import org.agave.client.model.MultipleSubscriptionResponse;
import org.agave.client.model.SingleClientResponse;
import org.agave.client.model.SingleSubscriptionResponse;

public class ClientsApi {
    private ApiClient apiClient;

    public ClientsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClientsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addClient */
    private com.squareup.okhttp.Call addClientCall(ClientRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addClient(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/clients/v2/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "agaveBasic" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Create a new client
     * @param body The api client to create (required)
     * @return SingleClientResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SingleClientResponse addClient(ClientRequest body) throws ApiException {
        ApiResponse<SingleClientResponse> resp = addClientWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * 
     * Create a new client
     * @param body The api client to create (required)
     * @return ApiResponse&lt;SingleClientResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SingleClientResponse> addClientWithHttpInfo(ClientRequest body) throws ApiException {
        com.squareup.okhttp.Call call = addClientCall(body, null, null);
        Type localVarReturnType = new TypeToken<SingleClientResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create a new client
     * @param body The api client to create (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addClientAsync(ClientRequest body, final ApiCallback<SingleClientResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addClientCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SingleClientResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addClientAPISubscription */
    private com.squareup.okhttp.Call addClientAPISubscriptionCall(String clientName, ClientSubscriptionRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'clientName' is set
        if (clientName == null) {
            throw new ApiException("Missing the required parameter 'clientName' when calling addClientAPISubscription(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addClientAPISubscription(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/clients/v2/{clientName}/subscriptions".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "clientName" + "\\}", apiClient.escapeString(clientName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "agaveBasic" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Add a new API subscription to the given client
     * @param clientName The name of the client to be subscribe to this api (required)
     * @param body The api client to create (required)
     * @return SingleSubscriptionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SingleSubscriptionResponse addClientAPISubscription(String clientName, ClientSubscriptionRequest body) throws ApiException {
        ApiResponse<SingleSubscriptionResponse> resp = addClientAPISubscriptionWithHttpInfo(clientName, body);
        return resp.getData();
    }

    /**
     * 
     * Add a new API subscription to the given client
     * @param clientName The name of the client to be subscribe to this api (required)
     * @param body The api client to create (required)
     * @return ApiResponse&lt;SingleSubscriptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SingleSubscriptionResponse> addClientAPISubscriptionWithHttpInfo(String clientName, ClientSubscriptionRequest body) throws ApiException {
        com.squareup.okhttp.Call call = addClientAPISubscriptionCall(clientName, body, null, null);
        Type localVarReturnType = new TypeToken<SingleSubscriptionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add a new API subscription to the given client
     * @param clientName The name of the client to be subscribe to this api (required)
     * @param body The api client to create (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addClientAPISubscriptionAsync(String clientName, ClientSubscriptionRequest body, final ApiCallback<SingleSubscriptionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = addClientAPISubscriptionCall(clientName, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SingleSubscriptionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for clearClientAPISubscriptions */
    private com.squareup.okhttp.Call clearClientAPISubscriptionsCall(String clientName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'clientName' is set
        if (clientName == null) {
            throw new ApiException("Missing the required parameter 'clientName' when calling clearClientAPISubscriptions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/clients/v2/{clientName}/subscriptions".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "clientName" + "\\}", apiClient.escapeString(clientName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "agaveBasic" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Unsubscribe the client from all APIs
     * @param clientName The name of the client to be deleted (required)
     * @return EmptyClientResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmptyClientResponse clearClientAPISubscriptions(String clientName) throws ApiException {
        ApiResponse<EmptyClientResponse> resp = clearClientAPISubscriptionsWithHttpInfo(clientName);
        return resp.getData();
    }

    /**
     * 
     * Unsubscribe the client from all APIs
     * @param clientName The name of the client to be deleted (required)
     * @return ApiResponse&lt;EmptyClientResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmptyClientResponse> clearClientAPISubscriptionsWithHttpInfo(String clientName) throws ApiException {
        com.squareup.okhttp.Call call = clearClientAPISubscriptionsCall(clientName, null, null);
        Type localVarReturnType = new TypeToken<EmptyClientResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Unsubscribe the client from all APIs
     * @param clientName The name of the client to be deleted (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearClientAPISubscriptionsAsync(String clientName, final ApiCallback<EmptyClientResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = clearClientAPISubscriptionsCall(clientName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmptyClientResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteClient */
    private com.squareup.okhttp.Call deleteClientCall(String clientName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'clientName' is set
        if (clientName == null) {
            throw new ApiException("Missing the required parameter 'clientName' when calling deleteClient(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/clients/v2/{clientName}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "clientName" + "\\}", apiClient.escapeString(clientName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "agaveBasic" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Immediately deletes this client and renders the API keys useless.
     * @param clientName The name of the client to be deleted (required)
     * @return EmptyClientResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmptyClientResponse deleteClient(String clientName) throws ApiException {
        ApiResponse<EmptyClientResponse> resp = deleteClientWithHttpInfo(clientName);
        return resp.getData();
    }

    /**
     * 
     * Immediately deletes this client and renders the API keys useless.
     * @param clientName The name of the client to be deleted (required)
     * @return ApiResponse&lt;EmptyClientResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmptyClientResponse> deleteClientWithHttpInfo(String clientName) throws ApiException {
        com.squareup.okhttp.Call call = deleteClientCall(clientName, null, null);
        Type localVarReturnType = new TypeToken<EmptyClientResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Immediately deletes this client and renders the API keys useless.
     * @param clientName The name of the client to be deleted (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteClientAsync(String clientName, final ApiCallback<EmptyClientResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteClientCall(clientName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmptyClientResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getClient */
    private com.squareup.okhttp.Call getClientCall(String clientName, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'clientName' is set
        if (clientName == null) {
            throw new ApiException("Missing the required parameter 'clientName' when calling getClient(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/clients/v2/{clientName}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "clientName" + "\\}", apiClient.escapeString(clientName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "agaveBasic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Returns a detailed description of a named client.
     * @param clientName The name of the client to be deleted (required)
     * @return MultipleClientResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultipleClientResponse getClient(String clientName) throws ApiException {
        ApiResponse<MultipleClientResponse> resp = getClientWithHttpInfo(clientName);
        return resp.getData();
    }

    /**
     * 
     * Returns a detailed description of a named client.
     * @param clientName The name of the client to be deleted (required)
     * @return ApiResponse&lt;MultipleClientResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultipleClientResponse> getClientWithHttpInfo(String clientName) throws ApiException {
        com.squareup.okhttp.Call call = getClientCall(clientName, null, null);
        Type localVarReturnType = new TypeToken<MultipleClientResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns a detailed description of a named client.
     * @param clientName The name of the client to be deleted (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getClientAsync(String clientName, final ApiCallback<MultipleClientResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getClientCall(clientName, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MultipleClientResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listClientApiSubscriptions */
    private com.squareup.okhttp.Call listClientApiSubscriptionsCall(String clientName, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'clientName' is set
        if (clientName == null) {
            throw new ApiException("Missing the required parameter 'clientName' when calling listClientApiSubscriptions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/clients/v2/{clientName}/subscriptions".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "clientName" + "\\}", apiClient.escapeString(clientName.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "agaveBasic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Lists all APIs to which the client is subscribed
     * @param clientName The name of the client to be deleted (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return MultipleSubscriptionResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultipleSubscriptionResponse listClientApiSubscriptions(String clientName, Long limit, Long offset) throws ApiException {
        ApiResponse<MultipleSubscriptionResponse> resp = listClientApiSubscriptionsWithHttpInfo(clientName, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Lists all APIs to which the client is subscribed
     * @param clientName The name of the client to be deleted (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;MultipleSubscriptionResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultipleSubscriptionResponse> listClientApiSubscriptionsWithHttpInfo(String clientName, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listClientApiSubscriptionsCall(clientName, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<MultipleSubscriptionResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Lists all APIs to which the client is subscribed
     * @param clientName The name of the client to be deleted (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listClientApiSubscriptionsAsync(String clientName, Long limit, Long offset, final ApiCallback<MultipleSubscriptionResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listClientApiSubscriptionsCall(clientName, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MultipleSubscriptionResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listClients */
    private com.squareup.okhttp.Call listClientsCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/clients/v2/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "agaveBasic" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * List existing clients
     * @return MultipleClientResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultipleClientResponse listClients() throws ApiException {
        ApiResponse<MultipleClientResponse> resp = listClientsWithHttpInfo();
        return resp.getData();
    }

    /**
     * 
     * List existing clients
     * @return ApiResponse&lt;MultipleClientResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultipleClientResponse> listClientsWithHttpInfo() throws ApiException {
        com.squareup.okhttp.Call call = listClientsCall(null, null);
        Type localVarReturnType = new TypeToken<MultipleClientResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List existing clients
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listClientsAsync(final ApiCallback<MultipleClientResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listClientsCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MultipleClientResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
