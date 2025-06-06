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
 * An emoji that is used as a reaction to a message.
 * </pre>
 *
 * Protobuf type {@code google.chat.v1.Emoji}
 */
public final class Emoji extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.chat.v1.Emoji)
    EmojiOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Emoji.newBuilder() to construct.
  private Emoji(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Emoji() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Emoji();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.chat.v1.ReactionProto.internal_static_google_chat_v1_Emoji_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.chat.v1.ReactionProto.internal_static_google_chat_v1_Emoji_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.chat.v1.Emoji.class, com.google.chat.v1.Emoji.Builder.class);
  }

  private int contentCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object content_;

  public enum ContentCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    UNICODE(1),
    CUSTOM_EMOJI(2),
    CONTENT_NOT_SET(0);
    private final int value;

    private ContentCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ContentCase valueOf(int value) {
      return forNumber(value);
    }

    public static ContentCase forNumber(int value) {
      switch (value) {
        case 1:
          return UNICODE;
        case 2:
          return CUSTOM_EMOJI;
        case 0:
          return CONTENT_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ContentCase getContentCase() {
    return ContentCase.forNumber(contentCase_);
  }

  public static final int UNICODE_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * Optional. A basic emoji represented by a unicode string.
   * </pre>
   *
   * <code>string unicode = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the unicode field is set.
   */
  public boolean hasUnicode() {
    return contentCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * Optional. A basic emoji represented by a unicode string.
   * </pre>
   *
   * <code>string unicode = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The unicode.
   */
  public java.lang.String getUnicode() {
    java.lang.Object ref = "";
    if (contentCase_ == 1) {
      ref = content_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (contentCase_ == 1) {
        content_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. A basic emoji represented by a unicode string.
   * </pre>
   *
   * <code>string unicode = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for unicode.
   */
  public com.google.protobuf.ByteString getUnicodeBytes() {
    java.lang.Object ref = "";
    if (contentCase_ == 1) {
      ref = content_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (contentCase_ == 1) {
        content_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CUSTOM_EMOJI_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * A custom emoji.
   * </pre>
   *
   * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
   *
   * @return Whether the customEmoji field is set.
   */
  @java.lang.Override
  public boolean hasCustomEmoji() {
    return contentCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * A custom emoji.
   * </pre>
   *
   * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
   *
   * @return The customEmoji.
   */
  @java.lang.Override
  public com.google.chat.v1.CustomEmoji getCustomEmoji() {
    if (contentCase_ == 2) {
      return (com.google.chat.v1.CustomEmoji) content_;
    }
    return com.google.chat.v1.CustomEmoji.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * A custom emoji.
   * </pre>
   *
   * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
   */
  @java.lang.Override
  public com.google.chat.v1.CustomEmojiOrBuilder getCustomEmojiOrBuilder() {
    if (contentCase_ == 2) {
      return (com.google.chat.v1.CustomEmoji) content_;
    }
    return com.google.chat.v1.CustomEmoji.getDefaultInstance();
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
    if (contentCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, content_);
    }
    if (contentCase_ == 2) {
      output.writeMessage(2, (com.google.chat.v1.CustomEmoji) content_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (contentCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, content_);
    }
    if (contentCase_ == 2) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, (com.google.chat.v1.CustomEmoji) content_);
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
    if (!(obj instanceof com.google.chat.v1.Emoji)) {
      return super.equals(obj);
    }
    com.google.chat.v1.Emoji other = (com.google.chat.v1.Emoji) obj;

    if (!getContentCase().equals(other.getContentCase())) return false;
    switch (contentCase_) {
      case 1:
        if (!getUnicode().equals(other.getUnicode())) return false;
        break;
      case 2:
        if (!getCustomEmoji().equals(other.getCustomEmoji())) return false;
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
    switch (contentCase_) {
      case 1:
        hash = (37 * hash) + UNICODE_FIELD_NUMBER;
        hash = (53 * hash) + getUnicode().hashCode();
        break;
      case 2:
        hash = (37 * hash) + CUSTOM_EMOJI_FIELD_NUMBER;
        hash = (53 * hash) + getCustomEmoji().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.chat.v1.Emoji parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Emoji parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Emoji parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Emoji parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Emoji parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.chat.v1.Emoji parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.chat.v1.Emoji parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Emoji parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.Emoji parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Emoji parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.chat.v1.Emoji parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.chat.v1.Emoji parseFrom(
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

  public static Builder newBuilder(com.google.chat.v1.Emoji prototype) {
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
   * An emoji that is used as a reaction to a message.
   * </pre>
   *
   * Protobuf type {@code google.chat.v1.Emoji}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.chat.v1.Emoji)
      com.google.chat.v1.EmojiOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.chat.v1.ReactionProto.internal_static_google_chat_v1_Emoji_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.chat.v1.ReactionProto
          .internal_static_google_chat_v1_Emoji_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.chat.v1.Emoji.class, com.google.chat.v1.Emoji.Builder.class);
    }

    // Construct using com.google.chat.v1.Emoji.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (customEmojiBuilder_ != null) {
        customEmojiBuilder_.clear();
      }
      contentCase_ = 0;
      content_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.chat.v1.ReactionProto.internal_static_google_chat_v1_Emoji_descriptor;
    }

    @java.lang.Override
    public com.google.chat.v1.Emoji getDefaultInstanceForType() {
      return com.google.chat.v1.Emoji.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.chat.v1.Emoji build() {
      com.google.chat.v1.Emoji result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.chat.v1.Emoji buildPartial() {
      com.google.chat.v1.Emoji result = new com.google.chat.v1.Emoji(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.chat.v1.Emoji result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(com.google.chat.v1.Emoji result) {
      result.contentCase_ = contentCase_;
      result.content_ = this.content_;
      if (contentCase_ == 2 && customEmojiBuilder_ != null) {
        result.content_ = customEmojiBuilder_.build();
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
      if (other instanceof com.google.chat.v1.Emoji) {
        return mergeFrom((com.google.chat.v1.Emoji) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.chat.v1.Emoji other) {
      if (other == com.google.chat.v1.Emoji.getDefaultInstance()) return this;
      switch (other.getContentCase()) {
        case UNICODE:
          {
            contentCase_ = 1;
            content_ = other.content_;
            onChanged();
            break;
          }
        case CUSTOM_EMOJI:
          {
            mergeCustomEmoji(other.getCustomEmoji());
            break;
          }
        case CONTENT_NOT_SET:
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                contentCase_ = 1;
                content_ = s;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getCustomEmojiFieldBuilder().getBuilder(), extensionRegistry);
                contentCase_ = 2;
                break;
              } // case 18
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

    private int contentCase_ = 0;
    private java.lang.Object content_;

    public ContentCase getContentCase() {
      return ContentCase.forNumber(contentCase_);
    }

    public Builder clearContent() {
      contentCase_ = 0;
      content_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * Optional. A basic emoji represented by a unicode string.
     * </pre>
     *
     * <code>string unicode = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the unicode field is set.
     */
    @java.lang.Override
    public boolean hasUnicode() {
      return contentCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * Optional. A basic emoji represented by a unicode string.
     * </pre>
     *
     * <code>string unicode = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The unicode.
     */
    @java.lang.Override
    public java.lang.String getUnicode() {
      java.lang.Object ref = "";
      if (contentCase_ == 1) {
        ref = content_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (contentCase_ == 1) {
          content_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. A basic emoji represented by a unicode string.
     * </pre>
     *
     * <code>string unicode = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for unicode.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getUnicodeBytes() {
      java.lang.Object ref = "";
      if (contentCase_ == 1) {
        ref = content_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (contentCase_ == 1) {
          content_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. A basic emoji represented by a unicode string.
     * </pre>
     *
     * <code>string unicode = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The unicode to set.
     * @return This builder for chaining.
     */
    public Builder setUnicode(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      contentCase_ = 1;
      content_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A basic emoji represented by a unicode string.
     * </pre>
     *
     * <code>string unicode = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUnicode() {
      if (contentCase_ == 1) {
        contentCase_ = 0;
        content_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. A basic emoji represented by a unicode string.
     * </pre>
     *
     * <code>string unicode = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for unicode to set.
     * @return This builder for chaining.
     */
    public Builder setUnicodeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      contentCase_ = 1;
      content_ = value;
      onChanged();
      return this;
    }

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.CustomEmoji,
            com.google.chat.v1.CustomEmoji.Builder,
            com.google.chat.v1.CustomEmojiOrBuilder>
        customEmojiBuilder_;

    /**
     *
     *
     * <pre>
     * A custom emoji.
     * </pre>
     *
     * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
     *
     * @return Whether the customEmoji field is set.
     */
    @java.lang.Override
    public boolean hasCustomEmoji() {
      return contentCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * A custom emoji.
     * </pre>
     *
     * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
     *
     * @return The customEmoji.
     */
    @java.lang.Override
    public com.google.chat.v1.CustomEmoji getCustomEmoji() {
      if (customEmojiBuilder_ == null) {
        if (contentCase_ == 2) {
          return (com.google.chat.v1.CustomEmoji) content_;
        }
        return com.google.chat.v1.CustomEmoji.getDefaultInstance();
      } else {
        if (contentCase_ == 2) {
          return customEmojiBuilder_.getMessage();
        }
        return com.google.chat.v1.CustomEmoji.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * A custom emoji.
     * </pre>
     *
     * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
     */
    public Builder setCustomEmoji(com.google.chat.v1.CustomEmoji value) {
      if (customEmojiBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        content_ = value;
        onChanged();
      } else {
        customEmojiBuilder_.setMessage(value);
      }
      contentCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * A custom emoji.
     * </pre>
     *
     * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
     */
    public Builder setCustomEmoji(com.google.chat.v1.CustomEmoji.Builder builderForValue) {
      if (customEmojiBuilder_ == null) {
        content_ = builderForValue.build();
        onChanged();
      } else {
        customEmojiBuilder_.setMessage(builderForValue.build());
      }
      contentCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * A custom emoji.
     * </pre>
     *
     * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
     */
    public Builder mergeCustomEmoji(com.google.chat.v1.CustomEmoji value) {
      if (customEmojiBuilder_ == null) {
        if (contentCase_ == 2 && content_ != com.google.chat.v1.CustomEmoji.getDefaultInstance()) {
          content_ =
              com.google.chat.v1.CustomEmoji.newBuilder((com.google.chat.v1.CustomEmoji) content_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          content_ = value;
        }
        onChanged();
      } else {
        if (contentCase_ == 2) {
          customEmojiBuilder_.mergeFrom(value);
        } else {
          customEmojiBuilder_.setMessage(value);
        }
      }
      contentCase_ = 2;
      return this;
    }

    /**
     *
     *
     * <pre>
     * A custom emoji.
     * </pre>
     *
     * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
     */
    public Builder clearCustomEmoji() {
      if (customEmojiBuilder_ == null) {
        if (contentCase_ == 2) {
          contentCase_ = 0;
          content_ = null;
          onChanged();
        }
      } else {
        if (contentCase_ == 2) {
          contentCase_ = 0;
          content_ = null;
        }
        customEmojiBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A custom emoji.
     * </pre>
     *
     * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
     */
    public com.google.chat.v1.CustomEmoji.Builder getCustomEmojiBuilder() {
      return getCustomEmojiFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * A custom emoji.
     * </pre>
     *
     * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
     */
    @java.lang.Override
    public com.google.chat.v1.CustomEmojiOrBuilder getCustomEmojiOrBuilder() {
      if ((contentCase_ == 2) && (customEmojiBuilder_ != null)) {
        return customEmojiBuilder_.getMessageOrBuilder();
      } else {
        if (contentCase_ == 2) {
          return (com.google.chat.v1.CustomEmoji) content_;
        }
        return com.google.chat.v1.CustomEmoji.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * A custom emoji.
     * </pre>
     *
     * <code>.google.chat.v1.CustomEmoji custom_emoji = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.chat.v1.CustomEmoji,
            com.google.chat.v1.CustomEmoji.Builder,
            com.google.chat.v1.CustomEmojiOrBuilder>
        getCustomEmojiFieldBuilder() {
      if (customEmojiBuilder_ == null) {
        if (!(contentCase_ == 2)) {
          content_ = com.google.chat.v1.CustomEmoji.getDefaultInstance();
        }
        customEmojiBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.chat.v1.CustomEmoji,
                com.google.chat.v1.CustomEmoji.Builder,
                com.google.chat.v1.CustomEmojiOrBuilder>(
                (com.google.chat.v1.CustomEmoji) content_, getParentForChildren(), isClean());
        content_ = null;
      }
      contentCase_ = 2;
      onChanged();
      return customEmojiBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.chat.v1.Emoji)
  }

  // @@protoc_insertion_point(class_scope:google.chat.v1.Emoji)
  private static final com.google.chat.v1.Emoji DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.chat.v1.Emoji();
  }

  public static com.google.chat.v1.Emoji getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Emoji> PARSER =
      new com.google.protobuf.AbstractParser<Emoji>() {
        @java.lang.Override
        public Emoji parsePartialFrom(
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

  public static com.google.protobuf.Parser<Emoji> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Emoji> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.chat.v1.Emoji getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
