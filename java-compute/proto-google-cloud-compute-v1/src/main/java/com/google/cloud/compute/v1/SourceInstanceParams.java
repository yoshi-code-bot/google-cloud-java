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
 * A specification of the parameters to use when creating the instance template from a source instance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.SourceInstanceParams}
 */
public final class SourceInstanceParams extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SourceInstanceParams)
    SourceInstanceParamsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SourceInstanceParams.newBuilder() to construct.
  private SourceInstanceParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SourceInstanceParams() {
    diskConfigs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SourceInstanceParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SourceInstanceParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SourceInstanceParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SourceInstanceParams.class,
            com.google.cloud.compute.v1.SourceInstanceParams.Builder.class);
  }

  public static final int DISK_CONFIGS_FIELD_NUMBER = 235580623;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.DiskInstantiationConfig> diskConfigs_;

  /**
   *
   *
   * <pre>
   * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.DiskInstantiationConfig> getDiskConfigsList() {
    return diskConfigs_;
  }

  /**
   *
   *
   * <pre>
   * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.DiskInstantiationConfigOrBuilder>
      getDiskConfigsOrBuilderList() {
    return diskConfigs_;
  }

  /**
   *
   *
   * <pre>
   * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
   * </code>
   */
  @java.lang.Override
  public int getDiskConfigsCount() {
    return diskConfigs_.size();
  }

  /**
   *
   *
   * <pre>
   * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.DiskInstantiationConfig getDiskConfigs(int index) {
    return diskConfigs_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.DiskInstantiationConfigOrBuilder getDiskConfigsOrBuilder(
      int index) {
    return diskConfigs_.get(index);
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
    for (int i = 0; i < diskConfigs_.size(); i++) {
      output.writeMessage(235580623, diskConfigs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < diskConfigs_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(235580623, diskConfigs_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.SourceInstanceParams)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SourceInstanceParams other =
        (com.google.cloud.compute.v1.SourceInstanceParams) obj;

    if (!getDiskConfigsList().equals(other.getDiskConfigsList())) return false;
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
    if (getDiskConfigsCount() > 0) {
      hash = (37 * hash) + DISK_CONFIGS_FIELD_NUMBER;
      hash = (53 * hash) + getDiskConfigsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.SourceInstanceParams prototype) {
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
   * A specification of the parameters to use when creating the instance template from a source instance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.SourceInstanceParams}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SourceInstanceParams)
      com.google.cloud.compute.v1.SourceInstanceParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SourceInstanceParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SourceInstanceParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SourceInstanceParams.class,
              com.google.cloud.compute.v1.SourceInstanceParams.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SourceInstanceParams.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (diskConfigsBuilder_ == null) {
        diskConfigs_ = java.util.Collections.emptyList();
      } else {
        diskConfigs_ = null;
        diskConfigsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SourceInstanceParams_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SourceInstanceParams getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SourceInstanceParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SourceInstanceParams build() {
      com.google.cloud.compute.v1.SourceInstanceParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SourceInstanceParams buildPartial() {
      com.google.cloud.compute.v1.SourceInstanceParams result =
          new com.google.cloud.compute.v1.SourceInstanceParams(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.SourceInstanceParams result) {
      if (diskConfigsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          diskConfigs_ = java.util.Collections.unmodifiableList(diskConfigs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.diskConfigs_ = diskConfigs_;
      } else {
        result.diskConfigs_ = diskConfigsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.SourceInstanceParams result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.SourceInstanceParams) {
        return mergeFrom((com.google.cloud.compute.v1.SourceInstanceParams) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SourceInstanceParams other) {
      if (other == com.google.cloud.compute.v1.SourceInstanceParams.getDefaultInstance())
        return this;
      if (diskConfigsBuilder_ == null) {
        if (!other.diskConfigs_.isEmpty()) {
          if (diskConfigs_.isEmpty()) {
            diskConfigs_ = other.diskConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDiskConfigsIsMutable();
            diskConfigs_.addAll(other.diskConfigs_);
          }
          onChanged();
        }
      } else {
        if (!other.diskConfigs_.isEmpty()) {
          if (diskConfigsBuilder_.isEmpty()) {
            diskConfigsBuilder_.dispose();
            diskConfigsBuilder_ = null;
            diskConfigs_ = other.diskConfigs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            diskConfigsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDiskConfigsFieldBuilder()
                    : null;
          } else {
            diskConfigsBuilder_.addAllMessages(other.diskConfigs_);
          }
        }
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
            case 1884644986:
              {
                com.google.cloud.compute.v1.DiskInstantiationConfig m =
                    input.readMessage(
                        com.google.cloud.compute.v1.DiskInstantiationConfig.parser(),
                        extensionRegistry);
                if (diskConfigsBuilder_ == null) {
                  ensureDiskConfigsIsMutable();
                  diskConfigs_.add(m);
                } else {
                  diskConfigsBuilder_.addMessage(m);
                }
                break;
              } // case 1884644986
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

    private java.util.List<com.google.cloud.compute.v1.DiskInstantiationConfig> diskConfigs_ =
        java.util.Collections.emptyList();

    private void ensureDiskConfigsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        diskConfigs_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.DiskInstantiationConfig>(
                diskConfigs_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.DiskInstantiationConfig,
            com.google.cloud.compute.v1.DiskInstantiationConfig.Builder,
            com.google.cloud.compute.v1.DiskInstantiationConfigOrBuilder>
        diskConfigsBuilder_;

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.DiskInstantiationConfig>
        getDiskConfigsList() {
      if (diskConfigsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(diskConfigs_);
      } else {
        return diskConfigsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public int getDiskConfigsCount() {
      if (diskConfigsBuilder_ == null) {
        return diskConfigs_.size();
      } else {
        return diskConfigsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public com.google.cloud.compute.v1.DiskInstantiationConfig getDiskConfigs(int index) {
      if (diskConfigsBuilder_ == null) {
        return diskConfigs_.get(index);
      } else {
        return diskConfigsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public Builder setDiskConfigs(
        int index, com.google.cloud.compute.v1.DiskInstantiationConfig value) {
      if (diskConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiskConfigsIsMutable();
        diskConfigs_.set(index, value);
        onChanged();
      } else {
        diskConfigsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public Builder setDiskConfigs(
        int index, com.google.cloud.compute.v1.DiskInstantiationConfig.Builder builderForValue) {
      if (diskConfigsBuilder_ == null) {
        ensureDiskConfigsIsMutable();
        diskConfigs_.set(index, builderForValue.build());
        onChanged();
      } else {
        diskConfigsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public Builder addDiskConfigs(com.google.cloud.compute.v1.DiskInstantiationConfig value) {
      if (diskConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiskConfigsIsMutable();
        diskConfigs_.add(value);
        onChanged();
      } else {
        diskConfigsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public Builder addDiskConfigs(
        int index, com.google.cloud.compute.v1.DiskInstantiationConfig value) {
      if (diskConfigsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDiskConfigsIsMutable();
        diskConfigs_.add(index, value);
        onChanged();
      } else {
        diskConfigsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public Builder addDiskConfigs(
        com.google.cloud.compute.v1.DiskInstantiationConfig.Builder builderForValue) {
      if (diskConfigsBuilder_ == null) {
        ensureDiskConfigsIsMutable();
        diskConfigs_.add(builderForValue.build());
        onChanged();
      } else {
        diskConfigsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public Builder addDiskConfigs(
        int index, com.google.cloud.compute.v1.DiskInstantiationConfig.Builder builderForValue) {
      if (diskConfigsBuilder_ == null) {
        ensureDiskConfigsIsMutable();
        diskConfigs_.add(index, builderForValue.build());
        onChanged();
      } else {
        diskConfigsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public Builder addAllDiskConfigs(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.DiskInstantiationConfig> values) {
      if (diskConfigsBuilder_ == null) {
        ensureDiskConfigsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, diskConfigs_);
        onChanged();
      } else {
        diskConfigsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public Builder clearDiskConfigs() {
      if (diskConfigsBuilder_ == null) {
        diskConfigs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        diskConfigsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public Builder removeDiskConfigs(int index) {
      if (diskConfigsBuilder_ == null) {
        ensureDiskConfigsIsMutable();
        diskConfigs_.remove(index);
        onChanged();
      } else {
        diskConfigsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public com.google.cloud.compute.v1.DiskInstantiationConfig.Builder getDiskConfigsBuilder(
        int index) {
      return getDiskConfigsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public com.google.cloud.compute.v1.DiskInstantiationConfigOrBuilder getDiskConfigsOrBuilder(
        int index) {
      if (diskConfigsBuilder_ == null) {
        return diskConfigs_.get(index);
      } else {
        return diskConfigsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.DiskInstantiationConfigOrBuilder>
        getDiskConfigsOrBuilderList() {
      if (diskConfigsBuilder_ != null) {
        return diskConfigsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(diskConfigs_);
      }
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public com.google.cloud.compute.v1.DiskInstantiationConfig.Builder addDiskConfigsBuilder() {
      return getDiskConfigsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.DiskInstantiationConfig.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public com.google.cloud.compute.v1.DiskInstantiationConfig.Builder addDiskConfigsBuilder(
        int index) {
      return getDiskConfigsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.compute.v1.DiskInstantiationConfig.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * Attached disks configuration. If not provided, defaults are applied: For boot disk and any other R/W disks, the source images for each disk will be used. For read-only disks, they will be attached in read-only mode. Local SSD disks will be created as blank volumes.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.DiskInstantiationConfig disk_configs = 235580623;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.DiskInstantiationConfig.Builder>
        getDiskConfigsBuilderList() {
      return getDiskConfigsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.DiskInstantiationConfig,
            com.google.cloud.compute.v1.DiskInstantiationConfig.Builder,
            com.google.cloud.compute.v1.DiskInstantiationConfigOrBuilder>
        getDiskConfigsFieldBuilder() {
      if (diskConfigsBuilder_ == null) {
        diskConfigsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.DiskInstantiationConfig,
                com.google.cloud.compute.v1.DiskInstantiationConfig.Builder,
                com.google.cloud.compute.v1.DiskInstantiationConfigOrBuilder>(
                diskConfigs_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        diskConfigs_ = null;
      }
      return diskConfigsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SourceInstanceParams)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SourceInstanceParams)
  private static final com.google.cloud.compute.v1.SourceInstanceParams DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SourceInstanceParams();
  }

  public static com.google.cloud.compute.v1.SourceInstanceParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SourceInstanceParams> PARSER =
      new com.google.protobuf.AbstractParser<SourceInstanceParams>() {
        @java.lang.Override
        public SourceInstanceParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<SourceInstanceParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SourceInstanceParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SourceInstanceParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
