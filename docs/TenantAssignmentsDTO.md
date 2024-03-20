

# TenantAssignmentsDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**tenantCode** | **String** | The unique identifier associated with the tenant. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | The state of the user group assignment. Valid values are Succeed or Failed. |  [optional] |
|**message** | **String** | A detailed description of the request outcome, if available. |  [optional] |
|**assignments** | [**List&lt;UserSecurityAssignmentsDTO&gt;**](UserSecurityAssignmentsDTO.md) | A list of objects representing the user group and user assignments. |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;Unknown&quot; |
| SUCCEED | &quot;Succeed&quot; |
| FAILED | &quot;Failed&quot; |



