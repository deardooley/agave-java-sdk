

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
import org.agave.client.model.Metadata;
import org.agave.client.model.MetadataSchema;
import org.agave.client.model.Permission;

public class MetaApi {
    private ApiClient apiClient;

    public MetaApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MetaApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addMetadata */
    private com.squareup.okhttp.Call addMetadataCall(Metadata body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addMetadata(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addMetadata(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data".replaceAll("\\{format\\}","json");

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
     * Update or Add new Metadata.
     * @param body The metadata to add. (required)
     * @param naked  (required)
     * @return Metadata
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Metadata addMetadata(Metadata body, Boolean naked) throws ApiException {
        ApiResponse<Metadata> resp = addMetadataWithHttpInfo(body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update or Add new Metadata.
     * @param body The metadata to add. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Metadata&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Metadata> addMetadataWithHttpInfo(Metadata body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addMetadataCall(body, naked, null, null);
        Type localVarReturnType = new TypeToken<Metadata>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update or Add new Metadata.
     * @param body The metadata to add. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMetadataAsync(Metadata body, Boolean naked, final ApiCallback<Metadata> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addMetadataCall(body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Metadata>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addMetadataPermission */
    private com.squareup.okhttp.Call addMetadataPermissionCall(String uuid, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling addMetadataPermission(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addMetadataPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addMetadataPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data/{uuid}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Add a user permission for the given metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param body The metadata permission to update. (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission addMetadataPermission(String uuid, Permission body, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = addMetadataPermissionWithHttpInfo(uuid, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add a user permission for the given metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param body The metadata permission to update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> addMetadataPermissionWithHttpInfo(String uuid, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addMetadataPermissionCall(uuid, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add a user permission for the given metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param body The metadata permission to update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMetadataPermissionAsync(String uuid, Permission body, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addMetadataPermissionCall(uuid, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addMetadataSchema */
    private com.squareup.okhttp.Call addMetadataSchemaCall(MetadataSchema body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addMetadataSchema(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addMetadataSchema(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas".replaceAll("\\{format\\}","json");

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
     * Add a new Metadata Schema.
     * @param body A valid JSON Schema object (required)
     * @param naked  (required)
     * @return MetadataSchema
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MetadataSchema addMetadataSchema(MetadataSchema body, Boolean naked) throws ApiException {
        ApiResponse<MetadataSchema> resp = addMetadataSchemaWithHttpInfo(body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add a new Metadata Schema.
     * @param body A valid JSON Schema object (required)
     * @param naked  (required)
     * @return ApiResponse&lt;MetadataSchema&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MetadataSchema> addMetadataSchemaWithHttpInfo(MetadataSchema body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addMetadataSchemaCall(body, naked, null, null);
        Type localVarReturnType = new TypeToken<MetadataSchema>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add a new Metadata Schema.
     * @param body A valid JSON Schema object (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMetadataSchemaAsync(MetadataSchema body, Boolean naked, final ApiCallback<MetadataSchema> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addMetadataSchemaCall(body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MetadataSchema>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addMetadataSchemaPermission */
    private com.squareup.okhttp.Call addMetadataSchemaPermissionCall(String uuid, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling addMetadataSchemaPermission(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addMetadataSchemaPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addMetadataSchemaPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas/{uuid}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Add a user permission for the given schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param body The schema permission to update. (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission addMetadataSchemaPermission(String uuid, Permission body, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = addMetadataSchemaPermissionWithHttpInfo(uuid, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add a user permission for the given schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param body The schema permission to update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> addMetadataSchemaPermissionWithHttpInfo(String uuid, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addMetadataSchemaPermissionCall(uuid, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add a user permission for the given schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param body The schema permission to update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMetadataSchemaPermissionAsync(String uuid, Permission body, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addMetadataSchemaPermissionCall(uuid, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for clearMetadataPermissions */
    private com.squareup.okhttp.Call clearMetadataPermissionsCall(String uuid, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling clearMetadataPermissions(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling clearMetadataPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data/{uuid}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Deletes all permissions on the given metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearMetadataPermissions(String uuid, Boolean naked) throws ApiException {
        clearMetadataPermissionsWithHttpInfo(uuid, naked);
    }

    /**
     * 
     * Deletes all permissions on the given metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearMetadataPermissionsWithHttpInfo(String uuid, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearMetadataPermissionsCall(uuid, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all permissions on the given metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearMetadataPermissionsAsync(String uuid, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearMetadataPermissionsCall(uuid, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for clearMetadataSchemaPermissions */
    private com.squareup.okhttp.Call clearMetadataSchemaPermissionsCall(String uuid, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling clearMetadataSchemaPermissions(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling clearMetadataSchemaPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas/{uuid}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Deletes all permissions on the given schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearMetadataSchemaPermissions(String uuid, Boolean naked) throws ApiException {
        clearMetadataSchemaPermissionsWithHttpInfo(uuid, naked);
    }

    /**
     * 
     * Deletes all permissions on the given schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearMetadataSchemaPermissionsWithHttpInfo(String uuid, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearMetadataSchemaPermissionsCall(uuid, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all permissions on the given schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearMetadataSchemaPermissionsAsync(String uuid, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearMetadataSchemaPermissionsCall(uuid, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteMetadata */
    private com.squareup.okhttp.Call deleteMetadataCall(String uuid, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling deleteMetadata(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteMetadata(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Remove Metadata from the system.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteMetadata(String uuid, Boolean naked) throws ApiException {
        deleteMetadataWithHttpInfo(uuid, naked);
    }

    /**
     * 
     * Remove Metadata from the system.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteMetadataWithHttpInfo(String uuid, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteMetadataCall(uuid, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Remove Metadata from the system.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMetadataAsync(String uuid, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteMetadataCall(uuid, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteMetadataPermission */
    private com.squareup.okhttp.Call deleteMetadataPermissionCall(String uuid, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling deleteMetadataPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling deleteMetadataPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteMetadataPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data/{uuid}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
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
     * Removes user permissions for a user on a given metadata resource.
     * @param uuid The uuid of the metadata item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteMetadataPermission(String uuid, String username, Boolean naked) throws ApiException {
        deleteMetadataPermissionWithHttpInfo(uuid, username, naked);
    }

    /**
     * 
     * Removes user permissions for a user on a given metadata resource.
     * @param uuid The uuid of the metadata item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteMetadataPermissionWithHttpInfo(String uuid, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteMetadataPermissionCall(uuid, username, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Removes user permissions for a user on a given metadata resource.
     * @param uuid The uuid of the metadata item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMetadataPermissionAsync(String uuid, String username, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteMetadataPermissionCall(uuid, username, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteMetadataSchema */
    private com.squareup.okhttp.Call deleteMetadataSchemaCall(String uuid, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling deleteMetadataSchema(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteMetadataSchema(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Remove Metadata Schema from the system.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteMetadataSchema(String uuid, Boolean naked) throws ApiException {
        deleteMetadataSchemaWithHttpInfo(uuid, naked);
    }

    /**
     * 
     * Remove Metadata Schema from the system.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteMetadataSchemaWithHttpInfo(String uuid, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteMetadataSchemaCall(uuid, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Remove Metadata Schema from the system.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMetadataSchemaAsync(String uuid, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteMetadataSchemaCall(uuid, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteSchemaPermission */
    private com.squareup.okhttp.Call deleteSchemaPermissionCall(String uuid, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling deleteSchemaPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling deleteSchemaPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteSchemaPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas/{uuid}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
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
     * Deletes all metadata schema permissions on the given metadata.
     * @param uuid The uuid of the metadata schema item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteSchemaPermission(String uuid, String username, Boolean naked) throws ApiException {
        deleteSchemaPermissionWithHttpInfo(uuid, username, naked);
    }

    /**
     * 
     * Deletes all metadata schema permissions on the given metadata.
     * @param uuid The uuid of the metadata schema item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteSchemaPermissionWithHttpInfo(String uuid, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteSchemaPermissionCall(uuid, username, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all metadata schema permissions on the given metadata.
     * @param uuid The uuid of the metadata schema item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteSchemaPermissionAsync(String uuid, String username, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteSchemaPermissionCall(uuid, username, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getMetadata */
    private com.squareup.okhttp.Call getMetadataCall(String uuid, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getMetadata(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getMetadata(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Retrieve Metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @return Metadata
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Metadata getMetadata(String uuid, Boolean naked) throws ApiException {
        ApiResponse<Metadata> resp = getMetadataWithHttpInfo(uuid, naked);
        return resp.getData();
    }

    /**
     * 
     * Retrieve Metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Metadata&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Metadata> getMetadataWithHttpInfo(String uuid, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getMetadataCall(uuid, naked, null, null);
        Type localVarReturnType = new TypeToken<Metadata>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve Metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMetadataAsync(String uuid, Boolean naked, final ApiCallback<Metadata> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMetadataCall(uuid, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Metadata>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMetadataPermission */
    private com.squareup.okhttp.Call getMetadataPermissionCall(String uuid, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getMetadataPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getMetadataPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getMetadataPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data/{uuid}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
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
     * Get the user permission for this metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission getMetadataPermission(String uuid, String username, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = getMetadataPermissionWithHttpInfo(uuid, username, naked);
        return resp.getData();
    }

    /**
     * 
     * Get the user permission for this metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> getMetadataPermissionWithHttpInfo(String uuid, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getMetadataPermissionCall(uuid, username, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the user permission for this metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMetadataPermissionAsync(String uuid, String username, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMetadataPermissionCall(uuid, username, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMetadataSchema */
    private com.squareup.okhttp.Call getMetadataSchemaCall(String uuid, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getMetadataSchema(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getMetadataSchema(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Retrieve Metadata Schemata.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @return MetadataSchema
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MetadataSchema getMetadataSchema(String uuid, Boolean naked) throws ApiException {
        ApiResponse<MetadataSchema> resp = getMetadataSchemaWithHttpInfo(uuid, naked);
        return resp.getData();
    }

    /**
     * 
     * Retrieve Metadata Schemata.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @return ApiResponse&lt;MetadataSchema&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MetadataSchema> getMetadataSchemaWithHttpInfo(String uuid, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getMetadataSchemaCall(uuid, naked, null, null);
        Type localVarReturnType = new TypeToken<MetadataSchema>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve Metadata Schemata.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMetadataSchemaAsync(String uuid, Boolean naked, final ApiCallback<MetadataSchema> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMetadataSchemaCall(uuid, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MetadataSchema>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMetadataSchemaPermission */
    private com.squareup.okhttp.Call getMetadataSchemaPermissionCall(String uuid, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getMetadataSchemaPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getMetadataSchemaPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getMetadataSchemaPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas/{uuid}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
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
     * Get the user permission for this schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission getMetadataSchemaPermission(String uuid, String username, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = getMetadataSchemaPermissionWithHttpInfo(uuid, username, naked);
        return resp.getData();
    }

    /**
     * 
     * Get the user permission for this schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> getMetadataSchemaPermissionWithHttpInfo(String uuid, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getMetadataSchemaPermissionCall(uuid, username, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the user permission for this schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param username The username of the permission owner (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMetadataSchemaPermissionAsync(String uuid, String username, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMetadataSchemaPermissionCall(uuid, username, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listMetadata */
    private com.squareup.okhttp.Call listMetadataCall(String q, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new ApiException("Missing the required parameter 'q' when calling listMetadata(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listMetadata(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
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
     * List and/or search metadata.
     * @param q The query to perform. Traditional MongoDB queries are supported (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;Metadata&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Metadata> listMetadata(String q, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<Metadata>> resp = listMetadataWithHttpInfo(q, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * List and/or search metadata.
     * @param q The query to perform. Traditional MongoDB queries are supported (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;Metadata&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Metadata>> listMetadataWithHttpInfo(String q, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listMetadataCall(q, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<Metadata>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List and/or search metadata.
     * @param q The query to perform. Traditional MongoDB queries are supported (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMetadataAsync(String q, Boolean naked, Long limit, Long offset, final ApiCallback<List<Metadata>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMetadataCall(q, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Metadata>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listMetadataPermissions */
    private com.squareup.okhttp.Call listMetadataPermissionsCall(String uuid, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling listMetadataPermissions(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listMetadataPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data/{uuid}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Get the permission ACL for this metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission listMetadataPermissions(String uuid, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<Permission> resp = listMetadataPermissionsWithHttpInfo(uuid, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Get the permission ACL for this metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> listMetadataPermissionsWithHttpInfo(String uuid, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listMetadataPermissionsCall(uuid, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the permission ACL for this metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMetadataPermissionsAsync(String uuid, Boolean naked, Long limit, Long offset, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMetadataPermissionsCall(uuid, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listMetadataSchema */
    private com.squareup.okhttp.Call listMetadataSchemaCall(String q, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'q' is set
        if (q == null) {
            throw new ApiException("Missing the required parameter 'q' when calling listMetadataSchema(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listMetadataSchema(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "q", q));
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
     * List and query Metadata Schemata.
     * @param q A valid query object defining the search parameters. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;MetadataSchema&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MetadataSchema> listMetadataSchema(String q, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<MetadataSchema>> resp = listMetadataSchemaWithHttpInfo(q, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * List and query Metadata Schemata.
     * @param q A valid query object defining the search parameters. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;MetadataSchema&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MetadataSchema>> listMetadataSchemaWithHttpInfo(String q, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listMetadataSchemaCall(q, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<MetadataSchema>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List and query Metadata Schemata.
     * @param q A valid query object defining the search parameters. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMetadataSchemaAsync(String q, Boolean naked, Long limit, Long offset, final ApiCallback<List<MetadataSchema>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMetadataSchemaCall(q, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MetadataSchema>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listMetadataSchemaPermissions */
    private com.squareup.okhttp.Call listMetadataSchemaPermissionsCall(String uuid, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling listMetadataSchemaPermissions(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listMetadataSchemaPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas/{uuid}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Get the permission for this schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Permission> listMetadataSchemaPermissions(String uuid, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<Permission>> resp = listMetadataSchemaPermissionsWithHttpInfo(uuid, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Get the permission for this schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;Permission&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Permission>> listMetadataSchemaPermissionsWithHttpInfo(String uuid, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listMetadataSchemaPermissionsCall(uuid, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the permission for this schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMetadataSchemaPermissionsAsync(String uuid, Boolean naked, Long limit, Long offset, final ApiCallback<List<Permission>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMetadataSchemaPermissionsCall(uuid, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateMetadata */
    private com.squareup.okhttp.Call updateMetadataCall(String uuid, Metadata body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling updateMetadata(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateMetadata(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateMetadata(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Update or Add new Metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param body The metadata to update. (required)
     * @param naked  (required)
     * @return Metadata
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Metadata updateMetadata(String uuid, Metadata body, Boolean naked) throws ApiException {
        ApiResponse<Metadata> resp = updateMetadataWithHttpInfo(uuid, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update or Add new Metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param body The metadata to update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Metadata&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Metadata> updateMetadataWithHttpInfo(String uuid, Metadata body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateMetadataCall(uuid, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Metadata>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update or Add new Metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param body The metadata to update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMetadataAsync(String uuid, Metadata body, Boolean naked, final ApiCallback<Metadata> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMetadataCall(uuid, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Metadata>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateMetadataPermission */
    private com.squareup.okhttp.Call updateMetadataPermissionCall(String uuid, String username, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling updateMetadataPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling updateMetadataPermission(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateMetadataPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateMetadataPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/data/{uuid}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
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
     * Update a user permission for the given metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param username The username of the permission owner (required)
     * @param body The metadata permission to update. (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission updateMetadataPermission(String uuid, String username, Permission body, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = updateMetadataPermissionWithHttpInfo(uuid, username, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update a user permission for the given metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param username The username of the permission owner (required)
     * @param body The metadata permission to update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> updateMetadataPermissionWithHttpInfo(String uuid, String username, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateMetadataPermissionCall(uuid, username, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update a user permission for the given metadata.
     * @param uuid The uuid of the metadata item (required)
     * @param username The username of the permission owner (required)
     * @param body The metadata permission to update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMetadataPermissionAsync(String uuid, String username, Permission body, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMetadataPermissionCall(uuid, username, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateMetadataSchema */
    private com.squareup.okhttp.Call updateMetadataSchemaCall(String uuid, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling updateMetadataSchema(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateMetadataSchema(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateMetadataSchema(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()));

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
     * Update an existing Metadata Schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param body A valid JSON Schema object (required)
     * @param naked  (required)
     * @return MetadataSchema
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MetadataSchema updateMetadataSchema(String uuid, Permission body, Boolean naked) throws ApiException {
        ApiResponse<MetadataSchema> resp = updateMetadataSchemaWithHttpInfo(uuid, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update an existing Metadata Schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param body A valid JSON Schema object (required)
     * @param naked  (required)
     * @return ApiResponse&lt;MetadataSchema&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MetadataSchema> updateMetadataSchemaWithHttpInfo(String uuid, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateMetadataSchemaCall(uuid, body, naked, null, null);
        Type localVarReturnType = new TypeToken<MetadataSchema>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update an existing Metadata Schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param body A valid JSON Schema object (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMetadataSchemaAsync(String uuid, Permission body, Boolean naked, final ApiCallback<MetadataSchema> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMetadataSchemaCall(uuid, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MetadataSchema>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateMetadataSchemaPermission */
    private com.squareup.okhttp.Call updateMetadataSchemaPermissionCall(String uuid, String username, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling updateMetadataSchemaPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling updateMetadataSchemaPermission(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateMetadataSchemaPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateMetadataSchemaPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/meta/v2/schemas/{uuid}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "uuid" + "\\}", apiClient.escapeString(uuid.toString()))
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
     * Add or update a user permission for the given metadata schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param username The username of the permission owner (required)
     * @param body The schema permission to update. (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission updateMetadataSchemaPermission(String uuid, String username, Permission body, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = updateMetadataSchemaPermissionWithHttpInfo(uuid, username, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add or update a user permission for the given metadata schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param username The username of the permission owner (required)
     * @param body The schema permission to update. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> updateMetadataSchemaPermissionWithHttpInfo(String uuid, String username, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateMetadataSchemaPermissionCall(uuid, username, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add or update a user permission for the given metadata schema.
     * @param uuid The uuid of the metadata schema item (required)
     * @param username The username of the permission owner (required)
     * @param body The schema permission to update. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMetadataSchemaPermissionAsync(String uuid, String username, Permission body, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMetadataSchemaPermissionCall(uuid, username, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
