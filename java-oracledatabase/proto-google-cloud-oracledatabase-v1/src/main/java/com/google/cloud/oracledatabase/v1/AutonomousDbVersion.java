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
// source: google/cloud/oracledatabase/v1/autonomous_db_version.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.oracledatabase.v1;

/**
 *
 *
 * <pre>
 * Details of the Autonomous Database version.
 * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/AutonomousDbVersionSummary/
 * </pre>
 *
 * Protobuf type {@code google.cloud.oracledatabase.v1.AutonomousDbVersion}
 */
public final class AutonomousDbVersion extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.oracledatabase.v1.AutonomousDbVersion)
    AutonomousDbVersionOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AutonomousDbVersion.newBuilder() to construct.
  private AutonomousDbVersion(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutonomousDbVersion() {
    name_ = "";
    version_ = "";
    dbWorkload_ = 0;
    workloadUri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutonomousDbVersion();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.oracledatabase.v1.AutonomousDbVersionProto
        .internal_static_google_cloud_oracledatabase_v1_AutonomousDbVersion_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.oracledatabase.v1.AutonomousDbVersionProto
        .internal_static_google_cloud_oracledatabase_v1_AutonomousDbVersion_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.oracledatabase.v1.AutonomousDbVersion.class,
            com.google.cloud.oracledatabase.v1.AutonomousDbVersion.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Identifier. The name of the Autonomous Database Version resource with the
   * format:
   * projects/{project}/locations/{region}/autonomousDbVersions/{autonomous_db_version}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
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
   * Identifier. The name of the Autonomous Database Version resource with the
   * format:
   * projects/{project}/locations/{region}/autonomousDbVersions/{autonomous_db_version}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
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

  public static final int VERSION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";

  /**
   *
   *
   * <pre>
   * Output only. An Oracle Database version for Autonomous Database.
   * </pre>
   *
   * <code>string version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. An Oracle Database version for Autonomous Database.
   * </pre>
   *
   * <code>string version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DB_WORKLOAD_FIELD_NUMBER = 4;
  private int dbWorkload_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. The Autonomous Database workload type.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.DBWorkload db_workload = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for dbWorkload.
   */
  @java.lang.Override
  public int getDbWorkloadValue() {
    return dbWorkload_;
  }

  /**
   *
   *
   * <pre>
   * Output only. The Autonomous Database workload type.
   * </pre>
   *
   * <code>
   * .google.cloud.oracledatabase.v1.DBWorkload db_workload = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The dbWorkload.
   */
  @java.lang.Override
  public com.google.cloud.oracledatabase.v1.DBWorkload getDbWorkload() {
    com.google.cloud.oracledatabase.v1.DBWorkload result =
        com.google.cloud.oracledatabase.v1.DBWorkload.forNumber(dbWorkload_);
    return result == null ? com.google.cloud.oracledatabase.v1.DBWorkload.UNRECOGNIZED : result;
  }

  public static final int WORKLOAD_URI_FIELD_NUMBER = 5;

  @SuppressWarnings("serial")
  private volatile java.lang.Object workloadUri_ = "";

  /**
   *
   *
   * <pre>
   * Output only. A URL that points to a detailed description of the Autonomous
   * Database version.
   * </pre>
   *
   * <code>string workload_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The workloadUri.
   */
  @java.lang.Override
  public java.lang.String getWorkloadUri() {
    java.lang.Object ref = workloadUri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      workloadUri_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. A URL that points to a detailed description of the Autonomous
   * Database version.
   * </pre>
   *
   * <code>string workload_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for workloadUri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWorkloadUriBytes() {
    java.lang.Object ref = workloadUri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      workloadUri_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, version_);
    }
    if (dbWorkload_
        != com.google.cloud.oracledatabase.v1.DBWorkload.DB_WORKLOAD_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, dbWorkload_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workloadUri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, workloadUri_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, version_);
    }
    if (dbWorkload_
        != com.google.cloud.oracledatabase.v1.DBWorkload.DB_WORKLOAD_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, dbWorkload_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(workloadUri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, workloadUri_);
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
    if (!(obj instanceof com.google.cloud.oracledatabase.v1.AutonomousDbVersion)) {
      return super.equals(obj);
    }
    com.google.cloud.oracledatabase.v1.AutonomousDbVersion other =
        (com.google.cloud.oracledatabase.v1.AutonomousDbVersion) obj;

    if (!getName().equals(other.getName())) return false;
    if (!getVersion().equals(other.getVersion())) return false;
    if (dbWorkload_ != other.dbWorkload_) return false;
    if (!getWorkloadUri().equals(other.getWorkloadUri())) return false;
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
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + DB_WORKLOAD_FIELD_NUMBER;
    hash = (53 * hash) + dbWorkload_;
    hash = (37 * hash) + WORKLOAD_URI_FIELD_NUMBER;
    hash = (53 * hash) + getWorkloadUri().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion parseFrom(
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
      com.google.cloud.oracledatabase.v1.AutonomousDbVersion prototype) {
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
   * Details of the Autonomous Database version.
   * https://docs.oracle.com/en-us/iaas/api/#/en/database/20160918/AutonomousDbVersionSummary/
   * </pre>
   *
   * Protobuf type {@code google.cloud.oracledatabase.v1.AutonomousDbVersion}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.oracledatabase.v1.AutonomousDbVersion)
      com.google.cloud.oracledatabase.v1.AutonomousDbVersionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.oracledatabase.v1.AutonomousDbVersionProto
          .internal_static_google_cloud_oracledatabase_v1_AutonomousDbVersion_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.oracledatabase.v1.AutonomousDbVersionProto
          .internal_static_google_cloud_oracledatabase_v1_AutonomousDbVersion_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.oracledatabase.v1.AutonomousDbVersion.class,
              com.google.cloud.oracledatabase.v1.AutonomousDbVersion.Builder.class);
    }

    // Construct using com.google.cloud.oracledatabase.v1.AutonomousDbVersion.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      version_ = "";
      dbWorkload_ = 0;
      workloadUri_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.oracledatabase.v1.AutonomousDbVersionProto
          .internal_static_google_cloud_oracledatabase_v1_AutonomousDbVersion_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.AutonomousDbVersion getDefaultInstanceForType() {
      return com.google.cloud.oracledatabase.v1.AutonomousDbVersion.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.AutonomousDbVersion build() {
      com.google.cloud.oracledatabase.v1.AutonomousDbVersion result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.AutonomousDbVersion buildPartial() {
      com.google.cloud.oracledatabase.v1.AutonomousDbVersion result =
          new com.google.cloud.oracledatabase.v1.AutonomousDbVersion(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.oracledatabase.v1.AutonomousDbVersion result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dbWorkload_ = dbWorkload_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.workloadUri_ = workloadUri_;
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
      if (other instanceof com.google.cloud.oracledatabase.v1.AutonomousDbVersion) {
        return mergeFrom((com.google.cloud.oracledatabase.v1.AutonomousDbVersion) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.oracledatabase.v1.AutonomousDbVersion other) {
      if (other == com.google.cloud.oracledatabase.v1.AutonomousDbVersion.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.dbWorkload_ != 0) {
        setDbWorkloadValue(other.getDbWorkloadValue());
      }
      if (!other.getWorkloadUri().isEmpty()) {
        workloadUri_ = other.workloadUri_;
        bitField0_ |= 0x00000008;
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
            case 10:
              {
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                version_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 32:
              {
                dbWorkload_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
            case 42:
              {
                workloadUri_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 42
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
     * Identifier. The name of the Autonomous Database Version resource with the
     * format:
     * projects/{project}/locations/{region}/autonomousDbVersions/{autonomous_db_version}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
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
     * Identifier. The name of the Autonomous Database Version resource with the
     * format:
     * projects/{project}/locations/{region}/autonomousDbVersions/{autonomous_db_version}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
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
     * Identifier. The name of the Autonomous Database Version resource with the
     * format:
     * projects/{project}/locations/{region}/autonomousDbVersions/{autonomous_db_version}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
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
     * Identifier. The name of the Autonomous Database Version resource with the
     * format:
     * projects/{project}/locations/{region}/autonomousDbVersions/{autonomous_db_version}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
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
     * Identifier. The name of the Autonomous Database Version resource with the
     * format:
     * projects/{project}/locations/{region}/autonomousDbVersions/{autonomous_db_version}
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
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

    private java.lang.Object version_ = "";

    /**
     *
     *
     * <pre>
     * Output only. An Oracle Database version for Autonomous Database.
     * </pre>
     *
     * <code>string version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. An Oracle Database version for Autonomous Database.
     * </pre>
     *
     * <code>string version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. An Oracle Database version for Autonomous Database.
     * </pre>
     *
     * <code>string version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. An Oracle Database version for Autonomous Database.
     * </pre>
     *
     * <code>string version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. An Oracle Database version for Autonomous Database.
     * </pre>
     *
     * <code>string version = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int dbWorkload_ = 0;

    /**
     *
     *
     * <pre>
     * Output only. The Autonomous Database workload type.
     * </pre>
     *
     * <code>
     * .google.cloud.oracledatabase.v1.DBWorkload db_workload = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for dbWorkload.
     */
    @java.lang.Override
    public int getDbWorkloadValue() {
      return dbWorkload_;
    }

    /**
     *
     *
     * <pre>
     * Output only. The Autonomous Database workload type.
     * </pre>
     *
     * <code>
     * .google.cloud.oracledatabase.v1.DBWorkload db_workload = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for dbWorkload to set.
     * @return This builder for chaining.
     */
    public Builder setDbWorkloadValue(int value) {
      dbWorkload_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The Autonomous Database workload type.
     * </pre>
     *
     * <code>
     * .google.cloud.oracledatabase.v1.DBWorkload db_workload = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The dbWorkload.
     */
    @java.lang.Override
    public com.google.cloud.oracledatabase.v1.DBWorkload getDbWorkload() {
      com.google.cloud.oracledatabase.v1.DBWorkload result =
          com.google.cloud.oracledatabase.v1.DBWorkload.forNumber(dbWorkload_);
      return result == null ? com.google.cloud.oracledatabase.v1.DBWorkload.UNRECOGNIZED : result;
    }

    /**
     *
     *
     * <pre>
     * Output only. The Autonomous Database workload type.
     * </pre>
     *
     * <code>
     * .google.cloud.oracledatabase.v1.DBWorkload db_workload = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The dbWorkload to set.
     * @return This builder for chaining.
     */
    public Builder setDbWorkload(com.google.cloud.oracledatabase.v1.DBWorkload value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      dbWorkload_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The Autonomous Database workload type.
     * </pre>
     *
     * <code>
     * .google.cloud.oracledatabase.v1.DBWorkload db_workload = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDbWorkload() {
      bitField0_ = (bitField0_ & ~0x00000004);
      dbWorkload_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object workloadUri_ = "";

    /**
     *
     *
     * <pre>
     * Output only. A URL that points to a detailed description of the Autonomous
     * Database version.
     * </pre>
     *
     * <code>string workload_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The workloadUri.
     */
    public java.lang.String getWorkloadUri() {
      java.lang.Object ref = workloadUri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        workloadUri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. A URL that points to a detailed description of the Autonomous
     * Database version.
     * </pre>
     *
     * <code>string workload_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for workloadUri.
     */
    public com.google.protobuf.ByteString getWorkloadUriBytes() {
      java.lang.Object ref = workloadUri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        workloadUri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. A URL that points to a detailed description of the Autonomous
     * Database version.
     * </pre>
     *
     * <code>string workload_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The workloadUri to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadUri(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      workloadUri_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. A URL that points to a detailed description of the Autonomous
     * Database version.
     * </pre>
     *
     * <code>string workload_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWorkloadUri() {
      workloadUri_ = getDefaultInstance().getWorkloadUri();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. A URL that points to a detailed description of the Autonomous
     * Database version.
     * </pre>
     *
     * <code>string workload_uri = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for workloadUri to set.
     * @return This builder for chaining.
     */
    public Builder setWorkloadUriBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      workloadUri_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.oracledatabase.v1.AutonomousDbVersion)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.oracledatabase.v1.AutonomousDbVersion)
  private static final com.google.cloud.oracledatabase.v1.AutonomousDbVersion DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.oracledatabase.v1.AutonomousDbVersion();
  }

  public static com.google.cloud.oracledatabase.v1.AutonomousDbVersion getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutonomousDbVersion> PARSER =
      new com.google.protobuf.AbstractParser<AutonomousDbVersion>() {
        @java.lang.Override
        public AutonomousDbVersion parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutonomousDbVersion> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutonomousDbVersion> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.oracledatabase.v1.AutonomousDbVersion getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
