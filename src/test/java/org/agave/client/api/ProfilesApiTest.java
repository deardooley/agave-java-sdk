package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.ProfilesApi;
import org.agave.client.model.EmptyClientResponse;
import org.agave.client.model.InternalUser;
import org.agave.client.model.Profile;
import org.agave.client.model.ProfileRequest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfilesApi
 */
public class ProfilesApiTest {

    private final ProfilesApi api = new ProfilesApi();

    
    /**
     * 
     *
     * Create or update an internal user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addInternalUserTest() throws ApiException {
        String apiUsername = null;
        ProfileRequest body = null;
        Boolean naked = null;
        // InternalUser response = api.addInternalUser(apiUsername, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add a new user profile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addProfileTest() throws ApiException {
        Profile body = null;
        Boolean naked = null;
        // Profile response = api.addProfile(body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete all internal users created by the authenticated user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearInternalUsersTest() throws ApiException {
        String apiUsername = null;
        Boolean naked = null;
        // api.clearInternalUsers(apiUsername, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delete all internal users created by the authenticated user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteInternalUserTest() throws ApiException {
        String apiUsername = null;
        String internalUsername = null;
        Boolean naked = null;
        // InternalUser response = api.deleteInternalUser(apiUsername, internalUsername, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Delte a user profile by name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteProfileTest() throws ApiException {
        String apiUsername = null;
        Boolean naked = null;
        String filter = null;
        // EmptyClientResponse response = api.deleteProfile(apiUsername, naked, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Find api user profile by their api username
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getInternalUserTest() throws ApiException {
        String apiUsername = null;
        String internalUsername = null;
        Boolean naked = null;
        // InternalUser response = api.getInternalUser(apiUsername, internalUsername, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a user profile by name
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getProfileTest() throws ApiException {
        String apiUsername = null;
        Boolean naked = null;
        String filter = null;
        // Profile response = api.getProfile(apiUsername, naked, filter);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all internal users created by the authenticated user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listInternalUsersTest() throws ApiException {
        String apiUsername = null;
        Boolean naked = null;
        String username = null;
        String name = null;
        String email = null;
        // List<InternalUser> response = api.listInternalUsers(apiUsername, naked, username, name, email);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List user profiles
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listProfilesTest() throws ApiException {
        Boolean naked = null;
        String username = null;
        String name = null;
        String email = null;
        // List<Profile> response = api.listProfiles(naked, username, name, email);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Create or update the given internal user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateInternalUserTest() throws ApiException {
        String apiUsername = null;
        String internalUsername = null;
        ProfileRequest body = null;
        Boolean naked = null;
        // InternalUser response = api.updateInternalUser(apiUsername, internalUsername, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update an existing user profile
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateProfileTest() throws ApiException {
        String apiUsername = null;
        ProfileRequest body = null;
        Boolean naked = null;
        // Profile response = api.updateProfile(apiUsername, body, naked);

        // TODO: test validations
    }
    
}
