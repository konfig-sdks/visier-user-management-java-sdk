

# PermissionAssignedUserDTO

The user and the method through which the user was assigned the permission.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **String** | The unique identifier associated with the user. |  [optional] |
|**username** | **String** | The user&#39;s username. This is typically the user&#39;s email, such as john@visier.com. |  [optional] |
|**permissionFrom** | **String** | The method through which the user was assigned the permission. The permission may be assigned through  the following options:   - User: The permission was directly assigned to the user.   - UserGroup: The permission was assigned because the user belongs to a user group that is assigned the permission.   - UserAndUserGroup: The permission was directly assigned to the user and assigned because the user belongs to     a user group that is assigned the permission. |  [optional] |



