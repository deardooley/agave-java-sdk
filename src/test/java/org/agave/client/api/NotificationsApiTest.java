package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.NotificationsApi;
import org.agave.client.model.Notification;
import org.agave.client.model.NotificationRequest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotificationsApi
 */
public class NotificationsApiTest {

    private final NotificationsApi api = new NotificationsApi();

    
    /**
     * 
     *
     * Add new notification.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addNotificationTest() throws ApiException {
        NotificationRequest body = null;
        Boolean naked = null;
        // Notification response = api.addNotification(body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Remove notification from the system.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteNotificationTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        // api.deleteNotification(uuid, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve notification.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getNotificationTest() throws ApiException {
        String uuid = null;
        Boolean naked = null;
        // Notification response = api.getNotification(uuid, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve notification for a specific resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listNotificationsTest() throws ApiException {
        String associatedUuid = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<Notification> response = api.listNotifications(associatedUuid, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update existing notification.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateNotificationTest() throws ApiException {
        String uuid = null;
        NotificationRequest body = null;
        Boolean naked = null;
        // Notification response = api.updateNotification(uuid, body, naked);

        // TODO: test validations
    }
    
}
