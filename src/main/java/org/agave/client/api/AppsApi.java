

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
import org.agave.client.model.Application;
import org.agave.client.model.ApplicationAction;
import org.agave.client.model.ApplicationSummary;
import org.agave.client.model.HistoryEvent;
import org.agave.client.model.Permission;

public class AppsApi {
    private ApiClient apiClient;

    public AppsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AppsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addApp */
    private com.squareup.okhttp.Call addAppCall(Boolean naked, Application body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addApp(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/".replaceAll("\\{format\\}","json");

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
     * Register and update new applications.
     * @param naked  (required)
     * @param body The description of the app to add or update.  (optional)
     * @return Application
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Application addApp(Boolean naked, Application body) throws ApiException {
        ApiResponse<Application> resp = addAppWithHttpInfo(naked, body);
        return resp.getData();
    }

    /**
     * 
     * Register and update new applications.
     * @param naked  (required)
     * @param body The description of the app to add or update.  (optional)
     * @return ApiResponse&lt;Application&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Application> addAppWithHttpInfo(Boolean naked, Application body) throws ApiException {
        com.squareup.okhttp.Call call = addAppCall(naked, body, null, null);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Register and update new applications.
     * @param naked  (required)
     * @param body The description of the app to add or update.  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAppAsync(Boolean naked, Application body, final ApiCallback<Application> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addAppCall(naked, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addAppPermission */
    private com.squareup.okhttp.Call addAppPermissionCall(String appId, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling addAppPermission(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addAppPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addAppPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

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
     * Grant a user permission for an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param body The permission add or update.  (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission addAppPermission(String appId, Permission body, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = addAppPermissionWithHttpInfo(appId, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Grant a user permission for an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param body The permission add or update.  (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> addAppPermissionWithHttpInfo(String appId, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addAppPermissionCall(appId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Grant a user permission for an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param body The permission add or update.  (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addAppPermissionAsync(String appId, Permission body, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addAppPermissionCall(appId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for clearAppPermissions */
    private com.squareup.okhttp.Call clearAppPermissionsCall(String appId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling clearAppPermissions(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling clearAppPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

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
     * Deletes all permissions on an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearAppPermissions(String appId, Boolean naked) throws ApiException {
        clearAppPermissionsWithHttpInfo(appId, naked);
    }

    /**
     * 
     * Deletes all permissions on an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearAppPermissionsWithHttpInfo(String appId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearAppPermissionsCall(appId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all permissions on an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearAppPermissionsAsync(String appId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearAppPermissionsCall(appId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteApp */
    private com.squareup.okhttp.Call deleteAppCall(String appId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling deleteApp(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteApp(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

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
     * Deletes an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteApp(String appId, Boolean naked) throws ApiException {
        deleteAppWithHttpInfo(appId, naked);
    }

    /**
     * 
     * Deletes an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAppWithHttpInfo(String appId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteAppCall(appId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAppAsync(String appId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAppCall(appId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteAppPermission */
    private com.squareup.okhttp.Call deleteAppPermissionCall(String appId, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling deleteAppPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling deleteAppPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteAppPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
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
     * Deletes all permissions for the given user on an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param username The username of the api user associated with the permission (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteAppPermission(String appId, String username, Boolean naked) throws ApiException {
        deleteAppPermissionWithHttpInfo(appId, username, naked);
    }

    /**
     * 
     * Deletes all permissions for the given user on an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param username The username of the api user associated with the permission (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteAppPermissionWithHttpInfo(String appId, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteAppPermissionCall(appId, username, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all permissions for the given user on an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param username The username of the api user associated with the permission (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAppPermissionAsync(String appId, String username, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteAppPermissionCall(appId, username, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getAppDetails */
    private com.squareup.okhttp.Call getAppDetailsCall(String appId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getAppDetails(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getAppDetails(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

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
     * Get details of an application by its unique id.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param naked  (required)
     * @return Application
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Application getAppDetails(String appId, Boolean naked) throws ApiException {
        ApiResponse<Application> resp = getAppDetailsWithHttpInfo(appId, naked);
        return resp.getData();
    }

    /**
     * 
     * Get details of an application by its unique id.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Application&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Application> getAppDetailsWithHttpInfo(String appId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getAppDetailsCall(appId, naked, null, null);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get details of an application by its unique id.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAppDetailsAsync(String appId, Boolean naked, final ApiCallback<Application> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAppDetailsCall(appId, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAppPermission */
    private com.squareup.okhttp.Call getAppPermissionCall(String appId, String username, String filter, String naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getAppPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getAppPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
        .replaceAll("\\{" + "username" + "\\}", apiClient.escapeString(username.toString()));

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
     * 
     * Get a specific user permission for an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param username The username of the api user associated with the permission. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission getAppPermission(String appId, String username, String filter, String naked) throws ApiException {
        ApiResponse<Permission> resp = getAppPermissionWithHttpInfo(appId, username, filter, naked);
        return resp.getData();
    }

    /**
     * 
     * Get a specific user permission for an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param username The username of the api user associated with the permission. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> getAppPermissionWithHttpInfo(String appId, String username, String filter, String naked) throws ApiException {
        com.squareup.okhttp.Call call = getAppPermissionCall(appId, username, filter, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a specific user permission for an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param username The username of the api user associated with the permission. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAppPermissionAsync(String appId, String username, String filter, String naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAppPermissionCall(appId, username, filter, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getAppSubmissionForm */
    private com.squareup.okhttp.Call getAppSubmissionFormCall(String appId, String naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getAppSubmissionForm(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}/form".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

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
     * Get a submission form for the named application.
     * @param appId The app for which to create the form (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @return String
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public String getAppSubmissionForm(String appId, String naked) throws ApiException {
        ApiResponse<String> resp = getAppSubmissionFormWithHttpInfo(appId, naked);
        return resp.getData();
    }

    /**
     * 
     * Get a submission form for the named application.
     * @param appId The app for which to create the form (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @return ApiResponse&lt;String&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<String> getAppSubmissionFormWithHttpInfo(String appId, String naked) throws ApiException {
        com.squareup.okhttp.Call call = getAppSubmissionFormCall(appId, naked, null, null);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a submission form for the named application.
     * @param appId The app for which to create the form (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAppSubmissionFormAsync(String appId, String naked, final ApiCallback<String> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getAppSubmissionFormCall(appId, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<String>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for invokeAppAction */
    private com.squareup.okhttp.Call invokeAppActionCall(String appId, ApplicationAction body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling invokeAppAction(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling invokeAppAction(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling invokeAppAction(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

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
     * Edit an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param body The operation to perform. (required)
     * @param naked  (required)
     * @return Application
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Application invokeAppAction(String appId, ApplicationAction body, Boolean naked) throws ApiException {
        ApiResponse<Application> resp = invokeAppActionWithHttpInfo(appId, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Edit an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param body The operation to perform. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Application&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Application> invokeAppActionWithHttpInfo(String appId, ApplicationAction body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = invokeAppActionCall(appId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Edit an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param body The operation to perform. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call invokeAppActionAsync(String appId, ApplicationAction body, Boolean naked, final ApiCallback<Application> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = invokeAppActionCall(appId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAppHistory */
    private com.squareup.okhttp.Call listAppHistoryCall(Boolean naked, String appId, String status, String created, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listAppHistory(Async)");
        }
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling listAppHistory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}/history".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
        if (created != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
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
     * List the event history of this app
     * @param naked  (required)
     * @param appId The id of the app for which the history will be returned (required)
     * @param status The event status (optional)
     * @param created The date the event occurred (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return HistoryEvent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HistoryEvent listAppHistory(Boolean naked, String appId, String status, String created, Long limit, Long offset) throws ApiException {
        ApiResponse<HistoryEvent> resp = listAppHistoryWithHttpInfo(naked, appId, status, created, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * List the event history of this app
     * @param naked  (required)
     * @param appId The id of the app for which the history will be returned (required)
     * @param status The event status (optional)
     * @param created The date the event occurred (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;HistoryEvent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HistoryEvent> listAppHistoryWithHttpInfo(Boolean naked, String appId, String status, String created, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listAppHistoryCall(naked, appId, status, created, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<HistoryEvent>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List the event history of this app
     * @param naked  (required)
     * @param appId The id of the app for which the history will be returned (required)
     * @param status The event status (optional)
     * @param created The date the event occurred (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAppHistoryAsync(Boolean naked, String appId, String status, String created, Long limit, Long offset, final ApiCallback<HistoryEvent> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAppHistoryCall(naked, appId, status, created, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HistoryEvent>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listAppPermissions */
    private com.squareup.okhttp.Call listAppPermissionsCall(String appId, String filter, String naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling listAppPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

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
     * 
     * Get the permission for this application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Permission> listAppPermissions(String appId, String filter, String naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<Permission>> resp = listAppPermissionsWithHttpInfo(appId, filter, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Get the permission for this application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;Permission&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Permission>> listAppPermissionsWithHttpInfo(String appId, String filter, String naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listAppPermissionsCall(appId, filter, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the permission for this application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAppPermissionsAsync(String appId, String filter, String naked, Long limit, Long offset, final ApiCallback<List<Permission>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAppPermissionsCall(appId, filter, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listApps */
    private com.squareup.okhttp.Call listAppsCall(Boolean _public, String name, String executionSystem, String tags, String filter, String naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/apps/v2/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (_public != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "public", _public));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (executionSystem != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "executionSystem", executionSystem));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));
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
     * List apps
     * Get a list of available applications.
     * @param _public Whether to return only public apps. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) (optional)
     * @param name The name of the app (optional)
     * @param executionSystem The execution system of the system (optional)
     * @param tags A free text tag associated with an app (optional)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;ApplicationSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<ApplicationSummary> listApps(Boolean _public, String name, String executionSystem, String tags, String filter, String naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<ApplicationSummary>> resp = listAppsWithHttpInfo(_public, name, executionSystem, tags, filter, naked, limit, offset);
        return resp.getData();
    }

    /**
     * List apps
     * Get a list of available applications.
     * @param _public Whether to return only public apps. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) (optional)
     * @param name The name of the app (optional)
     * @param executionSystem The execution system of the system (optional)
     * @param tags A free text tag associated with an app (optional)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;ApplicationSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<ApplicationSummary>> listAppsWithHttpInfo(Boolean _public, String name, String executionSystem, String tags, String filter, String naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listAppsCall(_public, name, executionSystem, tags, filter, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<ApplicationSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List apps (asynchronously)
     * Get a list of available applications.
     * @param _public Whether to return only public apps. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) (optional)
     * @param name The name of the app (optional)
     * @param executionSystem The execution system of the system (optional)
     * @param tags A free text tag associated with an app (optional)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAppsAsync(Boolean _public, String name, String executionSystem, String tags, String filter, String naked, Long limit, Long offset, final ApiCallback<List<ApplicationSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listAppsCall(_public, name, executionSystem, tags, filter, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<ApplicationSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateApp */
    private com.squareup.okhttp.Call updateAppCall(String appId, Application body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling updateApp(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateApp(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateApp(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()));

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
     * Update an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param body The description of the app to add or update.  (required)
     * @param naked  (required)
     * @return Application
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Application updateApp(String appId, Application body, Boolean naked) throws ApiException {
        ApiResponse<Application> resp = updateAppWithHttpInfo(appId, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param body The description of the app to add or update.  (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Application&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Application> updateAppWithHttpInfo(String appId, Application body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateAppCall(appId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param body The description of the app to add or update.  (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAppAsync(String appId, Application body, Boolean naked, final ApiCallback<Application> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAppCall(appId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Application>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateAppPermission */
    private com.squareup.okhttp.Call updateAppPermissionCall(String appId, String username, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling updateAppPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling updateAppPermission(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateAppPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateAppPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/apps/v2/{appId}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
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
     * Add or update a user permission for an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param username The username of the api user associated with the permission (required)
     * @param body The permission add or update.  (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission updateAppPermission(String appId, String username, Permission body, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = updateAppPermissionWithHttpInfo(appId, username, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add or update a user permission for an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param username The username of the api user associated with the permission (required)
     * @param body The permission add or update.  (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> updateAppPermissionWithHttpInfo(String appId, String username, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateAppPermissionCall(appId, username, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add or update a user permission for an application.
     * @param appId The id of the application. The application id is made up of the name and version separated by a dash. (required)
     * @param username The username of the api user associated with the permission (required)
     * @param body The permission add or update.  (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAppPermissionAsync(String appId, String username, Permission body, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateAppPermissionCall(appId, username, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
