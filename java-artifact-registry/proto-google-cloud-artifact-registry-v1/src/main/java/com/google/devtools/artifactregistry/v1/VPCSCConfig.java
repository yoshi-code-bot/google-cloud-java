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
// source: google/devtools/artifactregistry/v1/vpcsc_config.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1;

/**
 *
 *
 * <pre>
 * The Artifact Registry VPC SC config that apply to a Project.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1.VPCSCConfig}
 */
public final class VPCSCConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1.VPCSCConfig)
    VPCSCConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use VPCSCConfig.newBuilder() to construct.
  private VPCSCConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private VPCSCConfig() {
    name_ = "";
    vpcscPolicy_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new VPCSCConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.artifactregistry.v1.VPCSCConfigProto
        .internal_static_google_devtools_artifactregistry_v1_VPCSCConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1.VPCSCConfigProto
        .internal_static_google_devtools_artifactregistry_v1_VPCSCConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1.VPCSCConfig.class,
            com.google.devtools.artifactregistry.v1.VPCSCConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * VPCSCPolicy is the VPC SC policy for project and location.
   * </pre>
   *
   * Protobuf enum {@code google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy}
   */
  public enum VPCSCPolicy implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * VPCSC_POLICY_UNSPECIFIED - the VPS SC policy is not defined.
     * When VPS SC policy is not defined - the Service will use the default
     * behavior (VPCSC_DENY).
     * </pre>
     *
     * <code>VPCSC_POLICY_UNSPECIFIED = 0;</code>
     */
    VPCSC_POLICY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * VPCSC_DENY - repository will block the requests to the Upstreams for the
     * Remote Repositories if the resource is in the perimeter.
     * </pre>
     *
     * <code>DENY = 1;</code>
     */
    DENY(1),
    /**
     *
     *
     * <pre>
     * VPCSC_ALLOW - repository will allow the requests to the Upstreams for the
     * Remote Repositories if the resource is in the perimeter.
     * </pre>
     *
     * <code>ALLOW = 2;</code>
     */
    ALLOW(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * VPCSC_POLICY_UNSPECIFIED - the VPS SC policy is not defined.
     * When VPS SC policy is not defined - the Service will use the default
     * behavior (VPCSC_DENY).
     * </pre>
     *
     * <code>VPCSC_POLICY_UNSPECIFIED = 0;</code>
     */
    public static final int VPCSC_POLICY_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * VPCSC_DENY - repository will block the requests to the Upstreams for the
     * Remote Repositories if the resource is in the perimeter.
     * </pre>
     *
     * <code>DENY = 1;</code>
     */
    public static final int DENY_VALUE = 1;

    /**
     *
     *
     * <pre>
     * VPCSC_ALLOW - repository will allow the requests to the Upstreams for the
     * Remote Repositories if the resource is in the perimeter.
     * </pre>
     *
     * <code>ALLOW = 2;</code>
     */
    public static final int ALLOW_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static VPCSCPolicy valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static VPCSCPolicy forNumber(int value) {
      switch (value) {
        case 0:
          return VPCSC_POLICY_UNSPECIFIED;
        case 1:
          return DENY;
        case 2:
          return ALLOW;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<VPCSCPolicy> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<VPCSCPolicy> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<VPCSCPolicy>() {
          public VPCSCPolicy findValueByNumber(int number) {
            return VPCSCPolicy.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.devtools.artifactregistry.v1.VPCSCConfig.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final VPCSCPolicy[] VALUES = values();

    public static VPCSCPolicy valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private VPCSCPolicy(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy)
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * The name of the project's VPC SC Config.
   *
   * Always of the form:
   * projects/{projectID}/locations/{location}/vpcscConfig
   *
   * In update request: never set
   * In response: always set
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
   * The name of the project's VPC SC Config.
   *
   * Always of the form:
   * projects/{projectID}/locations/{location}/vpcscConfig
   *
   * In update request: never set
   * In response: always set
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

  public static final int VPCSC_POLICY_FIELD_NUMBER = 2;
  private int vpcscPolicy_ = 0;

  /**
   *
   *
   * <pre>
   * The project per location VPC SC policy that defines the VPC SC behavior for
   * the Remote Repository (Allow/Deny).
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy vpcsc_policy = 2;</code>
   *
   * @return The enum numeric value on the wire for vpcscPolicy.
   */
  @java.lang.Override
  public int getVpcscPolicyValue() {
    return vpcscPolicy_;
  }

  /**
   *
   *
   * <pre>
   * The project per location VPC SC policy that defines the VPC SC behavior for
   * the Remote Repository (Allow/Deny).
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy vpcsc_policy = 2;</code>
   *
   * @return The vpcscPolicy.
   */
  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy getVpcscPolicy() {
    com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy result =
        com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy.forNumber(vpcscPolicy_);
    return result == null
        ? com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy.UNRECOGNIZED
        : result;
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
    if (vpcscPolicy_
        != com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy.VPCSC_POLICY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, vpcscPolicy_);
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
    if (vpcscPolicy_
        != com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy.VPCSC_POLICY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, vpcscPolicy_);
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
    if (!(obj instanceof com.google.devtools.artifactregistry.v1.VPCSCConfig)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1.VPCSCConfig other =
        (com.google.devtools.artifactregistry.v1.VPCSCConfig) obj;

    if (!getName().equals(other.getName())) return false;
    if (vpcscPolicy_ != other.vpcscPolicy_) return false;
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
    hash = (37 * hash) + VPCSC_POLICY_FIELD_NUMBER;
    hash = (53 * hash) + vpcscPolicy_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig parseFrom(
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

  public static Builder newBuilder(com.google.devtools.artifactregistry.v1.VPCSCConfig prototype) {
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
   * The Artifact Registry VPC SC config that apply to a Project.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1.VPCSCConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1.VPCSCConfig)
      com.google.devtools.artifactregistry.v1.VPCSCConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.artifactregistry.v1.VPCSCConfigProto
          .internal_static_google_devtools_artifactregistry_v1_VPCSCConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1.VPCSCConfigProto
          .internal_static_google_devtools_artifactregistry_v1_VPCSCConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1.VPCSCConfig.class,
              com.google.devtools.artifactregistry.v1.VPCSCConfig.Builder.class);
    }

    // Construct using com.google.devtools.artifactregistry.v1.VPCSCConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      vpcscPolicy_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1.VPCSCConfigProto
          .internal_static_google_devtools_artifactregistry_v1_VPCSCConfig_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.VPCSCConfig getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1.VPCSCConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.VPCSCConfig build() {
      com.google.devtools.artifactregistry.v1.VPCSCConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.VPCSCConfig buildPartial() {
      com.google.devtools.artifactregistry.v1.VPCSCConfig result =
          new com.google.devtools.artifactregistry.v1.VPCSCConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.devtools.artifactregistry.v1.VPCSCConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.vpcscPolicy_ = vpcscPolicy_;
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
      if (other instanceof com.google.devtools.artifactregistry.v1.VPCSCConfig) {
        return mergeFrom((com.google.devtools.artifactregistry.v1.VPCSCConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.devtools.artifactregistry.v1.VPCSCConfig other) {
      if (other == com.google.devtools.artifactregistry.v1.VPCSCConfig.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.vpcscPolicy_ != 0) {
        setVpcscPolicyValue(other.getVpcscPolicyValue());
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
            case 16:
              {
                vpcscPolicy_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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
     * The name of the project's VPC SC Config.
     *
     * Always of the form:
     * projects/{projectID}/locations/{location}/vpcscConfig
     *
     * In update request: never set
     * In response: always set
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
     * The name of the project's VPC SC Config.
     *
     * Always of the form:
     * projects/{projectID}/locations/{location}/vpcscConfig
     *
     * In update request: never set
     * In response: always set
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
     * The name of the project's VPC SC Config.
     *
     * Always of the form:
     * projects/{projectID}/locations/{location}/vpcscConfig
     *
     * In update request: never set
     * In response: always set
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
     * The name of the project's VPC SC Config.
     *
     * Always of the form:
     * projects/{projectID}/locations/{location}/vpcscConfig
     *
     * In update request: never set
     * In response: always set
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
     * The name of the project's VPC SC Config.
     *
     * Always of the form:
     * projects/{projectID}/locations/{location}/vpcscConfig
     *
     * In update request: never set
     * In response: always set
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

    private int vpcscPolicy_ = 0;

    /**
     *
     *
     * <pre>
     * The project per location VPC SC policy that defines the VPC SC behavior for
     * the Remote Repository (Allow/Deny).
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy vpcsc_policy = 2;</code>
     *
     * @return The enum numeric value on the wire for vpcscPolicy.
     */
    @java.lang.Override
    public int getVpcscPolicyValue() {
      return vpcscPolicy_;
    }

    /**
     *
     *
     * <pre>
     * The project per location VPC SC policy that defines the VPC SC behavior for
     * the Remote Repository (Allow/Deny).
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy vpcsc_policy = 2;</code>
     *
     * @param value The enum numeric value on the wire for vpcscPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setVpcscPolicyValue(int value) {
      vpcscPolicy_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The project per location VPC SC policy that defines the VPC SC behavior for
     * the Remote Repository (Allow/Deny).
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy vpcsc_policy = 2;</code>
     *
     * @return The vpcscPolicy.
     */
    @java.lang.Override
    public com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy getVpcscPolicy() {
      com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy result =
          com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy.forNumber(vpcscPolicy_);
      return result == null
          ? com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * The project per location VPC SC policy that defines the VPC SC behavior for
     * the Remote Repository (Allow/Deny).
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy vpcsc_policy = 2;</code>
     *
     * @param value The vpcscPolicy to set.
     * @return This builder for chaining.
     */
    public Builder setVpcscPolicy(
        com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      vpcscPolicy_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The project per location VPC SC policy that defines the VPC SC behavior for
     * the Remote Repository (Allow/Deny).
     * </pre>
     *
     * <code>.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy vpcsc_policy = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVpcscPolicy() {
      bitField0_ = (bitField0_ & ~0x00000002);
      vpcscPolicy_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1.VPCSCConfig)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1.VPCSCConfig)
  private static final com.google.devtools.artifactregistry.v1.VPCSCConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.artifactregistry.v1.VPCSCConfig();
  }

  public static com.google.devtools.artifactregistry.v1.VPCSCConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<VPCSCConfig> PARSER =
      new com.google.protobuf.AbstractParser<VPCSCConfig>() {
        @java.lang.Override
        public VPCSCConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<VPCSCConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<VPCSCConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1.VPCSCConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
