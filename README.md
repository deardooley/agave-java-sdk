# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
	<groupId>org.agave.client</groupId>
	<artifactId>java-sdk</artifactId>
	<version>2.1.11</version>
	<target>compile</target>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.agave.client:java-sdk:2.1.11"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/java-sdk-2.1.11.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.agave.client.*;
import org.agave.client.auth.*;
import org.agave.client.model.*;
import org.agave.client.api.FilesApi;

import java.io.File;
import java.util.*;

public class AppsApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: agavePassword
        OAuth agavePassword = (OAuth) defaultClient.getAuthentication("agavePassword");
        agavePassword.setAccessToken("YOUR ACCESS TOKEN");

        FilesApi apiInstance = new FilesApi();
        String systemId = "data.agaveapi.co";
        String filePath = "nryan";
        boolean naked = false;
        int limit = 100;
        int offset = 0;
        try {
        	List<FileInfo> listing = apiInstance.listFileItems(systemId, filePath, naked, limit, offset);
        	for (FileInfo fileInfo: listing) {
        		System.out.println(fileInfo.getName() + "\t" + fileInfo.getLength() + "\t" + fileInfo.getLastModified());
        	}
        } catch (ApiException e) {
            System.err.println("Exception when calling FilesApi#listFileItems");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://public.agaveapi.co/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AppsApi* | [**addApp**](docs/AppsApi.md#addApp) | **POST** /apps/v2/ | 
*AppsApi* | [**addAppPermission**](docs/AppsApi.md#addAppPermission) | **POST** /apps/v2/{appId}/pems | 
*AppsApi* | [**clearAppPermissions**](docs/AppsApi.md#clearAppPermissions) | **DELETE** /apps/v2/{appId}/pems | 
*AppsApi* | [**deleteApp**](docs/AppsApi.md#deleteApp) | **DELETE** /apps/v2/{appId} | 
*AppsApi* | [**deleteAppPermission**](docs/AppsApi.md#deleteAppPermission) | **DELETE** /apps/v2/{appId}/pems/{username} | 
*AppsApi* | [**getAppDetails**](docs/AppsApi.md#getAppDetails) | **GET** /apps/v2/{appId} | 
*AppsApi* | [**getAppPermission**](docs/AppsApi.md#getAppPermission) | **GET** /apps/v2/{appId}/pems/{username} | 
*AppsApi* | [**getAppSubmissionForm**](docs/AppsApi.md#getAppSubmissionForm) | **GET** /apps/v2/{appId}/form | 
*AppsApi* | [**invokeAppAction**](docs/AppsApi.md#invokeAppAction) | **PUT** /apps/v2/{appId} | 
*AppsApi* | [**listAppHistory**](docs/AppsApi.md#listAppHistory) | **GET** /apps/v2/{appId}/history | 
*AppsApi* | [**listAppPermissions**](docs/AppsApi.md#listAppPermissions) | **GET** /apps/v2/{appId}/pems | 
*AppsApi* | [**listApps**](docs/AppsApi.md#listApps) | **GET** /apps/v2/ | List apps
*AppsApi* | [**updateApp**](docs/AppsApi.md#updateApp) | **POST** /apps/v2/{appId} | 
*AppsApi* | [**updateAppPermission**](docs/AppsApi.md#updateAppPermission) | **POST** /apps/v2/{appId}/pems/{username} | 
*ClientsApi* | [**addClient**](docs/ClientsApi.md#addClient) | **POST** /clients/v2/ | 
*ClientsApi* | [**addClientAPISubscription**](docs/ClientsApi.md#addClientAPISubscription) | **POST** /clients/v2/{clientName}/subscriptions | 
*ClientsApi* | [**clearClientAPISubscriptions**](docs/ClientsApi.md#clearClientAPISubscriptions) | **DELETE** /clients/v2/{clientName}/subscriptions | 
*ClientsApi* | [**deleteClient**](docs/ClientsApi.md#deleteClient) | **DELETE** /clients/v2/{clientName} | 
*ClientsApi* | [**getClient**](docs/ClientsApi.md#getClient) | **GET** /clients/v2/{clientName} | 
*ClientsApi* | [**listClientApiSubscriptions**](docs/ClientsApi.md#listClientApiSubscriptions) | **GET** /clients/v2/{clientName}/subscriptions | 
*ClientsApi* | [**listClients**](docs/ClientsApi.md#listClients) | **GET** /clients/v2/ | 
*FilesApi* | [**clearFileItemPermissions**](docs/FilesApi.md#clearFileItemPermissions) | **DELETE** /files/v2/pems/system/{systemId}/{filePath} | 
*FilesApi* | [**deleteFileItem**](docs/FilesApi.md#deleteFileItem) | **DELETE** /files/v2/media/system/{systemId}/{filePath} | 
*FilesApi* | [**deleteFileItemOnDefaultSystem**](docs/FilesApi.md#deleteFileItemOnDefaultSystem) | **DELETE** /files/v2/media/{filePath} | 
*FilesApi* | [**downloadFileItem**](docs/FilesApi.md#downloadFileItem) | **GET** /files/v2/media/system/{systemId}/{filePath} | 
*FilesApi* | [**downloadFileItemOnDefaultSystem**](docs/FilesApi.md#downloadFileItemOnDefaultSystem) | **GET** /files/v2/media/{filePath} | 
*FilesApi* | [**importFileItem**](docs/FilesApi.md#importFileItem) | **POST** /files/v2/media/system/{systemId}/{filePath} | 
*FilesApi* | [**importFileItemToDefaultSystem**](docs/FilesApi.md#importFileItemToDefaultSystem) | **POST** /files/v2/media/{filePath} | 
*FilesApi* | [**invokeFileActionOnDefaultSystem**](docs/FilesApi.md#invokeFileActionOnDefaultSystem) | **PUT** /files/v2/media/{filePath} | 
*FilesApi* | [**invokeFileItemAction**](docs/FilesApi.md#invokeFileItemAction) | **PUT** /files/v2/media/system/{systemId}/{filePath} | 
*FilesApi* | [**listFileItemHistory**](docs/FilesApi.md#listFileItemHistory) | **GET** /files/v2/history/system/{systemId}/{filePath} | 
*FilesApi* | [**listFileItemHistoryOnDefaultSystem**](docs/FilesApi.md#listFileItemHistoryOnDefaultSystem) | **GET** /files/v2/history/{filePath} | 
*FilesApi* | [**listFileItemPermissions**](docs/FilesApi.md#listFileItemPermissions) | **GET** /files/v2/pems/system/{systemId}/{filePath} | 
*FilesApi* | [**listFileItemPermissionsOnDefaultSystem**](docs/FilesApi.md#listFileItemPermissionsOnDefaultSystem) | **GET** /files/v2/pems/{filePath} | 
*FilesApi* | [**listFileItems**](docs/FilesApi.md#listFileItems) | **GET** /files/v2/listings/system/{systemId}/{filePath} | 
*FilesApi* | [**listFileItemsOnDefaultSystem**](docs/FilesApi.md#listFileItemsOnDefaultSystem) | **GET** /files/v2/listings/{filepath} | 
*FilesApi* | [**updateFileItemPermission**](docs/FilesApi.md#updateFileItemPermission) | **POST** /files/v2/pems/system/{systemId}/{filePath} | 
*FilesApi* | [**updateFileItemPermissionsOnDefaultSystem**](docs/FilesApi.md#updateFileItemPermissionsOnDefaultSystem) | **POST** /files/v2/pems/{filePath} | 
*JobsApi* | [**addJobPermission**](docs/JobsApi.md#addJobPermission) | **POST** /jobs/v2/{jobId}/pems | 
*JobsApi* | [**clearJobPermissions**](docs/JobsApi.md#clearJobPermissions) | **DELETE** /jobs/v2/{jobId}/pems | 
*JobsApi* | [**deleteJob**](docs/JobsApi.md#deleteJob) | **DELETE** /jobs/v2/{jobId} | 
*JobsApi* | [**deleteJobPermission**](docs/JobsApi.md#deleteJobPermission) | **DELETE** /jobs/v2/{jobId}/pems/{username} | 
*JobsApi* | [**downloadJobOutput**](docs/JobsApi.md#downloadJobOutput) | **GET** /jobs/v2/{jobId}/outputs/media/{filePath} | 
*JobsApi* | [**getJobDetails**](docs/JobsApi.md#getJobDetails) | **GET** /jobs/v2/{jobId} | 
*JobsApi* | [**getJobHistory**](docs/JobsApi.md#getJobHistory) | **GET** /jobs/v2/{jobId}/history | 
*JobsApi* | [**getJobPermission**](docs/JobsApi.md#getJobPermission) | **GET** /jobs/v2/{jobId}/pems/{username} | 
*JobsApi* | [**getJobStatus**](docs/JobsApi.md#getJobStatus) | **GET** /jobs/v2/{jobId}/status | 
*JobsApi* | [**listJobOutputs**](docs/JobsApi.md#listJobOutputs) | **GET** /jobs/v2/{jobId}/outputs/listings/{filePath} | 
*JobsApi* | [**listJobPermissions**](docs/JobsApi.md#listJobPermissions) | **GET** /jobs/v2/{jobId}/pems | 
*JobsApi* | [**listJobs**](docs/JobsApi.md#listJobs) | **GET** /jobs/v2/ | 
*JobsApi* | [**resubmitJob**](docs/JobsApi.md#resubmitJob) | **POST** /jobs/v2/{jobId} | 
*JobsApi* | [**submitJob**](docs/JobsApi.md#submitJob) | **POST** /jobs/v2/ | 
*JobsApi* | [**updateJobPermission**](docs/JobsApi.md#updateJobPermission) | **POST** /jobs/v2/{jobId}/pems/{username} | 
*MetaApi* | [**addMetadata**](docs/MetaApi.md#addMetadata) | **POST** /meta/v2/data | 
*MetaApi* | [**addMetadataPermission**](docs/MetaApi.md#addMetadataPermission) | **POST** /meta/v2/data/{uuid}/pems | 
*MetaApi* | [**addMetadataSchema**](docs/MetaApi.md#addMetadataSchema) | **POST** /meta/v2/schemas | 
*MetaApi* | [**addMetadataSchemaPermission**](docs/MetaApi.md#addMetadataSchemaPermission) | **POST** /meta/v2/schemas/{uuid}/pems | 
*MetaApi* | [**clearMetadataPermissions**](docs/MetaApi.md#clearMetadataPermissions) | **DELETE** /meta/v2/data/{uuid}/pems | 
*MetaApi* | [**clearMetadataSchemaPermissions**](docs/MetaApi.md#clearMetadataSchemaPermissions) | **DELETE** /meta/v2/schemas/{uuid}/pems | 
*MetaApi* | [**deleteMetadata**](docs/MetaApi.md#deleteMetadata) | **DELETE** /meta/v2/data/{uuid} | 
*MetaApi* | [**deleteMetadataPermission**](docs/MetaApi.md#deleteMetadataPermission) | **DELETE** /meta/v2/data/{uuid}/pems/{username} | 
*MetaApi* | [**deleteMetadataSchema**](docs/MetaApi.md#deleteMetadataSchema) | **DELETE** /meta/v2/schemas/{uuid} | 
*MetaApi* | [**deleteSchemaPermission**](docs/MetaApi.md#deleteSchemaPermission) | **DELETE** /meta/v2/schemas/{uuid}/pems/{username} | 
*MetaApi* | [**getMetadata**](docs/MetaApi.md#getMetadata) | **GET** /meta/v2/data/{uuid} | 
*MetaApi* | [**getMetadataPermission**](docs/MetaApi.md#getMetadataPermission) | **GET** /meta/v2/data/{uuid}/pems/{username} | 
*MetaApi* | [**getMetadataSchema**](docs/MetaApi.md#getMetadataSchema) | **GET** /meta/v2/schemas/{uuid} | 
*MetaApi* | [**getMetadataSchemaPermission**](docs/MetaApi.md#getMetadataSchemaPermission) | **GET** /meta/v2/schemas/{uuid}/pems/{username} | 
*MetaApi* | [**listMetadata**](docs/MetaApi.md#listMetadata) | **GET** /meta/v2/data | 
*MetaApi* | [**listMetadataPermissions**](docs/MetaApi.md#listMetadataPermissions) | **GET** /meta/v2/data/{uuid}/pems | 
*MetaApi* | [**listMetadataSchema**](docs/MetaApi.md#listMetadataSchema) | **GET** /meta/v2/schemas | 
*MetaApi* | [**listMetadataSchemaPermissions**](docs/MetaApi.md#listMetadataSchemaPermissions) | **GET** /meta/v2/schemas/{uuid}/pems | 
*MetaApi* | [**updateMetadata**](docs/MetaApi.md#updateMetadata) | **POST** /meta/v2/data/{uuid} | 
*MetaApi* | [**updateMetadataPermission**](docs/MetaApi.md#updateMetadataPermission) | **POST** /meta/v2/data/{uuid}/pems/{username} | 
*MetaApi* | [**updateMetadataSchema**](docs/MetaApi.md#updateMetadataSchema) | **POST** /meta/v2/schemas/{uuid} | 
*MetaApi* | [**updateMetadataSchemaPermission**](docs/MetaApi.md#updateMetadataSchemaPermission) | **POST** /meta/v2/schemas/{uuid}/pems/{username} | 
*MonitorsApi* | [**addMonitoringTasks**](docs/MonitorsApi.md#addMonitoringTasks) | **POST** /monitors/v2/ | 
*MonitorsApi* | [**deleteMonitoringTask**](docs/MonitorsApi.md#deleteMonitoringTask) | **DELETE** /monitors/v2/{monitorId} | 
*MonitorsApi* | [**forceMonitoringTaskCheck**](docs/MonitorsApi.md#forceMonitoringTaskCheck) | **POST** /monitors/v2/{monitorId}/checks | 
*MonitorsApi* | [**getMonitoringTask**](docs/MonitorsApi.md#getMonitoringTask) | **GET** /monitors/v2/{monitorId} | 
*MonitorsApi* | [**getMonitoringTaskCheck**](docs/MonitorsApi.md#getMonitoringTaskCheck) | **GET** /monitors/v2/{monitorId}/checks/{checkId} | 
*MonitorsApi* | [**listMonitoringTaskChecks**](docs/MonitorsApi.md#listMonitoringTaskChecks) | **GET** /monitors/v2/{monitorId}/checks | 
*MonitorsApi* | [**listMonitoringTasks**](docs/MonitorsApi.md#listMonitoringTasks) | **GET** /monitors/v2/ | 
*MonitorsApi* | [**updateMonitoringTask**](docs/MonitorsApi.md#updateMonitoringTask) | **POST** /monitors/v2/{monitorId} | 
*NotificationsApi* | [**addNotification**](docs/NotificationsApi.md#addNotification) | **POST** /notifications/v2/ | 
*NotificationsApi* | [**deleteNotification**](docs/NotificationsApi.md#deleteNotification) | **DELETE** /notifications/v2/{uuid} | 
*NotificationsApi* | [**getNotification**](docs/NotificationsApi.md#getNotification) | **GET** /notifications/v2/{uuid} | 
*NotificationsApi* | [**listNotifications**](docs/NotificationsApi.md#listNotifications) | **GET** /notifications/v2/ | 
*NotificationsApi* | [**updateNotification**](docs/NotificationsApi.md#updateNotification) | **POST** /notifications/v2/{uuid} | 
*PostitsApi* | [**addPostit**](docs/PostitsApi.md#addPostit) | **POST** /postits/v2/ | 
*PostitsApi* | [**deletePostit**](docs/PostitsApi.md#deletePostit) | **DELETE** /postits/v2/{nonce} | 
*PostitsApi* | [**listPostits**](docs/PostitsApi.md#listPostits) | **GET** /postits/v2/ | 
*ProfilesApi* | [**addInternalUser**](docs/ProfilesApi.md#addInternalUser) | **POST** /profiles/v2/{apiUsername}/users | 
*ProfilesApi* | [**addProfile**](docs/ProfilesApi.md#addProfile) | **POST** /profiles/v2 | 
*ProfilesApi* | [**clearInternalUsers**](docs/ProfilesApi.md#clearInternalUsers) | **DELETE** /profiles/v2/{apiUsername}/users | 
*ProfilesApi* | [**deleteInternalUser**](docs/ProfilesApi.md#deleteInternalUser) | **DELETE** /profiles/v2/{apiUsername}/users/{internalUsername} | 
*ProfilesApi* | [**deleteProfile**](docs/ProfilesApi.md#deleteProfile) | **DELETE** /profiles/v2/{apiUsername} | 
*ProfilesApi* | [**getInternalUser**](docs/ProfilesApi.md#getInternalUser) | **GET** /profiles/v2/{apiUsername}/users/{internalUsername} | 
*ProfilesApi* | [**getProfile**](docs/ProfilesApi.md#getProfile) | **GET** /profiles/v2/{apiUsername} | 
*ProfilesApi* | [**listInternalUsers**](docs/ProfilesApi.md#listInternalUsers) | **GET** /profiles/v2/{apiUsername}/users | 
*ProfilesApi* | [**listProfiles**](docs/ProfilesApi.md#listProfiles) | **GET** /profiles/v2 | 
*ProfilesApi* | [**updateInternalUser**](docs/ProfilesApi.md#updateInternalUser) | **POST** /profiles/v2/{apiUsername}/users/{internalUsername} | 
*ProfilesApi* | [**updateProfile**](docs/ProfilesApi.md#updateProfile) | **POST** /profiles/v2/{apiUsername} | 
*SystemsApi* | [**addExecutionSystem**](docs/SystemsApi.md#addExecutionSystem) | **POST** /systems/v2/ | 
*SystemsApi* | [**addStorageSystem**](docs/SystemsApi.md#addStorageSystem) | **POST** /systems/v2 | 
*SystemsApi* | [**addSystemCredential**](docs/SystemsApi.md#addSystemCredential) | **POST** /systems/v2/{systemId}/credentials | 
*SystemsApi* | [**addSystemRole**](docs/SystemsApi.md#addSystemRole) | **POST** /systems/{systemId}/roles | 
*SystemsApi* | [**clearSystemAuthCredentials**](docs/SystemsApi.md#clearSystemAuthCredentials) | **DELETE** /systems/v2/{systemId}/credentials | 
*SystemsApi* | [**clearSystemAuthCredentialsForInternalUser**](docs/SystemsApi.md#clearSystemAuthCredentialsForInternalUser) | **DELETE** /systems/v2/{systemId}/credentials/{internalUsername} | 
*SystemsApi* | [**clearSystemRoles**](docs/SystemsApi.md#clearSystemRoles) | **DELETE** /systems/v2/{systemId}/roles | 
*SystemsApi* | [**deleteSystem**](docs/SystemsApi.md#deleteSystem) | **DELETE** /systems/v2/{systemId} | 
*SystemsApi* | [**deleteSystemAuthCredentialForInternalUser**](docs/SystemsApi.md#deleteSystemAuthCredentialForInternalUser) | **DELETE** /systems/v2/{systemId}/credentials/{internalUsername}/{credentialType} | 
*SystemsApi* | [**deleteSystemRole**](docs/SystemsApi.md#deleteSystemRole) | **DELETE** /systems/v2/{systemId}/roles/{username} | 
*SystemsApi* | [**getSystemCredential**](docs/SystemsApi.md#getSystemCredential) | **GET** /systems/v2/{systemId}/credentials/{internalUsername}/{credentialType} | 
*SystemsApi* | [**getSystemDetails**](docs/SystemsApi.md#getSystemDetails) | **GET** /systems/v2/{systemId} | 
*SystemsApi* | [**getSystemRole**](docs/SystemsApi.md#getSystemRole) | **GET** /systems/v2/{systemId}/roles/{username} | 
*SystemsApi* | [**invokeSystemAction**](docs/SystemsApi.md#invokeSystemAction) | **PUT** /systems/v2/{systemId} | 
*SystemsApi* | [**listCredentialsForInternalUser**](docs/SystemsApi.md#listCredentialsForInternalUser) | **GET** /systems/v2/{systemId}/credentials/{internalUsername} | 
*SystemsApi* | [**listSystemCredentials**](docs/SystemsApi.md#listSystemCredentials) | **GET** /systems/v2/{systemId}/credentials | 
*SystemsApi* | [**listSystemRoles**](docs/SystemsApi.md#listSystemRoles) | **GET** /systems/v2/{systemId}/roles | 
*SystemsApi* | [**listSystems**](docs/SystemsApi.md#listSystems) | **GET** /systems/v2/ | 
*SystemsApi* | [**updateSystem**](docs/SystemsApi.md#updateSystem) | **POST** /systems/v2/{systemId} | 
*SystemsApi* | [**updateSystemCredential**](docs/SystemsApi.md#updateSystemCredential) | **POST** /systems/v2/{systemId}/credentials/{internalUsername} | 
*SystemsApi* | [**updateSystemCredentialOfType**](docs/SystemsApi.md#updateSystemCredentialOfType) | **POST** /systems/v2/{systemId}/credentials/{internalUsername}/{credentialType} | 
*SystemsApi* | [**updateSystemRole**](docs/SystemsApi.md#updateSystemRole) | **POST** /systems/v2/{systemId}/roles/{username} | 
*TagApi* | [**addTag**](docs/TagApi.md#addTag) | **POST** /tags/v2 | Creat a new tag
*TagApi* | [**addTagResource**](docs/TagApi.md#addTagResource) | **POST** /tags/v2/{tagId}/resources | Add resources to tag
*TagApi* | [**clearTagPermissions**](docs/TagApi.md#clearTagPermissions) | **DELETE** /tags/v2/{tagId}/pems | Clear tag permissions
*TagApi* | [**clearTagResources**](docs/TagApi.md#clearTagResources) | **DELETE** /tags/v2/{tagId}/resources | Clear all tagged resources
*TagApi* | [**deleteTag**](docs/TagApi.md#deleteTag) | **DELETE** /tags/v2/{tagId} | Delete tag
*TagApi* | [**deleteTagPermissionForUser**](docs/TagApi.md#deleteTagPermissionForUser) | **DELETE** /tags/v2/{tagId}/pems/{username} | Remove user tag permission
*TagApi* | [**getTagDetails**](docs/TagApi.md#getTagDetails) | **GET** /tags/v2/{tagId} | Tag Details
*TagApi* | [**getTagPermissionForUser**](docs/TagApi.md#getTagPermissionForUser) | **GET** /tags/v2/{tagId}/pems/{username} | List tag permissions for a user
*TagApi* | [**getTaggedResource**](docs/TagApi.md#getTaggedResource) | **GET** /tags/v2/{tagId}/resources/{uuid} | Get tagged item details
*TagApi* | [**listTagHistory**](docs/TagApi.md#listTagHistory) | **GET** /tags/v2/{tagId}/history | Tag history
*TagApi* | [**listTagPermissions**](docs/TagApi.md#listTagPermissions) | **GET** /tags/v2/{tagId}/pems | List permissionss set for a given tag id
*TagApi* | [**listTagResources**](docs/TagApi.md#listTagResources) | **GET** /tags/v2/{tagId}/resources | Tagged items
*TagApi* | [**listTags**](docs/TagApi.md#listTags) | **GET** /tags/v2 | Available tags
*TagApi* | [**removeTagResource**](docs/TagApi.md#removeTagResource) | **DELETE** /tags/v2/{tagId}/resources/{uuid} | Remove resource from tag
*TagApi* | [**updateTag**](docs/TagApi.md#updateTag) | **PUT** /tags/v2/{tagId} | Update tag
*TagApi* | [**updateTagPermission**](docs/TagApi.md#updateTagPermission) | **POST** /tags/v2/{tagId}/pems | Grant permission
*TagApi* | [**updateTagPermissionForUser**](docs/TagApi.md#updateTagPermissionForUser) | **POST** /tags/v2/{tagId}/pems/{username} | Update user permission on tag
*TagApi* | [**updateTagResource**](docs/TagApi.md#updateTagResource) | **PUT** /tags/v2/{tagId}/resources/{uuid} | Add resource to tag
*TenantsApi* | [**getTenantDetails**](docs/TenantsApi.md#getTenantDetails) | **GET** /tenants/v2/{codeOrUuid} | Resolve Tenant details
*TenantsApi* | [**listTenants**](docs/TenantsApi.md#listTenants) | **GET** /tenants/v2 | List all active tenants
*TransformsApi* | [**asyncTransform**](docs/TransformsApi.md#asyncTransform) | **POST** /transforms/v2/{transformId}/async/{owner}/{filePath} | 
*TransformsApi* | [**getTransform**](docs/TransformsApi.md#getTransform) | **GET** /transforms/v2/{transformId} | 
*TransformsApi* | [**listTransforms**](docs/TransformsApi.md#listTransforms) | **GET** /transforms/v2/ | 
*TransformsApi* | [**syncTransform**](docs/TransformsApi.md#syncTransform) | **POST** /transforms/v2/{transformId}/sync/{owner}/{filePath} | 
*UuidsApi* | [**createUuid**](docs/UuidsApi.md#createUuid) | **POST** /uuids/v2/ | 
*UuidsApi* | [**resolveUuid**](docs/UuidsApi.md#resolveUuid) | **GET** /uuids/v2/{uuid} | 
*UuidsApi* | [**resolveUuids**](docs/UuidsApi.md#resolveUuids) | **GET** /uuids/v2/ | 


## Documentation for Models

 - [ACL](docs/ACL.md)
 - [AbstractApplicationParameterValue](docs/AbstractApplicationParameterValue.md)
 - [AgaveNullResponse](docs/AgaveNullResponse.md)
 - [AgaveResponse](docs/AgaveResponse.md)
 - [Application](docs/Application.md)
 - [ApplicationAction](docs/ApplicationAction.md)
 - [ApplicationActionType](docs/ApplicationActionType.md)
 - [ApplicationArgument](docs/ApplicationArgument.md)
 - [ApplicationArgumentDataSemantics](docs/ApplicationArgumentDataSemantics.md)
 - [ApplicationArgumentDetails](docs/ApplicationArgumentDetails.md)
 - [ApplicationArgumentSemantics](docs/ApplicationArgumentSemantics.md)
 - [ApplicationArgumentValue](docs/ApplicationArgumentValue.md)
 - [ApplicationCloneAction](docs/ApplicationCloneAction.md)
 - [ApplicationDisableAction](docs/ApplicationDisableAction.md)
 - [ApplicationEnableAction](docs/ApplicationEnableAction.md)
 - [ApplicationExecutionType](docs/ApplicationExecutionType.md)
 - [ApplicationInput](docs/ApplicationInput.md)
 - [ApplicationOutput](docs/ApplicationOutput.md)
 - [ApplicationParallelism](docs/ApplicationParallelism.md)
 - [ApplicationParameter](docs/ApplicationParameter.md)
 - [ApplicationParameterBooleanValue](docs/ApplicationParameterBooleanValue.md)
 - [ApplicationParameterEnumValueItem](docs/ApplicationParameterEnumValueItem.md)
 - [ApplicationParameterFlagValue](docs/ApplicationParameterFlagValue.md)
 - [ApplicationParameterNumericValue](docs/ApplicationParameterNumericValue.md)
 - [ApplicationParameterStringValue](docs/ApplicationParameterStringValue.md)
 - [ApplicationParameterType](docs/ApplicationParameterType.md)
 - [ApplicationPublishAction](docs/ApplicationPublishAction.md)
 - [ApplicationSummary](docs/ApplicationSummary.md)
 - [ApplicationUnpublishAction](docs/ApplicationUnpublishAction.md)
 - [AuthenticationType](docs/AuthenticationType.md)
 - [BatchQueue](docs/BatchQueue.md)
 - [BatchSchedulerType](docs/BatchSchedulerType.md)
 - [Client](docs/Client.md)
 - [ClientAPISubscription](docs/ClientAPISubscription.md)
 - [ClientAPISubscriptionStatusType](docs/ClientAPISubscriptionStatusType.md)
 - [ClientRequest](docs/ClientRequest.md)
 - [ClientSubscriptionRequest](docs/ClientSubscriptionRequest.md)
 - [ClientSubscriptionTier](docs/ClientSubscriptionTier.md)
 - [EmptyApplicationResponse](docs/EmptyApplicationResponse.md)
 - [EmptyClientResponse](docs/EmptyClientResponse.md)
 - [EmptyRemoteFileResponse](docs/EmptyRemoteFileResponse.md)
 - [EmptySubscriptionResponse](docs/EmptySubscriptionResponse.md)
 - [EmptySystemResponse](docs/EmptySystemResponse.md)
 - [ExecutionSystem](docs/ExecutionSystem.md)
 - [FileAction](docs/FileAction.md)
 - [FileCopyAction](docs/FileCopyAction.md)
 - [FileHistoryResponse](docs/FileHistoryResponse.md)
 - [FileImportRequest](docs/FileImportRequest.md)
 - [FileInfo](docs/FileInfo.md)
 - [FileManagementActionType](docs/FileManagementActionType.md)
 - [FileMkdirAction](docs/FileMkdirAction.md)
 - [FileMoveAction](docs/FileMoveAction.md)
 - [FilePermission](docs/FilePermission.md)
 - [FilePermissionRequest](docs/FilePermissionRequest.md)
 - [FilePermissionStanza](docs/FilePermissionStanza.md)
 - [FileRenameAction](docs/FileRenameAction.md)
 - [FileType](docs/FileType.md)
 - [FilesStatusType](docs/FilesStatusType.md)
 - [Gender](docs/Gender.md)
 - [HistoryEvent](docs/HistoryEvent.md)
 - [InternalUser](docs/InternalUser.md)
 - [Job](docs/Job.md)
 - [JobAction](docs/JobAction.md)
 - [JobActionType](docs/JobActionType.md)
 - [JobHistory](docs/JobHistory.md)
 - [JobInputs](docs/JobInputs.md)
 - [JobParameters](docs/JobParameters.md)
 - [JobRequest](docs/JobRequest.md)
 - [JobResubmitAction](docs/JobResubmitAction.md)
 - [JobStatusSummary](docs/JobStatusSummary.md)
 - [JobStatusType](docs/JobStatusType.md)
 - [JobStopAction](docs/JobStopAction.md)
 - [JobSubmission](docs/JobSubmission.md)
 - [JobSummary](docs/JobSummary.md)
 - [Metadata](docs/Metadata.md)
 - [MetadataSchema](docs/MetadataSchema.md)
 - [MonitorCheckResultType](docs/MonitorCheckResultType.md)
 - [MonitoringTaskCheck](docs/MonitoringTaskCheck.md)
 - [MonitoringTaskDetails](docs/MonitoringTaskDetails.md)
 - [MonitoringTaskSummary](docs/MonitoringTaskSummary.md)
 - [MultipleApplicationResponse](docs/MultipleApplicationResponse.md)
 - [MultipleClientResponse](docs/MultipleClientResponse.md)
 - [MultiplePermissionResponse](docs/MultiplePermissionResponse.md)
 - [MultipleRemoteFileResponse](docs/MultipleRemoteFileResponse.md)
 - [MultipleSubscriptionResponse](docs/MultipleSubscriptionResponse.md)
 - [MultipleSystemResponse](docs/MultipleSystemResponse.md)
 - [MultipleSystemRoleResponse](docs/MultipleSystemRoleResponse.md)
 - [MultipleTransformResponse](docs/MultipleTransformResponse.md)
 - [Notification](docs/Notification.md)
 - [NotificationRequest](docs/NotificationRequest.md)
 - [NotificationResponse](docs/NotificationResponse.md)
 - [Permission](docs/Permission.md)
 - [PermissionRequest](docs/PermissionRequest.md)
 - [PermissionStanza](docs/PermissionStanza.md)
 - [PermissionType](docs/PermissionType.md)
 - [PostIt](docs/PostIt.md)
 - [PostItRequest](docs/PostItRequest.md)
 - [PostItRequestMethod](docs/PostItRequestMethod.md)
 - [Profile](docs/Profile.md)
 - [ProfileRequest](docs/ProfileRequest.md)
 - [SingleClientResponse](docs/SingleClientResponse.md)
 - [SingleInternalUserResponse](docs/SingleInternalUserResponse.md)
 - [SinglePostItResponse](docs/SinglePostItResponse.md)
 - [SingleProfileResponse](docs/SingleProfileResponse.md)
 - [SingleRemoteFileResponse](docs/SingleRemoteFileResponse.md)
 - [SingleSubscriptionResponse](docs/SingleSubscriptionResponse.md)
 - [SingleSystemResponse](docs/SingleSystemResponse.md)
 - [SingleTransformResponse](docs/SingleTransformResponse.md)
 - [StorageSystem](docs/StorageSystem.md)
 - [System](docs/System.md)
 - [SystemAction](docs/SystemAction.md)
 - [SystemActionType](docs/SystemActionType.md)
 - [SystemAuthConfig](docs/SystemAuthConfig.md)
 - [SystemAuthConfigServer](docs/SystemAuthConfigServer.md)
 - [SystemAuthConfigServerProtocolType](docs/SystemAuthConfigServerProtocolType.md)
 - [SystemCloneAction](docs/SystemCloneAction.md)
 - [SystemCredential](docs/SystemCredential.md)
 - [SystemCredentialType](docs/SystemCredentialType.md)
 - [SystemCredentialsResponse](docs/SystemCredentialsResponse.md)
 - [SystemExecutionType](docs/SystemExecutionType.md)
 - [SystemLoginAuthenticationType](docs/SystemLoginAuthenticationType.md)
 - [SystemLoginConfig](docs/SystemLoginConfig.md)
 - [SystemLoginProtocolType](docs/SystemLoginProtocolType.md)
 - [SystemPublishAction](docs/SystemPublishAction.md)
 - [SystemRequest](docs/SystemRequest.md)
 - [SystemRole](docs/SystemRole.md)
 - [SystemRoleRequest](docs/SystemRoleRequest.md)
 - [SystemRoleType](docs/SystemRoleType.md)
 - [SystemStatusType](docs/SystemStatusType.md)
 - [SystemStorageConfig](docs/SystemStorageConfig.md)
 - [SystemStorageProtocolType](docs/SystemStorageProtocolType.md)
 - [SystemSummary](docs/SystemSummary.md)
 - [SystemType](docs/SystemType.md)
 - [Tag](docs/Tag.md)
 - [TagHistory](docs/TagHistory.md)
 - [TagResource](docs/TagResource.md)
 - [TagSummary](docs/TagSummary.md)
 - [Tenant](docs/Tenant.md)
 - [TenantContact](docs/TenantContact.md)
 - [Term](docs/Term.md)
 - [Term3](docs/Term3.md)
 - [TransferTaskProgressSummary](docs/TransferTaskProgressSummary.md)
 - [Transform](docs/Transform.md)
 - [TransformDecoder](docs/TransformDecoder.md)
 - [TransformEncoder](docs/TransformEncoder.md)
 - [TransformRequest](docs/TransformRequest.md)
 - [UUIDRequest](docs/UUIDRequest.md)
 - [UUIDResolution](docs/UUIDResolution.md)
 - [UUIDSummary](docs/UUIDSummary.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### agaveApplication

- **Type**: OAuth
- **Flow**: application
- **Authorizatoin URL**: 
- **Scopes**: 
  - PRODUCTION: catchall scope for all core apis

### agaveBasic

- **Type**: HTTP basic authentication

### agaveImplicit

- **Type**: OAuth
- **Flow**: implicit
- **Authorizatoin URL**: https://public.agaveapi.co/authorization
- **Scopes**: 
  - PRODUCTION: catchall scope for all core apis

### agavePassword

- **Type**: OAuth
- **Flow**: password
- **Authorizatoin URL**: 
- **Scopes**: 
  - PRODUCTION: catchall scope for all core apis


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



