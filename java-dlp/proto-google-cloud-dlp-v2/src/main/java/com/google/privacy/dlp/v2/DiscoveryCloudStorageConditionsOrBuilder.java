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

public interface DiscoveryCloudStorageConditionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.DiscoveryCloudStorageConditions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Only objects with the specified attributes will be scanned. If an
   * object has one of the specified attributes but is inside an excluded
   * bucket, it will not be scanned. Defaults to [ALL_SUPPORTED_OBJECTS]. A
   * profile will be created even if no objects match the
   * included_object_attributes.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageObjectAttribute included_object_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the includedObjectAttributes.
   */
  java.util.List<
          com.google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageObjectAttribute>
      getIncludedObjectAttributesList();

  /**
   *
   *
   * <pre>
   * Required. Only objects with the specified attributes will be scanned. If an
   * object has one of the specified attributes but is inside an excluded
   * bucket, it will not be scanned. Defaults to [ALL_SUPPORTED_OBJECTS]. A
   * profile will be created even if no objects match the
   * included_object_attributes.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageObjectAttribute included_object_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of includedObjectAttributes.
   */
  int getIncludedObjectAttributesCount();

  /**
   *
   *
   * <pre>
   * Required. Only objects with the specified attributes will be scanned. If an
   * object has one of the specified attributes but is inside an excluded
   * bucket, it will not be scanned. Defaults to [ALL_SUPPORTED_OBJECTS]. A
   * profile will be created even if no objects match the
   * included_object_attributes.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageObjectAttribute included_object_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The includedObjectAttributes at the given index.
   */
  com.google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageObjectAttribute
      getIncludedObjectAttributes(int index);

  /**
   *
   *
   * <pre>
   * Required. Only objects with the specified attributes will be scanned. If an
   * object has one of the specified attributes but is inside an excluded
   * bucket, it will not be scanned. Defaults to [ALL_SUPPORTED_OBJECTS]. A
   * profile will be created even if no objects match the
   * included_object_attributes.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageObjectAttribute included_object_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for includedObjectAttributes.
   */
  java.util.List<java.lang.Integer> getIncludedObjectAttributesValueList();

  /**
   *
   *
   * <pre>
   * Required. Only objects with the specified attributes will be scanned. If an
   * object has one of the specified attributes but is inside an excluded
   * bucket, it will not be scanned. Defaults to [ALL_SUPPORTED_OBJECTS]. A
   * profile will be created even if no objects match the
   * included_object_attributes.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageObjectAttribute included_object_attributes = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of includedObjectAttributes at the given index.
   */
  int getIncludedObjectAttributesValue(int index);

  /**
   *
   *
   * <pre>
   * Required. Only objects with the specified attributes will be scanned.
   * Defaults to [ALL_SUPPORTED_BUCKETS] if unset.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageBucketAttribute included_bucket_attributes = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the includedBucketAttributes.
   */
  java.util.List<
          com.google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageBucketAttribute>
      getIncludedBucketAttributesList();

  /**
   *
   *
   * <pre>
   * Required. Only objects with the specified attributes will be scanned.
   * Defaults to [ALL_SUPPORTED_BUCKETS] if unset.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageBucketAttribute included_bucket_attributes = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The count of includedBucketAttributes.
   */
  int getIncludedBucketAttributesCount();

  /**
   *
   *
   * <pre>
   * Required. Only objects with the specified attributes will be scanned.
   * Defaults to [ALL_SUPPORTED_BUCKETS] if unset.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageBucketAttribute included_bucket_attributes = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The includedBucketAttributes at the given index.
   */
  com.google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageBucketAttribute
      getIncludedBucketAttributes(int index);

  /**
   *
   *
   * <pre>
   * Required. Only objects with the specified attributes will be scanned.
   * Defaults to [ALL_SUPPORTED_BUCKETS] if unset.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageBucketAttribute included_bucket_attributes = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for includedBucketAttributes.
   */
  java.util.List<java.lang.Integer> getIncludedBucketAttributesValueList();

  /**
   *
   *
   * <pre>
   * Required. Only objects with the specified attributes will be scanned.
   * Defaults to [ALL_SUPPORTED_BUCKETS] if unset.
   * </pre>
   *
   * <code>
   * repeated .google.privacy.dlp.v2.DiscoveryCloudStorageConditions.CloudStorageBucketAttribute included_bucket_attributes = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of includedBucketAttributes at the given index.
   */
  int getIncludedBucketAttributesValue(int index);
}
