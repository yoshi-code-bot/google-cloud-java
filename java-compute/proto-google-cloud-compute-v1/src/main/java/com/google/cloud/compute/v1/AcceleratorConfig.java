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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * A specification of the type and number of accelerator cards attached to the instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.AcceleratorConfig}
 */
public final class AcceleratorConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AcceleratorConfig)
    AcceleratorConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AcceleratorConfig.newBuilder() to construct.
  private AcceleratorConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AcceleratorConfig() {
    acceleratorType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AcceleratorConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AcceleratorConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AcceleratorConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AcceleratorConfig.class,
            com.google.cloud.compute.v1.AcceleratorConfig.Builder.class);
  }

  private int bitField0_;
  public static final int ACCELERATOR_COUNT_FIELD_NUMBER = 504879675;
  private int acceleratorCount_ = 0;

  /**
   *
   *
   * <pre>
   * The number of the guest accelerator cards exposed to this instance.
   * </pre>
   *
   * <code>optional int32 accelerator_count = 504879675;</code>
   *
   * @return Whether the acceleratorCount field is set.
   */
  @java.lang.Override
  public boolean hasAcceleratorCount() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The number of the guest accelerator cards exposed to this instance.
   * </pre>
   *
   * <code>optional int32 accelerator_count = 504879675;</code>
   *
   * @return The acceleratorCount.
   */
  @java.lang.Override
  public int getAcceleratorCount() {
    return acceleratorCount_;
  }

  public static final int ACCELERATOR_TYPE_FIELD_NUMBER = 138031246;

  @SuppressWarnings("serial")
  private volatile java.lang.Object acceleratorType_ = "";

  /**
   *
   *
   * <pre>
   * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   *
   * @return Whether the acceleratorType field is set.
   */
  @java.lang.Override
  public boolean hasAcceleratorType() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   *
   * @return The acceleratorType.
   */
  @java.lang.Override
  public java.lang.String getAcceleratorType() {
    java.lang.Object ref = acceleratorType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      acceleratorType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
   * </pre>
   *
   * <code>optional string accelerator_type = 138031246;</code>
   *
   * @return The bytes for acceleratorType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAcceleratorTypeBytes() {
    java.lang.Object ref = acceleratorType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      acceleratorType_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 138031246, acceleratorType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(504879675, acceleratorCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(138031246, acceleratorType_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(504879675, acceleratorCount_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.AcceleratorConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AcceleratorConfig other =
        (com.google.cloud.compute.v1.AcceleratorConfig) obj;

    if (hasAcceleratorCount() != other.hasAcceleratorCount()) return false;
    if (hasAcceleratorCount()) {
      if (getAcceleratorCount() != other.getAcceleratorCount()) return false;
    }
    if (hasAcceleratorType() != other.hasAcceleratorType()) return false;
    if (hasAcceleratorType()) {
      if (!getAcceleratorType().equals(other.getAcceleratorType())) return false;
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
    if (hasAcceleratorCount()) {
      hash = (37 * hash) + ACCELERATOR_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getAcceleratorCount();
    }
    if (hasAcceleratorType()) {
      hash = (37 * hash) + ACCELERATOR_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getAcceleratorType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.AcceleratorConfig prototype) {
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
   * A specification of the type and number of accelerator cards attached to the instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.AcceleratorConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AcceleratorConfig)
      com.google.cloud.compute.v1.AcceleratorConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AcceleratorConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AcceleratorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AcceleratorConfig.class,
              com.google.cloud.compute.v1.AcceleratorConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AcceleratorConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      acceleratorCount_ = 0;
      acceleratorType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AcceleratorConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AcceleratorConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AcceleratorConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AcceleratorConfig build() {
      com.google.cloud.compute.v1.AcceleratorConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AcceleratorConfig buildPartial() {
      com.google.cloud.compute.v1.AcceleratorConfig result =
          new com.google.cloud.compute.v1.AcceleratorConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.AcceleratorConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.acceleratorCount_ = acceleratorCount_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.acceleratorType_ = acceleratorType_;
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
      if (other instanceof com.google.cloud.compute.v1.AcceleratorConfig) {
        return mergeFrom((com.google.cloud.compute.v1.AcceleratorConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AcceleratorConfig other) {
      if (other == com.google.cloud.compute.v1.AcceleratorConfig.getDefaultInstance()) return this;
      if (other.hasAcceleratorCount()) {
        setAcceleratorCount(other.getAcceleratorCount());
      }
      if (other.hasAcceleratorType()) {
        acceleratorType_ = other.acceleratorType_;
        bitField0_ |= 0x00000002;
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
            case 1104249970:
              {
                acceleratorType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 1104249970
            case -255929896:
              {
                acceleratorCount_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case -255929896
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

    private int acceleratorCount_;

    /**
     *
     *
     * <pre>
     * The number of the guest accelerator cards exposed to this instance.
     * </pre>
     *
     * <code>optional int32 accelerator_count = 504879675;</code>
     *
     * @return Whether the acceleratorCount field is set.
     */
    @java.lang.Override
    public boolean hasAcceleratorCount() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The number of the guest accelerator cards exposed to this instance.
     * </pre>
     *
     * <code>optional int32 accelerator_count = 504879675;</code>
     *
     * @return The acceleratorCount.
     */
    @java.lang.Override
    public int getAcceleratorCount() {
      return acceleratorCount_;
    }

    /**
     *
     *
     * <pre>
     * The number of the guest accelerator cards exposed to this instance.
     * </pre>
     *
     * <code>optional int32 accelerator_count = 504879675;</code>
     *
     * @param value The acceleratorCount to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorCount(int value) {

      acceleratorCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The number of the guest accelerator cards exposed to this instance.
     * </pre>
     *
     * <code>optional int32 accelerator_count = 504879675;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      acceleratorCount_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object acceleratorType_ = "";

    /**
     *
     *
     * <pre>
     * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     *
     * @return Whether the acceleratorType field is set.
     */
    public boolean hasAcceleratorType() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     *
     * @return The acceleratorType.
     */
    public java.lang.String getAcceleratorType() {
      java.lang.Object ref = acceleratorType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        acceleratorType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     *
     * @return The bytes for acceleratorType.
     */
    public com.google.protobuf.ByteString getAcceleratorTypeBytes() {
      java.lang.Object ref = acceleratorType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        acceleratorType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     *
     * @param value The acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      acceleratorType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAcceleratorType() {
      acceleratorType_ = getDefaultInstance().getAcceleratorType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full or partial URL of the accelerator type resource to attach to this instance. For example: projects/my-project/zones/us-central1-c/acceleratorTypes/nvidia-tesla-p100 If you are creating an instance template, specify only the accelerator name. See GPUs on Compute Engine for a full list of accelerator types.
     * </pre>
     *
     * <code>optional string accelerator_type = 138031246;</code>
     *
     * @param value The bytes for acceleratorType to set.
     * @return This builder for chaining.
     */
    public Builder setAcceleratorTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      acceleratorType_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AcceleratorConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AcceleratorConfig)
  private static final com.google.cloud.compute.v1.AcceleratorConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AcceleratorConfig();
  }

  public static com.google.cloud.compute.v1.AcceleratorConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AcceleratorConfig> PARSER =
      new com.google.protobuf.AbstractParser<AcceleratorConfig>() {
        @java.lang.Override
        public AcceleratorConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AcceleratorConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AcceleratorConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AcceleratorConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
