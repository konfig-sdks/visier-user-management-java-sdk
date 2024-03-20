

# UserGetAPIResponseDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | The unique identifier associated with the user. |  [optional] |
|**username** | **String** | The user&#39;s username. This is typically the user&#39;s email, such as john@jupiter.com. |  [optional] |
|**displayName** | **String** | An identifiable name to display within Visier. For example, \&quot;John Smith\&quot;. |  [optional] |
|**employeeId** | **String** | If applicable, and if available, the user employee ID in the data. |  [optional] |
|**accountEnabled** | **Boolean** | If false, the user account is disabled. |  [optional] |
|**profiles** | [**AllProfileAssignedForLocalTenantDTO**](AllProfileAssignedForLocalTenantDTO.md) | A list of objects representing the list of available profiles. |  [optional] |
|**permissions** | [**AllPermissionsAssignedForLocalTenantDTO**](AllPermissionsAssignedForLocalTenantDTO.md) | A list of objects representing the user&#39;s permissions. |  [optional] |
|**userGroups** | [**AllUserGroupsAssignedForLocalTenantDTO**](AllUserGroupsAssignedForLocalTenantDTO.md) | A list of objects representing the available user groups. |  [optional] |
|**lastLogin** | [**LastLoginDTO**](LastLoginDTO.md) | An object that represents the time that the user last logged into Visier. |  [optional] |
|**email** | **String** | The user&#39;s email address. |  [optional] |



