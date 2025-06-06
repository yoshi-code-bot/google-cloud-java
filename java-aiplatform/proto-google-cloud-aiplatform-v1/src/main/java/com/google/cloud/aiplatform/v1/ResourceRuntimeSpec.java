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
// source: google/cloud/aiplatform/v1/persistent_resource.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Configuration for the runtime on a PersistentResource instance, including
 * but not limited to:
 *
 * * Service accounts used to run the workloads.
 * * Whether to make it a dedicated Ray Cluster.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.ResourceRuntimeSpec}
 */
public final class ResourceRuntimeSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.ResourceRuntimeSpec)
    ResourceRuntimeSpecOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ResourceRuntimeSpec.newBuilder() to construct.
  private ResourceRuntimeSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResourceRuntimeSpec() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResourceRuntimeSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.PersistentResourceProto
        .internal_static_google_cloud_aiplatform_v1_ResourceRuntimeSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.PersistentResourceProto
        .internal_static_google_cloud_aiplatform_v1_ResourceRuntimeSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.ResourceRuntimeSpec.class,
            com.google.cloud.aiplatform.v1.ResourceRuntimeSpec.Builder.class);
  }

  private int bitField0_;
  public static final int SERVICE_ACCOUNT_SPEC_FIELD_NUMBER = 2;
  private com.google.cloud.aiplatform.v1.ServiceAccountSpec serviceAccountSpec_;

  /**
   *
   *
   * <pre>
   * Optional. Configure the use of workload identity on the PersistentResource
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the serviceAccountSpec field is set.
   */
  @java.lang.Override
  public boolean hasServiceAccountSpec() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. Configure the use of workload identity on the PersistentResource
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The serviceAccountSpec.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ServiceAccountSpec getServiceAccountSpec() {
    return serviceAccountSpec_ == null
        ? com.google.cloud.aiplatform.v1.ServiceAccountSpec.getDefaultInstance()
        : serviceAccountSpec_;
  }

  /**
   *
   *
   * <pre>
   * Optional. Configure the use of workload identity on the PersistentResource
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ServiceAccountSpecOrBuilder
      getServiceAccountSpecOrBuilder() {
    return serviceAccountSpec_ == null
        ? com.google.cloud.aiplatform.v1.ServiceAccountSpec.getDefaultInstance()
        : serviceAccountSpec_;
  }

  public static final int RAY_SPEC_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1.RaySpec raySpec_;

  /**
   *
   *
   * <pre>
   * Optional. Ray cluster configuration.
   * Required when creating a dedicated RayCluster on the PersistentResource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the raySpec field is set.
   */
  @java.lang.Override
  public boolean hasRaySpec() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. Ray cluster configuration.
   * Required when creating a dedicated RayCluster on the PersistentResource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The raySpec.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.RaySpec getRaySpec() {
    return raySpec_ == null
        ? com.google.cloud.aiplatform.v1.RaySpec.getDefaultInstance()
        : raySpec_;
  }

  /**
   *
   *
   * <pre>
   * Optional. Ray cluster configuration.
   * Required when creating a dedicated RayCluster on the PersistentResource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1.RaySpecOrBuilder getRaySpecOrBuilder() {
    return raySpec_ == null
        ? com.google.cloud.aiplatform.v1.RaySpec.getDefaultInstance()
        : raySpec_;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(1, getRaySpec());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getServiceAccountSpec());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRaySpec());
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getServiceAccountSpec());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.ResourceRuntimeSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.ResourceRuntimeSpec other =
        (com.google.cloud.aiplatform.v1.ResourceRuntimeSpec) obj;

    if (hasServiceAccountSpec() != other.hasServiceAccountSpec()) return false;
    if (hasServiceAccountSpec()) {
      if (!getServiceAccountSpec().equals(other.getServiceAccountSpec())) return false;
    }
    if (hasRaySpec() != other.hasRaySpec()) return false;
    if (hasRaySpec()) {
      if (!getRaySpec().equals(other.getRaySpec())) return false;
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
    if (hasServiceAccountSpec()) {
      hash = (37 * hash) + SERVICE_ACCOUNT_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getServiceAccountSpec().hashCode();
    }
    if (hasRaySpec()) {
      hash = (37 * hash) + RAY_SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getRaySpec().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1.ResourceRuntimeSpec prototype) {
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
   * Configuration for the runtime on a PersistentResource instance, including
   * but not limited to:
   *
   * * Service accounts used to run the workloads.
   * * Whether to make it a dedicated Ray Cluster.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.ResourceRuntimeSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.ResourceRuntimeSpec)
      com.google.cloud.aiplatform.v1.ResourceRuntimeSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1_ResourceRuntimeSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1_ResourceRuntimeSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.ResourceRuntimeSpec.class,
              com.google.cloud.aiplatform.v1.ResourceRuntimeSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1.ResourceRuntimeSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getServiceAccountSpecFieldBuilder();
        getRaySpecFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      serviceAccountSpec_ = null;
      if (serviceAccountSpecBuilder_ != null) {
        serviceAccountSpecBuilder_.dispose();
        serviceAccountSpecBuilder_ = null;
      }
      raySpec_ = null;
      if (raySpecBuilder_ != null) {
        raySpecBuilder_.dispose();
        raySpecBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.PersistentResourceProto
          .internal_static_google_cloud_aiplatform_v1_ResourceRuntimeSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ResourceRuntimeSpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.ResourceRuntimeSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ResourceRuntimeSpec build() {
      com.google.cloud.aiplatform.v1.ResourceRuntimeSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.ResourceRuntimeSpec buildPartial() {
      com.google.cloud.aiplatform.v1.ResourceRuntimeSpec result =
          new com.google.cloud.aiplatform.v1.ResourceRuntimeSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1.ResourceRuntimeSpec result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceAccountSpec_ =
            serviceAccountSpecBuilder_ == null
                ? serviceAccountSpec_
                : serviceAccountSpecBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.raySpec_ = raySpecBuilder_ == null ? raySpec_ : raySpecBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.aiplatform.v1.ResourceRuntimeSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1.ResourceRuntimeSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1.ResourceRuntimeSpec other) {
      if (other == com.google.cloud.aiplatform.v1.ResourceRuntimeSpec.getDefaultInstance())
        return this;
      if (other.hasServiceAccountSpec()) {
        mergeServiceAccountSpec(other.getServiceAccountSpec());
      }
      if (other.hasRaySpec()) {
        mergeRaySpec(other.getRaySpec());
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
                input.readMessage(getRaySpecFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getServiceAccountSpecFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.aiplatform.v1.ServiceAccountSpec serviceAccountSpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ServiceAccountSpec,
            com.google.cloud.aiplatform.v1.ServiceAccountSpec.Builder,
            com.google.cloud.aiplatform.v1.ServiceAccountSpecOrBuilder>
        serviceAccountSpecBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Configure the use of workload identity on the PersistentResource
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the serviceAccountSpec field is set.
     */
    public boolean hasServiceAccountSpec() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Configure the use of workload identity on the PersistentResource
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The serviceAccountSpec.
     */
    public com.google.cloud.aiplatform.v1.ServiceAccountSpec getServiceAccountSpec() {
      if (serviceAccountSpecBuilder_ == null) {
        return serviceAccountSpec_ == null
            ? com.google.cloud.aiplatform.v1.ServiceAccountSpec.getDefaultInstance()
            : serviceAccountSpec_;
      } else {
        return serviceAccountSpecBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Configure the use of workload identity on the PersistentResource
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setServiceAccountSpec(com.google.cloud.aiplatform.v1.ServiceAccountSpec value) {
      if (serviceAccountSpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceAccountSpec_ = value;
      } else {
        serviceAccountSpecBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configure the use of workload identity on the PersistentResource
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setServiceAccountSpec(
        com.google.cloud.aiplatform.v1.ServiceAccountSpec.Builder builderForValue) {
      if (serviceAccountSpecBuilder_ == null) {
        serviceAccountSpec_ = builderForValue.build();
      } else {
        serviceAccountSpecBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configure the use of workload identity on the PersistentResource
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeServiceAccountSpec(
        com.google.cloud.aiplatform.v1.ServiceAccountSpec value) {
      if (serviceAccountSpecBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && serviceAccountSpec_ != null
            && serviceAccountSpec_
                != com.google.cloud.aiplatform.v1.ServiceAccountSpec.getDefaultInstance()) {
          getServiceAccountSpecBuilder().mergeFrom(value);
        } else {
          serviceAccountSpec_ = value;
        }
      } else {
        serviceAccountSpecBuilder_.mergeFrom(value);
      }
      if (serviceAccountSpec_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configure the use of workload identity on the PersistentResource
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearServiceAccountSpec() {
      bitField0_ = (bitField0_ & ~0x00000001);
      serviceAccountSpec_ = null;
      if (serviceAccountSpecBuilder_ != null) {
        serviceAccountSpecBuilder_.dispose();
        serviceAccountSpecBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Configure the use of workload identity on the PersistentResource
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ServiceAccountSpec.Builder
        getServiceAccountSpecBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getServiceAccountSpecFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Configure the use of workload identity on the PersistentResource
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.ServiceAccountSpecOrBuilder
        getServiceAccountSpecOrBuilder() {
      if (serviceAccountSpecBuilder_ != null) {
        return serviceAccountSpecBuilder_.getMessageOrBuilder();
      } else {
        return serviceAccountSpec_ == null
            ? com.google.cloud.aiplatform.v1.ServiceAccountSpec.getDefaultInstance()
            : serviceAccountSpec_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Configure the use of workload identity on the PersistentResource
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.ServiceAccountSpec,
            com.google.cloud.aiplatform.v1.ServiceAccountSpec.Builder,
            com.google.cloud.aiplatform.v1.ServiceAccountSpecOrBuilder>
        getServiceAccountSpecFieldBuilder() {
      if (serviceAccountSpecBuilder_ == null) {
        serviceAccountSpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.ServiceAccountSpec,
                com.google.cloud.aiplatform.v1.ServiceAccountSpec.Builder,
                com.google.cloud.aiplatform.v1.ServiceAccountSpecOrBuilder>(
                getServiceAccountSpec(), getParentForChildren(), isClean());
        serviceAccountSpec_ = null;
      }
      return serviceAccountSpecBuilder_;
    }

    private com.google.cloud.aiplatform.v1.RaySpec raySpec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.RaySpec,
            com.google.cloud.aiplatform.v1.RaySpec.Builder,
            com.google.cloud.aiplatform.v1.RaySpecOrBuilder>
        raySpecBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. Ray cluster configuration.
     * Required when creating a dedicated RayCluster on the PersistentResource.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the raySpec field is set.
     */
    public boolean hasRaySpec() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Ray cluster configuration.
     * Required when creating a dedicated RayCluster on the PersistentResource.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The raySpec.
     */
    public com.google.cloud.aiplatform.v1.RaySpec getRaySpec() {
      if (raySpecBuilder_ == null) {
        return raySpec_ == null
            ? com.google.cloud.aiplatform.v1.RaySpec.getDefaultInstance()
            : raySpec_;
      } else {
        return raySpecBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Ray cluster configuration.
     * Required when creating a dedicated RayCluster on the PersistentResource.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setRaySpec(com.google.cloud.aiplatform.v1.RaySpec value) {
      if (raySpecBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        raySpec_ = value;
      } else {
        raySpecBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Ray cluster configuration.
     * Required when creating a dedicated RayCluster on the PersistentResource.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setRaySpec(com.google.cloud.aiplatform.v1.RaySpec.Builder builderForValue) {
      if (raySpecBuilder_ == null) {
        raySpec_ = builderForValue.build();
      } else {
        raySpecBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Ray cluster configuration.
     * Required when creating a dedicated RayCluster on the PersistentResource.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeRaySpec(com.google.cloud.aiplatform.v1.RaySpec value) {
      if (raySpecBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && raySpec_ != null
            && raySpec_ != com.google.cloud.aiplatform.v1.RaySpec.getDefaultInstance()) {
          getRaySpecBuilder().mergeFrom(value);
        } else {
          raySpec_ = value;
        }
      } else {
        raySpecBuilder_.mergeFrom(value);
      }
      if (raySpec_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Ray cluster configuration.
     * Required when creating a dedicated RayCluster on the PersistentResource.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearRaySpec() {
      bitField0_ = (bitField0_ & ~0x00000002);
      raySpec_ = null;
      if (raySpecBuilder_ != null) {
        raySpecBuilder_.dispose();
        raySpecBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Ray cluster configuration.
     * Required when creating a dedicated RayCluster on the PersistentResource.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.RaySpec.Builder getRaySpecBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getRaySpecFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. Ray cluster configuration.
     * Required when creating a dedicated RayCluster on the PersistentResource.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.aiplatform.v1.RaySpecOrBuilder getRaySpecOrBuilder() {
      if (raySpecBuilder_ != null) {
        return raySpecBuilder_.getMessageOrBuilder();
      } else {
        return raySpec_ == null
            ? com.google.cloud.aiplatform.v1.RaySpec.getDefaultInstance()
            : raySpec_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Ray cluster configuration.
     * Required when creating a dedicated RayCluster on the PersistentResource.
     * </pre>
     *
     * <code>
     * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1.RaySpec,
            com.google.cloud.aiplatform.v1.RaySpec.Builder,
            com.google.cloud.aiplatform.v1.RaySpecOrBuilder>
        getRaySpecFieldBuilder() {
      if (raySpecBuilder_ == null) {
        raySpecBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1.RaySpec,
                com.google.cloud.aiplatform.v1.RaySpec.Builder,
                com.google.cloud.aiplatform.v1.RaySpecOrBuilder>(
                getRaySpec(), getParentForChildren(), isClean());
        raySpec_ = null;
      }
      return raySpecBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.ResourceRuntimeSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.ResourceRuntimeSpec)
  private static final com.google.cloud.aiplatform.v1.ResourceRuntimeSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.ResourceRuntimeSpec();
  }

  public static com.google.cloud.aiplatform.v1.ResourceRuntimeSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceRuntimeSpec> PARSER =
      new com.google.protobuf.AbstractParser<ResourceRuntimeSpec>() {
        @java.lang.Override
        public ResourceRuntimeSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceRuntimeSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceRuntimeSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.ResourceRuntimeSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
