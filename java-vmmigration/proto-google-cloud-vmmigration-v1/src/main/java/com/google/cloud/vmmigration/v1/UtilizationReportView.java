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
// source: google/cloud/vmmigration/v1/vmmigration.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.vmmigration.v1;

/**
 *
 *
 * <pre>
 * Controls the level of details of a Utilization Report.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.vmmigration.v1.UtilizationReportView}
 */
public enum UtilizationReportView implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The default / unset value.
   * The API will default to FULL on single report request and BASIC for
   * multiple reports request.
   * </pre>
   *
   * <code>UTILIZATION_REPORT_VIEW_UNSPECIFIED = 0;</code>
   */
  UTILIZATION_REPORT_VIEW_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Get the report metadata, without the list of VMs and their utilization
   * info.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  BASIC(1),
  /**
   *
   *
   * <pre>
   * Include everything.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  FULL(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The default / unset value.
   * The API will default to FULL on single report request and BASIC for
   * multiple reports request.
   * </pre>
   *
   * <code>UTILIZATION_REPORT_VIEW_UNSPECIFIED = 0;</code>
   */
  public static final int UTILIZATION_REPORT_VIEW_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Get the report metadata, without the list of VMs and their utilization
   * info.
   * </pre>
   *
   * <code>BASIC = 1;</code>
   */
  public static final int BASIC_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Include everything.
   * </pre>
   *
   * <code>FULL = 2;</code>
   */
  public static final int FULL_VALUE = 2;

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
  public static UtilizationReportView valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static UtilizationReportView forNumber(int value) {
    switch (value) {
      case 0:
        return UTILIZATION_REPORT_VIEW_UNSPECIFIED;
      case 1:
        return BASIC;
      case 2:
        return FULL;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<UtilizationReportView>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<UtilizationReportView>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<UtilizationReportView>() {
            public UtilizationReportView findValueByNumber(int number) {
              return UtilizationReportView.forNumber(number);
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
    return com.google.cloud.vmmigration.v1.VmMigrationProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final UtilizationReportView[] VALUES = values();

  public static UtilizationReportView valueOf(
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

  private UtilizationReportView(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.vmmigration.v1.UtilizationReportView)
}
