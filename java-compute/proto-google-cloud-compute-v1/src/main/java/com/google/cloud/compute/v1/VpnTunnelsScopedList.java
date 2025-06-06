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
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.VpnTunnelsScopedList}
 */
public final class VpnTunnelsScopedList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.VpnTunnelsScopedList)
    VpnTunnelsScopedListOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use VpnTunnelsScopedList.newBuilder() to construct.
  private VpnTunnelsScopedList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VpnTunnelsScopedList() {
    vpnTunnels_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VpnTunnelsScopedList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_VpnTunnelsScopedList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_VpnTunnelsScopedList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.VpnTunnelsScopedList.class,
            com.google.cloud.compute.v1.VpnTunnelsScopedList.Builder.class);
  }

  private int bitField0_;
  public static final int VPN_TUNNELS_FIELD_NUMBER = 163494080;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.VpnTunnel> vpnTunnels_;

  /**
   *
   *
   * <pre>
   * A list of VPN tunnels contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.VpnTunnel> getVpnTunnelsList() {
    return vpnTunnels_;
  }

  /**
   *
   *
   * <pre>
   * A list of VPN tunnels contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.VpnTunnelOrBuilder>
      getVpnTunnelsOrBuilderList() {
    return vpnTunnels_;
  }

  /**
   *
   *
   * <pre>
   * A list of VPN tunnels contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
   */
  @java.lang.Override
  public int getVpnTunnelsCount() {
    return vpnTunnels_.size();
  }

  /**
   *
   *
   * <pre>
   * A list of VPN tunnels contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.VpnTunnel getVpnTunnels(int index) {
    return vpnTunnels_.get(index);
  }

  /**
   *
   *
   * <pre>
   * A list of VPN tunnels contained in this scope.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.VpnTunnelOrBuilder getVpnTunnelsOrBuilder(int index) {
    return vpnTunnels_.get(index);
  }

  public static final int WARNING_FIELD_NUMBER = 50704284;
  private com.google.cloud.compute.v1.Warning warning_;

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return Whether the warning field is set.
   */
  @java.lang.Override
  public boolean hasWarning() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   *
   * @return The warning.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.Warning getWarning() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
  }

  /**
   *
   *
   * <pre>
   * Informational warning which replaces the list of addresses when the list is empty.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
    return warning_ == null ? com.google.cloud.compute.v1.Warning.getDefaultInstance() : warning_;
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
      output.writeMessage(50704284, getWarning());
    }
    for (int i = 0; i < vpnTunnels_.size(); i++) {
      output.writeMessage(163494080, vpnTunnels_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(50704284, getWarning());
    }
    for (int i = 0; i < vpnTunnels_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(163494080, vpnTunnels_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.VpnTunnelsScopedList)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.VpnTunnelsScopedList other =
        (com.google.cloud.compute.v1.VpnTunnelsScopedList) obj;

    if (!getVpnTunnelsList().equals(other.getVpnTunnelsList())) return false;
    if (hasWarning() != other.hasWarning()) return false;
    if (hasWarning()) {
      if (!getWarning().equals(other.getWarning())) return false;
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
    if (getVpnTunnelsCount() > 0) {
      hash = (37 * hash) + VPN_TUNNELS_FIELD_NUMBER;
      hash = (53 * hash) + getVpnTunnelsList().hashCode();
    }
    if (hasWarning()) {
      hash = (37 * hash) + WARNING_FIELD_NUMBER;
      hash = (53 * hash) + getWarning().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.VpnTunnelsScopedList prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.VpnTunnelsScopedList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.VpnTunnelsScopedList)
      com.google.cloud.compute.v1.VpnTunnelsScopedListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_VpnTunnelsScopedList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_VpnTunnelsScopedList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.VpnTunnelsScopedList.class,
              com.google.cloud.compute.v1.VpnTunnelsScopedList.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.VpnTunnelsScopedList.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getVpnTunnelsFieldBuilder();
        getWarningFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (vpnTunnelsBuilder_ == null) {
        vpnTunnels_ = java.util.Collections.emptyList();
      } else {
        vpnTunnels_ = null;
        vpnTunnelsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_VpnTunnelsScopedList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnTunnelsScopedList getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.VpnTunnelsScopedList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnTunnelsScopedList build() {
      com.google.cloud.compute.v1.VpnTunnelsScopedList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.VpnTunnelsScopedList buildPartial() {
      com.google.cloud.compute.v1.VpnTunnelsScopedList result =
          new com.google.cloud.compute.v1.VpnTunnelsScopedList(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.VpnTunnelsScopedList result) {
      if (vpnTunnelsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          vpnTunnels_ = java.util.Collections.unmodifiableList(vpnTunnels_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.vpnTunnels_ = vpnTunnels_;
      } else {
        result.vpnTunnels_ = vpnTunnelsBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.VpnTunnelsScopedList result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.warning_ = warningBuilder_ == null ? warning_ : warningBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.VpnTunnelsScopedList) {
        return mergeFrom((com.google.cloud.compute.v1.VpnTunnelsScopedList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.VpnTunnelsScopedList other) {
      if (other == com.google.cloud.compute.v1.VpnTunnelsScopedList.getDefaultInstance())
        return this;
      if (vpnTunnelsBuilder_ == null) {
        if (!other.vpnTunnels_.isEmpty()) {
          if (vpnTunnels_.isEmpty()) {
            vpnTunnels_ = other.vpnTunnels_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureVpnTunnelsIsMutable();
            vpnTunnels_.addAll(other.vpnTunnels_);
          }
          onChanged();
        }
      } else {
        if (!other.vpnTunnels_.isEmpty()) {
          if (vpnTunnelsBuilder_.isEmpty()) {
            vpnTunnelsBuilder_.dispose();
            vpnTunnelsBuilder_ = null;
            vpnTunnels_ = other.vpnTunnels_;
            bitField0_ = (bitField0_ & ~0x00000001);
            vpnTunnelsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getVpnTunnelsFieldBuilder()
                    : null;
          } else {
            vpnTunnelsBuilder_.addAllMessages(other.vpnTunnels_);
          }
        }
      }
      if (other.hasWarning()) {
        mergeWarning(other.getWarning());
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
            case 405634274:
              {
                input.readMessage(getWarningFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 405634274
            case 1307952642:
              {
                com.google.cloud.compute.v1.VpnTunnel m =
                    input.readMessage(
                        com.google.cloud.compute.v1.VpnTunnel.parser(), extensionRegistry);
                if (vpnTunnelsBuilder_ == null) {
                  ensureVpnTunnelsIsMutable();
                  vpnTunnels_.add(m);
                } else {
                  vpnTunnelsBuilder_.addMessage(m);
                }
                break;
              } // case 1307952642
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

    private java.util.List<com.google.cloud.compute.v1.VpnTunnel> vpnTunnels_ =
        java.util.Collections.emptyList();

    private void ensureVpnTunnelsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        vpnTunnels_ = new java.util.ArrayList<com.google.cloud.compute.v1.VpnTunnel>(vpnTunnels_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.VpnTunnel,
            com.google.cloud.compute.v1.VpnTunnel.Builder,
            com.google.cloud.compute.v1.VpnTunnelOrBuilder>
        vpnTunnelsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.VpnTunnel> getVpnTunnelsList() {
      if (vpnTunnelsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(vpnTunnels_);
      } else {
        return vpnTunnelsBuilder_.getMessageList();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public int getVpnTunnelsCount() {
      if (vpnTunnelsBuilder_ == null) {
        return vpnTunnels_.size();
      } else {
        return vpnTunnelsBuilder_.getCount();
      }
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public com.google.cloud.compute.v1.VpnTunnel getVpnTunnels(int index) {
      if (vpnTunnelsBuilder_ == null) {
        return vpnTunnels_.get(index);
      } else {
        return vpnTunnelsBuilder_.getMessage(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public Builder setVpnTunnels(int index, com.google.cloud.compute.v1.VpnTunnel value) {
      if (vpnTunnelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVpnTunnelsIsMutable();
        vpnTunnels_.set(index, value);
        onChanged();
      } else {
        vpnTunnelsBuilder_.setMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public Builder setVpnTunnels(
        int index, com.google.cloud.compute.v1.VpnTunnel.Builder builderForValue) {
      if (vpnTunnelsBuilder_ == null) {
        ensureVpnTunnelsIsMutable();
        vpnTunnels_.set(index, builderForValue.build());
        onChanged();
      } else {
        vpnTunnelsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public Builder addVpnTunnels(com.google.cloud.compute.v1.VpnTunnel value) {
      if (vpnTunnelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVpnTunnelsIsMutable();
        vpnTunnels_.add(value);
        onChanged();
      } else {
        vpnTunnelsBuilder_.addMessage(value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public Builder addVpnTunnels(int index, com.google.cloud.compute.v1.VpnTunnel value) {
      if (vpnTunnelsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureVpnTunnelsIsMutable();
        vpnTunnels_.add(index, value);
        onChanged();
      } else {
        vpnTunnelsBuilder_.addMessage(index, value);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public Builder addVpnTunnels(com.google.cloud.compute.v1.VpnTunnel.Builder builderForValue) {
      if (vpnTunnelsBuilder_ == null) {
        ensureVpnTunnelsIsMutable();
        vpnTunnels_.add(builderForValue.build());
        onChanged();
      } else {
        vpnTunnelsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public Builder addVpnTunnels(
        int index, com.google.cloud.compute.v1.VpnTunnel.Builder builderForValue) {
      if (vpnTunnelsBuilder_ == null) {
        ensureVpnTunnelsIsMutable();
        vpnTunnels_.add(index, builderForValue.build());
        onChanged();
      } else {
        vpnTunnelsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public Builder addAllVpnTunnels(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.VpnTunnel> values) {
      if (vpnTunnelsBuilder_ == null) {
        ensureVpnTunnelsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, vpnTunnels_);
        onChanged();
      } else {
        vpnTunnelsBuilder_.addAllMessages(values);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public Builder clearVpnTunnels() {
      if (vpnTunnelsBuilder_ == null) {
        vpnTunnels_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        vpnTunnelsBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public Builder removeVpnTunnels(int index) {
      if (vpnTunnelsBuilder_ == null) {
        ensureVpnTunnelsIsMutable();
        vpnTunnels_.remove(index);
        onChanged();
      } else {
        vpnTunnelsBuilder_.remove(index);
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public com.google.cloud.compute.v1.VpnTunnel.Builder getVpnTunnelsBuilder(int index) {
      return getVpnTunnelsFieldBuilder().getBuilder(index);
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public com.google.cloud.compute.v1.VpnTunnelOrBuilder getVpnTunnelsOrBuilder(int index) {
      if (vpnTunnelsBuilder_ == null) {
        return vpnTunnels_.get(index);
      } else {
        return vpnTunnelsBuilder_.getMessageOrBuilder(index);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.VpnTunnelOrBuilder>
        getVpnTunnelsOrBuilderList() {
      if (vpnTunnelsBuilder_ != null) {
        return vpnTunnelsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(vpnTunnels_);
      }
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public com.google.cloud.compute.v1.VpnTunnel.Builder addVpnTunnelsBuilder() {
      return getVpnTunnelsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.VpnTunnel.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public com.google.cloud.compute.v1.VpnTunnel.Builder addVpnTunnelsBuilder(int index) {
      return getVpnTunnelsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.VpnTunnel.getDefaultInstance());
    }

    /**
     *
     *
     * <pre>
     * A list of VPN tunnels contained in this scope.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.VpnTunnel vpn_tunnels = 163494080;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.VpnTunnel.Builder>
        getVpnTunnelsBuilderList() {
      return getVpnTunnelsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.VpnTunnel,
            com.google.cloud.compute.v1.VpnTunnel.Builder,
            com.google.cloud.compute.v1.VpnTunnelOrBuilder>
        getVpnTunnelsFieldBuilder() {
      if (vpnTunnelsBuilder_ == null) {
        vpnTunnelsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.VpnTunnel,
                com.google.cloud.compute.v1.VpnTunnel.Builder,
                com.google.cloud.compute.v1.VpnTunnelOrBuilder>(
                vpnTunnels_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        vpnTunnels_ = null;
      }
      return vpnTunnelsBuilder_;
    }

    private com.google.cloud.compute.v1.Warning warning_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        warningBuilder_;

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return Whether the warning field is set.
     */
    public boolean hasWarning() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     *
     * @return The warning.
     */
    public com.google.cloud.compute.v1.Warning getWarning() {
      if (warningBuilder_ == null) {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      } else {
        return warningBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        warning_ = value;
      } else {
        warningBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder setWarning(com.google.cloud.compute.v1.Warning.Builder builderForValue) {
      if (warningBuilder_ == null) {
        warning_ = builderForValue.build();
      } else {
        warningBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder mergeWarning(com.google.cloud.compute.v1.Warning value) {
      if (warningBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && warning_ != null
            && warning_ != com.google.cloud.compute.v1.Warning.getDefaultInstance()) {
          getWarningBuilder().mergeFrom(value);
        } else {
          warning_ = value;
        }
      } else {
        warningBuilder_.mergeFrom(value);
      }
      if (warning_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public Builder clearWarning() {
      bitField0_ = (bitField0_ & ~0x00000002);
      warning_ = null;
      if (warningBuilder_ != null) {
        warningBuilder_.dispose();
        warningBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.Warning.Builder getWarningBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getWarningFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    public com.google.cloud.compute.v1.WarningOrBuilder getWarningOrBuilder() {
      if (warningBuilder_ != null) {
        return warningBuilder_.getMessageOrBuilder();
      } else {
        return warning_ == null
            ? com.google.cloud.compute.v1.Warning.getDefaultInstance()
            : warning_;
      }
    }

    /**
     *
     *
     * <pre>
     * Informational warning which replaces the list of addresses when the list is empty.
     * </pre>
     *
     * <code>optional .google.cloud.compute.v1.Warning warning = 50704284;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.Warning,
            com.google.cloud.compute.v1.Warning.Builder,
            com.google.cloud.compute.v1.WarningOrBuilder>
        getWarningFieldBuilder() {
      if (warningBuilder_ == null) {
        warningBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.Warning,
                com.google.cloud.compute.v1.Warning.Builder,
                com.google.cloud.compute.v1.WarningOrBuilder>(
                getWarning(), getParentForChildren(), isClean());
        warning_ = null;
      }
      return warningBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.VpnTunnelsScopedList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.VpnTunnelsScopedList)
  private static final com.google.cloud.compute.v1.VpnTunnelsScopedList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.VpnTunnelsScopedList();
  }

  public static com.google.cloud.compute.v1.VpnTunnelsScopedList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VpnTunnelsScopedList> PARSER =
      new com.google.protobuf.AbstractParser<VpnTunnelsScopedList>() {
        @java.lang.Override
        public VpnTunnelsScopedList parsePartialFrom(
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

  public static com.google.protobuf.Parser<VpnTunnelsScopedList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VpnTunnelsScopedList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.VpnTunnelsScopedList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
