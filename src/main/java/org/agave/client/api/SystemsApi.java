

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
import org.agave.client.model.ExecutionSystem;
import org.agave.client.model.MultipleSystemRoleResponse;
import org.agave.client.model.StorageSystem;
import org.agave.client.model.System;
import org.agave.client.model.SystemAction;
import org.agave.client.model.SystemAuthConfig;
import org.agave.client.model.SystemCredential;
import org.agave.client.model.SystemCredentialsResponse;
import org.agave.client.model.SystemRequest;
import org.agave.client.model.SystemRole;
import org.agave.client.model.SystemRoleRequest;
import org.agave.client.model.SystemSummary;

public class SystemsApi {
    private ApiClient apiClient;

    public SystemsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SystemsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addExecutionSystem */
    private com.squareup.okhttp.Call addExecutionSystemCall(SystemRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addExecutionSystem(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addExecutionSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/".replaceAll("\\{format\\}","json");

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
     * Add a new execution system
     * @param body The description of the system to add or update. (required)
     * @param naked  (required)
     * @return ExecutionSystem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ExecutionSystem addExecutionSystem(SystemRequest body, Boolean naked) throws ApiException {
        ApiResponse<ExecutionSystem> resp = addExecutionSystemWithHttpInfo(body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add a new execution system
     * @param body The description of the system to add or update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;ExecutionSystem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ExecutionSystem> addExecutionSystemWithHttpInfo(SystemRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addExecutionSystemCall(body, naked, null, null);
        Type localVarReturnType = new TypeToken<ExecutionSystem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add a new execution system
     * @param body The description of the system to add or update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addExecutionSystemAsync(SystemRequest body, Boolean naked, final ApiCallback<ExecutionSystem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addExecutionSystemCall(body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ExecutionSystem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addStorageSystem */
    private com.squareup.okhttp.Call addStorageSystemCall(SystemRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addStorageSystem(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addStorageSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2".replaceAll("\\{format\\}","json");

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
     * Add  a storage system
     * @param body Description of a storage system (required)
     * @param naked  (required)
     * @return StorageSystem
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public StorageSystem addStorageSystem(SystemRequest body, Boolean naked) throws ApiException {
        ApiResponse<StorageSystem> resp = addStorageSystemWithHttpInfo(body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add  a storage system
     * @param body Description of a storage system (required)
     * @param naked  (required)
     * @return ApiResponse&lt;StorageSystem&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<StorageSystem> addStorageSystemWithHttpInfo(SystemRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addStorageSystemCall(body, naked, null, null);
        Type localVarReturnType = new TypeToken<StorageSystem>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add  a storage system
     * @param body Description of a storage system (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addStorageSystemAsync(SystemRequest body, Boolean naked, final ApiCallback<StorageSystem> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addStorageSystemCall(body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<StorageSystem>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addSystemCredential */
    private com.squareup.okhttp.Call addSystemCredentialCall(String systemId, SystemCredential body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling addSystemCredential(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addSystemCredential(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addSystemCredential(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/credentials".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

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
     * Add an internal user&#39;s credential on a system. This applies both to storage and, if applicable, login credentials.
     * @param systemId The id of the system. (required)
     * @param body The description of the internal user credential to add or update. (required)
     * @param naked  (required)
     * @return List&lt;SystemCredential&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SystemCredential> addSystemCredential(String systemId, SystemCredential body, Boolean naked) throws ApiException {
        ApiResponse<List<SystemCredential>> resp = addSystemCredentialWithHttpInfo(systemId, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add an internal user&#39;s credential on a system. This applies both to storage and, if applicable, login credentials.
     * @param systemId The id of the system. (required)
     * @param body The description of the internal user credential to add or update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;List&lt;SystemCredential&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SystemCredential>> addSystemCredentialWithHttpInfo(String systemId, SystemCredential body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addSystemCredentialCall(systemId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<List<SystemCredential>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add an internal user&#39;s credential on a system. This applies both to storage and, if applicable, login credentials.
     * @param systemId The id of the system. (required)
     * @param body The description of the internal user credential to add or update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addSystemCredentialAsync(String systemId, SystemCredential body, Boolean naked, final ApiCallback<List<SystemCredential>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addSystemCredentialCall(systemId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SystemCredential>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addSystemRole */
    private com.squareup.okhttp.Call addSystemRoleCall(String systemId, SystemRoleRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling addSystemRole(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addSystemRole(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addSystemRole(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/{systemId}/roles".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

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
     * Adds a role on the system for the given user
     * @param systemId The id of the system on which to grant the role (required)
     * @param body The new role to grant (required)
     * @param naked  (required)
     * @return SystemRole
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SystemRole addSystemRole(String systemId, SystemRoleRequest body, Boolean naked) throws ApiException {
        ApiResponse<SystemRole> resp = addSystemRoleWithHttpInfo(systemId, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Adds a role on the system for the given user
     * @param systemId The id of the system on which to grant the role (required)
     * @param body The new role to grant (required)
     * @param naked  (required)
     * @return ApiResponse&lt;SystemRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SystemRole> addSystemRoleWithHttpInfo(String systemId, SystemRoleRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addSystemRoleCall(systemId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<SystemRole>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Adds a role on the system for the given user
     * @param systemId The id of the system on which to grant the role (required)
     * @param body The new role to grant (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addSystemRoleAsync(String systemId, SystemRoleRequest body, Boolean naked, final ApiCallback<SystemRole> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addSystemRoleCall(systemId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SystemRole>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for clearSystemAuthCredentials */
    private com.squareup.okhttp.Call clearSystemAuthCredentialsCall(String systemId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling clearSystemAuthCredentials(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling clearSystemAuthCredentials(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/credentials".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Deletes all credentials registered to a system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearSystemAuthCredentials(String systemId, Boolean naked) throws ApiException {
        clearSystemAuthCredentialsWithHttpInfo(systemId, naked);
    }

    /**
     * 
     * Deletes all credentials registered to a system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearSystemAuthCredentialsWithHttpInfo(String systemId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearSystemAuthCredentialsCall(systemId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all credentials registered to a system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearSystemAuthCredentialsAsync(String systemId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearSystemAuthCredentialsCall(systemId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for clearSystemAuthCredentialsForInternalUser */
    private com.squareup.okhttp.Call clearSystemAuthCredentialsForInternalUserCall(String systemId, String internalUsername, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling clearSystemAuthCredentialsForInternalUser(Async)");
        }
        
        // verify the required parameter 'internalUsername' is set
        if (internalUsername == null) {
            throw new ApiException("Missing the required parameter 'internalUsername' when calling clearSystemAuthCredentialsForInternalUser(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling clearSystemAuthCredentialsForInternalUser(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/credentials/{internalUsername}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "internalUsername" + "\\}", apiClient.escapeString(internalUsername.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Deletes all internal user credentials registered to a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearSystemAuthCredentialsForInternalUser(String systemId, String internalUsername, Boolean naked) throws ApiException {
        clearSystemAuthCredentialsForInternalUserWithHttpInfo(systemId, internalUsername, naked);
    }

    /**
     * 
     * Deletes all internal user credentials registered to a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearSystemAuthCredentialsForInternalUserWithHttpInfo(String systemId, String internalUsername, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearSystemAuthCredentialsForInternalUserCall(systemId, internalUsername, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all internal user credentials registered to a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearSystemAuthCredentialsForInternalUserAsync(String systemId, String internalUsername, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearSystemAuthCredentialsForInternalUserCall(systemId, internalUsername, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for clearSystemRoles */
    private com.squareup.okhttp.Call clearSystemRolesCall(String systemId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling clearSystemRoles(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling clearSystemRoles(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/roles".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Deletes all roles on a system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearSystemRoles(String systemId, Boolean naked) throws ApiException {
        clearSystemRolesWithHttpInfo(systemId, naked);
    }

    /**
     * 
     * Deletes all roles on a system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearSystemRolesWithHttpInfo(String systemId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearSystemRolesCall(systemId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all roles on a system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearSystemRolesAsync(String systemId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearSystemRolesCall(systemId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteSystem */
    private com.squareup.okhttp.Call deleteSystemCall(String systemId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling deleteSystem(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Delete a system.
     * @param systemId The unique id of the system (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSystem(String systemId, Boolean naked) throws ApiException {
        deleteSystemWithHttpInfo(systemId, naked);
    }

    /**
     * 
     * Delete a system.
     * @param systemId The unique id of the system (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteSystemWithHttpInfo(String systemId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteSystemCall(systemId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Delete a system.
     * @param systemId The unique id of the system (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSystemAsync(String systemId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSystemCall(systemId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteSystemAuthCredentialForInternalUser */
    private com.squareup.okhttp.Call deleteSystemAuthCredentialForInternalUserCall(String systemId, String internalUsername, String credentialType, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling deleteSystemAuthCredentialForInternalUser(Async)");
        }
        
        // verify the required parameter 'internalUsername' is set
        if (internalUsername == null) {
            throw new ApiException("Missing the required parameter 'internalUsername' when calling deleteSystemAuthCredentialForInternalUser(Async)");
        }
        
        // verify the required parameter 'credentialType' is set
        if (credentialType == null) {
            throw new ApiException("Missing the required parameter 'credentialType' when calling deleteSystemAuthCredentialForInternalUser(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteSystemAuthCredentialForInternalUser(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/credentials/{internalUsername}/{credentialType}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "internalUsername" + "\\}", apiClient.escapeString(internalUsername.toString()))
        .replaceAll("\\{" + "credentialType" + "\\}", apiClient.escapeString(credentialType.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Deletes the internal user credentials for the given credential type on a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param credentialType The configuration type to which to apply this credential. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSystemAuthCredentialForInternalUser(String systemId, String internalUsername, String credentialType, Boolean naked) throws ApiException {
        deleteSystemAuthCredentialForInternalUserWithHttpInfo(systemId, internalUsername, credentialType, naked);
    }

    /**
     * 
     * Deletes the internal user credentials for the given credential type on a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param credentialType The configuration type to which to apply this credential. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteSystemAuthCredentialForInternalUserWithHttpInfo(String systemId, String internalUsername, String credentialType, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteSystemAuthCredentialForInternalUserCall(systemId, internalUsername, credentialType, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes the internal user credentials for the given credential type on a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param credentialType The configuration type to which to apply this credential. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSystemAuthCredentialForInternalUserAsync(String systemId, String internalUsername, String credentialType, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSystemAuthCredentialForInternalUserCall(systemId, internalUsername, credentialType, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteSystemRole */
    private com.squareup.okhttp.Call deleteSystemRoleCall(String systemId, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling deleteSystemRole(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling deleteSystemRole(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteSystemRole(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/roles/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Deletes all roles for a user on a system.
     * @param systemId The id of the system. (required)
     * @param username The username of the api user associated with the role (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSystemRole(String systemId, String username, Boolean naked) throws ApiException {
        deleteSystemRoleWithHttpInfo(systemId, username, naked);
    }

    /**
     * 
     * Deletes all roles for a user on a system.
     * @param systemId The id of the system. (required)
     * @param username The username of the api user associated with the role (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteSystemRoleWithHttpInfo(String systemId, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteSystemRoleCall(systemId, username, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all roles for a user on a system.
     * @param systemId The id of the system. (required)
     * @param username The username of the api user associated with the role (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSystemRoleAsync(String systemId, String username, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSystemRoleCall(systemId, username, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getSystemCredential */
    private com.squareup.okhttp.Call getSystemCredentialCall(String systemId, String internalUsername, String credentialType, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling getSystemCredential(Async)");
        }
        
        // verify the required parameter 'internalUsername' is set
        if (internalUsername == null) {
            throw new ApiException("Missing the required parameter 'internalUsername' when calling getSystemCredential(Async)");
        }
        
        // verify the required parameter 'credentialType' is set
        if (credentialType == null) {
            throw new ApiException("Missing the required parameter 'credentialType' when calling getSystemCredential(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getSystemCredential(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/credentials/{internalUsername}/{credentialType}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "internalUsername" + "\\}", apiClient.escapeString(internalUsername.toString()))
        .replaceAll("\\{" + "credentialType" + "\\}", apiClient.escapeString(credentialType.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Get the internal user credential of the given type on the system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param credentialType The configuration type to which to apply this credential. (required)
     * @param naked  (required)
     * @return SystemCredential
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SystemCredential getSystemCredential(String systemId, String internalUsername, String credentialType, Boolean naked) throws ApiException {
        ApiResponse<SystemCredential> resp = getSystemCredentialWithHttpInfo(systemId, internalUsername, credentialType, naked);
        return resp.getData();
    }

    /**
     * 
     * Get the internal user credential of the given type on the system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param credentialType The configuration type to which to apply this credential. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;SystemCredential&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SystemCredential> getSystemCredentialWithHttpInfo(String systemId, String internalUsername, String credentialType, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getSystemCredentialCall(systemId, internalUsername, credentialType, naked, null, null);
        Type localVarReturnType = new TypeToken<SystemCredential>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the internal user credential of the given type on the system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param credentialType The configuration type to which to apply this credential. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSystemCredentialAsync(String systemId, String internalUsername, String credentialType, Boolean naked, final ApiCallback<SystemCredential> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSystemCredentialCall(systemId, internalUsername, credentialType, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SystemCredential>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getSystemDetails */
    private com.squareup.okhttp.Call getSystemDetailsCall(String systemId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling getSystemDetails(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getSystemDetails(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Find information about an individual system.
     * @param systemId The unique id of the system (required)
     * @param naked  (required)
     * @return System
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public System getSystemDetails(String systemId, Boolean naked) throws ApiException {
        ApiResponse<System> resp = getSystemDetailsWithHttpInfo(systemId, naked);
        return resp.getData();
    }

    /**
     * 
     * Find information about an individual system.
     * @param systemId The unique id of the system (required)
     * @param naked  (required)
     * @return ApiResponse&lt;System&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<System> getSystemDetailsWithHttpInfo(String systemId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getSystemDetailsCall(systemId, naked, null, null);
        Type localVarReturnType = new TypeToken<System>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Find information about an individual system.
     * @param systemId The unique id of the system (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSystemDetailsAsync(String systemId, Boolean naked, final ApiCallback<System> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSystemDetailsCall(systemId, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<System>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getSystemRole */
    private com.squareup.okhttp.Call getSystemRoleCall(String systemId, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling getSystemRole(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getSystemRole(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getSystemRole(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/roles/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Get a specific user role on this system.
     * @param systemId The id of the system. (required)
     * @param username The username of the user about whose role you are inquiring. (required)
     * @param naked  (required)
     * @return SystemRole
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SystemRole getSystemRole(String systemId, String username, Boolean naked) throws ApiException {
        ApiResponse<SystemRole> resp = getSystemRoleWithHttpInfo(systemId, username, naked);
        return resp.getData();
    }

    /**
     * 
     * Get a specific user role on this system.
     * @param systemId The id of the system. (required)
     * @param username The username of the user about whose role you are inquiring. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;SystemRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SystemRole> getSystemRoleWithHttpInfo(String systemId, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getSystemRoleCall(systemId, username, naked, null, null);
        Type localVarReturnType = new TypeToken<SystemRole>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a specific user role on this system.
     * @param systemId The id of the system. (required)
     * @param username The username of the user about whose role you are inquiring. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getSystemRoleAsync(String systemId, String username, Boolean naked, final ApiCallback<SystemRole> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getSystemRoleCall(systemId, username, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SystemRole>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for invokeSystemAction */
    private com.squareup.okhttp.Call invokeSystemActionCall(String systemId, SystemAction body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling invokeSystemAction(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling invokeSystemAction(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling invokeSystemAction(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Perform a management action on the system.
     * @param systemId The id of the system receiving the action (required)
     * @param body The action to invoke (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void invokeSystemAction(String systemId, SystemAction body, Boolean naked) throws ApiException {
        invokeSystemActionWithHttpInfo(systemId, body, naked);
    }

    /**
     * 
     * Perform a management action on the system.
     * @param systemId The id of the system receiving the action (required)
     * @param body The action to invoke (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> invokeSystemActionWithHttpInfo(String systemId, SystemAction body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = invokeSystemActionCall(systemId, body, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Perform a management action on the system.
     * @param systemId The id of the system receiving the action (required)
     * @param body The action to invoke (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call invokeSystemActionAsync(String systemId, SystemAction body, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = invokeSystemActionCall(systemId, body, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for listCredentialsForInternalUser */
    private com.squareup.okhttp.Call listCredentialsForInternalUserCall(String systemId, String internalUsername, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling listCredentialsForInternalUser(Async)");
        }
        
        // verify the required parameter 'internalUsername' is set
        if (internalUsername == null) {
            throw new ApiException("Missing the required parameter 'internalUsername' when calling listCredentialsForInternalUser(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/credentials/{internalUsername}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "internalUsername" + "\\}", apiClient.escapeString(internalUsername.toString()));

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

        String[] localVarAuthNames = new String[] { "agaveImplicit", "agavePassword", "agaveApplication" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Get a list of all internal users and their credentials on this system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @return SystemCredentialsResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SystemCredentialsResponse listCredentialsForInternalUser(String systemId, String internalUsername) throws ApiException {
        ApiResponse<SystemCredentialsResponse> resp = listCredentialsForInternalUserWithHttpInfo(systemId, internalUsername);
        return resp.getData();
    }

    /**
     * 
     * Get a list of all internal users and their credentials on this system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @return ApiResponse&lt;SystemCredentialsResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SystemCredentialsResponse> listCredentialsForInternalUserWithHttpInfo(String systemId, String internalUsername) throws ApiException {
        com.squareup.okhttp.Call call = listCredentialsForInternalUserCall(systemId, internalUsername, null, null);
        Type localVarReturnType = new TypeToken<SystemCredentialsResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a list of all internal users and their credentials on this system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listCredentialsForInternalUserAsync(String systemId, String internalUsername, final ApiCallback<SystemCredentialsResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listCredentialsForInternalUserCall(systemId, internalUsername, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SystemCredentialsResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listSystemCredentials */
    private com.squareup.okhttp.Call listSystemCredentialsCall(String systemId, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling listSystemCredentials(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listSystemCredentials(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/credentials".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
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
     * 
     * Get a list of all internal user credentials on this system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;SystemCredential&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SystemCredential> listSystemCredentials(String systemId, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<SystemCredential>> resp = listSystemCredentialsWithHttpInfo(systemId, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Get a list of all internal user credentials on this system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;SystemCredential&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SystemCredential>> listSystemCredentialsWithHttpInfo(String systemId, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listSystemCredentialsCall(systemId, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<SystemCredential>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a list of all internal user credentials on this system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listSystemCredentialsAsync(String systemId, Boolean naked, Long limit, Long offset, final ApiCallback<List<SystemCredential>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listSystemCredentialsCall(systemId, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SystemCredential>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listSystemRoles */
    private com.squareup.okhttp.Call listSystemRolesCall(String systemId, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling listSystemRoles(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listSystemRoles(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/roles".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
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
     * 
     * Get a list of all users and their roles on this system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return MultipleSystemRoleResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MultipleSystemRoleResponse listSystemRoles(String systemId, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<MultipleSystemRoleResponse> resp = listSystemRolesWithHttpInfo(systemId, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Get a list of all users and their roles on this system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;MultipleSystemRoleResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MultipleSystemRoleResponse> listSystemRolesWithHttpInfo(String systemId, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listSystemRolesCall(systemId, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<MultipleSystemRoleResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a list of all users and their roles on this system.
     * @param systemId The id of the system. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listSystemRolesAsync(String systemId, Boolean naked, Long limit, Long offset, final ApiCallback<MultipleSystemRoleResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listSystemRolesCall(systemId, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MultipleSystemRoleResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listSystems */
    private com.squareup.okhttp.Call listSystemsCall(Boolean naked, Long offset, String type, Boolean _default, Boolean _public, Long limit, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listSystems(Async)");
        }
        
        // verify the required parameter 'offset' is set
        if (offset == null) {
            throw new ApiException("Missing the required parameter 'offset' when calling listSystems(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (type != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "type", type));
        if (_default != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "default", _default));
        if (_public != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "public", _public));
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
     * 
     * Show all systems available to the user.
     * @param naked  (required)
     * @param offset The number of results skipped in the result set returned from this query (required)
     * @param type The type of system to return (optional)
     * @param _default If true, only default systems be returned (optional)
     * @param _public If true, only public systems will be returned. If false, no public systems will be returned. If null, both public and private systems will be returned. (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @return List&lt;SystemSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<SystemSummary> listSystems(Boolean naked, Long offset, String type, Boolean _default, Boolean _public, Long limit) throws ApiException {
        ApiResponse<List<SystemSummary>> resp = listSystemsWithHttpInfo(naked, offset, type, _default, _public, limit);
        return resp.getData();
    }

    /**
     * 
     * Show all systems available to the user.
     * @param naked  (required)
     * @param offset The number of results skipped in the result set returned from this query (required)
     * @param type The type of system to return (optional)
     * @param _default If true, only default systems be returned (optional)
     * @param _public If true, only public systems will be returned. If false, no public systems will be returned. If null, both public and private systems will be returned. (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @return ApiResponse&lt;List&lt;SystemSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<SystemSummary>> listSystemsWithHttpInfo(Boolean naked, Long offset, String type, Boolean _default, Boolean _public, Long limit) throws ApiException {
        com.squareup.okhttp.Call call = listSystemsCall(naked, offset, type, _default, _public, limit, null, null);
        Type localVarReturnType = new TypeToken<List<SystemSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Show all systems available to the user.
     * @param naked  (required)
     * @param offset The number of results skipped in the result set returned from this query (required)
     * @param type The type of system to return (optional)
     * @param _default If true, only default systems be returned (optional)
     * @param _public If true, only public systems will be returned. If false, no public systems will be returned. If null, both public and private systems will be returned. (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listSystemsAsync(Boolean naked, Long offset, String type, Boolean _default, Boolean _public, Long limit, final ApiCallback<List<SystemSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listSystemsCall(naked, offset, type, _default, _public, limit, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<SystemSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateSystem */
    private com.squareup.okhttp.Call updateSystemCall(String systemId, SystemRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling updateSystem(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateSystem(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

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
     * Update a system description
     * @param systemId The unique id of the system (required)
     * @param body The description of the system to update. (required)
     * @param naked  (required)
     * @return System
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public System updateSystem(String systemId, SystemRequest body, Boolean naked) throws ApiException {
        ApiResponse<System> resp = updateSystemWithHttpInfo(systemId, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update a system description
     * @param systemId The unique id of the system (required)
     * @param body The description of the system to update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;System&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<System> updateSystemWithHttpInfo(String systemId, SystemRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateSystemCall(systemId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<System>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update a system description
     * @param systemId The unique id of the system (required)
     * @param body The description of the system to update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateSystemAsync(String systemId, SystemRequest body, Boolean naked, final ApiCallback<System> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateSystemCall(systemId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<System>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateSystemCredential */
    private com.squareup.okhttp.Call updateSystemCredentialCall(String systemId, String internalUsername, SystemAuthConfig body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling updateSystemCredential(Async)");
        }
        
        // verify the required parameter 'internalUsername' is set
        if (internalUsername == null) {
            throw new ApiException("Missing the required parameter 'internalUsername' when calling updateSystemCredential(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateSystemCredential(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateSystemCredential(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/credentials/{internalUsername}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "internalUsername" + "\\}", apiClient.escapeString(internalUsername.toString()));

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
     * Update an internal user credential on a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param body The description of the internal user credential to add or update. (required)
     * @param naked  (required)
     * @return SystemCredential
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SystemCredential updateSystemCredential(String systemId, String internalUsername, SystemAuthConfig body, Boolean naked) throws ApiException {
        ApiResponse<SystemCredential> resp = updateSystemCredentialWithHttpInfo(systemId, internalUsername, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update an internal user credential on a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param body The description of the internal user credential to add or update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;SystemCredential&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SystemCredential> updateSystemCredentialWithHttpInfo(String systemId, String internalUsername, SystemAuthConfig body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateSystemCredentialCall(systemId, internalUsername, body, naked, null, null);
        Type localVarReturnType = new TypeToken<SystemCredential>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update an internal user credential on a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param body The description of the internal user credential to add or update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateSystemCredentialAsync(String systemId, String internalUsername, SystemAuthConfig body, Boolean naked, final ApiCallback<SystemCredential> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateSystemCredentialCall(systemId, internalUsername, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SystemCredential>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateSystemCredentialOfType */
    private com.squareup.okhttp.Call updateSystemCredentialOfTypeCall(String systemId, String internalUsername, String credentialType, SystemAuthConfig body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling updateSystemCredentialOfType(Async)");
        }
        
        // verify the required parameter 'internalUsername' is set
        if (internalUsername == null) {
            throw new ApiException("Missing the required parameter 'internalUsername' when calling updateSystemCredentialOfType(Async)");
        }
        
        // verify the required parameter 'credentialType' is set
        if (credentialType == null) {
            throw new ApiException("Missing the required parameter 'credentialType' when calling updateSystemCredentialOfType(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateSystemCredentialOfType(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateSystemCredentialOfType(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/credentials/{internalUsername}/{credentialType}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "internalUsername" + "\\}", apiClient.escapeString(internalUsername.toString()))
        .replaceAll("\\{" + "credentialType" + "\\}", apiClient.escapeString(credentialType.toString()));

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
     * Add or update a credential of the given type on a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param credentialType The configuration type to which to apply this credential. (required)
     * @param body The description of the internal user credential to add or update. (required)
     * @param naked  (required)
     * @return SystemCredential
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SystemCredential updateSystemCredentialOfType(String systemId, String internalUsername, String credentialType, SystemAuthConfig body, Boolean naked) throws ApiException {
        ApiResponse<SystemCredential> resp = updateSystemCredentialOfTypeWithHttpInfo(systemId, internalUsername, credentialType, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add or update a credential of the given type on a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param credentialType The configuration type to which to apply this credential. (required)
     * @param body The description of the internal user credential to add or update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;SystemCredential&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SystemCredential> updateSystemCredentialOfTypeWithHttpInfo(String systemId, String internalUsername, String credentialType, SystemAuthConfig body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateSystemCredentialOfTypeCall(systemId, internalUsername, credentialType, body, naked, null, null);
        Type localVarReturnType = new TypeToken<SystemCredential>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add or update a credential of the given type on a system.
     * @param systemId The id of the system. (required)
     * @param internalUsername The username of a internal user on this system. (required)
     * @param credentialType The configuration type to which to apply this credential. (required)
     * @param body The description of the internal user credential to add or update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateSystemCredentialOfTypeAsync(String systemId, String internalUsername, String credentialType, SystemAuthConfig body, Boolean naked, final ApiCallback<SystemCredential> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateSystemCredentialOfTypeCall(systemId, internalUsername, credentialType, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SystemCredential>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateSystemRole */
    private com.squareup.okhttp.Call updateSystemRoleCall(String systemId, String username, SystemRoleRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling updateSystemRole(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling updateSystemRole(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateSystemRole(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateSystemRole(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/systems/v2/{systemId}/roles/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
     * Update a user role on a system.
     * @param systemId The id of the system. (required)
     * @param username The username of the api user associated with the role (required)
     * @param body The role to update. (required)
     * @param naked  (required)
     * @return SystemRole
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public SystemRole updateSystemRole(String systemId, String username, SystemRoleRequest body, Boolean naked) throws ApiException {
        ApiResponse<SystemRole> resp = updateSystemRoleWithHttpInfo(systemId, username, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update a user role on a system.
     * @param systemId The id of the system. (required)
     * @param username The username of the api user associated with the role (required)
     * @param body The role to update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;SystemRole&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<SystemRole> updateSystemRoleWithHttpInfo(String systemId, String username, SystemRoleRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateSystemRoleCall(systemId, username, body, naked, null, null);
        Type localVarReturnType = new TypeToken<SystemRole>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update a user role on a system.
     * @param systemId The id of the system. (required)
     * @param username The username of the api user associated with the role (required)
     * @param body The role to update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateSystemRoleAsync(String systemId, String username, SystemRoleRequest body, Boolean naked, final ApiCallback<SystemRole> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateSystemRoleCall(systemId, username, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<SystemRole>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
