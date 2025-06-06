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
// source: google/cloud/networkconnectivity/v1/hub.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.networkconnectivity.v1;

/**
 *
 *
 * <pre>
 * The route's type
 * </pre>
 *
 * Protobuf enum {@code google.cloud.networkconnectivity.v1.RouteType}
 */
public enum RouteType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No route type information specified
   * </pre>
   *
   * <code>ROUTE_TYPE_UNSPECIFIED = 0;</code>
   */
  ROUTE_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The route leads to a destination within the primary address range of the
   * VPC network's subnet.
   * </pre>
   *
   * <code>VPC_PRIMARY_SUBNET = 1;</code>
   */
  VPC_PRIMARY_SUBNET(1),
  /**
   *
   *
   * <pre>
   * The route leads to a destination within the secondary address range of the
   * VPC network's subnet.
   * </pre>
   *
   * <code>VPC_SECONDARY_SUBNET = 2;</code>
   */
  VPC_SECONDARY_SUBNET(2),
  /**
   *
   *
   * <pre>
   * The route leads to a destination in a dynamic route. Dynamic routes are
   * derived from Border Gateway Protocol (BGP) advertisements received from an
   * NCC hybrid spoke.
   * </pre>
   *
   * <code>DYNAMIC_ROUTE = 3;</code>
   */
  DYNAMIC_ROUTE(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No route type information specified
   * </pre>
   *
   * <code>ROUTE_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ROUTE_TYPE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * The route leads to a destination within the primary address range of the
   * VPC network's subnet.
   * </pre>
   *
   * <code>VPC_PRIMARY_SUBNET = 1;</code>
   */
  public static final int VPC_PRIMARY_SUBNET_VALUE = 1;

  /**
   *
   *
   * <pre>
   * The route leads to a destination within the secondary address range of the
   * VPC network's subnet.
   * </pre>
   *
   * <code>VPC_SECONDARY_SUBNET = 2;</code>
   */
  public static final int VPC_SECONDARY_SUBNET_VALUE = 2;

  /**
   *
   *
   * <pre>
   * The route leads to a destination in a dynamic route. Dynamic routes are
   * derived from Border Gateway Protocol (BGP) advertisements received from an
   * NCC hybrid spoke.
   * </pre>
   *
   * <code>DYNAMIC_ROUTE = 3;</code>
   */
  public static final int DYNAMIC_ROUTE_VALUE = 3;

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
  public static RouteType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RouteType forNumber(int value) {
    switch (value) {
      case 0:
        return ROUTE_TYPE_UNSPECIFIED;
      case 1:
        return VPC_PRIMARY_SUBNET;
      case 2:
        return VPC_SECONDARY_SUBNET;
      case 3:
        return DYNAMIC_ROUTE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RouteType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<RouteType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<RouteType>() {
        public RouteType findValueByNumber(int number) {
          return RouteType.forNumber(number);
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
    return com.google.cloud.networkconnectivity.v1.HubProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final RouteType[] VALUES = values();

  public static RouteType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RouteType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.networkconnectivity.v1.RouteType)
}
