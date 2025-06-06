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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.8
package com.google.recaptchaenterprise.v1;

/**
 *
 *
 * <pre>
 * Information about SMS toll fraud.
 * </pre>
 *
 * Protobuf type {@code google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict}
 */
public final class SmsTollFraudVerdict extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict)
    SmsTollFraudVerdictOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SmsTollFraudVerdict.newBuilder() to construct.
  private SmsTollFraudVerdict(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SmsTollFraudVerdict() {
    reasons_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SmsTollFraudVerdict();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_SmsTollFraudVerdict_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
        .internal_static_google_cloud_recaptchaenterprise_v1_SmsTollFraudVerdict_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.class,
            com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Reasons contributing to the SMS toll fraud verdict.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason}
   */
  public enum SmsTollFraudReason implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default unspecified reason
     * </pre>
     *
     * <code>SMS_TOLL_FRAUD_REASON_UNSPECIFIED = 0;</code>
     */
    SMS_TOLL_FRAUD_REASON_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The provided phone number was invalid
     * </pre>
     *
     * <code>INVALID_PHONE_NUMBER = 1;</code>
     */
    INVALID_PHONE_NUMBER(1),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default unspecified reason
     * </pre>
     *
     * <code>SMS_TOLL_FRAUD_REASON_UNSPECIFIED = 0;</code>
     */
    public static final int SMS_TOLL_FRAUD_REASON_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * The provided phone number was invalid
     * </pre>
     *
     * <code>INVALID_PHONE_NUMBER = 1;</code>
     */
    public static final int INVALID_PHONE_NUMBER_VALUE = 1;

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
    public static SmsTollFraudReason valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static SmsTollFraudReason forNumber(int value) {
      switch (value) {
        case 0:
          return SMS_TOLL_FRAUD_REASON_UNSPECIFIED;
        case 1:
          return INVALID_PHONE_NUMBER;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<SmsTollFraudReason>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<SmsTollFraudReason>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<SmsTollFraudReason>() {
              public SmsTollFraudReason findValueByNumber(int number) {
                return SmsTollFraudReason.forNumber(number);
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
      return com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final SmsTollFraudReason[] VALUES = values();

    public static SmsTollFraudReason valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private SmsTollFraudReason(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason)
  }

  public static final int RISK_FIELD_NUMBER = 1;
  private float risk_ = 0F;

  /**
   *
   *
   * <pre>
   * Output only. Probability of an SMS event being fraudulent.
   * Values are from 0.0 (lowest) to 1.0 (highest).
   * </pre>
   *
   * <code>float risk = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The risk.
   */
  @java.lang.Override
  public float getRisk() {
    return risk_;
  }

  public static final int REASONS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> reasons_;

  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer,
          com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason>
      reasons_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer,
              com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason>() {
            public com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason convert(
                java.lang.Integer from) {
              com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason result =
                  com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason
                      .forNumber(from);
              return result == null
                  ? com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason
                      .UNRECOGNIZED
                  : result;
            }
          };

  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the SMS toll fraud verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the reasons.
   */
  @java.lang.Override
  public java.util.List<com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason>
      getReasonsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer,
        com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason>(
        reasons_, reasons_converter_);
  }

  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the SMS toll fraud verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of reasons.
   */
  @java.lang.Override
  public int getReasonsCount() {
    return reasons_.size();
  }

  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the SMS toll fraud verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The reasons at the given index.
   */
  @java.lang.Override
  public com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason getReasons(
      int index) {
    return reasons_converter_.convert(reasons_.get(index));
  }

  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the SMS toll fraud verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for reasons.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getReasonsValueList() {
    return reasons_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Reasons contributing to the SMS toll fraud verdict.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of reasons at the given index.
   */
  @java.lang.Override
  public int getReasonsValue(int index) {
    return reasons_.get(index);
  }

  private int reasonsMemoizedSerializedSize;

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
    getSerializedSize();
    if (java.lang.Float.floatToRawIntBits(risk_) != 0) {
      output.writeFloat(1, risk_);
    }
    if (getReasonsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(reasonsMemoizedSerializedSize);
    }
    for (int i = 0; i < reasons_.size(); i++) {
      output.writeEnumNoTag(reasons_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(risk_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, risk_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < reasons_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(reasons_.get(i));
      }
      size += dataSize;
      if (!getReasonsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      reasonsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.recaptchaenterprise.v1.SmsTollFraudVerdict)) {
      return super.equals(obj);
    }
    com.google.recaptchaenterprise.v1.SmsTollFraudVerdict other =
        (com.google.recaptchaenterprise.v1.SmsTollFraudVerdict) obj;

    if (java.lang.Float.floatToIntBits(getRisk())
        != java.lang.Float.floatToIntBits(other.getRisk())) return false;
    if (!reasons_.equals(other.reasons_)) return false;
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
    hash = (37 * hash) + RISK_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getRisk());
    if (getReasonsCount() > 0) {
      hash = (37 * hash) + REASONS_FIELD_NUMBER;
      hash = (53 * hash) + reasons_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict parseFrom(
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
      com.google.recaptchaenterprise.v1.SmsTollFraudVerdict prototype) {
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
   * Information about SMS toll fraud.
   * </pre>
   *
   * Protobuf type {@code google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict)
      com.google.recaptchaenterprise.v1.SmsTollFraudVerdictOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_SmsTollFraudVerdict_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_SmsTollFraudVerdict_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.class,
              com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.Builder.class);
    }

    // Construct using com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      risk_ = 0F;
      reasons_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.recaptchaenterprise.v1.RecaptchaEnterpriseProto
          .internal_static_google_cloud_recaptchaenterprise_v1_SmsTollFraudVerdict_descriptor;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.SmsTollFraudVerdict getDefaultInstanceForType() {
      return com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.SmsTollFraudVerdict build() {
      com.google.recaptchaenterprise.v1.SmsTollFraudVerdict result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.recaptchaenterprise.v1.SmsTollFraudVerdict buildPartial() {
      com.google.recaptchaenterprise.v1.SmsTollFraudVerdict result =
          new com.google.recaptchaenterprise.v1.SmsTollFraudVerdict(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.recaptchaenterprise.v1.SmsTollFraudVerdict result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        reasons_ = java.util.Collections.unmodifiableList(reasons_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.reasons_ = reasons_;
    }

    private void buildPartial0(com.google.recaptchaenterprise.v1.SmsTollFraudVerdict result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.risk_ = risk_;
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
      if (other instanceof com.google.recaptchaenterprise.v1.SmsTollFraudVerdict) {
        return mergeFrom((com.google.recaptchaenterprise.v1.SmsTollFraudVerdict) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.recaptchaenterprise.v1.SmsTollFraudVerdict other) {
      if (other == com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.getDefaultInstance())
        return this;
      if (other.getRisk() != 0F) {
        setRisk(other.getRisk());
      }
      if (!other.reasons_.isEmpty()) {
        if (reasons_.isEmpty()) {
          reasons_ = other.reasons_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureReasonsIsMutable();
          reasons_.addAll(other.reasons_);
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
            case 13:
              {
                risk_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
            case 16:
              {
                int tmpRaw = input.readEnum();
                ensureReasonsIsMutable();
                reasons_.add(tmpRaw);
                break;
              } // case 16
            case 18:
              {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while (input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureReasonsIsMutable();
                  reasons_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
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

    private float risk_;

    /**
     *
     *
     * <pre>
     * Output only. Probability of an SMS event being fraudulent.
     * Values are from 0.0 (lowest) to 1.0 (highest).
     * </pre>
     *
     * <code>float risk = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The risk.
     */
    @java.lang.Override
    public float getRisk() {
      return risk_;
    }

    /**
     *
     *
     * <pre>
     * Output only. Probability of an SMS event being fraudulent.
     * Values are from 0.0 (lowest) to 1.0 (highest).
     * </pre>
     *
     * <code>float risk = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The risk to set.
     * @return This builder for chaining.
     */
    public Builder setRisk(float value) {

      risk_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Probability of an SMS event being fraudulent.
     * Values are from 0.0 (lowest) to 1.0 (highest).
     * </pre>
     *
     * <code>float risk = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRisk() {
      bitField0_ = (bitField0_ & ~0x00000001);
      risk_ = 0F;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> reasons_ = java.util.Collections.emptyList();

    private void ensureReasonsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        reasons_ = new java.util.ArrayList<java.lang.Integer>(reasons_);
        bitField0_ |= 0x00000002;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return A list containing the reasons.
     */
    public java.util.List<com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason>
        getReasonsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer,
          com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason>(
          reasons_, reasons_converter_);
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The count of reasons.
     */
    public int getReasonsCount() {
      return reasons_.size();
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index of the element to return.
     * @return The reasons at the given index.
     */
    public com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason getReasons(
        int index) {
      return reasons_converter_.convert(reasons_.get(index));
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The reasons to set.
     * @return This builder for chaining.
     */
    public Builder setReasons(
        int index, com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureReasonsIsMutable();
      reasons_.set(index, value.getNumber());
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The reasons to add.
     * @return This builder for chaining.
     */
    public Builder addReasons(
        com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureReasonsIsMutable();
      reasons_.add(value.getNumber());
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param values The reasons to add.
     * @return This builder for chaining.
     */
    public Builder addAllReasons(
        java.lang.Iterable<
                ? extends com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason>
            values) {
      ensureReasonsIsMutable();
      for (com.google.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason value :
          values) {
        reasons_.add(value.getNumber());
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearReasons() {
      reasons_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return A list containing the enum numeric values on the wire for reasons.
     */
    public java.util.List<java.lang.Integer> getReasonsValueList() {
      return java.util.Collections.unmodifiableList(reasons_);
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of reasons at the given index.
     */
    public int getReasonsValue(int index) {
      return reasons_.get(index);
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for reasons to set.
     * @return This builder for chaining.
     */
    public Builder setReasonsValue(int index, int value) {
      ensureReasonsIsMutable();
      reasons_.set(index, value);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for reasons to add.
     * @return This builder for chaining.
     */
    public Builder addReasonsValue(int value) {
      ensureReasonsIsMutable();
      reasons_.add(value);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Reasons contributing to the SMS toll fraud verdict.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict.SmsTollFraudReason reasons = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param values The enum numeric values on the wire for reasons to add.
     * @return This builder for chaining.
     */
    public Builder addAllReasonsValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureReasonsIsMutable();
      for (int value : values) {
        reasons_.add(value);
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.recaptchaenterprise.v1.SmsTollFraudVerdict)
  private static final com.google.recaptchaenterprise.v1.SmsTollFraudVerdict DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.recaptchaenterprise.v1.SmsTollFraudVerdict();
  }

  public static com.google.recaptchaenterprise.v1.SmsTollFraudVerdict getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SmsTollFraudVerdict> PARSER =
      new com.google.protobuf.AbstractParser<SmsTollFraudVerdict>() {
        @java.lang.Override
        public SmsTollFraudVerdict parsePartialFrom(
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

  public static com.google.protobuf.Parser<SmsTollFraudVerdict> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SmsTollFraudVerdict> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.recaptchaenterprise.v1.SmsTollFraudVerdict getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
