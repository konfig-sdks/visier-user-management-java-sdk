package com.konfigthis.client;

import com.konfigthis.client.api.UserManagementApi;
import com.konfigthis.client.api.UserManagementV2Api;

public class VisierUserManagement {
    private ApiClient apiClient;
    public final UserManagementApi userManagement;
    public final UserManagementV2Api userManagementV2;

    public VisierUserManagement() {
        this(null);
    }

    public VisierUserManagement(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.userManagement = new UserManagementApi(this.apiClient);
        this.userManagementV2 = new UserManagementV2Api(this.apiClient);
    }

}
