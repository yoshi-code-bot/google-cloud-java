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
// source: google/cloud/aiplatform/v1/notebook_runtime.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface NotebookRuntimeTemplateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.NotebookRuntimeTemplate)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the NotebookRuntimeTemplate.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The resource name of the NotebookRuntimeTemplate.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The display name of the NotebookRuntimeTemplate.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Required. The display name of the NotebookRuntimeTemplate.
   * The name can be up to 128 characters long and can consist of any UTF-8
   * characters.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The description of the NotebookRuntimeTemplate.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * The description of the NotebookRuntimeTemplate.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. Deprecated: This field has no behavior. Use
   * notebook_runtime_type = 'ONE_CLICK' instead.
   *
   * The default template to use if not specified.
   * </pre>
   *
   * <code>bool is_default = 4 [deprecated = true, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.aiplatform.v1.NotebookRuntimeTemplate.is_default is deprecated. See
   *     google/cloud/aiplatform/v1/notebook_runtime.proto;l=74
   * @return The isDefault.
   */
  @java.lang.Deprecated
  boolean getIsDefault();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. The specification of a single machine for the
   * template.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.MachineSpec machine_spec = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the machineSpec field is set.
   */
  boolean hasMachineSpec();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. The specification of a single machine for the
   * template.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.MachineSpec machine_spec = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The machineSpec.
   */
  com.google.cloud.aiplatform.v1.MachineSpec getMachineSpec();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. The specification of a single machine for the
   * template.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.MachineSpec machine_spec = 5 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.aiplatform.v1.MachineSpecOrBuilder getMachineSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The specification of [persistent
   * disk][https://cloud.google.com/compute/docs/disks/persistent-disks]
   * attached to the runtime as data disk storage.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PersistentDiskSpec data_persistent_disk_spec = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the dataPersistentDiskSpec field is set.
   */
  boolean hasDataPersistentDiskSpec();

  /**
   *
   *
   * <pre>
   * Optional. The specification of [persistent
   * disk][https://cloud.google.com/compute/docs/disks/persistent-disks]
   * attached to the runtime as data disk storage.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PersistentDiskSpec data_persistent_disk_spec = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The dataPersistentDiskSpec.
   */
  com.google.cloud.aiplatform.v1.PersistentDiskSpec getDataPersistentDiskSpec();

  /**
   *
   *
   * <pre>
   * Optional. The specification of [persistent
   * disk][https://cloud.google.com/compute/docs/disks/persistent-disks]
   * attached to the runtime as data disk storage.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.PersistentDiskSpec data_persistent_disk_spec = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.PersistentDiskSpecOrBuilder getDataPersistentDiskSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Network spec.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NetworkSpec network_spec = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the networkSpec field is set.
   */
  boolean hasNetworkSpec();

  /**
   *
   *
   * <pre>
   * Optional. Network spec.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NetworkSpec network_spec = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The networkSpec.
   */
  com.google.cloud.aiplatform.v1.NetworkSpec getNetworkSpec();

  /**
   *
   *
   * <pre>
   * Optional. Network spec.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NetworkSpec network_spec = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.NetworkSpecOrBuilder getNetworkSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Deprecated: This field is ignored and the "Vertex AI Notebook Service
   * Account"
   * (service-PROJECT_NUMBER&#64;gcp-sa-aiplatform-vm.iam.gserviceaccount.com) is
   * used for the runtime workload identity.
   * See
   * https://cloud.google.com/iam/docs/service-agents#vertex-ai-notebook-service-account
   * for more details.
   * For NotebookExecutionJob, use NotebookExecutionJob.service_account instead.
   *
   * The service account that the runtime workload runs as.
   * You can use any service account within the same project, but you
   * must have the service account user permission to use the instance.
   *
   * If not specified, the [Compute Engine default service
   * account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account)
   * is used.
   * </pre>
   *
   * <code>string service_account = 13 [deprecated = true];</code>
   *
   * @deprecated google.cloud.aiplatform.v1.NotebookRuntimeTemplate.service_account is deprecated.
   *     See google/cloud/aiplatform/v1/notebook_runtime.proto;l=109
   * @return The serviceAccount.
   */
  @java.lang.Deprecated
  java.lang.String getServiceAccount();

  /**
   *
   *
   * <pre>
   * Deprecated: This field is ignored and the "Vertex AI Notebook Service
   * Account"
   * (service-PROJECT_NUMBER&#64;gcp-sa-aiplatform-vm.iam.gserviceaccount.com) is
   * used for the runtime workload identity.
   * See
   * https://cloud.google.com/iam/docs/service-agents#vertex-ai-notebook-service-account
   * for more details.
   * For NotebookExecutionJob, use NotebookExecutionJob.service_account instead.
   *
   * The service account that the runtime workload runs as.
   * You can use any service account within the same project, but you
   * must have the service account user permission to use the instance.
   *
   * If not specified, the [Compute Engine default service
   * account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account)
   * is used.
   * </pre>
   *
   * <code>string service_account = 13 [deprecated = true];</code>
   *
   * @deprecated google.cloud.aiplatform.v1.NotebookRuntimeTemplate.service_account is deprecated.
   *     See google/cloud/aiplatform/v1/notebook_runtime.proto;l=109
   * @return The bytes for serviceAccount.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 14;</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Used to perform consistent read-modify-write updates. If not set, a blind
   * "overwrite" update happens.
   * </pre>
   *
   * <code>string etag = 14;</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize the
   * NotebookRuntimeTemplates.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize the
   * NotebookRuntimeTemplates.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize the
   * NotebookRuntimeTemplates.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize the
   * NotebookRuntimeTemplates.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * The labels with user-defined metadata to organize the
   * NotebookRuntimeTemplates.
   *
   * Label keys and values can be no longer than 64 characters
   * (Unicode codepoints), can only contain lowercase letters, numeric
   * characters, underscores and dashes. International characters are allowed.
   *
   * See https://goo.gl/xmQnxf for more information and examples of labels.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 15;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The idle shutdown configuration of NotebookRuntimeTemplate. This config
   * will only be set when idle shutdown is enabled.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.NotebookIdleShutdownConfig idle_shutdown_config = 17;</code>
   *
   * @return Whether the idleShutdownConfig field is set.
   */
  boolean hasIdleShutdownConfig();

  /**
   *
   *
   * <pre>
   * The idle shutdown configuration of NotebookRuntimeTemplate. This config
   * will only be set when idle shutdown is enabled.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.NotebookIdleShutdownConfig idle_shutdown_config = 17;</code>
   *
   * @return The idleShutdownConfig.
   */
  com.google.cloud.aiplatform.v1.NotebookIdleShutdownConfig getIdleShutdownConfig();

  /**
   *
   *
   * <pre>
   * The idle shutdown configuration of NotebookRuntimeTemplate. This config
   * will only be set when idle shutdown is enabled.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.NotebookIdleShutdownConfig idle_shutdown_config = 17;</code>
   */
  com.google.cloud.aiplatform.v1.NotebookIdleShutdownConfigOrBuilder
      getIdleShutdownConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * EUC configuration of the NotebookRuntimeTemplate.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.NotebookEucConfig euc_config = 18;</code>
   *
   * @return Whether the eucConfig field is set.
   */
  boolean hasEucConfig();

  /**
   *
   *
   * <pre>
   * EUC configuration of the NotebookRuntimeTemplate.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.NotebookEucConfig euc_config = 18;</code>
   *
   * @return The eucConfig.
   */
  com.google.cloud.aiplatform.v1.NotebookEucConfig getEucConfig();

  /**
   *
   *
   * <pre>
   * EUC configuration of the NotebookRuntimeTemplate.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.NotebookEucConfig euc_config = 18;</code>
   */
  com.google.cloud.aiplatform.v1.NotebookEucConfigOrBuilder getEucConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntimeTemplate was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntimeTemplate was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntimeTemplate was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntimeTemplate was most recently
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntimeTemplate was most recently
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. Timestamp when this NotebookRuntimeTemplate was most recently
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. The type of the notebook runtime template.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NotebookRuntimeType notebook_runtime_type = 19 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for notebookRuntimeType.
   */
  int getNotebookRuntimeTypeValue();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. The type of the notebook runtime template.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NotebookRuntimeType notebook_runtime_type = 19 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The notebookRuntimeType.
   */
  com.google.cloud.aiplatform.v1.NotebookRuntimeType getNotebookRuntimeType();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. Runtime Shielded VM spec.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ShieldedVmConfig shielded_vm_config = 20 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the shieldedVmConfig field is set.
   */
  boolean hasShieldedVmConfig();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. Runtime Shielded VM spec.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ShieldedVmConfig shielded_vm_config = 20 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The shieldedVmConfig.
   */
  com.google.cloud.aiplatform.v1.ShieldedVmConfig getShieldedVmConfig();

  /**
   *
   *
   * <pre>
   * Optional. Immutable. Runtime Shielded VM spec.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ShieldedVmConfig shielded_vm_config = 20 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ShieldedVmConfigOrBuilder getShieldedVmConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/vpc/docs/add-remove-network-tags)).
   * </pre>
   *
   * <code>repeated string network_tags = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the networkTags.
   */
  java.util.List<java.lang.String> getNetworkTagsList();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/vpc/docs/add-remove-network-tags)).
   * </pre>
   *
   * <code>repeated string network_tags = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of networkTags.
   */
  int getNetworkTagsCount();

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/vpc/docs/add-remove-network-tags)).
   * </pre>
   *
   * <code>repeated string network_tags = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The networkTags at the given index.
   */
  java.lang.String getNetworkTags(int index);

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/vpc/docs/add-remove-network-tags)).
   * </pre>
   *
   * <code>repeated string network_tags = 21 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the networkTags at the given index.
   */
  com.google.protobuf.ByteString getNetworkTagsBytes(int index);

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for the notebook runtime.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 23;</code>
   *
   * @return Whether the encryptionSpec field is set.
   */
  boolean hasEncryptionSpec();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for the notebook runtime.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 23;</code>
   *
   * @return The encryptionSpec.
   */
  com.google.cloud.aiplatform.v1.EncryptionSpec getEncryptionSpec();

  /**
   *
   *
   * <pre>
   * Customer-managed encryption key spec for the notebook runtime.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.EncryptionSpec encryption_spec = 23;</code>
   */
  com.google.cloud.aiplatform.v1.EncryptionSpecOrBuilder getEncryptionSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The notebook software configuration of the notebook runtime.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NotebookSoftwareConfig software_config = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the softwareConfig field is set.
   */
  boolean hasSoftwareConfig();

  /**
   *
   *
   * <pre>
   * Optional. The notebook software configuration of the notebook runtime.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NotebookSoftwareConfig software_config = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The softwareConfig.
   */
  com.google.cloud.aiplatform.v1.NotebookSoftwareConfig getSoftwareConfig();

  /**
   *
   *
   * <pre>
   * Optional. The notebook software configuration of the notebook runtime.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NotebookSoftwareConfig software_config = 24 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.NotebookSoftwareConfigOrBuilder getSoftwareConfigOrBuilder();
}
