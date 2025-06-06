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
// source: google/cloud/aiplatform/v1beta1/model_deployment_monitoring_job.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * ModelDeploymentMonitoringObjectiveConfig contains the pair of
 * deployed_model_id to ModelMonitoringObjectiveConfig.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig}
 */
public final class ModelDeploymentMonitoringObjectiveConfig
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig)
    ModelDeploymentMonitoringObjectiveConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ModelDeploymentMonitoringObjectiveConfig.newBuilder() to construct.
  private ModelDeploymentMonitoringObjectiveConfig(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ModelDeploymentMonitoringObjectiveConfig() {
    deployedModelId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ModelDeploymentMonitoringObjectiveConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJobProto
        .internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJobProto
        .internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig.class,
            com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig.Builder
                .class);
  }

  private int bitField0_;
  public static final int DEPLOYED_MODEL_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object deployedModelId_ = "";

  /**
   *
   *
   * <pre>
   * The DeployedModel ID of the objective config.
   * </pre>
   *
   * <code>string deployed_model_id = 1;</code>
   *
   * @return The deployedModelId.
   */
  @java.lang.Override
  public java.lang.String getDeployedModelId() {
    java.lang.Object ref = deployedModelId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deployedModelId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The DeployedModel ID of the objective config.
   * </pre>
   *
   * <code>string deployed_model_id = 1;</code>
   *
   * @return The bytes for deployedModelId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDeployedModelIdBytes() {
    java.lang.Object ref = deployedModelId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      deployedModelId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OBJECTIVE_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objectiveConfig_;

  /**
   *
   *
   * <pre>
   * The objective config of for the modelmonitoring job of this deployed model.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
   * </code>
   *
   * @return Whether the objectiveConfig field is set.
   */
  @java.lang.Override
  public boolean hasObjectiveConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The objective config of for the modelmonitoring job of this deployed model.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
   * </code>
   *
   * @return The objectiveConfig.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig getObjectiveConfig() {
    return objectiveConfig_ == null
        ? com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.getDefaultInstance()
        : objectiveConfig_;
  }

  /**
   *
   *
   * <pre>
   * The objective config of for the modelmonitoring job of this deployed model.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfigOrBuilder
      getObjectiveConfigOrBuilder() {
    return objectiveConfig_ == null
        ? com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.getDefaultInstance()
        : objectiveConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployedModelId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, deployedModelId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getObjectiveConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(deployedModelId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, deployedModelId_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getObjectiveConfig());
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
    if (!(obj
        instanceof com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig other =
        (com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig) obj;

    if (!getDeployedModelId().equals(other.getDeployedModelId())) return false;
    if (hasObjectiveConfig() != other.hasObjectiveConfig()) return false;
    if (hasObjectiveConfig()) {
      if (!getObjectiveConfig().equals(other.getObjectiveConfig())) return false;
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
    hash = (37 * hash) + DEPLOYED_MODEL_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeployedModelId().hashCode();
    if (hasObjectiveConfig()) {
      hash = (37 * hash) + OBJECTIVE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getObjectiveConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig prototype) {
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
   * ModelDeploymentMonitoringObjectiveConfig contains the pair of
   * deployed_model_id to ModelMonitoringObjectiveConfig.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig)
      com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJobProto
          .internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJobProto
          .internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig.class,
              com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getObjectiveConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      deployedModelId_ = "";
      objectiveConfig_ = null;
      if (objectiveConfigBuilder_ != null) {
        objectiveConfigBuilder_.dispose();
        objectiveConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringJobProto
          .internal_static_google_cloud_aiplatform_v1beta1_ModelDeploymentMonitoringObjectiveConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig build() {
      com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
        buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig result =
          new com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deployedModelId_ = deployedModelId_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.objectiveConfig_ =
            objectiveConfigBuilder_ == null ? objectiveConfig_ : objectiveConfigBuilder_.build();
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
      if (other
          instanceof com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
              .getDefaultInstance()) return this;
      if (!other.getDeployedModelId().isEmpty()) {
        deployedModelId_ = other.deployedModelId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasObjectiveConfig()) {
        mergeObjectiveConfig(other.getObjectiveConfig());
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
                deployedModelId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getObjectiveConfigFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object deployedModelId_ = "";

    /**
     *
     *
     * <pre>
     * The DeployedModel ID of the objective config.
     * </pre>
     *
     * <code>string deployed_model_id = 1;</code>
     *
     * @return The deployedModelId.
     */
    public java.lang.String getDeployedModelId() {
      java.lang.Object ref = deployedModelId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deployedModelId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The DeployedModel ID of the objective config.
     * </pre>
     *
     * <code>string deployed_model_id = 1;</code>
     *
     * @return The bytes for deployedModelId.
     */
    public com.google.protobuf.ByteString getDeployedModelIdBytes() {
      java.lang.Object ref = deployedModelId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        deployedModelId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The DeployedModel ID of the objective config.
     * </pre>
     *
     * <code>string deployed_model_id = 1;</code>
     *
     * @param value The deployedModelId to set.
     * @return This builder for chaining.
     */
    public Builder setDeployedModelId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      deployedModelId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The DeployedModel ID of the objective config.
     * </pre>
     *
     * <code>string deployed_model_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDeployedModelId() {
      deployedModelId_ = getDefaultInstance().getDeployedModelId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The DeployedModel ID of the objective config.
     * </pre>
     *
     * <code>string deployed_model_id = 1;</code>
     *
     * @param value The bytes for deployedModelId to set.
     * @return This builder for chaining.
     */
    public Builder setDeployedModelIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      deployedModelId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objectiveConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig,
            com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.Builder,
            com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfigOrBuilder>
        objectiveConfigBuilder_;

    /**
     *
     *
     * <pre>
     * The objective config of for the modelmonitoring job of this deployed model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
     * </code>
     *
     * @return Whether the objectiveConfig field is set.
     */
    public boolean hasObjectiveConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The objective config of for the modelmonitoring job of this deployed model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
     * </code>
     *
     * @return The objectiveConfig.
     */
    public com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig getObjectiveConfig() {
      if (objectiveConfigBuilder_ == null) {
        return objectiveConfig_ == null
            ? com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig
                .getDefaultInstance()
            : objectiveConfig_;
      } else {
        return objectiveConfigBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The objective config of for the modelmonitoring job of this deployed model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
     * </code>
     */
    public Builder setObjectiveConfig(
        com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig value) {
      if (objectiveConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        objectiveConfig_ = value;
      } else {
        objectiveConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The objective config of for the modelmonitoring job of this deployed model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
     * </code>
     */
    public Builder setObjectiveConfig(
        com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.Builder
            builderForValue) {
      if (objectiveConfigBuilder_ == null) {
        objectiveConfig_ = builderForValue.build();
      } else {
        objectiveConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The objective config of for the modelmonitoring job of this deployed model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
     * </code>
     */
    public Builder mergeObjectiveConfig(
        com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig value) {
      if (objectiveConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && objectiveConfig_ != null
            && objectiveConfig_
                != com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig
                    .getDefaultInstance()) {
          getObjectiveConfigBuilder().mergeFrom(value);
        } else {
          objectiveConfig_ = value;
        }
      } else {
        objectiveConfigBuilder_.mergeFrom(value);
      }
      if (objectiveConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The objective config of for the modelmonitoring job of this deployed model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
     * </code>
     */
    public Builder clearObjectiveConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      objectiveConfig_ = null;
      if (objectiveConfigBuilder_ != null) {
        objectiveConfigBuilder_.dispose();
        objectiveConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The objective config of for the modelmonitoring job of this deployed model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.Builder
        getObjectiveConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getObjectiveConfigFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The objective config of for the modelmonitoring job of this deployed model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
     * </code>
     */
    public com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfigOrBuilder
        getObjectiveConfigOrBuilder() {
      if (objectiveConfigBuilder_ != null) {
        return objectiveConfigBuilder_.getMessageOrBuilder();
      } else {
        return objectiveConfig_ == null
            ? com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig
                .getDefaultInstance()
            : objectiveConfig_;
      }
    }

    /**
     *
     *
     * <pre>
     * The objective config of for the modelmonitoring job of this deployed model.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig objective_config = 2;
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig,
            com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.Builder,
            com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfigOrBuilder>
        getObjectiveConfigFieldBuilder() {
      if (objectiveConfigBuilder_ == null) {
        objectiveConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig,
                com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfig.Builder,
                com.google.cloud.aiplatform.v1beta1.ModelMonitoringObjectiveConfigOrBuilder>(
                getObjectiveConfig(), getParentForChildren(), isClean());
        objectiveConfig_ = null;
      }
      return objectiveConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig)
  private static final com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig();
  }

  public static com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ModelDeploymentMonitoringObjectiveConfig> PARSER =
      new com.google.protobuf.AbstractParser<ModelDeploymentMonitoringObjectiveConfig>() {
        @java.lang.Override
        public ModelDeploymentMonitoringObjectiveConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<ModelDeploymentMonitoringObjectiveConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ModelDeploymentMonitoringObjectiveConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ModelDeploymentMonitoringObjectiveConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
