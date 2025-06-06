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
// source: google/cloud/channel/v1/service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Represents the Billable SKU information.
 * </pre>
 *
 * Protobuf type {@code google.cloud.channel.v1.BillableSku}
 */
public final class BillableSku extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.channel.v1.BillableSku)
    BillableSkuOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use BillableSku.newBuilder() to construct.
  private BillableSku(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BillableSku() {
    sku_ = "";
    skuDisplayName_ = "";
    service_ = "";
    serviceDisplayName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BillableSku();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_BillableSku_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.channel.v1.ServiceProto
        .internal_static_google_cloud_channel_v1_BillableSku_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.channel.v1.BillableSku.class,
            com.google.cloud.channel.v1.BillableSku.Builder.class);
  }

  public static final int SKU_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sku_ = "";

  /**
   *
   *
   * <pre>
   * Resource name of Billable SKU. Format:
   * billableSkus/{sku}.
   * Example:
   * billableSkus/6E1B-6634-470F".
   * </pre>
   *
   * <code>string sku = 1;</code>
   *
   * @return The sku.
   */
  @java.lang.Override
  public java.lang.String getSku() {
    java.lang.Object ref = sku_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sku_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Resource name of Billable SKU. Format:
   * billableSkus/{sku}.
   * Example:
   * billableSkus/6E1B-6634-470F".
   * </pre>
   *
   * <code>string sku = 1;</code>
   *
   * @return The bytes for sku.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSkuBytes() {
    java.lang.Object ref = sku_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sku_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SKU_DISPLAY_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object skuDisplayName_ = "";

  /**
   *
   *
   * <pre>
   * Unique human readable name for the SKU.
   * </pre>
   *
   * <code>string sku_display_name = 2;</code>
   *
   * @return The skuDisplayName.
   */
  @java.lang.Override
  public java.lang.String getSkuDisplayName() {
    java.lang.Object ref = skuDisplayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      skuDisplayName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Unique human readable name for the SKU.
   * </pre>
   *
   * <code>string sku_display_name = 2;</code>
   *
   * @return The bytes for skuDisplayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSkuDisplayNameBytes() {
    java.lang.Object ref = skuDisplayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      skuDisplayName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object service_ = "";

  /**
   *
   *
   * <pre>
   * Resource name of Service which contains Repricing SKU. Format:
   * services/{service}.
   * Example:
   * "services/B7D9-FDCB-15D8".
   * </pre>
   *
   * <code>string service = 3;</code>
   *
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Resource name of Service which contains Repricing SKU. Format:
   * services/{service}.
   * Example:
   * "services/B7D9-FDCB-15D8".
   * </pre>
   *
   * <code>string service = 3;</code>
   *
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SERVICE_DISPLAY_NAME_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object serviceDisplayName_ = "";

  /**
   *
   *
   * <pre>
   * Unique human readable name for the Service.
   * </pre>
   *
   * <code>string service_display_name = 4;</code>
   *
   * @return The serviceDisplayName.
   */
  @java.lang.Override
  public java.lang.String getServiceDisplayName() {
    java.lang.Object ref = serviceDisplayName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      serviceDisplayName_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Unique human readable name for the Service.
   * </pre>
   *
   * <code>string service_display_name = 4;</code>
   *
   * @return The bytes for serviceDisplayName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceDisplayNameBytes() {
    java.lang.Object ref = serviceDisplayName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      serviceDisplayName_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sku_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sku_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuDisplayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, skuDisplayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceDisplayName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, serviceDisplayName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sku_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sku_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(skuDisplayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, skuDisplayName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(serviceDisplayName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, serviceDisplayName_);
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
    if (!(obj instanceof com.google.cloud.channel.v1.BillableSku)) {
      return super.equals(obj);
    }
    com.google.cloud.channel.v1.BillableSku other = (com.google.cloud.channel.v1.BillableSku) obj;

    if (!getSku().equals(other.getSku())) return false;
    if (!getSkuDisplayName().equals(other.getSkuDisplayName())) return false;
    if (!getService().equals(other.getService())) return false;
    if (!getServiceDisplayName().equals(other.getServiceDisplayName())) return false;
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
    hash = (37 * hash) + SKU_FIELD_NUMBER;
    hash = (53 * hash) + getSku().hashCode();
    hash = (37 * hash) + SKU_DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getSkuDisplayName().hashCode();
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + SERVICE_DISPLAY_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getServiceDisplayName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.channel.v1.BillableSku parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.BillableSku parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.BillableSku parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.BillableSku parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.BillableSku parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.channel.v1.BillableSku parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.BillableSku parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.BillableSku parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.BillableSku parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.BillableSku parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.channel.v1.BillableSku parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.channel.v1.BillableSku parseFrom(
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

  public static Builder newBuilder(com.google.cloud.channel.v1.BillableSku prototype) {
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
   * Represents the Billable SKU information.
   * </pre>
   *
   * Protobuf type {@code google.cloud.channel.v1.BillableSku}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.channel.v1.BillableSku)
      com.google.cloud.channel.v1.BillableSkuOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_BillableSku_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_BillableSku_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.channel.v1.BillableSku.class,
              com.google.cloud.channel.v1.BillableSku.Builder.class);
    }

    // Construct using com.google.cloud.channel.v1.BillableSku.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sku_ = "";
      skuDisplayName_ = "";
      service_ = "";
      serviceDisplayName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.channel.v1.ServiceProto
          .internal_static_google_cloud_channel_v1_BillableSku_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.BillableSku getDefaultInstanceForType() {
      return com.google.cloud.channel.v1.BillableSku.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.BillableSku build() {
      com.google.cloud.channel.v1.BillableSku result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.channel.v1.BillableSku buildPartial() {
      com.google.cloud.channel.v1.BillableSku result =
          new com.google.cloud.channel.v1.BillableSku(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.channel.v1.BillableSku result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sku_ = sku_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.skuDisplayName_ = skuDisplayName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.service_ = service_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.serviceDisplayName_ = serviceDisplayName_;
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
      if (other instanceof com.google.cloud.channel.v1.BillableSku) {
        return mergeFrom((com.google.cloud.channel.v1.BillableSku) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.channel.v1.BillableSku other) {
      if (other == com.google.cloud.channel.v1.BillableSku.getDefaultInstance()) return this;
      if (!other.getSku().isEmpty()) {
        sku_ = other.sku_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSkuDisplayName().isEmpty()) {
        skuDisplayName_ = other.skuDisplayName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getServiceDisplayName().isEmpty()) {
        serviceDisplayName_ = other.serviceDisplayName_;
        bitField0_ |= 0x00000008;
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
                sku_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                skuDisplayName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                service_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                serviceDisplayName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
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

    private java.lang.Object sku_ = "";

    /**
     *
     *
     * <pre>
     * Resource name of Billable SKU. Format:
     * billableSkus/{sku}.
     * Example:
     * billableSkus/6E1B-6634-470F".
     * </pre>
     *
     * <code>string sku = 1;</code>
     *
     * @return The sku.
     */
    public java.lang.String getSku() {
      java.lang.Object ref = sku_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sku_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Resource name of Billable SKU. Format:
     * billableSkus/{sku}.
     * Example:
     * billableSkus/6E1B-6634-470F".
     * </pre>
     *
     * <code>string sku = 1;</code>
     *
     * @return The bytes for sku.
     */
    public com.google.protobuf.ByteString getSkuBytes() {
      java.lang.Object ref = sku_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sku_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Resource name of Billable SKU. Format:
     * billableSkus/{sku}.
     * Example:
     * billableSkus/6E1B-6634-470F".
     * </pre>
     *
     * <code>string sku = 1;</code>
     *
     * @param value The sku to set.
     * @return This builder for chaining.
     */
    public Builder setSku(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sku_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Resource name of Billable SKU. Format:
     * billableSkus/{sku}.
     * Example:
     * billableSkus/6E1B-6634-470F".
     * </pre>
     *
     * <code>string sku = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSku() {
      sku_ = getDefaultInstance().getSku();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Resource name of Billable SKU. Format:
     * billableSkus/{sku}.
     * Example:
     * billableSkus/6E1B-6634-470F".
     * </pre>
     *
     * <code>string sku = 1;</code>
     *
     * @param value The bytes for sku to set.
     * @return This builder for chaining.
     */
    public Builder setSkuBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sku_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object skuDisplayName_ = "";

    /**
     *
     *
     * <pre>
     * Unique human readable name for the SKU.
     * </pre>
     *
     * <code>string sku_display_name = 2;</code>
     *
     * @return The skuDisplayName.
     */
    public java.lang.String getSkuDisplayName() {
      java.lang.Object ref = skuDisplayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        skuDisplayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Unique human readable name for the SKU.
     * </pre>
     *
     * <code>string sku_display_name = 2;</code>
     *
     * @return The bytes for skuDisplayName.
     */
    public com.google.protobuf.ByteString getSkuDisplayNameBytes() {
      java.lang.Object ref = skuDisplayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        skuDisplayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Unique human readable name for the SKU.
     * </pre>
     *
     * <code>string sku_display_name = 2;</code>
     *
     * @param value The skuDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setSkuDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      skuDisplayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Unique human readable name for the SKU.
     * </pre>
     *
     * <code>string sku_display_name = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSkuDisplayName() {
      skuDisplayName_ = getDefaultInstance().getSkuDisplayName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Unique human readable name for the SKU.
     * </pre>
     *
     * <code>string sku_display_name = 2;</code>
     *
     * @param value The bytes for skuDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setSkuDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      skuDisplayName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object service_ = "";

    /**
     *
     *
     * <pre>
     * Resource name of Service which contains Repricing SKU. Format:
     * services/{service}.
     * Example:
     * "services/B7D9-FDCB-15D8".
     * </pre>
     *
     * <code>string service = 3;</code>
     *
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Resource name of Service which contains Repricing SKU. Format:
     * services/{service}.
     * Example:
     * "services/B7D9-FDCB-15D8".
     * </pre>
     *
     * <code>string service = 3;</code>
     *
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Resource name of Service which contains Repricing SKU. Format:
     * services/{service}.
     * Example:
     * "services/B7D9-FDCB-15D8".
     * </pre>
     *
     * <code>string service = 3;</code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      service_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Resource name of Service which contains Repricing SKU. Format:
     * services/{service}.
     * Example:
     * "services/B7D9-FDCB-15D8".
     * </pre>
     *
     * <code>string service = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {
      service_ = getDefaultInstance().getService();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Resource name of Service which contains Repricing SKU. Format:
     * services/{service}.
     * Example:
     * "services/B7D9-FDCB-15D8".
     * </pre>
     *
     * <code>string service = 3;</code>
     *
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      service_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object serviceDisplayName_ = "";

    /**
     *
     *
     * <pre>
     * Unique human readable name for the Service.
     * </pre>
     *
     * <code>string service_display_name = 4;</code>
     *
     * @return The serviceDisplayName.
     */
    public java.lang.String getServiceDisplayName() {
      java.lang.Object ref = serviceDisplayName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        serviceDisplayName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Unique human readable name for the Service.
     * </pre>
     *
     * <code>string service_display_name = 4;</code>
     *
     * @return The bytes for serviceDisplayName.
     */
    public com.google.protobuf.ByteString getServiceDisplayNameBytes() {
      java.lang.Object ref = serviceDisplayName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        serviceDisplayName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Unique human readable name for the Service.
     * </pre>
     *
     * <code>string service_display_name = 4;</code>
     *
     * @param value The serviceDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceDisplayName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      serviceDisplayName_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Unique human readable name for the Service.
     * </pre>
     *
     * <code>string service_display_name = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearServiceDisplayName() {
      serviceDisplayName_ = getDefaultInstance().getServiceDisplayName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Unique human readable name for the Service.
     * </pre>
     *
     * <code>string service_display_name = 4;</code>
     *
     * @param value The bytes for serviceDisplayName to set.
     * @return This builder for chaining.
     */
    public Builder setServiceDisplayNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      serviceDisplayName_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.channel.v1.BillableSku)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.channel.v1.BillableSku)
  private static final com.google.cloud.channel.v1.BillableSku DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.channel.v1.BillableSku();
  }

  public static com.google.cloud.channel.v1.BillableSku getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BillableSku> PARSER =
      new com.google.protobuf.AbstractParser<BillableSku>() {
        @java.lang.Override
        public BillableSku parsePartialFrom(
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

  public static com.google.protobuf.Parser<BillableSku> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BillableSku> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.channel.v1.BillableSku getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
