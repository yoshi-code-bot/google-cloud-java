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
// source: google/cloud/aiplatform/v1/vizier_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [VizierService.CheckTrialEarlyStoppingState][google.cloud.aiplatform.v1.VizierService.CheckTrialEarlyStoppingState].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse}
 */
public final class CheckTrialEarlyStoppingStateResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse)
    CheckTrialEarlyStoppingStateResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CheckTrialEarlyStoppingStateResponse.newBuilder() to construct.
  private CheckTrialEarlyStoppingStateResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CheckTrialEarlyStoppingStateResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CheckTrialEarlyStoppingStateResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1.VizierServiceProto
        .internal_static_google_cloud_aiplatform_v1_CheckTrialEarlyStoppingStateResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1.VizierServiceProto
        .internal_static_google_cloud_aiplatform_v1_CheckTrialEarlyStoppingStateResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse.class,
            com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse.Builder.class);
  }

  public static final int SHOULD_STOP_FIELD_NUMBER = 1;
  private boolean shouldStop_ = false;

  /**
   *
   *
   * <pre>
   * True if the Trial should stop.
   * </pre>
   *
   * <code>bool should_stop = 1;</code>
   *
   * @return The shouldStop.
   */
  @java.lang.Override
  public boolean getShouldStop() {
    return shouldStop_;
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
    if (shouldStop_ != false) {
      output.writeBool(1, shouldStop_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (shouldStop_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, shouldStop_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse other =
        (com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse) obj;

    if (getShouldStop() != other.getShouldStop()) return false;
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
    hash = (37 * hash) + SHOULD_STOP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getShouldStop());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse parseFrom(
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
      com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse prototype) {
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
   * Response message for
   * [VizierService.CheckTrialEarlyStoppingState][google.cloud.aiplatform.v1.VizierService.CheckTrialEarlyStoppingState].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse)
      com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1_CheckTrialEarlyStoppingStateResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1_CheckTrialEarlyStoppingStateResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse.class,
              com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      shouldStop_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1.VizierServiceProto
          .internal_static_google_cloud_aiplatform_v1_CheckTrialEarlyStoppingStateResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse build() {
      com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse buildPartial() {
      com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse result =
          new com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shouldStop_ = shouldStop_;
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
      if (other instanceof com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse
              .getDefaultInstance()) return this;
      if (other.getShouldStop() != false) {
        setShouldStop(other.getShouldStop());
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
                shouldStop_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private boolean shouldStop_;

    /**
     *
     *
     * <pre>
     * True if the Trial should stop.
     * </pre>
     *
     * <code>bool should_stop = 1;</code>
     *
     * @return The shouldStop.
     */
    @java.lang.Override
    public boolean getShouldStop() {
      return shouldStop_;
    }

    /**
     *
     *
     * <pre>
     * True if the Trial should stop.
     * </pre>
     *
     * <code>bool should_stop = 1;</code>
     *
     * @param value The shouldStop to set.
     * @return This builder for chaining.
     */
    public Builder setShouldStop(boolean value) {

      shouldStop_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * True if the Trial should stop.
     * </pre>
     *
     * <code>bool should_stop = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearShouldStop() {
      bitField0_ = (bitField0_ & ~0x00000001);
      shouldStop_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse)
  private static final com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse();
  }

  public static com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CheckTrialEarlyStoppingStateResponse> PARSER =
      new com.google.protobuf.AbstractParser<CheckTrialEarlyStoppingStateResponse>() {
        @java.lang.Override
        public CheckTrialEarlyStoppingStateResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CheckTrialEarlyStoppingStateResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CheckTrialEarlyStoppingStateResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1.CheckTrialEarlyStoppingStateResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
