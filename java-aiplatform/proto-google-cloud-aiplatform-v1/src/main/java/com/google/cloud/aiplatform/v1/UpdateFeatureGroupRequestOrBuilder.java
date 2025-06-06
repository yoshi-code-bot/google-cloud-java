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
// source: google/cloud/aiplatform/v1/feature_registry_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public interface UpdateFeatureGroupRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.UpdateFeatureGroupRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The FeatureGroup's `name` field is used to identify the
   * FeatureGroup to be updated. Format:
   * `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureGroup feature_group = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the featureGroup field is set.
   */
  boolean hasFeatureGroup();

  /**
   *
   *
   * <pre>
   * Required. The FeatureGroup's `name` field is used to identify the
   * FeatureGroup to be updated. Format:
   * `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureGroup feature_group = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The featureGroup.
   */
  com.google.cloud.aiplatform.v1.FeatureGroup getFeatureGroup();

  /**
   *
   *
   * <pre>
   * Required. The FeatureGroup's `name` field is used to identify the
   * FeatureGroup to be updated. Format:
   * `projects/{project}/locations/{location}/featureGroups/{feature_group}`
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.FeatureGroup feature_group = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.FeatureGroupOrBuilder getFeatureGroupOrBuilder();

  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * FeatureGroup resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then only the non-empty fields present in the
   * request will be overwritten. Set the update_mask to `*` to override all
   * fields.
   *
   * Updatable fields:
   *
   *   * `labels`
   *   * `description`
   *   * `big_query`
   *   * `big_query.entity_id_columns`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * FeatureGroup resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then only the non-empty fields present in the
   * request will be overwritten. Set the update_mask to `*` to override all
   * fields.
   *
   * Updatable fields:
   *
   *   * `labels`
   *   * `description`
   *   * `big_query`
   *   * `big_query.entity_id_columns`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Field mask is used to specify the fields to be overwritten in the
   * FeatureGroup resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then only the non-empty fields present in the
   * request will be overwritten. Set the update_mask to `*` to override all
   * fields.
   *
   * Updatable fields:
   *
   *   * `labels`
   *   * `description`
   *   * `big_query`
   *   * `big_query.entity_id_columns`
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
