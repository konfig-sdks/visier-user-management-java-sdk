<div align="center">

[![Visit Visier](./header.png)](https://visier.com)

# [Visier](https://visier.com)

Visier APIs for managing users within an organization

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Visier&serviceName=UserManagement&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>visier-user-management-java-sdk</artifactId>
  <version>22222222.99201.1200</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:visier-user-management-java-sdk:22222222.99201.1200"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/visier-user-management-java-sdk-22222222.99201.1200.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://vanity.api.visier.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*UserManagementApi* | [**addUser**](docs/UserManagementApi.md#addUser) | **POST** /v1/admin/users | Add a user
*UserManagementApi* | [**addUsersToUserGroup**](docs/UserManagementApi.md#addUsersToUserGroup) | **PUT** /v1/admin/user-groups/users | Assign users to user groups
*UserManagementApi* | [**assignPermissions**](docs/UserManagementApi.md#assignPermissions) | **PUT** /v1/admin/permissions/users | Assign permissions to users
*UserManagementApi* | [**assignPermissionsToUserGroups**](docs/UserManagementApi.md#assignPermissionsToUserGroups) | **PUT** /v1/admin/user-groups/permissions | Assign permissions to user groups
*UserManagementApi* | [**deleteUser**](docs/UserManagementApi.md#deleteUser) | **DELETE** /v1/admin/users/{userId} | Delete a user
*UserManagementApi* | [**getAllPermissionsXLSX**](docs/UserManagementApi.md#getAllPermissionsXLSX) | **GET** /v1/admin/users/reports/permissions-list | Retrieve a list of all permissions in XLSX format
*UserManagementApi* | [**getAllUserGroups**](docs/UserManagementApi.md#getAllUserGroups) | **GET** /v1/admin/user-groups | Retrieve a list of all user groups
*UserManagementApi* | [**getAllUsers**](docs/UserManagementApi.md#getAllUsers) | **GET** /v1/admin/users | Retrieve a list of all users
*UserManagementApi* | [**getApplicationLogsXLSX**](docs/UserManagementApi.md#getApplicationLogsXLSX) | **GET** /v1/admin/users/reports/application-logs | Retrieve the Application Logs
*UserManagementApi* | [**getDataSecurityReportXLSX**](docs/UserManagementApi.md#getDataSecurityReportXLSX) | **GET** /v1/admin/users/{userId}/reports/data-security | Retrieve the Data Security Report
*UserManagementApi* | [**getPermissionAssignedUsers**](docs/UserManagementApi.md#getPermissionAssignedUsers) | **GET** /v1/admin/permissions/{permissionId}/users | Retrieve users that are assigned a specific permission
*UserManagementApi* | [**getProfileAssignmentsXLSX**](docs/UserManagementApi.md#getProfileAssignmentsXLSX) | **GET** /v1/admin/users/reports/profile-assignments | Retrieve user profile assignments in XLSX format
*UserManagementApi* | [**getUserDetail**](docs/UserManagementApi.md#getUserDetail) | **GET** /v1/admin/users/{userId} | Retrieve a user&#39;s details
*UserManagementApi* | [**getUserGroupUsers**](docs/UserManagementApi.md#getUserGroupUsers) | **GET** /v1/admin/user-groups/{userGroupId}/users | Retrieve a list of user group users
*UserManagementApi* | [**getUserPermissionsXLSX**](docs/UserManagementApi.md#getUserPermissionsXLSX) | **GET** /v1/admin/users/reports/permission-assignments | Retrieve user permissions in XLSX format
*UserManagementApi* | [**removePermissions**](docs/UserManagementApi.md#removePermissions) | **DELETE** /v1/admin/permissions/users | Remove permissions from users
*UserManagementApi* | [**removeUsersFromUserGroup**](docs/UserManagementApi.md#removeUsersFromUserGroup) | **DELETE** /v1/admin/user-groups/users | Remove users from user groups
*UserManagementApi* | [**revokePermissionsFromUserGroups**](docs/UserManagementApi.md#revokePermissionsFromUserGroups) | **DELETE** /v1/admin/user-groups/permissions | Remove permissions from user groups
*UserManagementApi* | [**updateUser**](docs/UserManagementApi.md#updateUser) | **PUT** /v1/admin/users/{userId} | Update a user
*UserManagementV2Api* | [**addUsers**](docs/UserManagementV2Api.md#addUsers) | **POST** /v2/admin/users | Add users
*UserManagementV2Api* | [**deleteUsers**](docs/UserManagementV2Api.md#deleteUsers) | **DELETE** /v2/admin/users | Delete users
*UserManagementV2Api* | [**updateUsers**](docs/UserManagementV2Api.md#updateUsers) | **PUT** /v2/admin/users | Update users


## Documentation for Models

 - [AdditionalCapabilitiesDTO](docs/AdditionalCapabilitiesDTO.md)
 - [AllPermissionsAssignedForLocalTenantDTO](docs/AllPermissionsAssignedForLocalTenantDTO.md)
 - [AllProfileAssignedForLocalTenantDTO](docs/AllProfileAssignedForLocalTenantDTO.md)
 - [AllUserGroupsAssignedForLocalTenantDTO](docs/AllUserGroupsAssignedForLocalTenantDTO.md)
 - [AllUsersGetAPIResponseDTO](docs/AllUsersGetAPIResponseDTO.md)
 - [AssignRevokePermissionByPermissionDTO](docs/AssignRevokePermissionByPermissionDTO.md)
 - [AssignRevokePermissionByTenantDTO](docs/AssignRevokePermissionByTenantDTO.md)
 - [AssignRevokePermissionByUserDTO](docs/AssignRevokePermissionByUserDTO.md)
 - [AssignRevokePermissionsRequest](docs/AssignRevokePermissionsRequest.md)
 - [AssignRevokePermissionsResponseDTO](docs/AssignRevokePermissionsResponseDTO.md)
 - [CapabilitiesDTO](docs/CapabilitiesDTO.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [LastLoginDTO](docs/LastLoginDTO.md)
 - [Permission](docs/Permission.md)
 - [PermissionAssignedByTenantDTO](docs/PermissionAssignedByTenantDTO.md)
 - [PermissionAssignedForLocalTenantDTO](docs/PermissionAssignedForLocalTenantDTO.md)
 - [PermissionAssignedUserDTO](docs/PermissionAssignedUserDTO.md)
 - [PermissionAssignedUsersDTO](docs/PermissionAssignedUsersDTO.md)
 - [PermissionResponseDTO](docs/PermissionResponseDTO.md)
 - [PermissionsToUserGroupForTenantDTO](docs/PermissionsToUserGroupForTenantDTO.md)
 - [PermissionsToUserGroupRequestDTO](docs/PermissionsToUserGroupRequestDTO.md)
 - [PermissionsToUserGroupsRequestDTO](docs/PermissionsToUserGroupsRequestDTO.md)
 - [ProfileAssignedForLocalTenantDTO](docs/ProfileAssignedForLocalTenantDTO.md)
 - [SecurityAssignmentResponseDTO](docs/SecurityAssignmentResponseDTO.md)
 - [SimpleUserDTO](docs/SimpleUserDTO.md)
 - [Status](docs/Status.md)
 - [TenantAssignmentsDTO](docs/TenantAssignmentsDTO.md)
 - [UserCreationAPIRequestDTO](docs/UserCreationAPIRequestDTO.md)
 - [UserCreationAPIResponseDTO](docs/UserCreationAPIResponseDTO.md)
 - [UserGetAPIResponseDTO](docs/UserGetAPIResponseDTO.md)
 - [UserGroupAssignedForLocalTenantDTO](docs/UserGroupAssignedForLocalTenantDTO.md)
 - [UserGroupGetAPIResponseDTO](docs/UserGroupGetAPIResponseDTO.md)
 - [UserGroupsGetAPIResponseDTO](docs/UserGroupsGetAPIResponseDTO.md)
 - [UserGroupsUsersDTO](docs/UserGroupsUsersDTO.md)
 - [UserGroupsUsersForTenantDTO](docs/UserGroupsUsersForTenantDTO.md)
 - [UserSecurityAssignmentsDTO](docs/UserSecurityAssignmentsDTO.md)
 - [UserUpdateAPIRequestDTO](docs/UserUpdateAPIRequestDTO.md)
 - [UsersAPIErrorMessageDTO](docs/UsersAPIErrorMessageDTO.md)
 - [UsersAPIFailureDTO](docs/UsersAPIFailureDTO.md)
 - [UsersAPIResponseDTO](docs/UsersAPIResponseDTO.md)
 - [UsersAPISuccessDTO](docs/UsersAPISuccessDTO.md)
 - [UsersCreationAPIRequestDTO](docs/UsersCreationAPIRequestDTO.md)
 - [UsersDeleteAPIRequestDTO](docs/UsersDeleteAPIRequestDTO.md)
 - [UsersToUserGroupRequestDTO](docs/UsersToUserGroupRequestDTO.md)
 - [UsersToUserGroupsRequestDTO](docs/UsersToUserGroupsRequestDTO.md)
 - [UsersUpdateAPIRequestDTO](docs/UsersUpdateAPIRequestDTO.md)
 - [UsersUpdateAPIUserDTO](docs/UsersUpdateAPIUserDTO.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
