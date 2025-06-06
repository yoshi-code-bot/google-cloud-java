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
// source: google/cloud/backupdr/v1/backupvault_gce.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.backupdr.v1;

/**
 *
 *
 * <pre>
 * ComputeInstanceDataSourceProperties represents the properties of a
 * ComputeEngine resource that are stored in the DataSource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties}
 */
public final class ComputeInstanceDataSourceProperties
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties)
    ComputeInstanceDataSourcePropertiesOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ComputeInstanceDataSourceProperties.newBuilder() to construct.
  private ComputeInstanceDataSourceProperties(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ComputeInstanceDataSourceProperties() {
    name_ = "";
    description_ = "";
    machineType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ComputeInstanceDataSourceProperties();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.backupdr.v1.BackupvaultGceProto
        .internal_static_google_cloud_backupdr_v1_ComputeInstanceDataSourceProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.backupdr.v1.BackupvaultGceProto
        .internal_static_google_cloud_backupdr_v1_ComputeInstanceDataSourceProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties.class,
            com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Name of the compute instance backed up by the datasource.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Name of the compute instance backed up by the datasource.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";

  /**
   *
   *
   * <pre>
   * The description of the Compute Engine instance.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The description of the Compute Engine instance.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MACHINE_TYPE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object machineType_ = "";

  /**
   *
   *
   * <pre>
   * The machine type of the instance.
   * </pre>
   *
   * <code>string machine_type = 3;</code>
   *
   * @return The machineType.
   */
  @java.lang.Override
  public java.lang.String getMachineType() {
    java.lang.Object ref = machineType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      machineType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The machine type of the instance.
   * </pre>
   *
   * <code>string machine_type = 3;</code>
   *
   * @return The bytes for machineType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMachineTypeBytes() {
    java.lang.Object ref = machineType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      machineType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_DISK_COUNT_FIELD_NUMBER = 4;
  private long totalDiskCount_ = 0L;

  /**
   *
   *
   * <pre>
   * The total number of disks attached to the Instance.
   * </pre>
   *
   * <code>int64 total_disk_count = 4;</code>
   *
   * @return The totalDiskCount.
   */
  @java.lang.Override
  public long getTotalDiskCount() {
    return totalDiskCount_;
  }

  public static final int TOTAL_DISK_SIZE_GB_FIELD_NUMBER = 5;
  private long totalDiskSizeGb_ = 0L;

  /**
   *
   *
   * <pre>
   * The sum of all the disk sizes.
   * </pre>
   *
   * <code>int64 total_disk_size_gb = 5;</code>
   *
   * @return The totalDiskSizeGb.
   */
  @java.lang.Override
  public long getTotalDiskSizeGb() {
    return totalDiskSizeGb_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(machineType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, machineType_);
    }
    if (totalDiskCount_ != 0L) {
      output.writeInt64(4, totalDiskCount_);
    }
    if (totalDiskSizeGb_ != 0L) {
      output.writeInt64(5, totalDiskSizeGb_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(machineType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, machineType_);
    }
    if (totalDiskCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(4, totalDiskCount_);
    }
    if (totalDiskSizeGb_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(5, totalDiskSizeGb_);
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
    if (!(obj instanceof com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties)) {
      return super.equals(obj);
    }
    com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties other =
        (com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getDescription().equals(other.getDescription())) return false;
    if (!getMachineType().equals(other.getMachineType())) return false;
    if (getTotalDiskCount() != other.getTotalDiskCount()) return false;
    if (getTotalDiskSizeGb() != other.getTotalDiskSizeGb()) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    hash = (37 * hash) + MACHINE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMachineType().hashCode();
    hash = (37 * hash) + TOTAL_DISK_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTotalDiskCount());
    hash = (37 * hash) + TOTAL_DISK_SIZE_GB_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getTotalDiskSizeGb());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties parseFrom(
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
      com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties prototype) {
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
   * ComputeInstanceDataSourceProperties represents the properties of a
   * ComputeEngine resource that are stored in the DataSource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties)
      com.google.cloud.backupdr.v1.ComputeInstanceDataSourcePropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.backupdr.v1.BackupvaultGceProto
          .internal_static_google_cloud_backupdr_v1_ComputeInstanceDataSourceProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.backupdr.v1.BackupvaultGceProto
          .internal_static_google_cloud_backupdr_v1_ComputeInstanceDataSourceProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties.class,
              com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties.Builder.class);
    }

    // Construct using com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      description_ = "";
      machineType_ = "";
      totalDiskCount_ = 0L;
      totalDiskSizeGb_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.backupdr.v1.BackupvaultGceProto
          .internal_static_google_cloud_backupdr_v1_ComputeInstanceDataSourceProperties_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties
        getDefaultInstanceForType() {
      return com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties build() {
      com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties buildPartial() {
      com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties result =
          new com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.machineType_ = machineType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.totalDiskCount_ = totalDiskCount_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.totalDiskSizeGb_ = totalDiskSizeGb_;
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
      if (other instanceof com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties) {
        return mergeFrom((com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties other) {
      if (other
          == com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMachineType().isEmpty()) {
        machineType_ = other.machineType_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getTotalDiskCount() != 0L) {
        setTotalDiskCount(other.getTotalDiskCount());
      }
      if (other.getTotalDiskSizeGb() != 0L) {
        setTotalDiskSizeGb(other.getTotalDiskSizeGb());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                description_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                machineType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 32:
              {
                totalDiskCount_ = input.readInt64();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
            case 40:
              {
                totalDiskSizeGb_ = input.readInt64();
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * Name of the compute instance backed up by the datasource.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Name of the compute instance backed up by the datasource.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Name of the compute instance backed up by the datasource.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Name of the compute instance backed up by the datasource.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Name of the compute instance backed up by the datasource.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";

    /**
     *
     *
     * <pre>
     * The description of the Compute Engine instance.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The description of the Compute Engine instance.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The description of the Compute Engine instance.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The description of the Compute Engine instance.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The description of the Compute Engine instance.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object machineType_ = "";

    /**
     *
     *
     * <pre>
     * The machine type of the instance.
     * </pre>
     *
     * <code>string machine_type = 3;</code>
     *
     * @return The machineType.
     */
    public java.lang.String getMachineType() {
      java.lang.Object ref = machineType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        machineType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The machine type of the instance.
     * </pre>
     *
     * <code>string machine_type = 3;</code>
     *
     * @return The bytes for machineType.
     */
    public com.google.protobuf.ByteString getMachineTypeBytes() {
      java.lang.Object ref = machineType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        machineType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The machine type of the instance.
     * </pre>
     *
     * <code>string machine_type = 3;</code>
     *
     * @param value The machineType to set.
     * @return This builder for chaining.
     */
    public Builder setMachineType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      machineType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The machine type of the instance.
     * </pre>
     *
     * <code>string machine_type = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMachineType() {
      machineType_ = getDefaultInstance().getMachineType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The machine type of the instance.
     * </pre>
     *
     * <code>string machine_type = 3;</code>
     *
     * @param value The bytes for machineType to set.
     * @return This builder for chaining.
     */
    public Builder setMachineTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      machineType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private long totalDiskCount_;

    /**
     *
     *
     * <pre>
     * The total number of disks attached to the Instance.
     * </pre>
     *
     * <code>int64 total_disk_count = 4;</code>
     *
     * @return The totalDiskCount.
     */
    @java.lang.Override
    public long getTotalDiskCount() {
      return totalDiskCount_;
    }

    /**
     *
     *
     * <pre>
     * The total number of disks attached to the Instance.
     * </pre>
     *
     * <code>int64 total_disk_count = 4;</code>
     *
     * @param value The totalDiskCount to set.
     * @return This builder for chaining.
     */
    public Builder setTotalDiskCount(long value) {

      totalDiskCount_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The total number of disks attached to the Instance.
     * </pre>
     *
     * <code>int64 total_disk_count = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTotalDiskCount() {
      bitField0_ = (bitField0_ & ~0x00000008);
      totalDiskCount_ = 0L;
      onChanged();
      return this;
    }

    private long totalDiskSizeGb_;

    /**
     *
     *
     * <pre>
     * The sum of all the disk sizes.
     * </pre>
     *
     * <code>int64 total_disk_size_gb = 5;</code>
     *
     * @return The totalDiskSizeGb.
     */
    @java.lang.Override
    public long getTotalDiskSizeGb() {
      return totalDiskSizeGb_;
    }

    /**
     *
     *
     * <pre>
     * The sum of all the disk sizes.
     * </pre>
     *
     * <code>int64 total_disk_size_gb = 5;</code>
     *
     * @param value The totalDiskSizeGb to set.
     * @return This builder for chaining.
     */
    public Builder setTotalDiskSizeGb(long value) {

      totalDiskSizeGb_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The sum of all the disk sizes.
     * </pre>
     *
     * <code>int64 total_disk_size_gb = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTotalDiskSizeGb() {
      bitField0_ = (bitField0_ & ~0x00000010);
      totalDiskSizeGb_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties)
  private static final com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties();
  }

  public static com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComputeInstanceDataSourceProperties> PARSER =
      new com.google.protobuf.AbstractParser<ComputeInstanceDataSourceProperties>() {
        @java.lang.Override
        public ComputeInstanceDataSourceProperties parsePartialFrom(
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

  public static com.google.protobuf.Parser<ComputeInstanceDataSourceProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComputeInstanceDataSourceProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.backupdr.v1.ComputeInstanceDataSourceProperties
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
