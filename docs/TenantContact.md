
# TenantContact

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Full name of the contact |  [optional]
**email** | **String** | The base url for all tenant requests. This should always be SSL enabled. |  [optional]
**url** | **String** | The code by which this tenant is known, eg. agave.prod |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of contact this user represents. |  [optional]
**primary** | **Boolean** | Whether the contact is the primary contact for the tenant. |  [optional]
**contact** | [**TenantContact**](TenantContact.md) |  |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
ADMIN | &quot;admin&quot;
SUPPORT | &quot;support&quot;
EDUCATION | &quot;education&quot;
MEDIA | &quot;media&quot;
TRAINING | &quot;training&quot;
SECURITY | &quot;security&quot;



