package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.TenantsApi;
import org.agave.client.model.Tenant;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TenantsApi
 */
public class TenantsApiTest {

    private final TenantsApi api = new TenantsApi();

    
    /**
     * Resolve Tenant details
     *
     * Returns information about the tenant with the given code or id
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTenantDetailsTest() throws ApiException {
        String codeOrUuid = null;
        Boolean naked = null;
        String filter = null;
        // Tenant response = api.getTenantDetails(codeOrUuid, naked, filter);

        // TODO: test validations
    }
    
    /**
     * List all active tenants
     *
     * Lists all active tenants publicly available
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTenantsTest() throws ApiException {
        Boolean naked = null;
        String filter = null;
        Long limit = null;
        Long offset = null;
        // List<Tenant> response = api.listTenants(naked, filter, limit, offset);

        // TODO: test validations
    }
    
}
