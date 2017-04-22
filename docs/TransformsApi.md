# TransformsApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asyncTransform**](TransformsApi.md#asyncTransform) | **POST** /transforms/v2/{transformId}/async/{owner}/{filePath} | 
[**getTransform**](TransformsApi.md#getTransform) | **GET** /transforms/v2/{transformId} | 
[**listTransforms**](TransformsApi.md#listTransforms) | **GET** /transforms/v2/ | 
[**syncTransform**](TransformsApi.md#syncTransform) | **POST** /transforms/v2/{transformId}/sync/{owner}/{filePath} | 


<a name="asyncTransform"></a>
# **asyncTransform**
> Transform asyncTransform(transformId, owner, filePath, body, naked)



Transform a file and stage it to a specified location.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransformsApi;

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

TransformsApi apiInstance = new TransformsApi();
String transformId = "transformId_example"; // String | The name of the transform to apply to the given file.
String owner = "owner_example"; // String | The name of the api user owning the file at the given path.
String filePath = "filePath_example"; // String | The path to the file to be transformed and staged
TransformRequest body = new TransformRequest(); // TransformRequest | The transfer request details.
Boolean naked = true; // Boolean | 
try {
    Transform result = apiInstance.asyncTransform(transformId, owner, filePath, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformsApi#asyncTransform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transformId** | **String**| The name of the transform to apply to the given file. |
 **owner** | **String**| The name of the api user owning the file at the given path. |
 **filePath** | **String**| The path to the file to be transformed and staged |
 **body** | [**TransformRequest**](TransformRequest.md)| The transfer request details. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Transform**](Transform.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTransform"></a>
# **getTransform**
> Transform getTransform(transformId, naked)



Find the transform of the given uuid

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransformsApi;

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

TransformsApi apiInstance = new TransformsApi();
String transformId = "transformId_example"; // String | The name of the transform requested.
Boolean naked = true; // Boolean | 
try {
    Transform result = apiInstance.getTransform(transformId, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformsApi#getTransform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transformId** | **String**| The name of the transform requested. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Transform**](Transform.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTransforms"></a>
# **listTransforms**
> List&lt;Transform&gt; listTransforms(naked, name, version, limit, offset, tags)



List and search for transforms

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransformsApi;

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

TransformsApi apiInstance = new TransformsApi();
Boolean naked = true; // Boolean | 
String name = "name_example"; // String | The name of the transform
String version = "version_example"; // String | The name of the transform
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
String tags = "tags_example"; // String | One or more tags of the transform
try {
    List<Transform> result = apiInstance.listTransforms(naked, name, version, limit, offset, tags);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformsApi#listTransforms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **naked** | **Boolean**|  | [default to true]
 **name** | **String**| The name of the transform | [optional]
 **version** | **String**| The name of the transform | [optional]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]
 **tags** | **String**| One or more tags of the transform | [optional]

### Return type

[**List&lt;Transform&gt;**](Transform.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="syncTransform"></a>
# **syncTransform**
> syncTransform(transformId, owner, filePath, body, naked)



Transform a file and download it directly.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TransformsApi;

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

TransformsApi apiInstance = new TransformsApi();
String transformId = "transformId_example"; // String | The name of the transform to apply to the given file.
String owner = "owner_example"; // String | The name of the api user owning the file at the given path.
String filePath = "filePath_example"; // String | The path to the file to be transformed and downloaded.
TransformRequest body = new TransformRequest(); // TransformRequest | The transfer request details.
Boolean naked = true; // Boolean | 
try {
    apiInstance.syncTransform(transformId, owner, filePath, body, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling TransformsApi#syncTransform");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transformId** | **String**| The name of the transform to apply to the given file. |
 **owner** | **String**| The name of the api user owning the file at the given path. |
 **filePath** | **String**| The path to the file to be transformed and downloaded. |
 **body** | [**TransformRequest**](TransformRequest.md)| The transfer request details. |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

