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
// source: google/cloud/securitycentermanagement/v1/security_center_management.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycentermanagement.v1;

public interface SimulatedFindingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycentermanagement.v1.SimulatedFinding)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The [relative resource name](https://google.aip.dev/122) of the
   * finding, in one of the following formats:
   *
   * * `organizations/{organization_id}/sources/{source_id}/findings/{finding_id}`
   * * `folders/{folder_id}/sources/{source_id}/findings/{finding_id}`
   * * `projects/{project_id}/sources/{source_id}/findings/{finding_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The [relative resource name](https://google.aip.dev/122) of the
   * finding, in one of the following formats:
   *
   * * `organizations/{organization_id}/sources/{source_id}/findings/{finding_id}`
   * * `folders/{folder_id}/sources/{source_id}/findings/{finding_id}`
   * * `projects/{project_id}/sources/{source_id}/findings/{finding_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The [relative resource name](https://google.aip.dev/122) of the source the
   * finding belongs to. For example,
   * `organizations/{organization_id}/sources/{source_id}`. This field is
   * immutable after creation time.
   * </pre>
   *
   * <code>string parent = 2;</code>
   *
   * @return The parent.
   */
  java.lang.String getParent();

  /**
   *
   *
   * <pre>
   * The [relative resource name](https://google.aip.dev/122) of the source the
   * finding belongs to. For example,
   * `organizations/{organization_id}/sources/{source_id}`. This field is
   * immutable after creation time.
   * </pre>
   *
   * <code>string parent = 2;</code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * For findings on Google Cloud resources, the
   * [full resource name](https://google.aip.dev/122#full-resource-names) of the
   * Google Cloud resource this finding is for. When the finding is for a
   * non-Google Cloud resource, the value can be a customer or partner defined
   * string. This field is immutable after creation time.
   * </pre>
   *
   * <code>string resource_name = 3;</code>
   *
   * @return The resourceName.
   */
  java.lang.String getResourceName();

  /**
   *
   *
   * <pre>
   * For findings on Google Cloud resources, the
   * [full resource name](https://google.aip.dev/122#full-resource-names) of the
   * Google Cloud resource this finding is for. When the finding is for a
   * non-Google Cloud resource, the value can be a customer or partner defined
   * string. This field is immutable after creation time.
   * </pre>
   *
   * <code>string resource_name = 3;</code>
   *
   * @return The bytes for resourceName.
   */
  com.google.protobuf.ByteString getResourceNameBytes();

  /**
   *
   *
   * <pre>
   * The additional taxonomy group within findings from a given source. For
   * example, `XSS_FLASH_INJECTION`. This field is immutable after creation
   * time.
   * </pre>
   *
   * <code>string category = 4;</code>
   *
   * @return The category.
   */
  java.lang.String getCategory();

  /**
   *
   *
   * <pre>
   * The additional taxonomy group within findings from a given source. For
   * example, `XSS_FLASH_INJECTION`. This field is immutable after creation
   * time.
   * </pre>
   *
   * <code>string category = 4;</code>
   *
   * @return The bytes for category.
   */
  com.google.protobuf.ByteString getCategoryBytes();

  /**
   *
   *
   * <pre>
   * Output only. The state of the finding.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.SimulatedFinding.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. The state of the finding.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.SimulatedFinding.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.securitycentermanagement.v1.SimulatedFinding.State getState();

  /**
   *
   *
   * <pre>
   * Source-specific properties. These properties are managed by the source
   * that writes the finding. The key names must be between 1 and 255
   * characters; they must start with a letter and contain alphanumeric
   * characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 6;</code>
   */
  int getSourcePropertiesCount();

  /**
   *
   *
   * <pre>
   * Source-specific properties. These properties are managed by the source
   * that writes the finding. The key names must be between 1 and 255
   * characters; they must start with a letter and contain alphanumeric
   * characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 6;</code>
   */
  boolean containsSourceProperties(java.lang.String key);

  /** Use {@link #getSourcePropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Value> getSourceProperties();

  /**
   *
   *
   * <pre>
   * Source-specific properties. These properties are managed by the source
   * that writes the finding. The key names must be between 1 and 255
   * characters; they must start with a letter and contain alphanumeric
   * characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 6;</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Value> getSourcePropertiesMap();

  /**
   *
   *
   * <pre>
   * Source-specific properties. These properties are managed by the source
   * that writes the finding. The key names must be between 1 and 255
   * characters; they must start with a letter and contain alphanumeric
   * characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 6;</code>
   */
  /* nullable */
  com.google.protobuf.Value getSourcePropertiesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.protobuf.Value defaultValue);

  /**
   *
   *
   * <pre>
   * Source-specific properties. These properties are managed by the source
   * that writes the finding. The key names must be between 1 and 255
   * characters; they must start with a letter and contain alphanumeric
   * characters or underscores only.
   * </pre>
   *
   * <code>map&lt;string, .google.protobuf.Value&gt; source_properties = 6;</code>
   */
  com.google.protobuf.Value getSourcePropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The time the finding was first detected. If an existing finding is updated,
   * then this is the time the update occurred. If the finding is later
   * resolved, then this time reflects when the finding was resolved.
   *
   * For example, if the finding represents an open firewall, this property
   * captures the time the detector believes the firewall became open. The
   * accuracy is determined by the detector.
   *
   * The event time must not be set to a value greater than the current
   * timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 7;</code>
   *
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();

  /**
   *
   *
   * <pre>
   * The time the finding was first detected. If an existing finding is updated,
   * then this is the time the update occurred. If the finding is later
   * resolved, then this time reflects when the finding was resolved.
   *
   * For example, if the finding represents an open firewall, this property
   * captures the time the detector believes the firewall became open. The
   * accuracy is determined by the detector.
   *
   * The event time must not be set to a value greater than the current
   * timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 7;</code>
   *
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();

  /**
   *
   *
   * <pre>
   * The time the finding was first detected. If an existing finding is updated,
   * then this is the time the update occurred. If the finding is later
   * resolved, then this time reflects when the finding was resolved.
   *
   * For example, if the finding represents an open firewall, this property
   * captures the time the detector believes the firewall became open. The
   * accuracy is determined by the detector.
   *
   * The event time must not be set to a value greater than the current
   * timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 7;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The severity of the finding. This field is managed by the source that
   * writes the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycentermanagement.v1.SimulatedFinding.Severity severity = 8;</code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  int getSeverityValue();

  /**
   *
   *
   * <pre>
   * The severity of the finding. This field is managed by the source that
   * writes the finding.
   * </pre>
   *
   * <code>.google.cloud.securitycentermanagement.v1.SimulatedFinding.Severity severity = 8;</code>
   *
   * @return The severity.
   */
  com.google.cloud.securitycentermanagement.v1.SimulatedFinding.Severity getSeverity();

  /**
   *
   *
   * <pre>
   * The class of the finding.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.SimulatedFinding.FindingClass finding_class = 9;
   * </code>
   *
   * @return The enum numeric value on the wire for findingClass.
   */
  int getFindingClassValue();

  /**
   *
   *
   * <pre>
   * The class of the finding.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycentermanagement.v1.SimulatedFinding.FindingClass finding_class = 9;
   * </code>
   *
   * @return The findingClass.
   */
  com.google.cloud.securitycentermanagement.v1.SimulatedFinding.FindingClass getFindingClass();
}
