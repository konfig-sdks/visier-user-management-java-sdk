# UserManagementV2Api

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addUsers**](UserManagementV2Api.md#addUsers) | **POST** /v2/admin/users | Add users |
| [**deleteUsers**](UserManagementV2Api.md#deleteUsers) | **DELETE** /v2/admin/users | Delete users |
| [**updateUsers**](UserManagementV2Api.md#updateUsers) | **PUT** /v2/admin/users | Update users |


<a name="addUsers"></a>
# **addUsers**
> UsersAPIResponseDTO addUsers(usersCreationAPIRequestDTO).tenantCode(tenantCode).execute();

Add users

This API allows you to create new users. Administrating tenant users can specify the tenant in which to add these users.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementV2Api;
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
    List<UserCreationAPIRequestDTO> users = Arrays.asList(); // A list of objects representing users to create.
    String tenantCode = "tenantCode_example"; // Specify the tenant to create a user in.
    try {
      UsersAPIResponseDTO result = client
              .userManagementV2
              .addUsers()
              .users(users)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccesses());
      System.out.println(result.getFailures());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementV2Api#addUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersAPIResponseDTO> response = client
              .userManagementV2
              .addUsers()
              .users(users)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementV2Api#addUsers");
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
| **usersCreationAPIRequestDTO** | [**UsersCreationAPIRequestDTO**](UsersCreationAPIRequestDTO.md)|  | |
| **tenantCode** | **String**| Specify the tenant to create a user in. | [optional] |

### Return type

[**UsersAPIResponseDTO**](UsersAPIResponseDTO.md)

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

<a name="deleteUsers"></a>
# **deleteUsers**
> UsersAPIResponseDTO deleteUsers(usersDeleteAPIRequestDTO).tenantCode(tenantCode).execute();

Delete users

This API allows you to delete an existing user. Administrating tenant users can specify the tenant from which to delete a user.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementV2Api;
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
    List<String> userIds = Arrays.asList(); // A list of objects representing users to delete.
    String tenantCode = "tenantCode_example"; // Specify the tenant to delete a user in.
    try {
      UsersAPIResponseDTO result = client
              .userManagementV2
              .deleteUsers()
              .userIds(userIds)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccesses());
      System.out.println(result.getFailures());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementV2Api#deleteUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersAPIResponseDTO> response = client
              .userManagementV2
              .deleteUsers()
              .userIds(userIds)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementV2Api#deleteUsers");
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
| **usersDeleteAPIRequestDTO** | [**UsersDeleteAPIRequestDTO**](UsersDeleteAPIRequestDTO.md)|  | |
| **tenantCode** | **String**| Specify the tenant to delete a user in. | [optional] |

### Return type

[**UsersAPIResponseDTO**](UsersAPIResponseDTO.md)

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

<a name="updateUsers"></a>
# **updateUsers**
> UsersAPIResponseDTO updateUsers(usersUpdateAPIRequestDTO).tenantCode(tenantCode).execute();

Update users

This API allows you to update an existing user&#39;s information, such as their display name or if the user is enabled in Visier.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierUserManagement;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.UserManagementV2Api;
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
    List<UsersUpdateAPIUserDTO> users = Arrays.asList();
    String tenantCode = "tenantCode_example"; // Specify the tenant to update a user in.
    try {
      UsersAPIResponseDTO result = client
              .userManagementV2
              .updateUsers()
              .users(users)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getSuccesses());
      System.out.println(result.getFailures());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementV2Api#updateUsers");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<UsersAPIResponseDTO> response = client
              .userManagementV2
              .updateUsers()
              .users(users)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling UserManagementV2Api#updateUsers");
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
| **usersUpdateAPIRequestDTO** | [**UsersUpdateAPIRequestDTO**](UsersUpdateAPIRequestDTO.md)|  | |
| **tenantCode** | **String**| Specify the tenant to update a user in. | [optional] |

### Return type

[**UsersAPIResponseDTO**](UsersAPIResponseDTO.md)

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

