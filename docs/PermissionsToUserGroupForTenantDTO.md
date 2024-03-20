

# PermissionsToUserGroupForTenantDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantCode** | **String** | The unique identifier associated with the tenant. |  [optional] |
|**status** | **String** | The state of the permission assignment or removal. Valid values are Succeed or Failed. |  [optional] |
|**message** | **String** | A detailed description of the request outcome, if available. |  [optional] |
|**userGroups** | [**List&lt;UserGroupGetAPIResponseDTO&gt;**](UserGroupGetAPIResponseDTO.md) | A list of objects representing user groups and the permissions to assign to or remove from them. |  [optional] |



