package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.SystemsApi;
import org.agave.client.model.ExecutionSystem;
import org.agave.client.model.MultipleSystemRoleResponse;
import org.agave.client.model.StorageSystem;
import org.agave.client.model.System;
import org.agave.client.model.SystemAction;
import org.agave.client.model.SystemAuthConfig;
import org.agave.client.model.SystemCredential;
import org.agave.client.model.SystemCredentialsResponse;
import org.agave.client.model.SystemRequest;
import org.agave.client.model.SystemRole;
import org.agave.client.model.SystemRoleRequest;
import org.agave.client.model.SystemSummary;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SystemsApi
 */
public class SystemsApiTest {

    private final SystemsApi api = new SystemsApi();

    
    /**
     * 
     *
     * Add a new execution system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addExecutionSystemTest() throws ApiException {
        SystemRequest body = null;
        Boolean naked = null;
        // ExecutionSystem response = api.addExecutionSystem(body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add  a storage system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStorageSystemTest() throws ApiException {
        SystemRequest body = null;
        Boolean naked = null;
        // StorageSystem response = api.addStorageSystem(body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add an internal user&#39;s credential on a system. This applies both to storage and, if applicable, login credentials.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSystemCredentialTest() throws ApiException {
        String systemId = null;
        SystemCredential body = null;
        Boolean naked = null;
        // List<SystemCredential> response = api.addSystemCredential(systemId, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Adds a role on the system for the given user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addSystemRoleTest() throws ApiException {
        String systemId = null;
        SystemRoleRequest body = null;
        Boolean naked = null;
        // SystemRole response = api.addSystemRole(systemId, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all credentials registered to a system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearSystemAuthCredentialsTest() throws ApiException {
        String systemId = null;
        Boolean naked = null;
        // api.clearSystemAuthCredentials(systemId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all internal user credentials registered to a system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearSystemAuthCredentialsForInternalUserTest() throws ApiException {
        String systemId = null;
        String internalUsername = null;
        Boolean naked = null;
        // api.clearSystemAuthCredentialsForInternalUser(systemId, internalUsername, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all roles on a system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearSystemRolesTest() throws ApiException {
        String systemId = null;
        Boolean naked = null;
        // api.clearSystemRoles(systemId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete a system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSystemTest() throws ApiException {
        String systemId = null;
        Boolean naked = null;
        // api.deleteSystem(systemId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes the internal user credentials for the given credential type on a system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSystemAuthCredentialForInternalUserTest() throws ApiException {
        String systemId = null;
        String internalUsername = null;
        String credentialType = null;
        Boolean naked = null;
        // api.deleteSystemAuthCredentialForInternalUser(systemId, internalUsername, credentialType, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all roles for a user on a system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteSystemRoleTest() throws ApiException {
        String systemId = null;
        String username = null;
        Boolean naked = null;
        // api.deleteSystemRole(systemId, username, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the internal user credential of the given type on the system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSystemCredentialTest() throws ApiException {
        String systemId = null;
        String internalUsername = null;
        String credentialType = null;
        Boolean naked = null;
        // SystemCredential response = api.getSystemCredential(systemId, internalUsername, credentialType, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Find information about an individual system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSystemDetailsTest() throws ApiException {
        String systemId = null;
        Boolean naked = null;
        // System response = api.getSystemDetails(systemId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a specific user role on this system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getSystemRoleTest() throws ApiException {
        String systemId = null;
        String username = null;
        Boolean naked = null;
        // SystemRole response = api.getSystemRole(systemId, username, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Perform a management action on the system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invokeSystemActionTest() throws ApiException {
        String systemId = null;
        SystemAction body = null;
        Boolean naked = null;
        // api.invokeSystemAction(systemId, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of all internal users and their credentials on this system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listCredentialsForInternalUserTest() throws ApiException {
        String systemId = null;
        String internalUsername = null;
        // SystemCredentialsResponse response = api.listCredentialsForInternalUser(systemId, internalUsername);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of all internal user credentials on this system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSystemCredentialsTest() throws ApiException {
        String systemId = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<SystemCredential> response = api.listSystemCredentials(systemId, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of all users and their roles on this system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSystemRolesTest() throws ApiException {
        String systemId = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // MultipleSystemRoleResponse response = api.listSystemRoles(systemId, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Show all systems available to the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listSystemsTest() throws ApiException {
        Boolean naked = null;
        Long offset = null;
        String type = null;
        Boolean _default = null;
        Boolean _public = null;
        Long limit = null;
        // List<SystemSummary> response = api.listSystems(naked, offset, type, _default, _public, limit);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update a system description
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSystemTest() throws ApiException {
        String systemId = null;
        SystemRequest body = null;
        Boolean naked = null;
        // System response = api.updateSystem(systemId, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update an internal user credential on a system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSystemCredentialTest() throws ApiException {
        String systemId = null;
        String internalUsername = null;
        SystemAuthConfig body = null;
        Boolean naked = null;
        // SystemCredential response = api.updateSystemCredential(systemId, internalUsername, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add or update a credential of the given type on a system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSystemCredentialOfTypeTest() throws ApiException {
        String systemId = null;
        String internalUsername = null;
        String credentialType = null;
        SystemAuthConfig body = null;
        Boolean naked = null;
        // SystemCredential response = api.updateSystemCredentialOfType(systemId, internalUsername, credentialType, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update a user role on a system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSystemRoleTest() throws ApiException {
        String systemId = null;
        String username = null;
        SystemRoleRequest body = null;
        Boolean naked = null;
        // SystemRole response = api.updateSystemRole(systemId, username, body, naked);

        // TODO: test validations
    }
    
}
