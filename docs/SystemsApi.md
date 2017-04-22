# SystemsApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addExecutionSystem**](SystemsApi.md#addExecutionSystem) | **POST** /systems/v2/ | 
[**addStorageSystem**](SystemsApi.md#addStorageSystem) | **POST** /systems/v2 | 
[**addSystemCredential**](SystemsApi.md#addSystemCredential) | **POST** /systems/v2/{systemId}/credentials | 
[**addSystemRole**](SystemsApi.md#addSystemRole) | **POST** /systems/{systemId}/roles | 
[**clearSystemAuthCredentials**](SystemsApi.md#clearSystemAuthCredentials) | **DELETE** /systems/v2/{systemId}/credentials | 
[**clearSystemAuthCredentialsForInternalUser**](SystemsApi.md#clearSystemAuthCredentialsForInternalUser) | **DELETE** /systems/v2/{systemId}/credentials/{internalUsername} | 
[**clearSystemRoles**](SystemsApi.md#clearSystemRoles) | **DELETE** /systems/v2/{systemId}/roles | 
[**deleteSystem**](SystemsApi.md#deleteSystem) | **DELETE** /systems/v2/{systemId} | 
[**deleteSystemAuthCredentialForInternalUser**](SystemsApi.md#deleteSystemAuthCredentialForInternalUser) | **DELETE** /systems/v2/{systemId}/credentials/{internalUsername}/{credentialType} | 
[**deleteSystemRole**](SystemsApi.md#deleteSystemRole) | **DELETE** /systems/v2/{systemId}/roles/{username} | 
[**getSystemCredential**](SystemsApi.md#getSystemCredential) | **GET** /systems/v2/{systemId}/credentials/{internalUsername}/{credentialType} | 
[**getSystemDetails**](SystemsApi.md#getSystemDetails) | **GET** /systems/v2/{systemId} | 
[**getSystemRole**](SystemsApi.md#getSystemRole) | **GET** /systems/v2/{systemId}/roles/{username} | 
[**invokeSystemAction**](SystemsApi.md#invokeSystemAction) | **PUT** /systems/v2/{systemId} | 
[**listCredentialsForInternalUser**](SystemsApi.md#listCredentialsForInternalUser) | **GET** /systems/v2/{systemId}/credentials/{internalUsername} | 
[**listSystemCredentials**](SystemsApi.md#listSystemCredentials) | **GET** /systems/v2/{systemId}/credentials | 
[**listSystemRoles**](SystemsApi.md#listSystemRoles) | **GET** /systems/v2/{systemId}/roles | 
[**listSystems**](SystemsApi.md#listSystems) | **GET** /systems/v2/ | 
[**updateSystem**](SystemsApi.md#updateSystem) | **POST** /systems/v2/{systemId} | 
[**updateSystemCredential**](SystemsApi.md#updateSystemCredential) | **POST** /systems/v2/{systemId}/credentials/{internalUsername} | 
[**updateSystemCredentialOfType**](SystemsApi.md#updateSystemCredentialOfType) | **POST** /systems/v2/{systemId}/credentials/{internalUsername}/{credentialType} | 
[**updateSystemRole**](SystemsApi.md#updateSystemRole) | **POST** /systems/v2/{systemId}/roles/{username} | 


<a name="addExecutionSystem"></a>
# **addExecutionSystem**
> ExecutionSystem addExecutionSystem(body, naked)



Add a new execution system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
SystemRequest body = new SystemRequest(); // SystemRequest | The description of the system to add or update.
Boolean naked = true; // Boolean | 
try {
    ExecutionSystem result = apiInstance.addExecutionSystem(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#addExecutionSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SystemRequest**](SystemRequest.md)| The description of the system to add or update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**ExecutionSystem**](ExecutionSystem.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addStorageSystem"></a>
# **addStorageSystem**
> StorageSystem addStorageSystem(body, naked)



Add  a storage system

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
SystemRequest body = new SystemRequest(); // SystemRequest | Description of a storage system
Boolean naked = true; // Boolean | 
try {
    StorageSystem result = apiInstance.addStorageSystem(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#addStorageSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SystemRequest**](SystemRequest.md)| Description of a storage system |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**StorageSystem**](StorageSystem.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSystemCredential"></a>
# **addSystemCredential**
> List&lt;SystemCredential&gt; addSystemCredential(systemId, body, naked)



Add an internal user&#39;s credential on a system. This applies both to storage and, if applicable, login credentials.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
SystemCredential body = new SystemCredential(); // SystemCredential | The description of the internal user credential to add or update.
Boolean naked = true; // Boolean | 
try {
    List<SystemCredential> result = apiInstance.addSystemCredential(systemId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#addSystemCredential");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **body** | [**SystemCredential**](SystemCredential.md)| The description of the internal user credential to add or update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**List&lt;SystemCredential&gt;**](SystemCredential.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addSystemRole"></a>
# **addSystemRole**
> SystemRole addSystemRole(systemId, body, naked)



Adds a role on the system for the given user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system on which to grant the role
SystemRoleRequest body = new SystemRoleRequest(); // SystemRoleRequest | The new role to grant
Boolean naked = true; // Boolean | 
try {
    SystemRole result = apiInstance.addSystemRole(systemId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#addSystemRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system on which to grant the role |
 **body** | [**SystemRoleRequest**](SystemRoleRequest.md)| The new role to grant |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**SystemRole**](SystemRole.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearSystemAuthCredentials"></a>
# **clearSystemAuthCredentials**
> clearSystemAuthCredentials(systemId, naked)



Deletes all credentials registered to a system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
Boolean naked = true; // Boolean | 
try {
    apiInstance.clearSystemAuthCredentials(systemId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#clearSystemAuthCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearSystemAuthCredentialsForInternalUser"></a>
# **clearSystemAuthCredentialsForInternalUser**
> clearSystemAuthCredentialsForInternalUser(systemId, internalUsername, naked)



Deletes all internal user credentials registered to a system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
String internalUsername = "internalUsername_example"; // String | The username of a internal user on this system.
Boolean naked = true; // Boolean | 
try {
    apiInstance.clearSystemAuthCredentialsForInternalUser(systemId, internalUsername, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#clearSystemAuthCredentialsForInternalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **internalUsername** | **String**| The username of a internal user on this system. |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearSystemRoles"></a>
# **clearSystemRoles**
> clearSystemRoles(systemId, naked)



Deletes all roles on a system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
Boolean naked = true; // Boolean | 
try {
    apiInstance.clearSystemRoles(systemId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#clearSystemRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSystem"></a>
# **deleteSystem**
> deleteSystem(systemId, naked)



Delete a system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The unique id of the system
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteSystem(systemId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#deleteSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The unique id of the system |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSystemAuthCredentialForInternalUser"></a>
# **deleteSystemAuthCredentialForInternalUser**
> deleteSystemAuthCredentialForInternalUser(systemId, internalUsername, credentialType, naked)



Deletes the internal user credentials for the given credential type on a system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
String internalUsername = "internalUsername_example"; // String | The username of a internal user on this system.
String credentialType = "credentialType_example"; // String | The configuration type to which to apply this credential.
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteSystemAuthCredentialForInternalUser(systemId, internalUsername, credentialType, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#deleteSystemAuthCredentialForInternalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **internalUsername** | **String**| The username of a internal user on this system. |
 **credentialType** | **String**| The configuration type to which to apply this credential. | [enum: LOGIN, STORAGE]
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteSystemRole"></a>
# **deleteSystemRole**
> deleteSystemRole(systemId, username, naked)



Deletes all roles for a user on a system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
String username = "username_example"; // String | The username of the api user associated with the role
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteSystemRole(systemId, username, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#deleteSystemRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **username** | **String**| The username of the api user associated with the role |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSystemCredential"></a>
# **getSystemCredential**
> SystemCredential getSystemCredential(systemId, internalUsername, credentialType, naked)



Get the internal user credential of the given type on the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
String internalUsername = "internalUsername_example"; // String | The username of a internal user on this system.
String credentialType = "credentialType_example"; // String | The configuration type to which to apply this credential.
Boolean naked = true; // Boolean | 
try {
    SystemCredential result = apiInstance.getSystemCredential(systemId, internalUsername, credentialType, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#getSystemCredential");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **internalUsername** | **String**| The username of a internal user on this system. |
 **credentialType** | **String**| The configuration type to which to apply this credential. | [enum: LOGIN, STORAGE]
 **naked** | **Boolean**|  | [default to true]

### Return type

[**SystemCredential**](SystemCredential.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSystemDetails"></a>
# **getSystemDetails**
> System getSystemDetails(systemId, naked)



Find information about an individual system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The unique id of the system
Boolean naked = true; // Boolean | 
try {
    System result = apiInstance.getSystemDetails(systemId, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#getSystemDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The unique id of the system |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**System**](System.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getSystemRole"></a>
# **getSystemRole**
> SystemRole getSystemRole(systemId, username, naked)



Get a specific user role on this system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
String username = "username_example"; // String | The username of the user about whose role you are inquiring.
Boolean naked = true; // Boolean | 
try {
    SystemRole result = apiInstance.getSystemRole(systemId, username, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#getSystemRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **username** | **String**| The username of the user about whose role you are inquiring. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**SystemRole**](SystemRole.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="invokeSystemAction"></a>
# **invokeSystemAction**
> invokeSystemAction(systemId, body, naked)



Perform a management action on the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system receiving the action
SystemAction body = new SystemAction(); // SystemAction | The action to invoke
Boolean naked = true; // Boolean | 
try {
    apiInstance.invokeSystemAction(systemId, body, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#invokeSystemAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system receiving the action |
 **body** | [**SystemAction**](SystemAction.md)| The action to invoke |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listCredentialsForInternalUser"></a>
# **listCredentialsForInternalUser**
> SystemCredentialsResponse listCredentialsForInternalUser(systemId, internalUsername)



Get a list of all internal users and their credentials on this system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
String internalUsername = "internalUsername_example"; // String | The username of a internal user on this system.
try {
    SystemCredentialsResponse result = apiInstance.listCredentialsForInternalUser(systemId, internalUsername);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#listCredentialsForInternalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **internalUsername** | **String**| The username of a internal user on this system. |

### Return type

[**SystemCredentialsResponse**](SystemCredentialsResponse.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSystemCredentials"></a>
# **listSystemCredentials**
> List&lt;SystemCredential&gt; listSystemCredentials(systemId, naked, limit, offset)



Get a list of all internal user credentials on this system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<SystemCredential> result = apiInstance.listSystemCredentials(systemId, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#listSystemCredentials");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;SystemCredential&gt;**](SystemCredential.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSystemRoles"></a>
# **listSystemRoles**
> MultipleSystemRoleResponse listSystemRoles(systemId, naked, limit, offset)



Get a list of all users and their roles on this system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    MultipleSystemRoleResponse result = apiInstance.listSystemRoles(systemId, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#listSystemRoles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**MultipleSystemRoleResponse**](MultipleSystemRoleResponse.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listSystems"></a>
# **listSystems**
> List&lt;SystemSummary&gt; listSystems(naked, offset, type, _default, _public, limit)



Show all systems available to the user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
Boolean naked = true; // Boolean | 
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
String type = "type_example"; // String | The type of system to return
Boolean _default = true; // Boolean | If true, only default systems be returned
Boolean _public = true; // Boolean | If true, only public systems will be returned. If false, no public systems will be returned. If null, both public and private systems will be returned.
Long limit = 100L; // Long | The maximum number of results returned from this query
try {
    List<SystemSummary> result = apiInstance.listSystems(naked, offset, type, _default, _public, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#listSystems");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **naked** | **Boolean**|  | [default to true]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [default to 0]
 **type** | **String**| The type of system to return | [optional] [enum: STORAGE, EXECUTION]
 **_default** | **Boolean**| If true, only default systems be returned | [optional]
 **_public** | **Boolean**| If true, only public systems will be returned. If false, no public systems will be returned. If null, both public and private systems will be returned. | [optional]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]

### Return type

[**List&lt;SystemSummary&gt;**](SystemSummary.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSystem"></a>
# **updateSystem**
> System updateSystem(systemId, body, naked)



Update a system description

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The unique id of the system
SystemRequest body = new SystemRequest(); // SystemRequest | The description of the system to update.
Boolean naked = true; // Boolean | 
try {
    System result = apiInstance.updateSystem(systemId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#updateSystem");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The unique id of the system |
 **body** | [**SystemRequest**](SystemRequest.md)| The description of the system to update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**System**](System.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSystemCredential"></a>
# **updateSystemCredential**
> SystemCredential updateSystemCredential(systemId, internalUsername, body, naked)



Update an internal user credential on a system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
String internalUsername = "internalUsername_example"; // String | The username of a internal user on this system.
SystemAuthConfig body = new SystemAuthConfig(); // SystemAuthConfig | The description of the internal user credential to add or update.
Boolean naked = true; // Boolean | 
try {
    SystemCredential result = apiInstance.updateSystemCredential(systemId, internalUsername, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#updateSystemCredential");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **internalUsername** | **String**| The username of a internal user on this system. |
 **body** | [**SystemAuthConfig**](SystemAuthConfig.md)| The description of the internal user credential to add or update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**SystemCredential**](SystemCredential.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSystemCredentialOfType"></a>
# **updateSystemCredentialOfType**
> SystemCredential updateSystemCredentialOfType(systemId, internalUsername, credentialType, body, naked)



Add or update a credential of the given type on a system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
String internalUsername = "internalUsername_example"; // String | The username of a internal user on this system.
String credentialType = "credentialType_example"; // String | The configuration type to which to apply this credential.
SystemAuthConfig body = new SystemAuthConfig(); // SystemAuthConfig | The description of the internal user credential to add or update.
Boolean naked = true; // Boolean | 
try {
    SystemCredential result = apiInstance.updateSystemCredentialOfType(systemId, internalUsername, credentialType, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#updateSystemCredentialOfType");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **internalUsername** | **String**| The username of a internal user on this system. |
 **credentialType** | **String**| The configuration type to which to apply this credential. | [enum: LOGIN, STORAGE]
 **body** | [**SystemAuthConfig**](SystemAuthConfig.md)| The description of the internal user credential to add or update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**SystemCredential**](SystemCredential.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateSystemRole"></a>
# **updateSystemRole**
> SystemRole updateSystemRole(systemId, username, body, naked)



Update a user role on a system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.SystemsApi;

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

SystemsApi apiInstance = new SystemsApi();
String systemId = "systemId_example"; // String | The id of the system.
String username = "username_example"; // String | The username of the api user associated with the role
SystemRoleRequest body = new SystemRoleRequest(); // SystemRoleRequest | The role to update.
Boolean naked = true; // Boolean | 
try {
    SystemRole result = apiInstance.updateSystemRole(systemId, username, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SystemsApi#updateSystemRole");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **systemId** | **String**| The id of the system. |
 **username** | **String**| The username of the api user associated with the role |
 **body** | [**SystemRoleRequest**](SystemRoleRequest.md)| The role to update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**SystemRole**](SystemRole.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

