# PostitsApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addPostit**](PostitsApi.md#addPostit) | **POST** /postits/v2/ | 
[**deletePostit**](PostitsApi.md#deletePostit) | **DELETE** /postits/v2/{nonce} | 
[**listPostits**](PostitsApi.md#listPostits) | **GET** /postits/v2/ | 


<a name="addPostit"></a>
# **addPostit**
> PostIt addPostit(body, naked)



Create a new PostIt

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostitsApi;

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

PostitsApi apiInstance = new PostitsApi();
PostItRequest body = new PostItRequest(); // PostItRequest | The PostIt to create.
Boolean naked = true; // Boolean | 
try {
    PostIt result = apiInstance.addPostit(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostitsApi#addPostit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**PostItRequest**](PostItRequest.md)| The PostIt to create. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**PostIt**](PostIt.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deletePostit"></a>
# **deletePostit**
> deletePostit(nonce, naked)



Immediately invalidates this PostIt URL.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostitsApi;

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

PostitsApi apiInstance = new PostitsApi();
String nonce = "nonce_example"; // String | The nonce of this PostIt URL
Boolean naked = true; // Boolean | 
try {
    apiInstance.deletePostit(nonce, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling PostitsApi#deletePostit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **nonce** | **String**| The nonce of this PostIt URL |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listPostits"></a>
# **listPostits**
> List&lt;PostIt&gt; listPostits(naked, limit, offset)



List existing PostIts

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.PostitsApi;

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

PostitsApi apiInstance = new PostitsApi();
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<PostIt> result = apiInstance.listPostits(naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PostitsApi#listPostits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;PostIt&gt;**](PostIt.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

