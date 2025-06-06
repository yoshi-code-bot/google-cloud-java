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
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.orgpolicy.v2;

/**
 *
 *
 * <pre>
 * Similar to PolicySpec but with an extra 'launch' field for launch reference.
 * The PolicySpec here is specific for dry-run.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orgpolicy.v2.AlternatePolicySpec}
 */
public final class AlternatePolicySpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orgpolicy.v2.AlternatePolicySpec)
    AlternatePolicySpecOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AlternatePolicySpec.newBuilder() to construct.
  private AlternatePolicySpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AlternatePolicySpec() {
    launch_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AlternatePolicySpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orgpolicy.v2.OrgPolicyProto
        .internal_static_google_cloud_orgpolicy_v2_AlternatePolicySpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orgpolicy.v2.OrgPolicyProto
        .internal_static_google_cloud_orgpolicy_v2_AlternatePolicySpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orgpolicy.v2.AlternatePolicySpec.class,
            com.google.cloud.orgpolicy.v2.AlternatePolicySpec.Builder.class);
  }

  private int bitField0_;
  public static final int LAUNCH_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object launch_ = "";

  /**
   *
   *
   * <pre>
   * Reference to the launch that will be used while audit logging and to
   * control the launch.
   * Should be set only in the alternate policy.
   * </pre>
   *
   * <code>string launch = 1;</code>
   *
   * @return The launch.
   */
  @java.lang.Override
  public java.lang.String getLaunch() {
    java.lang.Object ref = launch_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      launch_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Reference to the launch that will be used while audit logging and to
   * control the launch.
   * Should be set only in the alternate policy.
   * </pre>
   *
   * <code>string launch = 1;</code>
   *
   * @return The bytes for launch.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLaunchBytes() {
    java.lang.Object ref = launch_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      launch_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SPEC_FIELD_NUMBER = 2;
  private com.google.cloud.orgpolicy.v2.PolicySpec spec_;

  /**
   *
   *
   * <pre>
   * Specify constraint for configurations of Google Cloud resources.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   *
   * @return Whether the spec field is set.
   */
  @java.lang.Override
  public boolean hasSpec() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Specify constraint for configurations of Google Cloud resources.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   *
   * @return The spec.
   */
  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.PolicySpec getSpec() {
    return spec_ == null ? com.google.cloud.orgpolicy.v2.PolicySpec.getDefaultInstance() : spec_;
  }

  /**
   *
   *
   * <pre>
   * Specify constraint for configurations of Google Cloud resources.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.PolicySpecOrBuilder getSpecOrBuilder() {
    return spec_ == null ? com.google.cloud.orgpolicy.v2.PolicySpec.getDefaultInstance() : spec_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(launch_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, launch_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getSpec());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(launch_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, launch_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getSpec());
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
    if (!(obj instanceof com.google.cloud.orgpolicy.v2.AlternatePolicySpec)) {
      return super.equals(obj);
    }
    com.google.cloud.orgpolicy.v2.AlternatePolicySpec other =
        (com.google.cloud.orgpolicy.v2.AlternatePolicySpec) obj;

    if (!getLaunch().equals(other.getLaunch())) return false;
    if (hasSpec() != other.hasSpec()) return false;
    if (hasSpec()) {
      if (!getSpec().equals(other.getSpec())) return false;
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
    hash = (37 * hash) + LAUNCH_FIELD_NUMBER;
    hash = (53 * hash) + getLaunch().hashCode();
    if (hasSpec()) {
      hash = (37 * hash) + SPEC_FIELD_NUMBER;
      hash = (53 * hash) + getSpec().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.orgpolicy.v2.AlternatePolicySpec prototype) {
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
   * Similar to PolicySpec but with an extra 'launch' field for launch reference.
   * The PolicySpec here is specific for dry-run.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orgpolicy.v2.AlternatePolicySpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orgpolicy.v2.AlternatePolicySpec)
      com.google.cloud.orgpolicy.v2.AlternatePolicySpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto
          .internal_static_google_cloud_orgpolicy_v2_AlternatePolicySpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto
          .internal_static_google_cloud_orgpolicy_v2_AlternatePolicySpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orgpolicy.v2.AlternatePolicySpec.class,
              com.google.cloud.orgpolicy.v2.AlternatePolicySpec.Builder.class);
    }

    // Construct using com.google.cloud.orgpolicy.v2.AlternatePolicySpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getSpecFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      launch_ = "";
      spec_ = null;
      if (specBuilder_ != null) {
        specBuilder_.dispose();
        specBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.orgpolicy.v2.OrgPolicyProto
          .internal_static_google_cloud_orgpolicy_v2_AlternatePolicySpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.AlternatePolicySpec getDefaultInstanceForType() {
      return com.google.cloud.orgpolicy.v2.AlternatePolicySpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.AlternatePolicySpec build() {
      com.google.cloud.orgpolicy.v2.AlternatePolicySpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orgpolicy.v2.AlternatePolicySpec buildPartial() {
      com.google.cloud.orgpolicy.v2.AlternatePolicySpec result =
          new com.google.cloud.orgpolicy.v2.AlternatePolicySpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.orgpolicy.v2.AlternatePolicySpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.launch_ = launch_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.spec_ = specBuilder_ == null ? spec_ : specBuilder_.build();
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
      if (other instanceof com.google.cloud.orgpolicy.v2.AlternatePolicySpec) {
        return mergeFrom((com.google.cloud.orgpolicy.v2.AlternatePolicySpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.orgpolicy.v2.AlternatePolicySpec other) {
      if (other == com.google.cloud.orgpolicy.v2.AlternatePolicySpec.getDefaultInstance())
        return this;
      if (!other.getLaunch().isEmpty()) {
        launch_ = other.launch_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasSpec()) {
        mergeSpec(other.getSpec());
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
                launch_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getSpecFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object launch_ = "";

    /**
     *
     *
     * <pre>
     * Reference to the launch that will be used while audit logging and to
     * control the launch.
     * Should be set only in the alternate policy.
     * </pre>
     *
     * <code>string launch = 1;</code>
     *
     * @return The launch.
     */
    public java.lang.String getLaunch() {
      java.lang.Object ref = launch_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        launch_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Reference to the launch that will be used while audit logging and to
     * control the launch.
     * Should be set only in the alternate policy.
     * </pre>
     *
     * <code>string launch = 1;</code>
     *
     * @return The bytes for launch.
     */
    public com.google.protobuf.ByteString getLaunchBytes() {
      java.lang.Object ref = launch_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        launch_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Reference to the launch that will be used while audit logging and to
     * control the launch.
     * Should be set only in the alternate policy.
     * </pre>
     *
     * <code>string launch = 1;</code>
     *
     * @param value The launch to set.
     * @return This builder for chaining.
     */
    public Builder setLaunch(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      launch_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Reference to the launch that will be used while audit logging and to
     * control the launch.
     * Should be set only in the alternate policy.
     * </pre>
     *
     * <code>string launch = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLaunch() {
      launch_ = getDefaultInstance().getLaunch();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Reference to the launch that will be used while audit logging and to
     * control the launch.
     * Should be set only in the alternate policy.
     * </pre>
     *
     * <code>string launch = 1;</code>
     *
     * @param value The bytes for launch to set.
     * @return This builder for chaining.
     */
    public Builder setLaunchBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      launch_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.orgpolicy.v2.PolicySpec spec_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.orgpolicy.v2.PolicySpec,
            com.google.cloud.orgpolicy.v2.PolicySpec.Builder,
            com.google.cloud.orgpolicy.v2.PolicySpecOrBuilder>
        specBuilder_;

    /**
     *
     *
     * <pre>
     * Specify constraint for configurations of Google Cloud resources.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
     *
     * @return Whether the spec field is set.
     */
    public boolean hasSpec() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Specify constraint for configurations of Google Cloud resources.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
     *
     * @return The spec.
     */
    public com.google.cloud.orgpolicy.v2.PolicySpec getSpec() {
      if (specBuilder_ == null) {
        return spec_ == null
            ? com.google.cloud.orgpolicy.v2.PolicySpec.getDefaultInstance()
            : spec_;
      } else {
        return specBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Specify constraint for configurations of Google Cloud resources.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
     */
    public Builder setSpec(com.google.cloud.orgpolicy.v2.PolicySpec value) {
      if (specBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        spec_ = value;
      } else {
        specBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specify constraint for configurations of Google Cloud resources.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
     */
    public Builder setSpec(com.google.cloud.orgpolicy.v2.PolicySpec.Builder builderForValue) {
      if (specBuilder_ == null) {
        spec_ = builderForValue.build();
      } else {
        specBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specify constraint for configurations of Google Cloud resources.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
     */
    public Builder mergeSpec(com.google.cloud.orgpolicy.v2.PolicySpec value) {
      if (specBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && spec_ != null
            && spec_ != com.google.cloud.orgpolicy.v2.PolicySpec.getDefaultInstance()) {
          getSpecBuilder().mergeFrom(value);
        } else {
          spec_ = value;
        }
      } else {
        specBuilder_.mergeFrom(value);
      }
      if (spec_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specify constraint for configurations of Google Cloud resources.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
     */
    public Builder clearSpec() {
      bitField0_ = (bitField0_ & ~0x00000002);
      spec_ = null;
      if (specBuilder_ != null) {
        specBuilder_.dispose();
        specBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specify constraint for configurations of Google Cloud resources.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
     */
    public com.google.cloud.orgpolicy.v2.PolicySpec.Builder getSpecBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getSpecFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Specify constraint for configurations of Google Cloud resources.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
     */
    public com.google.cloud.orgpolicy.v2.PolicySpecOrBuilder getSpecOrBuilder() {
      if (specBuilder_ != null) {
        return specBuilder_.getMessageOrBuilder();
      } else {
        return spec_ == null
            ? com.google.cloud.orgpolicy.v2.PolicySpec.getDefaultInstance()
            : spec_;
      }
    }

    /**
     *
     *
     * <pre>
     * Specify constraint for configurations of Google Cloud resources.
     * </pre>
     *
     * <code>.google.cloud.orgpolicy.v2.PolicySpec spec = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.orgpolicy.v2.PolicySpec,
            com.google.cloud.orgpolicy.v2.PolicySpec.Builder,
            com.google.cloud.orgpolicy.v2.PolicySpecOrBuilder>
        getSpecFieldBuilder() {
      if (specBuilder_ == null) {
        specBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.orgpolicy.v2.PolicySpec,
                com.google.cloud.orgpolicy.v2.PolicySpec.Builder,
                com.google.cloud.orgpolicy.v2.PolicySpecOrBuilder>(
                getSpec(), getParentForChildren(), isClean());
        spec_ = null;
      }
      return specBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.orgpolicy.v2.AlternatePolicySpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orgpolicy.v2.AlternatePolicySpec)
  private static final com.google.cloud.orgpolicy.v2.AlternatePolicySpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.orgpolicy.v2.AlternatePolicySpec();
  }

  public static com.google.cloud.orgpolicy.v2.AlternatePolicySpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AlternatePolicySpec> PARSER =
      new com.google.protobuf.AbstractParser<AlternatePolicySpec>() {
        @java.lang.Override
        public AlternatePolicySpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<AlternatePolicySpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AlternatePolicySpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orgpolicy.v2.AlternatePolicySpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
