# TagApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addTag**](TagApi.md#addTag) | **POST** /tags/v2 | Creat a new tag
[**addTagResource**](TagApi.md#addTagResource) | **POST** /tags/v2/{tagId}/resources | Add resources to tag
[**clearTagPermissions**](TagApi.md#clearTagPermissions) | **DELETE** /tags/v2/{tagId}/pems | Clear tag permissions
[**clearTagResources**](TagApi.md#clearTagResources) | **DELETE** /tags/v2/{tagId}/resources | Clear all tagged resources
[**deleteTag**](TagApi.md#deleteTag) | **DELETE** /tags/v2/{tagId} | Delete tag
[**deleteTagPermissionForUser**](TagApi.md#deleteTagPermissionForUser) | **DELETE** /tags/v2/{tagId}/pems/{username} | Remove user tag permission
[**getTagDetails**](TagApi.md#getTagDetails) | **GET** /tags/v2/{tagId} | Tag Details
[**getTagPermissionForUser**](TagApi.md#getTagPermissionForUser) | **GET** /tags/v2/{tagId}/pems/{username} | List tag permissions for a user
[**getTaggedResource**](TagApi.md#getTaggedResource) | **GET** /tags/v2/{tagId}/resources/{uuid} | Get tagged item details
[**listTagHistory**](TagApi.md#listTagHistory) | **GET** /tags/v2/{tagId}/history | Tag history
[**listTagPermissions**](TagApi.md#listTagPermissions) | **GET** /tags/v2/{tagId}/pems | List permissionss set for a given tag id
[**listTagResources**](TagApi.md#listTagResources) | **GET** /tags/v2/{tagId}/resources | Tagged items
[**listTags**](TagApi.md#listTags) | **GET** /tags/v2 | Available tags
[**removeTagResource**](TagApi.md#removeTagResource) | **DELETE** /tags/v2/{tagId}/resources/{uuid} | Remove resource from tag
[**updateTag**](TagApi.md#updateTag) | **PUT** /tags/v2/{tagId} | Update tag
[**updateTagPermission**](TagApi.md#updateTagPermission) | **POST** /tags/v2/{tagId}/pems | Grant permission
[**updateTagPermissionForUser**](TagApi.md#updateTagPermissionForUser) | **POST** /tags/v2/{tagId}/pems/{username} | Update user permission on tag
[**updateTagResource**](TagApi.md#updateTagResource) | **PUT** /tags/v2/{tagId}/resources/{uuid} | Add resource to tag


<a name="addTag"></a>
# **addTag**
> Tag addTag(body, naked)

Creat a new tag

Creates a new tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
Tag body = new Tag(); // Tag | JSON Tag object
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    Tag result = apiInstance.addTag(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#addTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Tag**](Tag.md)| JSON Tag object |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

[**Tag**](Tag.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

<a name="addTagResource"></a>
# **addTagResource**
> List&lt;Tag&gt; addTagResource(tagId, body, naked)

Add resources to tag

Adds the list of resources to the given tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
TagResource body = new TagResource(); // TagResource | List of resource uuid to add
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    List<Tag> result = apiInstance.addTagResource(tagId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#addTagResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **body** | [**TagResource**](TagResource.md)| List of resource uuid to add |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearTagPermissions"></a>
# **clearTagPermissions**
> clearTagPermissions(tagId, naked)

Clear tag permissions

Removes all permissions save ownership from the given tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    apiInstance.clearTagPermissions(tagId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#clearTagPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearTagResources"></a>
# **clearTagResources**
> clearTagResources(tagId, naked)

Clear all tagged resources

Removes all resources from the given tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    apiInstance.clearTagResources(tagId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#clearTagResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTag"></a>
# **deleteTag**
> deleteTag(tagId, naked)

Delete tag

Deletes the tag and all permissions

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    apiInstance.deleteTag(tagId, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#deleteTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteTagPermissionForUser"></a>
# **deleteTagPermissionForUser**
> deleteTagPermissionForUser(tagId, username, naked)

Remove user tag permission

Removes permissions for the given user on the given tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
String username = "username_example"; // String | Username to revoke permission
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    apiInstance.deleteTagPermissionForUser(tagId, username, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#deleteTagPermissionForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **username** | **String**| Username to revoke permission |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTagDetails"></a>
# **getTagDetails**
> Tag getTagDetails(tagId, naked)

Tag Details

Returns detailed information about the named tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    Tag result = apiInstance.getTagDetails(tagId, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#getTagDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

[**Tag**](Tag.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTagPermissionForUser"></a>
# **getTagPermissionForUser**
> List&lt;Permission&gt; getTagPermissionForUser(tagId, username, naked)

List tag permissions for a user

Returns the permission set on the given tag for a specific user.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
String username = "username_example"; // String | Valid username
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    List<Permission> result = apiInstance.getTagPermissionForUser(tagId, username, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#getTagPermissionForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **username** | **String**| Valid username |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getTaggedResource"></a>
# **getTaggedResource**
> TagResource getTaggedResource(tagId, uuid, naked)

Get tagged item details

Returns a list of items with the given tag.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
String uuid = "uuid_example"; // String | Unique id of a resource
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    TagResource result = apiInstance.getTaggedResource(tagId, uuid, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#getTaggedResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **uuid** | **String**| Unique id of a resource |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

[**TagResource**](TagResource.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTagHistory"></a>
# **listTagHistory**
> List&lt;TagHistory&gt; listTagHistory(tagId, naked, limit, offset)

Tag history

Returns a list of items with the given tag.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
Integer limit = 100; // Integer | Maximum number of responses. Default 100
Integer offset = 0; // Integer | Number of results to skip by default
try {
    List<TagHistory> result = apiInstance.listTagHistory(tagId, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#listTagHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]
 **limit** | **Integer**| Maximum number of responses. Default 100 | [optional] [default to 100]
 **offset** | **Integer**| Number of results to skip by default | [optional] [default to 0]

### Return type

[**List&lt;TagHistory&gt;**](TagHistory.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTagPermissions"></a>
# **listTagPermissions**
> List&lt;Permission&gt; listTagPermissions(tagId, naked, limit, offset)

List permissionss set for a given tag id

Returns a list of permission objects set on this Tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the system
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
Integer limit = 100; // Integer | Maximum number of responses. Default 100
Integer offset = 0; // Integer | Number of results to skip by default
try {
    List<Permission> result = apiInstance.listTagPermissions(tagId, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#listTagPermissions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the system |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]
 **limit** | **Integer**| Maximum number of responses. Default 100 | [optional] [default to 100]
 **offset** | **Integer**| Number of results to skip by default | [optional] [default to 0]

### Return type

[**List&lt;Permission&gt;**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTagResources"></a>
# **listTagResources**
> List&lt;TagResource&gt; listTagResources(tagId, naked, limit, offset)

Tagged items

Returns a list of items with the given tag.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
Integer limit = 100; // Integer | Maximum number of responses. Default 100
Integer offset = 0; // Integer | Number of results to skip by default
try {
    List<TagResource> result = apiInstance.listTagResources(tagId, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#listTagResources");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]
 **limit** | **Integer**| Maximum number of responses. Default 100 | [optional] [default to 100]
 **offset** | **Integer**| Number of results to skip by default | [optional] [default to 0]

### Return type

[**List&lt;TagResource&gt;**](TagResource.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listTags"></a>
# **listTags**
> List&lt;TagSummary&gt; listTags(name, resourceType, resourceId, lastModified, created, naked, limit, offset)

Available tags

The Tags endpoint returns summary information about the available list of tags right now.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String name = "name_example"; // String | Name of the tag for which to search
String resourceType = "resourceType_example"; // String | Search for tags associated with one or resources of named type
String resourceId = "resourceId_example"; // String | Id of tagged resource
String lastModified = "lastModified_example"; // String | Date at which tag was modified in ISO8601 format
String created = "created_example"; // String | Date at which tag was created in ISO8601 format
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
Integer limit = 100; // Integer | Maximum number of responses. Default 100
Integer offset = 0; // Integer | Number of results to skip by default
try {
    List<TagSummary> result = apiInstance.listTags(name, resourceType, resourceId, lastModified, created, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#listTags");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **name** | **String**| Name of the tag for which to search | [optional]
 **resourceType** | **String**| Search for tags associated with one or resources of named type | [optional]
 **resourceId** | **String**| Id of tagged resource | [optional]
 **lastModified** | **String**| Date at which tag was modified in ISO8601 format | [optional]
 **created** | **String**| Date at which tag was created in ISO8601 format | [optional]
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]
 **limit** | **Integer**| Maximum number of responses. Default 100 | [optional] [default to 100]
 **offset** | **Integer**| Number of results to skip by default | [optional] [default to 0]

### Return type

[**List&lt;TagSummary&gt;**](TagSummary.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="removeTagResource"></a>
# **removeTagResource**
> removeTagResource(tagId, uuid, naked)

Remove resource from tag

Removes the given uuid from this tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
String uuid = "uuid_example"; // String | UUID of the resource to delete
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    apiInstance.removeTagResource(tagId, uuid, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#removeTagResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **uuid** | **String**| UUID of the resource to delete |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateTag"></a>
# **updateTag**
> Tag updateTag(tagId, body, naked)

Update tag

Updates the given tag with the updated information

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
Tag body = new Tag(); // Tag | JSON Tag object
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    Tag result = apiInstance.updateTag(tagId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#updateTag");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **body** | [**Tag**](Tag.md)| JSON Tag object |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

[**Tag**](Tag.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

<a name="updateTagPermission"></a>
# **updateTagPermission**
> Permission updateTagPermission(tagId, body, naked)

Grant permission

Adds a permission for a given user to a given tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
Permission body = new Permission(); // Permission | Unique id of a resource
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    Permission result = apiInstance.updateTagPermission(tagId, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#updateTagPermission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **body** | [**Permission**](Permission.md)| Unique id of a resource |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

<a name="updateTagPermissionForUser"></a>
# **updateTagPermissionForUser**
> Permission updateTagPermissionForUser(tagId, username, body, naked)

Update user permission on tag

Resets the user permission on the given tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
String username = "username_example"; // String | Valid username
Permission body = new Permission(); // Permission | Valid permission value
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    Permission result = apiInstance.updateTagPermissionForUser(tagId, username, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#updateTagPermissionForUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **username** | **String**| Valid username |
 **body** | [**Permission**](Permission.md)| Valid permission value |
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

[**Permission**](Permission.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json, multipart/form-data
 - **Accept**: application/json

<a name="updateTagResource"></a>
# **updateTagResource**
> TagResource updateTagResource(tagId, uuid, body, naked)

Add resource to tag

Adds the resource with the given uuid to the given tag

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.TagApi;

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

TagApi apiInstance = new TagApi();
String tagId = "tagId_example"; // String | Unique id of the tag
String uuid = "uuid_example"; // String | Unique id of a resource
TagResource body = new TagResource(); // TagResource | empty body
Boolean naked = true; // Boolean | If true return only the payload, not the standard response wrapper
try {
    TagResource result = apiInstance.updateTagResource(tagId, uuid, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TagApi#updateTagResource");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tagId** | **String**| Unique id of the tag |
 **uuid** | **String**| Unique id of a resource |
 **body** | [**TagResource**](TagResource.md)| empty body | [optional]
 **naked** | **Boolean**| If true return only the payload, not the standard response wrapper | [optional] [default to true]

### Return type

[**TagResource**](TagResource.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

