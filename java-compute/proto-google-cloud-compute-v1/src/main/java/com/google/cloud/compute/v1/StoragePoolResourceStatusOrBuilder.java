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

public interface StoragePoolResourceStatusOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.StoragePoolResourceStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] Number of disks used.
   * </pre>
   *
   * <code>optional int64 disk_count = 182933485;</code>
   *
   * @return Whether the diskCount field is set.
   */
  boolean hasDiskCount();

  /**
   *
   *
   * <pre>
   * [Output Only] Number of disks used.
   * </pre>
   *
   * <code>optional int64 disk_count = 182933485;</code>
   *
   * @return The diskCount.
   */
  long getDiskCount();

  /**
   *
   *
   * <pre>
   * [Output Only] Timestamp of the last successful resize in RFC3339 text format.
   * </pre>
   *
   * <code>optional string last_resize_timestamp = 500825556;</code>
   *
   * @return Whether the lastResizeTimestamp field is set.
   */
  boolean hasLastResizeTimestamp();

  /**
   *
   *
   * <pre>
   * [Output Only] Timestamp of the last successful resize in RFC3339 text format.
   * </pre>
   *
   * <code>optional string last_resize_timestamp = 500825556;</code>
   *
   * @return The lastResizeTimestamp.
   */
  java.lang.String getLastResizeTimestamp();

  /**
   *
   *
   * <pre>
   * [Output Only] Timestamp of the last successful resize in RFC3339 text format.
   * </pre>
   *
   * <code>optional string last_resize_timestamp = 500825556;</code>
   *
   * @return The bytes for lastResizeTimestamp.
   */
  com.google.protobuf.ByteString getLastResizeTimestampBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Maximum allowed aggregate disk size in gigabytes.
   * </pre>
   *
   * <code>optional int64 max_total_provisioned_disk_capacity_gb = 165818207;</code>
   *
   * @return Whether the maxTotalProvisionedDiskCapacityGb field is set.
   */
  boolean hasMaxTotalProvisionedDiskCapacityGb();

  /**
   *
   *
   * <pre>
   * [Output Only] Maximum allowed aggregate disk size in gigabytes.
   * </pre>
   *
   * <code>optional int64 max_total_provisioned_disk_capacity_gb = 165818207;</code>
   *
   * @return The maxTotalProvisionedDiskCapacityGb.
   */
  long getMaxTotalProvisionedDiskCapacityGb();

  /**
   *
   *
   * <pre>
   * [Output Only] Space used by data stored in disks within the storage pool (in bytes). This will reflect the total number of bytes written to the disks in the pool, in contrast to the capacity of those disks.
   * </pre>
   *
   * <code>optional int64 pool_used_capacity_bytes = 510407877;</code>
   *
   * @return Whether the poolUsedCapacityBytes field is set.
   */
  boolean hasPoolUsedCapacityBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Space used by data stored in disks within the storage pool (in bytes). This will reflect the total number of bytes written to the disks in the pool, in contrast to the capacity of those disks.
   * </pre>
   *
   * <code>optional int64 pool_used_capacity_bytes = 510407877;</code>
   *
   * @return The poolUsedCapacityBytes.
   */
  long getPoolUsedCapacityBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Sum of all the disks' provisioned IOPS, minus some amount that is allowed per disk that is not counted towards pool's IOPS capacity. For more information, see https://cloud.google.com/compute/docs/disks/storage-pools.
   * </pre>
   *
   * <code>optional int64 pool_used_iops = 99558536;</code>
   *
   * @return Whether the poolUsedIops field is set.
   */
  boolean hasPoolUsedIops();

  /**
   *
   *
   * <pre>
   * [Output Only] Sum of all the disks' provisioned IOPS, minus some amount that is allowed per disk that is not counted towards pool's IOPS capacity. For more information, see https://cloud.google.com/compute/docs/disks/storage-pools.
   * </pre>
   *
   * <code>optional int64 pool_used_iops = 99558536;</code>
   *
   * @return The poolUsedIops.
   */
  long getPoolUsedIops();

  /**
   *
   *
   * <pre>
   * [Output Only] Sum of all the disks' provisioned throughput in MB/s.
   * </pre>
   *
   * <code>optional int64 pool_used_throughput = 206130633;</code>
   *
   * @return Whether the poolUsedThroughput field is set.
   */
  boolean hasPoolUsedThroughput();

  /**
   *
   *
   * <pre>
   * [Output Only] Sum of all the disks' provisioned throughput in MB/s.
   * </pre>
   *
   * <code>optional int64 pool_used_throughput = 206130633;</code>
   *
   * @return The poolUsedThroughput.
   */
  long getPoolUsedThroughput();

  /**
   *
   *
   * <pre>
   * [Output Only] Amount of data written into the pool, before it is compacted.
   * </pre>
   *
   * <code>optional int64 pool_user_written_bytes = 228964050;</code>
   *
   * @return Whether the poolUserWrittenBytes field is set.
   */
  boolean hasPoolUserWrittenBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Amount of data written into the pool, before it is compacted.
   * </pre>
   *
   * <code>optional int64 pool_user_written_bytes = 228964050;</code>
   *
   * @return The poolUserWrittenBytes.
   */
  long getPoolUserWrittenBytes();

  /**
   *
   *
   * <pre>
   * [Output Only] Sum of all the capacity provisioned in disks in this storage pool. A disk's provisioned capacity is the same as its total capacity.
   * </pre>
   *
   * <code>optional int64 total_provisioned_disk_capacity_gb = 520930980;</code>
   *
   * @return Whether the totalProvisionedDiskCapacityGb field is set.
   */
  boolean hasTotalProvisionedDiskCapacityGb();

  /**
   *
   *
   * <pre>
   * [Output Only] Sum of all the capacity provisioned in disks in this storage pool. A disk's provisioned capacity is the same as its total capacity.
   * </pre>
   *
   * <code>optional int64 total_provisioned_disk_capacity_gb = 520930980;</code>
   *
   * @return The totalProvisionedDiskCapacityGb.
   */
  long getTotalProvisionedDiskCapacityGb();

  /**
   *
   *
   * <pre>
   * [Output Only] Sum of all the disks' provisioned IOPS.
   * </pre>
   *
   * <code>optional int64 total_provisioned_disk_iops = 32812549;</code>
   *
   * @return Whether the totalProvisionedDiskIops field is set.
   */
  boolean hasTotalProvisionedDiskIops();

  /**
   *
   *
   * <pre>
   * [Output Only] Sum of all the disks' provisioned IOPS.
   * </pre>
   *
   * <code>optional int64 total_provisioned_disk_iops = 32812549;</code>
   *
   * @return The totalProvisionedDiskIops.
   */
  long getTotalProvisionedDiskIops();

  /**
   *
   *
   * <pre>
   * [Output Only] Sum of all the disks' provisioned throughput in MB/s, minus some amount that is allowed per disk that is not counted towards pool's throughput capacity.
   * </pre>
   *
   * <code>optional int64 total_provisioned_disk_throughput = 447677830;</code>
   *
   * @return Whether the totalProvisionedDiskThroughput field is set.
   */
  boolean hasTotalProvisionedDiskThroughput();

  /**
   *
   *
   * <pre>
   * [Output Only] Sum of all the disks' provisioned throughput in MB/s, minus some amount that is allowed per disk that is not counted towards pool's throughput capacity.
   * </pre>
   *
   * <code>optional int64 total_provisioned_disk_throughput = 447677830;</code>
   *
   * @return The totalProvisionedDiskThroughput.
   */
  long getTotalProvisionedDiskThroughput();
}
