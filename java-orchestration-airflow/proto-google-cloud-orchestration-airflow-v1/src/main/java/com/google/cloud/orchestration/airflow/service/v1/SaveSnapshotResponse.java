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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.orchestration.airflow.service.v1;

/**
 *
 *
 * <pre>
 * Response to SaveSnapshotRequest.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse}
 */
public final class SaveSnapshotResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse)
    SaveSnapshotResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SaveSnapshotResponse.newBuilder() to construct.
  private SaveSnapshotResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SaveSnapshotResponse() {
    snapshotPath_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SaveSnapshotResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_SaveSnapshotResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_SaveSnapshotResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse.class,
            com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse.Builder.class);
  }

  public static final int SNAPSHOT_PATH_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object snapshotPath_ = "";

  /**
   *
   *
   * <pre>
   * The fully-resolved Cloud Storage path of the created snapshot,
   * e.g.:
   * "gs://my-bucket/snapshots/project_location_environment_timestamp".
   * This field is populated only if the snapshot creation was successful.
   * </pre>
   *
   * <code>string snapshot_path = 1;</code>
   *
   * @return The snapshotPath.
   */
  @java.lang.Override
  public java.lang.String getSnapshotPath() {
    java.lang.Object ref = snapshotPath_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      snapshotPath_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The fully-resolved Cloud Storage path of the created snapshot,
   * e.g.:
   * "gs://my-bucket/snapshots/project_location_environment_timestamp".
   * This field is populated only if the snapshot creation was successful.
   * </pre>
   *
   * <code>string snapshot_path = 1;</code>
   *
   * @return The bytes for snapshotPath.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSnapshotPathBytes() {
    java.lang.Object ref = snapshotPath_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      snapshotPath_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotPath_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, snapshotPath_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(snapshotPath_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, snapshotPath_);
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
    if (!(obj instanceof com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse other =
        (com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse) obj;

    if (!getSnapshotPath().equals(other.getSnapshotPath())) return false;
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
    hash = (37 * hash) + SNAPSHOT_PATH_FIELD_NUMBER;
    hash = (53 * hash) + getSnapshotPath().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse parseFrom(
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
      com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse prototype) {
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
   * Response to SaveSnapshotRequest.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse)
      com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_SaveSnapshotResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_SaveSnapshotResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse.class,
              com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      snapshotPath_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_SaveSnapshotResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse
        getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse build() {
      com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse result =
          new com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.snapshotPath_ = snapshotPath_;
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
      if (other instanceof com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse) {
        return mergeFrom(
            (com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse other) {
      if (other
          == com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse
              .getDefaultInstance()) return this;
      if (!other.getSnapshotPath().isEmpty()) {
        snapshotPath_ = other.snapshotPath_;
        bitField0_ |= 0x00000001;
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
                snapshotPath_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private java.lang.Object snapshotPath_ = "";

    /**
     *
     *
     * <pre>
     * The fully-resolved Cloud Storage path of the created snapshot,
     * e.g.:
     * "gs://my-bucket/snapshots/project_location_environment_timestamp".
     * This field is populated only if the snapshot creation was successful.
     * </pre>
     *
     * <code>string snapshot_path = 1;</code>
     *
     * @return The snapshotPath.
     */
    public java.lang.String getSnapshotPath() {
      java.lang.Object ref = snapshotPath_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        snapshotPath_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The fully-resolved Cloud Storage path of the created snapshot,
     * e.g.:
     * "gs://my-bucket/snapshots/project_location_environment_timestamp".
     * This field is populated only if the snapshot creation was successful.
     * </pre>
     *
     * <code>string snapshot_path = 1;</code>
     *
     * @return The bytes for snapshotPath.
     */
    public com.google.protobuf.ByteString getSnapshotPathBytes() {
      java.lang.Object ref = snapshotPath_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        snapshotPath_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The fully-resolved Cloud Storage path of the created snapshot,
     * e.g.:
     * "gs://my-bucket/snapshots/project_location_environment_timestamp".
     * This field is populated only if the snapshot creation was successful.
     * </pre>
     *
     * <code>string snapshot_path = 1;</code>
     *
     * @param value The snapshotPath to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotPath(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      snapshotPath_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The fully-resolved Cloud Storage path of the created snapshot,
     * e.g.:
     * "gs://my-bucket/snapshots/project_location_environment_timestamp".
     * This field is populated only if the snapshot creation was successful.
     * </pre>
     *
     * <code>string snapshot_path = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSnapshotPath() {
      snapshotPath_ = getDefaultInstance().getSnapshotPath();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The fully-resolved Cloud Storage path of the created snapshot,
     * e.g.:
     * "gs://my-bucket/snapshots/project_location_environment_timestamp".
     * This field is populated only if the snapshot creation was successful.
     * </pre>
     *
     * <code>string snapshot_path = 1;</code>
     *
     * @param value The bytes for snapshotPath to set.
     * @return This builder for chaining.
     */
    public Builder setSnapshotPathBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      snapshotPath_ = value;
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse)
  private static final com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse();
  }

  public static com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SaveSnapshotResponse> PARSER =
      new com.google.protobuf.AbstractParser<SaveSnapshotResponse>() {
        @java.lang.Override
        public SaveSnapshotResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SaveSnapshotResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SaveSnapshotResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.SaveSnapshotResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
