package org.agave.client.api;

import org.agave.client.ApiException;
import org.agave.client.api.JobsApi;
import org.agave.client.model.FileInfo;
import org.agave.client.model.Job;
import org.agave.client.model.JobHistory;
import org.agave.client.model.JobRequest;
import org.agave.client.model.JobResubmitAction;
import org.agave.client.model.JobStatusSummary;
import org.agave.client.model.Permission;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for JobsApi
 */
public class JobsApiTest {

    private final JobsApi api = new JobsApi();

    
    /**
     * 
     *
     * Add a user permission for the given job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addJobPermissionTest() throws ApiException {
        String jobId = null;
        Permission body = null;
        Boolean naked = null;
        // Permission response = api.addJobPermission(jobId, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all permissions on an job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearJobPermissionsTest() throws ApiException {
        String jobId = null;
        Boolean naked = null;
        // api.clearJobPermissions(jobId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes a job from history of the user
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobTest() throws ApiException {
        String jobId = null;
        Boolean naked = null;
        // api.deleteJob(jobId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Deletes all permissions for the given user on an job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteJobPermissionTest() throws ApiException {
        String jobId = null;
        String username = null;
        Boolean naked = null;
        // api.deleteJobPermission(jobId, username, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Download an output file from a specific job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void downloadJobOutputTest() throws ApiException {
        String jobId = null;
        String filePath = null;
        Boolean force = null;
        // api.downloadJobOutput(jobId, filePath, force);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get details of the job with the specific job id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobDetailsTest() throws ApiException {
        Long jobId = null;
        Boolean naked = null;
        // Job response = api.getJobDetails(jobId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the history of this job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobHistoryTest() throws ApiException {
        String jobId = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<JobHistory> response = api.getJobHistory(jobId, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a specific user permission for a job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobPermissionTest() throws ApiException {
        String jobId = null;
        String username = null;
        Boolean naked = null;
        // Permission response = api.getJobPermission(jobId, username, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the status of the job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getJobStatusTest() throws ApiException {
        String jobId = null;
        Boolean naked = null;
        // JobStatusSummary response = api.getJobStatus(jobId, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * List the output folder for a job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listJobOutputsTest() throws ApiException {
        String jobId = null;
        String filePath = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<FileInfo> response = api.listJobOutputs(jobId, filePath, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get the permissions granted for this job.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listJobPermissionsTest() throws ApiException {
        String jobId = null;
        Boolean naked = null;
        Long limit = null;
        Long offset = null;
        // List<Permission> response = api.listJobPermissions(jobId, naked, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Get a list of jobs the authenticated user had submitted.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listJobsTest() throws ApiException {
        Boolean naked = null;
        String appId = null;
        String archive = null;
        String archivePath = null;
        String archiveSystem = null;
        String batchQueue = null;
        String executionSystem = null;
        String id = null;
        String inputs = null;
        String localId = null;
        String maxRuntime = null;
        String memoryPerNode = null;
        String name = null;
        Long nodeCount = null;
        String outputPath = null;
        String parameters = null;
        Long processorsPerNode = null;
        Long retries = null;
        String startTime = null;
        String status = null;
        String submitTime = null;
        String visible = null;
        Long limit = null;
        Long offset = null;
        // List<Job> response = api.listJobs(naked, appId, archive, archivePath, archiveSystem, batchQueue, executionSystem, id, inputs, localId, maxRuntime, memoryPerNode, name, nodeCount, outputPath, parameters, processorsPerNode, retries, startTime, status, submitTime, visible, limit, offset);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Resubmits the job with the given job id as a new job with a unique id.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void resubmitJobTest() throws ApiException {
        String jobId = null;
        JobResubmitAction body = null;
        Boolean naked = null;
        // Job response = api.resubmitJob(jobId, body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Submit a new job request.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void submitJobTest() throws ApiException {
        JobRequest body = null;
        Boolean naked = null;
        // Job response = api.submitJob(body, naked);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * Update a user permission for the given job and username
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateJobPermissionTest() throws ApiException {
        String jobId = null;
        String username = null;
        Permission body = null;
        Boolean naked = null;
        // Permission response = api.updateJobPermission(jobId, username, body, naked);

        // TODO: test validations
    }
    
}
