# AppsApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addApp**](AppsApi.md#addApp) | **POST** /apps/v2/ | 
[**addAppPermission**](AppsApi.md#addAppPermission) | **POST** /apps/v2/{appId}/pems | 
[**clearAppPermissions**](AppsApi.md#clearAppPermissions) | **DELETE** /apps/v2/{appId}/pems | 
[**deleteApp**](AppsApi.md#deleteApp) | **DELETE** /apps/v2/{appId} | 
[**deleteAppPermission**](AppsApi.md#deleteAppPermission) | **DELETE** /apps/v2/{appId}/pems/{username} | 
[**getAppDetails**](AppsApi.md#getAppDetails) | **GET** /apps/v2/{appId} | 
[**getAppPermission**](AppsApi.md#getAppPermission) | **GET** /apps/v2/{appId}/pems/{username} | 
[**getAppSubmissionForm**](AppsApi.md#getAppSubmissionForm) | **GET** /apps/v2/{appId}/form | 
[**invokeAppAction**](AppsApi.md#invokeAppAction) | **PUT** /apps/v2/{appId} | 
[**listAppHistory**](AppsApi.md#listAppHistory) | **GET** /apps/v2/{appId}/history | 
[**listAppPermissions**](AppsApi.md#listAppPermissions) | **GET** /apps/v2/{appId}/pems | 
[**listApps**](AppsApi.md#listApps) | **GET** /apps/v2/ | List apps
[**updateApp**](AppsApi.md#updateApp) | **POST** /apps/v2/{appId} | 
[**updateAppPermission**](AppsApi.md#updateAppPermission) | **POST** /apps/v2/{appId}/pems/{username} | 


<a name="addApp"></a>
# **addApp**
> Application addApp(naked, body)



Register and update new applications.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
Boolean naked = true; // Boolean | 
Application body = new Application(); // Application | The description of the app to add or update. 
try {
    Application result = apiInstance.addApp(naked, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#addApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **naked** | **Boolean**|  | [default to true]
 **body** | [**Application**](Application.md)| The description of the app to add or update.  | [optional]

### Return type

[**Application**](Application.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addAppPermission"></a>
# **addAppPermission**
> Permission addAppPermission(appId, body, naked)



Grant a user permission for an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The id of the application. The application id is made up of the name and version separated by a dash.
Permission body = new Permission(); // Permission | The permission add or update. 
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.addAppPermission(appId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#addAppPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The id of the application. The application id is made up of the name and version separated by a dash. |
 **body** | [**Permission**](Permission.md)| The permission add or update.  |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearAppPermissions"></a>
# **clearAppPermissions**
> clearAppPermissions(appId, naked)



Deletes all permissions on an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The id of the application. The application id is made up of the name and version separated by a dash.
Boolean naked = true; // Boolean | 
try {
    apiInstance.clearAppPermissions(appId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#clearAppPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The id of the application. The application id is made up of the name and version separated by a dash. |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteApp"></a>
# **deleteApp**
> deleteApp(appId, naked)



Deletes an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The id of the application. The application id is made up of the name and version separated by a dash.
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteApp(appId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#deleteApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The id of the application. The application id is made up of the name and version separated by a dash. |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAppPermission"></a>
# **deleteAppPermission**
> deleteAppPermission(appId, username, naked)



Deletes all permissions for the given user on an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The id of the application. The application id is made up of the name and version separated by a dash.
String username = "username_example"; // String | The username of the api user associated with the permission
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteAppPermission(appId, username, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#deleteAppPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The id of the application. The application id is made up of the name and version separated by a dash. |
 **username** | **String**| The username of the api user associated with the permission |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppDetails"></a>
# **getAppDetails**
> Application getAppDetails(appId, naked)



Get details of an application by its unique id.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The id of the application. The application id is made up of the name and version separated by a dash.
Boolean naked = true; // Boolean | 
try {
    Application result = apiInstance.getAppDetails(appId, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getAppDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The id of the application. The application id is made up of the name and version separated by a dash. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Application**](Application.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppPermission"></a>
# **getAppPermission**
> Permission getAppPermission(appId, username, filter, naked)



Get a specific user permission for an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The id of the application. The application id is made up of the name and version separated by a dash.
String username = "username_example"; // String | The username of the api user associated with the permission.
String filter = "*"; // String | A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects
String naked = "true"; // String | If true, the response wrapper is stripped and the raw object is returned
try {
    Permission result = apiInstance.getAppPermission(appId, username, filter, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getAppPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The id of the application. The application id is made up of the name and version separated by a dash. |
 **username** | **String**| The username of the api user associated with the permission. |
 **filter** | **String**| A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects | [optional] [default to *]
 **naked** | **String**| If true, the response wrapper is stripped and the raw object is returned | [optional] [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getAppSubmissionForm"></a>
# **getAppSubmissionForm**
> String getAppSubmissionForm(appId, naked)



Get a submission form for the named application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The app for which to create the form
String naked = "true"; // String | If true, the response wrapper is stripped and the raw object is returned
try {
    String result = apiInstance.getAppSubmissionForm(appId, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#getAppSubmissionForm");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The app for which to create the form |
 **naked** | **String**| If true, the response wrapper is stripped and the raw object is returned | [optional] [default to true]

### Return type

**String**

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invokeAppAction"></a>
# **invokeAppAction**
> Application invokeAppAction(appId, body, naked)



Edit an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The id of the application. The application id is made up of the name and version separated by a dash.
ApplicationAction body = new ApplicationAction(); // ApplicationAction | The operation to perform.
Boolean naked = true; // Boolean | 
try {
    Application result = apiInstance.invokeAppAction(appId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#invokeAppAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The id of the application. The application id is made up of the name and version separated by a dash. |
 **body** | [**ApplicationAction**](ApplicationAction.md)| The operation to perform. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Application**](Application.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAppHistory"></a>
# **listAppHistory**
> HistoryEvent listAppHistory(naked, appId, status, created, limit, offset)



List the event history of this app

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
Boolean naked = true; // Boolean | 
String appId = "appId_example"; // String | The id of the app for which the history will be returned
String status = "status_example"; // String | The event status
String created = "created_example"; // String | The date the event occurred
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    HistoryEvent result = apiInstance.listAppHistory(naked, appId, status, created, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#listAppHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **naked** | **Boolean**|  | [default to true]
 **appId** | **String**| The id of the app for which the history will be returned |
 **status** | **String**| The event status | [optional]
 **created** | **String**| The date the event occurred | [optional]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**HistoryEvent**](HistoryEvent.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listAppPermissions"></a>
# **listAppPermissions**
> List&lt;Permission&gt; listAppPermissions(appId, filter, naked, limit, offset)



Get the permission for this application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The id of the application. The application id is made up of the name and version separated by a dash.
String filter = "*"; // String | A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects
String naked = "true"; // String | If true, the response wrapper is stripped and the raw object is returned
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<Permission> result = apiInstance.listAppPermissions(appId, filter, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#listAppPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The id of the application. The application id is made up of the name and version separated by a dash. |
 **filter** | **String**| A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects | [optional] [default to *]
 **naked** | **String**| If true, the response wrapper is stripped and the raw object is returned | [optional] [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listApps"></a>
# **listApps**
> List&lt;ApplicationSummary&gt; listApps(_public, name, executionSystem, tags, filter, naked, limit, offset)

List apps

Get a list of available applications.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
Boolean _public = true; // Boolean | Whether to return only public apps. (Acceptable values are: \"true\", \"false\")
String name = "name_example"; // String | The name of the app
String executionSystem = "executionSystem_example"; // String | The execution system of the system
String tags = "tags_example"; // String | A free text tag associated with an app
String filter = "*"; // String | A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects
String naked = "true"; // String | If true, the response wrapper is stripped and the raw object is returned
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<ApplicationSummary> result = apiInstance.listApps(_public, name, executionSystem, tags, filter, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#listApps");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_public** | **Boolean**| Whether to return only public apps. (Acceptable values are: \&quot;true\&quot;, \&quot;false\&quot;) | [optional]
 **name** | **String**| The name of the app | [optional]
 **executionSystem** | **String**| The execution system of the system | [optional]
 **tags** | **String**| A free text tag associated with an app | [optional]
 **filter** | **String**| A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects | [optional] [default to *]
 **naked** | **String**| If true, the response wrapper is stripped and the raw object is returned | [optional] [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;ApplicationSummary&gt;**](ApplicationSummary.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateApp"></a>
# **updateApp**
> Application updateApp(appId, body, naked)



Update an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The id of the application. The application id is made up of the name and version separated by a dash.
Application body = new Application(); // Application | The description of the app to add or update. 
Boolean naked = true; // Boolean | 
try {
    Application result = apiInstance.updateApp(appId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#updateApp");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The id of the application. The application id is made up of the name and version separated by a dash. |
 **body** | [**Application**](Application.md)| The description of the app to add or update.  |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Application**](Application.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateAppPermission"></a>
# **updateAppPermission**
> Permission updateAppPermission(appId, username, body, naked)



Add or update a user permission for an application.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AppsApi;

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

AppsApi apiInstance = new AppsApi();
String appId = "appId_example"; // String | The id of the application. The application id is made up of the name and version separated by a dash.
String username = "username_example"; // String | The username of the api user associated with the permission
Permission body = new Permission(); // Permission | The permission add or update. 
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.updateAppPermission(appId, username, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AppsApi#updateAppPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **appId** | **String**| The id of the application. The application id is made up of the name and version separated by a dash. |
 **username** | **String**| The username of the api user associated with the permission |
 **body** | [**Permission**](Permission.md)| The permission add or update.  |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

