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
// source: google/cloud/telcoautomation/v1/telcoautomation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.telcoautomation.v1;

/**
 *
 *
 * <pre>
 * Represent type of CR.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.telcoautomation.v1.ResourceType}
 */
public enum ResourceType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified resource type.
   * </pre>
   *
   * <code>RESOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  RESOURCE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * User specified NF Deploy CR.
   * </pre>
   *
   * <code>NF_DEPLOY_RESOURCE = 1;</code>
   */
  NF_DEPLOY_RESOURCE(1),
  /**
   *
   *
   * <pre>
   * CRs that are part of a blueprint.
   * </pre>
   *
   * <code>DEPLOYMENT_RESOURCE = 2;</code>
   */
  DEPLOYMENT_RESOURCE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified resource type.
   * </pre>
   *
   * <code>RESOURCE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int RESOURCE_TYPE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * User specified NF Deploy CR.
   * </pre>
   *
   * <code>NF_DEPLOY_RESOURCE = 1;</code>
   */
  public static final int NF_DEPLOY_RESOURCE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * CRs that are part of a blueprint.
   * </pre>
   *
   * <code>DEPLOYMENT_RESOURCE = 2;</code>
   */
  public static final int DEPLOYMENT_RESOURCE_VALUE = 2;

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
        return NF_DEPLOY_RESOURCE;
      case 2:
        return DEPLOYMENT_RESOURCE;
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
    return com.google.cloud.telcoautomation.v1.TelcoautomationProto.getDescriptor()
        .getEnumTypes()
        .get(2);
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

  // @@protoc_insertion_point(enum_scope:google.cloud.telcoautomation.v1.ResourceType)
}
