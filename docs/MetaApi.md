# MetaApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addMetadata**](MetaApi.md#addMetadata) | **POST** /meta/v2/data | 
[**addMetadataPermission**](MetaApi.md#addMetadataPermission) | **POST** /meta/v2/data/{uuid}/pems | 
[**addMetadataSchema**](MetaApi.md#addMetadataSchema) | **POST** /meta/v2/schemas | 
[**addMetadataSchemaPermission**](MetaApi.md#addMetadataSchemaPermission) | **POST** /meta/v2/schemas/{uuid}/pems | 
[**clearMetadataPermissions**](MetaApi.md#clearMetadataPermissions) | **DELETE** /meta/v2/data/{uuid}/pems | 
[**clearMetadataSchemaPermissions**](MetaApi.md#clearMetadataSchemaPermissions) | **DELETE** /meta/v2/schemas/{uuid}/pems | 
[**deleteMetadata**](MetaApi.md#deleteMetadata) | **DELETE** /meta/v2/data/{uuid} | 
[**deleteMetadataPermission**](MetaApi.md#deleteMetadataPermission) | **DELETE** /meta/v2/data/{uuid}/pems/{username} | 
[**deleteMetadataSchema**](MetaApi.md#deleteMetadataSchema) | **DELETE** /meta/v2/schemas/{uuid} | 
[**deleteSchemaPermission**](MetaApi.md#deleteSchemaPermission) | **DELETE** /meta/v2/schemas/{uuid}/pems/{username} | 
[**getMetadata**](MetaApi.md#getMetadata) | **GET** /meta/v2/data/{uuid} | 
[**getMetadataPermission**](MetaApi.md#getMetadataPermission) | **GET** /meta/v2/data/{uuid}/pems/{username} | 
[**getMetadataSchema**](MetaApi.md#getMetadataSchema) | **GET** /meta/v2/schemas/{uuid} | 
[**getMetadataSchemaPermission**](MetaApi.md#getMetadataSchemaPermission) | **GET** /meta/v2/schemas/{uuid}/pems/{username} | 
[**listMetadata**](MetaApi.md#listMetadata) | **GET** /meta/v2/data | 
[**listMetadataPermissions**](MetaApi.md#listMetadataPermissions) | **GET** /meta/v2/data/{uuid}/pems | 
[**listMetadataSchema**](MetaApi.md#listMetadataSchema) | **GET** /meta/v2/schemas | 
[**listMetadataSchemaPermissions**](MetaApi.md#listMetadataSchemaPermissions) | **GET** /meta/v2/schemas/{uuid}/pems | 
[**updateMetadata**](MetaApi.md#updateMetadata) | **POST** /meta/v2/data/{uuid} | 
[**updateMetadataPermission**](MetaApi.md#updateMetadataPermission) | **POST** /meta/v2/data/{uuid}/pems/{username} | 
[**updateMetadataSchema**](MetaApi.md#updateMetadataSchema) | **POST** /meta/v2/schemas/{uuid} | 
[**updateMetadataSchemaPermission**](MetaApi.md#updateMetadataSchemaPermission) | **POST** /meta/v2/schemas/{uuid}/pems/{username} | 


<a name="addMetadata"></a>
# **addMetadata**
> Metadata addMetadata(body, naked)



Update or Add new Metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
Metadata body = new Metadata(); // Metadata | The metadata to add.
Boolean naked = true; // Boolean | 
try {
    Metadata result = apiInstance.addMetadata(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#addMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Metadata**](Metadata.md)| The metadata to add. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Metadata**](Metadata.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addMetadataPermission"></a>
# **addMetadataPermission**
> Permission addMetadataPermission(uuid, body, naked)



Add a user permission for the given metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata item
Permission body = new Permission(); // Permission | The metadata permission to update.
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.addMetadataPermission(uuid, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#addMetadataPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata item |
 **body** | [**Permission**](Permission.md)| The metadata permission to update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addMetadataSchema"></a>
# **addMetadataSchema**
> MetadataSchema addMetadataSchema(body, naked)



Add a new Metadata Schema.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
MetadataSchema body = new MetadataSchema(); // MetadataSchema | A valid JSON Schema object
Boolean naked = true; // Boolean | 
try {
    MetadataSchema result = apiInstance.addMetadataSchema(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#addMetadataSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MetadataSchema**](MetadataSchema.md)| A valid JSON Schema object |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**MetadataSchema**](MetadataSchema.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addMetadataSchemaPermission"></a>
# **addMetadataSchemaPermission**
> Permission addMetadataSchemaPermission(uuid, body, naked)



Add a user permission for the given schema.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata schema item
Permission body = new Permission(); // Permission | The schema permission to update.
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.addMetadataSchemaPermission(uuid, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#addMetadataSchemaPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata schema item |
 **body** | [**Permission**](Permission.md)| The schema permission to update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearMetadataPermissions"></a>
# **clearMetadataPermissions**
> clearMetadataPermissions(uuid, naked)



Deletes all permissions on the given metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata item
Boolean naked = true; // Boolean | 
try {
    apiInstance.clearMetadataPermissions(uuid, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#clearMetadataPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata item |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearMetadataSchemaPermissions"></a>
# **clearMetadataSchemaPermissions**
> clearMetadataSchemaPermissions(uuid, naked)



Deletes all permissions on the given schema.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata schema item
Boolean naked = true; // Boolean | 
try {
    apiInstance.clearMetadataSchemaPermissions(uuid, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#clearMetadataSchemaPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata schema item |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMetadata"></a>
# **deleteMetadata**
> deleteMetadata(uuid, naked)



Remove Metadata from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata item
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteMetadata(uuid, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#deleteMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata item |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMetadataPermission"></a>
# **deleteMetadataPermission**
> deleteMetadataPermission(uuid, username, naked)



Removes user permissions for a user on a given metadata resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata item
String username = "username_example"; // String | The username of the permission owner
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteMetadataPermission(uuid, username, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#deleteMetadataPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata item |
 **username** | **String**| The username of the permission owner |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteMetadataSchema"></a>
# **deleteMetadataSchema**
> deleteMetadataSchema(uuid, naked)



Remove Metadata Schema from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata schema item
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteMetadataSchema(uuid, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#deleteMetadataSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata schema item |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSchemaPermission"></a>
# **deleteSchemaPermission**
> deleteSchemaPermission(uuid, username, naked)



Deletes all metadata schema permissions on the given metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata schema item
String username = "username_example"; // String | The username of the permission owner
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteSchemaPermission(uuid, username, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#deleteSchemaPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata schema item |
 **username** | **String**| The username of the permission owner |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMetadata"></a>
# **getMetadata**
> Metadata getMetadata(uuid, naked)



Retrieve Metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata item
Boolean naked = true; // Boolean | 
try {
    Metadata result = apiInstance.getMetadata(uuid, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata item |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Metadata**](Metadata.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMetadataPermission"></a>
# **getMetadataPermission**
> Permission getMetadataPermission(uuid, username, naked)



Get the user permission for this metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata item
String username = "username_example"; // String | The username of the permission owner
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.getMetadataPermission(uuid, username, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getMetadataPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata item |
 **username** | **String**| The username of the permission owner |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMetadataSchema"></a>
# **getMetadataSchema**
> MetadataSchema getMetadataSchema(uuid, naked)



Retrieve Metadata Schemata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata schema item
Boolean naked = true; // Boolean | 
try {
    MetadataSchema result = apiInstance.getMetadataSchema(uuid, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getMetadataSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata schema item |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**MetadataSchema**](MetadataSchema.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getMetadataSchemaPermission"></a>
# **getMetadataSchemaPermission**
> Permission getMetadataSchemaPermission(uuid, username, naked)



Get the user permission for this schema.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata schema item
String username = "username_example"; // String | The username of the permission owner
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.getMetadataSchemaPermission(uuid, username, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#getMetadataSchemaPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata schema item |
 **username** | **String**| The username of the permission owner |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMetadata"></a>
# **listMetadata**
> List&lt;Metadata&gt; listMetadata(q, naked, limit, offset)



List and/or search metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String q = "q_example"; // String | The query to perform. Traditional MongoDB queries are supported
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<Metadata> result = apiInstance.listMetadata(q, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#listMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| The query to perform. Traditional MongoDB queries are supported |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;Metadata&gt;**](Metadata.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMetadataPermissions"></a>
# **listMetadataPermissions**
> Permission listMetadataPermissions(uuid, naked, limit, offset)



Get the permission ACL for this metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata item
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    Permission result = apiInstance.listMetadataPermissions(uuid, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#listMetadataPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata item |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMetadataSchema"></a>
# **listMetadataSchema**
> List&lt;MetadataSchema&gt; listMetadataSchema(q, naked, limit, offset)



List and query Metadata Schemata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String q = "q_example"; // String | A valid query object defining the search parameters.
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<MetadataSchema> result = apiInstance.listMetadataSchema(q, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#listMetadataSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| A valid query object defining the search parameters. |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;MetadataSchema&gt;**](MetadataSchema.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listMetadataSchemaPermissions"></a>
# **listMetadataSchemaPermissions**
> List&lt;Permission&gt; listMetadataSchemaPermissions(uuid, naked, limit, offset)



Get the permission for this schema.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata schema item
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<Permission> result = apiInstance.listMetadataSchemaPermissions(uuid, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#listMetadataSchemaPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata schema item |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMetadata"></a>
# **updateMetadata**
> Metadata updateMetadata(uuid, body, naked)



Update or Add new Metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata item
Metadata body = new Metadata(); // Metadata | The metadata to update.
Boolean naked = true; // Boolean | 
try {
    Metadata result = apiInstance.updateMetadata(uuid, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#updateMetadata");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata item |
 **body** | [**Metadata**](Metadata.md)| The metadata to update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Metadata**](Metadata.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMetadataPermission"></a>
# **updateMetadataPermission**
> Permission updateMetadataPermission(uuid, username, body, naked)



Update a user permission for the given metadata.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata item
String username = "username_example"; // String | The username of the permission owner
Permission body = new Permission(); // Permission | The metadata permission to update.
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.updateMetadataPermission(uuid, username, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#updateMetadataPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata item |
 **username** | **String**| The username of the permission owner |
 **body** | [**Permission**](Permission.md)| The metadata permission to update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMetadataSchema"></a>
# **updateMetadataSchema**
> MetadataSchema updateMetadataSchema(uuid, body, naked)



Update an existing Metadata Schema.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata schema item
Permission body = new Permission(); // Permission | A valid JSON Schema object
Boolean naked = true; // Boolean | 
try {
    MetadataSchema result = apiInstance.updateMetadataSchema(uuid, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#updateMetadataSchema");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata schema item |
 **body** | [**Permission**](Permission.md)| A valid JSON Schema object |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**MetadataSchema**](MetadataSchema.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateMetadataSchemaPermission"></a>
# **updateMetadataSchemaPermission**
> Permission updateMetadataSchemaPermission(uuid, username, body, naked)



Add or update a user permission for the given metadata schema.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.MetaApi;

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

MetaApi apiInstance = new MetaApi();
String uuid = "uuid_example"; // String | The uuid of the metadata schema item
String username = "username_example"; // String | The username of the permission owner
Permission body = new Permission(); // Permission | The schema permission to update.
Boolean naked = true; // Boolean | 
try {
    Permission result = apiInstance.updateMetadataSchemaPermission(uuid, username, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling MetaApi#updateMetadataSchemaPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the metadata schema item |
 **username** | **String**| The username of the permission owner |
 **body** | [**Permission**](Permission.md)| The schema permission to update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

