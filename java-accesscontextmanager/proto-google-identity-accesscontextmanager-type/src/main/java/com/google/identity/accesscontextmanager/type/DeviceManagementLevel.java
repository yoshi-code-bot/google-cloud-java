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
// source: google/identity/accesscontextmanager/type/device_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.identity.accesscontextmanager.type;

/**
 *
 *
 * <pre>
 * The degree to which the device is managed by the Cloud organization.
 * </pre>
 *
 * Protobuf enum {@code google.identity.accesscontextmanager.type.DeviceManagementLevel}
 */
public enum DeviceManagementLevel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The device's management level is not specified or not known.
   * </pre>
   *
   * <code>MANAGEMENT_UNSPECIFIED = 0;</code>
   */
  MANAGEMENT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The device is not managed.
   * </pre>
   *
   * <code>NONE = 1;</code>
   */
  NONE(1),
  /**
   *
   *
   * <pre>
   * Basic management is enabled, which is generally limited to monitoring and
   * wiping the corporate account.
   * </pre>
   *
   * <code>BASIC = 2;</code>
   */
  BASIC(2),
  /**
   *
   *
   * <pre>
   * Complete device management. This includes more thorough monitoring and the
   * ability to directly manage the device (such as remote wiping). This can be
   * enabled through the Android Enterprise Platform.
   * </pre>
   *
   * <code>COMPLETE = 3;</code>
   */
  COMPLETE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The device's management level is not specified or not known.
   * </pre>
   *
   * <code>MANAGEMENT_UNSPECIFIED = 0;</code>
   */
  public static final int MANAGEMENT_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The device is not managed.
   * </pre>
   *
   * <code>NONE = 1;</code>
   */
  public static final int NONE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Basic management is enabled, which is generally limited to monitoring and
   * wiping the corporate account.
   * </pre>
   *
   * <code>BASIC = 2;</code>
   */
  public static final int BASIC_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Complete device management. This includes more thorough monitoring and the
   * ability to directly manage the device (such as remote wiping). This can be
   * enabled through the Android Enterprise Platform.
   * </pre>
   *
   * <code>COMPLETE = 3;</code>
   */
  public static final int COMPLETE_VALUE = 3;

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
  public static DeviceManagementLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DeviceManagementLevel forNumber(int value) {
    switch (value) {
      case 0:
        return MANAGEMENT_UNSPECIFIED;
      case 1:
        return NONE;
      case 2:
        return BASIC;
      case 3:
        return COMPLETE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeviceManagementLevel>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DeviceManagementLevel>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DeviceManagementLevel>() {
            public DeviceManagementLevel findValueByNumber(int number) {
              return DeviceManagementLevel.forNumber(number);
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
    return com.google.identity.accesscontextmanager.type.TypeProto.getDescriptor()
        .getEnumTypes()
        .get(2);
  }

  private static final DeviceManagementLevel[] VALUES = values();

  public static DeviceManagementLevel valueOf(
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

  private DeviceManagementLevel(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.identity.accesscontextmanager.type.DeviceManagementLevel)
}
