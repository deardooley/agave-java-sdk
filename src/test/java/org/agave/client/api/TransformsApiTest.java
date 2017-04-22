package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.TransformsApi;
import org.agave.client.model.Transform;
import org.agave.client.model.TransformRequest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransformsApi
 */
public class TransformsApiTest {

    private final TransformsApi api = new TransformsApi();

    
    /**
     * 
     *
     * Transform a file and stage it to a specified location.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void asyncTransformTest() throws ApiException {
        String transformId = null;
        String owner = null;
        String filePath = null;
        TransformRequest body = null;
        Boolean naked = null;
        // Transform response = api.asyncTransform(transformId, owner, filePath, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Find the transform of the given uuid
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTransformTest() throws ApiException {
        String transformId = null;
        Boolean naked = null;
        // Transform response = api.getTransform(transformId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List and search for transforms
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTransformsTest() throws ApiException {
        Boolean naked = null;
        String name = null;
        String version = null;
        Long limit = null;
        Long offset = null;
        String tags = null;
        // List<Transform> response = api.listTransforms(naked, name, version, limit, offset, tags);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Transform a file and download it directly.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void syncTransformTest() throws ApiException {
        String transformId = null;
        String owner = null;
        String filePath = null;
        TransformRequest body = null;
        Boolean naked = null;
        // api.syncTransform(transformId, owner, filePath, body, naked);

        // TODO: test validations
    }
    
}
