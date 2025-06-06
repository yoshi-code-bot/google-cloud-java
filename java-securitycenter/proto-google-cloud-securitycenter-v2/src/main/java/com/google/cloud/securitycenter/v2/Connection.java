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
// source: google/cloud/securitycenter/v2/connection.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.v2;

/**
 *
 *
 * <pre>
 * Contains information about the IP connection associated with the finding.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v2.Connection}
 */
public final class Connection extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v2.Connection)
    ConnectionOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Connection.newBuilder() to construct.
  private Connection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Connection() {
    destinationIp_ = "";
    sourceIp_ = "";
    protocol_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Connection();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v2.ConnectionProto
        .internal_static_google_cloud_securitycenter_v2_Connection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v2.ConnectionProto
        .internal_static_google_cloud_securitycenter_v2_Connection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v2.Connection.class,
            com.google.cloud.securitycenter.v2.Connection.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * IANA Internet Protocol Number such as TCP(6) and UDP(17).
   * </pre>
   *
   * Protobuf enum {@code google.cloud.securitycenter.v2.Connection.Protocol}
   */
  public enum Protocol implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified protocol (not HOPOPT).
     * </pre>
     *
     * <code>PROTOCOL_UNSPECIFIED = 0;</code>
     */
    PROTOCOL_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Internet Control Message Protocol.
     * </pre>
     *
     * <code>ICMP = 1;</code>
     */
    ICMP(1),
    /**
     *
     *
     * <pre>
     * Transmission Control Protocol.
     * </pre>
     *
     * <code>TCP = 6;</code>
     */
    TCP(6),
    /**
     *
     *
     * <pre>
     * User Datagram Protocol.
     * </pre>
     *
     * <code>UDP = 17;</code>
     */
    UDP(17),
    /**
     *
     *
     * <pre>
     * Generic Routing Encapsulation.
     * </pre>
     *
     * <code>GRE = 47;</code>
     */
    GRE(47),
    /**
     *
     *
     * <pre>
     * Encap Security Payload.
     * </pre>
     *
     * <code>ESP = 50;</code>
     */
    ESP(50),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified protocol (not HOPOPT).
     * </pre>
     *
     * <code>PROTOCOL_UNSPECIFIED = 0;</code>
     */
    public static final int PROTOCOL_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Internet Control Message Protocol.
     * </pre>
     *
     * <code>ICMP = 1;</code>
     */
    public static final int ICMP_VALUE = 1;

    /**
     *
     *
     * <pre>
     * Transmission Control Protocol.
     * </pre>
     *
     * <code>TCP = 6;</code>
     */
    public static final int TCP_VALUE = 6;

    /**
     *
     *
     * <pre>
     * User Datagram Protocol.
     * </pre>
     *
     * <code>UDP = 17;</code>
     */
    public static final int UDP_VALUE = 17;

    /**
     *
     *
     * <pre>
     * Generic Routing Encapsulation.
     * </pre>
     *
     * <code>GRE = 47;</code>
     */
    public static final int GRE_VALUE = 47;

    /**
     *
     *
     * <pre>
     * Encap Security Payload.
     * </pre>
     *
     * <code>ESP = 50;</code>
     */
    public static final int ESP_VALUE = 50;

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
    public static Protocol valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Protocol forNumber(int value) {
      switch (value) {
        case 0:
          return PROTOCOL_UNSPECIFIED;
        case 1:
          return ICMP;
        case 6:
          return TCP;
        case 17:
          return UDP;
        case 47:
          return GRE;
        case 50:
          return ESP;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Protocol> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Protocol> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Protocol>() {
          public Protocol findValueByNumber(int number) {
            return Protocol.forNumber(number);
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
      return com.google.cloud.securitycenter.v2.Connection.getDescriptor().getEnumTypes().get(0);
    }

    private static final Protocol[] VALUES = values();

    public static Protocol valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Protocol(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.securitycenter.v2.Connection.Protocol)
  }

  public static final int DESTINATION_IP_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object destinationIp_ = "";

  /**
   *
   *
   * <pre>
   * Destination IP address. Not present for sockets that are listening and not
   * connected.
   * </pre>
   *
   * <code>string destination_ip = 1;</code>
   *
   * @return The destinationIp.
   */
  @java.lang.Override
  public java.lang.String getDestinationIp() {
    java.lang.Object ref = destinationIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationIp_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Destination IP address. Not present for sockets that are listening and not
   * connected.
   * </pre>
   *
   * <code>string destination_ip = 1;</code>
   *
   * @return The bytes for destinationIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDestinationIpBytes() {
    java.lang.Object ref = destinationIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      destinationIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_PORT_FIELD_NUMBER = 2;
  private int destinationPort_ = 0;

  /**
   *
   *
   * <pre>
   * Destination port. Not present for sockets that are listening and not
   * connected.
   * </pre>
   *
   * <code>int32 destination_port = 2;</code>
   *
   * @return The destinationPort.
   */
  @java.lang.Override
  public int getDestinationPort() {
    return destinationPort_;
  }

  public static final int SOURCE_IP_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceIp_ = "";

  /**
   *
   *
   * <pre>
   * Source IP address.
   * </pre>
   *
   * <code>string source_ip = 3;</code>
   *
   * @return The sourceIp.
   */
  @java.lang.Override
  public java.lang.String getSourceIp() {
    java.lang.Object ref = sourceIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceIp_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Source IP address.
   * </pre>
   *
   * <code>string source_ip = 3;</code>
   *
   * @return The bytes for sourceIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceIpBytes() {
    java.lang.Object ref = sourceIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sourceIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_PORT_FIELD_NUMBER = 4;
  private int sourcePort_ = 0;

  /**
   *
   *
   * <pre>
   * Source port.
   * </pre>
   *
   * <code>int32 source_port = 4;</code>
   *
   * @return The sourcePort.
   */
  @java.lang.Override
  public int getSourcePort() {
    return sourcePort_;
  }

  public static final int PROTOCOL_FIELD_NUMBER = 5;
  private int protocol_ = 0;

  /**
   *
   *
   * <pre>
   * IANA Internet Protocol Number such as TCP(6) and UDP(17).
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.Connection.Protocol protocol = 5;</code>
   *
   * @return The enum numeric value on the wire for protocol.
   */
  @java.lang.Override
  public int getProtocolValue() {
    return protocol_;
  }

  /**
   *
   *
   * <pre>
   * IANA Internet Protocol Number such as TCP(6) and UDP(17).
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.Connection.Protocol protocol = 5;</code>
   *
   * @return The protocol.
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.v2.Connection.Protocol getProtocol() {
    com.google.cloud.securitycenter.v2.Connection.Protocol result =
        com.google.cloud.securitycenter.v2.Connection.Protocol.forNumber(protocol_);
    return result == null
        ? com.google.cloud.securitycenter.v2.Connection.Protocol.UNRECOGNIZED
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, destinationIp_);
    }
    if (destinationPort_ != 0) {
      output.writeInt32(2, destinationPort_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, sourceIp_);
    }
    if (sourcePort_ != 0) {
      output.writeInt32(4, sourcePort_);
    }
    if (protocol_
        != com.google.cloud.securitycenter.v2.Connection.Protocol.PROTOCOL_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(5, protocol_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, destinationIp_);
    }
    if (destinationPort_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, destinationPort_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, sourceIp_);
    }
    if (sourcePort_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(4, sourcePort_);
    }
    if (protocol_
        != com.google.cloud.securitycenter.v2.Connection.Protocol.PROTOCOL_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(5, protocol_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v2.Connection)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v2.Connection other =
        (com.google.cloud.securitycenter.v2.Connection) obj;

    if (!getDestinationIp().equals(other.getDestinationIp())) return false;
    if (getDestinationPort() != other.getDestinationPort()) return false;
    if (!getSourceIp().equals(other.getSourceIp())) return false;
    if (getSourcePort() != other.getSourcePort()) return false;
    if (protocol_ != other.protocol_) return false;
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
    hash = (37 * hash) + DESTINATION_IP_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationIp().hashCode();
    hash = (37 * hash) + DESTINATION_PORT_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationPort();
    hash = (37 * hash) + SOURCE_IP_FIELD_NUMBER;
    hash = (53 * hash) + getSourceIp().hashCode();
    hash = (37 * hash) + SOURCE_PORT_FIELD_NUMBER;
    hash = (53 * hash) + getSourcePort();
    hash = (37 * hash) + PROTOCOL_FIELD_NUMBER;
    hash = (53 * hash) + protocol_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v2.Connection parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.Connection parseFrom(
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

  public static Builder newBuilder(com.google.cloud.securitycenter.v2.Connection prototype) {
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
   * Contains information about the IP connection associated with the finding.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v2.Connection}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v2.Connection)
      com.google.cloud.securitycenter.v2.ConnectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v2.ConnectionProto
          .internal_static_google_cloud_securitycenter_v2_Connection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v2.ConnectionProto
          .internal_static_google_cloud_securitycenter_v2_Connection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v2.Connection.class,
              com.google.cloud.securitycenter.v2.Connection.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v2.Connection.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      destinationIp_ = "";
      destinationPort_ = 0;
      sourceIp_ = "";
      sourcePort_ = 0;
      protocol_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v2.ConnectionProto
          .internal_static_google_cloud_securitycenter_v2_Connection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.Connection getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v2.Connection.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.Connection build() {
      com.google.cloud.securitycenter.v2.Connection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.Connection buildPartial() {
      com.google.cloud.securitycenter.v2.Connection result =
          new com.google.cloud.securitycenter.v2.Connection(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v2.Connection result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.destinationIp_ = destinationIp_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.destinationPort_ = destinationPort_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sourceIp_ = sourceIp_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.sourcePort_ = sourcePort_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.protocol_ = protocol_;
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
      if (other instanceof com.google.cloud.securitycenter.v2.Connection) {
        return mergeFrom((com.google.cloud.securitycenter.v2.Connection) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v2.Connection other) {
      if (other == com.google.cloud.securitycenter.v2.Connection.getDefaultInstance()) return this;
      if (!other.getDestinationIp().isEmpty()) {
        destinationIp_ = other.destinationIp_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getDestinationPort() != 0) {
        setDestinationPort(other.getDestinationPort());
      }
      if (!other.getSourceIp().isEmpty()) {
        sourceIp_ = other.sourceIp_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getSourcePort() != 0) {
        setSourcePort(other.getSourcePort());
      }
      if (other.protocol_ != 0) {
        setProtocolValue(other.getProtocolValue());
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
                destinationIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                destinationPort_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                sourceIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                sourcePort_ = input.readInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
            case 40:
              {
                protocol_ = input.readEnum();
                bitField0_ |= 0x00000010;
                break;
              } // case 40
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

    private java.lang.Object destinationIp_ = "";

    /**
     *
     *
     * <pre>
     * Destination IP address. Not present for sockets that are listening and not
     * connected.
     * </pre>
     *
     * <code>string destination_ip = 1;</code>
     *
     * @return The destinationIp.
     */
    public java.lang.String getDestinationIp() {
      java.lang.Object ref = destinationIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Destination IP address. Not present for sockets that are listening and not
     * connected.
     * </pre>
     *
     * <code>string destination_ip = 1;</code>
     *
     * @return The bytes for destinationIp.
     */
    public com.google.protobuf.ByteString getDestinationIpBytes() {
      java.lang.Object ref = destinationIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        destinationIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Destination IP address. Not present for sockets that are listening and not
     * connected.
     * </pre>
     *
     * <code>string destination_ip = 1;</code>
     *
     * @param value The destinationIp to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      destinationIp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Destination IP address. Not present for sockets that are listening and not
     * connected.
     * </pre>
     *
     * <code>string destination_ip = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDestinationIp() {
      destinationIp_ = getDefaultInstance().getDestinationIp();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Destination IP address. Not present for sockets that are listening and not
     * connected.
     * </pre>
     *
     * <code>string destination_ip = 1;</code>
     *
     * @param value The bytes for destinationIp to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      destinationIp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int destinationPort_;

    /**
     *
     *
     * <pre>
     * Destination port. Not present for sockets that are listening and not
     * connected.
     * </pre>
     *
     * <code>int32 destination_port = 2;</code>
     *
     * @return The destinationPort.
     */
    @java.lang.Override
    public int getDestinationPort() {
      return destinationPort_;
    }

    /**
     *
     *
     * <pre>
     * Destination port. Not present for sockets that are listening and not
     * connected.
     * </pre>
     *
     * <code>int32 destination_port = 2;</code>
     *
     * @param value The destinationPort to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationPort(int value) {

      destinationPort_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Destination port. Not present for sockets that are listening and not
     * connected.
     * </pre>
     *
     * <code>int32 destination_port = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDestinationPort() {
      bitField0_ = (bitField0_ & ~0x00000002);
      destinationPort_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object sourceIp_ = "";

    /**
     *
     *
     * <pre>
     * Source IP address.
     * </pre>
     *
     * <code>string source_ip = 3;</code>
     *
     * @return The sourceIp.
     */
    public java.lang.String getSourceIp() {
      java.lang.Object ref = sourceIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Source IP address.
     * </pre>
     *
     * <code>string source_ip = 3;</code>
     *
     * @return The bytes for sourceIp.
     */
    public com.google.protobuf.ByteString getSourceIpBytes() {
      java.lang.Object ref = sourceIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sourceIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Source IP address.
     * </pre>
     *
     * <code>string source_ip = 3;</code>
     *
     * @param value The sourceIp to set.
     * @return This builder for chaining.
     */
    public Builder setSourceIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceIp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Source IP address.
     * </pre>
     *
     * <code>string source_ip = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceIp() {
      sourceIp_ = getDefaultInstance().getSourceIp();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Source IP address.
     * </pre>
     *
     * <code>string source_ip = 3;</code>
     *
     * @param value The bytes for sourceIp to set.
     * @return This builder for chaining.
     */
    public Builder setSourceIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceIp_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private int sourcePort_;

    /**
     *
     *
     * <pre>
     * Source port.
     * </pre>
     *
     * <code>int32 source_port = 4;</code>
     *
     * @return The sourcePort.
     */
    @java.lang.Override
    public int getSourcePort() {
      return sourcePort_;
    }

    /**
     *
     *
     * <pre>
     * Source port.
     * </pre>
     *
     * <code>int32 source_port = 4;</code>
     *
     * @param value The sourcePort to set.
     * @return This builder for chaining.
     */
    public Builder setSourcePort(int value) {

      sourcePort_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Source port.
     * </pre>
     *
     * <code>int32 source_port = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourcePort() {
      bitField0_ = (bitField0_ & ~0x00000008);
      sourcePort_ = 0;
      onChanged();
      return this;
    }

    private int protocol_ = 0;

    /**
     *
     *
     * <pre>
     * IANA Internet Protocol Number such as TCP(6) and UDP(17).
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v2.Connection.Protocol protocol = 5;</code>
     *
     * @return The enum numeric value on the wire for protocol.
     */
    @java.lang.Override
    public int getProtocolValue() {
      return protocol_;
    }

    /**
     *
     *
     * <pre>
     * IANA Internet Protocol Number such as TCP(6) and UDP(17).
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v2.Connection.Protocol protocol = 5;</code>
     *
     * @param value The enum numeric value on the wire for protocol to set.
     * @return This builder for chaining.
     */
    public Builder setProtocolValue(int value) {
      protocol_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * IANA Internet Protocol Number such as TCP(6) and UDP(17).
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v2.Connection.Protocol protocol = 5;</code>
     *
     * @return The protocol.
     */
    @java.lang.Override
    public com.google.cloud.securitycenter.v2.Connection.Protocol getProtocol() {
      com.google.cloud.securitycenter.v2.Connection.Protocol result =
          com.google.cloud.securitycenter.v2.Connection.Protocol.forNumber(protocol_);
      return result == null
          ? com.google.cloud.securitycenter.v2.Connection.Protocol.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * IANA Internet Protocol Number such as TCP(6) and UDP(17).
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v2.Connection.Protocol protocol = 5;</code>
     *
     * @param value The protocol to set.
     * @return This builder for chaining.
     */
    public Builder setProtocol(com.google.cloud.securitycenter.v2.Connection.Protocol value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000010;
      protocol_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * IANA Internet Protocol Number such as TCP(6) and UDP(17).
     * </pre>
     *
     * <code>.google.cloud.securitycenter.v2.Connection.Protocol protocol = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProtocol() {
      bitField0_ = (bitField0_ & ~0x00000010);
      protocol_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v2.Connection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v2.Connection)
  private static final com.google.cloud.securitycenter.v2.Connection DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v2.Connection();
  }

  public static com.google.cloud.securitycenter.v2.Connection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Connection> PARSER =
      new com.google.protobuf.AbstractParser<Connection>() {
        @java.lang.Override
        public Connection parsePartialFrom(
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

  public static com.google.protobuf.Parser<Connection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Connection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v2.Connection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
