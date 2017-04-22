# NotificationsApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addNotification**](NotificationsApi.md#addNotification) | **POST** /notifications/v2/ | 
[**deleteNotification**](NotificationsApi.md#deleteNotification) | **DELETE** /notifications/v2/{uuid} | 
[**getNotification**](NotificationsApi.md#getNotification) | **GET** /notifications/v2/{uuid} | 
[**listNotifications**](NotificationsApi.md#listNotifications) | **GET** /notifications/v2/ | 
[**updateNotification**](NotificationsApi.md#updateNotification) | **POST** /notifications/v2/{uuid} | 


<a name="addNotification"></a>
# **addNotification**
> Notification addNotification(body, naked)



Add new notification.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationsApi;

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

NotificationsApi apiInstance = new NotificationsApi();
NotificationRequest body = new NotificationRequest(); // NotificationRequest | The notification to add.
Boolean naked = true; // Boolean | 
try {
    Notification result = apiInstance.addNotification(body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#addNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**NotificationRequest**](NotificationRequest.md)| The notification to add. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Notification**](Notification.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteNotification"></a>
# **deleteNotification**
> deleteNotification(uuid, naked)



Remove notification from the system.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationsApi;

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

NotificationsApi apiInstance = new NotificationsApi();
String uuid = "uuid_example"; // String | The uuid of the notification item
Boolean naked = true; // Boolean | 
try {
    apiInstance.deleteNotification(uuid, naked);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#deleteNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the notification item |
 **naked** | **Boolean**|  | [default to true]

### Return type

null (empty response body)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getNotification"></a>
# **getNotification**
> Notification getNotification(uuid, naked)



Retrieve notification.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationsApi;

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

NotificationsApi apiInstance = new NotificationsApi();
String uuid = "uuid_example"; // String | The uuid of the notification item
Boolean naked = true; // Boolean | 
try {
    Notification result = apiInstance.getNotification(uuid, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#getNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the notification item |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Notification**](Notification.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listNotifications"></a>
# **listNotifications**
> List&lt;Notification&gt; listNotifications(associatedUuid, naked, limit, offset)



Retrieve notification for a specific resource.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationsApi;

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

NotificationsApi apiInstance = new NotificationsApi();
String associatedUuid = "associatedUuid_example"; // String | The uuid of the associated resource. All notifications for this resource visible to the user will be returned.
Boolean naked = true; // Boolean | 
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    List<Notification> result = apiInstance.listNotifications(associatedUuid, naked, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#listNotifications");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **associatedUuid** | **String**| The uuid of the associated resource. All notifications for this resource visible to the user will be returned. |
 **naked** | **Boolean**|  | [default to true]
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**List&lt;Notification&gt;**](Notification.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateNotification"></a>
# **updateNotification**
> Notification updateNotification(uuid, body, naked)



Update existing notification.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.NotificationsApi;

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

NotificationsApi apiInstance = new NotificationsApi();
String uuid = "uuid_example"; // String | The uuid of the notification item
NotificationRequest body = new NotificationRequest(); // NotificationRequest | The notification to update.
Boolean naked = true; // Boolean | 
try {
    Notification result = apiInstance.updateNotification(uuid, body, naked);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling NotificationsApi#updateNotification");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uuid** | **String**| The uuid of the notification item |
 **body** | [**NotificationRequest**](NotificationRequest.md)| The notification to update. |
 **naked** | **Boolean**|  | [default to true]

### Return type

[**Notification**](Notification.md)

### Authorization

[agaveImplicit](../README.md#agaveImplicit), [agavePassword](../README.md#agavePassword), [agaveApplication](../README.md#agaveApplication)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

