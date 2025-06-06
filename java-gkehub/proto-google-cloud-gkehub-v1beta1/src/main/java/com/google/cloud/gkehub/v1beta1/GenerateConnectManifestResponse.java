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
// source: google/cloud/gkehub/v1beta1/membership.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.v1beta1;

/**
 *
 *
 * <pre>
 * GenerateConnectManifestResponse contains manifest information for
 * installing/upgrading a Connect agent.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse}
 */
public final class GenerateConnectManifestResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse)
    GenerateConnectManifestResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use GenerateConnectManifestResponse.newBuilder() to construct.
  private GenerateConnectManifestResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GenerateConnectManifestResponse() {
    manifest_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GenerateConnectManifestResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse.class,
            com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse.Builder.class);
  }

  public static final int MANIFEST_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.gkehub.v1beta1.ConnectAgentResource> manifest_;

  /**
   *
   *
   * <pre>
   * The ordered list of Kubernetes resources that need to be applied to the
   * cluster for GKE Connect agent installation/upgrade.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.gkehub.v1beta1.ConnectAgentResource> getManifestList() {
    return manifest_;
  }

  /**
   *
   *
   * <pre>
   * The ordered list of Kubernetes resources that need to be applied to the
   * cluster for GKE Connect agent installation/upgrade.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.gkehub.v1beta1.ConnectAgentResourceOrBuilder>
      getManifestOrBuilderList() {
    return manifest_;
  }

  /**
   *
   *
   * <pre>
   * The ordered list of Kubernetes resources that need to be applied to the
   * cluster for GKE Connect agent installation/upgrade.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
   */
  @java.lang.Override
  public int getManifestCount() {
    return manifest_.size();
  }

  /**
   *
   *
   * <pre>
   * The ordered list of Kubernetes resources that need to be applied to the
   * cluster for GKE Connect agent installation/upgrade.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.ConnectAgentResource getManifest(int index) {
    return manifest_.get(index);
  }

  /**
   *
   *
   * <pre>
   * The ordered list of Kubernetes resources that need to be applied to the
   * cluster for GKE Connect agent installation/upgrade.
   * </pre>
   *
   * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.ConnectAgentResourceOrBuilder getManifestOrBuilder(
      int index) {
    return manifest_.get(index);
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
    for (int i = 0; i < manifest_.size(); i++) {
      output.writeMessage(1, manifest_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < manifest_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, manifest_.get(i));
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
    if (!(obj instanceof com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse other =
        (com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse) obj;

    if (!getManifestList().equals(other.getManifestList())) return false;
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
    if (getManifestCount() > 0) {
      hash = (37 * hash) + MANIFEST_FIELD_NUMBER;
      hash = (53 * hash) + getManifestList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse parseFrom(
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
      com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse prototype) {
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
   * GenerateConnectManifestResponse contains manifest information for
   * installing/upgrading a Connect agent.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse)
      com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse.class,
              com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (manifestBuilder_ == null) {
        manifest_ = java.util.Collections.emptyList();
      } else {
        manifest_ = null;
        manifestBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_GenerateConnectManifestResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse
        getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse build() {
      com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse buildPartial() {
      com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse result =
          new com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse result) {
      if (manifestBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          manifest_ = java.util.Collections.unmodifiableList(manifest_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.manifest_ = manifest_;
      } else {
        result.manifest_ = manifestBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse result) {
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
      if (other instanceof com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse) {
        return mergeFrom((com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse other) {
      if (other
          == com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse.getDefaultInstance())
        return this;
      if (manifestBuilder_ == null) {
        if (!other.manifest_.isEmpty()) {
          if (manifest_.isEmpty()) {
            manifest_ = other.manifest_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureManifestIsMutable();
            manifest_.addAll(other.manifest_);
          }
          onChanged();
        }
      } else {
        if (!other.manifest_.isEmpty()) {
          if (manifestBuilder_.isEmpty()) {
            manifestBuilder_.dispose();
            manifestBuilder_ = null;
            manifest_ = other.manifest_;
            bitField0_ = (bitField0_ & ~0x00000001);
            manifestBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getManifestFieldBuilder()
                    : null;
          } else {
            manifestBuilder_.addAllMessages(other.manifest_);
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
                com.google.cloud.gkehub.v1beta1.ConnectAgentResource m =
                    input.readMessage(
                        com.google.cloud.gkehub.v1beta1.ConnectAgentResource.parser(),
                        extensionRegistry);
                if (manifestBuilder_ == null) {
                  ensureManifestIsMutable();
                  manifest_.add(m);
                } else {
                  manifestBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.gkehub.v1beta1.ConnectAgentResource> manifest_ =
        java.util.Collections.emptyList();

    private void ensureManifestIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        manifest_ =
            new java.util.ArrayList<com.google.cloud.gkehub.v1beta1.ConnectAgentResource>(
                manifest_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkehub.v1beta1.ConnectAgentResource,
            com.google.cloud.gkehub.v1beta1.ConnectAgentResource.Builder,
            com.google.cloud.gkehub.v1beta1.ConnectAgentResourceOrBuilder>
        manifestBuilder_;

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public java.util.List<com.google.cloud.gkehub.v1beta1.ConnectAgentResource> getManifestList() {
      if (manifestBuilder_ == null) {
        return java.util.Collections.unmodifiableList(manifest_);
      } else {
        return manifestBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public int getManifestCount() {
      if (manifestBuilder_ == null) {
        return manifest_.size();
      } else {
        return manifestBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public com.google.cloud.gkehub.v1beta1.ConnectAgentResource getManifest(int index) {
      if (manifestBuilder_ == null) {
        return manifest_.get(index);
      } else {
        return manifestBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public Builder setManifest(
        int index, com.google.cloud.gkehub.v1beta1.ConnectAgentResource value) {
      if (manifestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureManifestIsMutable();
        manifest_.set(index, value);
        onChanged();
      } else {
        manifestBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public Builder setManifest(
        int index, com.google.cloud.gkehub.v1beta1.ConnectAgentResource.Builder builderForValue) {
      if (manifestBuilder_ == null) {
        ensureManifestIsMutable();
        manifest_.set(index, builderForValue.build());
        onChanged();
      } else {
        manifestBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public Builder addManifest(com.google.cloud.gkehub.v1beta1.ConnectAgentResource value) {
      if (manifestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureManifestIsMutable();
        manifest_.add(value);
        onChanged();
      } else {
        manifestBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public Builder addManifest(
        int index, com.google.cloud.gkehub.v1beta1.ConnectAgentResource value) {
      if (manifestBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureManifestIsMutable();
        manifest_.add(index, value);
        onChanged();
      } else {
        manifestBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public Builder addManifest(
        com.google.cloud.gkehub.v1beta1.ConnectAgentResource.Builder builderForValue) {
      if (manifestBuilder_ == null) {
        ensureManifestIsMutable();
        manifest_.add(builderForValue.build());
        onChanged();
      } else {
        manifestBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public Builder addManifest(
        int index, com.google.cloud.gkehub.v1beta1.ConnectAgentResource.Builder builderForValue) {
      if (manifestBuilder_ == null) {
        ensureManifestIsMutable();
        manifest_.add(index, builderForValue.build());
        onChanged();
      } else {
        manifestBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public Builder addAllManifest(
        java.lang.Iterable<? extends com.google.cloud.gkehub.v1beta1.ConnectAgentResource> values) {
      if (manifestBuilder_ == null) {
        ensureManifestIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, manifest_);
        onChanged();
      } else {
        manifestBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public Builder clearManifest() {
      if (manifestBuilder_ == null) {
        manifest_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        manifestBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public Builder removeManifest(int index) {
      if (manifestBuilder_ == null) {
        ensureManifestIsMutable();
        manifest_.remove(index);
        onChanged();
      } else {
        manifestBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public com.google.cloud.gkehub.v1beta1.ConnectAgentResource.Builder getManifestBuilder(
        int index) {
      return getManifestFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public com.google.cloud.gkehub.v1beta1.ConnectAgentResourceOrBuilder getManifestOrBuilder(
        int index) {
      if (manifestBuilder_ == null) {
        return manifest_.get(index);
      } else {
        return manifestBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.gkehub.v1beta1.ConnectAgentResourceOrBuilder>
        getManifestOrBuilderList() {
      if (manifestBuilder_ != null) {
        return manifestBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(manifest_);
      }
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public com.google.cloud.gkehub.v1beta1.ConnectAgentResource.Builder addManifestBuilder() {
      return getManifestFieldBuilder()
          .addBuilder(com.google.cloud.gkehub.v1beta1.ConnectAgentResource.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public com.google.cloud.gkehub.v1beta1.ConnectAgentResource.Builder addManifestBuilder(
        int index) {
      return getManifestFieldBuilder()
          .addBuilder(
              index, com.google.cloud.gkehub.v1beta1.ConnectAgentResource.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * The ordered list of Kubernetes resources that need to be applied to the
     * cluster for GKE Connect agent installation/upgrade.
     * </pre>
     *
     * <code>repeated .google.cloud.gkehub.v1beta1.ConnectAgentResource manifest = 1;</code>
     */
    public java.util.List<com.google.cloud.gkehub.v1beta1.ConnectAgentResource.Builder>
        getManifestBuilderList() {
      return getManifestFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.gkehub.v1beta1.ConnectAgentResource,
            com.google.cloud.gkehub.v1beta1.ConnectAgentResource.Builder,
            com.google.cloud.gkehub.v1beta1.ConnectAgentResourceOrBuilder>
        getManifestFieldBuilder() {
      if (manifestBuilder_ == null) {
        manifestBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.gkehub.v1beta1.ConnectAgentResource,
                com.google.cloud.gkehub.v1beta1.ConnectAgentResource.Builder,
                com.google.cloud.gkehub.v1beta1.ConnectAgentResourceOrBuilder>(
                manifest_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        manifest_ = null;
      }
      return manifestBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse)
  private static final com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse();
  }

  public static com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenerateConnectManifestResponse> PARSER =
      new com.google.protobuf.AbstractParser<GenerateConnectManifestResponse>() {
        @java.lang.Override
        public GenerateConnectManifestResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenerateConnectManifestResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenerateConnectManifestResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.GenerateConnectManifestResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
