# UserManagementApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUser**](UserManagementApi.md#addUser) | **POST** /v1/admin/users | Add a user |
| [**addUsersToUserGroup**](UserManagementApi.md#addUsersToUserGroup) | **PUT** /v1/admin/user-groups/users | Assign users to user groups |
| [**assignPermissions**](UserManagementApi.md#assignPermissions) | **PUT** /v1/admin/permissions/users | Assign permissions to users |
| [**assignPermissionsToUserGroups**](UserManagementApi.md#assignPermissionsToUserGroups) | **PUT** /v1/admin/user-groups/permissions | Assign permissions to user groups |
| [**deleteUser**](UserManagementApi.md#deleteUser) | **DELETE** /v1/admin/users/{userId} | Delete a user |
| [**getAllPermissionsXLSX**](UserManagementApi.md#getAllPermissionsXLSX) | **GET** /v1/admin/users/reports/permissions-list | Retrieve a list of all permissions in XLSX format |
| [**getAllUserGroups**](UserManagementApi.md#getAllUserGroups) | **GET** /v1/admin/user-groups | Retrieve a list of all user groups |
| [**getAllUsers**](UserManagementApi.md#getAllUsers) | **GET** /v1/admin/users | Retrieve a list of all users |
| [**getApplicationLogsXLSX**](UserManagementApi.md#getApplicationLogsXLSX) | **GET** /v1/admin/users/reports/application-logs | Retrieve the Application Logs |
| [**getDataSecurityReportXLSX**](UserManagementApi.md#getDataSecurityReportXLSX) | **GET** /v1/admin/users/{userId}/reports/data-security | Retrieve the Data Security Report |
| [**getPermissionAssignedUsers**](UserManagementApi.md#getPermissionAssignedUsers) | **GET** /v1/admin/permissions/{permissionId}/users | Retrieve users that are assigned a specific permission |
| [**getProfileAssignmentsXLSX**](UserManagementApi.md#getProfileAssignmentsXLSX) | **GET** /v1/admin/users/reports/profile-assignments | Retrieve user profile assignments in XLSX format |
| [**getUserDetail**](UserManagementApi.md#getUserDetail) | **GET** /v1/admin/users/{userId} | Retrieve a user&#39;s details |
| [**getUserGroupUsers**](UserManagementApi.md#getUserGroupUsers) | **GET** /v1/admin/user-groups/{userGroupId}/users | Retrieve a list of user group users |
| [**getUserPermissionsXLSX**](UserManagementApi.md#getUserPermissionsXLSX) | **GET** /v1/admin/users/reports/permission-assignments | Retrieve user permissions in XLSX format |
| [**removePermissions**](UserManagementApi.md#removePermissions) | **DELETE** /v1/admin/permissions/users | Remove permissions from users |
| [**removeUsersFromUserGroup**](UserManagementApi.md#removeUsersFromUserGroup) | **DELETE** /v1/admin/user-groups/users | Remove users from user groups |
| [**revokePermissionsFromUserGroups**](UserManagementApi.md#revokePermissionsFromUserGroups) | **DELETE** /v1/admin/user-groups/permissions | Remove permissions from user groups |
| [**updateUser**](UserManagementApi.md#updateUser) | **PUT** /v1/admin/users/{userId} | Update a user |


<a name="addUser"></a>
# **addUser**
> UserCreationAPIResponseDTO addUser(userCreationAPIRequestDTO).tenantCode(tenantCode).execute();

Add a user

This API allows you to create a new user. Administrating tenant users can specify the tenant in which to add a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String username = "username_example"; // The user's username. This is typically the user's email, such as john@visier.com.
    String displayName = "displayName_example"; // An identifiable name to display within Visier. For example, \\\"John Smith\\\".
    String employeeId = "employeeId_example"; // If applicable, and if available, the user employee ID in the data.
    String accountEnabled = "accountEnabled_example"; // If false, the user account is disabled.
    String email = "email_example"; // The user's email. This is used if the user's email is different from their username. For example, \\\"john.doe@visier.com\\\".
    String tenantCode = "tenantCode_example"; // Specify the tenant to create a user in.
    try {
      UserCreationAPIResponseDTO result = client
              .userManagement
              .addUser()
              .username(username)
              .displayName(displayName)
              .employeeId(employeeId)
              .accountEnabled(accountEnabled)
              .email(email)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserId());
      System.out.println(result.getUsername());
      System.out.println(result.getDisplayName());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getAccountEnabled());
      System.out.println(result.getEmail());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#addUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserCreationAPIResponseDTO> response = client
              .userManagement
              .addUser()
              .username(username)
              .displayName(displayName)
              .employeeId(employeeId)
              .accountEnabled(accountEnabled)
              .email(email)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#addUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userCreationAPIRequestDTO** | [**UserCreationAPIRequestDTO**](UserCreationAPIRequestDTO.md)|  | |
| **tenantCode** | **String**| Specify the tenant to create a user in. | [optional] |

### Return type

[**UserCreationAPIResponseDTO**](UserCreationAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="addUsersToUserGroup"></a>
# **addUsersToUserGroup**
> SecurityAssignmentResponseDTO addUsersToUserGroup(usersToUserGroupsRequestDTO).execute();

Assign users to user groups

This API allows you to assign users to specific user groups.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    List<UsersToUserGroupRequestDTO> userGroups = Arrays.asList(); // A list of objects representing the user groups and users to assign or remove.
    try {
      SecurityAssignmentResponseDTO result = client
              .userManagement
              .addUsersToUserGroup()
              .userGroups(userGroups)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#addUsersToUserGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SecurityAssignmentResponseDTO> response = client
              .userManagement
              .addUsersToUserGroup()
              .userGroups(userGroups)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#addUsersToUserGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usersToUserGroupsRequestDTO** | [**UsersToUserGroupsRequestDTO**](UsersToUserGroupsRequestDTO.md)|  | |

### Return type

[**SecurityAssignmentResponseDTO**](SecurityAssignmentResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="assignPermissions"></a>
# **assignPermissions**
> AssignRevokePermissionsResponseDTO assignPermissions(assignRevokePermissionsRequest).execute();

Assign permissions to users

This API allows you to assign a permission to specific users. Administrating tenant users can assign permissions  to users in the administrating tenant and in the analytic tenants those users belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    List<Permission> permissions = Arrays.asList(); // A list of objects representing the permissions to assign to or remove from users.
    try {
      AssignRevokePermissionsResponseDTO result = client
              .userManagement
              .assignPermissions()
              .permissions(permissions)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#assignPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssignRevokePermissionsResponseDTO> response = client
              .userManagement
              .assignPermissions()
              .permissions(permissions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#assignPermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assignRevokePermissionsRequest** | [**AssignRevokePermissionsRequest**](AssignRevokePermissionsRequest.md)|  | |

### Return type

[**AssignRevokePermissionsResponseDTO**](AssignRevokePermissionsResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="assignPermissionsToUserGroups"></a>
# **assignPermissionsToUserGroups**
> PermissionsToUserGroupForTenantDTO assignPermissionsToUserGroups(permissionsToUserGroupsRequestDTO).execute();

Assign permissions to user groups

This API allows you to assign a permission to specific user groups. This assigns the permission to all users in the user group.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    List<PermissionsToUserGroupRequestDTO> userGroups = Arrays.asList(); // A list of objects representing the user groups and permissions to assign or remove.
    try {
      PermissionsToUserGroupForTenantDTO result = client
              .userManagement
              .assignPermissionsToUserGroups()
              .userGroups(userGroups)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
      System.out.println(result.getUserGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#assignPermissionsToUserGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionsToUserGroupForTenantDTO> response = client
              .userManagement
              .assignPermissionsToUserGroups()
              .userGroups(userGroups)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#assignPermissionsToUserGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **permissionsToUserGroupsRequestDTO** | [**PermissionsToUserGroupsRequestDTO**](PermissionsToUserGroupsRequestDTO.md)|  | |

### Return type

[**PermissionsToUserGroupForTenantDTO**](PermissionsToUserGroupForTenantDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="deleteUser"></a>
# **deleteUser**
> Object deleteUser(userId).tenantCode(tenantCode).execute();

Delete a user

This API allows you to delete an existing user. Administrating tenant users can specify the tenant from which to delete a user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String userId = "userId_example"; // The ID of the user you want to delete.
    String tenantCode = "tenantCode_example"; // Specify the tenant to delete a user in.
    try {
      Object result = client
              .userManagement
              .deleteUser(userId)
              .tenantCode(tenantCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#deleteUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Object> response = client
              .userManagement
              .deleteUser(userId)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#deleteUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The ID of the user you want to delete. | |
| **tenantCode** | **String**| Specify the tenant to delete a user in. | [optional] |

### Return type

**Object**

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getAllPermissionsXLSX"></a>
# **getAllPermissionsXLSX**
> File getAllPermissionsXLSX().tenantCode(tenantCode).execute();

Retrieve a list of all permissions in XLSX format

This API allows you to export the list of permissions in a tenant. This report includes the permission name,  permission description, and permission ID for all permissions in the tenant.   Administrating tenant users can export permissions lists for the administrating tenant and the analytic tenants  those users belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve permissions from.
    try {
      File result = client
              .userManagement
              .getAllPermissionsXLSX()
              .tenantCode(tenantCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getAllPermissionsXLSX");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .userManagement
              .getAllPermissionsXLSX()
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getAllPermissionsXLSX");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| Specify the tenant to retrieve permissions from. | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An XLSX file. |  -  |
| **0** | Default error response |  -  |

<a name="getAllUserGroups"></a>
# **getAllUserGroups**
> UserGroupsGetAPIResponseDTO getAllUserGroups().tenantCode(tenantCode).limit(limit).start(start).execute();

Retrieve a list of all user groups

This API allows you to retrieve the full list of user groups in a tenant.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve the list of user groups from.
    Integer limit = 56; // The number of results to return. The maximum number of users to retrieve is 1000.
    Integer start = 56; // The index to start retrieving results from, also known as offset.
    try {
      UserGroupsGetAPIResponseDTO result = client
              .userManagement
              .getAllUserGroups()
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserGroups());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getAllUserGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserGroupsGetAPIResponseDTO> response = client
              .userManagement
              .getAllUserGroups()
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getAllUserGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| Specify the tenant to retrieve the list of user groups from. | [optional] |
| **limit** | **Integer**| The number of results to return. The maximum number of users to retrieve is 1000. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. | [optional] |

### Return type

[**UserGroupsGetAPIResponseDTO**](UserGroupsGetAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getAllUsers"></a>
# **getAllUsers**
> AllUsersGetAPIResponseDTO getAllUsers().tenantCode(tenantCode).assignedProfiles(assignedProfiles).assignedPermissions(assignedPermissions).assignedUserGroups(assignedUserGroups).limit(limit).start(start).execute();

Retrieve a list of all users

This API allows you to retrieve the full list of users and their current states.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve a list of users from.
    Boolean assignedProfiles = true; // If true, the response returns a list of the user's assigned profiles.
    Boolean assignedPermissions = true; // If true, the response returns the user's assigned permissions.
    Boolean assignedUserGroups = true; // If true, the response returns the user's assigned user groups.
    Integer limit = 56; // The number of results to return. The maximum number of users to retrieve is 1000.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    try {
      AllUsersGetAPIResponseDTO result = client
              .userManagement
              .getAllUsers()
              .tenantCode(tenantCode)
              .assignedProfiles(assignedProfiles)
              .assignedPermissions(assignedPermissions)
              .assignedUserGroups(assignedUserGroups)
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getUsers());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getAllUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AllUsersGetAPIResponseDTO> response = client
              .userManagement
              .getAllUsers()
              .tenantCode(tenantCode)
              .assignedProfiles(assignedProfiles)
              .assignedPermissions(assignedPermissions)
              .assignedUserGroups(assignedUserGroups)
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getAllUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| Specify the tenant to retrieve a list of users from. | [optional] |
| **assignedProfiles** | **Boolean**| If true, the response returns a list of the user&#39;s assigned profiles. | [optional] |
| **assignedPermissions** | **Boolean**| If true, the response returns the user&#39;s assigned permissions. | [optional] |
| **assignedUserGroups** | **Boolean**| If true, the response returns the user&#39;s assigned user groups. | [optional] |
| **limit** | **Integer**| The number of results to return. The maximum number of users to retrieve is 1000. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |

### Return type

[**AllUsersGetAPIResponseDTO**](AllUsersGetAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getApplicationLogsXLSX"></a>
# **getApplicationLogsXLSX**
> File getApplicationLogsXLSX().startTime(startTime).endTime(endTime).tenantCode(tenantCode).execute();

Retrieve the Application Logs

This API allows you to export the Application Logs for a tenant. The Application Logs track information about your  users and how they are using the application. Performing regular audits will help you identify potential security  issues and keep your data safe. As part of user management, download the Application Logs to monitor user activity  and logon events to ensure your users are performing authorized activities.   Administrating tenant users can export application logs for the administrating tenant and the analytic tenants  those users belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String startTime = "startTime_example"; // An inclusive date-time to start retrieving Application Logs from.
    String endTime = "endTime_example"; // An exclusive date-time to stop retrieving Application Logs from.
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve Application Logs from.
    try {
      File result = client
              .userManagement
              .getApplicationLogsXLSX()
              .startTime(startTime)
              .endTime(endTime)
              .tenantCode(tenantCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getApplicationLogsXLSX");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .userManagement
              .getApplicationLogsXLSX()
              .startTime(startTime)
              .endTime(endTime)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getApplicationLogsXLSX");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **startTime** | **String**| An inclusive date-time to start retrieving Application Logs from. | [optional] |
| **endTime** | **String**| An exclusive date-time to stop retrieving Application Logs from. | [optional] |
| **tenantCode** | **String**| Specify the tenant to retrieve Application Logs from. | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An XLSX file. |  -  |
| **0** | Default error response |  -  |

<a name="getDataSecurityReportXLSX"></a>
# **getDataSecurityReportXLSX**
> File getDataSecurityReportXLSX(userId).tenantCode(tenantCode).execute();

Retrieve the Data Security Report

This API allows you to export the data security report of a user. The Data Security Report provides information  about a specific user to see which populations and properties that user has access to as a result of the  permissions assigned to them.   Administrating tenant users can export the report for users in the administrating tenant and the analytic  tenants those users belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String userId = "userId_example"; // The ID of the user to retrieve the report for.
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve the Data Security Report from.
    try {
      File result = client
              .userManagement
              .getDataSecurityReportXLSX(userId)
              .tenantCode(tenantCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getDataSecurityReportXLSX");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .userManagement
              .getDataSecurityReportXLSX(userId)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getDataSecurityReportXLSX");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The ID of the user to retrieve the report for. | |
| **tenantCode** | **String**| Specify the tenant to retrieve the Data Security Report from. | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An XLSX file. |  -  |
| **0** | Default error response |  -  |

<a name="getPermissionAssignedUsers"></a>
# **getPermissionAssignedUsers**
> PermissionAssignedUsersDTO getPermissionAssignedUsers(permissionId).includeUserGroups(includeUserGroups).tenantFilter(tenantFilter).limit(limit).start(start).execute();

Retrieve users that are assigned a specific permission

This API allows you to retrieve all the users that are assigned a specified permission. You must know the ID  of the permission you want to retrieve users for.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String permissionId = "permissionId_example"; // The unique identifier of the permission you want to retrieve users for.
    Boolean includeUserGroups = true; // If true, the response returns a list of all users that are assigned the permission, including users that are  assigned the permission through a user group. If false, the response returns a list of the users that are directly assigned the permission.
    String tenantFilter = "tenantFilter_example"; // Specify the tenant to retrieve the list of users from.
    Integer limit = 56; // The number of results to return. The maximum number of tenants to retrieve is 100.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    try {
      PermissionAssignedUsersDTO result = client
              .userManagement
              .getPermissionAssignedUsers(permissionId)
              .includeUserGroups(includeUserGroups)
              .tenantFilter(tenantFilter)
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getPermissionAssignedUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionAssignedUsersDTO> response = client
              .userManagement
              .getPermissionAssignedUsers(permissionId)
              .includeUserGroups(includeUserGroups)
              .tenantFilter(tenantFilter)
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getPermissionAssignedUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **permissionId** | **String**| The unique identifier of the permission you want to retrieve users for. | |
| **includeUserGroups** | **Boolean**| If true, the response returns a list of all users that are assigned the permission, including users that are  assigned the permission through a user group. If false, the response returns a list of the users that are directly assigned the permission. | [optional] |
| **tenantFilter** | **String**| Specify the tenant to retrieve the list of users from. | [optional] |
| **limit** | **Integer**| The number of results to return. The maximum number of tenants to retrieve is 100. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |

### Return type

[**PermissionAssignedUsersDTO**](PermissionAssignedUsersDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getProfileAssignmentsXLSX"></a>
# **getProfileAssignmentsXLSX**
> File getProfileAssignmentsXLSX().tenantCode(tenantCode).execute();

Retrieve user profile assignments in XLSX format

This API allows you to export the profiles assigned to each user. This report details the profiles assigned to  each user and the profile validity period.   Administrating tenant users can export profile assignments for the administrating tenant and the analytic tenants  those users belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve profile assignments from.
    try {
      File result = client
              .userManagement
              .getProfileAssignmentsXLSX()
              .tenantCode(tenantCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getProfileAssignmentsXLSX");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .userManagement
              .getProfileAssignmentsXLSX()
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getProfileAssignmentsXLSX");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| Specify the tenant to retrieve profile assignments from. | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An XLSX file. |  -  |
| **0** | Default error response |  -  |

<a name="getUserDetail"></a>
# **getUserDetail**
> UserGetAPIResponseDTO getUserDetail(userId).tenantCode(tenantCode).assignedProfiles(assignedProfiles).assignedPermissions(assignedPermissions).assignedUserGroups(assignedUserGroups).execute();

Retrieve a user&#39;s details

This API allows you to retrieve all details for a specified user.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String userId = "userId_example"; // The ID of the user you want to retrieve.
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve a user from.
    Boolean assignedProfiles = true; // If true, the response returns a list of the user's assigned profiles.
    Boolean assignedPermissions = true; // If true, the response returns the user's assigned permissions.
    Boolean assignedUserGroups = true; // If true, the response returns the user's assigned user groups.
    try {
      UserGetAPIResponseDTO result = client
              .userManagement
              .getUserDetail(userId)
              .tenantCode(tenantCode)
              .assignedProfiles(assignedProfiles)
              .assignedPermissions(assignedPermissions)
              .assignedUserGroups(assignedUserGroups)
              .execute();
      System.out.println(result);
      System.out.println(result.getUserId());
      System.out.println(result.getUsername());
      System.out.println(result.getDisplayName());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getAccountEnabled());
      System.out.println(result.getProfiles());
      System.out.println(result.getPermissions());
      System.out.println(result.getUserGroups());
      System.out.println(result.getLastLogin());
      System.out.println(result.getEmail());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getUserDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserGetAPIResponseDTO> response = client
              .userManagement
              .getUserDetail(userId)
              .tenantCode(tenantCode)
              .assignedProfiles(assignedProfiles)
              .assignedPermissions(assignedPermissions)
              .assignedUserGroups(assignedUserGroups)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getUserDetail");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The ID of the user you want to retrieve. | |
| **tenantCode** | **String**| Specify the tenant to retrieve a user from. | [optional] |
| **assignedProfiles** | **Boolean**| If true, the response returns a list of the user&#39;s assigned profiles. | [optional] |
| **assignedPermissions** | **Boolean**| If true, the response returns the user&#39;s assigned permissions. | [optional] |
| **assignedUserGroups** | **Boolean**| If true, the response returns the user&#39;s assigned user groups. | [optional] |

### Return type

[**UserGetAPIResponseDTO**](UserGetAPIResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getUserGroupUsers"></a>
# **getUserGroupUsers**
> UserGroupsUsersDTO getUserGroupUsers(userGroupId).tenantFilter(tenantFilter).limit(limit).start(start).execute();

Retrieve a list of user group users

This API allows you to retrieve the list of users explicitly assigned to a user group. Users that are implicitly  included in the user group through the user group&#39;s dynamic filters are not returned by this endpoint.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String userGroupId = "userGroupId_example"; // The ID of user group.
    String tenantFilter = "tenantFilter_example"; // Specifies the tenant to retrieve the list of users from.
    Integer limit = 56; // The number of results to return. The maximum number of tenants to retrieve is 100.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    try {
      UserGroupsUsersDTO result = client
              .userManagement
              .getUserGroupUsers(userGroupId)
              .tenantFilter(tenantFilter)
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getUserGroupUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserGroupsUsersDTO> response = client
              .userManagement
              .getUserGroupUsers(userGroupId)
              .tenantFilter(tenantFilter)
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getUserGroupUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userGroupId** | **String**| The ID of user group. | |
| **tenantFilter** | **String**| Specifies the tenant to retrieve the list of users from. | [optional] |
| **limit** | **Integer**| The number of results to return. The maximum number of tenants to retrieve is 100. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |

### Return type

[**UserGroupsUsersDTO**](UserGroupsUsersDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getUserPermissionsXLSX"></a>
# **getUserPermissionsXLSX**
> File getUserPermissionsXLSX().tenantCode(tenantCode).execute();

Retrieve user permissions in XLSX format

This API allows you to export the user permission assignments for a tenant. The permission assignments report  provides a summary of the permissions your users have been assigned and how each permission is being used across  your user base, as well as the users that do not have any permissions assigned to them.   Administrating tenant users can export permission assignments for the administrating tenant and the analytic  tenants those users belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String tenantCode = "tenantCode_example"; // Specify the tenant to retrieve the permission assignments report from.
    try {
      File result = client
              .userManagement
              .getUserPermissionsXLSX()
              .tenantCode(tenantCode)
              .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getUserPermissionsXLSX");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<File> response = client
              .userManagement
              .getUserPermissionsXLSX()
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#getUserPermissionsXLSX");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tenantCode** | **String**| Specify the tenant to retrieve the permission assignments report from. | [optional] |

### Return type

[**File**](File.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.ms-excel, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | An XLSX file. |  -  |
| **0** | Default error response |  -  |

<a name="removePermissions"></a>
# **removePermissions**
> AssignRevokePermissionsResponseDTO removePermissions(assignRevokePermissionsRequest).execute();

Remove permissions from users

This API allows you to remove a permission from specific users. Administrating tenant users can remove permissions  from users in the administrating tenant and in the analytic tenants those users belong to.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    List<Permission> permissions = Arrays.asList(); // A list of objects representing the permissions to assign to or remove from users.
    try {
      AssignRevokePermissionsResponseDTO result = client
              .userManagement
              .removePermissions()
              .permissions(permissions)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#removePermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<AssignRevokePermissionsResponseDTO> response = client
              .userManagement
              .removePermissions()
              .permissions(permissions)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#removePermissions");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assignRevokePermissionsRequest** | [**AssignRevokePermissionsRequest**](AssignRevokePermissionsRequest.md)|  | |

### Return type

[**AssignRevokePermissionsResponseDTO**](AssignRevokePermissionsResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="removeUsersFromUserGroup"></a>
# **removeUsersFromUserGroup**
> SecurityAssignmentResponseDTO removeUsersFromUserGroup(usersToUserGroupsRequestDTO).execute();

Remove users from user groups

This API allows you to remove users from specific user groups.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    List<UsersToUserGroupRequestDTO> userGroups = Arrays.asList(); // A list of objects representing the user groups and users to assign or remove.
    try {
      SecurityAssignmentResponseDTO result = client
              .userManagement
              .removeUsersFromUserGroup()
              .userGroups(userGroups)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#removeUsersFromUserGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<SecurityAssignmentResponseDTO> response = client
              .userManagement
              .removeUsersFromUserGroup()
              .userGroups(userGroups)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#removeUsersFromUserGroup");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usersToUserGroupsRequestDTO** | [**UsersToUserGroupsRequestDTO**](UsersToUserGroupsRequestDTO.md)|  | |

### Return type

[**SecurityAssignmentResponseDTO**](SecurityAssignmentResponseDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="revokePermissionsFromUserGroups"></a>
# **revokePermissionsFromUserGroups**
> PermissionsToUserGroupForTenantDTO revokePermissionsFromUserGroups(permissionsToUserGroupsRequestDTO).execute();

Remove permissions from user groups

This API allows you to remove a permission from specific user groups.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    List<PermissionsToUserGroupRequestDTO> userGroups = Arrays.asList(); // A list of objects representing the user groups and permissions to assign or remove.
    try {
      PermissionsToUserGroupForTenantDTO result = client
              .userManagement
              .revokePermissionsFromUserGroups()
              .userGroups(userGroups)
              .execute();
      System.out.println(result);
      System.out.println(result.getTenantCode());
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
      System.out.println(result.getUserGroups());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#revokePermissionsFromUserGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PermissionsToUserGroupForTenantDTO> response = client
              .userManagement
              .revokePermissionsFromUserGroups()
              .userGroups(userGroups)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#revokePermissionsFromUserGroups");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **permissionsToUserGroupsRequestDTO** | [**PermissionsToUserGroupsRequestDTO**](PermissionsToUserGroupsRequestDTO.md)|  | |

### Return type

[**PermissionsToUserGroupForTenantDTO**](PermissionsToUserGroupForTenantDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="updateUser"></a>
# **updateUser**
> UserUpdateAPIRequestDTO updateUser(userId, userUpdateAPIRequestDTO).tenantCode(tenantCode).execute();

Update a user

This API allows you to update an existing user&#39;s information, such as their display name or if the user is enabled in Visier.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierUserManagement client = new VisierUserManagement(configuration);
    String userId = "userId_example"; // The ID of the user you want to update.
    String displayName = "displayName_example"; // An identifiable name to display within Visier. For example, \\\"John Smith\\\".
    String employeeId = "employeeId_example"; // If applicable, and if available, the user employee ID in the data.
    String accountEnabled = "accountEnabled_example"; // If true, the user account is enabled.
    String email = "email_example"; // The user's email address.
    String tenantCode = "tenantCode_example"; // Specify the tenant to update a user in.
    try {
      UserUpdateAPIRequestDTO result = client
              .userManagement
              .updateUser(userId)
              .displayName(displayName)
              .employeeId(employeeId)
              .accountEnabled(accountEnabled)
              .email(email)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getDisplayName());
      System.out.println(result.getEmployeeId());
      System.out.println(result.getAccountEnabled());
      System.out.println(result.getEmail());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#updateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UserUpdateAPIRequestDTO> response = client
              .userManagement
              .updateUser(userId)
              .displayName(displayName)
              .employeeId(employeeId)
              .accountEnabled(accountEnabled)
              .email(email)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementApi#updateUser");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The ID of the user you want to update. | |
| **userUpdateAPIRequestDTO** | [**UserUpdateAPIRequestDTO**](UserUpdateAPIRequestDTO.md)|  | |
| **tenantCode** | **String**| Specify the tenant to update a user in. | [optional] |

### Return type

[**UserUpdateAPIRequestDTO**](UserUpdateAPIRequestDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

