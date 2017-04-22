# UuidsApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createUuid**](UuidsApi.md#createUuid) | **POST** /uuids/v2/ | 
[**resolveUuid**](UuidsApi.md#resolveUuid) | **GET** /uuids/v2/{uuid} | 
[**resolveUuids**](UuidsApi.md#resolveUuids) | **GET** /uuids/v2/ | 


<a name="createUuid"></a>
# **createUuid**
> List&lt;UUIDResolution&gt; createUuid(body, naked)



Generate a new UUID for a given resource type

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UuidsApi;

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

UuidsApi apiInstance = new UuidsApi();
UUIDRequest body = new UUIDRequest(); // UUIDRequest | The type of resource for which the UUID should be generated.
Boolean naked = true; // Boolean | 
try {
    List<UUIDResolution> result = apiInstance.createUuid(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UuidsApi#createUuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**UUIDRequest**](UUIDRequest.md)| The type of resource for which the UUID should be generated. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**List&lt;UUIDResolution&gt;**](UUIDResolution.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resolveUuid"></a>
# **resolveUuid**
> List&lt;UUIDResolution&gt; resolveUuid(uuid, naked, expand)



Resolve one or more UUID to their resource URL and type

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UuidsApi;

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

UuidsApi apiInstance = new UuidsApi();
String uuid = "uuid_example"; // String | A valid Agave UUID to resolve
Boolean naked = true; // Boolean | 
Boolean expand = false; // Boolean | If true, the summary object will be expanded to the full resource representation.
try {
    List<UUIDResolution> result = apiInstance.resolveUuid(uuid, naked, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UuidsApi#resolveUuid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| A valid Agave UUID to resolve |
 **naked** | **Boolean**|  | [optional] [default to true]
 **expand** | **Boolean**| If true, the summary object will be expanded to the full resource representation. | [optional] [default to false]

### Return type

[**List&lt;UUIDResolution&gt;**](UUIDResolution.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="resolveUuids"></a>
# **resolveUuids**
> List&lt;UUIDSummary&gt; resolveUuids(naked, uuids, limit, offset, expand)



Resolve one or more UUID to their resource URL and type

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UuidsApi;

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

UuidsApi apiInstance = new UuidsApi();
Boolean naked = true; // Boolean | 
String uuids = "uuids_example"; // String | A comma-separated list of UUID to resolve
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
Boolean expand = false; // Boolean | If true, the summary object will be expanded to the full resource representation.
try {
    List<UUIDSummary> result = apiInstance.resolveUuids(naked, uuids, limit, offset, expand);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UuidsApi#resolveUuids");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **naked** | **Boolean**|  | [default to true]
 **uuids** | **String**| A comma-separated list of UUID to resolve | [optional]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]
 **expand** | **Boolean**| If true, the summary object will be expanded to the full resource representation. | [optional] [default to false]

### Return type

[**List&lt;UUIDSummary&gt;**](UUIDSummary.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

