# TenantsApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTenantDetails**](TenantsApi.md#getTenantDetails) | **GET** /tenants/v2/{codeOrUuid} | Resolve Tenant details
[**listTenants**](TenantsApi.md#listTenants) | **GET** /tenants/v2 | List all active tenants


<a name="getTenantDetails"></a>
# **getTenantDetails**
> Tenant getTenantDetails(codeOrUuid, naked, filter)

Resolve Tenant details

Returns information about the tenant with the given code or id

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TenantsApi;

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

TenantsApi apiInstance = new TenantsApi();
String codeOrUuid = "codeOrUuid_example"; // String | Unique tenant code or id of the tenant
Boolean naked = true; // Boolean | If true, the response wrapper is stripped and the raw object is returned.
String filter = "*"; // String | A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects
try {
    Tenant result = apiInstance.getTenantDetails(codeOrUuid, naked, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#getTenantDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **codeOrUuid** | **String**| Unique tenant code or id of the tenant |
 **naked** | **Boolean**| If true, the response wrapper is stripped and the raw object is returned. | [default to true]
 **filter** | **String**| A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects | [optional] [default to *]

### Return type

[**Tenant**](Tenant.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTenants"></a>
# **listTenants**
> List&lt;Tenant&gt; listTenants(naked, filter, limit, offset)

List all active tenants

Lists all active tenants publicly available

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TenantsApi;

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

TenantsApi apiInstance = new TenantsApi();
Boolean naked = true; // Boolean | If true, the response wrapper is stripped and the raw object is returned.
String filter = "*"; // String | A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<Tenant> result = apiInstance.listTenants(naked, filter, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TenantsApi#listTenants");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **naked** | **Boolean**| If true, the response wrapper is stripped and the raw object is returned. | [default to true]
 **filter** | **String**| A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects | [optional] [default to *]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;Tenant&gt;**](Tenant.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

