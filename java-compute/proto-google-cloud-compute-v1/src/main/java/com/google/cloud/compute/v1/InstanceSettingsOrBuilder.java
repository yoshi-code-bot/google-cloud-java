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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface InstanceSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstanceSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies a fingerprint for instance settings, which is essentially a hash of the instance settings resource's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update the instance settings resource. You must always provide an up-to-date fingerprint hash in order to update or change the resource, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the resource.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return Whether the fingerprint field is set.
   */
  boolean hasFingerprint();

  /**
   *
   *
   * <pre>
   * Specifies a fingerprint for instance settings, which is essentially a hash of the instance settings resource's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update the instance settings resource. You must always provide an up-to-date fingerprint hash in order to update or change the resource, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the resource.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The fingerprint.
   */
  java.lang.String getFingerprint();

  /**
   *
   *
   * <pre>
   * Specifies a fingerprint for instance settings, which is essentially a hash of the instance settings resource's contents and used for optimistic locking. The fingerprint is initially generated by Compute Engine and changes after every request to modify or update the instance settings resource. You must always provide an up-to-date fingerprint hash in order to update or change the resource, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the resource.
   * </pre>
   *
   * <code>optional string fingerprint = 234678500;</code>
   *
   * @return The bytes for fingerprint.
   */
  com.google.protobuf.ByteString getFingerprintBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#instance_settings for instance settings.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#instance_settings for instance settings.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();

  /**
   *
   *
   * <pre>
   * [Output Only] Type of the resource. Always compute#instance_settings for instance settings.
   * </pre>
   *
   * <code>optional string kind = 3292052;</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * The metadata key/value pairs assigned to all the instances in the corresponding scope.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceSettingsMetadata metadata = 86866735;</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();

  /**
   *
   *
   * <pre>
   * The metadata key/value pairs assigned to all the instances in the corresponding scope.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceSettingsMetadata metadata = 86866735;</code>
   *
   * @return The metadata.
   */
  com.google.cloud.compute.v1.InstanceSettingsMetadata getMetadata();

  /**
   *
   *
   * <pre>
   * The metadata key/value pairs assigned to all the instances in the corresponding scope.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.InstanceSettingsMetadata metadata = 86866735;</code>
   */
  com.google.cloud.compute.v1.InstanceSettingsMetadataOrBuilder getMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the zone where the resource resides You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return Whether the zone field is set.
   */
  boolean hasZone();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the zone where the resource resides You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The zone.
   */
  java.lang.String getZone();

  /**
   *
   *
   * <pre>
   * [Output Only] URL of the zone where the resource resides You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
   * </pre>
   *
   * <code>optional string zone = 3744684;</code>
   *
   * @return The bytes for zone.
   */
  com.google.protobuf.ByteString getZoneBytes();
}
