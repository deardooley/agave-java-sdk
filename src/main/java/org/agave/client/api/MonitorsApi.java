

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
import org.agave.client.model.MonitoringTaskCheck;
import org.agave.client.model.MonitoringTaskDetails;
import org.agave.client.model.MonitoringTaskSummary;

public class MonitorsApi {
    private ApiClient apiClient;

    public MonitorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public MonitorsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for addMonitoringTasks */
    private com.squareup.okhttp.Call addMonitoringTasksCall(MonitoringTaskSummary body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling addMonitoringTasks(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling addMonitoringTasks(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/monitors/v2/".replaceAll("\\{format\\}","json");

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
     * Add a new monitoring task
     * @param body The description of the monitoring task to run (required)
     * @param naked  (required)
     * @return MonitoringTaskDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MonitoringTaskDetails addMonitoringTasks(MonitoringTaskSummary body, Boolean naked) throws ApiException {
        ApiResponse<MonitoringTaskDetails> resp = addMonitoringTasksWithHttpInfo(body, naked);
        return resp.getData();
    }

    /**
     * 
     * Add a new monitoring task
     * @param body The description of the monitoring task to run (required)
     * @param naked  (required)
     * @return ApiResponse&lt;MonitoringTaskDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MonitoringTaskDetails> addMonitoringTasksWithHttpInfo(MonitoringTaskSummary body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = addMonitoringTasksCall(body, naked, null, null);
        Type localVarReturnType = new TypeToken<MonitoringTaskDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Add a new monitoring task
     * @param body The description of the monitoring task to run (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addMonitoringTasksAsync(MonitoringTaskSummary body, Boolean naked, final ApiCallback<MonitoringTaskDetails> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addMonitoringTasksCall(body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MonitoringTaskDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for deleteMonitoringTask */
    private com.squareup.okhttp.Call deleteMonitoringTaskCall(String monitorId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'monitorId' is set
        if (monitorId == null) {
            throw new ApiException("Missing the required parameter 'monitorId' when calling deleteMonitoringTask(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling deleteMonitoringTask(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/monitors/v2/{monitorId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "monitorId" + "\\}", apiClient.escapeString(monitorId.toString()));

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
     * Deletes a monitor.
     * @param monitorId The id of the monitor to delete (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteMonitoringTask(String monitorId, Boolean naked) throws ApiException {
        deleteMonitoringTaskWithHttpInfo(monitorId, naked);
    }

    /**
     * 
     * Deletes a monitor.
     * @param monitorId The id of the monitor to delete (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteMonitoringTaskWithHttpInfo(String monitorId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = deleteMonitoringTaskCall(monitorId, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Deletes a monitor.
     * @param monitorId The id of the monitor to delete (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMonitoringTaskAsync(String monitorId, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = deleteMonitoringTaskCall(monitorId, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /* Build call for forceMonitoringTaskCheck */
    private com.squareup.okhttp.Call forceMonitoringTaskCheckCall(String monitorId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'monitorId' is set
        if (monitorId == null) {
            throw new ApiException("Missing the required parameter 'monitorId' when calling forceMonitoringTaskCheck(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling forceMonitoringTaskCheck(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/monitors/v2/{monitorId}/checks".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "monitorId" + "\\}", apiClient.escapeString(monitorId.toString()));

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
     * Forces a monitor check to run.
     * @param monitorId The id of the monitor (required)
     * @param naked  (required)
     * @return MonitoringTaskDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MonitoringTaskDetails forceMonitoringTaskCheck(String monitorId, Boolean naked) throws ApiException {
        ApiResponse<MonitoringTaskDetails> resp = forceMonitoringTaskCheckWithHttpInfo(monitorId, naked);
        return resp.getData();
    }

    /**
     * 
     * Forces a monitor check to run.
     * @param monitorId The id of the monitor (required)
     * @param naked  (required)
     * @return ApiResponse&lt;MonitoringTaskDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MonitoringTaskDetails> forceMonitoringTaskCheckWithHttpInfo(String monitorId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = forceMonitoringTaskCheckCall(monitorId, naked, null, null);
        Type localVarReturnType = new TypeToken<MonitoringTaskDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Forces a monitor check to run.
     * @param monitorId The id of the monitor (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call forceMonitoringTaskCheckAsync(String monitorId, Boolean naked, final ApiCallback<MonitoringTaskDetails> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = forceMonitoringTaskCheckCall(monitorId, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MonitoringTaskDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMonitoringTask */
    private com.squareup.okhttp.Call getMonitoringTaskCall(String monitorId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'monitorId' is set
        if (monitorId == null) {
            throw new ApiException("Missing the required parameter 'monitorId' when calling getMonitoringTask(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getMonitoringTask(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/monitors/v2/{monitorId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "monitorId" + "\\}", apiClient.escapeString(monitorId.toString()));

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
     * Retrieve a specific monitor.
     * @param monitorId The id of the monitor (required)
     * @param naked  (required)
     * @return MonitoringTaskDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MonitoringTaskDetails getMonitoringTask(String monitorId, Boolean naked) throws ApiException {
        ApiResponse<MonitoringTaskDetails> resp = getMonitoringTaskWithHttpInfo(monitorId, naked);
        return resp.getData();
    }

    /**
     * 
     * Retrieve a specific monitor.
     * @param monitorId The id of the monitor (required)
     * @param naked  (required)
     * @return ApiResponse&lt;MonitoringTaskDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MonitoringTaskDetails> getMonitoringTaskWithHttpInfo(String monitorId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getMonitoringTaskCall(monitorId, naked, null, null);
        Type localVarReturnType = new TypeToken<MonitoringTaskDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve a specific monitor.
     * @param monitorId The id of the monitor (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMonitoringTaskAsync(String monitorId, Boolean naked, final ApiCallback<MonitoringTaskDetails> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMonitoringTaskCall(monitorId, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MonitoringTaskDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getMonitoringTaskCheck */
    private com.squareup.okhttp.Call getMonitoringTaskCheckCall(String monitorId, String checkId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'monitorId' is set
        if (monitorId == null) {
            throw new ApiException("Missing the required parameter 'monitorId' when calling getMonitoringTaskCheck(Async)");
        }
        
        // verify the required parameter 'checkId' is set
        if (checkId == null) {
            throw new ApiException("Missing the required parameter 'checkId' when calling getMonitoringTaskCheck(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getMonitoringTaskCheck(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/monitors/v2/{monitorId}/checks/{checkId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "monitorId" + "\\}", apiClient.escapeString(monitorId.toString()))
        .replaceAll("\\{" + "checkId" + "\\}", apiClient.escapeString(checkId.toString()));

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
     * Retrieve a specific monitor check
     * @param monitorId The id of the monitor (required)
     * @param checkId The id of the monitor check (required)
     * @param naked  (required)
     * @return MonitoringTaskCheck
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MonitoringTaskCheck getMonitoringTaskCheck(String monitorId, String checkId, Boolean naked) throws ApiException {
        ApiResponse<MonitoringTaskCheck> resp = getMonitoringTaskCheckWithHttpInfo(monitorId, checkId, naked);
        return resp.getData();
    }

    /**
     * 
     * Retrieve a specific monitor check
     * @param monitorId The id of the monitor (required)
     * @param checkId The id of the monitor check (required)
     * @param naked  (required)
     * @return ApiResponse&lt;MonitoringTaskCheck&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MonitoringTaskCheck> getMonitoringTaskCheckWithHttpInfo(String monitorId, String checkId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getMonitoringTaskCheckCall(monitorId, checkId, naked, null, null);
        Type localVarReturnType = new TypeToken<MonitoringTaskCheck>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve a specific monitor check
     * @param monitorId The id of the monitor (required)
     * @param checkId The id of the monitor check (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMonitoringTaskCheckAsync(String monitorId, String checkId, Boolean naked, final ApiCallback<MonitoringTaskCheck> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getMonitoringTaskCheckCall(monitorId, checkId, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MonitoringTaskCheck>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listMonitoringTaskChecks */
    private com.squareup.okhttp.Call listMonitoringTaskChecksCall(String monitorId, Boolean naked, String startDate, String endDate, String result, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'monitorId' is set
        if (monitorId == null) {
            throw new ApiException("Missing the required parameter 'monitorId' when calling listMonitoringTaskChecks(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listMonitoringTaskChecks(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/monitors/v2/{monitorId}/checks".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "monitorId" + "\\}", apiClient.escapeString(monitorId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (startDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startDate", startDate));
        if (endDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "endDate", endDate));
        if (result != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "result", result));
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
     * Retrieve checks for a specific monitor
     * @param monitorId The id of the monitor (required)
     * @param naked  (required)
     * @param startDate A timestamp indicating the earliest time of the first monitor check in ISO 8601 format (optional)
     * @param endDate A timestamp indicating the latest time of the first monitor check in ISO 8601 format (optional)
     * @param result A timestamp indicating the latest time of the first monitor check in ISO 8601 format (optional)
     * @param limit The max number of results. (optional, default to 250)
     * @param offset The number of records to when returning the results. When paginating results, the page number &#x3D; ceil(offset/limit) (optional, default to 0)
     * @return List&lt;MonitoringTaskCheck&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MonitoringTaskCheck> listMonitoringTaskChecks(String monitorId, Boolean naked, String startDate, String endDate, String result, Long limit, Long offset) throws ApiException {
        ApiResponse<List<MonitoringTaskCheck>> resp = listMonitoringTaskChecksWithHttpInfo(monitorId, naked, startDate, endDate, result, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Retrieve checks for a specific monitor
     * @param monitorId The id of the monitor (required)
     * @param naked  (required)
     * @param startDate A timestamp indicating the earliest time of the first monitor check in ISO 8601 format (optional)
     * @param endDate A timestamp indicating the latest time of the first monitor check in ISO 8601 format (optional)
     * @param result A timestamp indicating the latest time of the first monitor check in ISO 8601 format (optional)
     * @param limit The max number of results. (optional, default to 250)
     * @param offset The number of records to when returning the results. When paginating results, the page number &#x3D; ceil(offset/limit) (optional, default to 0)
     * @return ApiResponse&lt;List&lt;MonitoringTaskCheck&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MonitoringTaskCheck>> listMonitoringTaskChecksWithHttpInfo(String monitorId, Boolean naked, String startDate, String endDate, String result, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listMonitoringTaskChecksCall(monitorId, naked, startDate, endDate, result, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<MonitoringTaskCheck>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve checks for a specific monitor
     * @param monitorId The id of the monitor (required)
     * @param naked  (required)
     * @param startDate A timestamp indicating the earliest time of the first monitor check in ISO 8601 format (optional)
     * @param endDate A timestamp indicating the latest time of the first monitor check in ISO 8601 format (optional)
     * @param result A timestamp indicating the latest time of the first monitor check in ISO 8601 format (optional)
     * @param limit The max number of results. (optional, default to 250)
     * @param offset The number of records to when returning the results. When paginating results, the page number &#x3D; ceil(offset/limit) (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMonitoringTaskChecksAsync(String monitorId, Boolean naked, String startDate, String endDate, String result, Long limit, Long offset, final ApiCallback<List<MonitoringTaskCheck>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMonitoringTaskChecksCall(monitorId, naked, startDate, endDate, result, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MonitoringTaskCheck>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listMonitoringTasks */
    private com.squareup.okhttp.Call listMonitoringTasksCall(Boolean naked, String target, String active, Long limit, Long offset, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listMonitoringTasks(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/monitors/v2/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (target != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "target", target));
        if (active != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "active", active));
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
     * Retrieve Monitor for a specific resource.
     * @param naked  (required)
     * @param target The target system to search for. (optional)
     * @param active Filter by monitors that are active or inactive. (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return List&lt;MonitoringTaskSummary&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<MonitoringTaskSummary> listMonitoringTasks(Boolean naked, String target, String active, Long limit, Long offset) throws ApiException {
        ApiResponse<List<MonitoringTaskSummary>> resp = listMonitoringTasksWithHttpInfo(naked, target, active, limit, offset);
        return resp.getData();
    }

    /**
     * 
     * Retrieve Monitor for a specific resource.
     * @param naked  (required)
     * @param target The target system to search for. (optional)
     * @param active Filter by monitors that are active or inactive. (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @return ApiResponse&lt;List&lt;MonitoringTaskSummary&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<MonitoringTaskSummary>> listMonitoringTasksWithHttpInfo(Boolean naked, String target, String active, Long limit, Long offset) throws ApiException {
        com.squareup.okhttp.Call call = listMonitoringTasksCall(naked, target, active, limit, offset, null, null);
        Type localVarReturnType = new TypeToken<List<MonitoringTaskSummary>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Retrieve Monitor for a specific resource.
     * @param naked  (required)
     * @param target The target system to search for. (optional)
     * @param active Filter by monitors that are active or inactive. (optional, default to true)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listMonitoringTasksAsync(Boolean naked, String target, String active, Long limit, Long offset, final ApiCallback<List<MonitoringTaskSummary>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listMonitoringTasksCall(naked, target, active, limit, offset, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<MonitoringTaskSummary>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for updateMonitoringTask */
    private com.squareup.okhttp.Call updateMonitoringTaskCall(MonitoringTaskSummary body, Boolean naked, String monitorId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling updateMonitoringTask(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling updateMonitoringTask(Async)");
        }
        
        // verify the required parameter 'monitorId' is set
        if (monitorId == null) {
            throw new ApiException("Missing the required parameter 'monitorId' when calling updateMonitoringTask(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/monitors/v2/{monitorId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "monitorId" + "\\}", apiClient.escapeString(monitorId.toString()));

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
     * Updates an existing monitor.
     * @param body The description of the app to add or update. This can be either a file upload or json posted to the request body. (required)
     * @param naked  (required)
     * @param monitorId The id of the monitor to update (required)
     * @return MonitoringTaskDetails
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MonitoringTaskDetails updateMonitoringTask(MonitoringTaskSummary body, Boolean naked, String monitorId) throws ApiException {
        ApiResponse<MonitoringTaskDetails> resp = updateMonitoringTaskWithHttpInfo(body, naked, monitorId);
        return resp.getData();
    }

    /**
     * 
     * Updates an existing monitor.
     * @param body The description of the app to add or update. This can be either a file upload or json posted to the request body. (required)
     * @param naked  (required)
     * @param monitorId The id of the monitor to update (required)
     * @return ApiResponse&lt;MonitoringTaskDetails&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MonitoringTaskDetails> updateMonitoringTaskWithHttpInfo(MonitoringTaskSummary body, Boolean naked, String monitorId) throws ApiException {
        com.squareup.okhttp.Call call = updateMonitoringTaskCall(body, naked, monitorId, null, null);
        Type localVarReturnType = new TypeToken<MonitoringTaskDetails>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Updates an existing monitor.
     * @param body The description of the app to add or update. This can be either a file upload or json posted to the request body. (required)
     * @param naked  (required)
     * @param monitorId The id of the monitor to update (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateMonitoringTaskAsync(MonitoringTaskSummary body, Boolean naked, String monitorId, final ApiCallback<MonitoringTaskDetails> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = updateMonitoringTaskCall(body, naked, monitorId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MonitoringTaskDetails>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
