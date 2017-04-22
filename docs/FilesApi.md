# FilesApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**clearFileItemPermissions**](FilesApi.md#clearFileItemPermissions) | **DELETE** /files/v2/pems/system/{systemId}/{filePath} | 
[**deleteFileItem**](FilesApi.md#deleteFileItem) | **DELETE** /files/v2/media/system/{systemId}/{filePath} | 
[**deleteFileItemOnDefaultSystem**](FilesApi.md#deleteFileItemOnDefaultSystem) | **DELETE** /files/v2/media/{filePath} | 
[**downloadFileItem**](FilesApi.md#downloadFileItem) | **GET** /files/v2/media/system/{systemId}/{filePath} | 
[**downloadFileItemOnDefaultSystem**](FilesApi.md#downloadFileItemOnDefaultSystem) | **GET** /files/v2/media/{filePath} | 
[**importFileItem**](FilesApi.md#importFileItem) | **POST** /files/v2/media/system/{systemId}/{filePath} | 
[**importFileItemToDefaultSystem**](FilesApi.md#importFileItemToDefaultSystem) | **POST** /files/v2/media/{filePath} | 
[**invokeFileActionOnDefaultSystem**](FilesApi.md#invokeFileActionOnDefaultSystem) | **PUT** /files/v2/media/{filePath} | 
[**invokeFileItemAction**](FilesApi.md#invokeFileItemAction) | **PUT** /files/v2/media/system/{systemId}/{filePath} | 
[**listFileItemHistory**](FilesApi.md#listFileItemHistory) | **GET** /files/v2/history/system/{systemId}/{filePath} | 
[**listFileItemHistoryOnDefaultSystem**](FilesApi.md#listFileItemHistoryOnDefaultSystem) | **GET** /files/v2/history/{filePath} | 
[**listFileItemPermissions**](FilesApi.md#listFileItemPermissions) | **GET** /files/v2/pems/system/{systemId}/{filePath} | 
[**listFileItemPermissionsOnDefaultSystem**](FilesApi.md#listFileItemPermissionsOnDefaultSystem) | **GET** /files/v2/pems/{filePath} | 
[**listFileItems**](FilesApi.md#listFileItems) | **GET** /files/v2/listings/system/{systemId}/{filePath} | 
[**listFileItemsOnDefaultSystem**](FilesApi.md#listFileItemsOnDefaultSystem) | **GET** /files/v2/listings/{filepath} | 
[**updateFileItemPermission**](FilesApi.md#updateFileItemPermission) | **POST** /files/v2/pems/system/{systemId}/{filePath} | 
[**updateFileItemPermissionsOnDefaultSystem**](FilesApi.md#updateFileItemPermissionsOnDefaultSystem) | **POST** /files/v2/pems/{filePath} | 


<a name="clearFileItemPermissions"></a>
# **clearFileItemPermissions**
> clearFileItemPermissions(filePath, systemId, naked)



Deletes all permissions on a file except those of the owner.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
String systemId = "systemId_example"; // String | The id of the system on which the file item lives.
Boolean naked = true; // Boolean | 
try {
    apiInstance.clearFileItemPermissions(filePath, systemId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#clearFileItemPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **systemId** | **String**| The id of the system on which the file item lives. |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFileItem"></a>
# **deleteFileItem**
> deleteFileItem(systemId, filePath, naked)



Deletes a file or folder at the specified path on the specified remote system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String systemId = "systemId_example"; // String | The unique id of the system on which the data resides.
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
String naked = "true"; // String | If true, the response wrapper is stripped and the raw object is returned
try {
    apiInstance.deleteFileItem(systemId, filePath, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#deleteFileItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The unique id of the system on which the data resides. |
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **naked** | **String**| If true, the response wrapper is stripped and the raw object is returned | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteFileItemOnDefaultSystem"></a>
# **deleteFileItemOnDefaultSystem**
> deleteFileItemOnDefaultSystem(filePath, naked)



Deletes a file or folder on default storage system of the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteFileItemOnDefaultSystem(filePath, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#deleteFileItemOnDefaultSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadFileItem"></a>
# **downloadFileItem**
> downloadFileItem(systemId, filePath, force)



Download a file from the given system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String systemId = "systemId_example"; // String | The unique id of the system on which the data resides.
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
Boolean force = false; // Boolean | Boolean flag to indicate whether the Content-Disposition header should be set to force a browser download.
try {
    apiInstance.downloadFileItem(systemId, filePath, force);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#downloadFileItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The unique id of the system on which the data resides. |
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **force** | **Boolean**| Boolean flag to indicate whether the Content-Disposition header should be set to force a browser download. | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="downloadFileItemOnDefaultSystem"></a>
# **downloadFileItemOnDefaultSystem**
> downloadFileItemOnDefaultSystem(filePath, force)



Download a file from the default storage location of the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user
Boolean force = false; // Boolean | Boolean flag to indicate whether the Content-Disposition header should be set to force browser file download.
try {
    apiInstance.downloadFileItemOnDefaultSystem(filePath, force);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#downloadFileItemOnDefaultSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The path of the file relative to the default storage location of the user |
 **force** | **Boolean**| Boolean flag to indicate whether the Content-Disposition header should be set to force browser file download. | [optional] [default to false]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/octet-stream

<a name="importFileItem"></a>
# **importFileItem**
> FileInfo importFileItem(systemId, filePath, body, naked)



Import file item from a remote URL to the target system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String systemId = "systemId_example"; // String | The id of the system.
String filePath = "filePath_example"; // String | The relative or absolute path where the file item should be imported
FileImportRequest body = new FileImportRequest(); // FileImportRequest | The import request
Boolean naked = true; // Boolean | 
try {
    FileInfo result = apiInstance.importFileItem(systemId, filePath, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#importFileItem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **filePath** | **String**| The relative or absolute path where the file item should be imported |
 **body** | [**FileImportRequest**](FileImportRequest.md)| The import request |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**FileInfo**](FileInfo.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="importFileItemToDefaultSystem"></a>
# **importFileItemToDefaultSystem**
> FileInfo importFileItemToDefaultSystem(filePath, body, naked)



Import file item from a remote URL to the target system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The relative or absolute path where the file item should be imported
FileImportRequest body = new FileImportRequest(); // FileImportRequest | The import request
String naked = "true"; // String | If true, the response wrapper is stripped and the raw object is returned
try {
    FileInfo result = apiInstance.importFileItemToDefaultSystem(filePath, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#importFileItemToDefaultSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The relative or absolute path where the file item should be imported |
 **body** | [**FileImportRequest**](FileImportRequest.md)| The import request |
 **naked** | **String**| If true, the response wrapper is stripped and the raw object is returned | [optional] [default to true]

### Return type

[**FileInfo**](FileInfo.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invokeFileActionOnDefaultSystem"></a>
# **invokeFileActionOnDefaultSystem**
> Object invokeFileActionOnDefaultSystem(filePath, body, naked)



Perform an action on a file or folder.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
FileAction body = new FileAction(); // FileAction | The operation to perform
String naked = "true"; // String | If true, the response wrapper is stripped and the raw object is returned
try {
    Object result = apiInstance.invokeFileActionOnDefaultSystem(filePath, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#invokeFileActionOnDefaultSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **body** | [**FileAction**](FileAction.md)| The operation to perform |
 **naked** | **String**| If true, the response wrapper is stripped and the raw object is returned | [optional] [default to true]

### Return type

**Object**

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invokeFileItemAction"></a>
# **invokeFileItemAction**
> Object invokeFileItemAction(systemId, filePath, body, naked)



Perform an action on a file or folder.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String systemId = "systemId_example"; // String | The unique id of the system on which the data resides.
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
FileAction body = new FileAction(); // FileAction | The operation to perform. 
Boolean naked = true; // Boolean | 
try {
    Object result = apiInstance.invokeFileItemAction(systemId, filePath, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#invokeFileItemAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The unique id of the system on which the data resides. |
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **body** | [**FileAction**](FileAction.md)| The operation to perform.  |
 **naked** | **Boolean**|  | [default to true]

### Return type

**Object**

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFileItemHistory"></a>
# **listFileItemHistory**
> HistoryEvent listFileItemHistory(filePath, systemId, status, created, filter, naked, limit, offset)



Download a file from the default storage location of the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The path of the file relative to the given system root location.
String systemId = "systemId_example"; // String | The system on which the file item resides
String status = "status_example"; // String | The status of the event
String created = "created_example"; // String | The date the event occurred
String filter = "*"; // String | A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects
String naked = "true"; // String | If true, the response wrapper is stripped and the raw object is returned
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    HistoryEvent result = apiInstance.listFileItemHistory(filePath, systemId, status, created, filter, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#listFileItemHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The path of the file relative to the given system root location. |
 **systemId** | **String**| The system on which the file item resides |
 **status** | **String**| The status of the event | [optional]
 **created** | **String**| The date the event occurred | [optional]
 **filter** | **String**| A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects | [optional] [default to *]
 **naked** | **String**| If true, the response wrapper is stripped and the raw object is returned | [optional] [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**HistoryEvent**](HistoryEvent.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFileItemHistoryOnDefaultSystem"></a>
# **listFileItemHistoryOnDefaultSystem**
> List&lt;HistoryEvent&gt; listFileItemHistoryOnDefaultSystem(filePath, status, created, filter, naked, limit, offset)



List event history of a file item on the default storage system of the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
String status = "status_example"; // String | The event status
String created = "created_example"; // String | The date the event occurred
String filter = "*"; // String | A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects
String naked = "true"; // String | If true, the response wrapper is stripped and the raw object is returned
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<HistoryEvent> result = apiInstance.listFileItemHistoryOnDefaultSystem(filePath, status, created, filter, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#listFileItemHistoryOnDefaultSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **status** | **String**| The event status | [optional]
 **created** | **String**| The date the event occurred | [optional]
 **filter** | **String**| A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects | [optional] [default to *]
 **naked** | **String**| If true, the response wrapper is stripped and the raw object is returned | [optional] [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;HistoryEvent&gt;**](HistoryEvent.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFileItemPermissions"></a>
# **listFileItemPermissions**
> List&lt;FilePermission&gt; listFileItemPermissions(filePath, naked, systemId, limit, offset)



List all the share permissions for a file or folder.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
Boolean naked = true; // Boolean | 
String systemId = "systemId_example"; // String | The system id
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<FilePermission> result = apiInstance.listFileItemPermissions(filePath, naked, systemId, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#listFileItemPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **naked** | **Boolean**|  | [default to true]
 **systemId** | **String**| The system id |
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;FilePermission&gt;**](FilePermission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFileItemPermissionsOnDefaultSystem"></a>
# **listFileItemPermissionsOnDefaultSystem**
> List&lt;FilePermission&gt; listFileItemPermissionsOnDefaultSystem(filePath, naked, limit, offset)



List all the share permissions for a file or folder.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<FilePermission> result = apiInstance.listFileItemPermissionsOnDefaultSystem(filePath, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#listFileItemPermissionsOnDefaultSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;FilePermission&gt;**](FilePermission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listFileItems"></a>
# **listFileItems**
> List&lt;FileInfo&gt; listFileItems(systemId, filePath, naked, limit, offset)



Get a remote directory listing on a specific system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String systemId = "systemId_example"; // String | The unique id of the system on which the data resides.
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<FileInfo> result = apiInstance.listFileItems(systemId, filePath, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#listFileItems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The unique id of the system on which the data resides. |
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
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

<a name="listFileItemsOnDefaultSystem"></a>
# **listFileItemsOnDefaultSystem**
> List&lt;FileInfo&gt; listFileItemsOnDefaultSystem(filepath, filter, naked, limit, offset)



Get a remote directory listing on the default storage system of the user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filepath = "filepath_example"; // String | The path of the file relative to the default storage location of the user
String filter = "*"; // String | A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects
String naked = "true"; // String | If true, the response wrapper is stripped and the raw object is returned
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<FileInfo> result = apiInstance.listFileItemsOnDefaultSystem(filepath, filter, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#listFileItemsOnDefaultSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filepath** | **String**| The path of the file relative to the default storage location of the user |
 **filter** | **String**| A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects | [optional] [default to *]
 **naked** | **String**| If true, the response wrapper is stripped and the raw object is returned | [optional] [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;FileInfo&gt;**](FileInfo.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFileItemPermission"></a>
# **updateFileItemPermission**
> FilePermission updateFileItemPermission(filePath, systemId, body, naked)



Update permissions for a single user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
String systemId = "systemId_example"; // String | The id of the system on which the file resides
PermissionRequest body = new PermissionRequest(); // PermissionRequest | The updated permission value
Boolean naked = true; // Boolean | 
try {
    FilePermission result = apiInstance.updateFileItemPermission(filePath, systemId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#updateFileItemPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **systemId** | **String**| The id of the system on which the file resides |
 **body** | [**PermissionRequest**](PermissionRequest.md)| The updated permission value |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**FilePermission**](FilePermission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateFileItemPermissionsOnDefaultSystem"></a>
# **updateFileItemPermissionsOnDefaultSystem**
> FilePermission updateFileItemPermissionsOnDefaultSystem(filePath, body, filePath2)



Update permissions for a single user on their default storage system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.FilesApi;

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

FilesApi apiInstance = new FilesApi();
String filePath = "filePath_example"; // String | The path of the file relative to the default storage location of the user.
FilePermissionRequest body = new FilePermissionRequest(); // FilePermissionRequest | The permission add or update. 
Boolean filePath2 = true; // Boolean | 
try {
    FilePermission result = apiInstance.updateFileItemPermissionsOnDefaultSystem(filePath, body, filePath2);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FilesApi#updateFileItemPermissionsOnDefaultSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filePath** | **String**| The path of the file relative to the default storage location of the user. |
 **body** | [**FilePermissionRequest**](FilePermissionRequest.md)| The permission add or update.  |
 **filePath2** | **Boolean**|  | [default to true]

### Return type

[**FilePermission**](FilePermission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

