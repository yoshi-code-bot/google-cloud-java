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
// source: google/shopping/merchant/accounts/v1beta/shippingsettings.proto

// Protobuf Java Version: 3.25.8
package com.google.shopping.merchant.accounts.v1beta;

/**
 *
 *
 * <pre>
 * Business days cutoff time definition.
 * </pre>
 *
 * Protobuf type {@code google.shopping.merchant.accounts.v1beta.CutoffTime}
 */
public final class CutoffTime extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.merchant.accounts.v1beta.CutoffTime)
    CutoffTimeOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CutoffTime.newBuilder() to construct.
  private CutoffTime(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CutoffTime() {
    timeZone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CutoffTime();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
        .internal_static_google_shopping_merchant_accounts_v1beta_CutoffTime_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
        .internal_static_google_shopping_merchant_accounts_v1beta_CutoffTime_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.merchant.accounts.v1beta.CutoffTime.class,
            com.google.shopping.merchant.accounts.v1beta.CutoffTime.Builder.class);
  }

  private int bitField0_;
  public static final int HOUR_FIELD_NUMBER = 1;
  private int hour_ = 0;

  /**
   *
   *
   * <pre>
   * Required. Hour of the cutoff time until which an order has to be placed to
   * be processed in the same day.
   * </pre>
   *
   * <code>optional int32 hour = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the hour field is set.
   */
  @java.lang.Override
  public boolean hasHour() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Hour of the cutoff time until which an order has to be placed to
   * be processed in the same day.
   * </pre>
   *
   * <code>optional int32 hour = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The hour.
   */
  @java.lang.Override
  public int getHour() {
    return hour_;
  }

  public static final int MINUTE_FIELD_NUMBER = 2;
  private int minute_ = 0;

  /**
   *
   *
   * <pre>
   * Required. Minute of the cutoff time until which an order has to be placed
   * to be processed in the same day.
   * </pre>
   *
   * <code>optional int32 minute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the minute field is set.
   */
  @java.lang.Override
  public boolean hasMinute() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. Minute of the cutoff time until which an order has to be placed
   * to be processed in the same day.
   * </pre>
   *
   * <code>optional int32 minute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The minute.
   */
  @java.lang.Override
  public int getMinute() {
    return minute_;
  }

  public static final int TIME_ZONE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object timeZone_ = "";

  /**
   *
   *
   * <pre>
   * Required. [Timezone
   * identifier](https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids)
   * For example "Europe/Zurich".
   * </pre>
   *
   * <code>optional string time_zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the timeZone field is set.
   */
  @java.lang.Override
  public boolean hasTimeZone() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   *
   *
   * <pre>
   * Required. [Timezone
   * identifier](https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids)
   * For example "Europe/Zurich".
   * </pre>
   *
   * <code>optional string time_zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The timeZone.
   */
  @java.lang.Override
  public java.lang.String getTimeZone() {
    java.lang.Object ref = timeZone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timeZone_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. [Timezone
   * identifier](https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids)
   * For example "Europe/Zurich".
   * </pre>
   *
   * <code>optional string time_zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for timeZone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTimeZoneBytes() {
    java.lang.Object ref = timeZone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      timeZone_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
      output.writeInt32(1, hour_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt32(2, minute_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, timeZone_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, hour_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, minute_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, timeZone_);
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
    if (!(obj instanceof com.google.shopping.merchant.accounts.v1beta.CutoffTime)) {
      return super.equals(obj);
    }
    com.google.shopping.merchant.accounts.v1beta.CutoffTime other =
        (com.google.shopping.merchant.accounts.v1beta.CutoffTime) obj;

    if (hasHour() != other.hasHour()) return false;
    if (hasHour()) {
      if (getHour() != other.getHour()) return false;
    }
    if (hasMinute() != other.hasMinute()) return false;
    if (hasMinute()) {
      if (getMinute() != other.getMinute()) return false;
    }
    if (hasTimeZone() != other.hasTimeZone()) return false;
    if (hasTimeZone()) {
      if (!getTimeZone().equals(other.getTimeZone())) return false;
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
    if (hasHour()) {
      hash = (37 * hash) + HOUR_FIELD_NUMBER;
      hash = (53 * hash) + getHour();
    }
    if (hasMinute()) {
      hash = (37 * hash) + MINUTE_FIELD_NUMBER;
      hash = (53 * hash) + getMinute();
    }
    if (hasTimeZone()) {
      hash = (37 * hash) + TIME_ZONE_FIELD_NUMBER;
      hash = (53 * hash) + getTimeZone().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime parseFrom(
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
      com.google.shopping.merchant.accounts.v1beta.CutoffTime prototype) {
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
   * Business days cutoff time definition.
   * </pre>
   *
   * Protobuf type {@code google.shopping.merchant.accounts.v1beta.CutoffTime}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.merchant.accounts.v1beta.CutoffTime)
      com.google.shopping.merchant.accounts.v1beta.CutoffTimeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_CutoffTime_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_CutoffTime_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.merchant.accounts.v1beta.CutoffTime.class,
              com.google.shopping.merchant.accounts.v1beta.CutoffTime.Builder.class);
    }

    // Construct using com.google.shopping.merchant.accounts.v1beta.CutoffTime.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      hour_ = 0;
      minute_ = 0;
      timeZone_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.merchant.accounts.v1beta.ShippingSettingsProto
          .internal_static_google_shopping_merchant_accounts_v1beta_CutoffTime_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.CutoffTime getDefaultInstanceForType() {
      return com.google.shopping.merchant.accounts.v1beta.CutoffTime.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.CutoffTime build() {
      com.google.shopping.merchant.accounts.v1beta.CutoffTime result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.merchant.accounts.v1beta.CutoffTime buildPartial() {
      com.google.shopping.merchant.accounts.v1beta.CutoffTime result =
          new com.google.shopping.merchant.accounts.v1beta.CutoffTime(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.shopping.merchant.accounts.v1beta.CutoffTime result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hour_ = hour_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minute_ = minute_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.timeZone_ = timeZone_;
        to_bitField0_ |= 0x00000004;
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
      if (other instanceof com.google.shopping.merchant.accounts.v1beta.CutoffTime) {
        return mergeFrom((com.google.shopping.merchant.accounts.v1beta.CutoffTime) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.merchant.accounts.v1beta.CutoffTime other) {
      if (other == com.google.shopping.merchant.accounts.v1beta.CutoffTime.getDefaultInstance())
        return this;
      if (other.hasHour()) {
        setHour(other.getHour());
      }
      if (other.hasMinute()) {
        setMinute(other.getMinute());
      }
      if (other.hasTimeZone()) {
        timeZone_ = other.timeZone_;
        bitField0_ |= 0x00000004;
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
            case 8:
              {
                hour_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                minute_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                timeZone_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private int hour_;

    /**
     *
     *
     * <pre>
     * Required. Hour of the cutoff time until which an order has to be placed to
     * be processed in the same day.
     * </pre>
     *
     * <code>optional int32 hour = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the hour field is set.
     */
    @java.lang.Override
    public boolean hasHour() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Hour of the cutoff time until which an order has to be placed to
     * be processed in the same day.
     * </pre>
     *
     * <code>optional int32 hour = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The hour.
     */
    @java.lang.Override
    public int getHour() {
      return hour_;
    }

    /**
     *
     *
     * <pre>
     * Required. Hour of the cutoff time until which an order has to be placed to
     * be processed in the same day.
     * </pre>
     *
     * <code>optional int32 hour = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The hour to set.
     * @return This builder for chaining.
     */
    public Builder setHour(int value) {

      hour_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Hour of the cutoff time until which an order has to be placed to
     * be processed in the same day.
     * </pre>
     *
     * <code>optional int32 hour = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearHour() {
      bitField0_ = (bitField0_ & ~0x00000001);
      hour_ = 0;
      onChanged();
      return this;
    }

    private int minute_;

    /**
     *
     *
     * <pre>
     * Required. Minute of the cutoff time until which an order has to be placed
     * to be processed in the same day.
     * </pre>
     *
     * <code>optional int32 minute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the minute field is set.
     */
    @java.lang.Override
    public boolean hasMinute() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. Minute of the cutoff time until which an order has to be placed
     * to be processed in the same day.
     * </pre>
     *
     * <code>optional int32 minute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The minute.
     */
    @java.lang.Override
    public int getMinute() {
      return minute_;
    }

    /**
     *
     *
     * <pre>
     * Required. Minute of the cutoff time until which an order has to be placed
     * to be processed in the same day.
     * </pre>
     *
     * <code>optional int32 minute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The minute to set.
     * @return This builder for chaining.
     */
    public Builder setMinute(int value) {

      minute_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Minute of the cutoff time until which an order has to be placed
     * to be processed in the same day.
     * </pre>
     *
     * <code>optional int32 minute = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinute() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minute_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object timeZone_ = "";

    /**
     *
     *
     * <pre>
     * Required. [Timezone
     * identifier](https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids)
     * For example "Europe/Zurich".
     * </pre>
     *
     * <code>optional string time_zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return Whether the timeZone field is set.
     */
    public boolean hasTimeZone() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Required. [Timezone
     * identifier](https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids)
     * For example "Europe/Zurich".
     * </pre>
     *
     * <code>optional string time_zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The timeZone.
     */
    public java.lang.String getTimeZone() {
      java.lang.Object ref = timeZone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeZone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. [Timezone
     * identifier](https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids)
     * For example "Europe/Zurich".
     * </pre>
     *
     * <code>optional string time_zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for timeZone.
     */
    public com.google.protobuf.ByteString getTimeZoneBytes() {
      java.lang.Object ref = timeZone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        timeZone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. [Timezone
     * identifier](https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids)
     * For example "Europe/Zurich".
     * </pre>
     *
     * <code>optional string time_zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      timeZone_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. [Timezone
     * identifier](https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids)
     * For example "Europe/Zurich".
     * </pre>
     *
     * <code>optional string time_zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimeZone() {
      timeZone_ = getDefaultInstance().getTimeZone();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. [Timezone
     * identifier](https://developers.google.com/adwords/api/docs/appendix/codes-formats#timezone-ids)
     * For example "Europe/Zurich".
     * </pre>
     *
     * <code>optional string time_zone = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for timeZone to set.
     * @return This builder for chaining.
     */
    public Builder setTimeZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      timeZone_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.merchant.accounts.v1beta.CutoffTime)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.merchant.accounts.v1beta.CutoffTime)
  private static final com.google.shopping.merchant.accounts.v1beta.CutoffTime DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.merchant.accounts.v1beta.CutoffTime();
  }

  public static com.google.shopping.merchant.accounts.v1beta.CutoffTime getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CutoffTime> PARSER =
      new com.google.protobuf.AbstractParser<CutoffTime>() {
        @java.lang.Override
        public CutoffTime parsePartialFrom(
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

  public static com.google.protobuf.Parser<CutoffTime> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CutoffTime> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.merchant.accounts.v1beta.CutoffTime getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
