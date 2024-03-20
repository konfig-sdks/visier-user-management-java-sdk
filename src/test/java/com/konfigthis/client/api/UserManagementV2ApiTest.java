/*
 * Visier User Management APIs
 * Visier APIs for managing users within an organization
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Status;
import com.konfigthis.client.model.UserCreationAPIRequestDTO;
import com.konfigthis.client.model.UsersAPIResponseDTO;
import com.konfigthis.client.model.UsersCreationAPIRequestDTO;
import com.konfigthis.client.model.UsersDeleteAPIRequestDTO;
import com.konfigthis.client.model.UsersUpdateAPIRequestDTO;
import com.konfigthis.client.model.UsersUpdateAPIUserDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UserManagementV2Api
 */
@Disabled
public class UserManagementV2ApiTest {

    private static UserManagementV2Api api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new UserManagementV2Api(apiClient);
    }

    /**
     * Add users
     *
     * This API allows you to create new users. Administrating tenant users can specify the tenant in which to add these users.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void addUsersTest() throws ApiException {
        List<UserCreationAPIRequestDTO> users = null;
        String tenantCode = null;
        UsersAPIResponseDTO response = api.addUsers()
                .users(users)
                .tenantCode(tenantCode)
                .execute();
        // TODO: test validations
    }

    /**
     * Delete users
     *
     * This API allows you to delete an existing user. Administrating tenant users can specify the tenant from which to delete a user.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteUsersTest() throws ApiException {
        List<String> userIds = null;
        String tenantCode = null;
        UsersAPIResponseDTO response = api.deleteUsers()
                .userIds(userIds)
                .tenantCode(tenantCode)
                .execute();
        // TODO: test validations
    }

    /**
     * Update users
     *
     * This API allows you to update an existing user&#39;s information, such as their display name or if the user is enabled in Visier.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **limited availability**. If you are interested in using it, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateUsersTest() throws ApiException {
        List<UsersUpdateAPIUserDTO> users = null;
        String tenantCode = null;
        UsersAPIResponseDTO response = api.updateUsers()
                .users(users)
                .tenantCode(tenantCode)
                .execute();
        // TODO: test validations
    }

}
