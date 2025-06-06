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
// source: google/api/apikeys/v2/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.api.apikeys.v2;

/**
 *
 *
 * <pre>
 * The HTTP referrers (websites) that are allowed to use the key.
 * </pre>
 *
 * Protobuf type {@code google.api.apikeys.v2.BrowserKeyRestrictions}
 */
public final class BrowserKeyRestrictions extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.apikeys.v2.BrowserKeyRestrictions)
    BrowserKeyRestrictionsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use BrowserKeyRestrictions.newBuilder() to construct.
  private BrowserKeyRestrictions(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BrowserKeyRestrictions() {
    allowedReferrers_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BrowserKeyRestrictions();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.apikeys.v2.ResourcesProto
        .internal_static_google_api_apikeys_v2_BrowserKeyRestrictions_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.apikeys.v2.ResourcesProto
        .internal_static_google_api_apikeys_v2_BrowserKeyRestrictions_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.apikeys.v2.BrowserKeyRestrictions.class,
            com.google.api.apikeys.v2.BrowserKeyRestrictions.Builder.class);
  }

  public static final int ALLOWED_REFERRERS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList allowedReferrers_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * A list of regular expressions for the referrer URLs that are allowed
   * to make API calls with this key.
   * </pre>
   *
   * <code>repeated string allowed_referrers = 1;</code>
   *
   * @return A list containing the allowedReferrers.
   */
  public com.google.protobuf.ProtocolStringList getAllowedReferrersList() {
    return allowedReferrers_;
  }

  /**
   *
   *
   * <pre>
   * A list of regular expressions for the referrer URLs that are allowed
   * to make API calls with this key.
   * </pre>
   *
   * <code>repeated string allowed_referrers = 1;</code>
   *
   * @return The count of allowedReferrers.
   */
  public int getAllowedReferrersCount() {
    return allowedReferrers_.size();
  }

  /**
   *
   *
   * <pre>
   * A list of regular expressions for the referrer URLs that are allowed
   * to make API calls with this key.
   * </pre>
   *
   * <code>repeated string allowed_referrers = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The allowedReferrers at the given index.
   */
  public java.lang.String getAllowedReferrers(int index) {
    return allowedReferrers_.get(index);
  }

  /**
   *
   *
   * <pre>
   * A list of regular expressions for the referrer URLs that are allowed
   * to make API calls with this key.
   * </pre>
   *
   * <code>repeated string allowed_referrers = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the allowedReferrers at the given index.
   */
  public com.google.protobuf.ByteString getAllowedReferrersBytes(int index) {
    return allowedReferrers_.getByteString(index);
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
    for (int i = 0; i < allowedReferrers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, allowedReferrers_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < allowedReferrers_.size(); i++) {
        dataSize += computeStringSizeNoTag(allowedReferrers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllowedReferrersList().size();
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
    if (!(obj instanceof com.google.api.apikeys.v2.BrowserKeyRestrictions)) {
      return super.equals(obj);
    }
    com.google.api.apikeys.v2.BrowserKeyRestrictions other =
        (com.google.api.apikeys.v2.BrowserKeyRestrictions) obj;

    if (!getAllowedReferrersList().equals(other.getAllowedReferrersList())) return false;
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
    if (getAllowedReferrersCount() > 0) {
      hash = (37 * hash) + ALLOWED_REFERRERS_FIELD_NUMBER;
      hash = (53 * hash) + getAllowedReferrersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions parseFrom(
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

  public static Builder newBuilder(com.google.api.apikeys.v2.BrowserKeyRestrictions prototype) {
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
   * The HTTP referrers (websites) that are allowed to use the key.
   * </pre>
   *
   * Protobuf type {@code google.api.apikeys.v2.BrowserKeyRestrictions}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.apikeys.v2.BrowserKeyRestrictions)
      com.google.api.apikeys.v2.BrowserKeyRestrictionsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_BrowserKeyRestrictions_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_BrowserKeyRestrictions_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.apikeys.v2.BrowserKeyRestrictions.class,
              com.google.api.apikeys.v2.BrowserKeyRestrictions.Builder.class);
    }

    // Construct using com.google.api.apikeys.v2.BrowserKeyRestrictions.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      allowedReferrers_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.apikeys.v2.ResourcesProto
          .internal_static_google_api_apikeys_v2_BrowserKeyRestrictions_descriptor;
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.BrowserKeyRestrictions getDefaultInstanceForType() {
      return com.google.api.apikeys.v2.BrowserKeyRestrictions.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.BrowserKeyRestrictions build() {
      com.google.api.apikeys.v2.BrowserKeyRestrictions result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.apikeys.v2.BrowserKeyRestrictions buildPartial() {
      com.google.api.apikeys.v2.BrowserKeyRestrictions result =
          new com.google.api.apikeys.v2.BrowserKeyRestrictions(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.api.apikeys.v2.BrowserKeyRestrictions result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        allowedReferrers_.makeImmutable();
        result.allowedReferrers_ = allowedReferrers_;
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
      if (other instanceof com.google.api.apikeys.v2.BrowserKeyRestrictions) {
        return mergeFrom((com.google.api.apikeys.v2.BrowserKeyRestrictions) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.apikeys.v2.BrowserKeyRestrictions other) {
      if (other == com.google.api.apikeys.v2.BrowserKeyRestrictions.getDefaultInstance())
        return this;
      if (!other.allowedReferrers_.isEmpty()) {
        if (allowedReferrers_.isEmpty()) {
          allowedReferrers_ = other.allowedReferrers_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAllowedReferrersIsMutable();
          allowedReferrers_.addAll(other.allowedReferrers_);
        }
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
                java.lang.String s = input.readStringRequireUtf8();
                ensureAllowedReferrersIsMutable();
                allowedReferrers_.add(s);
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

    private com.google.protobuf.LazyStringArrayList allowedReferrers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureAllowedReferrersIsMutable() {
      if (!allowedReferrers_.isModifiable()) {
        allowedReferrers_ = new com.google.protobuf.LazyStringArrayList(allowedReferrers_);
      }
      bitField0_ |= 0x00000001;
    }

    /**
     *
     *
     * <pre>
     * A list of regular expressions for the referrer URLs that are allowed
     * to make API calls with this key.
     * </pre>
     *
     * <code>repeated string allowed_referrers = 1;</code>
     *
     * @return A list containing the allowedReferrers.
     */
    public com.google.protobuf.ProtocolStringList getAllowedReferrersList() {
      allowedReferrers_.makeImmutable();
      return allowedReferrers_;
    }

    /**
     *
     *
     * <pre>
     * A list of regular expressions for the referrer URLs that are allowed
     * to make API calls with this key.
     * </pre>
     *
     * <code>repeated string allowed_referrers = 1;</code>
     *
     * @return The count of allowedReferrers.
     */
    public int getAllowedReferrersCount() {
      return allowedReferrers_.size();
    }

    /**
     *
     *
     * <pre>
     * A list of regular expressions for the referrer URLs that are allowed
     * to make API calls with this key.
     * </pre>
     *
     * <code>repeated string allowed_referrers = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The allowedReferrers at the given index.
     */
    public java.lang.String getAllowedReferrers(int index) {
      return allowedReferrers_.get(index);
    }

    /**
     *
     *
     * <pre>
     * A list of regular expressions for the referrer URLs that are allowed
     * to make API calls with this key.
     * </pre>
     *
     * <code>repeated string allowed_referrers = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the allowedReferrers at the given index.
     */
    public com.google.protobuf.ByteString getAllowedReferrersBytes(int index) {
      return allowedReferrers_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * A list of regular expressions for the referrer URLs that are allowed
     * to make API calls with this key.
     * </pre>
     *
     * <code>repeated string allowed_referrers = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The allowedReferrers to set.
     * @return This builder for chaining.
     */
    public Builder setAllowedReferrers(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedReferrersIsMutable();
      allowedReferrers_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of regular expressions for the referrer URLs that are allowed
     * to make API calls with this key.
     * </pre>
     *
     * <code>repeated string allowed_referrers = 1;</code>
     *
     * @param value The allowedReferrers to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedReferrers(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAllowedReferrersIsMutable();
      allowedReferrers_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of regular expressions for the referrer URLs that are allowed
     * to make API calls with this key.
     * </pre>
     *
     * <code>repeated string allowed_referrers = 1;</code>
     *
     * @param values The allowedReferrers to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllowedReferrers(java.lang.Iterable<java.lang.String> values) {
      ensureAllowedReferrersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, allowedReferrers_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of regular expressions for the referrer URLs that are allowed
     * to make API calls with this key.
     * </pre>
     *
     * <code>repeated string allowed_referrers = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAllowedReferrers() {
      allowedReferrers_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of regular expressions for the referrer URLs that are allowed
     * to make API calls with this key.
     * </pre>
     *
     * <code>repeated string allowed_referrers = 1;</code>
     *
     * @param value The bytes of the allowedReferrers to add.
     * @return This builder for chaining.
     */
    public Builder addAllowedReferrersBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAllowedReferrersIsMutable();
      allowedReferrers_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.api.apikeys.v2.BrowserKeyRestrictions)
  }

  // @@protoc_insertion_point(class_scope:google.api.apikeys.v2.BrowserKeyRestrictions)
  private static final com.google.api.apikeys.v2.BrowserKeyRestrictions DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.apikeys.v2.BrowserKeyRestrictions();
  }

  public static com.google.api.apikeys.v2.BrowserKeyRestrictions getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BrowserKeyRestrictions> PARSER =
      new com.google.protobuf.AbstractParser<BrowserKeyRestrictions>() {
        @java.lang.Override
        public BrowserKeyRestrictions parsePartialFrom(
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

  public static com.google.protobuf.Parser<BrowserKeyRestrictions> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BrowserKeyRestrictions> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.apikeys.v2.BrowserKeyRestrictions getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
