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
// source: google/cloud/baremetalsolution/v2/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.baremetalsolution.v2;

/**
 *
 *
 * <pre>
 * Performance tier of the Volume.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.baremetalsolution.v2.VolumePerformanceTier}
 */
public enum VolumePerformanceTier implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Value is not specified.
   * </pre>
   *
   * <code>VOLUME_PERFORMANCE_TIER_UNSPECIFIED = 0;</code>
   */
  VOLUME_PERFORMANCE_TIER_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Regular volumes, shared aggregates.
   * </pre>
   *
   * <code>VOLUME_PERFORMANCE_TIER_SHARED = 1;</code>
   */
  VOLUME_PERFORMANCE_TIER_SHARED(1),
  /**
   *
   *
   * <pre>
   * Assigned aggregates.
   * </pre>
   *
   * <code>VOLUME_PERFORMANCE_TIER_ASSIGNED = 2;</code>
   */
  VOLUME_PERFORMANCE_TIER_ASSIGNED(2),
  /**
   *
   *
   * <pre>
   * High throughput aggregates.
   * </pre>
   *
   * <code>VOLUME_PERFORMANCE_TIER_HT = 3;</code>
   */
  VOLUME_PERFORMANCE_TIER_HT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Value is not specified.
   * </pre>
   *
   * <code>VOLUME_PERFORMANCE_TIER_UNSPECIFIED = 0;</code>
   */
  public static final int VOLUME_PERFORMANCE_TIER_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Regular volumes, shared aggregates.
   * </pre>
   *
   * <code>VOLUME_PERFORMANCE_TIER_SHARED = 1;</code>
   */
  public static final int VOLUME_PERFORMANCE_TIER_SHARED_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Assigned aggregates.
   * </pre>
   *
   * <code>VOLUME_PERFORMANCE_TIER_ASSIGNED = 2;</code>
   */
  public static final int VOLUME_PERFORMANCE_TIER_ASSIGNED_VALUE = 2;

  /**
   *
   *
   * <pre>
   * High throughput aggregates.
   * </pre>
   *
   * <code>VOLUME_PERFORMANCE_TIER_HT = 3;</code>
   */
  public static final int VOLUME_PERFORMANCE_TIER_HT_VALUE = 3;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static VolumePerformanceTier valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static VolumePerformanceTier forNumber(int value) {
    switch (value) {
      case 0:
        return VOLUME_PERFORMANCE_TIER_UNSPECIFIED;
      case 1:
        return VOLUME_PERFORMANCE_TIER_SHARED;
      case 2:
        return VOLUME_PERFORMANCE_TIER_ASSIGNED;
      case 3:
        return VOLUME_PERFORMANCE_TIER_HT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<VolumePerformanceTier>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<VolumePerformanceTier>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<VolumePerformanceTier>() {
            public VolumePerformanceTier findValueByNumber(int number) {
              return VolumePerformanceTier.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.baremetalsolution.v2.CommonProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final VolumePerformanceTier[] VALUES = values();

  public static VolumePerformanceTier valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private VolumePerformanceTier(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.baremetalsolution.v2.VolumePerformanceTier)
}
