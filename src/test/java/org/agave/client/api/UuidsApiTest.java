package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.UuidsApi;
import org.agave.client.model.UUIDRequest;
import org.agave.client.model.UUIDResolution;
import org.agave.client.model.UUIDSummary;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for UuidsApi
 */
public class UuidsApiTest {

    private final UuidsApi api = new UuidsApi();

    
    /**
     * 
     *
     * Generate a new UUID for a given resource type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createUuidTest() throws ApiException {
        UUIDRequest body = null;
        Boolean naked = null;
        // List<UUIDResolution> response = api.createUuid(body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Resolve one or more UUID to their resource URL and type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resolveUuidTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        Boolean expand = null;
        // List<UUIDResolution> response = api.resolveUuid(uuid, naked, expand);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Resolve one or more UUID to their resource URL and type
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resolveUuidsTest() throws ApiException {
        Boolean naked = null;
        String uuids = null;
        Long limit = null;
        Long offset = null;
        Boolean expand = null;
        // List<UUIDSummary> response = api.resolveUuids(naked, uuids, limit, offset, expand);

        // TODO: test validations
    }
    
}
