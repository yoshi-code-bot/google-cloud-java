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
// source: google/cloud/aiplatform/v1beta1/extension.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Enum of location an HTTP element can be.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1beta1.HttpElementLocation}
 */
public enum HttpElementLocation implements com.google.protobuf.ProtocolMessageEnum {
  /** <code>HTTP_IN_UNSPECIFIED = 0;</code> */
  HTTP_IN_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Element is in the HTTP request query.
   * </pre>
   *
   * <code>HTTP_IN_QUERY = 1;</code>
   */
  HTTP_IN_QUERY(1),
  /**
   *
   *
   * <pre>
   * Element is in the HTTP request header.
   * </pre>
   *
   * <code>HTTP_IN_HEADER = 2;</code>
   */
  HTTP_IN_HEADER(2),
  /**
   *
   *
   * <pre>
   * Element is in the HTTP request path.
   * </pre>
   *
   * <code>HTTP_IN_PATH = 3;</code>
   */
  HTTP_IN_PATH(3),
  /**
   *
   *
   * <pre>
   * Element is in the HTTP request body.
   * </pre>
   *
   * <code>HTTP_IN_BODY = 4;</code>
   */
  HTTP_IN_BODY(4),
  /**
   *
   *
   * <pre>
   * Element is in the HTTP request cookie.
   * </pre>
   *
   * <code>HTTP_IN_COOKIE = 5;</code>
   */
  HTTP_IN_COOKIE(5),
  UNRECOGNIZED(-1),
  ;

  /** <code>HTTP_IN_UNSPECIFIED = 0;</code> */
  public static final int HTTP_IN_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Element is in the HTTP request query.
   * </pre>
   *
   * <code>HTTP_IN_QUERY = 1;</code>
   */
  public static final int HTTP_IN_QUERY_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Element is in the HTTP request header.
   * </pre>
   *
   * <code>HTTP_IN_HEADER = 2;</code>
   */
  public static final int HTTP_IN_HEADER_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Element is in the HTTP request path.
   * </pre>
   *
   * <code>HTTP_IN_PATH = 3;</code>
   */
  public static final int HTTP_IN_PATH_VALUE = 3;

  /**
   *
   *
   * <pre>
   * Element is in the HTTP request body.
   * </pre>
   *
   * <code>HTTP_IN_BODY = 4;</code>
   */
  public static final int HTTP_IN_BODY_VALUE = 4;

  /**
   *
   *
   * <pre>
   * Element is in the HTTP request cookie.
   * </pre>
   *
   * <code>HTTP_IN_COOKIE = 5;</code>
   */
  public static final int HTTP_IN_COOKIE_VALUE = 5;

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
  public static HttpElementLocation valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static HttpElementLocation forNumber(int value) {
    switch (value) {
      case 0:
        return HTTP_IN_UNSPECIFIED;
      case 1:
        return HTTP_IN_QUERY;
      case 2:
        return HTTP_IN_HEADER;
      case 3:
        return HTTP_IN_PATH;
      case 4:
        return HTTP_IN_BODY;
      case 5:
        return HTTP_IN_COOKIE;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<HttpElementLocation>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<HttpElementLocation>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<HttpElementLocation>() {
            public HttpElementLocation findValueByNumber(int number) {
              return HttpElementLocation.forNumber(number);
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
    return com.google.cloud.aiplatform.v1beta1.ExtensionProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final HttpElementLocation[] VALUES = values();

  public static HttpElementLocation valueOf(
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

  private HttpElementLocation(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1beta1.HttpElementLocation)
}
