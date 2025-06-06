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
// source: google/shopping/merchant/accounts/v1beta/emailpreferences.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.accounts.v1beta;

/**
 *
 *
 * <pre>
 * Request message for UpdateEmailPreferences method.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest}
 */
public final class UpdateEmailPreferencesRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest)
    UpdateEmailPreferencesRequestOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use UpdateEmailPreferencesRequest.newBuilder() to construct.
  private UpdateEmailPreferencesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateEmailPreferencesRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateEmailPreferencesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.accounts.v1beta.EmailPreferencesProto
        .internal_static_google_shopping_merchant_accounts_v1beta_UpdateEmailPreferencesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.accounts.v1beta.EmailPreferencesProto
        .internal_static_google_shopping_merchant_accounts_v1beta_UpdateEmailPreferencesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest.class,
            com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest.Builder
                .class);
  }

  private int bitField0_;
  public static final int EMAIL_PREFERENCES_FIELD_NUMBER = 1;
  private com.google.shopping.merchant.accounts.v1beta.EmailPreferences emailPreferences_;

  /**
   *
   *
   * <pre>
   * Required. Email Preferences to be updated.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the emailPreferences field is set.
   */
  @java.lang.Override
  public boolean hasEmailPreferences() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Email Preferences to be updated.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The emailPreferences.
   */
  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.EmailPreferences getEmailPreferences() {
    return emailPreferences_ == null
        ? com.google.shopping.merchant.accounts.v1beta.EmailPreferences.getDefaultInstance()
        : emailPreferences_;
  }

  /**
   *
   *
   * <pre>
   * Required. Email Preferences to be updated.
   * </pre>
   *
   * <code>
   * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.EmailPreferencesOrBuilder
      getEmailPreferencesOrBuilder() {
    return emailPreferences_ == null
        ? com.google.shopping.merchant.accounts.v1beta.EmailPreferences.getDefaultInstance()
        : emailPreferences_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;

  /**
   *
   *
   * <pre>
   * Required. List of fields being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. List of fields being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }

  /**
   *
   *
   * <pre>
   * Required. List of fields being updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
      output.writeMessage(1, getEmailPreferences());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getEmailPreferences());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj
        instanceof com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest other =
        (com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest) obj;

    if (hasEmailPreferences() != other.hasEmailPreferences()) return false;
    if (hasEmailPreferences()) {
      if (!getEmailPreferences().equals(other.getEmailPreferences())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasEmailPreferences()) {
      hash = (37 * hash) + EMAIL_PREFERENCES_FIELD_NUMBER;
      hash = (53 * hash) + getEmailPreferences().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      parseFrom(
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
      com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest prototype) {
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
   * Request message for UpdateEmailPreferences method.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest)
      com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.accounts.v1beta.EmailPreferencesProto
          .internal_static_google_shopping_merchant_accounts_v1beta_UpdateEmailPreferencesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.accounts.v1beta.EmailPreferencesProto
          .internal_static_google_shopping_merchant_accounts_v1beta_UpdateEmailPreferencesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest.class,
              com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest.Builder
                  .class);
    }

    // Construct using
    // com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEmailPreferencesFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      emailPreferences_ = null;
      if (emailPreferencesBuilder_ != null) {
        emailPreferencesBuilder_.dispose();
        emailPreferencesBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.accounts.v1beta.EmailPreferencesProto
          .internal_static_google_shopping_merchant_accounts_v1beta_UpdateEmailPreferencesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
        getDefaultInstanceForType() {
      return com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest build() {
      com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
        buildPartial() {
      com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest result =
          new com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.emailPreferences_ =
            emailPreferencesBuilder_ == null ? emailPreferences_ : emailPreferencesBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other
          instanceof com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest) {
        return mergeFrom(
            (com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest other) {
      if (other
          == com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
              .getDefaultInstance()) return this;
      if (other.hasEmailPreferences()) {
        mergeEmailPreferences(other.getEmailPreferences());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(
                    getEmailPreferencesFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
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

    private int bitField0_;

    private com.google.shopping.merchant.accounts.v1beta.EmailPreferences emailPreferences_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.merchant.accounts.v1beta.EmailPreferences,
            com.google.shopping.merchant.accounts.v1beta.EmailPreferences.Builder,
            com.google.shopping.merchant.accounts.v1beta.EmailPreferencesOrBuilder>
        emailPreferencesBuilder_;

    /**
     *
     *
     * <pre>
     * Required. Email Preferences to be updated.
     * </pre>
     *
     * <code>
     * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the emailPreferences field is set.
     */
    public boolean hasEmailPreferences() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Email Preferences to be updated.
     * </pre>
     *
     * <code>
     * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The emailPreferences.
     */
    public com.google.shopping.merchant.accounts.v1beta.EmailPreferences getEmailPreferences() {
      if (emailPreferencesBuilder_ == null) {
        return emailPreferences_ == null
            ? com.google.shopping.merchant.accounts.v1beta.EmailPreferences.getDefaultInstance()
            : emailPreferences_;
      } else {
        return emailPreferencesBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Email Preferences to be updated.
     * </pre>
     *
     * <code>
     * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEmailPreferences(
        com.google.shopping.merchant.accounts.v1beta.EmailPreferences value) {
      if (emailPreferencesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        emailPreferences_ = value;
      } else {
        emailPreferencesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Email Preferences to be updated.
     * </pre>
     *
     * <code>
     * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setEmailPreferences(
        com.google.shopping.merchant.accounts.v1beta.EmailPreferences.Builder builderForValue) {
      if (emailPreferencesBuilder_ == null) {
        emailPreferences_ = builderForValue.build();
      } else {
        emailPreferencesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Email Preferences to be updated.
     * </pre>
     *
     * <code>
     * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeEmailPreferences(
        com.google.shopping.merchant.accounts.v1beta.EmailPreferences value) {
      if (emailPreferencesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && emailPreferences_ != null
            && emailPreferences_
                != com.google.shopping.merchant.accounts.v1beta.EmailPreferences
                    .getDefaultInstance()) {
          getEmailPreferencesBuilder().mergeFrom(value);
        } else {
          emailPreferences_ = value;
        }
      } else {
        emailPreferencesBuilder_.mergeFrom(value);
      }
      if (emailPreferences_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Email Preferences to be updated.
     * </pre>
     *
     * <code>
     * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearEmailPreferences() {
      bitField0_ = (bitField0_ & ~0x00000001);
      emailPreferences_ = null;
      if (emailPreferencesBuilder_ != null) {
        emailPreferencesBuilder_.dispose();
        emailPreferencesBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Email Preferences to be updated.
     * </pre>
     *
     * <code>
     * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.EmailPreferences.Builder
        getEmailPreferencesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getEmailPreferencesFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. Email Preferences to be updated.
     * </pre>
     *
     * <code>
     * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.shopping.merchant.accounts.v1beta.EmailPreferencesOrBuilder
        getEmailPreferencesOrBuilder() {
      if (emailPreferencesBuilder_ != null) {
        return emailPreferencesBuilder_.getMessageOrBuilder();
      } else {
        return emailPreferences_ == null
            ? com.google.shopping.merchant.accounts.v1beta.EmailPreferences.getDefaultInstance()
            : emailPreferences_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Email Preferences to be updated.
     * </pre>
     *
     * <code>
     * .google.shopping.merchant.accounts.v1beta.EmailPreferences email_preferences = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.merchant.accounts.v1beta.EmailPreferences,
            com.google.shopping.merchant.accounts.v1beta.EmailPreferences.Builder,
            com.google.shopping.merchant.accounts.v1beta.EmailPreferencesOrBuilder>
        getEmailPreferencesFieldBuilder() {
      if (emailPreferencesBuilder_ == null) {
        emailPreferencesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.shopping.merchant.accounts.v1beta.EmailPreferences,
                com.google.shopping.merchant.accounts.v1beta.EmailPreferences.Builder,
                com.google.shopping.merchant.accounts.v1beta.EmailPreferencesOrBuilder>(
                getEmailPreferences(), getParentForChildren(), isClean());
        emailPreferences_ = null;
      }
      return emailPreferencesBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;

    /**
     *
     *
     * <pre>
     * Required. List of fields being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. List of fields being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Required. List of fields being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. List of fields being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. List of fields being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. List of fields being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. List of fields being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Required. List of fields being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. List of fields being updated.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest)
  private static final com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest();
  }

  public static com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateEmailPreferencesRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateEmailPreferencesRequest>() {
        @java.lang.Override
        public UpdateEmailPreferencesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateEmailPreferencesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateEmailPreferencesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.UpdateEmailPreferencesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
