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
// source: google/cloud/domains/v1/domains.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.domains.v1;

/**
 *
 *
 * <pre>
 * Possible states of a `Registration`'s transfer lock.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.domains.v1.TransferLockState}
 */
public enum TransferLockState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The state is unspecified.
   * </pre>
   *
   * <code>TRANSFER_LOCK_STATE_UNSPECIFIED = 0;</code>
   */
  TRANSFER_LOCK_STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The domain is unlocked and can be transferred to another registrar.
   * </pre>
   *
   * <code>UNLOCKED = 1;</code>
   */
  UNLOCKED(1),
  /**
   *
   *
   * <pre>
   * The domain is locked and cannot be transferred to another registrar.
   * </pre>
   *
   * <code>LOCKED = 2;</code>
   */
  LOCKED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The state is unspecified.
   * </pre>
   *
   * <code>TRANSFER_LOCK_STATE_UNSPECIFIED = 0;</code>
   */
  public static final int TRANSFER_LOCK_STATE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The domain is unlocked and can be transferred to another registrar.
   * </pre>
   *
   * <code>UNLOCKED = 1;</code>
   */
  public static final int UNLOCKED_VALUE = 1;

  /**
   *
   *
   * <pre>
   * The domain is locked and cannot be transferred to another registrar.
   * </pre>
   *
   * <code>LOCKED = 2;</code>
   */
  public static final int LOCKED_VALUE = 2;

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
  public static TransferLockState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TransferLockState forNumber(int value) {
    switch (value) {
      case 0:
        return TRANSFER_LOCK_STATE_UNSPECIFIED;
      case 1:
        return UNLOCKED;
      case 2:
        return LOCKED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TransferLockState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TransferLockState>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<TransferLockState>() {
            public TransferLockState findValueByNumber(int number) {
              return TransferLockState.forNumber(number);
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
    return com.google.cloud.domains.v1.DomainsProto.getDescriptor().getEnumTypes().get(3);
  }

  private static final TransferLockState[] VALUES = values();

  public static TransferLockState valueOf(
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

  private TransferLockState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.domains.v1.TransferLockState)
}
