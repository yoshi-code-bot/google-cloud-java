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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Informational metadata about Partner attachments from Partners to display to customers. These fields are propagated from PARTNER_PROVIDER attachments to their corresponding PARTNER attachments.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata}
 */
public final class InterconnectAttachmentPartnerMetadata
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)
    InterconnectAttachmentPartnerMetadataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use InterconnectAttachmentPartnerMetadata.newBuilder() to construct.
  private InterconnectAttachmentPartnerMetadata(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InterconnectAttachmentPartnerMetadata() {
    interconnectName_ = "";
    partnerName_ = "";
    portalUrl_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InterconnectAttachmentPartnerMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectAttachmentPartnerMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InterconnectAttachmentPartnerMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.class,
            com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.Builder.class);
  }

  private int bitField0_;
  public static final int INTERCONNECT_NAME_FIELD_NUMBER = 514963356;

  @SuppressWarnings("serial")
  private volatile java.lang.Object interconnectName_ = "";

  /**
   *
   *
   * <pre>
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string interconnect_name = 514963356;</code>
   *
   * @return Whether the interconnectName field is set.
   */
  @java.lang.Override
  public boolean hasInterconnectName() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string interconnect_name = 514963356;</code>
   *
   * @return The interconnectName.
   */
  @java.lang.Override
  public java.lang.String getInterconnectName() {
    java.lang.Object ref = interconnectName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      interconnectName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string interconnect_name = 514963356;</code>
   *
   * @return The bytes for interconnectName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInterconnectNameBytes() {
    java.lang.Object ref = interconnectName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      interconnectName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTNER_NAME_FIELD_NUMBER = 161747874;

  @SuppressWarnings("serial")
  private volatile java.lang.Object partnerName_ = "";

  /**
   *
   *
   * <pre>
   * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string partner_name = 161747874;</code>
   *
   * @return Whether the partnerName field is set.
   */
  @java.lang.Override
  public boolean hasPartnerName() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string partner_name = 161747874;</code>
   *
   * @return The partnerName.
   */
  @java.lang.Override
  public java.lang.String getPartnerName() {
    java.lang.Object ref = partnerName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      partnerName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string partner_name = 161747874;</code>
   *
   * @return The bytes for partnerName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPartnerNameBytes() {
    java.lang.Object ref = partnerName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      partnerName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PORTAL_URL_FIELD_NUMBER = 269182748;

  @SuppressWarnings("serial")
  private volatile java.lang.Object portalUrl_ = "";

  /**
   *
   *
   * <pre>
   * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string portal_url = 269182748;</code>
   *
   * @return Whether the portalUrl field is set.
   */
  @java.lang.Override
  public boolean hasPortalUrl() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   *
   *
   * <pre>
   * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string portal_url = 269182748;</code>
   *
   * @return The portalUrl.
   */
  @java.lang.Override
  public java.lang.String getPortalUrl() {
    java.lang.Object ref = portalUrl_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      portalUrl_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
   * </pre>
   *
   * <code>optional string portal_url = 269182748;</code>
   *
   * @return The bytes for portalUrl.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPortalUrlBytes() {
    java.lang.Object ref = portalUrl_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      portalUrl_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 161747874, partnerName_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 269182748, portalUrl_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 514963356, interconnectName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(161747874, partnerName_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(269182748, portalUrl_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(514963356, interconnectName_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata other =
        (com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata) obj;

    if (hasInterconnectName() != other.hasInterconnectName()) return false;
    if (hasInterconnectName()) {
      if (!getInterconnectName().equals(other.getInterconnectName())) return false;
    }
    if (hasPartnerName() != other.hasPartnerName()) return false;
    if (hasPartnerName()) {
      if (!getPartnerName().equals(other.getPartnerName())) return false;
    }
    if (hasPortalUrl() != other.hasPortalUrl()) return false;
    if (hasPortalUrl()) {
      if (!getPortalUrl().equals(other.getPortalUrl())) return false;
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
    if (hasInterconnectName()) {
      hash = (37 * hash) + INTERCONNECT_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getInterconnectName().hashCode();
    }
    if (hasPartnerName()) {
      hash = (37 * hash) + PARTNER_NAME_FIELD_NUMBER;
      hash = (53 * hash) + getPartnerName().hashCode();
    }
    if (hasPortalUrl()) {
      hash = (37 * hash) + PORTAL_URL_FIELD_NUMBER;
      hash = (53 * hash) + getPortalUrl().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata parseFrom(
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
      com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata prototype) {
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
   * Informational metadata about Partner attachments from Partners to display to customers. These fields are propagated from PARTNER_PROVIDER attachments to their corresponding PARTNER attachments.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)
      com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectAttachmentPartnerMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectAttachmentPartnerMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.class,
              com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      interconnectName_ = "";
      partnerName_ = "";
      portalUrl_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InterconnectAttachmentPartnerMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata build() {
      com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata buildPartial() {
      com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata result =
          new com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.interconnectName_ = interconnectName_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.partnerName_ = partnerName_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.portalUrl_ = portalUrl_;
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
      if (other instanceof com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata) {
        return mergeFrom((com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata other) {
      if (other
          == com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata.getDefaultInstance())
        return this;
      if (other.hasInterconnectName()) {
        interconnectName_ = other.interconnectName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasPartnerName()) {
        partnerName_ = other.partnerName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasPortalUrl()) {
        portalUrl_ = other.portalUrl_;
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
            case 1293982994:
              {
                partnerName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 1293982994
            case -2141505310:
              {
                portalUrl_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case -2141505310
            case -175260446:
              {
                interconnectName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case -175260446
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

    private java.lang.Object interconnectName_ = "";

    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string interconnect_name = 514963356;</code>
     *
     * @return Whether the interconnectName field is set.
     */
    public boolean hasInterconnectName() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string interconnect_name = 514963356;</code>
     *
     * @return The interconnectName.
     */
    public java.lang.String getInterconnectName() {
      java.lang.Object ref = interconnectName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        interconnectName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string interconnect_name = 514963356;</code>
     *
     * @return The bytes for interconnectName.
     */
    public com.google.protobuf.ByteString getInterconnectNameBytes() {
      java.lang.Object ref = interconnectName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        interconnectName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string interconnect_name = 514963356;</code>
     *
     * @param value The interconnectName to set.
     * @return This builder for chaining.
     */
    public Builder setInterconnectName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      interconnectName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string interconnect_name = 514963356;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInterconnectName() {
      interconnectName_ = getDefaultInstance().getInterconnectName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Plain text name of the Interconnect this attachment is connected to, as displayed in the Partner's portal. For instance "Chicago 1". This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string interconnect_name = 514963356;</code>
     *
     * @param value The bytes for interconnectName to set.
     * @return This builder for chaining.
     */
    public Builder setInterconnectNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      interconnectName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object partnerName_ = "";

    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string partner_name = 161747874;</code>
     *
     * @return Whether the partnerName field is set.
     */
    public boolean hasPartnerName() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string partner_name = 161747874;</code>
     *
     * @return The partnerName.
     */
    public java.lang.String getPartnerName() {
      java.lang.Object ref = partnerName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        partnerName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string partner_name = 161747874;</code>
     *
     * @return The bytes for partnerName.
     */
    public com.google.protobuf.ByteString getPartnerNameBytes() {
      java.lang.Object ref = partnerName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        partnerName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string partner_name = 161747874;</code>
     *
     * @param value The partnerName to set.
     * @return This builder for chaining.
     */
    public Builder setPartnerName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      partnerName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string partner_name = 161747874;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPartnerName() {
      partnerName_ = getDefaultInstance().getPartnerName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Plain text name of the Partner providing this attachment. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string partner_name = 161747874;</code>
     *
     * @param value The bytes for partnerName to set.
     * @return This builder for chaining.
     */
    public Builder setPartnerNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      partnerName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object portalUrl_ = "";

    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string portal_url = 269182748;</code>
     *
     * @return Whether the portalUrl field is set.
     */
    public boolean hasPortalUrl() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string portal_url = 269182748;</code>
     *
     * @return The portalUrl.
     */
    public java.lang.String getPortalUrl() {
      java.lang.Object ref = portalUrl_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        portalUrl_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string portal_url = 269182748;</code>
     *
     * @return The bytes for portalUrl.
     */
    public com.google.protobuf.ByteString getPortalUrlBytes() {
      java.lang.Object ref = portalUrl_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        portalUrl_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string portal_url = 269182748;</code>
     *
     * @param value The portalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPortalUrl(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      portalUrl_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string portal_url = 269182748;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPortalUrl() {
      portalUrl_ = getDefaultInstance().getPortalUrl();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * URL of the Partner's portal for this Attachment. Partners may customise this to be a deep link to the specific resource on the Partner portal. This value may be validated to match approved Partner values.
     * </pre>
     *
     * <code>optional string portal_url = 269182748;</code>
     *
     * @param value The bytes for portalUrl to set.
     * @return This builder for chaining.
     */
    public Builder setPortalUrlBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      portalUrl_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata)
  private static final com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata();
  }

  public static com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InterconnectAttachmentPartnerMetadata> PARSER =
      new com.google.protobuf.AbstractParser<InterconnectAttachmentPartnerMetadata>() {
        @java.lang.Override
        public InterconnectAttachmentPartnerMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<InterconnectAttachmentPartnerMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InterconnectAttachmentPartnerMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InterconnectAttachmentPartnerMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
