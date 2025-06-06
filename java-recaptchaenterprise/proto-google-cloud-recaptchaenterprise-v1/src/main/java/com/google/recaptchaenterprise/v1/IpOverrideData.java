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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.8
package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * Information about the IP or IP range override.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.IpOverrideData}
 */
public final class IpOverrideData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.IpOverrideData)
    IpOverrideDataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use IpOverrideData.newBuilder() to construct.
  private IpOverrideData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private IpOverrideData() {
    ip_ = "";
    overrideType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new IpOverrideData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_IpOverrideData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_IpOverrideData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.IpOverrideData.class,
            com.google.recaptchaenterprise.v1.IpOverrideData.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Enum that represents the type of IP override.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.recaptchaenterprise.v1.IpOverrideData.OverrideType}
   */
  public enum OverrideType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default override type that indicates this enum hasn't been specified.
     * </pre>
     *
     * <code>OVERRIDE_TYPE_UNSPECIFIED = 0;</code>
     */
    OVERRIDE_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Allowlist the IP address; i.e. give a `risk_analysis.score` of 0.9 for
     * all valid assessments.
     * </pre>
     *
     * <code>ALLOW = 1;</code>
     */
    ALLOW(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default override type that indicates this enum hasn't been specified.
     * </pre>
     *
     * <code>OVERRIDE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int OVERRIDE_TYPE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Allowlist the IP address; i.e. give a `risk_analysis.score` of 0.9 for
     * all valid assessments.
     * </pre>
     *
     * <code>ALLOW = 1;</code>
     */
    public static final int ALLOW_VALUE = 1;

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
    public static OverrideType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OverrideType forNumber(int value) {
      switch (value) {
        case 0:
          return OVERRIDE_TYPE_UNSPECIFIED;
        case 1:
          return ALLOW;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OverrideType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<OverrideType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<OverrideType>() {
          public OverrideType findValueByNumber(int number) {
            return OverrideType.forNumber(number);
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
      return com.google.recaptchaenterprise.v1.IpOverrideData.getDescriptor().getEnumTypes().get(0);
    }

    private static final OverrideType[] VALUES = values();

    public static OverrideType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OverrideType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.recaptchaenterprise.v1.IpOverrideData.OverrideType)
  }

  public static final int IP_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ip_ = "";

  /**
   *
   *
   * <pre>
   * Required. The IP address to override (can be IPv4, IPv6 or CIDR).
   * The IP override must be a valid IPv4 or IPv6 address, or a CIDR range.
   * The IP override must be a public IP address.
   * Example of IPv4: 168.192.5.6
   * Example of IPv6: 2001:0000:130F:0000:0000:09C0:876A:130B
   * Example of IPv4 with CIDR: 168.192.5.0/24
   * Example of IPv6 with CIDR: 2001:0DB8:1234::/48
   * </pre>
   *
   * <code>
   * string ip = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The ip.
   */
  @java.lang.Override
  public java.lang.String getIp() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ip_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. The IP address to override (can be IPv4, IPv6 or CIDR).
   * The IP override must be a valid IPv4 or IPv6 address, or a CIDR range.
   * The IP override must be a public IP address.
   * Example of IPv4: 168.192.5.6
   * Example of IPv6: 2001:0000:130F:0000:0000:09C0:876A:130B
   * Example of IPv4 with CIDR: 168.192.5.0/24
   * Example of IPv6 with CIDR: 2001:0DB8:1234::/48
   * </pre>
   *
   * <code>
   * string ip = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for ip.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIpBytes() {
    java.lang.Object ref = ip_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ip_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OVERRIDE_TYPE_FIELD_NUMBER = 3;
  private int overrideType_ = 0;

  /**
   *
   *
   * <pre>
   * Required. Describes the type of IP override.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.IpOverrideData.OverrideType override_type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for overrideType.
   */
  @java.lang.Override
  public int getOverrideTypeValue() {
    return overrideType_;
  }

  /**
   *
   *
   * <pre>
   * Required. Describes the type of IP override.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.IpOverrideData.OverrideType override_type = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The overrideType.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType getOverrideType() {
    com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType result =
        com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType.forNumber(overrideType_);
    return result == null
        ? com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ip_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ip_);
    }
    if (overrideType_
        != com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType.OVERRIDE_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(3, overrideType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ip_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ip_);
    }
    if (overrideType_
        != com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType.OVERRIDE_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, overrideType_);
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.IpOverrideData)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.IpOverrideData other =
        (com.google.recaptchaenterprise.v1.IpOverrideData) obj;

    if (!getIp().equals(other.getIp())) return false;
    if (overrideType_ != other.overrideType_) return false;
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
    hash = (37 * hash) + IP_FIELD_NUMBER;
    hash = (53 * hash) + getIp().hashCode();
    hash = (37 * hash) + OVERRIDE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + overrideType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData parseFrom(
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

  public static Builder newBuilder(com.google.recaptchaenterprise.v1.IpOverrideData prototype) {
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
   * Information about the IP or IP range override.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.IpOverrideData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.IpOverrideData)
      com.google.recaptchaenterprise.v1.IpOverrideDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_IpOverrideData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_IpOverrideData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.IpOverrideData.class,
              com.google.recaptchaenterprise.v1.IpOverrideData.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.IpOverrideData.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ip_ = "";
      overrideType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_IpOverrideData_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.IpOverrideData getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.IpOverrideData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.IpOverrideData build() {
      com.google.recaptchaenterprise.v1.IpOverrideData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.IpOverrideData buildPartial() {
      com.google.recaptchaenterprise.v1.IpOverrideData result =
          new com.google.recaptchaenterprise.v1.IpOverrideData(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.recaptchaenterprise.v1.IpOverrideData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ip_ = ip_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.overrideType_ = overrideType_;
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
      if (other instanceof com.google.recaptchaenterprise.v1.IpOverrideData) {
        return mergeFrom((com.google.recaptchaenterprise.v1.IpOverrideData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.IpOverrideData other) {
      if (other == com.google.recaptchaenterprise.v1.IpOverrideData.getDefaultInstance())
        return this;
      if (!other.getIp().isEmpty()) {
        ip_ = other.ip_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.overrideType_ != 0) {
        setOverrideTypeValue(other.getOverrideTypeValue());
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
                ip_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 24:
              {
                overrideType_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 24
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

    private java.lang.Object ip_ = "";

    /**
     *
     *
     * <pre>
     * Required. The IP address to override (can be IPv4, IPv6 or CIDR).
     * The IP override must be a valid IPv4 or IPv6 address, or a CIDR range.
     * The IP override must be a public IP address.
     * Example of IPv4: 168.192.5.6
     * Example of IPv6: 2001:0000:130F:0000:0000:09C0:876A:130B
     * Example of IPv4 with CIDR: 168.192.5.0/24
     * Example of IPv6 with CIDR: 2001:0DB8:1234::/48
     * </pre>
     *
     * <code>
     * string ip = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
     * </code>
     *
     * @return The ip.
     */
    public java.lang.String getIp() {
      java.lang.Object ref = ip_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ip_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The IP address to override (can be IPv4, IPv6 or CIDR).
     * The IP override must be a valid IPv4 or IPv6 address, or a CIDR range.
     * The IP override must be a public IP address.
     * Example of IPv4: 168.192.5.6
     * Example of IPv6: 2001:0000:130F:0000:0000:09C0:876A:130B
     * Example of IPv4 with CIDR: 168.192.5.0/24
     * Example of IPv6 with CIDR: 2001:0DB8:1234::/48
     * </pre>
     *
     * <code>
     * string ip = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
     * </code>
     *
     * @return The bytes for ip.
     */
    public com.google.protobuf.ByteString getIpBytes() {
      java.lang.Object ref = ip_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ip_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. The IP address to override (can be IPv4, IPv6 or CIDR).
     * The IP override must be a valid IPv4 or IPv6 address, or a CIDR range.
     * The IP override must be a public IP address.
     * Example of IPv4: 168.192.5.6
     * Example of IPv6: 2001:0000:130F:0000:0000:09C0:876A:130B
     * Example of IPv4 with CIDR: 168.192.5.0/24
     * Example of IPv6 with CIDR: 2001:0DB8:1234::/48
     * </pre>
     *
     * <code>
     * string ip = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
     * </code>
     *
     * @param value The ip to set.
     * @return This builder for chaining.
     */
    public Builder setIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ip_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The IP address to override (can be IPv4, IPv6 or CIDR).
     * The IP override must be a valid IPv4 or IPv6 address, or a CIDR range.
     * The IP override must be a public IP address.
     * Example of IPv4: 168.192.5.6
     * Example of IPv6: 2001:0000:130F:0000:0000:09C0:876A:130B
     * Example of IPv4 with CIDR: 168.192.5.0/24
     * Example of IPv6 with CIDR: 2001:0DB8:1234::/48
     * </pre>
     *
     * <code>
     * string ip = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIp() {
      ip_ = getDefaultInstance().getIp();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The IP address to override (can be IPv4, IPv6 or CIDR).
     * The IP override must be a valid IPv4 or IPv6 address, or a CIDR range.
     * The IP override must be a public IP address.
     * Example of IPv4: 168.192.5.6
     * Example of IPv6: 2001:0000:130F:0000:0000:09C0:876A:130B
     * Example of IPv4 with CIDR: 168.192.5.0/24
     * Example of IPv6 with CIDR: 2001:0DB8:1234::/48
     * </pre>
     *
     * <code>
     * string ip = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_info) = { ... }
     * </code>
     *
     * @param value The bytes for ip to set.
     * @return This builder for chaining.
     */
    public Builder setIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ip_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int overrideType_ = 0;

    /**
     *
     *
     * <pre>
     * Required. Describes the type of IP override.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData.OverrideType override_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for overrideType.
     */
    @java.lang.Override
    public int getOverrideTypeValue() {
      return overrideType_;
    }

    /**
     *
     *
     * <pre>
     * Required. Describes the type of IP override.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData.OverrideType override_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for overrideType to set.
     * @return This builder for chaining.
     */
    public Builder setOverrideTypeValue(int value) {
      overrideType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Describes the type of IP override.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData.OverrideType override_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The overrideType.
     */
    @java.lang.Override
    public com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType getOverrideType() {
      com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType result =
          com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType.forNumber(overrideType_);
      return result == null
          ? com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Required. Describes the type of IP override.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData.OverrideType override_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The overrideType to set.
     * @return This builder for chaining.
     */
    public Builder setOverrideType(
        com.google.recaptchaenterprise.v1.IpOverrideData.OverrideType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      overrideType_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Describes the type of IP override.
     * </pre>
     *
     * <code>
     * .google.cloud.recaptchaenterprise.v1.IpOverrideData.OverrideType override_type = 3 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOverrideType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      overrideType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.IpOverrideData)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.IpOverrideData)
  private static final com.google.recaptchaenterprise.v1.IpOverrideData DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.IpOverrideData();
  }

  public static com.google.recaptchaenterprise.v1.IpOverrideData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<IpOverrideData> PARSER =
      new com.google.protobuf.AbstractParser<IpOverrideData>() {
        @java.lang.Override
        public IpOverrideData parsePartialFrom(
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

  public static com.google.protobuf.Parser<IpOverrideData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<IpOverrideData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.IpOverrideData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
