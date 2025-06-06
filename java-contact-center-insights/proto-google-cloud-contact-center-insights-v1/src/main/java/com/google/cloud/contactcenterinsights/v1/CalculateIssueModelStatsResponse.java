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
// source: google/cloud/contactcenterinsights/v1/contact_center_insights.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contactcenterinsights.v1;

/**
 *
 *
 * <pre>
 * Response of querying an issue model's statistics.
 * </pre>
 *
 * Protobuf type {@code google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse}
 */
public final class CalculateIssueModelStatsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse)
    CalculateIssueModelStatsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CalculateIssueModelStatsResponse.newBuilder() to construct.
  private CalculateIssueModelStatsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CalculateIssueModelStatsResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CalculateIssueModelStatsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_CalculateIssueModelStatsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
        .internal_static_google_cloud_contactcenterinsights_v1_CalculateIssueModelStatsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse.class,
            com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse.Builder
                .class);
  }

  private int bitField0_;
  public static final int CURRENT_STATS_FIELD_NUMBER = 4;
  private com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats currentStats_;

  /**
   *
   *
   * <pre>
   * The latest label statistics for the queried issue model. Includes results
   * on both training data and data labeled after deployment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
   *
   * @return Whether the currentStats field is set.
   */
  @java.lang.Override
  public boolean hasCurrentStats() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The latest label statistics for the queried issue model. Includes results
   * on both training data and data labeled after deployment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
   *
   * @return The currentStats.
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats getCurrentStats() {
    return currentStats_ == null
        ? com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.getDefaultInstance()
        : currentStats_;
  }

  /**
   *
   *
   * <pre>
   * The latest label statistics for the queried issue model. Includes results
   * on both training data and data labeled after deployment.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
   */
  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.IssueModelLabelStatsOrBuilder
      getCurrentStatsOrBuilder() {
    return currentStats_ == null
        ? com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.getDefaultInstance()
        : currentStats_;
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
      output.writeMessage(4, getCurrentStats());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(4, getCurrentStats());
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
        instanceof com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse other =
        (com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse) obj;

    if (hasCurrentStats() != other.hasCurrentStats()) return false;
    if (hasCurrentStats()) {
      if (!getCurrentStats().equals(other.getCurrentStats())) return false;
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
    if (hasCurrentStats()) {
      hash = (37 * hash) + CURRENT_STATS_FIELD_NUMBER;
      hash = (53 * hash) + getCurrentStats().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
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
      com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse prototype) {
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
   * Response of querying an issue model's statistics.
   * </pre>
   *
   * Protobuf type {@code google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse)
      com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_CalculateIssueModelStatsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_CalculateIssueModelStatsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse.class,
              com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getCurrentStatsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      currentStats_ = null;
      if (currentStatsBuilder_ != null) {
        currentStatsBuilder_.dispose();
        currentStatsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsProto
          .internal_static_google_cloud_contactcenterinsights_v1_CalculateIssueModelStatsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse build() {
      com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
        buildPartial() {
      com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse result =
          new com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.currentStats_ =
            currentStatsBuilder_ == null ? currentStats_ : currentStatsBuilder_.build();
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
      if (other
          instanceof com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse) {
        return mergeFrom(
            (com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse other) {
      if (other
          == com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
              .getDefaultInstance()) return this;
      if (other.hasCurrentStats()) {
        mergeCurrentStats(other.getCurrentStats());
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
            case 34:
              {
                input.readMessage(getCurrentStatsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 34
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

    private com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats currentStats_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats,
            com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.Builder,
            com.google.cloud.contactcenterinsights.v1.IssueModelLabelStatsOrBuilder>
        currentStatsBuilder_;

    /**
     *
     *
     * <pre>
     * The latest label statistics for the queried issue model. Includes results
     * on both training data and data labeled after deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
     *
     * @return Whether the currentStats field is set.
     */
    public boolean hasCurrentStats() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The latest label statistics for the queried issue model. Includes results
     * on both training data and data labeled after deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
     *
     * @return The currentStats.
     */
    public com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats getCurrentStats() {
      if (currentStatsBuilder_ == null) {
        return currentStats_ == null
            ? com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.getDefaultInstance()
            : currentStats_;
      } else {
        return currentStatsBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The latest label statistics for the queried issue model. Includes results
     * on both training data and data labeled after deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
     */
    public Builder setCurrentStats(
        com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats value) {
      if (currentStatsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        currentStats_ = value;
      } else {
        currentStatsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The latest label statistics for the queried issue model. Includes results
     * on both training data and data labeled after deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
     */
    public Builder setCurrentStats(
        com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.Builder builderForValue) {
      if (currentStatsBuilder_ == null) {
        currentStats_ = builderForValue.build();
      } else {
        currentStatsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The latest label statistics for the queried issue model. Includes results
     * on both training data and data labeled after deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
     */
    public Builder mergeCurrentStats(
        com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats value) {
      if (currentStatsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && currentStats_ != null
            && currentStats_
                != com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats
                    .getDefaultInstance()) {
          getCurrentStatsBuilder().mergeFrom(value);
        } else {
          currentStats_ = value;
        }
      } else {
        currentStatsBuilder_.mergeFrom(value);
      }
      if (currentStats_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The latest label statistics for the queried issue model. Includes results
     * on both training data and data labeled after deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
     */
    public Builder clearCurrentStats() {
      bitField0_ = (bitField0_ & ~0x00000001);
      currentStats_ = null;
      if (currentStatsBuilder_ != null) {
        currentStatsBuilder_.dispose();
        currentStatsBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The latest label statistics for the queried issue model. Includes results
     * on both training data and data labeled after deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.Builder
        getCurrentStatsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getCurrentStatsFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The latest label statistics for the queried issue model. Includes results
     * on both training data and data labeled after deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
     */
    public com.google.cloud.contactcenterinsights.v1.IssueModelLabelStatsOrBuilder
        getCurrentStatsOrBuilder() {
      if (currentStatsBuilder_ != null) {
        return currentStatsBuilder_.getMessageOrBuilder();
      } else {
        return currentStats_ == null
            ? com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.getDefaultInstance()
            : currentStats_;
      }
    }

    /**
     *
     *
     * <pre>
     * The latest label statistics for the queried issue model. Includes results
     * on both training data and data labeled after deployment.
     * </pre>
     *
     * <code>.google.cloud.contactcenterinsights.v1.IssueModelLabelStats current_stats = 4;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats,
            com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.Builder,
            com.google.cloud.contactcenterinsights.v1.IssueModelLabelStatsOrBuilder>
        getCurrentStatsFieldBuilder() {
      if (currentStatsBuilder_ == null) {
        currentStatsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats,
                com.google.cloud.contactcenterinsights.v1.IssueModelLabelStats.Builder,
                com.google.cloud.contactcenterinsights.v1.IssueModelLabelStatsOrBuilder>(
                getCurrentStats(), getParentForChildren(), isClean());
        currentStats_ = null;
      }
      return currentStatsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse)
  private static final com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse();
  }

  public static com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CalculateIssueModelStatsResponse> PARSER =
      new com.google.protobuf.AbstractParser<CalculateIssueModelStatsResponse>() {
        @java.lang.Override
        public CalculateIssueModelStatsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<CalculateIssueModelStatsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CalculateIssueModelStatsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.contactcenterinsights.v1.CalculateIssueModelStatsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
