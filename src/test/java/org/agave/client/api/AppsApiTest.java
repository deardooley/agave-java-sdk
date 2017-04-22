package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.AppsApi;
import org.agave.client.model.Application;
import org.agave.client.model.ApplicationAction;
import org.agave.client.model.ApplicationSummary;
import org.agave.client.model.HistoryEvent;
import org.agave.client.model.Permission;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AppsApi
 */
public class AppsApiTest {

    private final AppsApi api = new AppsApi();

    
    /**
     * 
     *
     * Register and update new applications.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAppTest() throws ApiException {
        Boolean naked = null;
        Application body = null;
        // Application response = api.addApp(naked, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Grant a user permission for an application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addAppPermissionTest() throws ApiException {
        String appId = null;
        Permission body = null;
        Boolean naked = null;
        // Permission response = api.addAppPermission(appId, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all permissions on an application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearAppPermissionsTest() throws ApiException {
        String appId = null;
        Boolean naked = null;
        // api.clearAppPermissions(appId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes an application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppTest() throws ApiException {
        String appId = null;
        Boolean naked = null;
        // api.deleteApp(appId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all permissions for the given user on an application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteAppPermissionTest() throws ApiException {
        String appId = null;
        String username = null;
        Boolean naked = null;
        // api.deleteAppPermission(appId, username, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get details of an application by its unique id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAppDetailsTest() throws ApiException {
        String appId = null;
        Boolean naked = null;
        // Application response = api.getAppDetails(appId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a specific user permission for an application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAppPermissionTest() throws ApiException {
        String appId = null;
        String username = null;
        String filter = null;
        String naked = null;
        // Permission response = api.getAppPermission(appId, username, filter, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a submission form for the named application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getAppSubmissionFormTest() throws ApiException {
        String appId = null;
        String naked = null;
        // String response = api.getAppSubmissionForm(appId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Edit an application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invokeAppActionTest() throws ApiException {
        String appId = null;
        ApplicationAction body = null;
        Boolean naked = null;
        // Application response = api.invokeAppAction(appId, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List the event history of this app
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppHistoryTest() throws ApiException {
        Boolean naked = null;
        String appId = null;
        String status = null;
        String created = null;
        Long limit = null;
        Long offset = null;
        // HistoryEvent response = api.listAppHistory(naked, appId, status, created, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the permission for this application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppPermissionsTest() throws ApiException {
        String appId = null;
        String filter = null;
        String naked = null;
        Long limit = null;
        Long offset = null;
        // List<Permission> response = api.listAppPermissions(appId, filter, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * List apps
     *
     * Get a list of available applications.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listAppsTest() throws ApiException {
        Boolean _public = null;
        String name = null;
        String executionSystem = null;
        String tags = null;
        String filter = null;
        String naked = null;
        Long limit = null;
        Long offset = null;
        // List<ApplicationSummary> response = api.listApps(_public, name, executionSystem, tags, filter, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update an application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAppTest() throws ApiException {
        String appId = null;
        Application body = null;
        Boolean naked = null;
        // Application response = api.updateApp(appId, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add or update a user permission for an application.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateAppPermissionTest() throws ApiException {
        String appId = null;
        String username = null;
        Permission body = null;
        Boolean naked = null;
        // Permission response = api.updateAppPermission(appId, username, body, naked);

        // TODO: test validations
    }
    
}
