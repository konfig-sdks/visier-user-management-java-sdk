

# AssignRevokePermissionByTenantDTO

The permissions organized by tenant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantCode** | **String** | The unique identifier associated with the tenant. |  [optional] |
|**permissions** | [**List&lt;AssignRevokePermissionByPermissionDTO&gt;**](AssignRevokePermissionByPermissionDTO.md) | A list of objects representing the assigned or removed permissions. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The state of the permission assignment. Valid values are Succeed or Failed. |  [optional] |
|**message** | **String** | A detailed description of the request outcome, if available. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SUCCEED | &quot;Succeed&quot; |
| FAILED | &quot;Failed&quot; |



