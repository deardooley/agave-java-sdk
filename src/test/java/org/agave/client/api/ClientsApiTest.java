package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.ClientsApi;
import org.agave.client.model.ClientRequest;
import org.agave.client.model.ClientSubscriptionRequest;
import org.agave.client.model.EmptyClientResponse;
import org.agave.client.model.MultipleClientResponse;
import org.agave.client.model.MultipleSubscriptionResponse;
import org.agave.client.model.SingleClientResponse;
import org.agave.client.model.SingleSubscriptionResponse;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClientsApi
 */
public class ClientsApiTest {

    private final ClientsApi api = new ClientsApi();

    
    /**
     * 
     *
     * Create a new client
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addClientTest() throws ApiException {
        ClientRequest body = null;
        // SingleClientResponse response = api.addClient(body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Add a new API subscription to the given client
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addClientAPISubscriptionTest() throws ApiException {
        String clientName = null;
        ClientSubscriptionRequest body = null;
        // SingleSubscriptionResponse response = api.addClientAPISubscription(clientName, body);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Unsubscribe the client from all APIs
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearClientAPISubscriptionsTest() throws ApiException {
        String clientName = null;
        // EmptyClientResponse response = api.clearClientAPISubscriptions(clientName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Immediately deletes this client and renders the API keys useless.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteClientTest() throws ApiException {
        String clientName = null;
        // EmptyClientResponse response = api.deleteClient(clientName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Returns a detailed description of a named client.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getClientTest() throws ApiException {
        String clientName = null;
        // MultipleClientResponse response = api.getClient(clientName);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Lists all APIs to which the client is subscribed
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listClientApiSubscriptionsTest() throws ApiException {
        String clientName = null;
        Long limit = null;
        Long offset = null;
        // MultipleSubscriptionResponse response = api.listClientApiSubscriptions(clientName, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List existing clients
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listClientsTest() throws ApiException {
        // MultipleClientResponse response = api.listClients();

        // TODO: test validations
    }
    
}
