/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.workflows.v1beta.samples;

// [START workflows_v1beta_generated_workflowsclient_listworkflows_sync]
import com.google.cloud.workflows.v1beta.ListWorkflowsRequest;
import com.google.cloud.workflows.v1beta.LocationName;
import com.google.cloud.workflows.v1beta.Workflow;
import com.google.cloud.workflows.v1beta.WorkflowsClient;

public class SyncListWorkflows {

  public static void main(String[] args) throws Exception {
    syncListWorkflows();
  }

  public static void syncListWorkflows() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (WorkflowsClient workflowsClient = WorkflowsClient.create()) {
      ListWorkflowsRequest request =
          ListWorkflowsRequest.newBuilder()
              .setParent(LocationName.of("[PROJECT]", "[LOCATION]").toString())
              .setPageSize(883849137)
              .setPageToken("pageToken873572522")
              .setFilter("filter-1274492040")
              .setOrderBy("orderBy-1207110587")
              .build();
      for (Workflow element : workflowsClient.listWorkflows(request).iterateAll()) {
        // doThingsWith(element);
      }
    }
  }
}
// [END workflows_v1beta_generated_workflowsclient_listworkflows_sync]