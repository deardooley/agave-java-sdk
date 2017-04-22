# MonitorsApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMonitoringTasks**](MonitorsApi.md#addMonitoringTasks) | **POST** /monitors/v2/ | 
[**deleteMonitoringTask**](MonitorsApi.md#deleteMonitoringTask) | **DELETE** /monitors/v2/{monitorId} | 
[**forceMonitoringTaskCheck**](MonitorsApi.md#forceMonitoringTaskCheck) | **POST** /monitors/v2/{monitorId}/checks | 
[**getMonitoringTask**](MonitorsApi.md#getMonitoringTask) | **GET** /monitors/v2/{monitorId} | 
[**getMonitoringTaskCheck**](MonitorsApi.md#getMonitoringTaskCheck) | **GET** /monitors/v2/{monitorId}/checks/{checkId} | 
[**listMonitoringTaskChecks**](MonitorsApi.md#listMonitoringTaskChecks) | **GET** /monitors/v2/{monitorId}/checks | 
[**listMonitoringTasks**](MonitorsApi.md#listMonitoringTasks) | **GET** /monitors/v2/ | 
[**updateMonitoringTask**](MonitorsApi.md#updateMonitoringTask) | **POST** /monitors/v2/{monitorId} | 


<a name="addMonitoringTasks"></a>
# **addMonitoringTasks**
> MonitoringTaskDetails addMonitoringTasks(body, naked)



Add a new monitoring task

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MonitorsApi;

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

MonitorsApi apiInstance = new MonitorsApi();
MonitoringTaskSummary body = new MonitoringTaskSummary(); // MonitoringTaskSummary | The description of the monitoring task to run
Boolean naked = true; // Boolean | 
try {
    MonitoringTaskDetails result = apiInstance.addMonitoringTasks(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitorsApi#addMonitoringTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MonitoringTaskSummary**](MonitoringTaskSummary.md)| The description of the monitoring task to run |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**MonitoringTaskDetails**](MonitoringTaskDetails.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMonitoringTask"></a>
# **deleteMonitoringTask**
> deleteMonitoringTask(monitorId, naked)



Deletes a monitor.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MonitorsApi;

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

MonitorsApi apiInstance = new MonitorsApi();
String monitorId = "monitorId_example"; // String | The id of the monitor to delete
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteMonitoringTask(monitorId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitorsApi#deleteMonitoringTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitorId** | **String**| The id of the monitor to delete |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="forceMonitoringTaskCheck"></a>
# **forceMonitoringTaskCheck**
> MonitoringTaskDetails forceMonitoringTaskCheck(monitorId, naked)



Forces a monitor check to run.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MonitorsApi;

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

MonitorsApi apiInstance = new MonitorsApi();
String monitorId = "monitorId_example"; // String | The id of the monitor
Boolean naked = true; // Boolean | 
try {
    MonitoringTaskDetails result = apiInstance.forceMonitoringTaskCheck(monitorId, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitorsApi#forceMonitoringTaskCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitorId** | **String**| The id of the monitor |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**MonitoringTaskDetails**](MonitoringTaskDetails.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMonitoringTask"></a>
# **getMonitoringTask**
> MonitoringTaskDetails getMonitoringTask(monitorId, naked)



Retrieve a specific monitor.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MonitorsApi;

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

MonitorsApi apiInstance = new MonitorsApi();
String monitorId = "monitorId_example"; // String | The id of the monitor
Boolean naked = true; // Boolean | 
try {
    MonitoringTaskDetails result = apiInstance.getMonitoringTask(monitorId, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitorsApi#getMonitoringTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitorId** | **String**| The id of the monitor |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**MonitoringTaskDetails**](MonitoringTaskDetails.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMonitoringTaskCheck"></a>
# **getMonitoringTaskCheck**
> MonitoringTaskCheck getMonitoringTaskCheck(monitorId, checkId, naked)



Retrieve a specific monitor check

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MonitorsApi;

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

MonitorsApi apiInstance = new MonitorsApi();
String monitorId = "monitorId_example"; // String | The id of the monitor
String checkId = "checkId_example"; // String | The id of the monitor check
Boolean naked = true; // Boolean | 
try {
    MonitoringTaskCheck result = apiInstance.getMonitoringTaskCheck(monitorId, checkId, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitorsApi#getMonitoringTaskCheck");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitorId** | **String**| The id of the monitor |
 **checkId** | **String**| The id of the monitor check |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**MonitoringTaskCheck**](MonitoringTaskCheck.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMonitoringTaskChecks"></a>
# **listMonitoringTaskChecks**
> List&lt;MonitoringTaskCheck&gt; listMonitoringTaskChecks(monitorId, naked, startDate, endDate, result, limit, offset)



Retrieve checks for a specific monitor

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MonitorsApi;

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

MonitorsApi apiInstance = new MonitorsApi();
String monitorId = "monitorId_example"; // String | The id of the monitor
Boolean naked = true; // Boolean | 
String startDate = "startDate_example"; // String | A timestamp indicating the earliest time of the first monitor check in ISO 8601 format
String endDate = "endDate_example"; // String | A timestamp indicating the latest time of the first monitor check in ISO 8601 format
String result = "result_example"; // String | A timestamp indicating the latest time of the first monitor check in ISO 8601 format
Long limit = 250L; // Long | The max number of results.
Long offset = 0L; // Long | The number of records to when returning the results. When paginating results, the page number = ceil(offset/limit)
try {
    List<MonitoringTaskCheck> result = apiInstance.listMonitoringTaskChecks(monitorId, naked, startDate, endDate, result, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitorsApi#listMonitoringTaskChecks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **monitorId** | **String**| The id of the monitor |
 **naked** | **Boolean**|  | [default to true]
 **startDate** | **String**| A timestamp indicating the earliest time of the first monitor check in ISO 8601 format | [optional]
 **endDate** | **String**| A timestamp indicating the latest time of the first monitor check in ISO 8601 format | [optional]
 **result** | **String**| A timestamp indicating the latest time of the first monitor check in ISO 8601 format | [optional] [enum: FAILED, PASSED, UNKNOWN]
 **limit** | **Long**| The max number of results. | [optional] [default to 250]
 **offset** | **Long**| The number of records to when returning the results. When paginating results, the page number &#x3D; ceil(offset/limit) | [optional] [default to 0]

### Return type

[**List&lt;MonitoringTaskCheck&gt;**](MonitoringTaskCheck.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMonitoringTasks"></a>
# **listMonitoringTasks**
> List&lt;MonitoringTaskSummary&gt; listMonitoringTasks(naked, target, active, limit, offset)



Retrieve Monitor for a specific resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MonitorsApi;

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

MonitorsApi apiInstance = new MonitorsApi();
Boolean naked = true; // Boolean | 
String target = "target_example"; // String | The target system to search for.
String active = "true"; // String | Filter by monitors that are active or inactive.
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<MonitoringTaskSummary> result = apiInstance.listMonitoringTasks(naked, target, active, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitorsApi#listMonitoringTasks");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **naked** | **Boolean**|  | [default to true]
 **target** | **String**| The target system to search for. | [optional]
 **active** | **String**| Filter by monitors that are active or inactive. | [optional] [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;MonitoringTaskSummary&gt;**](MonitoringTaskSummary.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMonitoringTask"></a>
# **updateMonitoringTask**
> MonitoringTaskDetails updateMonitoringTask(body, naked, monitorId)



Updates an existing monitor.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MonitorsApi;

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

MonitorsApi apiInstance = new MonitorsApi();
MonitoringTaskSummary body = new MonitoringTaskSummary(); // MonitoringTaskSummary | The description of the app to add or update. This can be either a file upload or json posted to the request body.
Boolean naked = true; // Boolean | 
String monitorId = "monitorId_example"; // String | The id of the monitor to update
try {
    MonitoringTaskDetails result = apiInstance.updateMonitoringTask(body, naked, monitorId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MonitorsApi#updateMonitoringTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MonitoringTaskSummary**](MonitoringTaskSummary.md)| The description of the app to add or update. This can be either a file upload or json posted to the request body. |
 **naked** | **Boolean**|  | [default to true]
 **monitorId** | **String**| The id of the monitor to update |

### Return type

[**MonitoringTaskDetails**](MonitoringTaskDetails.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

