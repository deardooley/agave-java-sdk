package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.PostitsApi;
import org.agave.client.model.PostIt;
import org.agave.client.model.PostItRequest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PostitsApi
 */
public class PostitsApiTest {

    private final PostitsApi api = new PostitsApi();

    
    /**
     * 
     *
     * Create a new PostIt
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addPostitTest() throws ApiException {
        PostItRequest body = null;
        Boolean naked = null;
        // PostIt response = api.addPostit(body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Immediately invalidates this PostIt URL.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deletePostitTest() throws ApiException {
        String nonce = null;
        Boolean naked = null;
        // api.deletePostit(nonce, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List existing PostIts
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listPostitsTest() throws ApiException {
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<PostIt> response = api.listPostits(naked, limit, offset);

        // TODO: test validations
    }
    
}
