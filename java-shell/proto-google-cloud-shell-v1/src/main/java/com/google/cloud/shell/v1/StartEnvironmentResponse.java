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
// source: google/cloud/shell/v1/cloudshell.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.shell.v1;

/**
 *
 *
 * <pre>
 * Message included in the response field of operations returned from
 * [StartEnvironment][google.cloud.shell.v1.CloudShellService.StartEnvironment]
 * once the operation is complete.
 * </pre>
 *
 * Protobuf type {@code google.cloud.shell.v1.StartEnvironmentResponse}
 */
public final class StartEnvironmentResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.shell.v1.StartEnvironmentResponse)
    StartEnvironmentResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use StartEnvironmentResponse.newBuilder() to construct.
  private StartEnvironmentResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StartEnvironmentResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StartEnvironmentResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.shell.v1.CloudShellProto
        .internal_static_google_cloud_shell_v1_StartEnvironmentResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.shell.v1.CloudShellProto
        .internal_static_google_cloud_shell_v1_StartEnvironmentResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.shell.v1.StartEnvironmentResponse.class,
            com.google.cloud.shell.v1.StartEnvironmentResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ENVIRONMENT_FIELD_NUMBER = 1;
  private com.google.cloud.shell.v1.Environment environment_;

  /**
   *
   *
   * <pre>
   * Environment that was started.
   * </pre>
   *
   * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
   *
   * @return Whether the environment field is set.
   */
  @java.lang.Override
  public boolean hasEnvironment() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Environment that was started.
   * </pre>
   *
   * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
   *
   * @return The environment.
   */
  @java.lang.Override
  public com.google.cloud.shell.v1.Environment getEnvironment() {
    return environment_ == null
        ? com.google.cloud.shell.v1.Environment.getDefaultInstance()
        : environment_;
  }

  /**
   *
   *
   * <pre>
   * Environment that was started.
   * </pre>
   *
   * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.shell.v1.EnvironmentOrBuilder getEnvironmentOrBuilder() {
    return environment_ == null
        ? com.google.cloud.shell.v1.Environment.getDefaultInstance()
        : environment_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getEnvironment());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEnvironment());
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
    if (!(obj instanceof com.google.cloud.shell.v1.StartEnvironmentResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.shell.v1.StartEnvironmentResponse other =
        (com.google.cloud.shell.v1.StartEnvironmentResponse) obj;

    if (hasEnvironment() != other.hasEnvironment()) return false;
    if (hasEnvironment()) {
      if (!getEnvironment().equals(other.getEnvironment())) return false;
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
    if (hasEnvironment()) {
      hash = (37 * hash) + ENVIRONMENT_FIELD_NUMBER;
      hash = (53 * hash) + getEnvironment().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.shell.v1.StartEnvironmentResponse prototype) {
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
   * Message included in the response field of operations returned from
   * [StartEnvironment][google.cloud.shell.v1.CloudShellService.StartEnvironment]
   * once the operation is complete.
   * </pre>
   *
   * Protobuf type {@code google.cloud.shell.v1.StartEnvironmentResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.shell.v1.StartEnvironmentResponse)
      com.google.cloud.shell.v1.StartEnvironmentResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_StartEnvironmentResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_StartEnvironmentResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.shell.v1.StartEnvironmentResponse.class,
              com.google.cloud.shell.v1.StartEnvironmentResponse.Builder.class);
    }

    // Construct using com.google.cloud.shell.v1.StartEnvironmentResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEnvironmentFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.shell.v1.CloudShellProto
          .internal_static_google_cloud_shell_v1_StartEnvironmentResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.StartEnvironmentResponse getDefaultInstanceForType() {
      return com.google.cloud.shell.v1.StartEnvironmentResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.StartEnvironmentResponse build() {
      com.google.cloud.shell.v1.StartEnvironmentResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.shell.v1.StartEnvironmentResponse buildPartial() {
      com.google.cloud.shell.v1.StartEnvironmentResponse result =
          new com.google.cloud.shell.v1.StartEnvironmentResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.shell.v1.StartEnvironmentResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.environment_ =
            environmentBuilder_ == null ? environment_ : environmentBuilder_.build();
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
      if (other instanceof com.google.cloud.shell.v1.StartEnvironmentResponse) {
        return mergeFrom((com.google.cloud.shell.v1.StartEnvironmentResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.shell.v1.StartEnvironmentResponse other) {
      if (other == com.google.cloud.shell.v1.StartEnvironmentResponse.getDefaultInstance())
        return this;
      if (other.hasEnvironment()) {
        mergeEnvironment(other.getEnvironment());
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
                input.readMessage(getEnvironmentFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.shell.v1.Environment environment_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.shell.v1.Environment,
            com.google.cloud.shell.v1.Environment.Builder,
            com.google.cloud.shell.v1.EnvironmentOrBuilder>
        environmentBuilder_;

    /**
     *
     *
     * <pre>
     * Environment that was started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
     *
     * @return Whether the environment field is set.
     */
    public boolean hasEnvironment() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Environment that was started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
     *
     * @return The environment.
     */
    public com.google.cloud.shell.v1.Environment getEnvironment() {
      if (environmentBuilder_ == null) {
        return environment_ == null
            ? com.google.cloud.shell.v1.Environment.getDefaultInstance()
            : environment_;
      } else {
        return environmentBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Environment that was started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
     */
    public Builder setEnvironment(com.google.cloud.shell.v1.Environment value) {
      if (environmentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        environment_ = value;
      } else {
        environmentBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Environment that was started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
     */
    public Builder setEnvironment(com.google.cloud.shell.v1.Environment.Builder builderForValue) {
      if (environmentBuilder_ == null) {
        environment_ = builderForValue.build();
      } else {
        environmentBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Environment that was started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
     */
    public Builder mergeEnvironment(com.google.cloud.shell.v1.Environment value) {
      if (environmentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && environment_ != null
            && environment_ != com.google.cloud.shell.v1.Environment.getDefaultInstance()) {
          getEnvironmentBuilder().mergeFrom(value);
        } else {
          environment_ = value;
        }
      } else {
        environmentBuilder_.mergeFrom(value);
      }
      if (environment_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Environment that was started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
     */
    public Builder clearEnvironment() {
      bitField0_ = (bitField0_ & ~0x00000001);
      environment_ = null;
      if (environmentBuilder_ != null) {
        environmentBuilder_.dispose();
        environmentBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Environment that was started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
     */
    public com.google.cloud.shell.v1.Environment.Builder getEnvironmentBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEnvironmentFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Environment that was started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
     */
    public com.google.cloud.shell.v1.EnvironmentOrBuilder getEnvironmentOrBuilder() {
      if (environmentBuilder_ != null) {
        return environmentBuilder_.getMessageOrBuilder();
      } else {
        return environment_ == null
            ? com.google.cloud.shell.v1.Environment.getDefaultInstance()
            : environment_;
      }
    }

    /**
     *
     *
     * <pre>
     * Environment that was started.
     * </pre>
     *
     * <code>.google.cloud.shell.v1.Environment environment = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.shell.v1.Environment,
            com.google.cloud.shell.v1.Environment.Builder,
            com.google.cloud.shell.v1.EnvironmentOrBuilder>
        getEnvironmentFieldBuilder() {
      if (environmentBuilder_ == null) {
        environmentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.shell.v1.Environment,
                com.google.cloud.shell.v1.Environment.Builder,
                com.google.cloud.shell.v1.EnvironmentOrBuilder>(
                getEnvironment(), getParentForChildren(), isClean());
        environment_ = null;
      }
      return environmentBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.shell.v1.StartEnvironmentResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.shell.v1.StartEnvironmentResponse)
  private static final com.google.cloud.shell.v1.StartEnvironmentResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.shell.v1.StartEnvironmentResponse();
  }

  public static com.google.cloud.shell.v1.StartEnvironmentResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartEnvironmentResponse> PARSER =
      new com.google.protobuf.AbstractParser<StartEnvironmentResponse>() {
        @java.lang.Override
        public StartEnvironmentResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StartEnvironmentResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartEnvironmentResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.shell.v1.StartEnvironmentResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
