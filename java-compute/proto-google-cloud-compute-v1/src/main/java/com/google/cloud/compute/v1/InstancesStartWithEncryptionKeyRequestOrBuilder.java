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

public interface InstancesStartWithEncryptionKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.InstancesStartWithEncryptionKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk> getDisksList();

  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk getDisks(int index);

  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
   * </code>
   */
  int getDisksCount();

  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
   * </code>
   */
  java.util.List<? extends com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDiskOrBuilder>
      getDisksOrBuilderList();

  /**
   *
   *
   * <pre>
   * Array of disks associated with this instance that are protected with a customer-supplied encryption key. In order to start the instance, the disk url and its corresponding key must be provided. If the disk is not protected with a customer-supplied encryption key it should not be specified.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.CustomerEncryptionKeyProtectedDisk disks = 95594102;
   * </code>
   */
  com.google.cloud.compute.v1.CustomerEncryptionKeyProtectedDiskOrBuilder getDisksOrBuilder(
      int index);
}
