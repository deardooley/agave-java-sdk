# JobsApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addJobPermission**](JobsApi.md#addJobPermission) | **POST** /jobs/v2/{jobId}/pems | 
[**clearJobPermissions**](JobsApi.md#clearJobPermissions) | **DELETE** /jobs/v2/{jobId}/pems | 
[**deleteJob**](JobsApi.md#deleteJob) | **DELETE** /jobs/v2/{jobId} | 
[**deleteJobPermission**](JobsApi.md#deleteJobPermission) | **DELETE** /jobs/v2/{jobId}/pems/{username} | 
[**downloadJobOutput**](JobsApi.md#downloadJobOutput) | **GET** /jobs/v2/{jobId}/outputs/media/{filePath} | 
[**getJobDetails**](JobsApi.md#getJobDetails) | **GET** /jobs/v2/{jobId} | 
[**getJobHistory**](JobsApi.md#getJobHistory) | **GET** /jobs/v2/{jobId}/history | 
[**getJobPermission**](JobsApi.md#getJobPermission) | **GET** /jobs/v2/{jobId}/pems/{username} | 
[**getJobStatus**](JobsApi.md#getJobStatus) | **GET** /jobs/v2/{jobId}/status | 
[**listJobOutputs**](JobsApi.md#listJobOutputs) | **GET** /jobs/v2/{jobId}/outputs/listings/{filePath} | 
[**listJobPermissions**](JobsApi.md#listJobPermissions) | **GET** /jobs/v2/{jobId}/pems | 
[**listJobs**](JobsApi.md#listJobs) | **GET** /jobs/v2/ | 
[**resubmitJob**](JobsApi.md#resubmitJob) | **POST** /jobs/v2/{jobId} | 
[**submitJob**](JobsApi.md#submitJob) | **POST** /jobs/v2/ | 
[**updateJobPermission**](JobsApi.md#updateJobPermission) | **POST** /jobs/v2/{jobId}/pems/{username} | 


<a name="addJobPermission"></a>
# **addJobPermission**
> Permission addJobPermission(jobId, body, naked)



Add a user permission for the given job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job.
Permission body = new Permission(); // Permission | The permission add or update. 
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.addJobPermission(jobId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#addJobPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job. |
 **body** | [**Permission**](Permission.md)| The permission add or update.  |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearJobPermissions"></a>
# **clearJobPermissions**
> clearJobPermissions(jobId, naked)



Deletes all permissions on an job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job.
Boolean naked = true; // Boolean | 
try {
    apiInstance.clearJobPermissions(jobId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#clearJobPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job. |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteJob"></a>
# **deleteJob**
> deleteJob(jobId, naked)



Deletes a job from history of the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job.
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteJob(jobId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#deleteJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job. |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteJobPermission"></a>
# **deleteJobPermission**
> deleteJobPermission(jobId, username, naked)



Deletes all permissions for the given user on an job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job for which to delete the user permissions.
String username = "username_example"; // String | The username for whom to delete permissions
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteJobPermission(jobId, username, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#deleteJobPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job for which to delete the user permissions. |
 **username** | **String**| The username for whom to delete permissions |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadJobOutput"></a>
# **downloadJobOutput**
> downloadJobOutput(jobId, filePath, force)



Download an output file from a specific job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job.
String filePath = "filePath_example"; // String | The path to an output file relative to the job output directory. 
Boolean force = false; // Boolean | If true, the Content-Disposition header is set to force a file download from the browser.
try {
    apiInstance.downloadJobOutput(jobId, filePath, force);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#downloadJobOutput");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job. |
 **filePath** | **String**| The path to an output file relative to the job output directory.  |
 **force** | **Boolean**| If true, the Content-Disposition header is set to force a file download from the browser. | [default to false]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobDetails"></a>
# **getJobDetails**
> Job getJobDetails(jobId, naked)



Get details of the job with the specific job id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
Long jobId = 789L; // Long | The id of the job.
Boolean naked = true; // Boolean | 
try {
    Job result = apiInstance.getJobDetails(jobId, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#getJobDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **Long**| The id of the job. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Job**](Job.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobHistory"></a>
# **getJobHistory**
> List&lt;JobHistory&gt; getJobHistory(jobId, naked, limit, offset)



Get the history of this job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job.
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<JobHistory> result = apiInstance.getJobHistory(jobId, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#getJobHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job. |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;JobHistory&gt;**](JobHistory.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobPermission"></a>
# **getJobPermission**
> Permission getJobPermission(jobId, username, naked)



Get a specific user permission for a job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job.
String username = "username_example"; // String | The username of the api user associated with the permission.
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.getJobPermission(jobId, username, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#getJobPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job. |
 **username** | **String**| The username of the api user associated with the permission. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getJobStatus"></a>
# **getJobStatus**
> JobStatusSummary getJobStatus(jobId, naked)



Get the status of the job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job.
Boolean naked = true; // Boolean | 
try {
    JobStatusSummary result = apiInstance.getJobStatus(jobId, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#getJobStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**JobStatusSummary**](JobStatusSummary.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listJobOutputs"></a>
# **listJobOutputs**
> List&lt;FileInfo&gt; listJobOutputs(jobId, filePath, naked, limit, offset)



List the output folder for a job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job.
String filePath = "filePath_example"; // String | The path to an output file or folder relative to the job output directory. This resource will follow data around as it moves from the execution system to archival storage.
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<FileInfo> result = apiInstance.listJobOutputs(jobId, filePath, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#listJobOutputs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job. |
 **filePath** | **String**| The path to an output file or folder relative to the job output directory. This resource will follow data around as it moves from the execution system to archival storage. |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;FileInfo&gt;**](FileInfo.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listJobPermissions"></a>
# **listJobPermissions**
> List&lt;Permission&gt; listJobPermissions(jobId, naked, limit, offset)



Get the permissions granted for this job.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job.
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results to skip in the result set for this query
try {
    List<Permission> result = apiInstance.listJobPermissions(jobId, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#listJobPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job. |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results to skip in the result set for this query | [optional] [default to 0]

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listJobs"></a>
# **listJobs**
> List&lt;Job&gt; listJobs(naked, appId, archive, archivePath, archiveSystem, batchQueue, executionSystem, id, inputs, localId, maxRuntime, memoryPerNode, name, nodeCount, outputPath, parameters, processorsPerNode, retries, startTime, status, submitTime, visible, limit, offset)



Get a list of jobs the authenticated user had submitted.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
Boolean naked = true; // Boolean | 
String appId = "appId_example"; // String | The id of the app run by the job.
String archive = "true"; // String | Boolean flag stating whether the job output was archived. (Acceptable values are: \"true\", \"false\")
String archivePath = "archivePath_example"; // String | Path on the archive system where the job output was archived if the archive flag was true.
String archiveSystem = "archiveSystem_example"; // String | The id of the system where the job output was archived if the archive flag was true.
String batchQueue = "batchQueue_example"; // String | The system queue in which the job ran.
String executionSystem = "executionSystem_example"; // String | The execution system where the job ran.
String id = "id_example"; // String | The id of the job.
String inputs = "inputs_example"; // String | The job inputs. Note, this is a partial text search.
String localId = "localId_example"; // String | The local job id of the job on the execution system.
String maxRuntime = "maxRuntime_example"; // String | The maximum run time of the job in HH:mm:ss format.
String memoryPerNode = "memoryPerNode_example"; // String | The memory requested by the job specified in GB.
String name = "name_example"; // String | The name of the job.
Long nodeCount = 789L; // Long | The number of nodes requested for the job.
String outputPath = "outputPath_example"; // String | The remote work directory path of the job.
String parameters = "parameters_example"; // String | The job parameters. Note, this is a partial text search.
Long processorsPerNode = 789L; // Long | The number of processors per node requested by the job.
Long retries = 789L; // Long | The number of retry attempts made on this job.
String startTime = "startTime_example"; // String | The date the job began running. Results are rounded by day. You may specify using YYYY-MM-DD format or free form timeframes such as 'yesterday' or '3 days ago'.
String status = "status_example"; // String | The job status.
String submitTime = "submitTime_example"; // String | The date the job was submitted to the remote execution system to run. Results are rounded by day. You may specify using YYYY-MM-DD format or free form timeframes such as 'yesterday' or '3 days ago'.
String visible = "true"; // String | Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (Acceptable values are: \"true\", \"false\")
Long limit = 789L; // Long | Boolean flag indicating whether or not to show deleted jobs. Defaults to false.
Long offset = 789L; // Long | Boolean flag indicating whether or not to show deleted jobs. Defaults to false.
try {
    List<Job> result = apiInstance.listJobs(naked, appId, archive, archivePath, archiveSystem, batchQueue, executionSystem, id, inputs, localId, maxRuntime, memoryPerNode, name, nodeCount, outputPath, parameters, processorsPerNode, retries, startTime, status, submitTime, visible, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#listJobs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **naked** | **Boolean**|  | [default to true]
 **appId** | **String**| The id of the app run by the job. | [optional]
 **archive** | **String**| Boolean flag stating whether the job output was archived. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) | [optional] [default to true]
 **archivePath** | **String**| Path on the archive system where the job output was archived if the archive flag was true. | [optional]
 **archiveSystem** | **String**| The id of the system where the job output was archived if the archive flag was true. | [optional]
 **batchQueue** | **String**| The system queue in which the job ran. | [optional]
 **executionSystem** | **String**| The execution system where the job ran. | [optional]
 **id** | **String**| The id of the job. | [optional]
 **inputs** | **String**| The job inputs. Note, this is a partial text search. | [optional]
 **localId** | **String**| The local job id of the job on the execution system. | [optional]
 **maxRuntime** | **String**| The maximum run time of the job in HH:mm:ss format. | [optional]
 **memoryPerNode** | **String**| The memory requested by the job specified in GB. | [optional]
 **name** | **String**| The name of the job. | [optional]
 **nodeCount** | **Long**| The number of nodes requested for the job. | [optional]
 **outputPath** | **String**| The remote work directory path of the job. | [optional]
 **parameters** | **String**| The job parameters. Note, this is a partial text search. | [optional]
 **processorsPerNode** | **Long**| The number of processors per node requested by the job. | [optional]
 **retries** | **Long**| The number of retry attempts made on this job. | [optional]
 **startTime** | **String**| The date the job began running. Results are rounded by day. You may specify using YYYY-MM-DD format or free form timeframes such as &#39;yesterday&#39; or &#39;3 days ago&#39;. | [optional]
 **status** | **String**| The job status. | [optional] [enum: PENDING, STAGING_INPUTS, CLEANING_UP, ARCHIVING, STAGING_JOB, FINISHED, KILLED, FAILED, STOPPED, RUNNING, PAUSED, QUEUED, SUBMITTING, STAGED, PROCESSING_INPUTS, ARCHIVING_FINISHED, ARCHIVING_FAILED, HEARTBEAT]
 **submitTime** | **String**| The date the job was submitted to the remote execution system to run. Results are rounded by day. You may specify using YYYY-MM-DD format or free form timeframes such as &#39;yesterday&#39; or &#39;3 days ago&#39;. | [optional]
 **visible** | **String**| Boolean flag indicating whether or not to show deleted jobs. Defaults to false. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) | [optional] [default to true]
 **limit** | **Long**| Boolean flag indicating whether or not to show deleted jobs. Defaults to false. | [optional]
 **offset** | **Long**| Boolean flag indicating whether or not to show deleted jobs. Defaults to false. | [optional]

### Return type

[**List&lt;Job&gt;**](Job.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resubmitJob"></a>
# **resubmitJob**
> Job resubmitJob(jobId, body, naked)



Resubmits the job with the given job id as a new job with a unique id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job to resubmit
JobResubmitAction body = new JobResubmitAction(); // JobResubmitAction | The resubmit action request
Boolean naked = true; // Boolean | 
try {
    Job result = apiInstance.resubmitJob(jobId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#resubmitJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job to resubmit |
 **body** | [**JobResubmitAction**](JobResubmitAction.md)| The resubmit action request |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Job**](Job.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitJob"></a>
# **submitJob**
> Job submitJob(body, naked)



Submit a new job request.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
JobRequest body = new JobRequest(); // JobRequest | The JSON description of the job to submit. 
Boolean naked = true; // Boolean | 
try {
    Job result = apiInstance.submitJob(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#submitJob");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**JobRequest**](JobRequest.md)| The JSON description of the job to submit.  |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Job**](Job.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateJobPermission"></a>
# **updateJobPermission**
> Permission updateJobPermission(jobId, username, body, naked)



Update a user permission for the given job and username

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.JobsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: agaveImplicit
OAuth agaveImplicit = (OAuth) defaultClient.getAuthentication("agaveImplicit");
agaveImplicit.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agavePassword
OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
agavePassword.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: agaveApplication
OAuth agaveApplication = (OAuth) defaultClient.getAuthentication("agaveApplication");
agaveApplication.setAccessToken("YOUR ACCESS TOKEN");

JobsApi apiInstance = new JobsApi();
String jobId = "jobId_example"; // String | The id of the job for which the permissions will be updated
String username = "username_example"; // String | The user for whom the permission will be udpated
Permission body = new Permission(); // Permission | The permission to update
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.updateJobPermission(jobId, username, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling JobsApi#updateJobPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**| The id of the job for which the permissions will be updated |
 **username** | **String**| The user for whom the permission will be udpated |
 **body** | [**Permission**](Permission.md)| The permission to update |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

