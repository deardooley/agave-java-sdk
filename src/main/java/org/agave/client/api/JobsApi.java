

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
import org.agave.client.model.FileInfo;
import org.agave.client.model.Job;
import org.agave.client.model.JobHistory;
import org.agave.client.model.JobRequest;
import org.agave.client.model.JobResubmitAction;
import org.agave.client.model.JobStatusSummary;
import org.agave.client.model.Permission;

public class JobsApi {
    private ApiClient apiClient;

    public JobsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public JobsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addJobPermission */
    private com.squareup.okhttp.Call addJobPermissionCall(String jobId, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling addJobPermission(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addJobPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addJobPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

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
     * Add a user permission for the given job.
     * @param jobId The id of the job. (required)
     * @param body The permission add or update.  (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission addJobPermission(String jobId, Permission body, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = addJobPermissionWithHttpInfo(jobId, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add a user permission for the given job.
     * @param jobId The id of the job. (required)
     * @param body The permission add or update.  (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> addJobPermissionWithHttpInfo(String jobId, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addJobPermissionCall(jobId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add a user permission for the given job.
     * @param jobId The id of the job. (required)
     * @param body The permission add or update.  (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addJobPermissionAsync(String jobId, Permission body, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addJobPermissionCall(jobId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for clearJobPermissions */
    private com.squareup.okhttp.Call clearJobPermissionsCall(String jobId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling clearJobPermissions(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling clearJobPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

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
     * Deletes all permissions on an job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void clearJobPermissions(String jobId, Boolean naked) throws ApiException {
        clearJobPermissionsWithHttpInfo(jobId, naked);
    }

    /**
     * 
     * Deletes all permissions on an job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> clearJobPermissionsWithHttpInfo(String jobId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = clearJobPermissionsCall(jobId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all permissions on an job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call clearJobPermissionsAsync(String jobId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = clearJobPermissionsCall(jobId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteJob */
    private com.squareup.okhttp.Call deleteJobCall(String jobId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling deleteJob(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteJob(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

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
     * Deletes a job from history of the user
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteJob(String jobId, Boolean naked) throws ApiException {
        deleteJobWithHttpInfo(jobId, naked);
    }

    /**
     * 
     * Deletes a job from history of the user
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteJobWithHttpInfo(String jobId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteJobCall(jobId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes a job from history of the user
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteJobAsync(String jobId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteJobCall(jobId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for deleteJobPermission */
    private com.squareup.okhttp.Call deleteJobPermissionCall(String jobId, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling deleteJobPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling deleteJobPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteJobPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
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
     * Deletes all permissions for the given user on an job.
     * @param jobId The id of the job for which to delete the user permissions. (required)
     * @param username The username for whom to delete permissions (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteJobPermission(String jobId, String username, Boolean naked) throws ApiException {
        deleteJobPermissionWithHttpInfo(jobId, username, naked);
    }

    /**
     * 
     * Deletes all permissions for the given user on an job.
     * @param jobId The id of the job for which to delete the user permissions. (required)
     * @param username The username for whom to delete permissions (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteJobPermissionWithHttpInfo(String jobId, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteJobPermissionCall(jobId, username, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes all permissions for the given user on an job.
     * @param jobId The id of the job for which to delete the user permissions. (required)
     * @param username The username for whom to delete permissions (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteJobPermissionAsync(String jobId, String username, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteJobPermissionCall(jobId, username, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for downloadJobOutput */
    private com.squareup.okhttp.Call downloadJobOutputCall(String jobId, String filePath, Boolean force, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling downloadJobOutput(Async)");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling downloadJobOutput(Async)");
        }
        
        // verify the required parameter 'force' is set
        if (force == null) {
            throw new ApiException("Missing the required parameter 'force' when calling downloadJobOutput(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}/outputs/media/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
        .replaceAll("\\{" + "filePath" + "\\}", apiClient.escapeString(filePath.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (force != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "force", force));

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
     * Download an output file from a specific job.
     * @param jobId The id of the job. (required)
     * @param filePath The path to an output file relative to the job output directory.  (required)
     * @param force If true, the Content-Disposition header is set to force a file download from the browser. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void downloadJobOutput(String jobId, String filePath, Boolean force) throws ApiException {
        downloadJobOutputWithHttpInfo(jobId, filePath, force);
    }

    /**
     * 
     * Download an output file from a specific job.
     * @param jobId The id of the job. (required)
     * @param filePath The path to an output file relative to the job output directory.  (required)
     * @param force If true, the Content-Disposition header is set to force a file download from the browser. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> downloadJobOutputWithHttpInfo(String jobId, String filePath, Boolean force) throws ApiException {
        com.squareup.okhttp.Call call = downloadJobOutputCall(jobId, filePath, force, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Download an output file from a specific job.
     * @param jobId The id of the job. (required)
     * @param filePath The path to an output file relative to the job output directory.  (required)
     * @param force If true, the Content-Disposition header is set to force a file download from the browser. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call downloadJobOutputAsync(String jobId, String filePath, Boolean force, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = downloadJobOutputCall(jobId, filePath, force, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for getJobDetails */
    private com.squareup.okhttp.Call getJobDetailsCall(Long jobId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getJobDetails(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getJobDetails(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

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
     * Get details of the job with the specific job id.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @return Job
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Job getJobDetails(Long jobId, Boolean naked) throws ApiException {
        ApiResponse<Job> resp = getJobDetailsWithHttpInfo(jobId, naked);
        return resp.getData();
    }

    /**
     * 
     * Get details of the job with the specific job id.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Job&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Job> getJobDetailsWithHttpInfo(Long jobId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getJobDetailsCall(jobId, naked, null, null);
        Type localVarReturnType = new TypeToken<Job>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get details of the job with the specific job id.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobDetailsAsync(Long jobId, Boolean naked, final ApiCallback<Job> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobDetailsCall(jobId, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Job>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getJobHistory */
    private com.squareup.okhttp.Call getJobHistoryCall(String jobId, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getJobHistory(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getJobHistory(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}/history".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

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
     * Get the history of this job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;JobHistory&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<JobHistory> getJobHistory(String jobId, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<JobHistory>> resp = getJobHistoryWithHttpInfo(jobId, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Get the history of this job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;JobHistory&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<JobHistory>> getJobHistoryWithHttpInfo(String jobId, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = getJobHistoryCall(jobId, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<JobHistory>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the history of this job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobHistoryAsync(String jobId, Boolean naked, Long limit, Long offset, final ApiCallback<List<JobHistory>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobHistoryCall(jobId, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<JobHistory>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getJobPermission */
    private com.squareup.okhttp.Call getJobPermissionCall(String jobId, String username, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getJobPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling getJobPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getJobPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
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
     * Get a specific user permission for a job.
     * @param jobId The id of the job. (required)
     * @param username The username of the api user associated with the permission. (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission getJobPermission(String jobId, String username, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = getJobPermissionWithHttpInfo(jobId, username, naked);
        return resp.getData();
    }

    /**
     * 
     * Get a specific user permission for a job.
     * @param jobId The id of the job. (required)
     * @param username The username of the api user associated with the permission. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> getJobPermissionWithHttpInfo(String jobId, String username, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getJobPermissionCall(jobId, username, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a specific user permission for a job.
     * @param jobId The id of the job. (required)
     * @param username The username of the api user associated with the permission. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobPermissionAsync(String jobId, String username, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobPermissionCall(jobId, username, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getJobStatus */
    private com.squareup.okhttp.Call getJobStatusCall(String jobId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling getJobStatus(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getJobStatus(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}/status".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

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
     * Get the status of the job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @return JobStatusSummary
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public JobStatusSummary getJobStatus(String jobId, Boolean naked) throws ApiException {
        ApiResponse<JobStatusSummary> resp = getJobStatusWithHttpInfo(jobId, naked);
        return resp.getData();
    }

    /**
     * 
     * Get the status of the job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;JobStatusSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<JobStatusSummary> getJobStatusWithHttpInfo(String jobId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getJobStatusCall(jobId, naked, null, null);
        Type localVarReturnType = new TypeToken<JobStatusSummary>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the status of the job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getJobStatusAsync(String jobId, Boolean naked, final ApiCallback<JobStatusSummary> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getJobStatusCall(jobId, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<JobStatusSummary>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listJobOutputs */
    private com.squareup.okhttp.Call listJobOutputsCall(String jobId, String filePath, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling listJobOutputs(Async)");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling listJobOutputs(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listJobOutputs(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}/outputs/listings/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
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
     * List the output folder for a job.
     * @param jobId The id of the job. (required)
     * @param filePath The path to an output file or folder relative to the job output directory. This resource will follow data around as it moves from the execution system to archival storage. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;FileInfo&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<FileInfo> listJobOutputs(String jobId, String filePath, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<FileInfo>> resp = listJobOutputsWithHttpInfo(jobId, filePath, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * List the output folder for a job.
     * @param jobId The id of the job. (required)
     * @param filePath The path to an output file or folder relative to the job output directory. This resource will follow data around as it moves from the execution system to archival storage. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;FileInfo&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<FileInfo>> listJobOutputsWithHttpInfo(String jobId, String filePath, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listJobOutputsCall(jobId, filePath, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<FileInfo>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List the output folder for a job.
     * @param jobId The id of the job. (required)
     * @param filePath The path to an output file or folder relative to the job output directory. This resource will follow data around as it moves from the execution system to archival storage. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listJobOutputsAsync(String jobId, String filePath, Boolean naked, Long limit, Long offset, final ApiCallback<List<FileInfo>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listJobOutputsCall(jobId, filePath, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<FileInfo>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listJobPermissions */
    private com.squareup.okhttp.Call listJobPermissionsCall(String jobId, Boolean naked, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling listJobPermissions(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listJobPermissions(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}/pems".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

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
     * Get the permissions granted for this job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results to skip in the result set for this query (optional, default to 0)
     * @return List&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Permission> listJobPermissions(String jobId, Boolean naked, Long limit, Long offset) throws ApiException {
        ApiResponse<List<Permission>> resp = listJobPermissionsWithHttpInfo(jobId, naked, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Get the permissions granted for this job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results to skip in the result set for this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;Permission&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Permission>> listJobPermissionsWithHttpInfo(String jobId, Boolean naked, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listJobPermissionsCall(jobId, naked, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the permissions granted for this job.
     * @param jobId The id of the job. (required)
     * @param naked  (required)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results to skip in the result set for this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listJobPermissionsAsync(String jobId, Boolean naked, Long limit, Long offset, final ApiCallback<List<Permission>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listJobPermissionsCall(jobId, naked, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Permission>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listJobs */
    private com.squareup.okhttp.Call listJobsCall(Boolean naked, String appId, String archive, String archivePath, String archiveSystem, String batchQueue, String executionSystem, String id, String inputs, String localId, String maxRuntime, String memoryPerNode, String name, Long nodeCount, String outputPath, String parameters, Long processorsPerNode, Long retries, String startTime, String status, String submitTime, String visible, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listJobs(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (appId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "appId", appId));
        if (archive != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "archive", archive));
        if (archivePath != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "archivePath", archivePath));
        if (archiveSystem != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "archiveSystem", archiveSystem));
        if (batchQueue != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "batchQueue", batchQueue));
        if (executionSystem != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "executionSystem", executionSystem));
        if (id != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "id", id));
        if (inputs != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "inputs", inputs));
        if (localId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "localId", localId));
        if (maxRuntime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "maxRuntime", maxRuntime));
        if (memoryPerNode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "memoryPerNode", memoryPerNode));
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (nodeCount != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "nodeCount", nodeCount));
        if (outputPath != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "outputPath", outputPath));
        if (parameters != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "parameters", parameters));
        if (processorsPerNode != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "processorsPerNode", processorsPerNode));
        if (retries != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "retries", retries));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));
        if (submitTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "submitTime", submitTime));
        if (visible != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "visible", visible));
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
     * Get a list of jobs the authenticated user had submitted.
     * @param naked  (required)
     * @param appId The id of the app run by the job. (optional)
     * @param archive Boolean flag stating whether the job output was archived. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) (optional, default to true)
     * @param archivePath Path on the archive system where the job output was archived if the archive flag was true. (optional)
     * @param archiveSystem The id of the system where the job output was archived if the archive flag was true. (optional)
     * @param batchQueue The system queue in which the job ran. (optional)
     * @param executionSystem The execution system where the job ran. (optional)
     * @param id The id of the job. (optional)
     * @param inputs The job inputs. Note, this is a partial text search. (optional)
     * @param localId The local job id of the job on the execution system. (optional)
     * @param maxRuntime The maximum run time of the job in HH:mm:ss format. (optional)
     * @param memoryPerNode The memory requested by the job specified in GB. (optional)
     * @param name The name of the job. (optional)
     * @param nodeCount The number of nodes requested for the job. (optional)
     * @param outputPath The remote work directory path of the job. (optional)
     * @param parameters The job parameters. Note, this is a partial text search. (optional)
     * @param processorsPerNode The number of processors per node requested by the job. (optional)
     * @param retries The number of retry attempts made on this job. (optional)
     * @param startTime The date the job began running. Results are rounded by day. You may specify using YYYY-MM-DD format or free form timeframes such as &#39;yesterday&#39; or &#39;3 days ago&#39;. (optional)
     * @param status The job status. (optional)
     * @param submitTime The date the job was submitted to the remote execution system to run. Results are rounded by day. You may specify using YYYY-MM-DD format or free form timeframes such as &#39;yesterday&#39; or &#39;3 days ago&#39;. (optional)
     * @param visible Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) (optional, default to true)
     * @param limit Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (optional)
     * @param offset Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (optional)
     * @return List&lt;Job&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Job> listJobs(Boolean naked, String appId, String archive, String archivePath, String archiveSystem, String batchQueue, String executionSystem, String id, String inputs, String localId, String maxRuntime, String memoryPerNode, String name, Long nodeCount, String outputPath, String parameters, Long processorsPerNode, Long retries, String startTime, String status, String submitTime, String visible, Long limit, Long offset) throws ApiException {
        ApiResponse<List<Job>> resp = listJobsWithHttpInfo(naked, appId, archive, archivePath, archiveSystem, batchQueue, executionSystem, id, inputs, localId, maxRuntime, memoryPerNode, name, nodeCount, outputPath, parameters, processorsPerNode, retries, startTime, status, submitTime, visible, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Get a list of jobs the authenticated user had submitted.
     * @param naked  (required)
     * @param appId The id of the app run by the job. (optional)
     * @param archive Boolean flag stating whether the job output was archived. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) (optional, default to true)
     * @param archivePath Path on the archive system where the job output was archived if the archive flag was true. (optional)
     * @param archiveSystem The id of the system where the job output was archived if the archive flag was true. (optional)
     * @param batchQueue The system queue in which the job ran. (optional)
     * @param executionSystem The execution system where the job ran. (optional)
     * @param id The id of the job. (optional)
     * @param inputs The job inputs. Note, this is a partial text search. (optional)
     * @param localId The local job id of the job on the execution system. (optional)
     * @param maxRuntime The maximum run time of the job in HH:mm:ss format. (optional)
     * @param memoryPerNode The memory requested by the job specified in GB. (optional)
     * @param name The name of the job. (optional)
     * @param nodeCount The number of nodes requested for the job. (optional)
     * @param outputPath The remote work directory path of the job. (optional)
     * @param parameters The job parameters. Note, this is a partial text search. (optional)
     * @param processorsPerNode The number of processors per node requested by the job. (optional)
     * @param retries The number of retry attempts made on this job. (optional)
     * @param startTime The date the job began running. Results are rounded by day. You may specify using YYYY-MM-DD format or free form timeframes such as &#39;yesterday&#39; or &#39;3 days ago&#39;. (optional)
     * @param status The job status. (optional)
     * @param submitTime The date the job was submitted to the remote execution system to run. Results are rounded by day. You may specify using YYYY-MM-DD format or free form timeframes such as &#39;yesterday&#39; or &#39;3 days ago&#39;. (optional)
     * @param visible Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) (optional, default to true)
     * @param limit Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (optional)
     * @param offset Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (optional)
     * @return ApiResponse&lt;List&lt;Job&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Job>> listJobsWithHttpInfo(Boolean naked, String appId, String archive, String archivePath, String archiveSystem, String batchQueue, String executionSystem, String id, String inputs, String localId, String maxRuntime, String memoryPerNode, String name, Long nodeCount, String outputPath, String parameters, Long processorsPerNode, Long retries, String startTime, String status, String submitTime, String visible, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listJobsCall(naked, appId, archive, archivePath, archiveSystem, batchQueue, executionSystem, id, inputs, localId, maxRuntime, memoryPerNode, name, nodeCount, outputPath, parameters, processorsPerNode, retries, startTime, status, submitTime, visible, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<Job>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get a list of jobs the authenticated user had submitted.
     * @param naked  (required)
     * @param appId The id of the app run by the job. (optional)
     * @param archive Boolean flag stating whether the job output was archived. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) (optional, default to true)
     * @param archivePath Path on the archive system where the job output was archived if the archive flag was true. (optional)
     * @param archiveSystem The id of the system where the job output was archived if the archive flag was true. (optional)
     * @param batchQueue The system queue in which the job ran. (optional)
     * @param executionSystem The execution system where the job ran. (optional)
     * @param id The id of the job. (optional)
     * @param inputs The job inputs. Note, this is a partial text search. (optional)
     * @param localId The local job id of the job on the execution system. (optional)
     * @param maxRuntime The maximum run time of the job in HH:mm:ss format. (optional)
     * @param memoryPerNode The memory requested by the job specified in GB. (optional)
     * @param name The name of the job. (optional)
     * @param nodeCount The number of nodes requested for the job. (optional)
     * @param outputPath The remote work directory path of the job. (optional)
     * @param parameters The job parameters. Note, this is a partial text search. (optional)
     * @param processorsPerNode The number of processors per node requested by the job. (optional)
     * @param retries The number of retry attempts made on this job. (optional)
     * @param startTime The date the job began running. Results are rounded by day. You may specify using YYYY-MM-DD format or free form timeframes such as &#39;yesterday&#39; or &#39;3 days ago&#39;. (optional)
     * @param status The job status. (optional)
     * @param submitTime The date the job was submitted to the remote execution system to run. Results are rounded by day. You may specify using YYYY-MM-DD format or free form timeframes such as &#39;yesterday&#39; or &#39;3 days ago&#39;. (optional)
     * @param visible Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) (optional, default to true)
     * @param limit Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (optional)
     * @param offset Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listJobsAsync(Boolean naked, String appId, String archive, String archivePath, String archiveSystem, String batchQueue, String executionSystem, String id, String inputs, String localId, String maxRuntime, String memoryPerNode, String name, Long nodeCount, String outputPath, String parameters, Long processorsPerNode, Long retries, String startTime, String status, String submitTime, String visible, Long limit, Long offset, final ApiCallback<List<Job>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listJobsCall(naked, appId, archive, archivePath, archiveSystem, batchQueue, executionSystem, id, inputs, localId, maxRuntime, memoryPerNode, name, nodeCount, outputPath, parameters, processorsPerNode, retries, startTime, status, submitTime, visible, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Job>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for resubmitJob */
    private com.squareup.okhttp.Call resubmitJobCall(String jobId, JobResubmitAction body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling resubmitJob(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling resubmitJob(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling resubmitJob(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()));

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
     * Resubmits the job with the given job id as a new job with a unique id.
     * @param jobId The id of the job to resubmit (required)
     * @param body The resubmit action request (required)
     * @param naked  (required)
     * @return Job
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Job resubmitJob(String jobId, JobResubmitAction body, Boolean naked) throws ApiException {
        ApiResponse<Job> resp = resubmitJobWithHttpInfo(jobId, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Resubmits the job with the given job id as a new job with a unique id.
     * @param jobId The id of the job to resubmit (required)
     * @param body The resubmit action request (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Job&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Job> resubmitJobWithHttpInfo(String jobId, JobResubmitAction body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = resubmitJobCall(jobId, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Job>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Resubmits the job with the given job id as a new job with a unique id.
     * @param jobId The id of the job to resubmit (required)
     * @param body The resubmit action request (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resubmitJobAsync(String jobId, JobResubmitAction body, Boolean naked, final ApiCallback<Job> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = resubmitJobCall(jobId, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Job>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for submitJob */
    private com.squareup.okhttp.Call submitJobCall(JobRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling submitJob(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling submitJob(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/".replaceAll("\\{format\\}","json");

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
     * Submit a new job request.
     * @param body The JSON description of the job to submit.  (required)
     * @param naked  (required)
     * @return Job
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Job submitJob(JobRequest body, Boolean naked) throws ApiException {
        ApiResponse<Job> resp = submitJobWithHttpInfo(body, naked);
        return resp.getData();
    }

    /**
     * 
     * Submit a new job request.
     * @param body The JSON description of the job to submit.  (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Job&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Job> submitJobWithHttpInfo(JobRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = submitJobCall(body, naked, null, null);
        Type localVarReturnType = new TypeToken<Job>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Submit a new job request.
     * @param body The JSON description of the job to submit.  (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call submitJobAsync(JobRequest body, Boolean naked, final ApiCallback<Job> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = submitJobCall(body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Job>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateJobPermission */
    private com.squareup.okhttp.Call updateJobPermissionCall(String jobId, String username, Permission body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'jobId' is set
        if (jobId == null) {
            throw new ApiException("Missing the required parameter 'jobId' when calling updateJobPermission(Async)");
        }
        
        // verify the required parameter 'username' is set
        if (username == null) {
            throw new ApiException("Missing the required parameter 'username' when calling updateJobPermission(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateJobPermission(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateJobPermission(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/jobs/v2/{jobId}/pems/{username}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "jobId" + "\\}", apiClient.escapeString(jobId.toString()))
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
     * Update a user permission for the given job and username
     * @param jobId The id of the job for which the permissions will be updated (required)
     * @param username The user for whom the permission will be udpated (required)
     * @param body The permission to update (required)
     * @param naked  (required)
     * @return Permission
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Permission updateJobPermission(String jobId, String username, Permission body, Boolean naked) throws ApiException {
        ApiResponse<Permission> resp = updateJobPermissionWithHttpInfo(jobId, username, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Update a user permission for the given job and username
     * @param jobId The id of the job for which the permissions will be updated (required)
     * @param username The user for whom the permission will be udpated (required)
     * @param body The permission to update (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Permission&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Permission> updateJobPermissionWithHttpInfo(String jobId, String username, Permission body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = updateJobPermissionCall(jobId, username, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Update a user permission for the given job and username
     * @param jobId The id of the job for which the permissions will be updated (required)
     * @param username The user for whom the permission will be udpated (required)
     * @param body The permission to update (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateJobPermissionAsync(String jobId, String username, Permission body, Boolean naked, final ApiCallback<Permission> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateJobPermissionCall(jobId, username, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Permission>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
