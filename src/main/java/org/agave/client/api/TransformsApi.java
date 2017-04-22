

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
import org.agave.client.model.Transform;
import org.agave.client.model.TransformRequest;

public class TransformsApi {
    private ApiClient apiClient;

    public TransformsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransformsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for asyncTransform */
    private com.squareup.okhttp.Call asyncTransformCall(String transformId, String owner, String filePath, TransformRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'transformId' is set
        if (transformId == null) {
            throw new ApiException("Missing the required parameter 'transformId' when calling asyncTransform(Async)");
        }
        
        // verify the required parameter 'owner' is set
        if (owner == null) {
            throw new ApiException("Missing the required parameter 'owner' when calling asyncTransform(Async)");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling asyncTransform(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling asyncTransform(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling asyncTransform(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/transforms/v2/{transformId}/async/{owner}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "transformId" + "\\}", apiClient.escapeString(transformId.toString()))
        .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
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
     * Transform a file and stage it to a specified location.
     * @param transformId The name of the transform to apply to the given file. (required)
     * @param owner The name of the api user owning the file at the given path. (required)
     * @param filePath The path to the file to be transformed and staged (required)
     * @param body The transfer request details. (required)
     * @param naked  (required)
     * @return Transform
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transform asyncTransform(String transformId, String owner, String filePath, TransformRequest body, Boolean naked) throws ApiException {
        ApiResponse<Transform> resp = asyncTransformWithHttpInfo(transformId, owner, filePath, body, naked);
        return resp.getData();
    }

    /**
     * 
     * Transform a file and stage it to a specified location.
     * @param transformId The name of the transform to apply to the given file. (required)
     * @param owner The name of the api user owning the file at the given path. (required)
     * @param filePath The path to the file to be transformed and staged (required)
     * @param body The transfer request details. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Transform&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transform> asyncTransformWithHttpInfo(String transformId, String owner, String filePath, TransformRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = asyncTransformCall(transformId, owner, filePath, body, naked, null, null);
        Type localVarReturnType = new TypeToken<Transform>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Transform a file and stage it to a specified location.
     * @param transformId The name of the transform to apply to the given file. (required)
     * @param owner The name of the api user owning the file at the given path. (required)
     * @param filePath The path to the file to be transformed and staged (required)
     * @param body The transfer request details. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call asyncTransformAsync(String transformId, String owner, String filePath, TransformRequest body, Boolean naked, final ApiCallback<Transform> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = asyncTransformCall(transformId, owner, filePath, body, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transform>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for getTransform */
    private com.squareup.okhttp.Call getTransformCall(String transformId, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'transformId' is set
        if (transformId == null) {
            throw new ApiException("Missing the required parameter 'transformId' when calling getTransform(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling getTransform(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/transforms/v2/{transformId}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "transformId" + "\\}", apiClient.escapeString(transformId.toString()));

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
     * Find the transform of the given uuid
     * @param transformId The name of the transform requested. (required)
     * @param naked  (required)
     * @return Transform
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Transform getTransform(String transformId, Boolean naked) throws ApiException {
        ApiResponse<Transform> resp = getTransformWithHttpInfo(transformId, naked);
        return resp.getData();
    }

    /**
     * 
     * Find the transform of the given uuid
     * @param transformId The name of the transform requested. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Transform&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Transform> getTransformWithHttpInfo(String transformId, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = getTransformCall(transformId, naked, null, null);
        Type localVarReturnType = new TypeToken<Transform>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Find the transform of the given uuid
     * @param transformId The name of the transform requested. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getTransformAsync(String transformId, Boolean naked, final ApiCallback<Transform> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getTransformCall(transformId, naked, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Transform>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for listTransforms */
    private com.squareup.okhttp.Call listTransformsCall(Boolean naked, String name, String version, Long limit, Long offset, String tags, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling listTransforms(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/transforms/v2/".replaceAll("\\{format\\}","json");

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (name != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "name", name));
        if (version != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "version", version));
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "offset", offset));
        if (naked != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "naked", naked));
        if (tags != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "tags", tags));

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
     * List and search for transforms
     * @param naked  (required)
     * @param name The name of the transform (optional)
     * @param version The name of the transform (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param tags One or more tags of the transform (optional)
     * @return List&lt;Transform&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public List<Transform> listTransforms(Boolean naked, String name, String version, Long limit, Long offset, String tags) throws ApiException {
        ApiResponse<List<Transform>> resp = listTransformsWithHttpInfo(naked, name, version, limit, offset, tags);
        return resp.getData();
    }

    /**
     * 
     * List and search for transforms
     * @param naked  (required)
     * @param name The name of the transform (optional)
     * @param version The name of the transform (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param tags One or more tags of the transform (optional)
     * @return ApiResponse&lt;List&lt;Transform&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<List<Transform>> listTransformsWithHttpInfo(Boolean naked, String name, String version, Long limit, Long offset, String tags) throws ApiException {
        com.squareup.okhttp.Call call = listTransformsCall(naked, name, version, limit, offset, tags, null, null);
        Type localVarReturnType = new TypeToken<List<Transform>>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * List and search for transforms
     * @param naked  (required)
     * @param name The name of the transform (optional)
     * @param version The name of the transform (optional)
     * @param limit The maximum number of results returned from this query (optional, default to 100)
     * @param offset The number of results skipped in the result set returned from this query (optional, default to 0)
     * @param tags One or more tags of the transform (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listTransformsAsync(Boolean naked, String name, String version, Long limit, Long offset, String tags, final ApiCallback<List<Transform>> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = listTransformsCall(naked, name, version, limit, offset, tags, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<List<Transform>>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /* Build call for syncTransform */
    private com.squareup.okhttp.Call syncTransformCall(String transformId, String owner, String filePath, TransformRequest body, Boolean naked, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // verify the required parameter 'transformId' is set
        if (transformId == null) {
            throw new ApiException("Missing the required parameter 'transformId' when calling syncTransform(Async)");
        }
        
        // verify the required parameter 'owner' is set
        if (owner == null) {
            throw new ApiException("Missing the required parameter 'owner' when calling syncTransform(Async)");
        }
        
        // verify the required parameter 'filePath' is set
        if (filePath == null) {
            throw new ApiException("Missing the required parameter 'filePath' when calling syncTransform(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new ApiException("Missing the required parameter 'body' when calling syncTransform(Async)");
        }
        
        // verify the required parameter 'naked' is set
        if (naked == null) {
            throw new ApiException("Missing the required parameter 'naked' when calling syncTransform(Async)");
        }
        

        // create path and map variables
        String localVarPath = "/transforms/v2/{transformId}/sync/{owner}/{filePath}".replaceAll("\\{format\\}","json")
        .replaceAll("\\{" + "transformId" + "\\}", apiClient.escapeString(transformId.toString()))
        .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
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
     * Transform a file and download it directly.
     * @param transformId The name of the transform to apply to the given file. (required)
     * @param owner The name of the api user owning the file at the given path. (required)
     * @param filePath The path to the file to be transformed and downloaded. (required)
     * @param body The transfer request details. (required)
     * @param naked  (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void syncTransform(String transformId, String owner, String filePath, TransformRequest body, Boolean naked) throws ApiException {
        syncTransformWithHttpInfo(transformId, owner, filePath, body, naked);
    }

    /**
     * 
     * Transform a file and download it directly.
     * @param transformId The name of the transform to apply to the given file. (required)
     * @param owner The name of the api user owning the file at the given path. (required)
     * @param filePath The path to the file to be transformed and downloaded. (required)
     * @param body The transfer request details. (required)
     * @param naked  (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> syncTransformWithHttpInfo(String transformId, String owner, String filePath, TransformRequest body, Boolean naked) throws ApiException {
        com.squareup.okhttp.Call call = syncTransformCall(transformId, owner, filePath, body, naked, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Transform a file and download it directly.
     * @param transformId The name of the transform to apply to the given file. (required)
     * @param owner The name of the api user owning the file at the given path. (required)
     * @param filePath The path to the file to be transformed and downloaded. (required)
     * @param body The transfer request details. (required)
     * @param naked  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call syncTransformAsync(String transformId, String owner, String filePath, TransformRequest body, Boolean naked, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = syncTransformCall(transformId, owner, filePath, body, naked, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
