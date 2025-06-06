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
// source: google/analytics/admin/v1alpha/audience.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * A filter that matches events of a single event name. If an event parameter
 * is specified, only the subset of events that match both the single event name
 * and the parameter filter expressions match this event filter.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.AudienceEventFilter}
 */
public final class AudienceEventFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.AudienceEventFilter)
    AudienceEventFilterOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AudienceEventFilter.newBuilder() to construct.
  private AudienceEventFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AudienceEventFilter() {
    eventName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AudienceEventFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AudienceProto
        .internal_static_google_analytics_admin_v1alpha_AudienceEventFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AudienceProto
        .internal_static_google_analytics_admin_v1alpha_AudienceEventFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.AudienceEventFilter.class,
            com.google.analytics.admin.v1alpha.AudienceEventFilter.Builder.class);
  }

  private int bitField0_;
  public static final int EVENT_NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object eventName_ = "";

  /**
   *
   *
   * <pre>
   * Required. Immutable. The name of the event to match against.
   * </pre>
   *
   * <code>
   * string event_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The eventName.
   */
  @java.lang.Override
  public java.lang.String getEventName() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      eventName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Required. Immutable. The name of the event to match against.
   * </pre>
   *
   * <code>
   * string event_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The bytes for eventName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEventNameBytes() {
    java.lang.Object ref = eventName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      eventName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVENT_PARAMETER_FILTER_EXPRESSION_FIELD_NUMBER = 2;
  private com.google.analytics.admin.v1alpha.AudienceFilterExpression
      eventParameterFilterExpression_;

  /**
   *
   *
   * <pre>
   * Optional. If specified, this filter matches events that match both the
   * single event name and the parameter filter expressions. AudienceEventFilter
   * inside the parameter filter expression cannot be set (For example, nested
   * event filters are not supported). This should be a single and_group of
   * dimension_or_metric_filter or not_expression; ANDs of ORs are not
   * supported. Also, if it includes a filter for "eventCount", only that one
   * will be considered; all the other filters will be ignored.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the eventParameterFilterExpression field is set.
   */
  @java.lang.Override
  public boolean hasEventParameterFilterExpression() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. If specified, this filter matches events that match both the
   * single event name and the parameter filter expressions. AudienceEventFilter
   * inside the parameter filter expression cannot be set (For example, nested
   * event filters are not supported). This should be a single and_group of
   * dimension_or_metric_filter or not_expression; ANDs of ORs are not
   * supported. Also, if it includes a filter for "eventCount", only that one
   * will be considered; all the other filters will be ignored.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The eventParameterFilterExpression.
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceFilterExpression
      getEventParameterFilterExpression() {
    return eventParameterFilterExpression_ == null
        ? com.google.analytics.admin.v1alpha.AudienceFilterExpression.getDefaultInstance()
        : eventParameterFilterExpression_;
  }

  /**
   *
   *
   * <pre>
   * Optional. If specified, this filter matches events that match both the
   * single event name and the parameter filter expressions. AudienceEventFilter
   * inside the parameter filter expression cannot be set (For example, nested
   * event filters are not supported). This should be a single and_group of
   * dimension_or_metric_filter or not_expression; ANDs of ORs are not
   * supported. Also, if it includes a filter for "eventCount", only that one
   * will be considered; all the other filters will be ignored.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder
      getEventParameterFilterExpressionOrBuilder() {
    return eventParameterFilterExpression_ == null
        ? com.google.analytics.admin.v1alpha.AudienceFilterExpression.getDefaultInstance()
        : eventParameterFilterExpression_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, eventName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getEventParameterFilterExpression());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(eventName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, eventName_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              2, getEventParameterFilterExpression());
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.AudienceEventFilter)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.AudienceEventFilter other =
        (com.google.analytics.admin.v1alpha.AudienceEventFilter) obj;

    if (!getEventName().equals(other.getEventName())) return false;
    if (hasEventParameterFilterExpression() != other.hasEventParameterFilterExpression())
      return false;
    if (hasEventParameterFilterExpression()) {
      if (!getEventParameterFilterExpression().equals(other.getEventParameterFilterExpression()))
        return false;
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
    hash = (37 * hash) + EVENT_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getEventName().hashCode();
    if (hasEventParameterFilterExpression()) {
      hash = (37 * hash) + EVENT_PARAMETER_FILTER_EXPRESSION_FIELD_NUMBER;
      hash = (53 * hash) + getEventParameterFilterExpression().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter parseFrom(
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
      com.google.analytics.admin.v1alpha.AudienceEventFilter prototype) {
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
   * A filter that matches events of a single event name. If an event parameter
   * is specified, only the subset of events that match both the single event name
   * and the parameter filter expressions match this event filter.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.AudienceEventFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.AudienceEventFilter)
      com.google.analytics.admin.v1alpha.AudienceEventFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AudienceProto
          .internal_static_google_analytics_admin_v1alpha_AudienceEventFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AudienceProto
          .internal_static_google_analytics_admin_v1alpha_AudienceEventFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.AudienceEventFilter.class,
              com.google.analytics.admin.v1alpha.AudienceEventFilter.Builder.class);
    }

    // Construct using com.google.analytics.admin.v1alpha.AudienceEventFilter.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEventParameterFilterExpressionFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      eventName_ = "";
      eventParameterFilterExpression_ = null;
      if (eventParameterFilterExpressionBuilder_ != null) {
        eventParameterFilterExpressionBuilder_.dispose();
        eventParameterFilterExpressionBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AudienceProto
          .internal_static_google_analytics_admin_v1alpha_AudienceEventFilter_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceEventFilter getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.AudienceEventFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceEventFilter build() {
      com.google.analytics.admin.v1alpha.AudienceEventFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.AudienceEventFilter buildPartial() {
      com.google.analytics.admin.v1alpha.AudienceEventFilter result =
          new com.google.analytics.admin.v1alpha.AudienceEventFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.admin.v1alpha.AudienceEventFilter result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.eventName_ = eventName_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.eventParameterFilterExpression_ =
            eventParameterFilterExpressionBuilder_ == null
                ? eventParameterFilterExpression_
                : eventParameterFilterExpressionBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.analytics.admin.v1alpha.AudienceEventFilter) {
        return mergeFrom((com.google.analytics.admin.v1alpha.AudienceEventFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.admin.v1alpha.AudienceEventFilter other) {
      if (other == com.google.analytics.admin.v1alpha.AudienceEventFilter.getDefaultInstance())
        return this;
      if (!other.getEventName().isEmpty()) {
        eventName_ = other.eventName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEventParameterFilterExpression()) {
        mergeEventParameterFilterExpression(other.getEventParameterFilterExpression());
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
                eventName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(
                    getEventParameterFilterExpressionFieldBuilder().getBuilder(),
                    extensionRegistry);
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

    private java.lang.Object eventName_ = "";

    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the event to match against.
     * </pre>
     *
     * <code>
     * string event_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The eventName.
     */
    public java.lang.String getEventName() {
      java.lang.Object ref = eventName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        eventName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the event to match against.
     * </pre>
     *
     * <code>
     * string event_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The bytes for eventName.
     */
    public com.google.protobuf.ByteString getEventNameBytes() {
      java.lang.Object ref = eventName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        eventName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the event to match against.
     * </pre>
     *
     * <code>
     * string event_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      eventName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the event to match against.
     * </pre>
     *
     * <code>
     * string event_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEventName() {
      eventName_ = getDefaultInstance().getEventName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The name of the event to match against.
     * </pre>
     *
     * <code>
     * string event_name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The bytes for eventName to set.
     * @return This builder for chaining.
     */
    public Builder setEventNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      eventName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.analytics.admin.v1alpha.AudienceFilterExpression
        eventParameterFilterExpression_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AudienceFilterExpression,
            com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder,
            com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder>
        eventParameterFilterExpressionBuilder_;

    /**
     *
     *
     * <pre>
     * Optional. If specified, this filter matches events that match both the
     * single event name and the parameter filter expressions. AudienceEventFilter
     * inside the parameter filter expression cannot be set (For example, nested
     * event filters are not supported). This should be a single and_group of
     * dimension_or_metric_filter or not_expression; ANDs of ORs are not
     * supported. Also, if it includes a filter for "eventCount", only that one
     * will be considered; all the other filters will be ignored.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the eventParameterFilterExpression field is set.
     */
    public boolean hasEventParameterFilterExpression() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. If specified, this filter matches events that match both the
     * single event name and the parameter filter expressions. AudienceEventFilter
     * inside the parameter filter expression cannot be set (For example, nested
     * event filters are not supported). This should be a single and_group of
     * dimension_or_metric_filter or not_expression; ANDs of ORs are not
     * supported. Also, if it includes a filter for "eventCount", only that one
     * will be considered; all the other filters will be ignored.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The eventParameterFilterExpression.
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpression
        getEventParameterFilterExpression() {
      if (eventParameterFilterExpressionBuilder_ == null) {
        return eventParameterFilterExpression_ == null
            ? com.google.analytics.admin.v1alpha.AudienceFilterExpression.getDefaultInstance()
            : eventParameterFilterExpression_;
      } else {
        return eventParameterFilterExpressionBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. If specified, this filter matches events that match both the
     * single event name and the parameter filter expressions. AudienceEventFilter
     * inside the parameter filter expression cannot be set (For example, nested
     * event filters are not supported). This should be a single and_group of
     * dimension_or_metric_filter or not_expression; ANDs of ORs are not
     * supported. Also, if it includes a filter for "eventCount", only that one
     * will be considered; all the other filters will be ignored.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setEventParameterFilterExpression(
        com.google.analytics.admin.v1alpha.AudienceFilterExpression value) {
      if (eventParameterFilterExpressionBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        eventParameterFilterExpression_ = value;
      } else {
        eventParameterFilterExpressionBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If specified, this filter matches events that match both the
     * single event name and the parameter filter expressions. AudienceEventFilter
     * inside the parameter filter expression cannot be set (For example, nested
     * event filters are not supported). This should be a single and_group of
     * dimension_or_metric_filter or not_expression; ANDs of ORs are not
     * supported. Also, if it includes a filter for "eventCount", only that one
     * will be considered; all the other filters will be ignored.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setEventParameterFilterExpression(
        com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder builderForValue) {
      if (eventParameterFilterExpressionBuilder_ == null) {
        eventParameterFilterExpression_ = builderForValue.build();
      } else {
        eventParameterFilterExpressionBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If specified, this filter matches events that match both the
     * single event name and the parameter filter expressions. AudienceEventFilter
     * inside the parameter filter expression cannot be set (For example, nested
     * event filters are not supported). This should be a single and_group of
     * dimension_or_metric_filter or not_expression; ANDs of ORs are not
     * supported. Also, if it includes a filter for "eventCount", only that one
     * will be considered; all the other filters will be ignored.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeEventParameterFilterExpression(
        com.google.analytics.admin.v1alpha.AudienceFilterExpression value) {
      if (eventParameterFilterExpressionBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && eventParameterFilterExpression_ != null
            && eventParameterFilterExpression_
                != com.google.analytics.admin.v1alpha.AudienceFilterExpression
                    .getDefaultInstance()) {
          getEventParameterFilterExpressionBuilder().mergeFrom(value);
        } else {
          eventParameterFilterExpression_ = value;
        }
      } else {
        eventParameterFilterExpressionBuilder_.mergeFrom(value);
      }
      if (eventParameterFilterExpression_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If specified, this filter matches events that match both the
     * single event name and the parameter filter expressions. AudienceEventFilter
     * inside the parameter filter expression cannot be set (For example, nested
     * event filters are not supported). This should be a single and_group of
     * dimension_or_metric_filter or not_expression; ANDs of ORs are not
     * supported. Also, if it includes a filter for "eventCount", only that one
     * will be considered; all the other filters will be ignored.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearEventParameterFilterExpression() {
      bitField0_ = (bitField0_ & ~0x00000002);
      eventParameterFilterExpression_ = null;
      if (eventParameterFilterExpressionBuilder_ != null) {
        eventParameterFilterExpressionBuilder_.dispose();
        eventParameterFilterExpressionBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. If specified, this filter matches events that match both the
     * single event name and the parameter filter expressions. AudienceEventFilter
     * inside the parameter filter expression cannot be set (For example, nested
     * event filters are not supported). This should be a single and_group of
     * dimension_or_metric_filter or not_expression; ANDs of ORs are not
     * supported. Also, if it includes a filter for "eventCount", only that one
     * will be considered; all the other filters will be ignored.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder
        getEventParameterFilterExpressionBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEventParameterFilterExpressionFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Optional. If specified, this filter matches events that match both the
     * single event name and the parameter filter expressions. AudienceEventFilter
     * inside the parameter filter expression cannot be set (For example, nested
     * event filters are not supported). This should be a single and_group of
     * dimension_or_metric_filter or not_expression; ANDs of ORs are not
     * supported. Also, if it includes a filter for "eventCount", only that one
     * will be considered; all the other filters will be ignored.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder
        getEventParameterFilterExpressionOrBuilder() {
      if (eventParameterFilterExpressionBuilder_ != null) {
        return eventParameterFilterExpressionBuilder_.getMessageOrBuilder();
      } else {
        return eventParameterFilterExpression_ == null
            ? com.google.analytics.admin.v1alpha.AudienceFilterExpression.getDefaultInstance()
            : eventParameterFilterExpression_;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. If specified, this filter matches events that match both the
     * single event name and the parameter filter expressions. AudienceEventFilter
     * inside the parameter filter expression cannot be set (For example, nested
     * event filters are not supported). This should be a single and_group of
     * dimension_or_metric_filter or not_expression; ANDs of ORs are not
     * supported. Also, if it includes a filter for "eventCount", only that one
     * will be considered; all the other filters will be ignored.
     * </pre>
     *
     * <code>
     * .google.analytics.admin.v1alpha.AudienceFilterExpression event_parameter_filter_expression = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.admin.v1alpha.AudienceFilterExpression,
            com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder,
            com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder>
        getEventParameterFilterExpressionFieldBuilder() {
      if (eventParameterFilterExpressionBuilder_ == null) {
        eventParameterFilterExpressionBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.admin.v1alpha.AudienceFilterExpression,
                com.google.analytics.admin.v1alpha.AudienceFilterExpression.Builder,
                com.google.analytics.admin.v1alpha.AudienceFilterExpressionOrBuilder>(
                getEventParameterFilterExpression(), getParentForChildren(), isClean());
        eventParameterFilterExpression_ = null;
      }
      return eventParameterFilterExpressionBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.AudienceEventFilter)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.AudienceEventFilter)
  private static final com.google.analytics.admin.v1alpha.AudienceEventFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.AudienceEventFilter();
  }

  public static com.google.analytics.admin.v1alpha.AudienceEventFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AudienceEventFilter> PARSER =
      new com.google.protobuf.AbstractParser<AudienceEventFilter>() {
        @java.lang.Override
        public AudienceEventFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<AudienceEventFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AudienceEventFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.AudienceEventFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
