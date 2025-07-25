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
// source: google/cloud/backupdr/v1/backupvault_gce.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.backupdr.v1;

public interface AttachedDiskOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.backupdr.v1.AttachedDisk)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Specifies the parameters to initialize this disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.InitializeParams initialize_params = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the initializeParams field is set.
   */
  boolean hasInitializeParams();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the parameters to initialize this disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.InitializeParams initialize_params = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The initializeParams.
   */
  com.google.cloud.backupdr.v1.AttachedDisk.InitializeParams getInitializeParams();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the parameters to initialize this disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.InitializeParams initialize_params = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.backupdr.v1.AttachedDisk.InitializeParamsOrBuilder
      getInitializeParamsOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. This is used as an identifier for the disks. This is the unique
   * name has to provided to modify disk parameters like disk_name and
   * replica_zones (in case of RePDs)
   * </pre>
   *
   * <code>optional string device_name = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the deviceName field is set.
   */
  boolean hasDeviceName();

  /**
   *
   *
   * <pre>
   * Optional. This is used as an identifier for the disks. This is the unique
   * name has to provided to modify disk parameters like disk_name and
   * replica_zones (in case of RePDs)
   * </pre>
   *
   * <code>optional string device_name = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The deviceName.
   */
  java.lang.String getDeviceName();

  /**
   *
   *
   * <pre>
   * Optional. This is used as an identifier for the disks. This is the unique
   * name has to provided to modify disk parameters like disk_name and
   * replica_zones (in case of RePDs)
   * </pre>
   *
   * <code>optional string device_name = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for deviceName.
   */
  com.google.protobuf.ByteString getDeviceNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Type of the resource.
   * </pre>
   *
   * <code>optional string kind = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the kind field is set.
   */
  boolean hasKind();

  /**
   *
   *
   * <pre>
   * Optional. Type of the resource.
   * </pre>
   *
   * <code>optional string kind = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The kind.
   */
  java.lang.String getKind();

  /**
   *
   *
   * <pre>
   * Optional. Type of the resource.
   * </pre>
   *
   * <code>optional string kind = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for kind.
   */
  com.google.protobuf.ByteString getKindBytes();

  /**
   *
   *
   * <pre>
   * Specifies the type of the disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskType disk_type_deprecated = 6 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.backupdr.v1.AttachedDisk.disk_type_deprecated is deprecated. See
   *     google/cloud/backupdr/v1/backupvault_gce.proto;l=832
   * @return Whether the diskTypeDeprecated field is set.
   */
  @java.lang.Deprecated
  boolean hasDiskTypeDeprecated();

  /**
   *
   *
   * <pre>
   * Specifies the type of the disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskType disk_type_deprecated = 6 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.backupdr.v1.AttachedDisk.disk_type_deprecated is deprecated. See
   *     google/cloud/backupdr/v1/backupvault_gce.proto;l=832
   * @return The enum numeric value on the wire for diskTypeDeprecated.
   */
  @java.lang.Deprecated
  int getDiskTypeDeprecatedValue();

  /**
   *
   *
   * <pre>
   * Specifies the type of the disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskType disk_type_deprecated = 6 [deprecated = true];
   * </code>
   *
   * @deprecated google.cloud.backupdr.v1.AttachedDisk.disk_type_deprecated is deprecated. See
   *     google/cloud/backupdr/v1/backupvault_gce.proto;l=832
   * @return The diskTypeDeprecated.
   */
  @java.lang.Deprecated
  com.google.cloud.backupdr.v1.AttachedDisk.DiskType getDiskTypeDeprecated();

  /**
   *
   *
   * <pre>
   * Optional. The mode in which to attach this disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskMode mode = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the mode field is set.
   */
  boolean hasMode();

  /**
   *
   *
   * <pre>
   * Optional. The mode in which to attach this disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskMode mode = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for mode.
   */
  int getModeValue();

  /**
   *
   *
   * <pre>
   * Optional. The mode in which to attach this disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskMode mode = 7 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The mode.
   */
  com.google.cloud.backupdr.v1.AttachedDisk.DiskMode getMode();

  /**
   *
   *
   * <pre>
   * Optional. Specifies a valid partial or full URL to an existing Persistent
   * Disk resource.
   * </pre>
   *
   * <code>optional string source = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();

  /**
   *
   *
   * <pre>
   * Optional. Specifies a valid partial or full URL to an existing Persistent
   * Disk resource.
   * </pre>
   *
   * <code>optional string source = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The source.
   */
  java.lang.String getSource();

  /**
   *
   *
   * <pre>
   * Optional. Specifies a valid partial or full URL to an existing Persistent
   * Disk resource.
   * </pre>
   *
   * <code>optional string source = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for source.
   */
  com.google.protobuf.ByteString getSourceBytes();

  /**
   *
   *
   * <pre>
   * Optional. A zero-based index to this disk, where 0 is reserved for the
   * boot disk.
   * </pre>
   *
   * <code>optional int64 index = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the index field is set.
   */
  boolean hasIndex();

  /**
   *
   *
   * <pre>
   * Optional. A zero-based index to this disk, where 0 is reserved for the
   * boot disk.
   * </pre>
   *
   * <code>optional int64 index = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The index.
   */
  long getIndex();

  /**
   *
   *
   * <pre>
   * Optional. Indicates that this is a boot disk. The virtual machine will use
   * the first partition of the disk for its root filesystem.
   * </pre>
   *
   * <code>optional bool boot = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the boot field is set.
   */
  boolean hasBoot();

  /**
   *
   *
   * <pre>
   * Optional. Indicates that this is a boot disk. The virtual machine will use
   * the first partition of the disk for its root filesystem.
   * </pre>
   *
   * <code>optional bool boot = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The boot.
   */
  boolean getBoot();

  /**
   *
   *
   * <pre>
   * Optional. Specifies whether the disk will be auto-deleted when the instance
   * is deleted (but not when the disk is detached from the instance).
   * </pre>
   *
   * <code>optional bool auto_delete = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the autoDelete field is set.
   */
  boolean hasAutoDelete();

  /**
   *
   *
   * <pre>
   * Optional. Specifies whether the disk will be auto-deleted when the instance
   * is deleted (but not when the disk is detached from the instance).
   * </pre>
   *
   * <code>optional bool auto_delete = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The autoDelete.
   */
  boolean getAutoDelete();

  /**
   *
   *
   * <pre>
   * Optional. Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string license = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the license.
   */
  java.util.List<java.lang.String> getLicenseList();

  /**
   *
   *
   * <pre>
   * Optional. Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string license = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of license.
   */
  int getLicenseCount();

  /**
   *
   *
   * <pre>
   * Optional. Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string license = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The license at the given index.
   */
  java.lang.String getLicense(int index);

  /**
   *
   *
   * <pre>
   * Optional. Any valid publicly visible licenses.
   * </pre>
   *
   * <code>repeated string license = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the license at the given index.
   */
  com.google.protobuf.ByteString getLicenseBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Specifies the disk interface to use for attaching this disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskInterface disk_interface = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the diskInterface field is set.
   */
  boolean hasDiskInterface();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the disk interface to use for attaching this disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskInterface disk_interface = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for diskInterface.
   */
  int getDiskInterfaceValue();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the disk interface to use for attaching this disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskInterface disk_interface = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The diskInterface.
   */
  com.google.cloud.backupdr.v1.AttachedDisk.DiskInterface getDiskInterface();

  /**
   *
   *
   * <pre>
   * Optional. A list of features to enable on the guest operating system.
   * Applicable only for bootable images.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.backupdr.v1.GuestOsFeature guest_os_feature = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.backupdr.v1.GuestOsFeature> getGuestOsFeatureList();

  /**
   *
   *
   * <pre>
   * Optional. A list of features to enable on the guest operating system.
   * Applicable only for bootable images.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.backupdr.v1.GuestOsFeature guest_os_feature = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.backupdr.v1.GuestOsFeature getGuestOsFeature(int index);

  /**
   *
   *
   * <pre>
   * Optional. A list of features to enable on the guest operating system.
   * Applicable only for bootable images.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.backupdr.v1.GuestOsFeature guest_os_feature = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getGuestOsFeatureCount();

  /**
   *
   *
   * <pre>
   * Optional. A list of features to enable on the guest operating system.
   * Applicable only for bootable images.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.backupdr.v1.GuestOsFeature guest_os_feature = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.backupdr.v1.GuestOsFeatureOrBuilder>
      getGuestOsFeatureOrBuilderList();

  /**
   *
   *
   * <pre>
   * Optional. A list of features to enable on the guest operating system.
   * Applicable only for bootable images.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.backupdr.v1.GuestOsFeature guest_os_feature = 14 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.backupdr.v1.GuestOsFeatureOrBuilder getGuestOsFeatureOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Optional. Encrypts or decrypts a disk using a customer-supplied
   * encryption key.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.CustomerEncryptionKey disk_encryption_key = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the diskEncryptionKey field is set.
   */
  boolean hasDiskEncryptionKey();

  /**
   *
   *
   * <pre>
   * Optional. Encrypts or decrypts a disk using a customer-supplied
   * encryption key.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.CustomerEncryptionKey disk_encryption_key = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The diskEncryptionKey.
   */
  com.google.cloud.backupdr.v1.CustomerEncryptionKey getDiskEncryptionKey();

  /**
   *
   *
   * <pre>
   * Optional. Encrypts or decrypts a disk using a customer-supplied
   * encryption key.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.CustomerEncryptionKey disk_encryption_key = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.backupdr.v1.CustomerEncryptionKeyOrBuilder getDiskEncryptionKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The size of the disk in GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the diskSizeGb field is set.
   */
  boolean hasDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Optional. The size of the disk in GB.
   * </pre>
   *
   * <code>optional int64 disk_size_gb = 16 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The diskSizeGb.
   */
  long getDiskSizeGb();

  /**
   *
   *
   * <pre>
   * Optional. Output only. The state of the disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskSavedState saved_state = 17 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the savedState field is set.
   */
  boolean hasSavedState();

  /**
   *
   *
   * <pre>
   * Optional. Output only. The state of the disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskSavedState saved_state = 17 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for savedState.
   */
  int getSavedStateValue();

  /**
   *
   *
   * <pre>
   * Optional. Output only. The state of the disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskSavedState saved_state = 17 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The savedState.
   */
  com.google.cloud.backupdr.v1.AttachedDisk.DiskSavedState getSavedState();

  /**
   *
   *
   * <pre>
   * Optional. Output only. The URI of the disk type resource. For example:
   * projects/project/zones/zone/diskTypes/pd-standard or pd-ssd
   * </pre>
   *
   * <code>
   * optional string disk_type = 18 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the diskType field is set.
   */
  boolean hasDiskType();

  /**
   *
   *
   * <pre>
   * Optional. Output only. The URI of the disk type resource. For example:
   * projects/project/zones/zone/diskTypes/pd-standard or pd-ssd
   * </pre>
   *
   * <code>
   * optional string disk_type = 18 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The diskType.
   */
  java.lang.String getDiskType();

  /**
   *
   *
   * <pre>
   * Optional. Output only. The URI of the disk type resource. For example:
   * projects/project/zones/zone/diskTypes/pd-standard or pd-ssd
   * </pre>
   *
   * <code>
   * optional string disk_type = 18 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for diskType.
   */
  com.google.protobuf.ByteString getDiskTypeBytes();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the type of the disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskType type = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the type of the disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskType type = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();

  /**
   *
   *
   * <pre>
   * Optional. Specifies the type of the disk.
   * </pre>
   *
   * <code>
   * optional .google.cloud.backupdr.v1.AttachedDisk.DiskType type = 19 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The type.
   */
  com.google.cloud.backupdr.v1.AttachedDisk.DiskType getType();
}
