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
// source: google/cloud/alloydb/connectors/v1beta/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.alloydb.connectors.v1beta;

/**
 *
 *
 * <pre>
 * Message used by AlloyDB connectors to exchange client and connection metadata
 * with the server after a successful TLS handshake. This metadata includes an
 * IAM token, which is used to authenticate users based on their IAM identity.
 * The sole purpose of this message is for the use of AlloyDB connectors.
 * Clients should not rely on this message directly as there can be breaking
 * changes in the future.
 * </pre>
 *
 * Protobuf type {@code google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest}
 */
public final class MetadataExchangeRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest)
    MetadataExchangeRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use MetadataExchangeRequest.newBuilder() to construct.
  private MetadataExchangeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MetadataExchangeRequest() {
    userAgent_ = "";
    authType_ = 0;
    oauth2Token_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MetadataExchangeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.alloydb.connectors.v1beta.ResourcesProto
        .internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.alloydb.connectors.v1beta.ResourcesProto
        .internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.class,
            com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * AuthType contains all supported authentication types.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType}
   */
  public enum AuthType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Authentication type is unspecified and DB_NATIVE is used by default
     * </pre>
     *
     * <code>AUTH_TYPE_UNSPECIFIED = 0;</code>
     */
    AUTH_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Database native authentication (user/password)
     * </pre>
     *
     * <code>DB_NATIVE = 1;</code>
     */
    DB_NATIVE(1),
    /**
     *
     *
     * <pre>
     * Automatic IAM authentication
     * </pre>
     *
     * <code>AUTO_IAM = 2;</code>
     */
    AUTO_IAM(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Authentication type is unspecified and DB_NATIVE is used by default
     * </pre>
     *
     * <code>AUTH_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int AUTH_TYPE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Database native authentication (user/password)
     * </pre>
     *
     * <code>DB_NATIVE = 1;</code>
     */
    public static final int DB_NATIVE_VALUE = 1;

    /**
     *
     *
     * <pre>
     * Automatic IAM authentication
     * </pre>
     *
     * <code>AUTO_IAM = 2;</code>
     */
    public static final int AUTO_IAM_VALUE = 2;

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
    public static AuthType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static AuthType forNumber(int value) {
      switch (value) {
        case 0:
          return AUTH_TYPE_UNSPECIFIED;
        case 1:
          return DB_NATIVE;
        case 2:
          return AUTO_IAM;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<AuthType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<AuthType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AuthType>() {
          public AuthType findValueByNumber(int number) {
            return AuthType.forNumber(number);
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
      return com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final AuthType[] VALUES = values();

    public static AuthType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private AuthType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType)
  }

  public static final int USER_AGENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object userAgent_ = "";

  /**
   *
   *
   * <pre>
   * Optional. Connector information.
   * </pre>
   *
   * <code>string user_agent = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The userAgent.
   */
  @java.lang.Override
  public java.lang.String getUserAgent() {
    java.lang.Object ref = userAgent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      userAgent_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. Connector information.
   * </pre>
   *
   * <code>string user_agent = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for userAgent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getUserAgentBytes() {
    java.lang.Object ref = userAgent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      userAgent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTH_TYPE_FIELD_NUMBER = 2;
  private int authType_ = 0;

  /**
   *
   *
   * <pre>
   * Authentication type.
   * </pre>
   *
   * <code>.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType auth_type = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for authType.
   */
  @java.lang.Override
  public int getAuthTypeValue() {
    return authType_;
  }

  /**
   *
   *
   * <pre>
   * Authentication type.
   * </pre>
   *
   * <code>.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType auth_type = 2;
   * </code>
   *
   * @return The authType.
   */
  @java.lang.Override
  public com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType getAuthType() {
    com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType result =
        com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType.forNumber(
            authType_);
    return result == null
        ? com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType.UNRECOGNIZED
        : result;
  }

  public static final int OAUTH2_TOKEN_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object oauth2Token_ = "";

  /**
   *
   *
   * <pre>
   * IAM token used for both IAM user authentiation and
   * `alloydb.instances.connect` permission check.
   * </pre>
   *
   * <code>string oauth2_token = 3;</code>
   *
   * @return The oauth2Token.
   */
  @java.lang.Override
  public java.lang.String getOauth2Token() {
    java.lang.Object ref = oauth2Token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      oauth2Token_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * IAM token used for both IAM user authentiation and
   * `alloydb.instances.connect` permission check.
   * </pre>
   *
   * <code>string oauth2_token = 3;</code>
   *
   * @return The bytes for oauth2Token.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOauth2TokenBytes() {
    java.lang.Object ref = oauth2Token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      oauth2Token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userAgent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, userAgent_);
    }
    if (authType_
        != com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType
            .AUTH_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, authType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oauth2Token_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, oauth2Token_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(userAgent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, userAgent_);
    }
    if (authType_
        != com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType
            .AUTH_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, authType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(oauth2Token_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, oauth2Token_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest other =
        (com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest) obj;

    if (!getUserAgent().equals(other.getUserAgent())) return false;
    if (authType_ != other.authType_) return false;
    if (!getOauth2Token().equals(other.getOauth2Token())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + USER_AGENT_FIELD_NUMBER;
    hash = (53 * hash) + getUserAgent().hashCode();
    hash = (37 * hash) + AUTH_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + authType_;
    hash = (37 * hash) + OAUTH2_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getOauth2Token().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * Message used by AlloyDB connectors to exchange client and connection metadata
   * with the server after a successful TLS handshake. This metadata includes an
   * IAM token, which is used to authenticate users based on their IAM identity.
   * The sole purpose of this message is for the use of AlloyDB connectors.
   * Clients should not rely on this message directly as there can be breaking
   * changes in the future.
   * </pre>
   *
   * Protobuf type {@code google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest)
      com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.alloydb.connectors.v1beta.ResourcesProto
          .internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.alloydb.connectors.v1beta.ResourcesProto
          .internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.class,
              com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      userAgent_ = "";
      authType_ = 0;
      oauth2Token_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.alloydb.connectors.v1beta.ResourcesProto
          .internal_static_google_cloud_alloydb_connectors_v1beta_MetadataExchangeRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest
        getDefaultInstanceForType() {
      return com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest build() {
      com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest buildPartial() {
      com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest result =
          new com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.userAgent_ = userAgent_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.authType_ = authType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.oauth2Token_ = oauth2Token_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest) {
        return mergeFrom(
            (com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest other) {
      if (other
          == com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest
              .getDefaultInstance()) return this;
      if (!other.getUserAgent().isEmpty()) {
        userAgent_ = other.userAgent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.authType_ != 0) {
        setAuthTypeValue(other.getAuthTypeValue());
      }
      if (!other.getOauth2Token().isEmpty()) {
        oauth2Token_ = other.oauth2Token_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10:
              {
                userAgent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                authType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                oauth2Token_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private java.lang.Object userAgent_ = "";

    /**
     *
     *
     * <pre>
     * Optional. Connector information.
     * </pre>
     *
     * <code>string user_agent = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The userAgent.
     */
    public java.lang.String getUserAgent() {
      java.lang.Object ref = userAgent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        userAgent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Connector information.
     * </pre>
     *
     * <code>string user_agent = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for userAgent.
     */
    public com.google.protobuf.ByteString getUserAgentBytes() {
      java.lang.Object ref = userAgent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        userAgent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Connector information.
     * </pre>
     *
     * <code>string user_agent = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The userAgent to set.
     * @return This builder for chaining.
     */
    public Builder setUserAgent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      userAgent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Connector information.
     * </pre>
     *
     * <code>string user_agent = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUserAgent() {
      userAgent_ = getDefaultInstance().getUserAgent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Connector information.
     * </pre>
     *
     * <code>string user_agent = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for userAgent to set.
     * @return This builder for chaining.
     */
    public Builder setUserAgentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      userAgent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int authType_ = 0;

    /**
     *
     *
     * <pre>
     * Authentication type.
     * </pre>
     *
     * <code>.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType auth_type = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for authType.
     */
    @java.lang.Override
    public int getAuthTypeValue() {
      return authType_;
    }

    /**
     *
     *
     * <pre>
     * Authentication type.
     * </pre>
     *
     * <code>.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType auth_type = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for authType to set.
     * @return This builder for chaining.
     */
    public Builder setAuthTypeValue(int value) {
      authType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Authentication type.
     * </pre>
     *
     * <code>.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType auth_type = 2;
     * </code>
     *
     * @return The authType.
     */
    @java.lang.Override
    public com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType
        getAuthType() {
      com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType result =
          com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType.forNumber(
              authType_);
      return result == null
          ? com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Authentication type.
     * </pre>
     *
     * <code>.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType auth_type = 2;
     * </code>
     *
     * @param value The authType to set.
     * @return This builder for chaining.
     */
    public Builder setAuthType(
        com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      authType_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Authentication type.
     * </pre>
     *
     * <code>.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest.AuthType auth_type = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAuthType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      authType_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object oauth2Token_ = "";

    /**
     *
     *
     * <pre>
     * IAM token used for both IAM user authentiation and
     * `alloydb.instances.connect` permission check.
     * </pre>
     *
     * <code>string oauth2_token = 3;</code>
     *
     * @return The oauth2Token.
     */
    public java.lang.String getOauth2Token() {
      java.lang.Object ref = oauth2Token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        oauth2Token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * IAM token used for both IAM user authentiation and
     * `alloydb.instances.connect` permission check.
     * </pre>
     *
     * <code>string oauth2_token = 3;</code>
     *
     * @return The bytes for oauth2Token.
     */
    public com.google.protobuf.ByteString getOauth2TokenBytes() {
      java.lang.Object ref = oauth2Token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        oauth2Token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * IAM token used for both IAM user authentiation and
     * `alloydb.instances.connect` permission check.
     * </pre>
     *
     * <code>string oauth2_token = 3;</code>
     *
     * @param value The oauth2Token to set.
     * @return This builder for chaining.
     */
    public Builder setOauth2Token(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      oauth2Token_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * IAM token used for both IAM user authentiation and
     * `alloydb.instances.connect` permission check.
     * </pre>
     *
     * <code>string oauth2_token = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOauth2Token() {
      oauth2Token_ = getDefaultInstance().getOauth2Token();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * IAM token used for both IAM user authentiation and
     * `alloydb.instances.connect` permission check.
     * </pre>
     *
     * <code>string oauth2_token = 3;</code>
     *
     * @param value The bytes for oauth2Token to set.
     * @return This builder for chaining.
     */
    public Builder setOauth2TokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      oauth2Token_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest)
  private static final com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest();
  }

  public static com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetadataExchangeRequest> PARSER =
      new com.google.protobuf.AbstractParser<MetadataExchangeRequest>() {
        @java.lang.Override
        public MetadataExchangeRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<MetadataExchangeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetadataExchangeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.alloydb.connectors.v1beta.MetadataExchangeRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
