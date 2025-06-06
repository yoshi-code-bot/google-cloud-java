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
// source: google/cloud/servicehealth/v1/event_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.servicehealth.v1;

public interface OrganizationImpactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.servicehealth.v1.OrganizationImpact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Identifier. Unique name of the organization impact in this
   * scope including organization and location using the form
   * `organizations/{organization_id}/locations/{location}/organizationImpacts/{organization_impact_id}`.
   *
   * `organization_id` - ID (number) of the organization that contains the
   * event. To get your `organization_id`, see
   * [Getting your organization resource
   * ID](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).&lt;br&gt;
   * `organization_impact_id` - ID of the [OrganizationImpact
   * resource](/service-health/docs/reference/rest/v1beta/organizations.locations.organizationImpacts#OrganizationImpact).
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Output only. Identifier. Unique name of the organization impact in this
   * scope including organization and location using the form
   * `organizations/{organization_id}/locations/{location}/organizationImpacts/{organization_impact_id}`.
   *
   * `organization_id` - ID (number) of the organization that contains the
   * event. To get your `organization_id`, see
   * [Getting your organization resource
   * ID](https://cloud.google.com/resource-manager/docs/creating-managing-organization#retrieving_your_organization_id).&lt;br&gt;
   * `organization_impact_id` - ID of the [OrganizationImpact
   * resource](/service-health/docs/reference/rest/v1beta/organizations.locations.organizationImpacts#OrganizationImpact).
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.field_behavior) = IDENTIFIER];
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A list of event names impacting the asset.
   * </pre>
   *
   * <code>
   * repeated string events = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the events.
   */
  java.util.List<java.lang.String> getEventsList();

  /**
   *
   *
   * <pre>
   * Output only. A list of event names impacting the asset.
   * </pre>
   *
   * <code>
   * repeated string events = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of events.
   */
  int getEventsCount();

  /**
   *
   *
   * <pre>
   * Output only. A list of event names impacting the asset.
   * </pre>
   *
   * <code>
   * repeated string events = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The events at the given index.
   */
  java.lang.String getEvents(int index);

  /**
   *
   *
   * <pre>
   * Output only. A list of event names impacting the asset.
   * </pre>
   *
   * <code>
   * repeated string events = 2 [(.google.api.field_behavior) = OUTPUT_ONLY, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the events at the given index.
   */
  com.google.protobuf.ByteString getEventsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. Google Cloud asset possibly impacted by the specified events.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Asset asset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the asset field is set.
   */
  boolean hasAsset();

  /**
   *
   *
   * <pre>
   * Output only. Google Cloud asset possibly impacted by the specified events.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Asset asset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The asset.
   */
  com.google.cloud.servicehealth.v1.Asset getAsset();

  /**
   *
   *
   * <pre>
   * Output only. Google Cloud asset possibly impacted by the specified events.
   * </pre>
   *
   * <code>
   * .google.cloud.servicehealth.v1.Asset asset = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.servicehealth.v1.AssetOrBuilder getAssetOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time when the affected project was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the affected project was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the affected project was last modified.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();
}
