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
// source: google/cloud/channel/v1/offers.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Represents the type for a monetizable resource(any entity on which billing
 * happens). For example, this could be MINUTES for Google Voice and GB for
 * Google Drive. One SKU can map to multiple monetizable resources.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.channel.v1.ResourceType}
 */
public enum ResourceType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>RESOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  RESOURCE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Seat.
   * </pre>
   *
   * <code>SEAT = 1;</code>
   */
  SEAT(1),
  /**
   *
   *
   * <pre>
   * Monthly active user.
   * </pre>
   *
   * <code>MAU = 2;</code>
   */
  MAU(2),
  /**
   *
   *
   * <pre>
   * GB (used for storage SKUs).
   * </pre>
   *
   * <code>GB = 3;</code>
   */
  GB(3),
  /**
   *
   *
   * <pre>
   * Active licensed users(for Voice SKUs).
   * </pre>
   *
   * <code>LICENSED_USER = 4;</code>
   */
  LICENSED_USER(4),
  /**
   *
   *
   * <pre>
   * Voice usage.
   * </pre>
   *
   * <code>MINUTES = 5;</code>
   */
  MINUTES(5),
  /**
   *
   *
   * <pre>
   * For IaaS SKUs like Google Cloud, monetization is based on usage accrued on
   * your billing account irrespective of the type of monetizable resource. This
   * enum represents an aggregated resource/container for all usage SKUs on a
   * billing account. Currently, only applicable to Google Cloud.
   * </pre>
   *
   * <code>IAAS_USAGE = 6;</code>
   */
  IAAS_USAGE(6),
  /**
   *
   *
   * <pre>
   * For Google Cloud subscriptions like Anthos or SAP.
   * </pre>
   *
   * <code>SUBSCRIPTION = 7;</code>
   */
  SUBSCRIPTION(7),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>RESOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int RESOURCE_TYPE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Seat.
   * </pre>
   *
   * <code>SEAT = 1;</code>
   */
  public static final int SEAT_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Monthly active user.
   * </pre>
   *
   * <code>MAU = 2;</code>
   */
  public static final int MAU_VALUE = 2;

  /**
   *
   *
   * <pre>
   * GB (used for storage SKUs).
   * </pre>
   *
   * <code>GB = 3;</code>
   */
  public static final int GB_VALUE = 3;

  /**
   *
   *
   * <pre>
   * Active licensed users(for Voice SKUs).
   * </pre>
   *
   * <code>LICENSED_USER = 4;</code>
   */
  public static final int LICENSED_USER_VALUE = 4;

  /**
   *
   *
   * <pre>
   * Voice usage.
   * </pre>
   *
   * <code>MINUTES = 5;</code>
   */
  public static final int MINUTES_VALUE = 5;

  /**
   *
   *
   * <pre>
   * For IaaS SKUs like Google Cloud, monetization is based on usage accrued on
   * your billing account irrespective of the type of monetizable resource. This
   * enum represents an aggregated resource/container for all usage SKUs on a
   * billing account. Currently, only applicable to Google Cloud.
   * </pre>
   *
   * <code>IAAS_USAGE = 6;</code>
   */
  public static final int IAAS_USAGE_VALUE = 6;

  /**
   *
   *
   * <pre>
   * For Google Cloud subscriptions like Anthos or SAP.
   * </pre>
   *
   * <code>SUBSCRIPTION = 7;</code>
   */
  public static final int SUBSCRIPTION_VALUE = 7;

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
  public static ResourceType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResourceType forNumber(int value) {
    switch (value) {
      case 0:
        return RESOURCE_TYPE_UNSPECIFIED;
      case 1:
        return SEAT;
      case 2:
        return MAU;
      case 3:
        return GB;
      case 4:
        return LICENSED_USER;
      case 5:
        return MINUTES;
      case 6:
        return IAAS_USAGE;
      case 7:
        return SUBSCRIPTION;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResourceType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ResourceType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ResourceType>() {
        public ResourceType findValueByNumber(int number) {
          return ResourceType.forNumber(number);
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
    return com.google.cloud.channel.v1.OffersProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final ResourceType[] VALUES = values();

  public static ResourceType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResourceType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.channel.v1.ResourceType)
}
