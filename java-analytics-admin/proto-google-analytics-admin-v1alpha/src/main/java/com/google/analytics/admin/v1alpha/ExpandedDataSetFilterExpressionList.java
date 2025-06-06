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
// source: google/analytics/admin/v1alpha/expanded_data_set.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * A list of ExpandedDataSet filter expressions.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList}
 */
public final class ExpandedDataSetFilterExpressionList
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList)
    ExpandedDataSetFilterExpressionListOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ExpandedDataSetFilterExpressionList.newBuilder() to construct.
  private ExpandedDataSetFilterExpressionList(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ExpandedDataSetFilterExpressionList() {
    filterExpressions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ExpandedDataSetFilterExpressionList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.ExpandedDataSetProto
        .internal_static_google_analytics_admin_v1alpha_ExpandedDataSetFilterExpressionList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.ExpandedDataSetProto
        .internal_static_google_analytics_admin_v1alpha_ExpandedDataSetFilterExpressionList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList.class,
            com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList.Builder.class);
  }

  public static final int FILTER_EXPRESSIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression>
      filterExpressions_;

  /**
   *
   *
   * <pre>
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression>
      getFilterExpressionsList() {
    return filterExpressions_;
  }

  /**
   *
   *
   * <pre>
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
   * </code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionOrBuilder>
      getFilterExpressionsOrBuilderList() {
    return filterExpressions_;
  }

  /**
   *
   *
   * <pre>
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
   * </code>
   */
  @java.lang.Override
  public int getFilterExpressionsCount() {
    return filterExpressions_.size();
  }

  /**
   *
   *
   * <pre>
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression getFilterExpressions(
      int index) {
    return filterExpressions_.get(index);
  }

  /**
   *
   *
   * <pre>
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
   * </code>
   */
  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionOrBuilder
      getFilterExpressionsOrBuilder(int index) {
    return filterExpressions_.get(index);
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
    for (int i = 0; i < filterExpressions_.size(); i++) {
      output.writeMessage(1, filterExpressions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < filterExpressions_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, filterExpressions_.get(i));
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
    if (!(obj instanceof com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList other =
        (com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList) obj;

    if (!getFilterExpressionsList().equals(other.getFilterExpressionsList())) return false;
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
    if (getFilterExpressionsCount() > 0) {
      hash = (37 * hash) + FILTER_EXPRESSIONS_FIELD_NUMBER;
      hash = (53 * hash) + getFilterExpressionsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList parseFrom(
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
      com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList prototype) {
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
   * A list of ExpandedDataSet filter expressions.
   * </pre>
   *
   * Protobuf type {@code google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList)
      com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.ExpandedDataSetProto
          .internal_static_google_analytics_admin_v1alpha_ExpandedDataSetFilterExpressionList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.ExpandedDataSetProto
          .internal_static_google_analytics_admin_v1alpha_ExpandedDataSetFilterExpressionList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList.class,
              com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList.Builder.class);
    }

    // Construct using
    // com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (filterExpressionsBuilder_ == null) {
        filterExpressions_ = java.util.Collections.emptyList();
      } else {
        filterExpressions_ = null;
        filterExpressionsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.ExpandedDataSetProto
          .internal_static_google_analytics_admin_v1alpha_ExpandedDataSetFilterExpressionList_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList build() {
      com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList buildPartial() {
      com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList result =
          new com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList result) {
      if (filterExpressionsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          filterExpressions_ = java.util.Collections.unmodifiableList(filterExpressions_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.filterExpressions_ = filterExpressions_;
      } else {
        result.filterExpressions_ = filterExpressionsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList result) {
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
      if (other instanceof com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList) {
        return mergeFrom(
            (com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList other) {
      if (other
          == com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList
              .getDefaultInstance()) return this;
      if (filterExpressionsBuilder_ == null) {
        if (!other.filterExpressions_.isEmpty()) {
          if (filterExpressions_.isEmpty()) {
            filterExpressions_ = other.filterExpressions_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFilterExpressionsIsMutable();
            filterExpressions_.addAll(other.filterExpressions_);
          }
          onChanged();
        }
      } else {
        if (!other.filterExpressions_.isEmpty()) {
          if (filterExpressionsBuilder_.isEmpty()) {
            filterExpressionsBuilder_.dispose();
            filterExpressionsBuilder_ = null;
            filterExpressions_ = other.filterExpressions_;
            bitField0_ = (bitField0_ & ~0x00000001);
            filterExpressionsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getFilterExpressionsFieldBuilder()
                    : null;
          } else {
            filterExpressionsBuilder_.addAllMessages(other.filterExpressions_);
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
                com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression m =
                    input.readMessage(
                        com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.parser(),
                        extensionRegistry);
                if (filterExpressionsBuilder_ == null) {
                  ensureFilterExpressionsIsMutable();
                  filterExpressions_.add(m);
                } else {
                  filterExpressionsBuilder_.addMessage(m);
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

    private java.util.List<com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression>
        filterExpressions_ = java.util.Collections.emptyList();

    private void ensureFilterExpressionsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        filterExpressions_ =
            new java.util.ArrayList<
                com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression>(
                filterExpressions_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression,
            com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.Builder,
            com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionOrBuilder>
        filterExpressionsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public java.util.List<com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression>
        getFilterExpressionsList() {
      if (filterExpressionsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(filterExpressions_);
      } else {
        return filterExpressionsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public int getFilterExpressionsCount() {
      if (filterExpressionsBuilder_ == null) {
        return filterExpressions_.size();
      } else {
        return filterExpressionsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression getFilterExpressions(
        int index) {
      if (filterExpressionsBuilder_ == null) {
        return filterExpressions_.get(index);
      } else {
        return filterExpressionsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public Builder setFilterExpressions(
        int index, com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression value) {
      if (filterExpressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilterExpressionsIsMutable();
        filterExpressions_.set(index, value);
        onChanged();
      } else {
        filterExpressionsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public Builder setFilterExpressions(
        int index,
        com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.Builder
            builderForValue) {
      if (filterExpressionsBuilder_ == null) {
        ensureFilterExpressionsIsMutable();
        filterExpressions_.set(index, builderForValue.build());
        onChanged();
      } else {
        filterExpressionsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public Builder addFilterExpressions(
        com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression value) {
      if (filterExpressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilterExpressionsIsMutable();
        filterExpressions_.add(value);
        onChanged();
      } else {
        filterExpressionsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public Builder addFilterExpressions(
        int index, com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression value) {
      if (filterExpressionsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFilterExpressionsIsMutable();
        filterExpressions_.add(index, value);
        onChanged();
      } else {
        filterExpressionsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public Builder addFilterExpressions(
        com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.Builder
            builderForValue) {
      if (filterExpressionsBuilder_ == null) {
        ensureFilterExpressionsIsMutable();
        filterExpressions_.add(builderForValue.build());
        onChanged();
      } else {
        filterExpressionsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public Builder addFilterExpressions(
        int index,
        com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.Builder
            builderForValue) {
      if (filterExpressionsBuilder_ == null) {
        ensureFilterExpressionsIsMutable();
        filterExpressions_.add(index, builderForValue.build());
        onChanged();
      } else {
        filterExpressionsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public Builder addAllFilterExpressions(
        java.lang.Iterable<
                ? extends com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression>
            values) {
      if (filterExpressionsBuilder_ == null) {
        ensureFilterExpressionsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, filterExpressions_);
        onChanged();
      } else {
        filterExpressionsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public Builder clearFilterExpressions() {
      if (filterExpressionsBuilder_ == null) {
        filterExpressions_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        filterExpressionsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public Builder removeFilterExpressions(int index) {
      if (filterExpressionsBuilder_ == null) {
        ensureFilterExpressionsIsMutable();
        filterExpressions_.remove(index);
        onChanged();
      } else {
        filterExpressionsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.Builder
        getFilterExpressionsBuilder(int index) {
      return getFilterExpressionsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionOrBuilder
        getFilterExpressionsOrBuilder(int index) {
      if (filterExpressionsBuilder_ == null) {
        return filterExpressions_.get(index);
      } else {
        return filterExpressionsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public java.util.List<
            ? extends com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionOrBuilder>
        getFilterExpressionsOrBuilderList() {
      if (filterExpressionsBuilder_ != null) {
        return filterExpressionsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(filterExpressions_);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.Builder
        addFilterExpressionsBuilder() {
      return getFilterExpressionsFieldBuilder()
          .addBuilder(
              com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression
                  .getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.Builder
        addFilterExpressionsBuilder(int index) {
      return getFilterExpressionsFieldBuilder()
          .addBuilder(
              index,
              com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression
                  .getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of ExpandedDataSet filter expressions.
     * </pre>
     *
     * <code>
     * repeated .google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression filter_expressions = 1;
     * </code>
     */
    public java.util.List<
            com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.Builder>
        getFilterExpressionsBuilderList() {
      return getFilterExpressionsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression,
            com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.Builder,
            com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionOrBuilder>
        getFilterExpressionsFieldBuilder() {
      if (filterExpressionsBuilder_ == null) {
        filterExpressionsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression,
                com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpression.Builder,
                com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionOrBuilder>(
                filterExpressions_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        filterExpressions_ = null;
      }
      return filterExpressionsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList)
  private static final com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList();
  }

  public static com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExpandedDataSetFilterExpressionList> PARSER =
      new com.google.protobuf.AbstractParser<ExpandedDataSetFilterExpressionList>() {
        @java.lang.Override
        public ExpandedDataSetFilterExpressionList parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExpandedDataSetFilterExpressionList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExpandedDataSetFilterExpressionList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.ExpandedDataSetFilterExpressionList
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
