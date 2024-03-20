

# PermissionAssignedUsersDTO

Users that are assigned a specific permission.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenants** | [**List&lt;PermissionAssignedByTenantDTO&gt;**](PermissionAssignedByTenantDTO.md) | A list of objects representing the users that are assigned the specific permission, organized by the tenants the users belong to. |  [optional] |
|**limit** | **Integer** | The number of results to return. The maximum number of tenants to retrieve is 100. |  [optional] |
|**start** | **Integer** | The index to start retrieving results from, also known as offset. The index begins at 0. |  [optional] |



