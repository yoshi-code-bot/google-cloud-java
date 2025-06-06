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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * A list of values to filter by in ConditionalColumnSetValue
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.ValueListFilter}
 */
public final class ValueListFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.ValueListFilter)
    ValueListFilterOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ValueListFilter.newBuilder() to construct.
  private ValueListFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ValueListFilter() {
    valuePresentList_ = 0;
    values_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ValueListFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_ValueListFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_ValueListFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.ValueListFilter.class,
            com.google.cloud.clouddms.v1.ValueListFilter.Builder.class);
  }

  public static final int VALUE_PRESENT_LIST_FIELD_NUMBER = 1;
  private int valuePresentList_ = 0;

  /**
   *
   *
   * <pre>
   * Required. Indicates whether the filter matches rows with values that are
   * present in the list or those with values not present in it.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ValuePresentInList value_present_list = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for valuePresentList.
   */
  @java.lang.Override
  public int getValuePresentListValue() {
    return valuePresentList_;
  }

  /**
   *
   *
   * <pre>
   * Required. Indicates whether the filter matches rows with values that are
   * present in the list or those with values not present in it.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ValuePresentInList value_present_list = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The valuePresentList.
   */
  @java.lang.Override
  public com.google.cloud.clouddms.v1.ValuePresentInList getValuePresentList() {
    com.google.cloud.clouddms.v1.ValuePresentInList result =
        com.google.cloud.clouddms.v1.ValuePresentInList.forNumber(valuePresentList_);
    return result == null ? com.google.cloud.clouddms.v1.ValuePresentInList.UNRECOGNIZED : result;
  }

  public static final int VALUES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList values_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * Required. The list to be used to filter by
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return A list containing the values.
   */
  public com.google.protobuf.ProtocolStringList getValuesList() {
    return values_;
  }

  /**
   *
   *
   * <pre>
   * Required. The list to be used to filter by
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The count of values.
   */
  public int getValuesCount() {
    return values_.size();
  }

  /**
   *
   *
   * <pre>
   * Required. The list to be used to filter by
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the element to return.
   * @return The values at the given index.
   */
  public java.lang.String getValues(int index) {
    return values_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Required. The list to be used to filter by
   * </pre>
   *
   * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the values at the given index.
   */
  public com.google.protobuf.ByteString getValuesBytes(int index) {
    return values_.getByteString(index);
  }

  public static final int IGNORE_CASE_FIELD_NUMBER = 3;
  private boolean ignoreCase_ = false;

  /**
   *
   *
   * <pre>
   * Required. Whether to ignore case when filtering by values. Defaults to
   * false
   * </pre>
   *
   * <code>bool ignore_case = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The ignoreCase.
   */
  @java.lang.Override
  public boolean getIgnoreCase() {
    return ignoreCase_;
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
    if (valuePresentList_
        != com.google.cloud.clouddms.v1.ValuePresentInList.VALUE_PRESENT_IN_LIST_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, valuePresentList_);
    }
    for (int i = 0; i < values_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, values_.getRaw(i));
    }
    if (ignoreCase_ != false) {
      output.writeBool(3, ignoreCase_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valuePresentList_
        != com.google.cloud.clouddms.v1.ValuePresentInList.VALUE_PRESENT_IN_LIST_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, valuePresentList_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < values_.size(); i++) {
        dataSize += computeStringSizeNoTag(values_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValuesList().size();
    }
    if (ignoreCase_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, ignoreCase_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.ValueListFilter)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.ValueListFilter other =
        (com.google.cloud.clouddms.v1.ValueListFilter) obj;

    if (valuePresentList_ != other.valuePresentList_) return false;
    if (!getValuesList().equals(other.getValuesList())) return false;
    if (getIgnoreCase() != other.getIgnoreCase()) return false;
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
    hash = (37 * hash) + VALUE_PRESENT_LIST_FIELD_NUMBER;
    hash = (53 * hash) + valuePresentList_;
    if (getValuesCount() > 0) {
      hash = (37 * hash) + VALUES_FIELD_NUMBER;
      hash = (53 * hash) + getValuesList().hashCode();
    }
    hash = (37 * hash) + IGNORE_CASE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIgnoreCase());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter parseFrom(
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

  public static Builder newBuilder(com.google.cloud.clouddms.v1.ValueListFilter prototype) {
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
   * A list of values to filter by in ConditionalColumnSetValue
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.ValueListFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.ValueListFilter)
      com.google.cloud.clouddms.v1.ValueListFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_ValueListFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_ValueListFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.ValueListFilter.class,
              com.google.cloud.clouddms.v1.ValueListFilter.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.ValueListFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      valuePresentList_ = 0;
      values_ = com.google.protobuf.LazyStringArrayList.emptyList();
      ignoreCase_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_ValueListFilter_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.ValueListFilter getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.ValueListFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.ValueListFilter build() {
      com.google.cloud.clouddms.v1.ValueListFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.ValueListFilter buildPartial() {
      com.google.cloud.clouddms.v1.ValueListFilter result =
          new com.google.cloud.clouddms.v1.ValueListFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.ValueListFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.valuePresentList_ = valuePresentList_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        values_.makeImmutable();
        result.values_ = values_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ignoreCase_ = ignoreCase_;
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
      if (other instanceof com.google.cloud.clouddms.v1.ValueListFilter) {
        return mergeFrom((com.google.cloud.clouddms.v1.ValueListFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.ValueListFilter other) {
      if (other == com.google.cloud.clouddms.v1.ValueListFilter.getDefaultInstance()) return this;
      if (other.valuePresentList_ != 0) {
        setValuePresentListValue(other.getValuePresentListValue());
      }
      if (!other.values_.isEmpty()) {
        if (values_.isEmpty()) {
          values_ = other.values_;
          bitField0_ |= 0x00000002;
        } else {
          ensureValuesIsMutable();
          values_.addAll(other.values_);
        }
        onChanged();
      }
      if (other.getIgnoreCase() != false) {
        setIgnoreCase(other.getIgnoreCase());
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
                valuePresentList_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureValuesIsMutable();
                values_.add(s);
                break;
              } // case 18
            case 24:
              {
                ignoreCase_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private int valuePresentList_ = 0;

    /**
     *
     *
     * <pre>
     * Required. Indicates whether the filter matches rows with values that are
     * present in the list or those with values not present in it.
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.ValuePresentInList value_present_list = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The enum numeric value on the wire for valuePresentList.
     */
    @java.lang.Override
    public int getValuePresentListValue() {
      return valuePresentList_;
    }

    /**
     *
     *
     * <pre>
     * Required. Indicates whether the filter matches rows with values that are
     * present in the list or those with values not present in it.
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.ValuePresentInList value_present_list = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The enum numeric value on the wire for valuePresentList to set.
     * @return This builder for chaining.
     */
    public Builder setValuePresentListValue(int value) {
      valuePresentList_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Indicates whether the filter matches rows with values that are
     * present in the list or those with values not present in it.
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.ValuePresentInList value_present_list = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The valuePresentList.
     */
    @java.lang.Override
    public com.google.cloud.clouddms.v1.ValuePresentInList getValuePresentList() {
      com.google.cloud.clouddms.v1.ValuePresentInList result =
          com.google.cloud.clouddms.v1.ValuePresentInList.forNumber(valuePresentList_);
      return result == null ? com.google.cloud.clouddms.v1.ValuePresentInList.UNRECOGNIZED : result;
    }

    /**
     *
     *
     * <pre>
     * Required. Indicates whether the filter matches rows with values that are
     * present in the list or those with values not present in it.
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.ValuePresentInList value_present_list = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @param value The valuePresentList to set.
     * @return This builder for chaining.
     */
    public Builder setValuePresentList(com.google.cloud.clouddms.v1.ValuePresentInList value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      valuePresentList_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Indicates whether the filter matches rows with values that are
     * present in the list or those with values not present in it.
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.ValuePresentInList value_present_list = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValuePresentList() {
      bitField0_ = (bitField0_ & ~0x00000001);
      valuePresentList_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList values_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureValuesIsMutable() {
      if (!values_.isModifiable()) {
        values_ = new com.google.protobuf.LazyStringArrayList(values_);
      }
      bitField0_ |= 0x00000002;
    }

    /**
     *
     *
     * <pre>
     * Required. The list to be used to filter by
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return A list containing the values.
     */
    public com.google.protobuf.ProtocolStringList getValuesList() {
      values_.makeImmutable();
      return values_;
    }

    /**
     *
     *
     * <pre>
     * Required. The list to be used to filter by
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The count of values.
     */
    public int getValuesCount() {
      return values_.size();
    }

    /**
     *
     *
     * <pre>
     * Required. The list to be used to filter by
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the element to return.
     * @return The values at the given index.
     */
    public java.lang.String getValues(int index) {
      return values_.get(index);
    }

    /**
     *
     *
     * <pre>
     * Required. The list to be used to filter by
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the values at the given index.
     */
    public com.google.protobuf.ByteString getValuesBytes(int index) {
      return values_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * Required. The list to be used to filter by
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param index The index to set the value at.
     * @param value The values to set.
     * @return This builder for chaining.
     */
    public Builder setValues(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureValuesIsMutable();
      values_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The list to be used to filter by
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The values to add.
     * @return This builder for chaining.
     */
    public Builder addValues(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureValuesIsMutable();
      values_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The list to be used to filter by
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param values The values to add.
     * @return This builder for chaining.
     */
    public Builder addAllValues(java.lang.Iterable<java.lang.String> values) {
      ensureValuesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, values_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The list to be used to filter by
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValues() {
      values_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. The list to be used to filter by
     * </pre>
     *
     * <code>repeated string values = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes of the values to add.
     * @return This builder for chaining.
     */
    public Builder addValuesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureValuesIsMutable();
      values_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private boolean ignoreCase_;

    /**
     *
     *
     * <pre>
     * Required. Whether to ignore case when filtering by values. Defaults to
     * false
     * </pre>
     *
     * <code>bool ignore_case = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The ignoreCase.
     */
    @java.lang.Override
    public boolean getIgnoreCase() {
      return ignoreCase_;
    }

    /**
     *
     *
     * <pre>
     * Required. Whether to ignore case when filtering by values. Defaults to
     * false
     * </pre>
     *
     * <code>bool ignore_case = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The ignoreCase to set.
     * @return This builder for chaining.
     */
    public Builder setIgnoreCase(boolean value) {

      ignoreCase_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Whether to ignore case when filtering by values. Defaults to
     * false
     * </pre>
     *
     * <code>bool ignore_case = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIgnoreCase() {
      bitField0_ = (bitField0_ & ~0x00000004);
      ignoreCase_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.ValueListFilter)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.ValueListFilter)
  private static final com.google.cloud.clouddms.v1.ValueListFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.ValueListFilter();
  }

  public static com.google.cloud.clouddms.v1.ValueListFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValueListFilter> PARSER =
      new com.google.protobuf.AbstractParser<ValueListFilter>() {
        @java.lang.Override
        public ValueListFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<ValueListFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValueListFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.ValueListFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
