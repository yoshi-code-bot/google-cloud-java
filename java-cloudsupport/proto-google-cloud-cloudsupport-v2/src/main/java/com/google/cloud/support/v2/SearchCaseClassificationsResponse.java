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
// source: google/cloud/support/v2/case_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.support.v2;

/**
 *
 *
 * <pre>
 * The response message for SearchCaseClassifications endpoint.
 * </pre>
 *
 * Protobuf type {@code google.cloud.support.v2.SearchCaseClassificationsResponse}
 */
public final class SearchCaseClassificationsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.support.v2.SearchCaseClassificationsResponse)
    SearchCaseClassificationsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SearchCaseClassificationsResponse.newBuilder() to construct.
  private SearchCaseClassificationsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SearchCaseClassificationsResponse() {
    caseClassifications_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SearchCaseClassificationsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.support.v2.CaseServiceProto
        .internal_static_google_cloud_support_v2_SearchCaseClassificationsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.support.v2.CaseServiceProto
        .internal_static_google_cloud_support_v2_SearchCaseClassificationsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.support.v2.SearchCaseClassificationsResponse.class,
            com.google.cloud.support.v2.SearchCaseClassificationsResponse.Builder.class);
  }

  public static final int CASE_CLASSIFICATIONS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.support.v2.CaseClassification> caseClassifications_;

  /**
   *
   *
   * <pre>
   * The classifications retrieved.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.support.v2.CaseClassification>
      getCaseClassificationsList() {
    return caseClassifications_;
  }

  /**
   *
   *
   * <pre>
   * The classifications retrieved.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.support.v2.CaseClassificationOrBuilder>
      getCaseClassificationsOrBuilderList() {
    return caseClassifications_;
  }

  /**
   *
   *
   * <pre>
   * The classifications retrieved.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
   */
  @java.lang.Override
  public int getCaseClassificationsCount() {
    return caseClassifications_.size();
  }

  /**
   *
   *
   * <pre>
   * The classifications retrieved.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.support.v2.CaseClassification getCaseClassifications(int index) {
    return caseClassifications_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The classifications retrieved.
   * </pre>
   *
   * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.support.v2.CaseClassificationOrBuilder getCaseClassificationsOrBuilder(
      int index) {
    return caseClassifications_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. Set this in the `page_token`
   * field of subsequent `caseClassifications.list` requests. If unspecified,
   * there are no more results to retrieve.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * A token to retrieve the next page of results. Set this in the `page_token`
   * field of subsequent `caseClassifications.list` requests. If unspecified,
   * there are no more results to retrieve.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
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
    for (int i = 0; i < caseClassifications_.size(); i++) {
      output.writeMessage(1, caseClassifications_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < caseClassifications_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, caseClassifications_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.support.v2.SearchCaseClassificationsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.support.v2.SearchCaseClassificationsResponse other =
        (com.google.cloud.support.v2.SearchCaseClassificationsResponse) obj;

    if (!getCaseClassificationsList().equals(other.getCaseClassificationsList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getCaseClassificationsCount() > 0) {
      hash = (37 * hash) + CASE_CLASSIFICATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getCaseClassificationsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse parseFrom(
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
      com.google.cloud.support.v2.SearchCaseClassificationsResponse prototype) {
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
   * The response message for SearchCaseClassifications endpoint.
   * </pre>
   *
   * Protobuf type {@code google.cloud.support.v2.SearchCaseClassificationsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.support.v2.SearchCaseClassificationsResponse)
      com.google.cloud.support.v2.SearchCaseClassificationsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.support.v2.CaseServiceProto
          .internal_static_google_cloud_support_v2_SearchCaseClassificationsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.support.v2.CaseServiceProto
          .internal_static_google_cloud_support_v2_SearchCaseClassificationsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.support.v2.SearchCaseClassificationsResponse.class,
              com.google.cloud.support.v2.SearchCaseClassificationsResponse.Builder.class);
    }

    // Construct using com.google.cloud.support.v2.SearchCaseClassificationsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (caseClassificationsBuilder_ == null) {
        caseClassifications_ = java.util.Collections.emptyList();
      } else {
        caseClassifications_ = null;
        caseClassificationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.support.v2.CaseServiceProto
          .internal_static_google_cloud_support_v2_SearchCaseClassificationsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.support.v2.SearchCaseClassificationsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.support.v2.SearchCaseClassificationsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.support.v2.SearchCaseClassificationsResponse build() {
      com.google.cloud.support.v2.SearchCaseClassificationsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.support.v2.SearchCaseClassificationsResponse buildPartial() {
      com.google.cloud.support.v2.SearchCaseClassificationsResponse result =
          new com.google.cloud.support.v2.SearchCaseClassificationsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.support.v2.SearchCaseClassificationsResponse result) {
      if (caseClassificationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          caseClassifications_ = java.util.Collections.unmodifiableList(caseClassifications_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.caseClassifications_ = caseClassifications_;
      } else {
        result.caseClassifications_ = caseClassificationsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.support.v2.SearchCaseClassificationsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.support.v2.SearchCaseClassificationsResponse) {
        return mergeFrom((com.google.cloud.support.v2.SearchCaseClassificationsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.support.v2.SearchCaseClassificationsResponse other) {
      if (other
          == com.google.cloud.support.v2.SearchCaseClassificationsResponse.getDefaultInstance())
        return this;
      if (caseClassificationsBuilder_ == null) {
        if (!other.caseClassifications_.isEmpty()) {
          if (caseClassifications_.isEmpty()) {
            caseClassifications_ = other.caseClassifications_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCaseClassificationsIsMutable();
            caseClassifications_.addAll(other.caseClassifications_);
          }
          onChanged();
        }
      } else {
        if (!other.caseClassifications_.isEmpty()) {
          if (caseClassificationsBuilder_.isEmpty()) {
            caseClassificationsBuilder_.dispose();
            caseClassificationsBuilder_ = null;
            caseClassifications_ = other.caseClassifications_;
            bitField0_ = (bitField0_ & ~0x00000001);
            caseClassificationsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getCaseClassificationsFieldBuilder()
                    : null;
          } else {
            caseClassificationsBuilder_.addAllMessages(other.caseClassifications_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
                com.google.cloud.support.v2.CaseClassification m =
                    input.readMessage(
                        com.google.cloud.support.v2.CaseClassification.parser(), extensionRegistry);
                if (caseClassificationsBuilder_ == null) {
                  ensureCaseClassificationsIsMutable();
                  caseClassifications_.add(m);
                } else {
                  caseClassificationsBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.support.v2.CaseClassification> caseClassifications_ =
        java.util.Collections.emptyList();

    private void ensureCaseClassificationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        caseClassifications_ =
            new java.util.ArrayList<com.google.cloud.support.v2.CaseClassification>(
                caseClassifications_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.support.v2.CaseClassification,
            com.google.cloud.support.v2.CaseClassification.Builder,
            com.google.cloud.support.v2.CaseClassificationOrBuilder>
        caseClassificationsBuilder_;

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public java.util.List<com.google.cloud.support.v2.CaseClassification>
        getCaseClassificationsList() {
      if (caseClassificationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(caseClassifications_);
      } else {
        return caseClassificationsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public int getCaseClassificationsCount() {
      if (caseClassificationsBuilder_ == null) {
        return caseClassifications_.size();
      } else {
        return caseClassificationsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public com.google.cloud.support.v2.CaseClassification getCaseClassifications(int index) {
      if (caseClassificationsBuilder_ == null) {
        return caseClassifications_.get(index);
      } else {
        return caseClassificationsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public Builder setCaseClassifications(
        int index, com.google.cloud.support.v2.CaseClassification value) {
      if (caseClassificationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCaseClassificationsIsMutable();
        caseClassifications_.set(index, value);
        onChanged();
      } else {
        caseClassificationsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public Builder setCaseClassifications(
        int index, com.google.cloud.support.v2.CaseClassification.Builder builderForValue) {
      if (caseClassificationsBuilder_ == null) {
        ensureCaseClassificationsIsMutable();
        caseClassifications_.set(index, builderForValue.build());
        onChanged();
      } else {
        caseClassificationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public Builder addCaseClassifications(com.google.cloud.support.v2.CaseClassification value) {
      if (caseClassificationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCaseClassificationsIsMutable();
        caseClassifications_.add(value);
        onChanged();
      } else {
        caseClassificationsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public Builder addCaseClassifications(
        int index, com.google.cloud.support.v2.CaseClassification value) {
      if (caseClassificationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCaseClassificationsIsMutable();
        caseClassifications_.add(index, value);
        onChanged();
      } else {
        caseClassificationsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public Builder addCaseClassifications(
        com.google.cloud.support.v2.CaseClassification.Builder builderForValue) {
      if (caseClassificationsBuilder_ == null) {
        ensureCaseClassificationsIsMutable();
        caseClassifications_.add(builderForValue.build());
        onChanged();
      } else {
        caseClassificationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public Builder addCaseClassifications(
        int index, com.google.cloud.support.v2.CaseClassification.Builder builderForValue) {
      if (caseClassificationsBuilder_ == null) {
        ensureCaseClassificationsIsMutable();
        caseClassifications_.add(index, builderForValue.build());
        onChanged();
      } else {
        caseClassificationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public Builder addAllCaseClassifications(
        java.lang.Iterable<? extends com.google.cloud.support.v2.CaseClassification> values) {
      if (caseClassificationsBuilder_ == null) {
        ensureCaseClassificationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, caseClassifications_);
        onChanged();
      } else {
        caseClassificationsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public Builder clearCaseClassifications() {
      if (caseClassificationsBuilder_ == null) {
        caseClassifications_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        caseClassificationsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public Builder removeCaseClassifications(int index) {
      if (caseClassificationsBuilder_ == null) {
        ensureCaseClassificationsIsMutable();
        caseClassifications_.remove(index);
        onChanged();
      } else {
        caseClassificationsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public com.google.cloud.support.v2.CaseClassification.Builder getCaseClassificationsBuilder(
        int index) {
      return getCaseClassificationsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public com.google.cloud.support.v2.CaseClassificationOrBuilder getCaseClassificationsOrBuilder(
        int index) {
      if (caseClassificationsBuilder_ == null) {
        return caseClassifications_.get(index);
      } else {
        return caseClassificationsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.support.v2.CaseClassificationOrBuilder>
        getCaseClassificationsOrBuilderList() {
      if (caseClassificationsBuilder_ != null) {
        return caseClassificationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(caseClassifications_);
      }
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public com.google.cloud.support.v2.CaseClassification.Builder addCaseClassificationsBuilder() {
      return getCaseClassificationsFieldBuilder()
          .addBuilder(com.google.cloud.support.v2.CaseClassification.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public com.google.cloud.support.v2.CaseClassification.Builder addCaseClassificationsBuilder(
        int index) {
      return getCaseClassificationsFieldBuilder()
          .addBuilder(index, com.google.cloud.support.v2.CaseClassification.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The classifications retrieved.
     * </pre>
     *
     * <code>repeated .google.cloud.support.v2.CaseClassification case_classifications = 1;</code>
     */
    public java.util.List<com.google.cloud.support.v2.CaseClassification.Builder>
        getCaseClassificationsBuilderList() {
      return getCaseClassificationsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.support.v2.CaseClassification,
            com.google.cloud.support.v2.CaseClassification.Builder,
            com.google.cloud.support.v2.CaseClassificationOrBuilder>
        getCaseClassificationsFieldBuilder() {
      if (caseClassificationsBuilder_ == null) {
        caseClassificationsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.support.v2.CaseClassification,
                com.google.cloud.support.v2.CaseClassification.Builder,
                com.google.cloud.support.v2.CaseClassificationOrBuilder>(
                caseClassifications_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        caseClassifications_ = null;
      }
      return caseClassificationsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. Set this in the `page_token`
     * field of subsequent `caseClassifications.list` requests. If unspecified,
     * there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. Set this in the `page_token`
     * field of subsequent `caseClassifications.list` requests. If unspecified,
     * there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. Set this in the `page_token`
     * field of subsequent `caseClassifications.list` requests. If unspecified,
     * there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. Set this in the `page_token`
     * field of subsequent `caseClassifications.list` requests. If unspecified,
     * there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A token to retrieve the next page of results. Set this in the `page_token`
     * field of subsequent `caseClassifications.list` requests. If unspecified,
     * there are no more results to retrieve.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.support.v2.SearchCaseClassificationsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.support.v2.SearchCaseClassificationsResponse)
  private static final com.google.cloud.support.v2.SearchCaseClassificationsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.support.v2.SearchCaseClassificationsResponse();
  }

  public static com.google.cloud.support.v2.SearchCaseClassificationsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SearchCaseClassificationsResponse> PARSER =
      new com.google.protobuf.AbstractParser<SearchCaseClassificationsResponse>() {
        @java.lang.Override
        public SearchCaseClassificationsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SearchCaseClassificationsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SearchCaseClassificationsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.support.v2.SearchCaseClassificationsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
