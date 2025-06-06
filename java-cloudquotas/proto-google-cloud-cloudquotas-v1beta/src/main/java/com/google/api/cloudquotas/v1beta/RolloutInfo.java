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
// source: google/api/cloudquotas/v1beta/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.api.cloudquotas.v1beta;

/**
 *
 *
 * <pre>
 * [Output only] Rollout information of a quota.
 * </pre>
 *
 * Protobuf type {@code google.api.cloudquotas.v1beta.RolloutInfo}
 */
public final class RolloutInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.cloudquotas.v1beta.RolloutInfo)
    RolloutInfoOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RolloutInfo.newBuilder() to construct.
  private RolloutInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RolloutInfo() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RolloutInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.cloudquotas.v1beta.ResourcesProto
        .internal_static_google_api_cloudquotas_v1beta_RolloutInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.cloudquotas.v1beta.ResourcesProto
        .internal_static_google_api_cloudquotas_v1beta_RolloutInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.cloudquotas.v1beta.RolloutInfo.class,
            com.google.api.cloudquotas.v1beta.RolloutInfo.Builder.class);
  }

  public static final int ONGOING_ROLLOUT_FIELD_NUMBER = 1;
  private boolean ongoingRollout_ = false;

  /**
   *
   *
   * <pre>
   * Whether there is an ongoing rollout for a quota or not.
   * </pre>
   *
   * <code>bool ongoing_rollout = 1;</code>
   *
   * @return The ongoingRollout.
   */
  @java.lang.Override
  public boolean getOngoingRollout() {
    return ongoingRollout_;
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
    if (ongoingRollout_ != false) {
      output.writeBool(1, ongoingRollout_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (ongoingRollout_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, ongoingRollout_);
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
    if (!(obj instanceof com.google.api.cloudquotas.v1beta.RolloutInfo)) {
      return super.equals(obj);
    }
    com.google.api.cloudquotas.v1beta.RolloutInfo other =
        (com.google.api.cloudquotas.v1beta.RolloutInfo) obj;

    if (getOngoingRollout() != other.getOngoingRollout()) return false;
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
    hash = (37 * hash) + ONGOING_ROLLOUT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getOngoingRollout());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo parseFrom(
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

  public static Builder newBuilder(com.google.api.cloudquotas.v1beta.RolloutInfo prototype) {
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
   * [Output only] Rollout information of a quota.
   * </pre>
   *
   * Protobuf type {@code google.api.cloudquotas.v1beta.RolloutInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.cloudquotas.v1beta.RolloutInfo)
      com.google.api.cloudquotas.v1beta.RolloutInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.cloudquotas.v1beta.ResourcesProto
          .internal_static_google_api_cloudquotas_v1beta_RolloutInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.cloudquotas.v1beta.ResourcesProto
          .internal_static_google_api_cloudquotas_v1beta_RolloutInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.cloudquotas.v1beta.RolloutInfo.class,
              com.google.api.cloudquotas.v1beta.RolloutInfo.Builder.class);
    }

    // Construct using com.google.api.cloudquotas.v1beta.RolloutInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      ongoingRollout_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.cloudquotas.v1beta.ResourcesProto
          .internal_static_google_api_cloudquotas_v1beta_RolloutInfo_descriptor;
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1beta.RolloutInfo getDefaultInstanceForType() {
      return com.google.api.cloudquotas.v1beta.RolloutInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1beta.RolloutInfo build() {
      com.google.api.cloudquotas.v1beta.RolloutInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.cloudquotas.v1beta.RolloutInfo buildPartial() {
      com.google.api.cloudquotas.v1beta.RolloutInfo result =
          new com.google.api.cloudquotas.v1beta.RolloutInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.cloudquotas.v1beta.RolloutInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.ongoingRollout_ = ongoingRollout_;
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
      if (other instanceof com.google.api.cloudquotas.v1beta.RolloutInfo) {
        return mergeFrom((com.google.api.cloudquotas.v1beta.RolloutInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.cloudquotas.v1beta.RolloutInfo other) {
      if (other == com.google.api.cloudquotas.v1beta.RolloutInfo.getDefaultInstance()) return this;
      if (other.getOngoingRollout() != false) {
        setOngoingRollout(other.getOngoingRollout());
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
                ongoingRollout_ = input.readBool();
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

    private boolean ongoingRollout_;

    /**
     *
     *
     * <pre>
     * Whether there is an ongoing rollout for a quota or not.
     * </pre>
     *
     * <code>bool ongoing_rollout = 1;</code>
     *
     * @return The ongoingRollout.
     */
    @java.lang.Override
    public boolean getOngoingRollout() {
      return ongoingRollout_;
    }

    /**
     *
     *
     * <pre>
     * Whether there is an ongoing rollout for a quota or not.
     * </pre>
     *
     * <code>bool ongoing_rollout = 1;</code>
     *
     * @param value The ongoingRollout to set.
     * @return This builder for chaining.
     */
    public Builder setOngoingRollout(boolean value) {

      ongoingRollout_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Whether there is an ongoing rollout for a quota or not.
     * </pre>
     *
     * <code>bool ongoing_rollout = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOngoingRollout() {
      bitField0_ = (bitField0_ & ~0x00000001);
      ongoingRollout_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.api.cloudquotas.v1beta.RolloutInfo)
  }

  // @@protoc_insertion_point(class_scope:google.api.cloudquotas.v1beta.RolloutInfo)
  private static final com.google.api.cloudquotas.v1beta.RolloutInfo DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.cloudquotas.v1beta.RolloutInfo();
  }

  public static com.google.api.cloudquotas.v1beta.RolloutInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RolloutInfo> PARSER =
      new com.google.protobuf.AbstractParser<RolloutInfo>() {
        @java.lang.Override
        public RolloutInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<RolloutInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RolloutInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.cloudquotas.v1beta.RolloutInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
