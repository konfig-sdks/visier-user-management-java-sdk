

# ProfileAssignedForLocalTenantDTO


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**profileId** | **String** | The unique identifier associated with the profile. |  [optional] |
|**displayName** | **String** | An identifiable profile name to display in Visier, such as \&quot;Partner Service Manager\&quot;. |  [optional] |
|**validityStartTime** | **String** | An inclusive date-time when this profile is active. |  [optional] |
|**validityEndTime** | **String** | An exclusive date-time when this profile is no longer active. |  [optional] |
|**capabilities** | [**List&lt;CapabilitiesDTO&gt;**](CapabilitiesDTO.md) | A list of objects representing the access that this profile has for the capabilities of this profile. |  [optional] |
|**additionalCapabilities** | [**AdditionalCapabilitiesDTO**](AdditionalCapabilitiesDTO.md) | A list of the additional capabilities that are assigned to this profile. |  [optional] |



