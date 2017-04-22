package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.TagApi;
import org.agave.client.model.Permission;
import org.agave.client.model.Tag;
import org.agave.client.model.TagHistory;
import org.agave.client.model.TagResource;
import org.agave.client.model.TagSummary;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TagApi
 */
public class TagApiTest {

    private final TagApi api = new TagApi();

    
    /**
     * Creat a new tag
     *
     * Creates a new tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTagTest() throws ApiException {
        Tag body = null;
        Boolean naked = null;
        // Tag response = api.addTag(body, naked);

        // TODO: test validations
    }
    
    /**
     * Add resources to tag
     *
     * Adds the list of resources to the given tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addTagResourceTest() throws ApiException {
        String tagId = null;
        TagResource body = null;
        Boolean naked = null;
        // List<Tag> response = api.addTagResource(tagId, body, naked);

        // TODO: test validations
    }
    
    /**
     * Clear tag permissions
     *
     * Removes all permissions save ownership from the given tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearTagPermissionsTest() throws ApiException {
        String tagId = null;
        Boolean naked = null;
        // api.clearTagPermissions(tagId, naked);

        // TODO: test validations
    }
    
    /**
     * Clear all tagged resources
     *
     * Removes all resources from the given tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearTagResourcesTest() throws ApiException {
        String tagId = null;
        Boolean naked = null;
        // api.clearTagResources(tagId, naked);

        // TODO: test validations
    }
    
    /**
     * Delete tag
     *
     * Deletes the tag and all permissions
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTagTest() throws ApiException {
        String tagId = null;
        Boolean naked = null;
        // api.deleteTag(tagId, naked);

        // TODO: test validations
    }
    
    /**
     * Remove user tag permission
     *
     * Removes permissions for the given user on the given tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTagPermissionForUserTest() throws ApiException {
        String tagId = null;
        String username = null;
        Boolean naked = null;
        // api.deleteTagPermissionForUser(tagId, username, naked);

        // TODO: test validations
    }
    
    /**
     * Tag Details
     *
     * Returns detailed information about the named tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagDetailsTest() throws ApiException {
        String tagId = null;
        Boolean naked = null;
        // Tag response = api.getTagDetails(tagId, naked);

        // TODO: test validations
    }
    
    /**
     * List tag permissions for a user
     *
     * Returns the permission set on the given tag for a specific user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTagPermissionForUserTest() throws ApiException {
        String tagId = null;
        String username = null;
        Boolean naked = null;
        // List<Permission> response = api.getTagPermissionForUser(tagId, username, naked);

        // TODO: test validations
    }
    
    /**
     * Get tagged item details
     *
     * Returns a list of items with the given tag.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTaggedResourceTest() throws ApiException {
        String tagId = null;
        String uuid = null;
        Boolean naked = null;
        // TagResource response = api.getTaggedResource(tagId, uuid, naked);

        // TODO: test validations
    }
    
    /**
     * Tag history
     *
     * Returns a list of items with the given tag.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTagHistoryTest() throws ApiException {
        String tagId = null;
        Boolean naked = null;
        Integer limit = null;
        Integer offset = null;
        // List<TagHistory> response = api.listTagHistory(tagId, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * List permissionss set for a given tag id
     *
     * Returns a list of permission objects set on this Tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTagPermissionsTest() throws ApiException {
        String tagId = null;
        Boolean naked = null;
        Integer limit = null;
        Integer offset = null;
        // List<Permission> response = api.listTagPermissions(tagId, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Tagged items
     *
     * Returns a list of items with the given tag.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTagResourcesTest() throws ApiException {
        String tagId = null;
        Boolean naked = null;
        Integer limit = null;
        Integer offset = null;
        // List<TagResource> response = api.listTagResources(tagId, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Available tags
     *
     * The Tags endpoint returns summary information about the available list of tags right now.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTagsTest() throws ApiException {
        String name = null;
        String resourceType = null;
        String resourceId = null;
        String lastModified = null;
        String created = null;
        Boolean naked = null;
        Integer limit = null;
        Integer offset = null;
        // List<TagSummary> response = api.listTags(name, resourceType, resourceId, lastModified, created, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * Remove resource from tag
     *
     * Removes the given uuid from this tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void removeTagResourceTest() throws ApiException {
        String tagId = null;
        String uuid = null;
        Boolean naked = null;
        // api.removeTagResource(tagId, uuid, naked);

        // TODO: test validations
    }
    
    /**
     * Update tag
     *
     * Updates the given tag with the updated information
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTagTest() throws ApiException {
        String tagId = null;
        Tag body = null;
        Boolean naked = null;
        // Tag response = api.updateTag(tagId, body, naked);

        // TODO: test validations
    }
    
    /**
     * Grant permission
     *
     * Adds a permission for a given user to a given tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTagPermissionTest() throws ApiException {
        String tagId = null;
        Permission body = null;
        Boolean naked = null;
        // Permission response = api.updateTagPermission(tagId, body, naked);

        // TODO: test validations
    }
    
    /**
     * Update user permission on tag
     *
     * Resets the user permission on the given tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTagPermissionForUserTest() throws ApiException {
        String tagId = null;
        String username = null;
        Permission body = null;
        Boolean naked = null;
        // Permission response = api.updateTagPermissionForUser(tagId, username, body, naked);

        // TODO: test validations
    }
    
    /**
     * Add resource to tag
     *
     * Adds the resource with the given uuid to the given tag
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateTagResourceTest() throws ApiException {
        String tagId = null;
        String uuid = null;
        TagResource body = null;
        Boolean naked = null;
        // TagResource response = api.updateTagResource(tagId, uuid, body, naked);

        // TODO: test validations
    }
    
}
