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
 * ManagedPrometheusConfig defines the configuration for
 * Google Cloud Managed Service for Prometheus.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.ManagedPrometheusConfig}
 */
public final class ManagedPrometheusConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.ManagedPrometheusConfig)
    ManagedPrometheusConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ManagedPrometheusConfig.newBuilder() to construct.
  private ManagedPrometheusConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ManagedPrometheusConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ManagedPrometheusConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_ManagedPrometheusConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_ManagedPrometheusConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.ManagedPrometheusConfig.class,
            com.google.container.v1beta1.ManagedPrometheusConfig.Builder.class);
  }

  private int bitField0_;
  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;

  /**
   *
   *
   * <pre>
   * Enable Managed Collection.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int AUTO_MONITORING_CONFIG_FIELD_NUMBER = 2;
  private com.google.container.v1beta1.AutoMonitoringConfig autoMonitoringConfig_;

  /**
   *
   *
   * <pre>
   * GKE Workload Auto-Monitoring Configuration.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
   *
   * @return Whether the autoMonitoringConfig field is set.
   */
  @java.lang.Override
  public boolean hasAutoMonitoringConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * GKE Workload Auto-Monitoring Configuration.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
   *
   * @return The autoMonitoringConfig.
   */
  @java.lang.Override
  public com.google.container.v1beta1.AutoMonitoringConfig getAutoMonitoringConfig() {
    return autoMonitoringConfig_ == null
        ? com.google.container.v1beta1.AutoMonitoringConfig.getDefaultInstance()
        : autoMonitoringConfig_;
  }

  /**
   *
   *
   * <pre>
   * GKE Workload Auto-Monitoring Configuration.
   * </pre>
   *
   * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
   */
  @java.lang.Override
  public com.google.container.v1beta1.AutoMonitoringConfigOrBuilder
      getAutoMonitoringConfigOrBuilder() {
    return autoMonitoringConfig_ == null
        ? com.google.container.v1beta1.AutoMonitoringConfig.getDefaultInstance()
        : autoMonitoringConfig_;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAutoMonitoringConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enabled_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAutoMonitoringConfig());
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
    if (!(obj instanceof com.google.container.v1beta1.ManagedPrometheusConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.ManagedPrometheusConfig other =
        (com.google.container.v1beta1.ManagedPrometheusConfig) obj;

    if (getEnabled() != other.getEnabled()) return false;
    if (hasAutoMonitoringConfig() != other.hasAutoMonitoringConfig()) return false;
    if (hasAutoMonitoringConfig()) {
      if (!getAutoMonitoringConfig().equals(other.getAutoMonitoringConfig())) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    if (hasAutoMonitoringConfig()) {
      hash = (37 * hash) + AUTO_MONITORING_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getAutoMonitoringConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.ManagedPrometheusConfig prototype) {
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
   * ManagedPrometheusConfig defines the configuration for
   * Google Cloud Managed Service for Prometheus.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.ManagedPrometheusConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.ManagedPrometheusConfig)
      com.google.container.v1beta1.ManagedPrometheusConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ManagedPrometheusConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ManagedPrometheusConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.ManagedPrometheusConfig.class,
              com.google.container.v1beta1.ManagedPrometheusConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.ManagedPrometheusConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAutoMonitoringConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enabled_ = false;
      autoMonitoringConfig_ = null;
      if (autoMonitoringConfigBuilder_ != null) {
        autoMonitoringConfigBuilder_.dispose();
        autoMonitoringConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_ManagedPrometheusConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.ManagedPrometheusConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.ManagedPrometheusConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.ManagedPrometheusConfig build() {
      com.google.container.v1beta1.ManagedPrometheusConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.ManagedPrometheusConfig buildPartial() {
      com.google.container.v1beta1.ManagedPrometheusConfig result =
          new com.google.container.v1beta1.ManagedPrometheusConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.ManagedPrometheusConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.autoMonitoringConfig_ =
            autoMonitoringConfigBuilder_ == null
                ? autoMonitoringConfig_
                : autoMonitoringConfigBuilder_.build();
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
      if (other instanceof com.google.container.v1beta1.ManagedPrometheusConfig) {
        return mergeFrom((com.google.container.v1beta1.ManagedPrometheusConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.ManagedPrometheusConfig other) {
      if (other == com.google.container.v1beta1.ManagedPrometheusConfig.getDefaultInstance())
        return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.hasAutoMonitoringConfig()) {
        mergeAutoMonitoringConfig(other.getAutoMonitoringConfig());
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
                enabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                input.readMessage(
                    getAutoMonitoringConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private boolean enabled_;

    /**
     *
     *
     * <pre>
     * Enable Managed Collection.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }

    /**
     *
     *
     * <pre>
     * Enable Managed Collection.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Enable Managed Collection.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private com.google.container.v1beta1.AutoMonitoringConfig autoMonitoringConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1beta1.AutoMonitoringConfig,
            com.google.container.v1beta1.AutoMonitoringConfig.Builder,
            com.google.container.v1beta1.AutoMonitoringConfigOrBuilder>
        autoMonitoringConfigBuilder_;

    /**
     *
     *
     * <pre>
     * GKE Workload Auto-Monitoring Configuration.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
     *
     * @return Whether the autoMonitoringConfig field is set.
     */
    public boolean hasAutoMonitoringConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * GKE Workload Auto-Monitoring Configuration.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
     *
     * @return The autoMonitoringConfig.
     */
    public com.google.container.v1beta1.AutoMonitoringConfig getAutoMonitoringConfig() {
      if (autoMonitoringConfigBuilder_ == null) {
        return autoMonitoringConfig_ == null
            ? com.google.container.v1beta1.AutoMonitoringConfig.getDefaultInstance()
            : autoMonitoringConfig_;
      } else {
        return autoMonitoringConfigBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * GKE Workload Auto-Monitoring Configuration.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
     */
    public Builder setAutoMonitoringConfig(
        com.google.container.v1beta1.AutoMonitoringConfig value) {
      if (autoMonitoringConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        autoMonitoringConfig_ = value;
      } else {
        autoMonitoringConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * GKE Workload Auto-Monitoring Configuration.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
     */
    public Builder setAutoMonitoringConfig(
        com.google.container.v1beta1.AutoMonitoringConfig.Builder builderForValue) {
      if (autoMonitoringConfigBuilder_ == null) {
        autoMonitoringConfig_ = builderForValue.build();
      } else {
        autoMonitoringConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * GKE Workload Auto-Monitoring Configuration.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
     */
    public Builder mergeAutoMonitoringConfig(
        com.google.container.v1beta1.AutoMonitoringConfig value) {
      if (autoMonitoringConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && autoMonitoringConfig_ != null
            && autoMonitoringConfig_
                != com.google.container.v1beta1.AutoMonitoringConfig.getDefaultInstance()) {
          getAutoMonitoringConfigBuilder().mergeFrom(value);
        } else {
          autoMonitoringConfig_ = value;
        }
      } else {
        autoMonitoringConfigBuilder_.mergeFrom(value);
      }
      if (autoMonitoringConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * GKE Workload Auto-Monitoring Configuration.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
     */
    public Builder clearAutoMonitoringConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      autoMonitoringConfig_ = null;
      if (autoMonitoringConfigBuilder_ != null) {
        autoMonitoringConfigBuilder_.dispose();
        autoMonitoringConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * GKE Workload Auto-Monitoring Configuration.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
     */
    public com.google.container.v1beta1.AutoMonitoringConfig.Builder
        getAutoMonitoringConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAutoMonitoringConfigFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * GKE Workload Auto-Monitoring Configuration.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
     */
    public com.google.container.v1beta1.AutoMonitoringConfigOrBuilder
        getAutoMonitoringConfigOrBuilder() {
      if (autoMonitoringConfigBuilder_ != null) {
        return autoMonitoringConfigBuilder_.getMessageOrBuilder();
      } else {
        return autoMonitoringConfig_ == null
            ? com.google.container.v1beta1.AutoMonitoringConfig.getDefaultInstance()
            : autoMonitoringConfig_;
      }
    }

    /**
     *
     *
     * <pre>
     * GKE Workload Auto-Monitoring Configuration.
     * </pre>
     *
     * <code>.google.container.v1beta1.AutoMonitoringConfig auto_monitoring_config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.container.v1beta1.AutoMonitoringConfig,
            com.google.container.v1beta1.AutoMonitoringConfig.Builder,
            com.google.container.v1beta1.AutoMonitoringConfigOrBuilder>
        getAutoMonitoringConfigFieldBuilder() {
      if (autoMonitoringConfigBuilder_ == null) {
        autoMonitoringConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.container.v1beta1.AutoMonitoringConfig,
                com.google.container.v1beta1.AutoMonitoringConfig.Builder,
                com.google.container.v1beta1.AutoMonitoringConfigOrBuilder>(
                getAutoMonitoringConfig(), getParentForChildren(), isClean());
        autoMonitoringConfig_ = null;
      }
      return autoMonitoringConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.ManagedPrometheusConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.ManagedPrometheusConfig)
  private static final com.google.container.v1beta1.ManagedPrometheusConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.ManagedPrometheusConfig();
  }

  public static com.google.container.v1beta1.ManagedPrometheusConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagedPrometheusConfig> PARSER =
      new com.google.protobuf.AbstractParser<ManagedPrometheusConfig>() {
        @java.lang.Override
        public ManagedPrometheusConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ManagedPrometheusConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagedPrometheusConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.ManagedPrometheusConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
