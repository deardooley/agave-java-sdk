package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.MetaApi;
import org.agave.client.model.Metadata;
import org.agave.client.model.MetadataSchema;
import org.agave.client.model.Permission;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MetaApi
 */
public class MetaApiTest {

    private final MetaApi api = new MetaApi();

    
    /**
     * 
     *
     * Update or Add new Metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMetadataTest() throws ApiException {
        Metadata body = null;
        Boolean naked = null;
        // Metadata response = api.addMetadata(body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add a user permission for the given metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMetadataPermissionTest() throws ApiException {
        String uuid = null;
        Permission body = null;
        Boolean naked = null;
        // Permission response = api.addMetadataPermission(uuid, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add a new Metadata Schema.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMetadataSchemaTest() throws ApiException {
        MetadataSchema body = null;
        Boolean naked = null;
        // MetadataSchema response = api.addMetadataSchema(body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add a user permission for the given schema.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMetadataSchemaPermissionTest() throws ApiException {
        String uuid = null;
        Permission body = null;
        Boolean naked = null;
        // Permission response = api.addMetadataSchemaPermission(uuid, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all permissions on the given metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearMetadataPermissionsTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        // api.clearMetadataPermissions(uuid, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all permissions on the given schema.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearMetadataSchemaPermissionsTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        // api.clearMetadataSchemaPermissions(uuid, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Remove Metadata from the system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMetadataTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        // api.deleteMetadata(uuid, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Removes user permissions for a user on a given metadata resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMetadataPermissionTest() throws ApiException {
        String uuid = null;
        String username = null;
        Boolean naked = null;
        // api.deleteMetadataPermission(uuid, username, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Remove Metadata Schema from the system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMetadataSchemaTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        // api.deleteMetadataSchema(uuid, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all metadata schema permissions on the given metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSchemaPermissionTest() throws ApiException {
        String uuid = null;
        String username = null;
        Boolean naked = null;
        // api.deleteSchemaPermission(uuid, username, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve Metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetadataTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        // Metadata response = api.getMetadata(uuid, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the user permission for this metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetadataPermissionTest() throws ApiException {
        String uuid = null;
        String username = null;
        Boolean naked = null;
        // Permission response = api.getMetadataPermission(uuid, username, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve Metadata Schemata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetadataSchemaTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        // MetadataSchema response = api.getMetadataSchema(uuid, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the user permission for this schema.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMetadataSchemaPermissionTest() throws ApiException {
        String uuid = null;
        String username = null;
        Boolean naked = null;
        // Permission response = api.getMetadataSchemaPermission(uuid, username, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List and/or search metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMetadataTest() throws ApiException {
        String q = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<Metadata> response = api.listMetadata(q, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the permission ACL for this metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMetadataPermissionsTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // Permission response = api.listMetadataPermissions(uuid, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List and query Metadata Schemata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMetadataSchemaTest() throws ApiException {
        String q = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<MetadataSchema> response = api.listMetadataSchema(q, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the permission for this schema.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMetadataSchemaPermissionsTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<Permission> response = api.listMetadataSchemaPermissions(uuid, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update or Add new Metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMetadataTest() throws ApiException {
        String uuid = null;
        Metadata body = null;
        Boolean naked = null;
        // Metadata response = api.updateMetadata(uuid, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update a user permission for the given metadata.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMetadataPermissionTest() throws ApiException {
        String uuid = null;
        String username = null;
        Permission body = null;
        Boolean naked = null;
        // Permission response = api.updateMetadataPermission(uuid, username, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update an existing Metadata Schema.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMetadataSchemaTest() throws ApiException {
        String uuid = null;
        Permission body = null;
        Boolean naked = null;
        // MetadataSchema response = api.updateMetadataSchema(uuid, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add or update a user permission for the given metadata schema.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMetadataSchemaPermissionTest() throws ApiException {
        String uuid = null;
        String username = null;
        Permission body = null;
        Boolean naked = null;
        // Permission response = api.updateMetadataSchemaPermission(uuid, username, body, naked);

        // TODO: test validations
    }
    
}
