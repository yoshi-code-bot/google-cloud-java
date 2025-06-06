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
// source: google/cloud/netapp/v1/volume.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.netapp.v1;

/**
 *
 *
 * <pre>
 * The RestoreParameters if volume is created from a snapshot or backup.
 * </pre>
 *
 * Protobuf type {@code google.cloud.netapp.v1.RestoreParameters}
 */
public final class RestoreParameters extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.netapp.v1.RestoreParameters)
    RestoreParametersOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RestoreParameters.newBuilder() to construct.
  private RestoreParameters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RestoreParameters() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RestoreParameters();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_RestoreParameters_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.netapp.v1.VolumeProto
        .internal_static_google_cloud_netapp_v1_RestoreParameters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.netapp.v1.RestoreParameters.class,
            com.google.cloud.netapp.v1.RestoreParameters.Builder.class);
  }

  private int sourceCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object source_;

  public enum SourceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    SOURCE_SNAPSHOT(1),
    SOURCE_BACKUP(2),
    SOURCE_NOT_SET(0);
    private final int value;

    private SourceCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static SourceCase valueOf(int value) {
      return forNumber(value);
    }

    public static SourceCase forNumber(int value) {
      switch (value) {
        case 1:
          return SOURCE_SNAPSHOT;
        case 2:
          return SOURCE_BACKUP;
        case 0:
          return SOURCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public SourceCase getSourceCase() {
    return SourceCase.forNumber(sourceCase_);
  }

  public static final int SOURCE_SNAPSHOT_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * Full name of the snapshot resource.
   * Format:
   * projects/{project}/locations/{location}/volumes/{volume}/snapshots/{snapshot}
   * </pre>
   *
   * <code>string source_snapshot = 1;</code>
   *
   * @return Whether the sourceSnapshot field is set.
   */
  public boolean hasSourceSnapshot() {
    return sourceCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * Full name of the snapshot resource.
   * Format:
   * projects/{project}/locations/{location}/volumes/{volume}/snapshots/{snapshot}
   * </pre>
   *
   * <code>string source_snapshot = 1;</code>
   *
   * @return The sourceSnapshot.
   */
  public java.lang.String getSourceSnapshot() {
    java.lang.Object ref = "";
    if (sourceCase_ == 1) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (sourceCase_ == 1) {
        source_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Full name of the snapshot resource.
   * Format:
   * projects/{project}/locations/{location}/volumes/{volume}/snapshots/{snapshot}
   * </pre>
   *
   * <code>string source_snapshot = 1;</code>
   *
   * @return The bytes for sourceSnapshot.
   */
  public com.google.protobuf.ByteString getSourceSnapshotBytes() {
    java.lang.Object ref = "";
    if (sourceCase_ == 1) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (sourceCase_ == 1) {
        source_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_BACKUP_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * Full name of the backup resource.
   * Format:
   * projects/{project}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}
   * </pre>
   *
   * <code>string source_backup = 2;</code>
   *
   * @return Whether the sourceBackup field is set.
   */
  public boolean hasSourceBackup() {
    return sourceCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * Full name of the backup resource.
   * Format:
   * projects/{project}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}
   * </pre>
   *
   * <code>string source_backup = 2;</code>
   *
   * @return The sourceBackup.
   */
  public java.lang.String getSourceBackup() {
    java.lang.Object ref = "";
    if (sourceCase_ == 2) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (sourceCase_ == 2) {
        source_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Full name of the backup resource.
   * Format:
   * projects/{project}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}
   * </pre>
   *
   * <code>string source_backup = 2;</code>
   *
   * @return The bytes for sourceBackup.
   */
  public com.google.protobuf.ByteString getSourceBackupBytes() {
    java.lang.Object ref = "";
    if (sourceCase_ == 2) {
      ref = source_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (sourceCase_ == 2) {
        source_ = b;
      }
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
    if (sourceCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, source_);
    }
    if (sourceCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, source_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sourceCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, source_);
    }
    if (sourceCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, source_);
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
    if (!(obj instanceof com.google.cloud.netapp.v1.RestoreParameters)) {
      return super.equals(obj);
    }
    com.google.cloud.netapp.v1.RestoreParameters other =
        (com.google.cloud.netapp.v1.RestoreParameters) obj;

    if (!getSourceCase().equals(other.getSourceCase())) return false;
    switch (sourceCase_) {
      case 1:
        if (!getSourceSnapshot().equals(other.getSourceSnapshot())) return false;
        break;
      case 2:
        if (!getSourceBackup().equals(other.getSourceBackup())) return false;
        break;
      case 0:
      default:
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
    switch (sourceCase_) {
      case 1:
        hash = (37 * hash) + SOURCE_SNAPSHOT_FIELD_NUMBER;
        hash = (53 * hash) + getSourceSnapshot().hashCode();
        break;
      case 2:
        hash = (37 * hash) + SOURCE_BACKUP_FIELD_NUMBER;
        hash = (53 * hash) + getSourceBackup().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.netapp.v1.RestoreParameters parseFrom(
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

  public static Builder newBuilder(com.google.cloud.netapp.v1.RestoreParameters prototype) {
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
   * The RestoreParameters if volume is created from a snapshot or backup.
   * </pre>
   *
   * Protobuf type {@code google.cloud.netapp.v1.RestoreParameters}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.netapp.v1.RestoreParameters)
      com.google.cloud.netapp.v1.RestoreParametersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_RestoreParameters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_RestoreParameters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.netapp.v1.RestoreParameters.class,
              com.google.cloud.netapp.v1.RestoreParameters.Builder.class);
    }

    // Construct using com.google.cloud.netapp.v1.RestoreParameters.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sourceCase_ = 0;
      source_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.netapp.v1.VolumeProto
          .internal_static_google_cloud_netapp_v1_RestoreParameters_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.RestoreParameters getDefaultInstanceForType() {
      return com.google.cloud.netapp.v1.RestoreParameters.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.RestoreParameters build() {
      com.google.cloud.netapp.v1.RestoreParameters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.netapp.v1.RestoreParameters buildPartial() {
      com.google.cloud.netapp.v1.RestoreParameters result =
          new com.google.cloud.netapp.v1.RestoreParameters(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.netapp.v1.RestoreParameters result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.cloud.netapp.v1.RestoreParameters result) {
      result.sourceCase_ = sourceCase_;
      result.source_ = this.source_;
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
      if (other instanceof com.google.cloud.netapp.v1.RestoreParameters) {
        return mergeFrom((com.google.cloud.netapp.v1.RestoreParameters) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.netapp.v1.RestoreParameters other) {
      if (other == com.google.cloud.netapp.v1.RestoreParameters.getDefaultInstance()) return this;
      switch (other.getSourceCase()) {
        case SOURCE_SNAPSHOT:
          {
            sourceCase_ = 1;
            source_ = other.source_;
            onChanged();
            break;
          }
        case SOURCE_BACKUP:
          {
            sourceCase_ = 2;
            source_ = other.source_;
            onChanged();
            break;
          }
        case SOURCE_NOT_SET:
          {
            break;
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                sourceCase_ = 1;
                source_ = s;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                sourceCase_ = 2;
                source_ = s;
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

    private int sourceCase_ = 0;
    private java.lang.Object source_;

    public SourceCase getSourceCase() {
      return SourceCase.forNumber(sourceCase_);
    }

    public Builder clearSource() {
      sourceCase_ = 0;
      source_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Full name of the snapshot resource.
     * Format:
     * projects/{project}/locations/{location}/volumes/{volume}/snapshots/{snapshot}
     * </pre>
     *
     * <code>string source_snapshot = 1;</code>
     *
     * @return Whether the sourceSnapshot field is set.
     */
    @java.lang.Override
    public boolean hasSourceSnapshot() {
      return sourceCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * Full name of the snapshot resource.
     * Format:
     * projects/{project}/locations/{location}/volumes/{volume}/snapshots/{snapshot}
     * </pre>
     *
     * <code>string source_snapshot = 1;</code>
     *
     * @return The sourceSnapshot.
     */
    @java.lang.Override
    public java.lang.String getSourceSnapshot() {
      java.lang.Object ref = "";
      if (sourceCase_ == 1) {
        ref = source_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (sourceCase_ == 1) {
          source_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Full name of the snapshot resource.
     * Format:
     * projects/{project}/locations/{location}/volumes/{volume}/snapshots/{snapshot}
     * </pre>
     *
     * <code>string source_snapshot = 1;</code>
     *
     * @return The bytes for sourceSnapshot.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSourceSnapshotBytes() {
      java.lang.Object ref = "";
      if (sourceCase_ == 1) {
        ref = source_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (sourceCase_ == 1) {
          source_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Full name of the snapshot resource.
     * Format:
     * projects/{project}/locations/{location}/volumes/{volume}/snapshots/{snapshot}
     * </pre>
     *
     * <code>string source_snapshot = 1;</code>
     *
     * @param value The sourceSnapshot to set.
     * @return This builder for chaining.
     */
    public Builder setSourceSnapshot(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceCase_ = 1;
      source_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full name of the snapshot resource.
     * Format:
     * projects/{project}/locations/{location}/volumes/{volume}/snapshots/{snapshot}
     * </pre>
     *
     * <code>string source_snapshot = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceSnapshot() {
      if (sourceCase_ == 1) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full name of the snapshot resource.
     * Format:
     * projects/{project}/locations/{location}/volumes/{volume}/snapshots/{snapshot}
     * </pre>
     *
     * <code>string source_snapshot = 1;</code>
     *
     * @param value The bytes for sourceSnapshot to set.
     * @return This builder for chaining.
     */
    public Builder setSourceSnapshotBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceCase_ = 1;
      source_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full name of the backup resource.
     * Format:
     * projects/{project}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}
     * </pre>
     *
     * <code>string source_backup = 2;</code>
     *
     * @return Whether the sourceBackup field is set.
     */
    @java.lang.Override
    public boolean hasSourceBackup() {
      return sourceCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * Full name of the backup resource.
     * Format:
     * projects/{project}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}
     * </pre>
     *
     * <code>string source_backup = 2;</code>
     *
     * @return The sourceBackup.
     */
    @java.lang.Override
    public java.lang.String getSourceBackup() {
      java.lang.Object ref = "";
      if (sourceCase_ == 2) {
        ref = source_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (sourceCase_ == 2) {
          source_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Full name of the backup resource.
     * Format:
     * projects/{project}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}
     * </pre>
     *
     * <code>string source_backup = 2;</code>
     *
     * @return The bytes for sourceBackup.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSourceBackupBytes() {
      java.lang.Object ref = "";
      if (sourceCase_ == 2) {
        ref = source_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (sourceCase_ == 2) {
          source_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Full name of the backup resource.
     * Format:
     * projects/{project}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}
     * </pre>
     *
     * <code>string source_backup = 2;</code>
     *
     * @param value The sourceBackup to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBackup(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceCase_ = 2;
      source_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full name of the backup resource.
     * Format:
     * projects/{project}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}
     * </pre>
     *
     * <code>string source_backup = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceBackup() {
      if (sourceCase_ == 2) {
        sourceCase_ = 0;
        source_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full name of the backup resource.
     * Format:
     * projects/{project}/locations/{location}/backupVaults/{backup_vault_id}/backups/{backup_id}
     * </pre>
     *
     * <code>string source_backup = 2;</code>
     *
     * @param value The bytes for sourceBackup to set.
     * @return This builder for chaining.
     */
    public Builder setSourceBackupBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceCase_ = 2;
      source_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.netapp.v1.RestoreParameters)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.netapp.v1.RestoreParameters)
  private static final com.google.cloud.netapp.v1.RestoreParameters DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.netapp.v1.RestoreParameters();
  }

  public static com.google.cloud.netapp.v1.RestoreParameters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RestoreParameters> PARSER =
      new com.google.protobuf.AbstractParser<RestoreParameters>() {
        @java.lang.Override
        public RestoreParameters parsePartialFrom(
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

  public static com.google.protobuf.Parser<RestoreParameters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RestoreParameters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.netapp.v1.RestoreParameters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
