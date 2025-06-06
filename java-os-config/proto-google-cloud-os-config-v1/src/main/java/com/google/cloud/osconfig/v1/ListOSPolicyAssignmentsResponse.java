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
// source: google/cloud/osconfig/v1/os_policy_assignments.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.osconfig.v1;

/**
 *
 *
 * <pre>
 * A response message for listing all assignments under given parent.
 * </pre>
 *
 * Protobuf type {@code google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse}
 */
public final class ListOSPolicyAssignmentsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse)
    ListOSPolicyAssignmentsResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ListOSPolicyAssignmentsResponse.newBuilder() to construct.
  private ListOSPolicyAssignmentsResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListOSPolicyAssignmentsResponse() {
    osPolicyAssignments_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListOSPolicyAssignmentsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto
        .internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto
        .internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse.class,
            com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse.Builder.class);
  }

  public static final int OS_POLICY_ASSIGNMENTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignment> osPolicyAssignments_;

  /**
   *
   *
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignment>
      getOsPolicyAssignmentsList() {
    return osPolicyAssignments_;
  }

  /**
   *
   *
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder>
      getOsPolicyAssignmentsOrBuilderList() {
    return osPolicyAssignments_;
  }

  /**
   *
   *
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  @java.lang.Override
  public int getOsPolicyAssignmentsCount() {
    return osPolicyAssignments_.size();
  }

  /**
   *
   *
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.osconfig.v1.OSPolicyAssignment getOsPolicyAssignments(int index) {
    return osPolicyAssignments_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The list of assignments
   * </pre>
   *
   * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder getOsPolicyAssignmentsOrBuilder(
      int index) {
    return osPolicyAssignments_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";

  /**
   *
   *
   * <pre>
   * The pagination token to retrieve the next page of OS policy assignments.
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
   * The pagination token to retrieve the next page of OS policy assignments.
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
    for (int i = 0; i < osPolicyAssignments_.size(); i++) {
      output.writeMessage(1, osPolicyAssignments_.get(i));
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
    for (int i = 0; i < osPolicyAssignments_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, osPolicyAssignments_.get(i));
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
    if (!(obj instanceof com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse other =
        (com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse) obj;

    if (!getOsPolicyAssignmentsList().equals(other.getOsPolicyAssignmentsList())) return false;
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
    if (getOsPolicyAssignmentsCount() > 0) {
      hash = (37 * hash) + OS_POLICY_ASSIGNMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getOsPolicyAssignmentsList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse parseFrom(
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
      com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse prototype) {
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
   * A response message for listing all assignments under given parent.
   * </pre>
   *
   * Protobuf type {@code google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse)
      com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto
          .internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto
          .internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse.class,
              com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse.Builder.class);
    }

    // Construct using com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (osPolicyAssignmentsBuilder_ == null) {
        osPolicyAssignments_ = java.util.Collections.emptyList();
      } else {
        osPolicyAssignments_ = null;
        osPolicyAssignmentsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.osconfig.v1.OsPolicyAssignmentsProto
          .internal_static_google_cloud_osconfig_v1_ListOSPolicyAssignmentsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse build() {
      com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse buildPartial() {
      com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse result =
          new com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse result) {
      if (osPolicyAssignmentsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          osPolicyAssignments_ = java.util.Collections.unmodifiableList(osPolicyAssignments_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.osPolicyAssignments_ = osPolicyAssignments_;
      } else {
        result.osPolicyAssignments_ = osPolicyAssignmentsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse result) {
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
      if (other instanceof com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse) {
        return mergeFrom((com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse other) {
      if (other
          == com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse.getDefaultInstance())
        return this;
      if (osPolicyAssignmentsBuilder_ == null) {
        if (!other.osPolicyAssignments_.isEmpty()) {
          if (osPolicyAssignments_.isEmpty()) {
            osPolicyAssignments_ = other.osPolicyAssignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureOsPolicyAssignmentsIsMutable();
            osPolicyAssignments_.addAll(other.osPolicyAssignments_);
          }
          onChanged();
        }
      } else {
        if (!other.osPolicyAssignments_.isEmpty()) {
          if (osPolicyAssignmentsBuilder_.isEmpty()) {
            osPolicyAssignmentsBuilder_.dispose();
            osPolicyAssignmentsBuilder_ = null;
            osPolicyAssignments_ = other.osPolicyAssignments_;
            bitField0_ = (bitField0_ & ~0x00000001);
            osPolicyAssignmentsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getOsPolicyAssignmentsFieldBuilder()
                    : null;
          } else {
            osPolicyAssignmentsBuilder_.addAllMessages(other.osPolicyAssignments_);
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
                com.google.cloud.osconfig.v1.OSPolicyAssignment m =
                    input.readMessage(
                        com.google.cloud.osconfig.v1.OSPolicyAssignment.parser(),
                        extensionRegistry);
                if (osPolicyAssignmentsBuilder_ == null) {
                  ensureOsPolicyAssignmentsIsMutable();
                  osPolicyAssignments_.add(m);
                } else {
                  osPolicyAssignmentsBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignment> osPolicyAssignments_ =
        java.util.Collections.emptyList();

    private void ensureOsPolicyAssignmentsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        osPolicyAssignments_ =
            new java.util.ArrayList<com.google.cloud.osconfig.v1.OSPolicyAssignment>(
                osPolicyAssignments_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.osconfig.v1.OSPolicyAssignment,
            com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder,
            com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder>
        osPolicyAssignmentsBuilder_;

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignment>
        getOsPolicyAssignmentsList() {
      if (osPolicyAssignmentsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(osPolicyAssignments_);
      } else {
        return osPolicyAssignmentsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public int getOsPolicyAssignmentsCount() {
      if (osPolicyAssignmentsBuilder_ == null) {
        return osPolicyAssignments_.size();
      } else {
        return osPolicyAssignmentsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignment getOsPolicyAssignments(int index) {
      if (osPolicyAssignmentsBuilder_ == null) {
        return osPolicyAssignments_.get(index);
      } else {
        return osPolicyAssignmentsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public Builder setOsPolicyAssignments(
        int index, com.google.cloud.osconfig.v1.OSPolicyAssignment value) {
      if (osPolicyAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOsPolicyAssignmentsIsMutable();
        osPolicyAssignments_.set(index, value);
        onChanged();
      } else {
        osPolicyAssignmentsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public Builder setOsPolicyAssignments(
        int index, com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder builderForValue) {
      if (osPolicyAssignmentsBuilder_ == null) {
        ensureOsPolicyAssignmentsIsMutable();
        osPolicyAssignments_.set(index, builderForValue.build());
        onChanged();
      } else {
        osPolicyAssignmentsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public Builder addOsPolicyAssignments(com.google.cloud.osconfig.v1.OSPolicyAssignment value) {
      if (osPolicyAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOsPolicyAssignmentsIsMutable();
        osPolicyAssignments_.add(value);
        onChanged();
      } else {
        osPolicyAssignmentsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public Builder addOsPolicyAssignments(
        int index, com.google.cloud.osconfig.v1.OSPolicyAssignment value) {
      if (osPolicyAssignmentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureOsPolicyAssignmentsIsMutable();
        osPolicyAssignments_.add(index, value);
        onChanged();
      } else {
        osPolicyAssignmentsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public Builder addOsPolicyAssignments(
        com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder builderForValue) {
      if (osPolicyAssignmentsBuilder_ == null) {
        ensureOsPolicyAssignmentsIsMutable();
        osPolicyAssignments_.add(builderForValue.build());
        onChanged();
      } else {
        osPolicyAssignmentsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public Builder addOsPolicyAssignments(
        int index, com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder builderForValue) {
      if (osPolicyAssignmentsBuilder_ == null) {
        ensureOsPolicyAssignmentsIsMutable();
        osPolicyAssignments_.add(index, builderForValue.build());
        onChanged();
      } else {
        osPolicyAssignmentsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public Builder addAllOsPolicyAssignments(
        java.lang.Iterable<? extends com.google.cloud.osconfig.v1.OSPolicyAssignment> values) {
      if (osPolicyAssignmentsBuilder_ == null) {
        ensureOsPolicyAssignmentsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, osPolicyAssignments_);
        onChanged();
      } else {
        osPolicyAssignmentsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public Builder clearOsPolicyAssignments() {
      if (osPolicyAssignmentsBuilder_ == null) {
        osPolicyAssignments_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        osPolicyAssignmentsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public Builder removeOsPolicyAssignments(int index) {
      if (osPolicyAssignmentsBuilder_ == null) {
        ensureOsPolicyAssignmentsIsMutable();
        osPolicyAssignments_.remove(index);
        onChanged();
      } else {
        osPolicyAssignmentsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder getOsPolicyAssignmentsBuilder(
        int index) {
      return getOsPolicyAssignmentsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder getOsPolicyAssignmentsOrBuilder(
        int index) {
      if (osPolicyAssignmentsBuilder_ == null) {
        return osPolicyAssignments_.get(index);
      } else {
        return osPolicyAssignmentsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder>
        getOsPolicyAssignmentsOrBuilderList() {
      if (osPolicyAssignmentsBuilder_ != null) {
        return osPolicyAssignmentsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(osPolicyAssignments_);
      }
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder addOsPolicyAssignmentsBuilder() {
      return getOsPolicyAssignmentsFieldBuilder()
          .addBuilder(com.google.cloud.osconfig.v1.OSPolicyAssignment.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder addOsPolicyAssignmentsBuilder(
        int index) {
      return getOsPolicyAssignmentsFieldBuilder()
          .addBuilder(index, com.google.cloud.osconfig.v1.OSPolicyAssignment.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The list of assignments
     * </pre>
     *
     * <code>repeated .google.cloud.osconfig.v1.OSPolicyAssignment os_policy_assignments = 1;</code>
     */
    public java.util.List<com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder>
        getOsPolicyAssignmentsBuilderList() {
      return getOsPolicyAssignmentsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.osconfig.v1.OSPolicyAssignment,
            com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder,
            com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder>
        getOsPolicyAssignmentsFieldBuilder() {
      if (osPolicyAssignmentsBuilder_ == null) {
        osPolicyAssignmentsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.osconfig.v1.OSPolicyAssignment,
                com.google.cloud.osconfig.v1.OSPolicyAssignment.Builder,
                com.google.cloud.osconfig.v1.OSPolicyAssignmentOrBuilder>(
                osPolicyAssignments_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        osPolicyAssignments_ = null;
      }
      return osPolicyAssignmentsBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";

    /**
     *
     *
     * <pre>
     * The pagination token to retrieve the next page of OS policy assignments.
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
     * The pagination token to retrieve the next page of OS policy assignments.
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
     * The pagination token to retrieve the next page of OS policy assignments.
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
     * The pagination token to retrieve the next page of OS policy assignments.
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
     * The pagination token to retrieve the next page of OS policy assignments.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse)
  private static final com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse();
  }

  public static com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListOSPolicyAssignmentsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListOSPolicyAssignmentsResponse>() {
        @java.lang.Override
        public ListOSPolicyAssignmentsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListOSPolicyAssignmentsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListOSPolicyAssignmentsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.osconfig.v1.ListOSPolicyAssignmentsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
