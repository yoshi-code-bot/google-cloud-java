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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * AdvancedDatapathObservabilityConfig specifies configuration of observability
 * features of advanced datapath.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.AdvancedDatapathObservabilityConfig}
 */
public final class AdvancedDatapathObservabilityConfig
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.AdvancedDatapathObservabilityConfig)
    AdvancedDatapathObservabilityConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AdvancedDatapathObservabilityConfig.newBuilder() to construct.
  private AdvancedDatapathObservabilityConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AdvancedDatapathObservabilityConfig() {
    relayMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AdvancedDatapathObservabilityConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_AdvancedDatapathObservabilityConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_AdvancedDatapathObservabilityConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.class,
            com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Supported Relay modes
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode}
   */
  public enum RelayMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default value. This shouldn't be used.
     * </pre>
     *
     * <code>RELAY_MODE_UNSPECIFIED = 0;</code>
     */
    RELAY_MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * disabled
     * </pre>
     *
     * <code>DISABLED = 1;</code>
     */
    DISABLED(1),
    /**
     *
     *
     * <pre>
     * exposed via internal load balancer
     * </pre>
     *
     * <code>INTERNAL_VPC_LB = 3;</code>
     */
    INTERNAL_VPC_LB(3),
    /**
     *
     *
     * <pre>
     * exposed via external load balancer
     * </pre>
     *
     * <code>EXTERNAL_LB = 4;</code>
     */
    EXTERNAL_LB(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default value. This shouldn't be used.
     * </pre>
     *
     * <code>RELAY_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int RELAY_MODE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * disabled
     * </pre>
     *
     * <code>DISABLED = 1;</code>
     */
    public static final int DISABLED_VALUE = 1;

    /**
     *
     *
     * <pre>
     * exposed via internal load balancer
     * </pre>
     *
     * <code>INTERNAL_VPC_LB = 3;</code>
     */
    public static final int INTERNAL_VPC_LB_VALUE = 3;

    /**
     *
     *
     * <pre>
     * exposed via external load balancer
     * </pre>
     *
     * <code>EXTERNAL_LB = 4;</code>
     */
    public static final int EXTERNAL_LB_VALUE = 4;

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
    public static RelayMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static RelayMode forNumber(int value) {
      switch (value) {
        case 0:
          return RELAY_MODE_UNSPECIFIED;
        case 1:
          return DISABLED;
        case 3:
          return INTERNAL_VPC_LB;
        case 4:
          return EXTERNAL_LB;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<RelayMode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<RelayMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<RelayMode>() {
          public RelayMode findValueByNumber(int number) {
            return RelayMode.forNumber(number);
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
      return com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final RelayMode[] VALUES = values();

    public static RelayMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private RelayMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode)
  }

  private int bitField0_;
  public static final int ENABLE_METRICS_FIELD_NUMBER = 1;
  private boolean enableMetrics_ = false;

  /**
   *
   *
   * <pre>
   * Expose flow metrics on nodes
   * </pre>
   *
   * <code>bool enable_metrics = 1;</code>
   *
   * @return The enableMetrics.
   */
  @java.lang.Override
  public boolean getEnableMetrics() {
    return enableMetrics_;
  }

  public static final int RELAY_MODE_FIELD_NUMBER = 2;
  private int relayMode_ = 0;

  /**
   *
   *
   * <pre>
   * Method used to make Relay available
   * </pre>
   *
   * <code>.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode relay_mode = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for relayMode.
   */
  @java.lang.Override
  public int getRelayModeValue() {
    return relayMode_;
  }

  /**
   *
   *
   * <pre>
   * Method used to make Relay available
   * </pre>
   *
   * <code>.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode relay_mode = 2;
   * </code>
   *
   * @return The relayMode.
   */
  @java.lang.Override
  public com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode getRelayMode() {
    com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode result =
        com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode.forNumber(
            relayMode_);
    return result == null
        ? com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode.UNRECOGNIZED
        : result;
  }

  public static final int ENABLE_RELAY_FIELD_NUMBER = 3;
  private boolean enableRelay_ = false;

  /**
   *
   *
   * <pre>
   * Enable Relay component
   * </pre>
   *
   * <code>optional bool enable_relay = 3;</code>
   *
   * @return Whether the enableRelay field is set.
   */
  @java.lang.Override
  public boolean hasEnableRelay() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Enable Relay component
   * </pre>
   *
   * <code>optional bool enable_relay = 3;</code>
   *
   * @return The enableRelay.
   */
  @java.lang.Override
  public boolean getEnableRelay() {
    return enableRelay_;
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
    if (enableMetrics_ != false) {
      output.writeBool(1, enableMetrics_);
    }
    if (relayMode_
        != com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode
            .RELAY_MODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, relayMode_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(3, enableRelay_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableMetrics_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enableMetrics_);
    }
    if (relayMode_
        != com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode
            .RELAY_MODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, relayMode_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, enableRelay_);
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
    if (!(obj instanceof com.google.container.v1beta1.AdvancedDatapathObservabilityConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.AdvancedDatapathObservabilityConfig other =
        (com.google.container.v1beta1.AdvancedDatapathObservabilityConfig) obj;

    if (getEnableMetrics() != other.getEnableMetrics()) return false;
    if (relayMode_ != other.relayMode_) return false;
    if (hasEnableRelay() != other.hasEnableRelay()) return false;
    if (hasEnableRelay()) {
      if (getEnableRelay() != other.getEnableRelay()) return false;
    }
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
    hash = (37 * hash) + ENABLE_METRICS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableMetrics());
    hash = (37 * hash) + RELAY_MODE_FIELD_NUMBER;
    hash = (53 * hash) + relayMode_;
    if (hasEnableRelay()) {
      hash = (37 * hash) + ENABLE_RELAY_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableRelay());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig parseFrom(
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
      com.google.container.v1beta1.AdvancedDatapathObservabilityConfig prototype) {
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
   * AdvancedDatapathObservabilityConfig specifies configuration of observability
   * features of advanced datapath.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.AdvancedDatapathObservabilityConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.AdvancedDatapathObservabilityConfig)
      com.google.container.v1beta1.AdvancedDatapathObservabilityConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_AdvancedDatapathObservabilityConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_AdvancedDatapathObservabilityConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.class,
              com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enableMetrics_ = false;
      relayMode_ = 0;
      enableRelay_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_AdvancedDatapathObservabilityConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.AdvancedDatapathObservabilityConfig
        getDefaultInstanceForType() {
      return com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.AdvancedDatapathObservabilityConfig build() {
      com.google.container.v1beta1.AdvancedDatapathObservabilityConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.AdvancedDatapathObservabilityConfig buildPartial() {
      com.google.container.v1beta1.AdvancedDatapathObservabilityConfig result =
          new com.google.container.v1beta1.AdvancedDatapathObservabilityConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.container.v1beta1.AdvancedDatapathObservabilityConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableMetrics_ = enableMetrics_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.relayMode_ = relayMode_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.enableRelay_ = enableRelay_;
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.container.v1beta1.AdvancedDatapathObservabilityConfig) {
        return mergeFrom((com.google.container.v1beta1.AdvancedDatapathObservabilityConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.container.v1beta1.AdvancedDatapathObservabilityConfig other) {
      if (other
          == com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.getDefaultInstance())
        return this;
      if (other.getEnableMetrics() != false) {
        setEnableMetrics(other.getEnableMetrics());
      }
      if (other.relayMode_ != 0) {
        setRelayModeValue(other.getRelayModeValue());
      }
      if (other.hasEnableRelay()) {
        setEnableRelay(other.getEnableRelay());
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
            case 8:
              {
                enableMetrics_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                relayMode_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                enableRelay_ = input.readBool();
                bitField0_ |= 0x00000004;
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

    private boolean enableMetrics_;

    /**
     *
     *
     * <pre>
     * Expose flow metrics on nodes
     * </pre>
     *
     * <code>bool enable_metrics = 1;</code>
     *
     * @return The enableMetrics.
     */
    @java.lang.Override
    public boolean getEnableMetrics() {
      return enableMetrics_;
    }

    /**
     *
     *
     * <pre>
     * Expose flow metrics on nodes
     * </pre>
     *
     * <code>bool enable_metrics = 1;</code>
     *
     * @param value The enableMetrics to set.
     * @return This builder for chaining.
     */
    public Builder setEnableMetrics(boolean value) {

      enableMetrics_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Expose flow metrics on nodes
     * </pre>
     *
     * <code>bool enable_metrics = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableMetrics() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableMetrics_ = false;
      onChanged();
      return this;
    }

    private int relayMode_ = 0;

    /**
     *
     *
     * <pre>
     * Method used to make Relay available
     * </pre>
     *
     * <code>.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode relay_mode = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for relayMode.
     */
    @java.lang.Override
    public int getRelayModeValue() {
      return relayMode_;
    }

    /**
     *
     *
     * <pre>
     * Method used to make Relay available
     * </pre>
     *
     * <code>.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode relay_mode = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for relayMode to set.
     * @return This builder for chaining.
     */
    public Builder setRelayModeValue(int value) {
      relayMode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Method used to make Relay available
     * </pre>
     *
     * <code>.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode relay_mode = 2;
     * </code>
     *
     * @return The relayMode.
     */
    @java.lang.Override
    public com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode
        getRelayMode() {
      com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode result =
          com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode.forNumber(
              relayMode_);
      return result == null
          ? com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Method used to make Relay available
     * </pre>
     *
     * <code>.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode relay_mode = 2;
     * </code>
     *
     * @param value The relayMode to set.
     * @return This builder for chaining.
     */
    public Builder setRelayMode(
        com.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      relayMode_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Method used to make Relay available
     * </pre>
     *
     * <code>.google.container.v1beta1.AdvancedDatapathObservabilityConfig.RelayMode relay_mode = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRelayMode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      relayMode_ = 0;
      onChanged();
      return this;
    }

    private boolean enableRelay_;

    /**
     *
     *
     * <pre>
     * Enable Relay component
     * </pre>
     *
     * <code>optional bool enable_relay = 3;</code>
     *
     * @return Whether the enableRelay field is set.
     */
    @java.lang.Override
    public boolean hasEnableRelay() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Enable Relay component
     * </pre>
     *
     * <code>optional bool enable_relay = 3;</code>
     *
     * @return The enableRelay.
     */
    @java.lang.Override
    public boolean getEnableRelay() {
      return enableRelay_;
    }

    /**
     *
     *
     * <pre>
     * Enable Relay component
     * </pre>
     *
     * <code>optional bool enable_relay = 3;</code>
     *
     * @param value The enableRelay to set.
     * @return This builder for chaining.
     */
    public Builder setEnableRelay(boolean value) {

      enableRelay_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Enable Relay component
     * </pre>
     *
     * <code>optional bool enable_relay = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableRelay() {
      bitField0_ = (bitField0_ & ~0x00000004);
      enableRelay_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.AdvancedDatapathObservabilityConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.AdvancedDatapathObservabilityConfig)
  private static final com.google.container.v1beta1.AdvancedDatapathObservabilityConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.AdvancedDatapathObservabilityConfig();
  }

  public static com.google.container.v1beta1.AdvancedDatapathObservabilityConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AdvancedDatapathObservabilityConfig> PARSER =
      new com.google.protobuf.AbstractParser<AdvancedDatapathObservabilityConfig>() {
        @java.lang.Override
        public AdvancedDatapathObservabilityConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AdvancedDatapathObservabilityConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AdvancedDatapathObservabilityConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.AdvancedDatapathObservabilityConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
