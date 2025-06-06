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
// source: google/cloud/gsuiteaddons/v1/gsuiteaddons.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gsuiteaddons.v1;

/**
 *
 *
 * <pre>
 * Developer mode install status of a deployment
 * </pre>
 *
 * Protobuf type {@code google.cloud.gsuiteaddons.v1.InstallStatus}
 */
public final class InstallStatus extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gsuiteaddons.v1.InstallStatus)
    InstallStatusOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use InstallStatus.newBuilder() to construct.
  private InstallStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstallStatus() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstallStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
        .internal_static_google_cloud_gsuiteaddons_v1_InstallStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
        .internal_static_google_cloud_gsuiteaddons_v1_InstallStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gsuiteaddons.v1.InstallStatus.class,
            com.google.cloud.gsuiteaddons.v1.InstallStatus.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * The canonical full resource name of the deployment install status.
   *
   * Example:  `projects/123/deployments/my_deployment/installStatus`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The canonical full resource name of the deployment install status.
   *
   * Example:  `projects/123/deployments/my_deployment/installStatus`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INSTALLED_FIELD_NUMBER = 2;
  private com.google.protobuf.BoolValue installed_;

  /**
   *
   *
   * <pre>
   * True if the deployment is installed for the user
   * </pre>
   *
   * <code>.google.protobuf.BoolValue installed = 2;</code>
   *
   * @return Whether the installed field is set.
   */
  @java.lang.Override
  public boolean hasInstalled() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * True if the deployment is installed for the user
   * </pre>
   *
   * <code>.google.protobuf.BoolValue installed = 2;</code>
   *
   * @return The installed.
   */
  @java.lang.Override
  public com.google.protobuf.BoolValue getInstalled() {
    return installed_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : installed_;
  }

  /**
   *
   *
   * <pre>
   * True if the deployment is installed for the user
   * </pre>
   *
   * <code>.google.protobuf.BoolValue installed = 2;</code>
   */
  @java.lang.Override
  public com.google.protobuf.BoolValueOrBuilder getInstalledOrBuilder() {
    return installed_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : installed_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getInstalled());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getInstalled());
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
    if (!(obj instanceof com.google.cloud.gsuiteaddons.v1.InstallStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.gsuiteaddons.v1.InstallStatus other =
        (com.google.cloud.gsuiteaddons.v1.InstallStatus) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasInstalled() != other.hasInstalled()) return false;
    if (hasInstalled()) {
      if (!getInstalled().equals(other.getInstalled())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasInstalled()) {
      hash = (37 * hash) + INSTALLED_FIELD_NUMBER;
      hash = (53 * hash) + getInstalled().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gsuiteaddons.v1.InstallStatus prototype) {
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
   * Developer mode install status of a deployment
   * </pre>
   *
   * Protobuf type {@code google.cloud.gsuiteaddons.v1.InstallStatus}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gsuiteaddons.v1.InstallStatus)
      com.google.cloud.gsuiteaddons.v1.InstallStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
          .internal_static_google_cloud_gsuiteaddons_v1_InstallStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
          .internal_static_google_cloud_gsuiteaddons_v1_InstallStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gsuiteaddons.v1.InstallStatus.class,
              com.google.cloud.gsuiteaddons.v1.InstallStatus.Builder.class);
    }

    // Construct using com.google.cloud.gsuiteaddons.v1.InstallStatus.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getInstalledFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      installed_ = null;
      if (installedBuilder_ != null) {
        installedBuilder_.dispose();
        installedBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gsuiteaddons.v1.GSuiteAddOnsProto
          .internal_static_google_cloud_gsuiteaddons_v1_InstallStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gsuiteaddons.v1.InstallStatus getDefaultInstanceForType() {
      return com.google.cloud.gsuiteaddons.v1.InstallStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gsuiteaddons.v1.InstallStatus build() {
      com.google.cloud.gsuiteaddons.v1.InstallStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gsuiteaddons.v1.InstallStatus buildPartial() {
      com.google.cloud.gsuiteaddons.v1.InstallStatus result =
          new com.google.cloud.gsuiteaddons.v1.InstallStatus(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gsuiteaddons.v1.InstallStatus result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.installed_ = installedBuilder_ == null ? installed_ : installedBuilder_.build();
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
      if (other instanceof com.google.cloud.gsuiteaddons.v1.InstallStatus) {
        return mergeFrom((com.google.cloud.gsuiteaddons.v1.InstallStatus) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gsuiteaddons.v1.InstallStatus other) {
      if (other == com.google.cloud.gsuiteaddons.v1.InstallStatus.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasInstalled()) {
        mergeInstalled(other.getInstalled());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getInstalledFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * The canonical full resource name of the deployment install status.
     *
     * Example:  `projects/123/deployments/my_deployment/installStatus`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The canonical full resource name of the deployment install status.
     *
     * Example:  `projects/123/deployments/my_deployment/installStatus`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The canonical full resource name of the deployment install status.
     *
     * Example:  `projects/123/deployments/my_deployment/installStatus`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The canonical full resource name of the deployment install status.
     *
     * Example:  `projects/123/deployments/my_deployment/installStatus`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The canonical full resource name of the deployment install status.
     *
     * Example:  `projects/123/deployments/my_deployment/installStatus`.
     * </pre>
     *
     * <code>string name = 1;</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.BoolValue installed_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue,
            com.google.protobuf.BoolValue.Builder,
            com.google.protobuf.BoolValueOrBuilder>
        installedBuilder_;

    /**
     *
     *
     * <pre>
     * True if the deployment is installed for the user
     * </pre>
     *
     * <code>.google.protobuf.BoolValue installed = 2;</code>
     *
     * @return Whether the installed field is set.
     */
    public boolean hasInstalled() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * True if the deployment is installed for the user
     * </pre>
     *
     * <code>.google.protobuf.BoolValue installed = 2;</code>
     *
     * @return The installed.
     */
    public com.google.protobuf.BoolValue getInstalled() {
      if (installedBuilder_ == null) {
        return installed_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : installed_;
      } else {
        return installedBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * True if the deployment is installed for the user
     * </pre>
     *
     * <code>.google.protobuf.BoolValue installed = 2;</code>
     */
    public Builder setInstalled(com.google.protobuf.BoolValue value) {
      if (installedBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        installed_ = value;
      } else {
        installedBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * True if the deployment is installed for the user
     * </pre>
     *
     * <code>.google.protobuf.BoolValue installed = 2;</code>
     */
    public Builder setInstalled(com.google.protobuf.BoolValue.Builder builderForValue) {
      if (installedBuilder_ == null) {
        installed_ = builderForValue.build();
      } else {
        installedBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * True if the deployment is installed for the user
     * </pre>
     *
     * <code>.google.protobuf.BoolValue installed = 2;</code>
     */
    public Builder mergeInstalled(com.google.protobuf.BoolValue value) {
      if (installedBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && installed_ != null
            && installed_ != com.google.protobuf.BoolValue.getDefaultInstance()) {
          getInstalledBuilder().mergeFrom(value);
        } else {
          installed_ = value;
        }
      } else {
        installedBuilder_.mergeFrom(value);
      }
      if (installed_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * True if the deployment is installed for the user
     * </pre>
     *
     * <code>.google.protobuf.BoolValue installed = 2;</code>
     */
    public Builder clearInstalled() {
      bitField0_ = (bitField0_ & ~0x00000002);
      installed_ = null;
      if (installedBuilder_ != null) {
        installedBuilder_.dispose();
        installedBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * True if the deployment is installed for the user
     * </pre>
     *
     * <code>.google.protobuf.BoolValue installed = 2;</code>
     */
    public com.google.protobuf.BoolValue.Builder getInstalledBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInstalledFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * True if the deployment is installed for the user
     * </pre>
     *
     * <code>.google.protobuf.BoolValue installed = 2;</code>
     */
    public com.google.protobuf.BoolValueOrBuilder getInstalledOrBuilder() {
      if (installedBuilder_ != null) {
        return installedBuilder_.getMessageOrBuilder();
      } else {
        return installed_ == null ? com.google.protobuf.BoolValue.getDefaultInstance() : installed_;
      }
    }

    /**
     *
     *
     * <pre>
     * True if the deployment is installed for the user
     * </pre>
     *
     * <code>.google.protobuf.BoolValue installed = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.BoolValue,
            com.google.protobuf.BoolValue.Builder,
            com.google.protobuf.BoolValueOrBuilder>
        getInstalledFieldBuilder() {
      if (installedBuilder_ == null) {
        installedBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.BoolValue,
                com.google.protobuf.BoolValue.Builder,
                com.google.protobuf.BoolValueOrBuilder>(
                getInstalled(), getParentForChildren(), isClean());
        installed_ = null;
      }
      return installedBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gsuiteaddons.v1.InstallStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gsuiteaddons.v1.InstallStatus)
  private static final com.google.cloud.gsuiteaddons.v1.InstallStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gsuiteaddons.v1.InstallStatus();
  }

  public static com.google.cloud.gsuiteaddons.v1.InstallStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstallStatus> PARSER =
      new com.google.protobuf.AbstractParser<InstallStatus>() {
        @java.lang.Override
        public InstallStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstallStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstallStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gsuiteaddons.v1.InstallStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
