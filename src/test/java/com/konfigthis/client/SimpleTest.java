package com.konfigthis.client;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

public class SimpleTest {
    final String MOCK_SERVER_URL = "http://localhost:4010";

    @Test
    public void initClientTest() {
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
        assertNotNull(client);
    }
}
