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
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * AccessType is an enum of all the supported access types for a volume.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.netapp.v1.AccessType}
 */
public enum AccessType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified Access Type
   * </pre>
   *
   * <code>ACCESS_TYPE_UNSPECIFIED = 0;</code>
   */
  ACCESS_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Read Only
   * </pre>
   *
   * <code>READ_ONLY = 1;</code>
   */
  READ_ONLY(1),
  /**
   *
   *
   * <pre>
   * Read Write
   * </pre>
   *
   * <code>READ_WRITE = 2;</code>
   */
  READ_WRITE(2),
  /**
   *
   *
   * <pre>
   * None
   * </pre>
   *
   * <code>READ_NONE = 3;</code>
   */
  READ_NONE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified Access Type
   * </pre>
   *
   * <code>ACCESS_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ACCESS_TYPE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Read Only
   * </pre>
   *
   * <code>READ_ONLY = 1;</code>
   */
  public static final int READ_ONLY_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Read Write
   * </pre>
   *
   * <code>READ_WRITE = 2;</code>
   */
  public static final int READ_WRITE_VALUE = 2;

  /**
   *
   *
   * <pre>
   * None
   * </pre>
   *
   * <code>READ_NONE = 3;</code>
   */
  public static final int READ_NONE_VALUE = 3;

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
  public static AccessType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AccessType forNumber(int value) {
    switch (value) {
      case 0:
        return ACCESS_TYPE_UNSPECIFIED;
      case 1:
        return READ_ONLY;
      case 2:
        return READ_WRITE;
      case 3:
        return READ_NONE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AccessType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<AccessType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<AccessType>() {
        public AccessType findValueByNumber(int number) {
          return AccessType.forNumber(number);
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
    return com.google.cloud.netapp.v1.VolumeProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final AccessType[] VALUES = values();

  public static AccessType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AccessType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.netapp.v1.AccessType)
}
