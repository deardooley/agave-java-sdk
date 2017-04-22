

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
import org.agave.client.model.EmptyClientResponse;
import org.agave.client.model.InternalUser;
import org.agave.client.model.Profile;
import org.agave.client.model.ProfileRequest;

public class ProfilesApi {
    private ApiClient apiClient;

    public ProfilesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProfilesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addInternalUser */
    private com.squareup.okhttp.Call addInternalUserCall(String apiUsername, ProfileRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'apiUsername' is set
        if (apiUsername == null) {
            throw new ApiException("Missing the required parameter 'apiUsername' when calling addInternalUser(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addInternalUser(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addInternalUser(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2/{apiUsername}/users".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "apiUsername" + "\\}", apiClient.escapeString(apiUsername.toString()));

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
     * Create or update an internal user.
     * @param apiUsername The username of a valid api user (required)
     * @param body The internal user to create. (required)
     * @param naked  (required)
     * @return InternalUser
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InternalUser addInternalUser(String apiUsername, ProfileRequest body, Boolean naked) throws ApiException {
        ApiResponse<InternalUser> resp = addInternalUserWithHttpInfo(apiUsername, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Create or update an internal user.
     * @param apiUsername The username of a valid api user (required)
     * @param body The internal user to create. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;InternalUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InternalUser> addInternalUserWithHttpInfo(String apiUsername, ProfileRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addInternalUserCall(apiUsername, body, naked, null, null);
        Type localVarReturnType = new TypeToken<InternalUser>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create or update an internal user.
     * @param apiUsername The username of a valid api user (required)
     * @param body The internal user to create. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addInternalUserAsync(String apiUsername, ProfileRequest body, Boolean naked, final ApiCallback<InternalUser> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addInternalUserCall(apiUsername, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InternalUser>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for addProfile */
    private com.squareup.okhttp.Call addProfileCall(Profile body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addProfile(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addProfile(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2".replaceAll("\\{format\\}","json");

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
     * Add a new user profile
     * @param body The user profile to add (required)
     * @param naked  (required)
     * @return Profile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Profile addProfile(Profile body, Boolean naked) throws ApiException {
        ApiResponse<Profile> resp = addProfileWithHttpInfo(body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add a new user profile
     * @param body The user profile to add (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Profile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Profile> addProfileWithHttpInfo(Profile body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addProfileCall(body, naked, null, null);
        Type localVarReturnType = new TypeToken<Profile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add a new user profile
     * @param body The user profile to add (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addProfileAsync(Profile body, Boolean naked, final ApiCallback<Profile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addProfileCall(body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Profile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for clearInternalUsers */
    private com.squareup.okhttp.Call clearInternalUsersCall(String apiUsername, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiUsername' is set
        if (apiUsername == null) {
            throw new ApiException("Missing the required parameter 'apiUsername' when calling clearInternalUsers(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling clearInternalUsers(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2/{apiUsername}/users".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "apiUsername" + "\\}", apiClient.escapeString(apiUsername.toString()));

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
     * Delete all internal users created by the authenticated user.
     * @param apiUsername The username of a valid api user (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearInternalUsers(String apiUsername, Boolean naked) throws ApiException {
        clearInternalUsersWithHttpInfo(apiUsername, naked);
    }

    /**
     * 
     * Delete all internal users created by the authenticated user.
     * @param apiUsername The username of a valid api user (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearInternalUsersWithHttpInfo(String apiUsername, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearInternalUsersCall(apiUsername, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Delete all internal users created by the authenticated user.
     * @param apiUsername The username of a valid api user (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearInternalUsersAsync(String apiUsername, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearInternalUsersCall(apiUsername, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteInternalUser */
    private com.squareup.okhttp.Call deleteInternalUserCall(String apiUsername, String internalUsername, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiUsername' is set
        if (apiUsername == null) {
            throw new ApiException("Missing the required parameter 'apiUsername' when calling deleteInternalUser(Async)");
        }
        
        // verify the required parameter 'internalUsername' is set
        if (internalUsername == null) {
            throw new ApiException("Missing the required parameter 'internalUsername' when calling deleteInternalUser(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteInternalUser(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2/{apiUsername}/users/{internalUsername}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "apiUsername" + "\\}", apiClient.escapeString(apiUsername.toString()))
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
     * Delete all internal users created by the authenticated user.
     * @param apiUsername The username of a valid api user (required)
     * @param internalUsername The username of a valid internal user (required)
     * @param naked  (required)
     * @return InternalUser
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InternalUser deleteInternalUser(String apiUsername, String internalUsername, Boolean naked) throws ApiException {
        ApiResponse<InternalUser> resp = deleteInternalUserWithHttpInfo(apiUsername, internalUsername, naked);
        return resp.getData();
    }

    /**
     * 
     * Delete all internal users created by the authenticated user.
     * @param apiUsername The username of a valid api user (required)
     * @param internalUsername The username of a valid internal user (required)
     * @param naked  (required)
     * @return ApiResponse&lt;InternalUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InternalUser> deleteInternalUserWithHttpInfo(String apiUsername, String internalUsername, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteInternalUserCall(apiUsername, internalUsername, naked, null, null);
        Type localVarReturnType = new TypeToken<InternalUser>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delete all internal users created by the authenticated user.
     * @param apiUsername The username of a valid api user (required)
     * @param internalUsername The username of a valid internal user (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteInternalUserAsync(String apiUsername, String internalUsername, Boolean naked, final ApiCallback<InternalUser> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteInternalUserCall(apiUsername, internalUsername, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InternalUser>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteProfile */
    private com.squareup.okhttp.Call deleteProfileCall(String apiUsername, Boolean naked, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiUsername' is set
        if (apiUsername == null) {
            throw new ApiException("Missing the required parameter 'apiUsername' when calling deleteProfile(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteProfile(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2/{apiUsername}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "apiUsername" + "\\}", apiClient.escapeString(apiUsername.toString()));

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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Delte a user profile by name
     * @param apiUsername The username of the profile to update (required)
     * @param naked  (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @return EmptyClientResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public EmptyClientResponse deleteProfile(String apiUsername, Boolean naked, String filter) throws ApiException {
        ApiResponse<EmptyClientResponse> resp = deleteProfileWithHttpInfo(apiUsername, naked, filter);
        return resp.getData();
    }

    /**
     * 
     * Delte a user profile by name
     * @param apiUsername The username of the profile to update (required)
     * @param naked  (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @return ApiResponse&lt;EmptyClientResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<EmptyClientResponse> deleteProfileWithHttpInfo(String apiUsername, Boolean naked, String filter) throws ApiException {
        com.squareup.okhttp.Call call = deleteProfileCall(apiUsername, naked, filter, null, null);
        Type localVarReturnType = new TypeToken<EmptyClientResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Delte a user profile by name
     * @param apiUsername The username of the profile to update (required)
     * @param naked  (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteProfileAsync(String apiUsername, Boolean naked, String filter, final ApiCallback<EmptyClientResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteProfileCall(apiUsername, naked, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<EmptyClientResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getInternalUser */
    private com.squareup.okhttp.Call getInternalUserCall(String apiUsername, String internalUsername, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiUsername' is set
        if (apiUsername == null) {
            throw new ApiException("Missing the required parameter 'apiUsername' when calling getInternalUser(Async)");
        }
        
        // verify the required parameter 'internalUsername' is set
        if (internalUsername == null) {
            throw new ApiException("Missing the required parameter 'internalUsername' when calling getInternalUser(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getInternalUser(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2/{apiUsername}/users/{internalUsername}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "apiUsername" + "\\}", apiClient.escapeString(apiUsername.toString()))
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
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    /**
     * 
     * Find api user profile by their api username
     * @param apiUsername The username of a valid api user (required)
     * @param internalUsername The username of a valid internal user (required)
     * @param naked  (required)
     * @return InternalUser
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InternalUser getInternalUser(String apiUsername, String internalUsername, Boolean naked) throws ApiException {
        ApiResponse<InternalUser> resp = getInternalUserWithHttpInfo(apiUsername, internalUsername, naked);
        return resp.getData();
    }

    /**
     * 
     * Find api user profile by their api username
     * @param apiUsername The username of a valid api user (required)
     * @param internalUsername The username of a valid internal user (required)
     * @param naked  (required)
     * @return ApiResponse&lt;InternalUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InternalUser> getInternalUserWithHttpInfo(String apiUsername, String internalUsername, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getInternalUserCall(apiUsername, internalUsername, naked, null, null);
        Type localVarReturnType = new TypeToken<InternalUser>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Find api user profile by their api username
     * @param apiUsername The username of a valid api user (required)
     * @param internalUsername The username of a valid internal user (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getInternalUserAsync(String apiUsername, String internalUsername, Boolean naked, final ApiCallback<InternalUser> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getInternalUserCall(apiUsername, internalUsername, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InternalUser>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getProfile */
    private com.squareup.okhttp.Call getProfileCall(String apiUsername, Boolean naked, String filter, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiUsername' is set
        if (apiUsername == null) {
            throw new ApiException("Missing the required parameter 'apiUsername' when calling getProfile(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getProfile(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2/{apiUsername}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "apiUsername" + "\\}", apiClient.escapeString(apiUsername.toString()));

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
     * Get a user profile by name
     * @param apiUsername The username of the profile to update (required)
     * @param naked  (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @return Profile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Profile getProfile(String apiUsername, Boolean naked, String filter) throws ApiException {
        ApiResponse<Profile> resp = getProfileWithHttpInfo(apiUsername, naked, filter);
        return resp.getData();
    }

    /**
     * 
     * Get a user profile by name
     * @param apiUsername The username of the profile to update (required)
     * @param naked  (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @return ApiResponse&lt;Profile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Profile> getProfileWithHttpInfo(String apiUsername, Boolean naked, String filter) throws ApiException {
        com.squareup.okhttp.Call call = getProfileCall(apiUsername, naked, filter, null, null);
        Type localVarReturnType = new TypeToken<Profile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a user profile by name
     * @param apiUsername The username of the profile to update (required)
     * @param naked  (required)
     * @param filter A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects (optional, default to *)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getProfileAsync(String apiUsername, Boolean naked, String filter, final ApiCallback<Profile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getProfileCall(apiUsername, naked, filter, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Profile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listInternalUsers */
    private com.squareup.okhttp.Call listInternalUsersCall(String apiUsername, Boolean naked, String username, String name, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'apiUsername' is set
        if (apiUsername == null) {
            throw new ApiException("Missing the required parameter 'apiUsername' when calling listInternalUsers(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listInternalUsers(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2/{apiUsername}/users".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "apiUsername" + "\\}", apiClient.escapeString(apiUsername.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (username != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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
     * List all internal users created by the authenticated user
     * @param apiUsername The username of a valid api user (required)
     * @param naked  (required)
     * @param username The username of the internal user (optional)
     * @param name The full name of the internal user (optional)
     * @param email The email address of the internal user (optional)
     * @return List&lt;InternalUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<InternalUser> listInternalUsers(String apiUsername, Boolean naked, String username, String name, String email) throws ApiException {
        ApiResponse<List<InternalUser>> resp = listInternalUsersWithHttpInfo(apiUsername, naked, username, name, email);
        return resp.getData();
    }

    /**
     * 
     * List all internal users created by the authenticated user
     * @param apiUsername The username of a valid api user (required)
     * @param naked  (required)
     * @param username The username of the internal user (optional)
     * @param name The full name of the internal user (optional)
     * @param email The email address of the internal user (optional)
     * @return ApiResponse&lt;List&lt;InternalUser&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<InternalUser>> listInternalUsersWithHttpInfo(String apiUsername, Boolean naked, String username, String name, String email) throws ApiException {
        com.squareup.okhttp.Call call = listInternalUsersCall(apiUsername, naked, username, name, email, null, null);
        Type localVarReturnType = new TypeToken<List<InternalUser>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List all internal users created by the authenticated user
     * @param apiUsername The username of a valid api user (required)
     * @param naked  (required)
     * @param username The username of the internal user (optional)
     * @param name The full name of the internal user (optional)
     * @param email The email address of the internal user (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listInternalUsersAsync(String apiUsername, Boolean naked, String username, String name, String email, final ApiCallback<List<InternalUser>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listInternalUsersCall(apiUsername, naked, username, name, email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<InternalUser>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listProfiles */
    private com.squareup.okhttp.Call listProfilesCall(Boolean naked, String username, String name, String email, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listProfiles(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (username != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "username", username));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (email != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "email", email));
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
     * List user profiles
     * @param naked  (required)
     * @param username The username to search for (optional)
     * @param name The user full name (optional)
     * @param email The user email address (optional)
     * @return List&lt;Profile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Profile> listProfiles(Boolean naked, String username, String name, String email) throws ApiException {
        ApiResponse<List<Profile>> resp = listProfilesWithHttpInfo(naked, username, name, email);
        return resp.getData();
    }

    /**
     * 
     * List user profiles
     * @param naked  (required)
     * @param username The username to search for (optional)
     * @param name The user full name (optional)
     * @param email The user email address (optional)
     * @return ApiResponse&lt;List&lt;Profile&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Profile>> listProfilesWithHttpInfo(Boolean naked, String username, String name, String email) throws ApiException {
        com.squareup.okhttp.Call call = listProfilesCall(naked, username, name, email, null, null);
        Type localVarReturnType = new TypeToken<List<Profile>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List user profiles
     * @param naked  (required)
     * @param username The username to search for (optional)
     * @param name The user full name (optional)
     * @param email The user email address (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listProfilesAsync(Boolean naked, String username, String name, String email, final ApiCallback<List<Profile>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listProfilesCall(naked, username, name, email, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Profile>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateInternalUser */
    private com.squareup.okhttp.Call updateInternalUserCall(String apiUsername, String internalUsername, ProfileRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'apiUsername' is set
        if (apiUsername == null) {
            throw new ApiException("Missing the required parameter 'apiUsername' when calling updateInternalUser(Async)");
        }
        
        // verify the required parameter 'internalUsername' is set
        if (internalUsername == null) {
            throw new ApiException("Missing the required parameter 'internalUsername' when calling updateInternalUser(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateInternalUser(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateInternalUser(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2/{apiUsername}/users/{internalUsername}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "apiUsername" + "\\}", apiClient.escapeString(apiUsername.toString()))
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
     * Create or update the given internal user.
     * @param apiUsername The username of a valid api user (required)
     * @param internalUsername The username of a valid internal user (required)
     * @param body A JSON description of the internal user to update (required)
     * @param naked  (required)
     * @return InternalUser
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InternalUser updateInternalUser(String apiUsername, String internalUsername, ProfileRequest body, Boolean naked) throws ApiException {
        ApiResponse<InternalUser> resp = updateInternalUserWithHttpInfo(apiUsername, internalUsername, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Create or update the given internal user.
     * @param apiUsername The username of a valid api user (required)
     * @param internalUsername The username of a valid internal user (required)
     * @param body A JSON description of the internal user to update (required)
     * @param naked  (required)
     * @return ApiResponse&lt;InternalUser&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InternalUser> updateInternalUserWithHttpInfo(String apiUsername, String internalUsername, ProfileRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateInternalUserCall(apiUsername, internalUsername, body, naked, null, null);
        Type localVarReturnType = new TypeToken<InternalUser>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Create or update the given internal user.
     * @param apiUsername The username of a valid api user (required)
     * @param internalUsername The username of a valid internal user (required)
     * @param body A JSON description of the internal user to update (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateInternalUserAsync(String apiUsername, String internalUsername, ProfileRequest body, Boolean naked, final ApiCallback<InternalUser> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateInternalUserCall(apiUsername, internalUsername, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InternalUser>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateProfile */
    private com.squareup.okhttp.Call updateProfileCall(String apiUsername, ProfileRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'apiUsername' is set
        if (apiUsername == null) {
            throw new ApiException("Missing the required parameter 'apiUsername' when calling updateProfile(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateProfile(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateProfile(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/profiles/v2/{apiUsername}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "apiUsername" + "\\}", apiClient.escapeString(apiUsername.toString()));

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
     * Update an existing user profile
     * @param apiUsername The username of the profile to update (required)
     * @param body The updated profile (required)
     * @param naked  (required)
     * @return Profile
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Profile updateProfile(String apiUsername, ProfileRequest body, Boolean naked) throws ApiException {
        ApiResponse<Profile> resp = updateProfileWithHttpInfo(apiUsername, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update an existing user profile
     * @param apiUsername The username of the profile to update (required)
     * @param body The updated profile (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Profile&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Profile> updateProfileWithHttpInfo(String apiUsername, ProfileRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateProfileCall(apiUsername, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Profile>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update an existing user profile
     * @param apiUsername The username of the profile to update (required)
     * @param body The updated profile (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateProfileAsync(String apiUsername, ProfileRequest body, Boolean naked, final ApiCallback<Profile> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateProfileCall(apiUsername, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Profile>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
