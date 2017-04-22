

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
import org.agave.client.model.UUIDRequest;
import org.agave.client.model.UUIDResolution;
import org.agave.client.model.UUIDSummary;

public class UuidsApi {
    private ApiClient apiClient;

    public UuidsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UuidsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for createUuid */
    private com.squareup.okhttp.Call createUuidCall(UUIDRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling createUuid(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling createUuid(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/uuids/v2/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (naked != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "naked", naked));

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

        String[] localVarAuthNames = new String[] { "agaveImplicit", "agavePassword", "agaveApplication" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Generate a new UUID for a given resource type
     * @param body The type of resource for which the UUID should be generated. (required)
     * @param naked  (required)
     * @return List&lt;UUIDResolution&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<UUIDResolution> createUuid(UUIDRequest body, Boolean naked) throws ApiException {
        ApiResponse<List<UUIDResolution>> resp = createUuidWithHttpInfo(body, naked);
        return resp.getData();
    }

    /**
     * 
     * Generate a new UUID for a given resource type
     * @param body The type of resource for which the UUID should be generated. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;List&lt;UUIDResolution&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<UUIDResolution>> createUuidWithHttpInfo(UUIDRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = createUuidCall(body, naked, null, null);
        Type localVarReturnType = new TypeToken<List<UUIDResolution>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Generate a new UUID for a given resource type
     * @param body The type of resource for which the UUID should be generated. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createUuidAsync(UUIDRequest body, Boolean naked, final ApiCallback<List<UUIDResolution>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = createUuidCall(body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<UUIDResolution>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for resolveUuid */
    private com.squareup.okhttp.Call resolveUuidCall(String uuid, Boolean naked, Boolean expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling resolveUuid(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/uuids/v2/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (naked != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "naked", naked));
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

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

        String[] localVarAuthNames = new String[] { "agaveImplicit", "agavePassword", "agaveApplication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Resolve one or more UUID to their resource URL and type
     * @param uuid A valid Agave UUID to resolve (required)
     * @param naked  (optional, default to true)
     * @param expand If true, the summary object will be expanded to the full resource representation. (optional, default to false)
     * @return List&lt;UUIDResolution&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<UUIDResolution> resolveUuid(String uuid, Boolean naked, Boolean expand) throws ApiException {
        ApiResponse<List<UUIDResolution>> resp = resolveUuidWithHttpInfo(uuid, naked, expand);
        return resp.getData();
    }

    /**
     * 
     * Resolve one or more UUID to their resource URL and type
     * @param uuid A valid Agave UUID to resolve (required)
     * @param naked  (optional, default to true)
     * @param expand If true, the summary object will be expanded to the full resource representation. (optional, default to false)
     * @return ApiResponse&lt;List&lt;UUIDResolution&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<UUIDResolution>> resolveUuidWithHttpInfo(String uuid, Boolean naked, Boolean expand) throws ApiException {
        com.squareup.okhttp.Call call = resolveUuidCall(uuid, naked, expand, null, null);
        Type localVarReturnType = new TypeToken<List<UUIDResolution>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Resolve one or more UUID to their resource URL and type
     * @param uuid A valid Agave UUID to resolve (required)
     * @param naked  (optional, default to true)
     * @param expand If true, the summary object will be expanded to the full resource representation. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resolveUuidAsync(String uuid, Boolean naked, Boolean expand, final ApiCallback<List<UUIDResolution>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = resolveUuidCall(uuid, naked, expand, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<UUIDResolution>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for resolveUuids */
    private com.squareup.okhttp.Call resolveUuidsCall(Boolean naked, String uuids, Long limit, Long offset, Boolean expand, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling resolveUuids(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/uuids/v2/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (uuids != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "uuids", uuids));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (naked != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "naked", naked));
        if (expand != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "expand", expand));

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

        String[] localVarAuthNames = new String[] { "agaveImplicit", "agavePassword", "agaveApplication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Resolve one or more UUID to their resource URL and type
     * @param naked  (required)
     * @param uuids A comma-separated list of UUID to resolve (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param expand If true, the summary object will be expanded to the full resource representation. (optional, default to false)
     * @return List&lt;UUIDSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<UUIDSummary> resolveUuids(Boolean naked, String uuids, Long limit, Long offset, Boolean expand) throws ApiException {
        ApiResponse<List<UUIDSummary>> resp = resolveUuidsWithHttpInfo(naked, uuids, limit, offset, expand);
        return resp.getData();
    }

    /**
     * 
     * Resolve one or more UUID to their resource URL and type
     * @param naked  (required)
     * @param uuids A comma-separated list of UUID to resolve (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param expand If true, the summary object will be expanded to the full resource representation. (optional, default to false)
     * @return ApiResponse&lt;List&lt;UUIDSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<UUIDSummary>> resolveUuidsWithHttpInfo(Boolean naked, String uuids, Long limit, Long offset, Boolean expand) throws ApiException {
        com.squareup.okhttp.Call call = resolveUuidsCall(naked, uuids, limit, offset, expand, null, null);
        Type localVarReturnType = new TypeToken<List<UUIDSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Resolve one or more UUID to their resource URL and type
     * @param naked  (required)
     * @param uuids A comma-separated list of UUID to resolve (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param expand If true, the summary object will be expanded to the full resource representation. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resolveUuidsAsync(Boolean naked, String uuids, Long limit, Long offset, Boolean expand, final ApiCallback<List<UUIDSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = resolveUuidsCall(naked, uuids, limit, offset, expand, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<UUIDSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
