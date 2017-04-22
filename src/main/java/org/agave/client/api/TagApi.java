

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
import org.agave.client.model.Permission;
import org.agave.client.model.Tag;
import org.agave.client.model.TagHistory;
import org.agave.client.model.TagResource;
import org.agave.client.model.TagSummary;

public class TagApi {
    private ApiClient apiClient;

    public TagApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TagApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addTag */
    private com.squareup.okhttp.Call addTagCall(Tag body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addTag(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2".replaceAll("\\{format\\}","json");

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
            "application/json", "multipart/form-data"
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
     * Creat a new tag
     * Creates a new tag
     * @param body JSON Tag object (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag addTag(Tag body, Boolean naked) throws ApiException {
        ApiResponse<Tag> resp = addTagWithHttpInfo(body, naked);
        return resp.getData();
    }

    /**
     * Creat a new tag
     * Creates a new tag
     * @param body JSON Tag object (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> addTagWithHttpInfo(Tag body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addTagCall(body, naked, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Creat a new tag (asynchronously)
     * Creates a new tag
     * @param body JSON Tag object (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTagAsync(Tag body, Boolean naked, final ApiCallback<Tag> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addTagCall(body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addTagResource */
    private com.squareup.okhttp.Call addTagResourceCall(String tagId, TagResource body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling addTagResource(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addTagResource(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/resources".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()));

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
     * Add resources to tag
     * Adds the list of resources to the given tag
     * @param tagId Unique id of the tag (required)
     * @param body List of resource uuid to add (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return List&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Tag> addTagResource(String tagId, TagResource body, Boolean naked) throws ApiException {
        ApiResponse<List<Tag>> resp = addTagResourceWithHttpInfo(tagId, body, naked);
        return resp.getData();
    }

    /**
     * Add resources to tag
     * Adds the list of resources to the given tag
     * @param tagId Unique id of the tag (required)
     * @param body List of resource uuid to add (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;List&lt;Tag&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Tag>> addTagResourceWithHttpInfo(String tagId, TagResource body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addTagResourceCall(tagId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<List<Tag>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add resources to tag (asynchronously)
     * Adds the list of resources to the given tag
     * @param tagId Unique id of the tag (required)
     * @param body List of resource uuid to add (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addTagResourceAsync(String tagId, TagResource body, Boolean naked, final ApiCallback<List<Tag>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addTagResourceCall(tagId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Tag>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for clearTagPermissions */
    private com.squareup.okhttp.Call clearTagPermissionsCall(String tagId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling clearTagPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()));

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
     * Clear tag permissions
     * Removes all permissions save ownership from the given tag
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearTagPermissions(String tagId, Boolean naked) throws ApiException {
        clearTagPermissionsWithHttpInfo(tagId, naked);
    }

    /**
     * Clear tag permissions
     * Removes all permissions save ownership from the given tag
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearTagPermissionsWithHttpInfo(String tagId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearTagPermissionsCall(tagId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     * Clear tag permissions (asynchronously)
     * Removes all permissions save ownership from the given tag
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearTagPermissionsAsync(String tagId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearTagPermissionsCall(tagId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for clearTagResources */
    private com.squareup.okhttp.Call clearTagResourcesCall(String tagId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling clearTagResources(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/resources".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()));

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
     * Clear all tagged resources
     * Removes all resources from the given tag
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearTagResources(String tagId, Boolean naked) throws ApiException {
        clearTagResourcesWithHttpInfo(tagId, naked);
    }

    /**
     * Clear all tagged resources
     * Removes all resources from the given tag
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearTagResourcesWithHttpInfo(String tagId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearTagResourcesCall(tagId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     * Clear all tagged resources (asynchronously)
     * Removes all resources from the given tag
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearTagResourcesAsync(String tagId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearTagResourcesCall(tagId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteTag */
    private com.squareup.okhttp.Call deleteTagCall(String tagId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling deleteTag(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()));

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
     * Delete tag
     * Deletes the tag and all permissions
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTag(String tagId, Boolean naked) throws ApiException {
        deleteTagWithHttpInfo(tagId, naked);
    }

    /**
     * Delete tag
     * Deletes the tag and all permissions
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTagWithHttpInfo(String tagId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteTagCall(tagId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete tag (asynchronously)
     * Deletes the tag and all permissions
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTagAsync(String tagId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTagCall(tagId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteTagPermissionForUser */
    private com.squareup.okhttp.Call deleteTagPermissionForUserCall(String tagId, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling deleteTagPermissionForUser(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling deleteTagPermissionForUser(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()))
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
     * Remove user tag permission
     * Removes permissions for the given user on the given tag
     * @param tagId Unique id of the tag (required)
     * @param username Username to revoke permission (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteTagPermissionForUser(String tagId, String username, Boolean naked) throws ApiException {
        deleteTagPermissionForUserWithHttpInfo(tagId, username, naked);
    }

    /**
     * Remove user tag permission
     * Removes permissions for the given user on the given tag
     * @param tagId Unique id of the tag (required)
     * @param username Username to revoke permission (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteTagPermissionForUserWithHttpInfo(String tagId, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteTagPermissionForUserCall(tagId, username, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     * Remove user tag permission (asynchronously)
     * Removes permissions for the given user on the given tag
     * @param tagId Unique id of the tag (required)
     * @param username Username to revoke permission (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteTagPermissionForUserAsync(String tagId, String username, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteTagPermissionForUserCall(tagId, username, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getTagDetails */
    private com.squareup.okhttp.Call getTagDetailsCall(String tagId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling getTagDetails(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()));

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
     * Tag Details
     * Returns detailed information about the named tag
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag getTagDetails(String tagId, Boolean naked) throws ApiException {
        ApiResponse<Tag> resp = getTagDetailsWithHttpInfo(tagId, naked);
        return resp.getData();
    }

    /**
     * Tag Details
     * Returns detailed information about the named tag
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> getTagDetailsWithHttpInfo(String tagId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getTagDetailsCall(tagId, naked, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Tag Details (asynchronously)
     * Returns detailed information about the named tag
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTagDetailsAsync(String tagId, Boolean naked, final ApiCallback<Tag> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTagDetailsCall(tagId, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTagPermissionForUser */
    private com.squareup.okhttp.Call getTagPermissionForUserCall(String tagId, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling getTagPermissionForUser(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getTagPermissionForUser(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()))
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
     * List tag permissions for a user
     * Returns the permission set on the given tag for a specific user.
     * @param tagId Unique id of the tag (required)
     * @param username Valid username (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return List&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Permission> getTagPermissionForUser(String tagId, String username, Boolean naked) throws ApiException {
        ApiResponse<List<Permission>> resp = getTagPermissionForUserWithHttpInfo(tagId, username, naked);
        return resp.getData();
    }

    /**
     * List tag permissions for a user
     * Returns the permission set on the given tag for a specific user.
     * @param tagId Unique id of the tag (required)
     * @param username Valid username (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;List&lt;Permission&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Permission>> getTagPermissionForUserWithHttpInfo(String tagId, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getTagPermissionForUserCall(tagId, username, naked, null, null);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List tag permissions for a user (asynchronously)
     * Returns the permission set on the given tag for a specific user.
     * @param tagId Unique id of the tag (required)
     * @param username Valid username (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTagPermissionForUserAsync(String tagId, String username, Boolean naked, final ApiCallback<List<Permission>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTagPermissionForUserCall(tagId, username, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTaggedResource */
    private com.squareup.okhttp.Call getTaggedResourceCall(String tagId, String uuid, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling getTaggedResource(Async)");
        }
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling getTaggedResource(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/resources/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()))
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
     * Get tagged item details
     * Returns a list of items with the given tag.
     * @param tagId Unique id of the tag (required)
     * @param uuid Unique id of a resource (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return TagResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TagResource getTaggedResource(String tagId, String uuid, Boolean naked) throws ApiException {
        ApiResponse<TagResource> resp = getTaggedResourceWithHttpInfo(tagId, uuid, naked);
        return resp.getData();
    }

    /**
     * Get tagged item details
     * Returns a list of items with the given tag.
     * @param tagId Unique id of the tag (required)
     * @param uuid Unique id of a resource (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;TagResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TagResource> getTaggedResourceWithHttpInfo(String tagId, String uuid, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getTaggedResourceCall(tagId, uuid, naked, null, null);
        Type localVarReturnType = new TypeToken<TagResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get tagged item details (asynchronously)
     * Returns a list of items with the given tag.
     * @param tagId Unique id of the tag (required)
     * @param uuid Unique id of a resource (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTaggedResourceAsync(String tagId, String uuid, Boolean naked, final ApiCallback<TagResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTaggedResourceCall(tagId, uuid, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TagResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listTagHistory */
    private com.squareup.okhttp.Call listTagHistoryCall(String tagId, Boolean naked, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling listTagHistory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/history".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()));

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
     * Tag history
     * Returns a list of items with the given tag.
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @return List&lt;TagHistory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TagHistory> listTagHistory(String tagId, Boolean naked, Integer limit, Integer offset) throws ApiException {
        ApiResponse<List<TagHistory>> resp = listTagHistoryWithHttpInfo(tagId, naked, limit, offset);
        return resp.getData();
    }

    /**
     * Tag history
     * Returns a list of items with the given tag.
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @return ApiResponse&lt;List&lt;TagHistory&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TagHistory>> listTagHistoryWithHttpInfo(String tagId, Boolean naked, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = listTagHistoryCall(tagId, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<TagHistory>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Tag history (asynchronously)
     * Returns a list of items with the given tag.
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listTagHistoryAsync(String tagId, Boolean naked, Integer limit, Integer offset, final ApiCallback<List<TagHistory>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listTagHistoryCall(tagId, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TagHistory>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listTagPermissions */
    private com.squareup.okhttp.Call listTagPermissionsCall(String tagId, Boolean naked, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling listTagPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()));

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
     * List permissionss set for a given tag id
     * Returns a list of permission objects set on this Tag
     * @param tagId Unique id of the system (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @return List&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Permission> listTagPermissions(String tagId, Boolean naked, Integer limit, Integer offset) throws ApiException {
        ApiResponse<List<Permission>> resp = listTagPermissionsWithHttpInfo(tagId, naked, limit, offset);
        return resp.getData();
    }

    /**
     * List permissionss set for a given tag id
     * Returns a list of permission objects set on this Tag
     * @param tagId Unique id of the system (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @return ApiResponse&lt;List&lt;Permission&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Permission>> listTagPermissionsWithHttpInfo(String tagId, Boolean naked, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = listTagPermissionsCall(tagId, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List permissionss set for a given tag id (asynchronously)
     * Returns a list of permission objects set on this Tag
     * @param tagId Unique id of the system (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listTagPermissionsAsync(String tagId, Boolean naked, Integer limit, Integer offset, final ApiCallback<List<Permission>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listTagPermissionsCall(tagId, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listTagResources */
    private com.squareup.okhttp.Call listTagResourcesCall(String tagId, Boolean naked, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling listTagResources(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/resources".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()));

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
     * Tagged items
     * Returns a list of items with the given tag.
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @return List&lt;TagResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TagResource> listTagResources(String tagId, Boolean naked, Integer limit, Integer offset) throws ApiException {
        ApiResponse<List<TagResource>> resp = listTagResourcesWithHttpInfo(tagId, naked, limit, offset);
        return resp.getData();
    }

    /**
     * Tagged items
     * Returns a list of items with the given tag.
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @return ApiResponse&lt;List&lt;TagResource&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TagResource>> listTagResourcesWithHttpInfo(String tagId, Boolean naked, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = listTagResourcesCall(tagId, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<TagResource>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Tagged items (asynchronously)
     * Returns a list of items with the given tag.
     * @param tagId Unique id of the tag (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listTagResourcesAsync(String tagId, Boolean naked, Integer limit, Integer offset, final ApiCallback<List<TagResource>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listTagResourcesCall(tagId, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TagResource>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listTags */
    private com.squareup.okhttp.Call listTagsCall(String name, String resourceType, String resourceId, String lastModified, String created, Boolean naked, Integer limit, Integer offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        

        // create path and map variables
        String localVarPath = "/tags/v2".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (resourceType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resourceType", resourceType));
        if (resourceId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "resourceId", resourceId));
        if (lastModified != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "lastModified", lastModified));
        if (created != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "created", created));
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
     * Available tags
     * The Tags endpoint returns summary information about the available list of tags right now.
     * @param name Name of the tag for which to search (optional)
     * @param resourceType Search for tags associated with one or resources of named type (optional)
     * @param resourceId Id of tagged resource (optional)
     * @param lastModified Date at which tag was modified in ISO8601 format (optional)
     * @param created Date at which tag was created in ISO8601 format (optional)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @return List&lt;TagSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<TagSummary> listTags(String name, String resourceType, String resourceId, String lastModified, String created, Boolean naked, Integer limit, Integer offset) throws ApiException {
        ApiResponse<List<TagSummary>> resp = listTagsWithHttpInfo(name, resourceType, resourceId, lastModified, created, naked, limit, offset);
        return resp.getData();
    }

    /**
     * Available tags
     * The Tags endpoint returns summary information about the available list of tags right now.
     * @param name Name of the tag for which to search (optional)
     * @param resourceType Search for tags associated with one or resources of named type (optional)
     * @param resourceId Id of tagged resource (optional)
     * @param lastModified Date at which tag was modified in ISO8601 format (optional)
     * @param created Date at which tag was created in ISO8601 format (optional)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @return ApiResponse&lt;List&lt;TagSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<TagSummary>> listTagsWithHttpInfo(String name, String resourceType, String resourceId, String lastModified, String created, Boolean naked, Integer limit, Integer offset) throws ApiException {
        com.squareup.okhttp.Call call = listTagsCall(name, resourceType, resourceId, lastModified, created, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<TagSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Available tags (asynchronously)
     * The Tags endpoint returns summary information about the available list of tags right now.
     * @param name Name of the tag for which to search (optional)
     * @param resourceType Search for tags associated with one or resources of named type (optional)
     * @param resourceId Id of tagged resource (optional)
     * @param lastModified Date at which tag was modified in ISO8601 format (optional)
     * @param created Date at which tag was created in ISO8601 format (optional)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param limit Maximum number of responses. Default 100 (optional, default to 100)
     * @param offset Number of results to skip by default (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listTagsAsync(String name, String resourceType, String resourceId, String lastModified, String created, Boolean naked, Integer limit, Integer offset, final ApiCallback<List<TagSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listTagsCall(name, resourceType, resourceId, lastModified, created, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<TagSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for removeTagResource */
    private com.squareup.okhttp.Call removeTagResourceCall(String tagId, String uuid, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling removeTagResource(Async)");
        }
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling removeTagResource(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/resources/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()))
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
     * Remove resource from tag
     * Removes the given uuid from this tag
     * @param tagId Unique id of the tag (required)
     * @param uuid UUID of the resource to delete (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void removeTagResource(String tagId, String uuid, Boolean naked) throws ApiException {
        removeTagResourceWithHttpInfo(tagId, uuid, naked);
    }

    /**
     * Remove resource from tag
     * Removes the given uuid from this tag
     * @param tagId Unique id of the tag (required)
     * @param uuid UUID of the resource to delete (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> removeTagResourceWithHttpInfo(String tagId, String uuid, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = removeTagResourceCall(tagId, uuid, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     * Remove resource from tag (asynchronously)
     * Removes the given uuid from this tag
     * @param tagId Unique id of the tag (required)
     * @param uuid UUID of the resource to delete (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeTagResourceAsync(String tagId, String uuid, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removeTagResourceCall(tagId, uuid, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for updateTag */
    private com.squareup.okhttp.Call updateTagCall(String tagId, Tag body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling updateTag(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateTag(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()));

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
            "application/json", "multipart/form-data"
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
     * Update tag
     * Updates the given tag with the updated information
     * @param tagId Unique id of the tag (required)
     * @param body JSON Tag object (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return Tag
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Tag updateTag(String tagId, Tag body, Boolean naked) throws ApiException {
        ApiResponse<Tag> resp = updateTagWithHttpInfo(tagId, body, naked);
        return resp.getData();
    }

    /**
     * Update tag
     * Updates the given tag with the updated information
     * @param tagId Unique id of the tag (required)
     * @param body JSON Tag object (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;Tag&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Tag> updateTagWithHttpInfo(String tagId, Tag body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateTagCall(tagId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update tag (asynchronously)
     * Updates the given tag with the updated information
     * @param tagId Unique id of the tag (required)
     * @param body JSON Tag object (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTagAsync(String tagId, Tag body, Boolean naked, final ApiCallback<Tag> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTagCall(tagId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Tag>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateTagPermission */
    private com.squareup.okhttp.Call updateTagPermissionCall(String tagId, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling updateTagPermission(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateTagPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()));

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
            "application/json", "multipart/form-data"
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
     * Grant permission
     * Adds a permission for a given user to a given tag
     * @param tagId Unique id of the tag (required)
     * @param body Unique id of a resource (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission updateTagPermission(String tagId, Permission body, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = updateTagPermissionWithHttpInfo(tagId, body, naked);
        return resp.getData();
    }

    /**
     * Grant permission
     * Adds a permission for a given user to a given tag
     * @param tagId Unique id of the tag (required)
     * @param body Unique id of a resource (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> updateTagPermissionWithHttpInfo(String tagId, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateTagPermissionCall(tagId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Grant permission (asynchronously)
     * Adds a permission for a given user to a given tag
     * @param tagId Unique id of the tag (required)
     * @param body Unique id of a resource (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTagPermissionAsync(String tagId, Permission body, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTagPermissionCall(tagId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateTagPermissionForUser */
    private com.squareup.okhttp.Call updateTagPermissionForUserCall(String tagId, String username, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling updateTagPermissionForUser(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling updateTagPermissionForUser(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateTagPermissionForUser(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()))
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
            "application/json", "multipart/form-data"
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
     * Update user permission on tag
     * Resets the user permission on the given tag
     * @param tagId Unique id of the tag (required)
     * @param username Valid username (required)
     * @param body Valid permission value (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission updateTagPermissionForUser(String tagId, String username, Permission body, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = updateTagPermissionForUserWithHttpInfo(tagId, username, body, naked);
        return resp.getData();
    }

    /**
     * Update user permission on tag
     * Resets the user permission on the given tag
     * @param tagId Unique id of the tag (required)
     * @param username Valid username (required)
     * @param body Valid permission value (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> updateTagPermissionForUserWithHttpInfo(String tagId, String username, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateTagPermissionForUserCall(tagId, username, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update user permission on tag (asynchronously)
     * Resets the user permission on the given tag
     * @param tagId Unique id of the tag (required)
     * @param username Valid username (required)
     * @param body Valid permission value (required)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTagPermissionForUserAsync(String tagId, String username, Permission body, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTagPermissionForUserCall(tagId, username, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateTagResource */
    private com.squareup.okhttp.Call updateTagResourceCall(String tagId, String uuid, TagResource body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'tagId' is set
        if (tagId == null) {
            throw new ApiException("Missing the required parameter 'tagId' when calling updateTagResource(Async)");
        }
        
        // verify the required parameter 'uuid' is set
        if (uuid == null) {
            throw new ApiException("Missing the required parameter 'uuid' when calling updateTagResource(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/tags/v2/{tagId}/resources/{uuid}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "tagId" + "\\}", apiClient.escapeString(tagId.toString()))
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * Add resource to tag
     * Adds the resource with the given uuid to the given tag
     * @param tagId Unique id of the tag (required)
     * @param uuid Unique id of a resource (required)
     * @param body empty body (optional)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return TagResource
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public TagResource updateTagResource(String tagId, String uuid, TagResource body, Boolean naked) throws ApiException {
        ApiResponse<TagResource> resp = updateTagResourceWithHttpInfo(tagId, uuid, body, naked);
        return resp.getData();
    }

    /**
     * Add resource to tag
     * Adds the resource with the given uuid to the given tag
     * @param tagId Unique id of the tag (required)
     * @param uuid Unique id of a resource (required)
     * @param body empty body (optional)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @return ApiResponse&lt;TagResource&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<TagResource> updateTagResourceWithHttpInfo(String tagId, String uuid, TagResource body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateTagResourceCall(tagId, uuid, body, naked, null, null);
        Type localVarReturnType = new TypeToken<TagResource>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Add resource to tag (asynchronously)
     * Adds the resource with the given uuid to the given tag
     * @param tagId Unique id of the tag (required)
     * @param uuid Unique id of a resource (required)
     * @param body empty body (optional)
     * @param naked If true return only the payload, not the standard response wrapper (optional, default to true)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateTagResourceAsync(String tagId, String uuid, TagResource body, Boolean naked, final ApiCallback<TagResource> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateTagResourceCall(tagId, uuid, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<TagResource>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
