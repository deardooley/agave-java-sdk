package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.MonitorsApi;
import org.agave.client.model.MonitoringTaskCheck;
import org.agave.client.model.MonitoringTaskDetails;
import org.agave.client.model.MonitoringTaskSummary;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MonitorsApi
 */
public class MonitorsApiTest {

    private final MonitorsApi api = new MonitorsApi();

    
    /**
     * 
     *
     * Add a new monitoring task
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addMonitoringTasksTest() throws ApiException {
        MonitoringTaskSummary body = null;
        Boolean naked = null;
        // MonitoringTaskDetails response = api.addMonitoringTasks(body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes a monitor.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteMonitoringTaskTest() throws ApiException {
        String monitorId = null;
        Boolean naked = null;
        // api.deleteMonitoringTask(monitorId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Forces a monitor check to run.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void forceMonitoringTaskCheckTest() throws ApiException {
        String monitorId = null;
        Boolean naked = null;
        // MonitoringTaskDetails response = api.forceMonitoringTaskCheck(monitorId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve a specific monitor.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMonitoringTaskTest() throws ApiException {
        String monitorId = null;
        Boolean naked = null;
        // MonitoringTaskDetails response = api.getMonitoringTask(monitorId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve a specific monitor check
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getMonitoringTaskCheckTest() throws ApiException {
        String monitorId = null;
        String checkId = null;
        Boolean naked = null;
        // MonitoringTaskCheck response = api.getMonitoringTaskCheck(monitorId, checkId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve checks for a specific monitor
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringTaskChecksTest() throws ApiException {
        String monitorId = null;
        Boolean naked = null;
        String startDate = null;
        String endDate = null;
        String result = null;
        Long limit = null;
        Long offset = null;
        // List<MonitoringTaskCheck> response = api.listMonitoringTaskChecks(monitorId, naked, startDate, endDate, result, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Retrieve Monitor for a specific resource.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listMonitoringTasksTest() throws ApiException {
        Boolean naked = null;
        String target = null;
        String active = null;
        Long limit = null;
        Long offset = null;
        // List<MonitoringTaskSummary> response = api.listMonitoringTasks(naked, target, active, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Updates an existing monitor.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateMonitoringTaskTest() throws ApiException {
        MonitoringTaskSummary body = null;
        Boolean naked = null;
        String monitorId = null;
        // MonitoringTaskDetails response = api.updateMonitoringTask(body, naked, monitorId);

        // TODO: test validations
    }
    
}
