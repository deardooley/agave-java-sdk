

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
import org.agave.client.model.FileAction;
import org.agave.client.model.FileImportRequest;
import org.agave.client.model.FileInfo;
import org.agave.client.model.FilePermission;
import org.agave.client.model.FilePermissionRequest;
import org.agave.client.model.HistoryEvent;
import org.agave.client.model.PermissionRequest;

public class FilesApi {
    private ApiClient apiClient;

    public FilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public FilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for clearFileItemPermissions */
    private com.squareup.okhttp.Call clearFileItemPermissionsCall(String filePath, String systemId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling clearFileItemPermissions(Async)");
        }
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling clearFileItemPermissions(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling clearFileItemPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/pems/system/{systemId}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()))
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
     * Deletes all permissions on a file except those of the owner.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param systemId The id of the system on which the file item lives. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearFileItemPermissions(String filePath, String systemId, Boolean naked) throws ApiException {
        clearFileItemPermissionsWithHttpInfo(filePath, systemId, naked);
    }

    /**
     * 
     * Deletes all permissions on a file except those of the owner.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param systemId The id of the system on which the file item lives. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearFileItemPermissionsWithHttpInfo(String filePath, String systemId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearFileItemPermissionsCall(filePath, systemId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all permissions on a file except those of the owner.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param systemId The id of the system on which the file item lives. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearFileItemPermissionsAsync(String filePath, String systemId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearFileItemPermissionsCall(filePath, systemId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteFileItem */
    private com.squareup.okhttp.Call deleteFileItemCall(String systemId, String filePath, String naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling deleteFileItem(Async)");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling deleteFileItem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/media/system/{systemId}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

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
     * Deletes a file or folder at the specified path on the specified remote system.
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFileItem(String systemId, String filePath, String naked) throws ApiException {
        deleteFileItemWithHttpInfo(systemId, filePath, naked);
    }

    /**
     * 
     * Deletes a file or folder at the specified path on the specified remote system.
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFileItemWithHttpInfo(String systemId, String filePath, String naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteFileItemCall(systemId, filePath, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes a file or folder at the specified path on the specified remote system.
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFileItemAsync(String systemId, String filePath, String naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFileItemCall(systemId, filePath, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteFileItemOnDefaultSystem */
    private com.squareup.okhttp.Call deleteFileItemOnDefaultSystemCall(String filePath, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling deleteFileItemOnDefaultSystem(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteFileItemOnDefaultSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/media/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

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
     * Deletes a file or folder on default storage system of the user
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteFileItemOnDefaultSystem(String filePath, Boolean naked) throws ApiException {
        deleteFileItemOnDefaultSystemWithHttpInfo(filePath, naked);
    }

    /**
     * 
     * Deletes a file or folder on default storage system of the user
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteFileItemOnDefaultSystemWithHttpInfo(String filePath, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteFileItemOnDefaultSystemCall(filePath, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes a file or folder on default storage system of the user
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteFileItemOnDefaultSystemAsync(String filePath, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteFileItemOnDefaultSystemCall(filePath, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for downloadFileItem */
    private com.squareup.okhttp.Call downloadFileItemCall(String systemId, String filePath, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling downloadFileItem(Async)");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling downloadFileItem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/media/system/{systemId}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (force != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
     * Download a file from the given system
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param force Boolean flag to indicate whether the Content-Disposition header should be set to force a browser download. (optional, default to false)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void downloadFileItem(String systemId, String filePath, Boolean force) throws ApiException {
        downloadFileItemWithHttpInfo(systemId, filePath, force);
    }

    /**
     * 
     * Download a file from the given system
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param force Boolean flag to indicate whether the Content-Disposition header should be set to force a browser download. (optional, default to false)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> downloadFileItemWithHttpInfo(String systemId, String filePath, Boolean force) throws ApiException {
        com.squareup.okhttp.Call call = downloadFileItemCall(systemId, filePath, force, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Download a file from the given system
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param force Boolean flag to indicate whether the Content-Disposition header should be set to force a browser download. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadFileItemAsync(String systemId, String filePath, Boolean force, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = downloadFileItemCall(systemId, filePath, force, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for downloadFileItemOnDefaultSystem */
    private com.squareup.okhttp.Call downloadFileItemOnDefaultSystemCall(String filePath, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling downloadFileItemOnDefaultSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/media/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (force != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
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
     * Download a file from the default storage location of the user.
     * @param filePath The path of the file relative to the default storage location of the user (required)
     * @param force Boolean flag to indicate whether the Content-Disposition header should be set to force browser file download. (optional, default to false)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void downloadFileItemOnDefaultSystem(String filePath, Boolean force) throws ApiException {
        downloadFileItemOnDefaultSystemWithHttpInfo(filePath, force);
    }

    /**
     * 
     * Download a file from the default storage location of the user.
     * @param filePath The path of the file relative to the default storage location of the user (required)
     * @param force Boolean flag to indicate whether the Content-Disposition header should be set to force browser file download. (optional, default to false)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> downloadFileItemOnDefaultSystemWithHttpInfo(String filePath, Boolean force) throws ApiException {
        com.squareup.okhttp.Call call = downloadFileItemOnDefaultSystemCall(filePath, force, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Download a file from the default storage location of the user.
     * @param filePath The path of the file relative to the default storage location of the user (required)
     * @param force Boolean flag to indicate whether the Content-Disposition header should be set to force browser file download. (optional, default to false)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadFileItemOnDefaultSystemAsync(String filePath, Boolean force, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = downloadFileItemOnDefaultSystemCall(filePath, force, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for importFileItem */
    private com.squareup.okhttp.Call importFileItemCall(String systemId, String filePath, FileImportRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling importFileItem(Async)");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling importFileItem(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling importFileItem(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling importFileItem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/media/system/{systemId}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

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
     * Import file item from a remote URL to the target system
     * @param systemId The id of the system. (required)
     * @param filePath The relative or absolute path where the file item should be imported (required)
     * @param body The import request (required)
     * @param naked  (required)
     * @return FileInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileInfo importFileItem(String systemId, String filePath, FileImportRequest body, Boolean naked) throws ApiException {
        ApiResponse<FileInfo> resp = importFileItemWithHttpInfo(systemId, filePath, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Import file item from a remote URL to the target system
     * @param systemId The id of the system. (required)
     * @param filePath The relative or absolute path where the file item should be imported (required)
     * @param body The import request (required)
     * @param naked  (required)
     * @return ApiResponse&lt;FileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileInfo> importFileItemWithHttpInfo(String systemId, String filePath, FileImportRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = importFileItemCall(systemId, filePath, body, naked, null, null);
        Type localVarReturnType = new TypeToken<FileInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Import file item from a remote URL to the target system
     * @param systemId The id of the system. (required)
     * @param filePath The relative or absolute path where the file item should be imported (required)
     * @param body The import request (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call importFileItemAsync(String systemId, String filePath, FileImportRequest body, Boolean naked, final ApiCallback<FileInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = importFileItemCall(systemId, filePath, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for importFileItemToDefaultSystem */
    private com.squareup.okhttp.Call importFileItemToDefaultSystemCall(String filePath, FileImportRequest body, String naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling importFileItemToDefaultSystem(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling importFileItemToDefaultSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/media/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

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
     * Import file item from a remote URL to the target system
     * @param filePath The relative or absolute path where the file item should be imported (required)
     * @param body The import request (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @return FileInfo
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FileInfo importFileItemToDefaultSystem(String filePath, FileImportRequest body, String naked) throws ApiException {
        ApiResponse<FileInfo> resp = importFileItemToDefaultSystemWithHttpInfo(filePath, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Import file item from a remote URL to the target system
     * @param filePath The relative or absolute path where the file item should be imported (required)
     * @param body The import request (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @return ApiResponse&lt;FileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FileInfo> importFileItemToDefaultSystemWithHttpInfo(String filePath, FileImportRequest body, String naked) throws ApiException {
        com.squareup.okhttp.Call call = importFileItemToDefaultSystemCall(filePath, body, naked, null, null);
        Type localVarReturnType = new TypeToken<FileInfo>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Import file item from a remote URL to the target system
     * @param filePath The relative or absolute path where the file item should be imported (required)
     * @param body The import request (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call importFileItemToDefaultSystemAsync(String filePath, FileImportRequest body, String naked, final ApiCallback<FileInfo> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = importFileItemToDefaultSystemCall(filePath, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FileInfo>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for invokeFileActionOnDefaultSystem */
    private com.squareup.okhttp.Call invokeFileActionOnDefaultSystemCall(String filePath, FileAction body, String naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling invokeFileActionOnDefaultSystem(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling invokeFileActionOnDefaultSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/media/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

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
     * Perform an action on a file or folder.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param body The operation to perform (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object invokeFileActionOnDefaultSystem(String filePath, FileAction body, String naked) throws ApiException {
        ApiResponse<Object> resp = invokeFileActionOnDefaultSystemWithHttpInfo(filePath, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Perform an action on a file or folder.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param body The operation to perform (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> invokeFileActionOnDefaultSystemWithHttpInfo(String filePath, FileAction body, String naked) throws ApiException {
        com.squareup.okhttp.Call call = invokeFileActionOnDefaultSystemCall(filePath, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Perform an action on a file or folder.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param body The operation to perform (required)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call invokeFileActionOnDefaultSystemAsync(String filePath, FileAction body, String naked, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = invokeFileActionOnDefaultSystemCall(filePath, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for invokeFileItemAction */
    private com.squareup.okhttp.Call invokeFileItemActionCall(String systemId, String filePath, FileAction body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling invokeFileItemAction(Async)");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling invokeFileItemAction(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling invokeFileItemAction(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling invokeFileItemAction(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/media/system/{systemId}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

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
     * Perform an action on a file or folder.
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param body The operation to perform.  (required)
     * @param naked  (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Object invokeFileItemAction(String systemId, String filePath, FileAction body, Boolean naked) throws ApiException {
        ApiResponse<Object> resp = invokeFileItemActionWithHttpInfo(systemId, filePath, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Perform an action on a file or folder.
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param body The operation to perform.  (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Object> invokeFileItemActionWithHttpInfo(String systemId, String filePath, FileAction body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = invokeFileItemActionCall(systemId, filePath, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Perform an action on a file or folder.
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param body The operation to perform.  (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call invokeFileItemActionAsync(String systemId, String filePath, FileAction body, Boolean naked, final ApiCallback<Object> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = invokeFileItemActionCall(systemId, filePath, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listFileItemHistory */
    private com.squareup.okhttp.Call listFileItemHistoryCall(String filePath, String systemId, String status, String created, String filter, String naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling listFileItemHistory(Async)");
        }
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling listFileItemHistory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/history/system/{systemId}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()))
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
        if (created != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
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
     * Download a file from the default storage location of the user.
     * @param filePath The path of the file relative to the given system root location. (required)
     * @param systemId The system on which the file item resides (required)
     * @param status The status of the event (optional)
     * @param created The date the event occurred (optional)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return HistoryEvent
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public HistoryEvent listFileItemHistory(String filePath, String systemId, String status, String created, String filter, String naked, Long limit, Long offset) throws ApiException {
        ApiResponse<HistoryEvent> resp = listFileItemHistoryWithHttpInfo(filePath, systemId, status, created, filter, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Download a file from the default storage location of the user.
     * @param filePath The path of the file relative to the given system root location. (required)
     * @param systemId The system on which the file item resides (required)
     * @param status The status of the event (optional)
     * @param created The date the event occurred (optional)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;HistoryEvent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<HistoryEvent> listFileItemHistoryWithHttpInfo(String filePath, String systemId, String status, String created, String filter, String naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listFileItemHistoryCall(filePath, systemId, status, created, filter, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<HistoryEvent>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Download a file from the default storage location of the user.
     * @param filePath The path of the file relative to the given system root location. (required)
     * @param systemId The system on which the file item resides (required)
     * @param status The status of the event (optional)
     * @param created The date the event occurred (optional)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFileItemHistoryAsync(String filePath, String systemId, String status, String created, String filter, String naked, Long limit, Long offset, final ApiCallback<HistoryEvent> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listFileItemHistoryCall(filePath, systemId, status, created, filter, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<HistoryEvent>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listFileItemHistoryOnDefaultSystem */
    private com.squareup.okhttp.Call listFileItemHistoryOnDefaultSystemCall(String filePath, String status, String created, String filter, String naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling listFileItemHistoryOnDefaultSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/history/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
        if (created != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
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
     * List event history of a file item on the default storage system of the user
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param status The event status (optional)
     * @param created The date the event occurred (optional)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;HistoryEvent&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<HistoryEvent> listFileItemHistoryOnDefaultSystem(String filePath, String status, String created, String filter, String naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<HistoryEvent>> resp = listFileItemHistoryOnDefaultSystemWithHttpInfo(filePath, status, created, filter, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * List event history of a file item on the default storage system of the user
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param status The event status (optional)
     * @param created The date the event occurred (optional)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;HistoryEvent&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<HistoryEvent>> listFileItemHistoryOnDefaultSystemWithHttpInfo(String filePath, String status, String created, String filter, String naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listFileItemHistoryOnDefaultSystemCall(filePath, status, created, filter, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<HistoryEvent>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List event history of a file item on the default storage system of the user
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param status The event status (optional)
     * @param created The date the event occurred (optional)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFileItemHistoryOnDefaultSystemAsync(String filePath, String status, String created, String filter, String naked, Long limit, Long offset, final ApiCallback<List<HistoryEvent>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listFileItemHistoryOnDefaultSystemCall(filePath, status, created, filter, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<HistoryEvent>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listFileItemPermissions */
    private com.squareup.okhttp.Call listFileItemPermissionsCall(String filePath, Boolean naked, String systemId, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling listFileItemPermissions(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listFileItemPermissions(Async)");
        }
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling listFileItemPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/pems/system/{systemId}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()))
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
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
     * List all the share permissions for a file or folder.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @param systemId The system id (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;FilePermission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FilePermission> listFileItemPermissions(String filePath, Boolean naked, String systemId, Long limit, Long offset) throws ApiException {
        ApiResponse<List<FilePermission>> resp = listFileItemPermissionsWithHttpInfo(filePath, naked, systemId, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * List all the share permissions for a file or folder.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @param systemId The system id (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;FilePermission&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<FilePermission>> listFileItemPermissionsWithHttpInfo(String filePath, Boolean naked, String systemId, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listFileItemPermissionsCall(filePath, naked, systemId, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<FilePermission>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List all the share permissions for a file or folder.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @param systemId The system id (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFileItemPermissionsAsync(String filePath, Boolean naked, String systemId, Long limit, Long offset, final ApiCallback<List<FilePermission>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listFileItemPermissionsCall(filePath, naked, systemId, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<FilePermission>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listFileItemPermissionsOnDefaultSystem */
    private com.squareup.okhttp.Call listFileItemPermissionsOnDefaultSystemCall(String filePath, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling listFileItemPermissionsOnDefaultSystem(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listFileItemPermissionsOnDefaultSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/pems/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
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
     * List all the share permissions for a file or folder.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;FilePermission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FilePermission> listFileItemPermissionsOnDefaultSystem(String filePath, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<FilePermission>> resp = listFileItemPermissionsOnDefaultSystemWithHttpInfo(filePath, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * List all the share permissions for a file or folder.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;FilePermission&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<FilePermission>> listFileItemPermissionsOnDefaultSystemWithHttpInfo(String filePath, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listFileItemPermissionsOnDefaultSystemCall(filePath, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<FilePermission>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List all the share permissions for a file or folder.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFileItemPermissionsOnDefaultSystemAsync(String filePath, Boolean naked, Long limit, Long offset, final ApiCallback<List<FilePermission>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listFileItemPermissionsOnDefaultSystemCall(filePath, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<FilePermission>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listFileItems */
    private com.squareup.okhttp.Call listFileItemsCall(String systemId, String filePath, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling listFileItems(Async)");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling listFileItems(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listFileItems(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/listings/system/{systemId}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "systemId" + "\\}", apiClient.escapeString(systemId.toString()))
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

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
     * Get a remote directory listing on a specific system.
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;FileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FileInfo> listFileItems(String systemId, String filePath, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<FileInfo>> resp = listFileItemsWithHttpInfo(systemId, filePath, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Get a remote directory listing on a specific system.
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;FileInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<FileInfo>> listFileItemsWithHttpInfo(String systemId, String filePath, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listFileItemsCall(systemId, filePath, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<FileInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a remote directory listing on a specific system.
     * @param systemId The unique id of the system on which the data resides. (required)
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFileItemsAsync(String systemId, String filePath, Boolean naked, Long limit, Long offset, final ApiCallback<List<FileInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listFileItemsCall(systemId, filePath, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<FileInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listFileItemsOnDefaultSystem */
    private com.squareup.okhttp.Call listFileItemsOnDefaultSystemCall(String filepath, String filter, String naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'filepath' is set
        if (filepath == null) {
            throw new ApiException("Missing the required parameter 'filepath' when calling listFileItemsOnDefaultSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/listings/{filepath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filepath" + "\\}", apiClient.escapeString(filepath.toString()));

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
     * Get a remote directory listing on the default storage system of the user
     * @param filepath The path of the file relative to the default storage location of the user (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;FileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FileInfo> listFileItemsOnDefaultSystem(String filepath, String filter, String naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<FileInfo>> resp = listFileItemsOnDefaultSystemWithHttpInfo(filepath, filter, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Get a remote directory listing on the default storage system of the user
     * @param filepath The path of the file relative to the default storage location of the user (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;FileInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<FileInfo>> listFileItemsOnDefaultSystemWithHttpInfo(String filepath, String filter, String naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listFileItemsOnDefaultSystemCall(filepath, filter, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<FileInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a remote directory listing on the default storage system of the user
     * @param filepath The path of the file relative to the default storage location of the user (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param naked If true, the response wrapper is stripped and the raw object is returned (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listFileItemsOnDefaultSystemAsync(String filepath, String filter, String naked, Long limit, Long offset, final ApiCallback<List<FileInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listFileItemsOnDefaultSystemCall(filepath, filter, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<FileInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateFileItemPermission */
    private com.squareup.okhttp.Call updateFileItemPermissionCall(String filePath, String systemId, PermissionRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling updateFileItemPermission(Async)");
        }
        
        // verify the required parameter 'systemId' is set
        if (systemId == null) {
            throw new ApiException("Missing the required parameter 'systemId' when calling updateFileItemPermission(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateFileItemPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateFileItemPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/pems/system/{systemId}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()))
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
     * Update permissions for a single user.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param systemId The id of the system on which the file resides (required)
     * @param body The updated permission value (required)
     * @param naked  (required)
     * @return FilePermission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilePermission updateFileItemPermission(String filePath, String systemId, PermissionRequest body, Boolean naked) throws ApiException {
        ApiResponse<FilePermission> resp = updateFileItemPermissionWithHttpInfo(filePath, systemId, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update permissions for a single user.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param systemId The id of the system on which the file resides (required)
     * @param body The updated permission value (required)
     * @param naked  (required)
     * @return ApiResponse&lt;FilePermission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilePermission> updateFileItemPermissionWithHttpInfo(String filePath, String systemId, PermissionRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateFileItemPermissionCall(filePath, systemId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<FilePermission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update permissions for a single user.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param systemId The id of the system on which the file resides (required)
     * @param body The updated permission value (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateFileItemPermissionAsync(String filePath, String systemId, PermissionRequest body, Boolean naked, final ApiCallback<FilePermission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateFileItemPermissionCall(filePath, systemId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilePermission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateFileItemPermissionsOnDefaultSystem */
    private com.squareup.okhttp.Call updateFileItemPermissionsOnDefaultSystemCall(String filePath, FilePermissionRequest body, Boolean filePath2, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling updateFileItemPermissionsOnDefaultSystem(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateFileItemPermissionsOnDefaultSystem(Async)");
        }
        
        // verify the required parameter 'filePath2' is set
        if (filePath2 == null) {
            throw new ApiException("Missing the required parameter 'filePath2' when calling updateFileItemPermissionsOnDefaultSystem(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/files/v2/pems/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (filePath2 != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "filePath", filePath2));

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
     * Update permissions for a single user on their default storage system.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param body The permission add or update.  (required)
     * @param filePath2  (required)
     * @return FilePermission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public FilePermission updateFileItemPermissionsOnDefaultSystem(String filePath, FilePermissionRequest body, Boolean filePath2) throws ApiException {
        ApiResponse<FilePermission> resp = updateFileItemPermissionsOnDefaultSystemWithHttpInfo(filePath, body, filePath2);
        return resp.getData();
    }

    /**
     * 
     * Update permissions for a single user on their default storage system.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param body The permission add or update.  (required)
     * @param filePath2  (required)
     * @return ApiResponse&lt;FilePermission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<FilePermission> updateFileItemPermissionsOnDefaultSystemWithHttpInfo(String filePath, FilePermissionRequest body, Boolean filePath2) throws ApiException {
        com.squareup.okhttp.Call call = updateFileItemPermissionsOnDefaultSystemCall(filePath, body, filePath2, null, null);
        Type localVarReturnType = new TypeToken<FilePermission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update permissions for a single user on their default storage system.
     * @param filePath The path of the file relative to the default storage location of the user. (required)
     * @param body The permission add or update.  (required)
     * @param filePath2  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateFileItemPermissionsOnDefaultSystemAsync(String filePath, FilePermissionRequest body, Boolean filePath2, final ApiCallback<FilePermission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateFileItemPermissionsOnDefaultSystemCall(filePath, body, filePath2, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<FilePermission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
