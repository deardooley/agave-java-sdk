# ClientsApi

All URIs are relative to *https://public.agaveapi.co/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addClient**](ClientsApi.md#addClient) | **POST** /clients/v2/ | 
[**addClientAPISubscription**](ClientsApi.md#addClientAPISubscription) | **POST** /clients/v2/{clientName}/subscriptions | 
[**clearClientAPISubscriptions**](ClientsApi.md#clearClientAPISubscriptions) | **DELETE** /clients/v2/{clientName}/subscriptions | 
[**deleteClient**](ClientsApi.md#deleteClient) | **DELETE** /clients/v2/{clientName} | 
[**getClient**](ClientsApi.md#getClient) | **GET** /clients/v2/{clientName} | 
[**listClientApiSubscriptions**](ClientsApi.md#listClientApiSubscriptions) | **GET** /clients/v2/{clientName}/subscriptions | 
[**listClients**](ClientsApi.md#listClients) | **GET** /clients/v2/ | 


<a name="addClient"></a>
# **addClient**
> SingleClientResponse addClient(body)



Create a new client

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: agaveBasic
HttpBasicAuth agaveBasic = (HttpBasicAuth) defaultClient.getAuthentication("agaveBasic");
agaveBasic.setUsername("YOUR USERNAME");
agaveBasic.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
ClientRequest body = new ClientRequest(); // ClientRequest | The api client to create
try {
    SingleClientResponse result = apiInstance.addClient(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#addClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ClientRequest**](ClientRequest.md)| The api client to create |

### Return type

[**SingleClientResponse**](SingleClientResponse.md)

### Authorization

[agaveBasic](../README.md#agaveBasic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="addClientAPISubscription"></a>
# **addClientAPISubscription**
> SingleSubscriptionResponse addClientAPISubscription(clientName, body)



Add a new API subscription to the given client

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: agaveBasic
HttpBasicAuth agaveBasic = (HttpBasicAuth) defaultClient.getAuthentication("agaveBasic");
agaveBasic.setUsername("YOUR USERNAME");
agaveBasic.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
String clientName = "clientName_example"; // String | The name of the client to be subscribe to this api
ClientSubscriptionRequest body = new ClientSubscriptionRequest(); // ClientSubscriptionRequest | The api client to create
try {
    SingleSubscriptionResponse result = apiInstance.addClientAPISubscription(clientName, body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#addClientAPISubscription");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientName** | **String**| The name of the client to be subscribe to this api |
 **body** | [**ClientSubscriptionRequest**](ClientSubscriptionRequest.md)| The api client to create |

### Return type

[**SingleSubscriptionResponse**](SingleSubscriptionResponse.md)

### Authorization

[agaveBasic](../README.md#agaveBasic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearClientAPISubscriptions"></a>
# **clearClientAPISubscriptions**
> EmptyClientResponse clearClientAPISubscriptions(clientName)



Unsubscribe the client from all APIs

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: agaveBasic
HttpBasicAuth agaveBasic = (HttpBasicAuth) defaultClient.getAuthentication("agaveBasic");
agaveBasic.setUsername("YOUR USERNAME");
agaveBasic.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
String clientName = "clientName_example"; // String | The name of the client to be deleted
try {
    EmptyClientResponse result = apiInstance.clearClientAPISubscriptions(clientName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#clearClientAPISubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientName** | **String**| The name of the client to be deleted |

### Return type

[**EmptyClientResponse**](EmptyClientResponse.md)

### Authorization

[agaveBasic](../README.md#agaveBasic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteClient"></a>
# **deleteClient**
> EmptyClientResponse deleteClient(clientName)



Immediately deletes this client and renders the API keys useless.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: agaveBasic
HttpBasicAuth agaveBasic = (HttpBasicAuth) defaultClient.getAuthentication("agaveBasic");
agaveBasic.setUsername("YOUR USERNAME");
agaveBasic.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
String clientName = "clientName_example"; // String | The name of the client to be deleted
try {
    EmptyClientResponse result = apiInstance.deleteClient(clientName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#deleteClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientName** | **String**| The name of the client to be deleted |

### Return type

[**EmptyClientResponse**](EmptyClientResponse.md)

### Authorization

[agaveBasic](../README.md#agaveBasic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getClient"></a>
# **getClient**
> MultipleClientResponse getClient(clientName)



Returns a detailed description of a named client.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: agaveBasic
HttpBasicAuth agaveBasic = (HttpBasicAuth) defaultClient.getAuthentication("agaveBasic");
agaveBasic.setUsername("YOUR USERNAME");
agaveBasic.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
String clientName = "clientName_example"; // String | The name of the client to be deleted
try {
    MultipleClientResponse result = apiInstance.getClient(clientName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#getClient");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientName** | **String**| The name of the client to be deleted |

### Return type

[**MultipleClientResponse**](MultipleClientResponse.md)

### Authorization

[agaveBasic](../README.md#agaveBasic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listClientApiSubscriptions"></a>
# **listClientApiSubscriptions**
> MultipleSubscriptionResponse listClientApiSubscriptions(clientName, limit, offset)



Lists all APIs to which the client is subscribed

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: agaveBasic
HttpBasicAuth agaveBasic = (HttpBasicAuth) defaultClient.getAuthentication("agaveBasic");
agaveBasic.setUsername("YOUR USERNAME");
agaveBasic.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
String clientName = "clientName_example"; // String | The name of the client to be deleted
Long limit = 100L; // Long | The maximum number of results returned from this query
Long offset = 0L; // Long | The number of results skipped in the result set returned from this query
try {
    MultipleSubscriptionResponse result = apiInstance.listClientApiSubscriptions(clientName, limit, offset);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#listClientApiSubscriptions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **clientName** | **String**| The name of the client to be deleted |
 **limit** | **Long**| The maximum number of results returned from this query | [optional] [default to 100]
 **offset** | **Long**| The number of results skipped in the result set returned from this query | [optional] [default to 0]

### Return type

[**MultipleSubscriptionResponse**](MultipleSubscriptionResponse.md)

### Authorization

[agaveBasic](../README.md#agaveBasic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listClients"></a>
# **listClients**
> MultipleClientResponse listClients()



List existing clients

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ClientsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure HTTP basic authorization: agaveBasic
HttpBasicAuth agaveBasic = (HttpBasicAuth) defaultClient.getAuthentication("agaveBasic");
agaveBasic.setUsername("YOUR USERNAME");
agaveBasic.setPassword("YOUR PASSWORD");

ClientsApi apiInstance = new ClientsApi();
try {
    MultipleClientResponse result = apiInstance.listClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ClientsApi#listClients");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**MultipleClientResponse**](MultipleClientResponse.md)

### Authorization

[agaveBasic](../README.md#agaveBasic)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

