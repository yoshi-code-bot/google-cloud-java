/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/dataflow/v1beta3/templates.proto

// Protobuf Java Version: 3.25.5
package com.google.dataflow.v1beta3;

public interface RuntimeEnvironmentOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.RuntimeEnvironment)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The initial number of Google Compute Engine instnaces for the job.
   * </pre>
   *
   * <code>int32 num_workers = 11;</code>
   *
   * @return The numWorkers.
   */
  int getNumWorkers();

  /**
   *
   *
   * <pre>
   * The maximum number of Google Compute Engine instances to be made
   * available to your pipeline during execution, from 1 to 1000.
   * </pre>
   *
   * <code>int32 max_workers = 1;</code>
   *
   * @return The maxWorkers.
   */
  int getMaxWorkers();

  /**
   *
   *
   * <pre>
   * The Compute Engine [availability
   * zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones)
   * for launching worker instances to run your pipeline.
   * In the future, worker_zone will take precedence.
   * </pre>
   *
   * <code>string zone = 2;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();
  /**
   *
   *
   * <pre>
   * The Compute Engine [availability
   * zone](https://cloud.google.com/compute/docs/regions-zones/regions-zones)
   * for launching worker instances to run your pipeline.
   * In the future, worker_zone will take precedence.
   * </pre>
   *
   * <code>string zone = 2;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();

  /**
   *
   *
   * <pre>
   * The email address of the service account to run the job as.
   * </pre>
   *
   * <code>string service_account_email = 3;</code>
   *
   * @return The serviceAccountEmail.
   */
  java.lang.String getServiceAccountEmail();
  /**
   *
   *
   * <pre>
   * The email address of the service account to run the job as.
   * </pre>
   *
   * <code>string service_account_email = 3;</code>
   *
   * @return The bytes for serviceAccountEmail.
   */
  com.google.protobuf.ByteString getServiceAccountEmailBytes();

  /**
   *
   *
   * <pre>
   * The Cloud Storage path to use for temporary files.
   * Must be a valid Cloud Storage URL, beginning with `gs://`.
   * </pre>
   *
   * <code>string temp_location = 4;</code>
   *
   * @return The tempLocation.
   */
  java.lang.String getTempLocation();
  /**
   *
   *
   * <pre>
   * The Cloud Storage path to use for temporary files.
   * Must be a valid Cloud Storage URL, beginning with `gs://`.
   * </pre>
   *
   * <code>string temp_location = 4;</code>
   *
   * @return The bytes for tempLocation.
   */
  com.google.protobuf.ByteString getTempLocationBytes();

  /**
   *
   *
   * <pre>
   * Whether to bypass the safety checks for the job's temporary directory.
   * Use with caution.
   * </pre>
   *
   * <code>bool bypass_temp_dir_validation = 5;</code>
   *
   * @return The bypassTempDirValidation.
   */
  boolean getBypassTempDirValidation();

  /**
   *
   *
   * <pre>
   * The machine type to use for the job. Defaults to the value from the
   * template if not specified.
   * </pre>
   *
   * <code>string machine_type = 6;</code>
   *
   * @return The machineType.
   */
  java.lang.String getMachineType();
  /**
   *
   *
   * <pre>
   * The machine type to use for the job. Defaults to the value from the
   * template if not specified.
   * </pre>
   *
   * <code>string machine_type = 6;</code>
   *
   * @return The bytes for machineType.
   */
  com.google.protobuf.ByteString getMachineTypeBytes();

  /**
   *
   *
   * <pre>
   * Additional experiment flags for the job, specified with the
   * `--experiments` option.
   * </pre>
   *
   * <code>repeated string additional_experiments = 7;</code>
   *
   * @return A list containing the additionalExperiments.
   */
  java.util.List<java.lang.String> getAdditionalExperimentsList();
  /**
   *
   *
   * <pre>
   * Additional experiment flags for the job, specified with the
   * `--experiments` option.
   * </pre>
   *
   * <code>repeated string additional_experiments = 7;</code>
   *
   * @return The count of additionalExperiments.
   */
  int getAdditionalExperimentsCount();
  /**
   *
   *
   * <pre>
   * Additional experiment flags for the job, specified with the
   * `--experiments` option.
   * </pre>
   *
   * <code>repeated string additional_experiments = 7;</code>
   *
   * @param index The index of the element to return.
   * @return The additionalExperiments at the given index.
   */
  java.lang.String getAdditionalExperiments(int index);
  /**
   *
   *
   * <pre>
   * Additional experiment flags for the job, specified with the
   * `--experiments` option.
   * </pre>
   *
   * <code>repeated string additional_experiments = 7;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the additionalExperiments at the given index.
   */
  com.google.protobuf.ByteString getAdditionalExperimentsBytes(int index);

  /**
   *
   *
   * <pre>
   * Network to which VMs will be assigned.  If empty or unspecified,
   * the service will use the network "default".
   * </pre>
   *
   * <code>string network = 8;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * Network to which VMs will be assigned.  If empty or unspecified,
   * the service will use the network "default".
   * </pre>
   *
   * <code>string network = 8;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * Subnetwork to which VMs will be assigned, if desired. You can specify a
   * subnetwork using either a complete URL or an abbreviated path. Expected to
   * be of the form
   * "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK"
   * or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in
   * a Shared VPC network, you must use the complete URL.
   * </pre>
   *
   * <code>string subnetwork = 9;</code>
   *
   * @return The subnetwork.
   */
  java.lang.String getSubnetwork();
  /**
   *
   *
   * <pre>
   * Subnetwork to which VMs will be assigned, if desired. You can specify a
   * subnetwork using either a complete URL or an abbreviated path. Expected to
   * be of the form
   * "https://www.googleapis.com/compute/v1/projects/HOST_PROJECT_ID/regions/REGION/subnetworks/SUBNETWORK"
   * or "regions/REGION/subnetworks/SUBNETWORK". If the subnetwork is located in
   * a Shared VPC network, you must use the complete URL.
   * </pre>
   *
   * <code>string subnetwork = 9;</code>
   *
   * @return The bytes for subnetwork.
   */
  com.google.protobuf.ByteString getSubnetworkBytes();

  /**
   *
   *
   * <pre>
   * Additional user labels to be specified for the job.
   * Keys and values should follow the restrictions specified in the [labeling
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * page.
   * An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_user_labels = 10;</code>
   */
  int getAdditionalUserLabelsCount();
  /**
   *
   *
   * <pre>
   * Additional user labels to be specified for the job.
   * Keys and values should follow the restrictions specified in the [labeling
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * page.
   * An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_user_labels = 10;</code>
   */
  boolean containsAdditionalUserLabels(java.lang.String key);
  /** Use {@link #getAdditionalUserLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAdditionalUserLabels();
  /**
   *
   *
   * <pre>
   * Additional user labels to be specified for the job.
   * Keys and values should follow the restrictions specified in the [labeling
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * page.
   * An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_user_labels = 10;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAdditionalUserLabelsMap();
  /**
   *
   *
   * <pre>
   * Additional user labels to be specified for the job.
   * Keys and values should follow the restrictions specified in the [labeling
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * page.
   * An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_user_labels = 10;</code>
   */
  /* nullable */
  java.lang.String getAdditionalUserLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Additional user labels to be specified for the job.
   * Keys and values should follow the restrictions specified in the [labeling
   * restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
   * page.
   * An object containing a list of "key": value pairs.
   * Example: { "name": "wrench", "mass": "1kg", "count": "3" }.
   * </pre>
   *
   * <code>map&lt;string, string&gt; additional_user_labels = 10;</code>
   */
  java.lang.String getAdditionalUserLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Name for the Cloud KMS key for the job.
   * Key format is:
   * projects/&lt;project&gt;/locations/&lt;location&gt;/keyRings/&lt;keyring&gt;/cryptoKeys/&lt;key&gt;
   * </pre>
   *
   * <code>string kms_key_name = 12;</code>
   *
   * @return The kmsKeyName.
   */
  java.lang.String getKmsKeyName();
  /**
   *
   *
   * <pre>
   * Name for the Cloud KMS key for the job.
   * Key format is:
   * projects/&lt;project&gt;/locations/&lt;location&gt;/keyRings/&lt;keyring&gt;/cryptoKeys/&lt;key&gt;
   * </pre>
   *
   * <code>string kms_key_name = 12;</code>
   *
   * @return The bytes for kmsKeyName.
   */
  com.google.protobuf.ByteString getKmsKeyNameBytes();

  /**
   *
   *
   * <pre>
   * Configuration for VM IPs.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.WorkerIPAddressConfiguration ip_configuration = 14;</code>
   *
   * @return The enum numeric value on the wire for ipConfiguration.
   */
  int getIpConfigurationValue();
  /**
   *
   *
   * <pre>
   * Configuration for VM IPs.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.WorkerIPAddressConfiguration ip_configuration = 14;</code>
   *
   * @return The ipConfiguration.
   */
  com.google.dataflow.v1beta3.WorkerIPAddressConfiguration getIpConfiguration();

  /**
   *
   *
   * <pre>
   * The Compute Engine region
   * (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in
   * which worker processing should occur, e.g. "us-west1". Mutually exclusive
   * with worker_zone. If neither worker_region nor worker_zone is specified,
   * default to the control plane's region.
   * </pre>
   *
   * <code>string worker_region = 15;</code>
   *
   * @return The workerRegion.
   */
  java.lang.String getWorkerRegion();
  /**
   *
   *
   * <pre>
   * The Compute Engine region
   * (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in
   * which worker processing should occur, e.g. "us-west1". Mutually exclusive
   * with worker_zone. If neither worker_region nor worker_zone is specified,
   * default to the control plane's region.
   * </pre>
   *
   * <code>string worker_region = 15;</code>
   *
   * @return The bytes for workerRegion.
   */
  com.google.protobuf.ByteString getWorkerRegionBytes();

  /**
   *
   *
   * <pre>
   * The Compute Engine zone
   * (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in
   * which worker processing should occur, e.g. "us-west1-a". Mutually exclusive
   * with worker_region. If neither worker_region nor worker_zone is specified,
   * a zone in the control plane's region is chosen based on available capacity.
   * If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
   * </pre>
   *
   * <code>string worker_zone = 16;</code>
   *
   * @return The workerZone.
   */
  java.lang.String getWorkerZone();
  /**
   *
   *
   * <pre>
   * The Compute Engine zone
   * (https://cloud.google.com/compute/docs/regions-zones/regions-zones) in
   * which worker processing should occur, e.g. "us-west1-a". Mutually exclusive
   * with worker_region. If neither worker_region nor worker_zone is specified,
   * a zone in the control plane's region is chosen based on available capacity.
   * If both `worker_zone` and `zone` are set, `worker_zone` takes precedence.
   * </pre>
   *
   * <code>string worker_zone = 16;</code>
   *
   * @return The bytes for workerZone.
   */
  com.google.protobuf.ByteString getWorkerZoneBytes();

  /**
   *
   *
   * <pre>
   * Whether to enable Streaming Engine for the job.
   * </pre>
   *
   * <code>bool enable_streaming_engine = 17;</code>
   *
   * @return The enableStreamingEngine.
   */
  boolean getEnableStreamingEngine();
}
