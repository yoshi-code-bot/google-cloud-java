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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.8
package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * AutopilotConversionStatus represents conversion status.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.AutopilotConversionStatus}
 */
public final class AutopilotConversionStatus extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.AutopilotConversionStatus)
    AutopilotConversionStatusOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AutopilotConversionStatus.newBuilder() to construct.
  private AutopilotConversionStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AutopilotConversionStatus() {
    state_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AutopilotConversionStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_AutopilotConversionStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_AutopilotConversionStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.AutopilotConversionStatus.class,
            com.google.container.v1beta1.AutopilotConversionStatus.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The current state of the conversion.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.AutopilotConversionStatus.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * STATE_UNSPECIFIED indicates the state is unspecified.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * DONE indicates the conversion has been completed. Old node pools will
     * continue being deleted in the background.
     * </pre>
     *
     * <code>DONE = 5;</code>
     */
    DONE(5),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * STATE_UNSPECIFIED indicates the state is unspecified.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * DONE indicates the conversion has been completed. Old node pools will
     * continue being deleted in the background.
     * </pre>
     *
     * <code>DONE = 5;</code>
     */
    public static final int DONE_VALUE = 5;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return STATE_UNSPECIFIED;
        case 5:
          return DONE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.container.v1beta1.AutopilotConversionStatus.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.AutopilotConversionStatus.State)
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. The current state of the conversion.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.AutopilotConversionStatus.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }

  /**
   *
   *
   * <pre>
   * Output only. The current state of the conversion.
   * </pre>
   *
   * <code>
   * .google.container.v1beta1.AutopilotConversionStatus.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.container.v1beta1.AutopilotConversionStatus.State getState() {
    com.google.container.v1beta1.AutopilotConversionStatus.State result =
        com.google.container.v1beta1.AutopilotConversionStatus.State.forNumber(state_);
    return result == null
        ? com.google.container.v1beta1.AutopilotConversionStatus.State.UNRECOGNIZED
        : result;
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
    if (state_
        != com.google.container.v1beta1.AutopilotConversionStatus.State.STATE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, state_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (state_
        != com.google.container.v1beta1.AutopilotConversionStatus.State.STATE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, state_);
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
    if (!(obj instanceof com.google.container.v1beta1.AutopilotConversionStatus)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.AutopilotConversionStatus other =
        (com.google.container.v1beta1.AutopilotConversionStatus) obj;

    if (state_ != other.state_) return false;
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
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus parseFrom(
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
      com.google.container.v1beta1.AutopilotConversionStatus prototype) {
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
   * AutopilotConversionStatus represents conversion status.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.AutopilotConversionStatus}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.AutopilotConversionStatus)
      com.google.container.v1beta1.AutopilotConversionStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_AutopilotConversionStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_AutopilotConversionStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.AutopilotConversionStatus.class,
              com.google.container.v1beta1.AutopilotConversionStatus.Builder.class);
    }

    // Construct using com.google.container.v1beta1.AutopilotConversionStatus.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      state_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_AutopilotConversionStatus_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.AutopilotConversionStatus getDefaultInstanceForType() {
      return com.google.container.v1beta1.AutopilotConversionStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.AutopilotConversionStatus build() {
      com.google.container.v1beta1.AutopilotConversionStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.AutopilotConversionStatus buildPartial() {
      com.google.container.v1beta1.AutopilotConversionStatus result =
          new com.google.container.v1beta1.AutopilotConversionStatus(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.AutopilotConversionStatus result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.state_ = state_;
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
      if (other instanceof com.google.container.v1beta1.AutopilotConversionStatus) {
        return mergeFrom((com.google.container.v1beta1.AutopilotConversionStatus) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.AutopilotConversionStatus other) {
      if (other == com.google.container.v1beta1.AutopilotConversionStatus.getDefaultInstance())
        return this;
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
            case 16:
              {
                state_ = input.readEnum();
                bitField0_ |= 0x00000001;
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

    private int bitField0_;

    private int state_ = 0;

    /**
     *
     *
     * <pre>
     * Output only. The current state of the conversion.
     * </pre>
     *
     * <code>
     * .google.container.v1beta1.AutopilotConversionStatus.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }

    /**
     *
     *
     * <pre>
     * Output only. The current state of the conversion.
     * </pre>
     *
     * <code>
     * .google.container.v1beta1.AutopilotConversionStatus.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The current state of the conversion.
     * </pre>
     *
     * <code>
     * .google.container.v1beta1.AutopilotConversionStatus.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.container.v1beta1.AutopilotConversionStatus.State getState() {
      com.google.container.v1beta1.AutopilotConversionStatus.State result =
          com.google.container.v1beta1.AutopilotConversionStatus.State.forNumber(state_);
      return result == null
          ? com.google.container.v1beta1.AutopilotConversionStatus.State.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Output only. The current state of the conversion.
     * </pre>
     *
     * <code>
     * .google.container.v1beta1.AutopilotConversionStatus.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.container.v1beta1.AutopilotConversionStatus.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      state_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The current state of the conversion.
     * </pre>
     *
     * <code>
     * .google.container.v1beta1.AutopilotConversionStatus.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000001);
      state_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.AutopilotConversionStatus)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.AutopilotConversionStatus)
  private static final com.google.container.v1beta1.AutopilotConversionStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.AutopilotConversionStatus();
  }

  public static com.google.container.v1beta1.AutopilotConversionStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AutopilotConversionStatus> PARSER =
      new com.google.protobuf.AbstractParser<AutopilotConversionStatus>() {
        @java.lang.Override
        public AutopilotConversionStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<AutopilotConversionStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AutopilotConversionStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.AutopilotConversionStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
