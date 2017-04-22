package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.FilesApi;
import org.agave.client.model.FileAction;
import org.agave.client.model.FileImportRequest;
import org.agave.client.model.FileInfo;
import org.agave.client.model.FilePermission;
import org.agave.client.model.FilePermissionRequest;
import org.agave.client.model.HistoryEvent;
import org.agave.client.model.PermissionRequest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FilesApi
 */
public class FilesApiTest {

    private final FilesApi api = new FilesApi();

    
    /**
     * 
     *
     * Deletes all permissions on a file except those of the owner.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearFileItemPermissionsTest() throws ApiException {
        String filePath = null;
        String systemId = null;
        Boolean naked = null;
        // api.clearFileItemPermissions(filePath, systemId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes a file or folder at the specified path on the specified remote system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileItemTest() throws ApiException {
        String systemId = null;
        String filePath = null;
        String naked = null;
        // api.deleteFileItem(systemId, filePath, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes a file or folder on default storage system of the user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteFileItemOnDefaultSystemTest() throws ApiException {
        String filePath = null;
        Boolean naked = null;
        // api.deleteFileItemOnDefaultSystem(filePath, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Download a file from the given system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileItemTest() throws ApiException {
        String systemId = null;
        String filePath = null;
        Boolean force = null;
        // api.downloadFileItem(systemId, filePath, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Download a file from the default storage location of the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadFileItemOnDefaultSystemTest() throws ApiException {
        String filePath = null;
        Boolean force = null;
        // api.downloadFileItemOnDefaultSystem(filePath, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Import file item from a remote URL to the target system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importFileItemTest() throws ApiException {
        String systemId = null;
        String filePath = null;
        FileImportRequest body = null;
        Boolean naked = null;
        // FileInfo response = api.importFileItem(systemId, filePath, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Import file item from a remote URL to the target system
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void importFileItemToDefaultSystemTest() throws ApiException {
        String filePath = null;
        FileImportRequest body = null;
        String naked = null;
        // FileInfo response = api.importFileItemToDefaultSystem(filePath, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Perform an action on a file or folder.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invokeFileActionOnDefaultSystemTest() throws ApiException {
        String filePath = null;
        FileAction body = null;
        String naked = null;
        // Object response = api.invokeFileActionOnDefaultSystem(filePath, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Perform an action on a file or folder.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void invokeFileItemActionTest() throws ApiException {
        String systemId = null;
        String filePath = null;
        FileAction body = null;
        Boolean naked = null;
        // Object response = api.invokeFileItemAction(systemId, filePath, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Download a file from the default storage location of the user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFileItemHistoryTest() throws ApiException {
        String filePath = null;
        String systemId = null;
        String status = null;
        String created = null;
        String filter = null;
        String naked = null;
        Long limit = null;
        Long offset = null;
        // HistoryEvent response = api.listFileItemHistory(filePath, systemId, status, created, filter, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List event history of a file item on the default storage system of the user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFileItemHistoryOnDefaultSystemTest() throws ApiException {
        String filePath = null;
        String status = null;
        String created = null;
        String filter = null;
        String naked = null;
        Long limit = null;
        Long offset = null;
        // List<HistoryEvent> response = api.listFileItemHistoryOnDefaultSystem(filePath, status, created, filter, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all the share permissions for a file or folder.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFileItemPermissionsTest() throws ApiException {
        String filePath = null;
        Boolean naked = null;
        String systemId = null;
        Long limit = null;
        Long offset = null;
        // List<FilePermission> response = api.listFileItemPermissions(filePath, naked, systemId, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List all the share permissions for a file or folder.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFileItemPermissionsOnDefaultSystemTest() throws ApiException {
        String filePath = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<FilePermission> response = api.listFileItemPermissionsOnDefaultSystem(filePath, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a remote directory listing on a specific system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFileItemsTest() throws ApiException {
        String systemId = null;
        String filePath = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<FileInfo> response = api.listFileItems(systemId, filePath, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a remote directory listing on the default storage system of the user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listFileItemsOnDefaultSystemTest() throws ApiException {
        String filepath = null;
        String filter = null;
        String naked = null;
        Long limit = null;
        Long offset = null;
        // List<FileInfo> response = api.listFileItemsOnDefaultSystem(filepath, filter, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update permissions for a single user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFileItemPermissionTest() throws ApiException {
        String filePath = null;
        String systemId = null;
        PermissionRequest body = null;
        Boolean naked = null;
        // FilePermission response = api.updateFileItemPermission(filePath, systemId, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update permissions for a single user on their default storage system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateFileItemPermissionsOnDefaultSystemTest() throws ApiException {
        String filePath = null;
        FilePermissionRequest body = null;
        Boolean filePath2 = null;
        // FilePermission response = api.updateFileItemPermissionsOnDefaultSystem(filePath, body, filePath2);

        // TODO: test validations
    }
    
}
