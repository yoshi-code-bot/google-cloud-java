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
// source: google/chat/v1/event_payload.proto

// Protobuf Java Version: 3.25.8
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * Event payload for multiple new messages.
 *
 * Event type: `google.workspace.chat.message.v1.batchCreated`
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.MessageBatchCreatedEventData}
 */
public final class MessageBatchCreatedEventData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.MessageBatchCreatedEventData)
    MessageBatchCreatedEventDataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use MessageBatchCreatedEventData.newBuilder() to construct.
  private MessageBatchCreatedEventData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MessageBatchCreatedEventData() {
    messages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MessageBatchCreatedEventData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.EventPayloadProto
        .internal_static_google_chat_v1_MessageBatchCreatedEventData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.EventPayloadProto
        .internal_static_google_chat_v1_MessageBatchCreatedEventData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.MessageBatchCreatedEventData.class,
            com.google.chat.v1.MessageBatchCreatedEventData.Builder.class);
  }

  public static final int MESSAGES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.chat.v1.MessageCreatedEventData> messages_;

  /**
   *
   *
   * <pre>
   * A list of new messages.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.chat.v1.MessageCreatedEventData> getMessagesList() {
    return messages_;
  }

  /**
   *
   *
   * <pre>
   * A list of new messages.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.chat.v1.MessageCreatedEventDataOrBuilder>
      getMessagesOrBuilderList() {
    return messages_;
  }

  /**
   *
   *
   * <pre>
   * A list of new messages.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
   */
  @java.lang.Override
  public int getMessagesCount() {
    return messages_.size();
  }

  /**
   *
   *
   * <pre>
   * A list of new messages.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
   */
  @java.lang.Override
  public com.google.chat.v1.MessageCreatedEventData getMessages(int index) {
    return messages_.get(index);
  }

  /**
   *
   *
   * <pre>
   * A list of new messages.
   * </pre>
   *
   * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
   */
  @java.lang.Override
  public com.google.chat.v1.MessageCreatedEventDataOrBuilder getMessagesOrBuilder(int index) {
    return messages_.get(index);
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
    for (int i = 0; i < messages_.size(); i++) {
      output.writeMessage(1, messages_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < messages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, messages_.get(i));
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
    if (!(obj instanceof com.google.chat.v1.MessageBatchCreatedEventData)) {
      return super.equals(obj);
    }
    com.google.chat.v1.MessageBatchCreatedEventData other =
        (com.google.chat.v1.MessageBatchCreatedEventData) obj;

    if (!getMessagesList().equals(other.getMessagesList())) return false;
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
    if (getMessagesCount() > 0) {
      hash = (37 * hash) + MESSAGES_FIELD_NUMBER;
      hash = (53 * hash) + getMessagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.MessageBatchCreatedEventData prototype) {
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
   * Event payload for multiple new messages.
   *
   * Event type: `google.workspace.chat.message.v1.batchCreated`
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.MessageBatchCreatedEventData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.MessageBatchCreatedEventData)
      com.google.chat.v1.MessageBatchCreatedEventDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.EventPayloadProto
          .internal_static_google_chat_v1_MessageBatchCreatedEventData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.EventPayloadProto
          .internal_static_google_chat_v1_MessageBatchCreatedEventData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.MessageBatchCreatedEventData.class,
              com.google.chat.v1.MessageBatchCreatedEventData.Builder.class);
    }

    // Construct using com.google.chat.v1.MessageBatchCreatedEventData.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
      } else {
        messages_ = null;
        messagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.EventPayloadProto
          .internal_static_google_chat_v1_MessageBatchCreatedEventData_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.MessageBatchCreatedEventData getDefaultInstanceForType() {
      return com.google.chat.v1.MessageBatchCreatedEventData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.MessageBatchCreatedEventData build() {
      com.google.chat.v1.MessageBatchCreatedEventData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.MessageBatchCreatedEventData buildPartial() {
      com.google.chat.v1.MessageBatchCreatedEventData result =
          new com.google.chat.v1.MessageBatchCreatedEventData(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.chat.v1.MessageBatchCreatedEventData result) {
      if (messagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          messages_ = java.util.Collections.unmodifiableList(messages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.messages_ = messages_;
      } else {
        result.messages_ = messagesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.chat.v1.MessageBatchCreatedEventData result) {
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
      if (other instanceof com.google.chat.v1.MessageBatchCreatedEventData) {
        return mergeFrom((com.google.chat.v1.MessageBatchCreatedEventData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.MessageBatchCreatedEventData other) {
      if (other == com.google.chat.v1.MessageBatchCreatedEventData.getDefaultInstance())
        return this;
      if (messagesBuilder_ == null) {
        if (!other.messages_.isEmpty()) {
          if (messages_.isEmpty()) {
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMessagesIsMutable();
            messages_.addAll(other.messages_);
          }
          onChanged();
        }
      } else {
        if (!other.messages_.isEmpty()) {
          if (messagesBuilder_.isEmpty()) {
            messagesBuilder_.dispose();
            messagesBuilder_ = null;
            messages_ = other.messages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            messagesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMessagesFieldBuilder()
                    : null;
          } else {
            messagesBuilder_.addAllMessages(other.messages_);
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
                com.google.chat.v1.MessageCreatedEventData m =
                    input.readMessage(
                        com.google.chat.v1.MessageCreatedEventData.parser(), extensionRegistry);
                if (messagesBuilder_ == null) {
                  ensureMessagesIsMutable();
                  messages_.add(m);
                } else {
                  messagesBuilder_.addMessage(m);
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

    private java.util.List<com.google.chat.v1.MessageCreatedEventData> messages_ =
        java.util.Collections.emptyList();

    private void ensureMessagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        messages_ = new java.util.ArrayList<com.google.chat.v1.MessageCreatedEventData>(messages_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.chat.v1.MessageCreatedEventData,
            com.google.chat.v1.MessageCreatedEventData.Builder,
            com.google.chat.v1.MessageCreatedEventDataOrBuilder>
        messagesBuilder_;

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public java.util.List<com.google.chat.v1.MessageCreatedEventData> getMessagesList() {
      if (messagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(messages_);
      } else {
        return messagesBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public int getMessagesCount() {
      if (messagesBuilder_ == null) {
        return messages_.size();
      } else {
        return messagesBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public com.google.chat.v1.MessageCreatedEventData getMessages(int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public Builder setMessages(int index, com.google.chat.v1.MessageCreatedEventData value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.set(index, value);
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public Builder setMessages(
        int index, com.google.chat.v1.MessageCreatedEventData.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.set(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public Builder addMessages(com.google.chat.v1.MessageCreatedEventData value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public Builder addMessages(int index, com.google.chat.v1.MessageCreatedEventData value) {
      if (messagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMessagesIsMutable();
        messages_.add(index, value);
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public Builder addMessages(com.google.chat.v1.MessageCreatedEventData.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public Builder addMessages(
        int index, com.google.chat.v1.MessageCreatedEventData.Builder builderForValue) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.add(index, builderForValue.build());
        onChanged();
      } else {
        messagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public Builder addAllMessages(
        java.lang.Iterable<? extends com.google.chat.v1.MessageCreatedEventData> values) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, messages_);
        onChanged();
      } else {
        messagesBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public Builder clearMessages() {
      if (messagesBuilder_ == null) {
        messages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        messagesBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public Builder removeMessages(int index) {
      if (messagesBuilder_ == null) {
        ensureMessagesIsMutable();
        messages_.remove(index);
        onChanged();
      } else {
        messagesBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public com.google.chat.v1.MessageCreatedEventData.Builder getMessagesBuilder(int index) {
      return getMessagesFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public com.google.chat.v1.MessageCreatedEventDataOrBuilder getMessagesOrBuilder(int index) {
      if (messagesBuilder_ == null) {
        return messages_.get(index);
      } else {
        return messagesBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public java.util.List<? extends com.google.chat.v1.MessageCreatedEventDataOrBuilder>
        getMessagesOrBuilderList() {
      if (messagesBuilder_ != null) {
        return messagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(messages_);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public com.google.chat.v1.MessageCreatedEventData.Builder addMessagesBuilder() {
      return getMessagesFieldBuilder()
          .addBuilder(com.google.chat.v1.MessageCreatedEventData.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public com.google.chat.v1.MessageCreatedEventData.Builder addMessagesBuilder(int index) {
      return getMessagesFieldBuilder()
          .addBuilder(index, com.google.chat.v1.MessageCreatedEventData.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of new messages.
     * </pre>
     *
     * <code>repeated .google.chat.v1.MessageCreatedEventData messages = 1;</code>
     */
    public java.util.List<com.google.chat.v1.MessageCreatedEventData.Builder>
        getMessagesBuilderList() {
      return getMessagesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.chat.v1.MessageCreatedEventData,
            com.google.chat.v1.MessageCreatedEventData.Builder,
            com.google.chat.v1.MessageCreatedEventDataOrBuilder>
        getMessagesFieldBuilder() {
      if (messagesBuilder_ == null) {
        messagesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.chat.v1.MessageCreatedEventData,
                com.google.chat.v1.MessageCreatedEventData.Builder,
                com.google.chat.v1.MessageCreatedEventDataOrBuilder>(
                messages_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        messages_ = null;
      }
      return messagesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.MessageBatchCreatedEventData)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.MessageBatchCreatedEventData)
  private static final com.google.chat.v1.MessageBatchCreatedEventData DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.MessageBatchCreatedEventData();
  }

  public static com.google.chat.v1.MessageBatchCreatedEventData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MessageBatchCreatedEventData> PARSER =
      new com.google.protobuf.AbstractParser<MessageBatchCreatedEventData>() {
        @java.lang.Override
        public MessageBatchCreatedEventData parsePartialFrom(
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

  public static com.google.protobuf.Parser<MessageBatchCreatedEventData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MessageBatchCreatedEventData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.MessageBatchCreatedEventData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
