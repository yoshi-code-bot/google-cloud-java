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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * The format for the import rules file.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.clouddms.v1.ImportRulesFileFormat}
 */
public enum ImportRulesFileFormat implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified rules format.
   * </pre>
   *
   * <code>IMPORT_RULES_FILE_FORMAT_UNSPECIFIED = 0;</code>
   */
  IMPORT_RULES_FILE_FORMAT_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * HarbourBridge session file.
   * </pre>
   *
   * <code>IMPORT_RULES_FILE_FORMAT_HARBOUR_BRIDGE_SESSION_FILE = 1;</code>
   */
  IMPORT_RULES_FILE_FORMAT_HARBOUR_BRIDGE_SESSION_FILE(1),
  /**
   *
   *
   * <pre>
   * Ora2Pg configuration file.
   * </pre>
   *
   * <code>IMPORT_RULES_FILE_FORMAT_ORATOPG_CONFIG_FILE = 2;</code>
   */
  IMPORT_RULES_FILE_FORMAT_ORATOPG_CONFIG_FILE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified rules format.
   * </pre>
   *
   * <code>IMPORT_RULES_FILE_FORMAT_UNSPECIFIED = 0;</code>
   */
  public static final int IMPORT_RULES_FILE_FORMAT_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * HarbourBridge session file.
   * </pre>
   *
   * <code>IMPORT_RULES_FILE_FORMAT_HARBOUR_BRIDGE_SESSION_FILE = 1;</code>
   */
  public static final int IMPORT_RULES_FILE_FORMAT_HARBOUR_BRIDGE_SESSION_FILE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Ora2Pg configuration file.
   * </pre>
   *
   * <code>IMPORT_RULES_FILE_FORMAT_ORATOPG_CONFIG_FILE = 2;</code>
   */
  public static final int IMPORT_RULES_FILE_FORMAT_ORATOPG_CONFIG_FILE_VALUE = 2;

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
  public static ImportRulesFileFormat valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ImportRulesFileFormat forNumber(int value) {
    switch (value) {
      case 0:
        return IMPORT_RULES_FILE_FORMAT_UNSPECIFIED;
      case 1:
        return IMPORT_RULES_FILE_FORMAT_HARBOUR_BRIDGE_SESSION_FILE;
      case 2:
        return IMPORT_RULES_FILE_FORMAT_ORATOPG_CONFIG_FILE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ImportRulesFileFormat>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ImportRulesFileFormat>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ImportRulesFileFormat>() {
            public ImportRulesFileFormat findValueByNumber(int number) {
              return ImportRulesFileFormat.forNumber(number);
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
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto.getDescriptor()
        .getEnumTypes()
        .get(4);
  }

  private static final ImportRulesFileFormat[] VALUES = values();

  public static ImportRulesFileFormat valueOf(
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

  private ImportRulesFileFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.clouddms.v1.ImportRulesFileFormat)
}
