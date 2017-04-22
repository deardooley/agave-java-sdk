# ProfilesApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addInternalUser**](ProfilesApi.md#addInternalUser) | **POST** /profiles/v2/{apiUsername}/users | 
[**addProfile**](ProfilesApi.md#addProfile) | **POST** /profiles/v2 | 
[**clearInternalUsers**](ProfilesApi.md#clearInternalUsers) | **DELETE** /profiles/v2/{apiUsername}/users | 
[**deleteInternalUser**](ProfilesApi.md#deleteInternalUser) | **DELETE** /profiles/v2/{apiUsername}/users/{internalUsername} | 
[**deleteProfile**](ProfilesApi.md#deleteProfile) | **DELETE** /profiles/v2/{apiUsername} | 
[**getInternalUser**](ProfilesApi.md#getInternalUser) | **GET** /profiles/v2/{apiUsername}/users/{internalUsername} | 
[**getProfile**](ProfilesApi.md#getProfile) | **GET** /profiles/v2/{apiUsername} | 
[**listInternalUsers**](ProfilesApi.md#listInternalUsers) | **GET** /profiles/v2/{apiUsername}/users | 
[**listProfiles**](ProfilesApi.md#listProfiles) | **GET** /profiles/v2 | 
[**updateInternalUser**](ProfilesApi.md#updateInternalUser) | **POST** /profiles/v2/{apiUsername}/users/{internalUsername} | 
[**updateProfile**](ProfilesApi.md#updateProfile) | **POST** /profiles/v2/{apiUsername} | 


<a name="addInternalUser"></a>
# **addInternalUser**
> InternalUser addInternalUser(apiUsername, body, naked)



Create or update an internal user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
String apiUsername = "apiUsername_example"; // String | The username of a valid api user
ProfileRequest body = new ProfileRequest(); // ProfileRequest | The internal user to create.
Boolean naked = true; // Boolean | 
try {
    InternalUser result = apiInstance.addInternalUser(apiUsername, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#addInternalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiUsername** | **String**| The username of a valid api user |
 **body** | [**ProfileRequest**](ProfileRequest.md)| The internal user to create. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**InternalUser**](InternalUser.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addProfile"></a>
# **addProfile**
> Profile addProfile(body, naked)



Add a new user profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
Profile body = new Profile(); // Profile | The user profile to add
Boolean naked = true; // Boolean | 
try {
    Profile result = apiInstance.addProfile(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#addProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Profile**](Profile.md)| The user profile to add |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Profile**](Profile.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearInternalUsers"></a>
# **clearInternalUsers**
> clearInternalUsers(apiUsername, naked)



Delete all internal users created by the authenticated user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
String apiUsername = "apiUsername_example"; // String | The username of a valid api user
Boolean naked = true; // Boolean | 
try {
    apiInstance.clearInternalUsers(apiUsername, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#clearInternalUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiUsername** | **String**| The username of a valid api user |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteInternalUser"></a>
# **deleteInternalUser**
> InternalUser deleteInternalUser(apiUsername, internalUsername, naked)



Delete all internal users created by the authenticated user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
String apiUsername = "apiUsername_example"; // String | The username of a valid api user
String internalUsername = "internalUsername_example"; // String | The username of a valid internal user
Boolean naked = true; // Boolean | 
try {
    InternalUser result = apiInstance.deleteInternalUser(apiUsername, internalUsername, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#deleteInternalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiUsername** | **String**| The username of a valid api user |
 **internalUsername** | **String**| The username of a valid internal user |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**InternalUser**](InternalUser.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteProfile"></a>
# **deleteProfile**
> EmptyClientResponse deleteProfile(apiUsername, naked, filter)



Delte a user profile by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
String apiUsername = "apiUsername_example"; // String | The username of the profile to update
Boolean naked = true; // Boolean | 
String filter = "*"; // String | A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects
try {
    EmptyClientResponse result = apiInstance.deleteProfile(apiUsername, naked, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#deleteProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiUsername** | **String**| The username of the profile to update |
 **naked** | **Boolean**|  | [default to true]
 **filter** | **String**| A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects | [optional] [default to *]

### Return type

[**EmptyClientResponse**](EmptyClientResponse.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getInternalUser"></a>
# **getInternalUser**
> InternalUser getInternalUser(apiUsername, internalUsername, naked)



Find api user profile by their api username

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
String apiUsername = "apiUsername_example"; // String | The username of a valid api user
String internalUsername = "internalUsername_example"; // String | The username of a valid internal user
Boolean naked = true; // Boolean | 
try {
    InternalUser result = apiInstance.getInternalUser(apiUsername, internalUsername, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getInternalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiUsername** | **String**| The username of a valid api user |
 **internalUsername** | **String**| The username of a valid internal user |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**InternalUser**](InternalUser.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getProfile"></a>
# **getProfile**
> Profile getProfile(apiUsername, naked, filter)



Get a user profile by name

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
String apiUsername = "apiUsername_example"; // String | The username of the profile to update
Boolean naked = true; // Boolean | 
String filter = "*"; // String | A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects
try {
    Profile result = apiInstance.getProfile(apiUsername, naked, filter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#getProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiUsername** | **String**| The username of the profile to update |
 **naked** | **Boolean**|  | [default to true]
 **filter** | **String**| A comma-separated list of fields in the response objects to return. This allows developers to create their own response objects | [optional] [default to *]

### Return type

[**Profile**](Profile.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listInternalUsers"></a>
# **listInternalUsers**
> List&lt;InternalUser&gt; listInternalUsers(apiUsername, naked, username, name, email)



List all internal users created by the authenticated user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
String apiUsername = "apiUsername_example"; // String | The username of a valid api user
Boolean naked = true; // Boolean | 
String username = "username_example"; // String | The username of the internal user
String name = "name_example"; // String | The full name of the internal user
String email = "email_example"; // String | The email address of the internal user
try {
    List<InternalUser> result = apiInstance.listInternalUsers(apiUsername, naked, username, name, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#listInternalUsers");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiUsername** | **String**| The username of a valid api user |
 **naked** | **Boolean**|  | [default to true]
 **username** | **String**| The username of the internal user | [optional]
 **name** | **String**| The full name of the internal user | [optional]
 **email** | **String**| The email address of the internal user | [optional]

### Return type

[**List&lt;InternalUser&gt;**](InternalUser.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listProfiles"></a>
# **listProfiles**
> List&lt;Profile&gt; listProfiles(naked, username, name, email)



List user profiles

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
Boolean naked = true; // Boolean | 
String username = "username_example"; // String | The username to search for
String name = "name_example"; // String | The user full name
String email = "email_example"; // String | The user email address
try {
    List<Profile> result = apiInstance.listProfiles(naked, username, name, email);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#listProfiles");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **naked** | **Boolean**|  | [default to true]
 **username** | **String**| The username to search for | [optional]
 **name** | **String**| The user full name | [optional]
 **email** | **String**| The user email address | [optional]

### Return type

[**List&lt;Profile&gt;**](Profile.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateInternalUser"></a>
# **updateInternalUser**
> InternalUser updateInternalUser(apiUsername, internalUsername, body, naked)



Create or update the given internal user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
String apiUsername = "apiUsername_example"; // String | The username of a valid api user
String internalUsername = "internalUsername_example"; // String | The username of a valid internal user
ProfileRequest body = new ProfileRequest(); // ProfileRequest | A JSON description of the internal user to update
Boolean naked = true; // Boolean | 
try {
    InternalUser result = apiInstance.updateInternalUser(apiUsername, internalUsername, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#updateInternalUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiUsername** | **String**| The username of a valid api user |
 **internalUsername** | **String**| The username of a valid internal user |
 **body** | [**ProfileRequest**](ProfileRequest.md)| A JSON description of the internal user to update |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**InternalUser**](InternalUser.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateProfile"></a>
# **updateProfile**
> Profile updateProfile(apiUsername, body, naked)



Update an existing user profile

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ProfilesApi;

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

ProfilesApi apiInstance = new ProfilesApi();
String apiUsername = "apiUsername_example"; // String | The username of the profile to update
ProfileRequest body = new ProfileRequest(); // ProfileRequest | The updated profile
Boolean naked = true; // Boolean | 
try {
    Profile result = apiInstance.updateProfile(apiUsername, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProfilesApi#updateProfile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **apiUsername** | **String**| The username of the profile to update |
 **body** | [**ProfileRequest**](ProfileRequest.md)| The updated profile |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Profile**](Profile.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

