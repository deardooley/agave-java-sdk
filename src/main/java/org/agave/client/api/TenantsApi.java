

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
import org.agave.client.model.Tenant;

public class TenantsApi {
    private ApiClient apiClient;

    public TenantsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TenantsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for getTenantDetails */
    private com.squareup.okhttp.Call getTenantDetailsCall(String codeOrUuid, Boolean naked, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'codeOrUuid' is set
        if (codeOrUuid == null) {
            throw new ApiException("Missing the required parameter 'codeOrUuid' when calling getTenantDetails(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getTenantDetails(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tenants/v2/{codeOrUuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "codeOrUuid" + "\\}", apiClient.escapeString(codeOrUuid.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Resolve Tenant details
     * Returns information about the tenant with the given code or id
     * @param codeOrUuid Unique tenant code or id of the tenant (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @return Tenant
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tenant getTenantDetails(String codeOrUuid, Boolean naked, String filter) throws ApiException {
        ApiResponse<Tenant> resp = getTenantDetailsWithHttpInfo(codeOrUuid, naked, filter);
        return resp.getData();
    }

    /**
     * Resolve Tenant details
     * Returns information about the tenant with the given code or id
     * @param codeOrUuid Unique tenant code or id of the tenant (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @return ApiResponse&lt;Tenant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tenant> getTenantDetailsWithHttpInfo(String codeOrUuid, Boolean naked, String filter) throws ApiException {
        com.squareup.okhttp.Call call = getTenantDetailsCall(codeOrUuid, naked, filter, null, null);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Resolve Tenant details (asynchronously)
     * Returns information about the tenant with the given code or id
     * @param codeOrUuid Unique tenant code or id of the tenant (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTenantDetailsAsync(String codeOrUuid, Boolean naked, String filter, final ApiCallback<Tenant> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTenantDetailsCall(codeOrUuid, naked, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tenant>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listTenants */
    private com.squareup.okhttp.Call listTenantsCall(Boolean naked, String filter, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listTenants(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tenants/v2".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filter != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filter", filter));
        if (naked != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "naked", naked));
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

        String[] localVarAuthNames = new String[] { "agaveImplicit", "agavePassword", "agaveApplication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * List all active tenants
     * Lists all active tenants publicly available
     * @param naked If true, the response wrapper is stripped and the raw object is returned. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;Tenant&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Tenant> listTenants(Boolean naked, String filter, Long limit, Long offset) throws ApiException {
        ApiResponse<List<Tenant>> resp = listTenantsWithHttpInfo(naked, filter, limit, offset);
        return resp.getData();
    }

    /**
     * List all active tenants
     * Lists all active tenants publicly available
     * @param naked If true, the response wrapper is stripped and the raw object is returned. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;Tenant&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Tenant>> listTenantsWithHttpInfo(Boolean naked, String filter, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listTenantsCall(naked, filter, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<Tenant>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List all active tenants (asynchronously)
     * Lists all active tenants publicly available
     * @param naked If true, the response wrapper is stripped and the raw object is returned. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listTenantsAsync(Boolean naked, String filter, Long limit, Long offset, final ApiCallback<List<Tenant>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listTenantsCall(naked, filter, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Tenant>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
