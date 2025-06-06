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
// source: google/chat/v1/reaction.proto

// Protobuf Java Version: 3.25.8
package com.google.chat.v1;

/**
 *
 *
 * <pre>
 * The number of people who reacted to a message with a specific emoji.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.EmojiReactionSummary}
 */
public final class EmojiReactionSummary extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.EmojiReactionSummary)
    EmojiReactionSummaryOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use EmojiReactionSummary.newBuilder() to construct.
  private EmojiReactionSummary(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EmojiReactionSummary() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EmojiReactionSummary();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.ReactionProto
        .internal_static_google_chat_v1_EmojiReactionSummary_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.ReactionProto
        .internal_static_google_chat_v1_EmojiReactionSummary_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.EmojiReactionSummary.class,
            com.google.chat.v1.EmojiReactionSummary.Builder.class);
  }

  private int bitField0_;
  public static final int EMOJI_FIELD_NUMBER = 1;
  private com.google.chat.v1.Emoji emoji_;

  /**
   *
   *
   * <pre>
   * Output only. Emoji associated with the reactions.
   * </pre>
   *
   * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the emoji field is set.
   */
  @java.lang.Override
  public boolean hasEmoji() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Output only. Emoji associated with the reactions.
   * </pre>
   *
   * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The emoji.
   */
  @java.lang.Override
  public com.google.chat.v1.Emoji getEmoji() {
    return emoji_ == null ? com.google.chat.v1.Emoji.getDefaultInstance() : emoji_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Emoji associated with the reactions.
   * </pre>
   *
   * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  @java.lang.Override
  public com.google.chat.v1.EmojiOrBuilder getEmojiOrBuilder() {
    return emoji_ == null ? com.google.chat.v1.Emoji.getDefaultInstance() : emoji_;
  }

  public static final int REACTION_COUNT_FIELD_NUMBER = 2;
  private int reactionCount_ = 0;

  /**
   *
   *
   * <pre>
   * Output only. The total number of reactions using the associated emoji.
   * </pre>
   *
   * <code>optional int32 reaction_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the reactionCount field is set.
   */
  @java.lang.Override
  public boolean hasReactionCount() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Output only. The total number of reactions using the associated emoji.
   * </pre>
   *
   * <code>optional int32 reaction_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The reactionCount.
   */
  @java.lang.Override
  public int getReactionCount() {
    return reactionCount_;
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
      output.writeMessage(1, getEmoji());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, reactionCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEmoji());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, reactionCount_);
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
    if (!(obj instanceof com.google.chat.v1.EmojiReactionSummary)) {
      return super.equals(obj);
    }
    com.google.chat.v1.EmojiReactionSummary other = (com.google.chat.v1.EmojiReactionSummary) obj;

    if (hasEmoji() != other.hasEmoji()) return false;
    if (hasEmoji()) {
      if (!getEmoji().equals(other.getEmoji())) return false;
    }
    if (hasReactionCount() != other.hasReactionCount()) return false;
    if (hasReactionCount()) {
      if (getReactionCount() != other.getReactionCount()) return false;
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
    if (hasEmoji()) {
      hash = (37 * hash) + EMOJI_FIELD_NUMBER;
      hash = (53 * hash) + getEmoji().hashCode();
    }
    if (hasReactionCount()) {
      hash = (37 * hash) + REACTION_COUNT_FIELD_NUMBER;
      hash = (53 * hash) + getReactionCount();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.EmojiReactionSummary parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.EmojiReactionSummary parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.EmojiReactionSummary prototype) {
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
   * The number of people who reacted to a message with a specific emoji.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.EmojiReactionSummary}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.EmojiReactionSummary)
      com.google.chat.v1.EmojiReactionSummaryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.ReactionProto
          .internal_static_google_chat_v1_EmojiReactionSummary_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.ReactionProto
          .internal_static_google_chat_v1_EmojiReactionSummary_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.EmojiReactionSummary.class,
              com.google.chat.v1.EmojiReactionSummary.Builder.class);
    }

    // Construct using com.google.chat.v1.EmojiReactionSummary.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEmojiFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      emoji_ = null;
      if (emojiBuilder_ != null) {
        emojiBuilder_.dispose();
        emojiBuilder_ = null;
      }
      reactionCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.ReactionProto
          .internal_static_google_chat_v1_EmojiReactionSummary_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.EmojiReactionSummary getDefaultInstanceForType() {
      return com.google.chat.v1.EmojiReactionSummary.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.EmojiReactionSummary build() {
      com.google.chat.v1.EmojiReactionSummary result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.EmojiReactionSummary buildPartial() {
      com.google.chat.v1.EmojiReactionSummary result =
          new com.google.chat.v1.EmojiReactionSummary(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.EmojiReactionSummary result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emoji_ = emojiBuilder_ == null ? emoji_ : emojiBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.reactionCount_ = reactionCount_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.chat.v1.EmojiReactionSummary) {
        return mergeFrom((com.google.chat.v1.EmojiReactionSummary) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.EmojiReactionSummary other) {
      if (other == com.google.chat.v1.EmojiReactionSummary.getDefaultInstance()) return this;
      if (other.hasEmoji()) {
        mergeEmoji(other.getEmoji());
      }
      if (other.hasReactionCount()) {
        setReactionCount(other.getReactionCount());
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
                input.readMessage(getEmojiFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                reactionCount_ = input.readInt32();
                bitField0_ |= 0x00000002;
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

    private com.google.chat.v1.Emoji emoji_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.Emoji,
            com.google.chat.v1.Emoji.Builder,
            com.google.chat.v1.EmojiOrBuilder>
        emojiBuilder_;

    /**
     *
     *
     * <pre>
     * Output only. Emoji associated with the reactions.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return Whether the emoji field is set.
     */
    public boolean hasEmoji() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Output only. Emoji associated with the reactions.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The emoji.
     */
    public com.google.chat.v1.Emoji getEmoji() {
      if (emojiBuilder_ == null) {
        return emoji_ == null ? com.google.chat.v1.Emoji.getDefaultInstance() : emoji_;
      } else {
        return emojiBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Emoji associated with the reactions.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setEmoji(com.google.chat.v1.Emoji value) {
      if (emojiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        emoji_ = value;
      } else {
        emojiBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Emoji associated with the reactions.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder setEmoji(com.google.chat.v1.Emoji.Builder builderForValue) {
      if (emojiBuilder_ == null) {
        emoji_ = builderForValue.build();
      } else {
        emojiBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Emoji associated with the reactions.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder mergeEmoji(com.google.chat.v1.Emoji value) {
      if (emojiBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && emoji_ != null
            && emoji_ != com.google.chat.v1.Emoji.getDefaultInstance()) {
          getEmojiBuilder().mergeFrom(value);
        } else {
          emoji_ = value;
        }
      } else {
        emojiBuilder_.mergeFrom(value);
      }
      if (emoji_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Emoji associated with the reactions.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public Builder clearEmoji() {
      bitField0_ = (bitField0_ & ~0x00000001);
      emoji_ = null;
      if (emojiBuilder_ != null) {
        emojiBuilder_.dispose();
        emojiBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Emoji associated with the reactions.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.chat.v1.Emoji.Builder getEmojiBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEmojiFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Output only. Emoji associated with the reactions.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    public com.google.chat.v1.EmojiOrBuilder getEmojiOrBuilder() {
      if (emojiBuilder_ != null) {
        return emojiBuilder_.getMessageOrBuilder();
      } else {
        return emoji_ == null ? com.google.chat.v1.Emoji.getDefaultInstance() : emoji_;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Emoji associated with the reactions.
     * </pre>
     *
     * <code>.google.chat.v1.Emoji emoji = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.Emoji,
            com.google.chat.v1.Emoji.Builder,
            com.google.chat.v1.EmojiOrBuilder>
        getEmojiFieldBuilder() {
      if (emojiBuilder_ == null) {
        emojiBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.chat.v1.Emoji,
                com.google.chat.v1.Emoji.Builder,
                com.google.chat.v1.EmojiOrBuilder>(getEmoji(), getParentForChildren(), isClean());
        emoji_ = null;
      }
      return emojiBuilder_;
    }

    private int reactionCount_;

    /**
     *
     *
     * <pre>
     * Output only. The total number of reactions using the associated emoji.
     * </pre>
     *
     * <code>optional int32 reaction_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return Whether the reactionCount field is set.
     */
    @java.lang.Override
    public boolean hasReactionCount() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Output only. The total number of reactions using the associated emoji.
     * </pre>
     *
     * <code>optional int32 reaction_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The reactionCount.
     */
    @java.lang.Override
    public int getReactionCount() {
      return reactionCount_;
    }

    /**
     *
     *
     * <pre>
     * Output only. The total number of reactions using the associated emoji.
     * </pre>
     *
     * <code>optional int32 reaction_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The reactionCount to set.
     * @return This builder for chaining.
     */
    public Builder setReactionCount(int value) {

      reactionCount_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. The total number of reactions using the associated emoji.
     * </pre>
     *
     * <code>optional int32 reaction_count = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReactionCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      reactionCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.EmojiReactionSummary)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.EmojiReactionSummary)
  private static final com.google.chat.v1.EmojiReactionSummary DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.EmojiReactionSummary();
  }

  public static com.google.chat.v1.EmojiReactionSummary getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EmojiReactionSummary> PARSER =
      new com.google.protobuf.AbstractParser<EmojiReactionSummary>() {
        @java.lang.Override
        public EmojiReactionSummary parsePartialFrom(
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

  public static com.google.protobuf.Parser<EmojiReactionSummary> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EmojiReactionSummary> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.EmojiReactionSummary getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
