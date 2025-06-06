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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface OtherCloudDiscoveryTargetOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.OtherCloudDiscoveryTarget)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The type of data profiles generated by this discovery target.
   * Supported values are:
   * * aws/s3/bucket
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DataSourceType data_source_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataSourceType field is set.
   */
  boolean hasDataSourceType();

  /**
   *
   *
   * <pre>
   * Required. The type of data profiles generated by this discovery target.
   * Supported values are:
   * * aws/s3/bucket
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DataSourceType data_source_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataSourceType.
   */
  com.google.privacy.dlp.v2.DataSourceType getDataSourceType();

  /**
   *
   *
   * <pre>
   * Required. The type of data profiles generated by this discovery target.
   * Supported values are:
   * * aws/s3/bucket
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DataSourceType data_source_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.DataSourceTypeOrBuilder getDataSourceTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The resources that the discovery cadence applies to. The
   * first target with a matching filter will be the one to apply to a resource.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DiscoveryOtherCloudFilter filter = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the filter field is set.
   */
  boolean hasFilter();

  /**
   *
   *
   * <pre>
   * Required. The resources that the discovery cadence applies to. The
   * first target with a matching filter will be the one to apply to a resource.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DiscoveryOtherCloudFilter filter = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The filter.
   */
  com.google.privacy.dlp.v2.DiscoveryOtherCloudFilter getFilter();

  /**
   *
   *
   * <pre>
   * Required. The resources that the discovery cadence applies to. The
   * first target with a matching filter will be the one to apply to a resource.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DiscoveryOtherCloudFilter filter = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.privacy.dlp.v2.DiscoveryOtherCloudFilterOrBuilder getFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. In addition to matching the filter, these conditions must be true
   * before a profile is generated.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DiscoveryOtherCloudConditions conditions = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the conditions field is set.
   */
  boolean hasConditions();

  /**
   *
   *
   * <pre>
   * Optional. In addition to matching the filter, these conditions must be true
   * before a profile is generated.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DiscoveryOtherCloudConditions conditions = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The conditions.
   */
  com.google.privacy.dlp.v2.DiscoveryOtherCloudConditions getConditions();

  /**
   *
   *
   * <pre>
   * Optional. In addition to matching the filter, these conditions must be true
   * before a profile is generated.
   * </pre>
   *
   * <code>
   * .google.privacy.dlp.v2.DiscoveryOtherCloudConditions conditions = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.privacy.dlp.v2.DiscoveryOtherCloudConditionsOrBuilder getConditionsOrBuilder();

  /**
   *
   *
   * <pre>
   * How often and when to update data profiles. New resources that match both
   * the filter and conditions are scanned as quickly as possible depending on
   * system capacity.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryOtherCloudGenerationCadence generation_cadence = 4;
   * </code>
   *
   * @return Whether the generationCadence field is set.
   */
  boolean hasGenerationCadence();

  /**
   *
   *
   * <pre>
   * How often and when to update data profiles. New resources that match both
   * the filter and conditions are scanned as quickly as possible depending on
   * system capacity.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryOtherCloudGenerationCadence generation_cadence = 4;
   * </code>
   *
   * @return The generationCadence.
   */
  com.google.privacy.dlp.v2.DiscoveryOtherCloudGenerationCadence getGenerationCadence();

  /**
   *
   *
   * <pre>
   * How often and when to update data profiles. New resources that match both
   * the filter and conditions are scanned as quickly as possible depending on
   * system capacity.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DiscoveryOtherCloudGenerationCadence generation_cadence = 4;
   * </code>
   */
  com.google.privacy.dlp.v2.DiscoveryOtherCloudGenerationCadenceOrBuilder
      getGenerationCadenceOrBuilder();

  /**
   *
   *
   * <pre>
   * Disable profiling for resources that match this filter.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Disabled disabled = 5;</code>
   *
   * @return Whether the disabled field is set.
   */
  boolean hasDisabled();

  /**
   *
   *
   * <pre>
   * Disable profiling for resources that match this filter.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Disabled disabled = 5;</code>
   *
   * @return The disabled.
   */
  com.google.privacy.dlp.v2.Disabled getDisabled();

  /**
   *
   *
   * <pre>
   * Disable profiling for resources that match this filter.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.Disabled disabled = 5;</code>
   */
  com.google.privacy.dlp.v2.DisabledOrBuilder getDisabledOrBuilder();

  com.google.privacy.dlp.v2.OtherCloudDiscoveryTarget.CadenceCase getCadenceCase();
}
