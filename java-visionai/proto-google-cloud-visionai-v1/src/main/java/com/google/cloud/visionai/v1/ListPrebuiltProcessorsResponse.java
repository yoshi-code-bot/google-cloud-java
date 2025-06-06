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
// source: google/cloud/visionai/v1/platform.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

/**
 *
 *
 * <pre>
 * Response Message for listing Prebuilt Processors.
 * </pre>
 *
 * Protobuf type {@code google.cloud.visionai.v1.ListPrebuiltProcessorsResponse}
 */
public final class ListPrebuiltProcessorsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.visionai.v1.ListPrebuiltProcessorsResponse)
    ListPrebuiltProcessorsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListPrebuiltProcessorsResponse.newBuilder() to construct.
  private ListPrebuiltProcessorsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListPrebuiltProcessorsResponse() {
    processors_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListPrebuiltProcessorsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.visionai.v1.PlatformProto
        .internal_static_google_cloud_visionai_v1_ListPrebuiltProcessorsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.visionai.v1.PlatformProto
        .internal_static_google_cloud_visionai_v1_ListPrebuiltProcessorsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse.class,
            com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse.Builder.class);
  }

  public static final int PROCESSORS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.visionai.v1.Processor> processors_;

  /**
   *
   *
   * <pre>
   * The list of Processor.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.visionai.v1.Processor> getProcessorsList() {
    return processors_;
  }

  /**
   *
   *
   * <pre>
   * The list of Processor.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.visionai.v1.ProcessorOrBuilder>
      getProcessorsOrBuilderList() {
    return processors_;
  }

  /**
   *
   *
   * <pre>
   * The list of Processor.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
   */
  @java.lang.Override
  public int getProcessorsCount() {
    return processors_.size();
  }

  /**
   *
   *
   * <pre>
   * The list of Processor.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.Processor getProcessors(int index) {
    return processors_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The list of Processor.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.visionai.v1.ProcessorOrBuilder getProcessorsOrBuilder(int index) {
    return processors_.get(index);
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
    for (int i = 0; i < processors_.size(); i++) {
      output.writeMessage(1, processors_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < processors_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, processors_.get(i));
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
    if (!(obj instanceof com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse other =
        (com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse) obj;

    if (!getProcessorsList().equals(other.getProcessorsList())) return false;
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
    if (getProcessorsCount() > 0) {
      hash = (37 * hash) + PROCESSORS_FIELD_NUMBER;
      hash = (53 * hash) + getProcessorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse parseFrom(
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
      com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse prototype) {
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
   * Response Message for listing Prebuilt Processors.
   * </pre>
   *
   * Protobuf type {@code google.cloud.visionai.v1.ListPrebuiltProcessorsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.visionai.v1.ListPrebuiltProcessorsResponse)
      com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.visionai.v1.PlatformProto
          .internal_static_google_cloud_visionai_v1_ListPrebuiltProcessorsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.visionai.v1.PlatformProto
          .internal_static_google_cloud_visionai_v1_ListPrebuiltProcessorsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse.class,
              com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse.Builder.class);
    }

    // Construct using com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (processorsBuilder_ == null) {
        processors_ = java.util.Collections.emptyList();
      } else {
        processors_ = null;
        processorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.visionai.v1.PlatformProto
          .internal_static_google_cloud_visionai_v1_ListPrebuiltProcessorsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse getDefaultInstanceForType() {
      return com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse build() {
      com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse buildPartial() {
      com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse result =
          new com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse result) {
      if (processorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          processors_ = java.util.Collections.unmodifiableList(processors_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.processors_ = processors_;
      } else {
        result.processors_ = processorsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse result) {
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
      if (other instanceof com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse) {
        return mergeFrom((com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse other) {
      if (other == com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse.getDefaultInstance())
        return this;
      if (processorsBuilder_ == null) {
        if (!other.processors_.isEmpty()) {
          if (processors_.isEmpty()) {
            processors_ = other.processors_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureProcessorsIsMutable();
            processors_.addAll(other.processors_);
          }
          onChanged();
        }
      } else {
        if (!other.processors_.isEmpty()) {
          if (processorsBuilder_.isEmpty()) {
            processorsBuilder_.dispose();
            processorsBuilder_ = null;
            processors_ = other.processors_;
            bitField0_ = (bitField0_ & ~0x00000001);
            processorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getProcessorsFieldBuilder()
                    : null;
          } else {
            processorsBuilder_.addAllMessages(other.processors_);
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
            case 10:
              {
                com.google.cloud.visionai.v1.Processor m =
                    input.readMessage(
                        com.google.cloud.visionai.v1.Processor.parser(), extensionRegistry);
                if (processorsBuilder_ == null) {
                  ensureProcessorsIsMutable();
                  processors_.add(m);
                } else {
                  processorsBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.visionai.v1.Processor> processors_ =
        java.util.Collections.emptyList();

    private void ensureProcessorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        processors_ = new java.util.ArrayList<com.google.cloud.visionai.v1.Processor>(processors_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.visionai.v1.Processor,
            com.google.cloud.visionai.v1.Processor.Builder,
            com.google.cloud.visionai.v1.ProcessorOrBuilder>
        processorsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1.Processor> getProcessorsList() {
      if (processorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(processors_);
      } else {
        return processorsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public int getProcessorsCount() {
      if (processorsBuilder_ == null) {
        return processors_.size();
      } else {
        return processorsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public com.google.cloud.visionai.v1.Processor getProcessors(int index) {
      if (processorsBuilder_ == null) {
        return processors_.get(index);
      } else {
        return processorsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public Builder setProcessors(int index, com.google.cloud.visionai.v1.Processor value) {
      if (processorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorsIsMutable();
        processors_.set(index, value);
        onChanged();
      } else {
        processorsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public Builder setProcessors(
        int index, com.google.cloud.visionai.v1.Processor.Builder builderForValue) {
      if (processorsBuilder_ == null) {
        ensureProcessorsIsMutable();
        processors_.set(index, builderForValue.build());
        onChanged();
      } else {
        processorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public Builder addProcessors(com.google.cloud.visionai.v1.Processor value) {
      if (processorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorsIsMutable();
        processors_.add(value);
        onChanged();
      } else {
        processorsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public Builder addProcessors(int index, com.google.cloud.visionai.v1.Processor value) {
      if (processorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureProcessorsIsMutable();
        processors_.add(index, value);
        onChanged();
      } else {
        processorsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public Builder addProcessors(com.google.cloud.visionai.v1.Processor.Builder builderForValue) {
      if (processorsBuilder_ == null) {
        ensureProcessorsIsMutable();
        processors_.add(builderForValue.build());
        onChanged();
      } else {
        processorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public Builder addProcessors(
        int index, com.google.cloud.visionai.v1.Processor.Builder builderForValue) {
      if (processorsBuilder_ == null) {
        ensureProcessorsIsMutable();
        processors_.add(index, builderForValue.build());
        onChanged();
      } else {
        processorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public Builder addAllProcessors(
        java.lang.Iterable<? extends com.google.cloud.visionai.v1.Processor> values) {
      if (processorsBuilder_ == null) {
        ensureProcessorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, processors_);
        onChanged();
      } else {
        processorsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public Builder clearProcessors() {
      if (processorsBuilder_ == null) {
        processors_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        processorsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public Builder removeProcessors(int index) {
      if (processorsBuilder_ == null) {
        ensureProcessorsIsMutable();
        processors_.remove(index);
        onChanged();
      } else {
        processorsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public com.google.cloud.visionai.v1.Processor.Builder getProcessorsBuilder(int index) {
      return getProcessorsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public com.google.cloud.visionai.v1.ProcessorOrBuilder getProcessorsOrBuilder(int index) {
      if (processorsBuilder_ == null) {
        return processors_.get(index);
      } else {
        return processorsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.visionai.v1.ProcessorOrBuilder>
        getProcessorsOrBuilderList() {
      if (processorsBuilder_ != null) {
        return processorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(processors_);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public com.google.cloud.visionai.v1.Processor.Builder addProcessorsBuilder() {
      return getProcessorsFieldBuilder()
          .addBuilder(com.google.cloud.visionai.v1.Processor.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public com.google.cloud.visionai.v1.Processor.Builder addProcessorsBuilder(int index) {
      return getProcessorsFieldBuilder()
          .addBuilder(index, com.google.cloud.visionai.v1.Processor.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of Processor.
     * </pre>
     *
     * <code>repeated .google.cloud.visionai.v1.Processor processors = 1;</code>
     */
    public java.util.List<com.google.cloud.visionai.v1.Processor.Builder>
        getProcessorsBuilderList() {
      return getProcessorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.visionai.v1.Processor,
            com.google.cloud.visionai.v1.Processor.Builder,
            com.google.cloud.visionai.v1.ProcessorOrBuilder>
        getProcessorsFieldBuilder() {
      if (processorsBuilder_ == null) {
        processorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.visionai.v1.Processor,
                com.google.cloud.visionai.v1.Processor.Builder,
                com.google.cloud.visionai.v1.ProcessorOrBuilder>(
                processors_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        processors_ = null;
      }
      return processorsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.visionai.v1.ListPrebuiltProcessorsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.visionai.v1.ListPrebuiltProcessorsResponse)
  private static final com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse();
  }

  public static com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListPrebuiltProcessorsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListPrebuiltProcessorsResponse>() {
        @java.lang.Override
        public ListPrebuiltProcessorsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListPrebuiltProcessorsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListPrebuiltProcessorsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.visionai.v1.ListPrebuiltProcessorsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
