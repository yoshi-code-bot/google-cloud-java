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
// source: google/dataflow/v1beta3/snapshots.proto

// Protobuf Java Version: 3.25.8
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Snapshot state.
 * </pre>
 *
 * Protobuf enum {@code google.dataflow.v1beta3.SnapshotState}
 */
public enum SnapshotState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unknown state.
   * </pre>
   *
   * <code>UNKNOWN_SNAPSHOT_STATE = 0;</code>
   */
  UNKNOWN_SNAPSHOT_STATE(0),
  /**
   *
   *
   * <pre>
   * Snapshot intent to create has been persisted, snapshotting of state has not
   * yet started.
   * </pre>
   *
   * <code>PENDING = 1;</code>
   */
  PENDING(1),
  /**
   *
   *
   * <pre>
   * Snapshotting is being performed.
   * </pre>
   *
   * <code>RUNNING = 2;</code>
   */
  RUNNING(2),
  /**
   *
   *
   * <pre>
   * Snapshot has been created and is ready to be used.
   * </pre>
   *
   * <code>READY = 3;</code>
   */
  READY(3),
  /**
   *
   *
   * <pre>
   * Snapshot failed to be created.
   * </pre>
   *
   * <code>FAILED = 4;</code>
   */
  FAILED(4),
  /**
   *
   *
   * <pre>
   * Snapshot has been deleted.
   * </pre>
   *
   * <code>DELETED = 5;</code>
   */
  DELETED(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unknown state.
   * </pre>
   *
   * <code>UNKNOWN_SNAPSHOT_STATE = 0;</code>
   */
  public static final int UNKNOWN_SNAPSHOT_STATE_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Snapshot intent to create has been persisted, snapshotting of state has not
   * yet started.
   * </pre>
   *
   * <code>PENDING = 1;</code>
   */
  public static final int PENDING_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Snapshotting is being performed.
   * </pre>
   *
   * <code>RUNNING = 2;</code>
   */
  public static final int RUNNING_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Snapshot has been created and is ready to be used.
   * </pre>
   *
   * <code>READY = 3;</code>
   */
  public static final int READY_VALUE = 3;

  /**
   *
   *
   * <pre>
   * Snapshot failed to be created.
   * </pre>
   *
   * <code>FAILED = 4;</code>
   */
  public static final int FAILED_VALUE = 4;

  /**
   *
   *
   * <pre>
   * Snapshot has been deleted.
   * </pre>
   *
   * <code>DELETED = 5;</code>
   */
  public static final int DELETED_VALUE = 5;

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
  public static SnapshotState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SnapshotState forNumber(int value) {
    switch (value) {
      case 0:
        return UNKNOWN_SNAPSHOT_STATE;
      case 1:
        return PENDING;
      case 2:
        return RUNNING;
      case 3:
        return READY;
      case 4:
        return FAILED;
      case 5:
        return DELETED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SnapshotState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SnapshotState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<SnapshotState>() {
        public SnapshotState findValueByNumber(int number) {
          return SnapshotState.forNumber(number);
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
    return com.google.dataflow.v1beta3.SnapshotsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final SnapshotState[] VALUES = values();

  public static SnapshotState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private SnapshotState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.dataflow.v1beta3.SnapshotState)
}
