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
// source: google/cloud/assuredworkloads/v1/assuredworkloads.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.assuredworkloads.v1;

public interface WorkloadOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1.Workload)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The resource name of the workload.
   * Format:
   * organizations/{organization}/locations/{location}/workloads/{workload}
   *
   * Read-only.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Optional. The resource name of the workload.
   * Format:
   * organizations/{organization}/locations/{location}/workloads/{workload}
   *
   * Read-only.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The user-assigned display name of the Workload.
   * When present it must be between 4 to 30 characters.
   * Allowed characters are: lowercase and uppercase letters, numbers,
   * hyphen, and spaces.
   *
   * Example: My Workload
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
   * Required. The user-assigned display name of the Workload.
   * When present it must be between 4 to 30 characters.
   * Allowed characters are: lowercase and uppercase letters, numbers,
   * hyphen, and spaces.
   *
   * Example: My Workload
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
   * Output only. The resources associated with this workload.
   * These resources will be created when creating the workload.
   * If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.assuredworkloads.v1.Workload.ResourceInfo resources = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.assuredworkloads.v1.Workload.ResourceInfo> getResourcesList();

  /**
   *
   *
   * <pre>
   * Output only. The resources associated with this workload.
   * These resources will be created when creating the workload.
   * If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.assuredworkloads.v1.Workload.ResourceInfo resources = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.assuredworkloads.v1.Workload.ResourceInfo getResources(int index);

  /**
   *
   *
   * <pre>
   * Output only. The resources associated with this workload.
   * These resources will be created when creating the workload.
   * If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.assuredworkloads.v1.Workload.ResourceInfo resources = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getResourcesCount();

  /**
   *
   *
   * <pre>
   * Output only. The resources associated with this workload.
   * These resources will be created when creating the workload.
   * If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.assuredworkloads.v1.Workload.ResourceInfo resources = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.assuredworkloads.v1.Workload.ResourceInfoOrBuilder>
      getResourcesOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. The resources associated with this workload.
   * These resources will be created when creating the workload.
   * If any of the projects already exist, the workload creation will fail.
   * Always read only.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.assuredworkloads.v1.Workload.ResourceInfo resources = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.assuredworkloads.v1.Workload.ResourceInfoOrBuilder getResourcesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Required. Immutable. Compliance Regime associated with this workload.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for complianceRegime.
   */
  int getComplianceRegimeValue();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Compliance Regime associated with this workload.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.ComplianceRegime compliance_regime = 4 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The complianceRegime.
   */
  com.google.cloud.assuredworkloads.v1.Workload.ComplianceRegime getComplianceRegime();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The Workload creation timestamp.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The Workload creation timestamp.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. Immutable. The Workload creation timestamp.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp create_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The billing account used for the resources which are
   * direct children of workload. This billing account is initially associated
   * with the resources created as part of Workload creation.
   * After the initial creation of these resources, the customer can change
   * the assigned billing account.
   * The resource name has the form
   * `billingAccounts/{billing_account_id}`. For example,
   * `billingAccounts/012345-567890-ABCDEF`.
   * </pre>
   *
   * <code>string billing_account = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The billingAccount.
   */
  java.lang.String getBillingAccount();

  /**
   *
   *
   * <pre>
   * Optional. The billing account used for the resources which are
   * direct children of workload. This billing account is initially associated
   * with the resources created as part of Workload creation.
   * After the initial creation of these resources, the customer can change
   * the assigned billing account.
   * The resource name has the form
   * `billingAccounts/{billing_account_id}`. For example,
   * `billingAccounts/012345-567890-ABCDEF`.
   * </pre>
   *
   * <code>string billing_account = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for billingAccount.
   */
  com.google.protobuf.ByteString getBillingAccountBytes();

  /**
   *
   *
   * <pre>
   * Optional. ETag of the workload, it is calculated on the basis
   * of the Workload contents. It will be used in Update &amp; Delete operations.
   * </pre>
   *
   * <code>string etag = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Optional. ETag of the workload, it is calculated on the basis
   * of the Workload contents. It will be used in Update &amp; Delete operations.
   * </pre>
   *
   * <code>string etag = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Optional. Labels applied to the workload.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. Labels applied to the workload.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. Labels applied to the workload.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. Labels applied to the workload.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. Labels applied to the workload.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Input only. The parent resource for the resources managed by this Assured Workload. May
   * be either empty or a folder resource which is a child of the
   * Workload parent. If not specified all resources are created under the
   * parent organization.
   * Format:
   * folders/{folder_id}
   * </pre>
   *
   * <code>string provisioned_resources_parent = 13 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The provisionedResourcesParent.
   */
  java.lang.String getProvisionedResourcesParent();

  /**
   *
   *
   * <pre>
   * Input only. The parent resource for the resources managed by this Assured Workload. May
   * be either empty or a folder resource which is a child of the
   * Workload parent. If not specified all resources are created under the
   * parent organization.
   * Format:
   * folders/{folder_id}
   * </pre>
   *
   * <code>string provisioned_resources_parent = 13 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The bytes for provisionedResourcesParent.
   */
  com.google.protobuf.ByteString getProvisionedResourcesParentBytes();

  /**
   *
   *
   * <pre>
   * Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS
   * CMEK key is provisioned.
   * This field is deprecated as of Feb 28, 2022.
   * In order to create a Keyring, callers should specify,
   * ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.KMSSettings kms_settings = 14 [deprecated = true, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.assuredworkloads.v1.Workload.kms_settings is deprecated. See
   *     google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=484
   * @return Whether the kmsSettings field is set.
   */
  @java.lang.Deprecated
  boolean hasKmsSettings();

  /**
   *
   *
   * <pre>
   * Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS
   * CMEK key is provisioned.
   * This field is deprecated as of Feb 28, 2022.
   * In order to create a Keyring, callers should specify,
   * ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.KMSSettings kms_settings = 14 [deprecated = true, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @deprecated google.cloud.assuredworkloads.v1.Workload.kms_settings is deprecated. See
   *     google/cloud/assuredworkloads/v1/assuredworkloads.proto;l=484
   * @return The kmsSettings.
   */
  @java.lang.Deprecated
  com.google.cloud.assuredworkloads.v1.Workload.KMSSettings getKmsSettings();

  /**
   *
   *
   * <pre>
   * Input only. Settings used to create a CMEK crypto key. When set, a project with a KMS
   * CMEK key is provisioned.
   * This field is deprecated as of Feb 28, 2022.
   * In order to create a Keyring, callers should specify,
   * ENCRYPTION_KEYS_PROJECT or KEYRING in ResourceSettings.resource_type field.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.KMSSettings kms_settings = 14 [deprecated = true, (.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.assuredworkloads.v1.Workload.KMSSettingsOrBuilder getKmsSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Input only. Resource properties that are used to customize workload resources.
   * These properties (such as custom project id) will be used to create
   * workload resources if possible. This field is optional.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.assuredworkloads.v1.Workload.ResourceSettings resource_settings = 15 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.assuredworkloads.v1.Workload.ResourceSettings>
      getResourceSettingsList();

  /**
   *
   *
   * <pre>
   * Input only. Resource properties that are used to customize workload resources.
   * These properties (such as custom project id) will be used to create
   * workload resources if possible. This field is optional.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.assuredworkloads.v1.Workload.ResourceSettings resource_settings = 15 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  com.google.cloud.assuredworkloads.v1.Workload.ResourceSettings getResourceSettings(int index);

  /**
   *
   *
   * <pre>
   * Input only. Resource properties that are used to customize workload resources.
   * These properties (such as custom project id) will be used to create
   * workload resources if possible. This field is optional.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.assuredworkloads.v1.Workload.ResourceSettings resource_settings = 15 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  int getResourceSettingsCount();

  /**
   *
   *
   * <pre>
   * Input only. Resource properties that are used to customize workload resources.
   * These properties (such as custom project id) will be used to create
   * workload resources if possible. This field is optional.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.assuredworkloads.v1.Workload.ResourceSettings resource_settings = 15 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.assuredworkloads.v1.Workload.ResourceSettingsOrBuilder>
      getResourceSettingsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Input only. Resource properties that are used to customize workload resources.
   * These properties (such as custom project id) will be used to create
   * workload resources if possible. This field is optional.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.assuredworkloads.v1.Workload.ResourceSettings resource_settings = 15 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  com.google.cloud.assuredworkloads.v1.Workload.ResourceSettingsOrBuilder
      getResourceSettingsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Represents the KAJ enrollment state of the given workload.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.KajEnrollmentState kaj_enrollment_state = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for kajEnrollmentState.
   */
  int getKajEnrollmentStateValue();

  /**
   *
   *
   * <pre>
   * Output only. Represents the KAJ enrollment state of the given workload.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.KajEnrollmentState kaj_enrollment_state = 17 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The kajEnrollmentState.
   */
  com.google.cloud.assuredworkloads.v1.Workload.KajEnrollmentState getKajEnrollmentState();

  /**
   *
   *
   * <pre>
   * Optional. Indicates the sovereignty status of the given workload.
   * Currently meant to be used by Europe/Canada customers.
   * </pre>
   *
   * <code>bool enable_sovereign_controls = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enableSovereignControls.
   */
  boolean getEnableSovereignControls();

  /**
   *
   *
   * <pre>
   * Output only. Represents the SAA enrollment response of the given workload.
   * SAA enrollment response is queried during GetWorkload call.
   * In failure cases, user friendly error message is shown in SAA details page.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.SaaEnrollmentResponse saa_enrollment_response = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the saaEnrollmentResponse field is set.
   */
  boolean hasSaaEnrollmentResponse();

  /**
   *
   *
   * <pre>
   * Output only. Represents the SAA enrollment response of the given workload.
   * SAA enrollment response is queried during GetWorkload call.
   * In failure cases, user friendly error message is shown in SAA details page.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.SaaEnrollmentResponse saa_enrollment_response = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The saaEnrollmentResponse.
   */
  com.google.cloud.assuredworkloads.v1.Workload.SaaEnrollmentResponse getSaaEnrollmentResponse();

  /**
   *
   *
   * <pre>
   * Output only. Represents the SAA enrollment response of the given workload.
   * SAA enrollment response is queried during GetWorkload call.
   * In failure cases, user friendly error message is shown in SAA details page.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.SaaEnrollmentResponse saa_enrollment_response = 20 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.assuredworkloads.v1.Workload.SaaEnrollmentResponseOrBuilder
      getSaaEnrollmentResponseOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Urls for services which are compliant for this Assured Workload, but which
   * are currently disallowed by the ResourceUsageRestriction org policy.
   * Invoke RestrictAllowedResources endpoint to allow your project developers
   * to use these services in their environment."
   * </pre>
   *
   * <code>
   * repeated string compliant_but_disallowed_services = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the compliantButDisallowedServices.
   */
  java.util.List<java.lang.String> getCompliantButDisallowedServicesList();

  /**
   *
   *
   * <pre>
   * Output only. Urls for services which are compliant for this Assured Workload, but which
   * are currently disallowed by the ResourceUsageRestriction org policy.
   * Invoke RestrictAllowedResources endpoint to allow your project developers
   * to use these services in their environment."
   * </pre>
   *
   * <code>
   * repeated string compliant_but_disallowed_services = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of compliantButDisallowedServices.
   */
  int getCompliantButDisallowedServicesCount();

  /**
   *
   *
   * <pre>
   * Output only. Urls for services which are compliant for this Assured Workload, but which
   * are currently disallowed by the ResourceUsageRestriction org policy.
   * Invoke RestrictAllowedResources endpoint to allow your project developers
   * to use these services in their environment."
   * </pre>
   *
   * <code>
   * repeated string compliant_but_disallowed_services = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The compliantButDisallowedServices at the given index.
   */
  java.lang.String getCompliantButDisallowedServices(int index);

  /**
   *
   *
   * <pre>
   * Output only. Urls for services which are compliant for this Assured Workload, but which
   * are currently disallowed by the ResourceUsageRestriction org policy.
   * Invoke RestrictAllowedResources endpoint to allow your project developers
   * to use these services in their environment."
   * </pre>
   *
   * <code>
   * repeated string compliant_but_disallowed_services = 24 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the compliantButDisallowedServices at the given index.
   */
  com.google.protobuf.ByteString getCompliantButDisallowedServicesBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Compliance Regime associated with this workload.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.Partner partner = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for partner.
   */
  int getPartnerValue();

  /**
   *
   *
   * <pre>
   * Optional. Compliance Regime associated with this workload.
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1.Workload.Partner partner = 25 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The partner.
   */
  com.google.cloud.assuredworkloads.v1.Workload.Partner getPartner();
}
