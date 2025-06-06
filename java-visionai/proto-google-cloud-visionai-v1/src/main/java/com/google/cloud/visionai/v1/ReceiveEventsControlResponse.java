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
// source: google/cloud/visionai/v1/streaming_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Control message for a ReceiveEventsResponse.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.ReceiveEventsControlResponse}
 */
public final class ReceiveEventsControlResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.ReceiveEventsControlResponse)
    ReceiveEventsControlResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ReceiveEventsControlResponse.newBuilder() to construct.
  private ReceiveEventsControlResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReceiveEventsControlResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReceiveEventsControlResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.StreamingServiceProto
        .internal_static_google_cloud_visionai_v1_ReceiveEventsControlResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.StreamingServiceProto
        .internal_static_google_cloud_visionai_v1_ReceiveEventsControlResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.ReceiveEventsControlResponse.class,
            com.google.cloud.visionai.v1.ReceiveEventsControlResponse.Builder.class);
  }

  private int controlCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object control_;

  public enum ControlCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    HEARTBEAT(1),
    WRITES_DONE_REQUEST(2),
    CONTROL_NOT_SET(0);
    private final int value;

    private ControlCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ControlCase valueOf(int value) {
      return forNumber(value);
    }

    public static ControlCase forNumber(int value) {
      switch (value) {
        case 1:
          return HEARTBEAT;
        case 2:
          return WRITES_DONE_REQUEST;
        case 0:
          return CONTROL_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ControlCase getControlCase() {
    return ControlCase.forNumber(controlCase_);
  }

  public static final int HEARTBEAT_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * A server heartbeat.
   * </pre>
   *
   * <code>bool heartbeat = 1;</code>
   *
   * @return Whether the heartbeat field is set.
   */
  @java.lang.Override
  public boolean hasHeartbeat() {
    return controlCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * A server heartbeat.
   * </pre>
   *
   * <code>bool heartbeat = 1;</code>
   *
   * @return The heartbeat.
   */
  @java.lang.Override
  public boolean getHeartbeat() {
    if (controlCase_ == 1) {
      return (java.lang.Boolean) control_;
    }
    return false;
  }

  public static final int WRITES_DONE_REQUEST_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * A request to the receiver to complete any final writes followed by a
   * `WritesDone`; e.g. issue any final `CommitRequest`s.
   *
   * May be ignored if `WritesDone` has already been issued at any point
   * prior to receiving this message.
   *
   * If `WritesDone` does not get issued, then the server will forcefully
   * cancel the connection, and the receiver will likely receive an
   * uninformative after `Read` returns `false` and `Finish` is called.
   * </pre>
   *
   * <code>bool writes_done_request = 2;</code>
   *
   * @return Whether the writesDoneRequest field is set.
   */
  @java.lang.Override
  public boolean hasWritesDoneRequest() {
    return controlCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * A request to the receiver to complete any final writes followed by a
   * `WritesDone`; e.g. issue any final `CommitRequest`s.
   *
   * May be ignored if `WritesDone` has already been issued at any point
   * prior to receiving this message.
   *
   * If `WritesDone` does not get issued, then the server will forcefully
   * cancel the connection, and the receiver will likely receive an
   * uninformative after `Read` returns `false` and `Finish` is called.
   * </pre>
   *
   * <code>bool writes_done_request = 2;</code>
   *
   * @return The writesDoneRequest.
   */
  @java.lang.Override
  public boolean getWritesDoneRequest() {
    if (controlCase_ == 2) {
      return (java.lang.Boolean) control_;
    }
    return false;
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
    if (controlCase_ == 1) {
      output.writeBool(1, (boolean) ((java.lang.Boolean) control_));
    }
    if (controlCase_ == 2) {
      output.writeBool(2, (boolean) ((java.lang.Boolean) control_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (controlCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              1, (boolean) ((java.lang.Boolean) control_));
    }
    if (controlCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(
              2, (boolean) ((java.lang.Boolean) control_));
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
    if (!(obj instanceof com.google.cloud.visionai.v1.ReceiveEventsControlResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.ReceiveEventsControlResponse other =
        (com.google.cloud.visionai.v1.ReceiveEventsControlResponse) obj;

    if (!getControlCase().equals(other.getControlCase())) return false;
    switch (controlCase_) {
      case 1:
        if (getHeartbeat() != other.getHeartbeat()) return false;
        break;
      case 2:
        if (getWritesDoneRequest() != other.getWritesDoneRequest()) return false;
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
    switch (controlCase_) {
      case 1:
        hash = (37 * hash) + HEARTBEAT_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getHeartbeat());
        break;
      case 2:
        hash = (37 * hash) + WRITES_DONE_REQUEST_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getWritesDoneRequest());
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse parseFrom(
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
      com.google.cloud.visionai.v1.ReceiveEventsControlResponse prototype) {
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
   * Control message for a ReceiveEventsResponse.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.ReceiveEventsControlResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.ReceiveEventsControlResponse)
      com.google.cloud.visionai.v1.ReceiveEventsControlResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.StreamingServiceProto
          .internal_static_google_cloud_visionai_v1_ReceiveEventsControlResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.StreamingServiceProto
          .internal_static_google_cloud_visionai_v1_ReceiveEventsControlResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.ReceiveEventsControlResponse.class,
              com.google.cloud.visionai.v1.ReceiveEventsControlResponse.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.ReceiveEventsControlResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      controlCase_ = 0;
      control_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.StreamingServiceProto
          .internal_static_google_cloud_visionai_v1_ReceiveEventsControlResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ReceiveEventsControlResponse getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.ReceiveEventsControlResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ReceiveEventsControlResponse build() {
      com.google.cloud.visionai.v1.ReceiveEventsControlResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ReceiveEventsControlResponse buildPartial() {
      com.google.cloud.visionai.v1.ReceiveEventsControlResponse result =
          new com.google.cloud.visionai.v1.ReceiveEventsControlResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.visionai.v1.ReceiveEventsControlResponse result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(
        com.google.cloud.visionai.v1.ReceiveEventsControlResponse result) {
      result.controlCase_ = controlCase_;
      result.control_ = this.control_;
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
      if (other instanceof com.google.cloud.visionai.v1.ReceiveEventsControlResponse) {
        return mergeFrom((com.google.cloud.visionai.v1.ReceiveEventsControlResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.ReceiveEventsControlResponse other) {
      if (other == com.google.cloud.visionai.v1.ReceiveEventsControlResponse.getDefaultInstance())
        return this;
      switch (other.getControlCase()) {
        case HEARTBEAT:
          {
            setHeartbeat(other.getHeartbeat());
            break;
          }
        case WRITES_DONE_REQUEST:
          {
            setWritesDoneRequest(other.getWritesDoneRequest());
            break;
          }
        case CONTROL_NOT_SET:
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
            case 8:
              {
                control_ = input.readBool();
                controlCase_ = 1;
                break;
              } // case 8
            case 16:
              {
                control_ = input.readBool();
                controlCase_ = 2;
                break;
              } // case 16
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

    private int controlCase_ = 0;
    private java.lang.Object control_;

    public ControlCase getControlCase() {
      return ControlCase.forNumber(controlCase_);
    }

    public Builder clearControl() {
      controlCase_ = 0;
      control_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * A server heartbeat.
     * </pre>
     *
     * <code>bool heartbeat = 1;</code>
     *
     * @return Whether the heartbeat field is set.
     */
    public boolean hasHeartbeat() {
      return controlCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * A server heartbeat.
     * </pre>
     *
     * <code>bool heartbeat = 1;</code>
     *
     * @return The heartbeat.
     */
    public boolean getHeartbeat() {
      if (controlCase_ == 1) {
        return (java.lang.Boolean) control_;
      }
      return false;
    }

    /**
     *
     *
     * <pre>
     * A server heartbeat.
     * </pre>
     *
     * <code>bool heartbeat = 1;</code>
     *
     * @param value The heartbeat to set.
     * @return This builder for chaining.
     */
    public Builder setHeartbeat(boolean value) {

      controlCase_ = 1;
      control_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A server heartbeat.
     * </pre>
     *
     * <code>bool heartbeat = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHeartbeat() {
      if (controlCase_ == 1) {
        controlCase_ = 0;
        control_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A request to the receiver to complete any final writes followed by a
     * `WritesDone`; e.g. issue any final `CommitRequest`s.
     *
     * May be ignored if `WritesDone` has already been issued at any point
     * prior to receiving this message.
     *
     * If `WritesDone` does not get issued, then the server will forcefully
     * cancel the connection, and the receiver will likely receive an
     * uninformative after `Read` returns `false` and `Finish` is called.
     * </pre>
     *
     * <code>bool writes_done_request = 2;</code>
     *
     * @return Whether the writesDoneRequest field is set.
     */
    public boolean hasWritesDoneRequest() {
      return controlCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * A request to the receiver to complete any final writes followed by a
     * `WritesDone`; e.g. issue any final `CommitRequest`s.
     *
     * May be ignored if `WritesDone` has already been issued at any point
     * prior to receiving this message.
     *
     * If `WritesDone` does not get issued, then the server will forcefully
     * cancel the connection, and the receiver will likely receive an
     * uninformative after `Read` returns `false` and `Finish` is called.
     * </pre>
     *
     * <code>bool writes_done_request = 2;</code>
     *
     * @return The writesDoneRequest.
     */
    public boolean getWritesDoneRequest() {
      if (controlCase_ == 2) {
        return (java.lang.Boolean) control_;
      }
      return false;
    }

    /**
     *
     *
     * <pre>
     * A request to the receiver to complete any final writes followed by a
     * `WritesDone`; e.g. issue any final `CommitRequest`s.
     *
     * May be ignored if `WritesDone` has already been issued at any point
     * prior to receiving this message.
     *
     * If `WritesDone` does not get issued, then the server will forcefully
     * cancel the connection, and the receiver will likely receive an
     * uninformative after `Read` returns `false` and `Finish` is called.
     * </pre>
     *
     * <code>bool writes_done_request = 2;</code>
     *
     * @param value The writesDoneRequest to set.
     * @return This builder for chaining.
     */
    public Builder setWritesDoneRequest(boolean value) {

      controlCase_ = 2;
      control_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A request to the receiver to complete any final writes followed by a
     * `WritesDone`; e.g. issue any final `CommitRequest`s.
     *
     * May be ignored if `WritesDone` has already been issued at any point
     * prior to receiving this message.
     *
     * If `WritesDone` does not get issued, then the server will forcefully
     * cancel the connection, and the receiver will likely receive an
     * uninformative after `Read` returns `false` and `Finish` is called.
     * </pre>
     *
     * <code>bool writes_done_request = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWritesDoneRequest() {
      if (controlCase_ == 2) {
        controlCase_ = 0;
        control_ = null;
        onChanged();
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.ReceiveEventsControlResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.ReceiveEventsControlResponse)
  private static final com.google.cloud.visionai.v1.ReceiveEventsControlResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.ReceiveEventsControlResponse();
  }

  public static com.google.cloud.visionai.v1.ReceiveEventsControlResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReceiveEventsControlResponse> PARSER =
      new com.google.protobuf.AbstractParser<ReceiveEventsControlResponse>() {
        @java.lang.Override
        public ReceiveEventsControlResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReceiveEventsControlResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReceiveEventsControlResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.ReceiveEventsControlResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
