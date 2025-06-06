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
// source: google/api/servicemanagement/v1/servicemanager.proto

// Protobuf Java Version: 3.25.8
package com.google.api.servicemanagement.v1;

/**
 *
 *
 * <pre>
 * Response message for SubmitConfigSource method.
 * </pre>
 *
 * Protobuf type {@code google.api.servicemanagement.v1.SubmitConfigSourceResponse}
 */
public final class SubmitConfigSourceResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.api.servicemanagement.v1.SubmitConfigSourceResponse)
    SubmitConfigSourceResponseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use SubmitConfigSourceResponse.newBuilder() to construct.
  private SubmitConfigSourceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SubmitConfigSourceResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SubmitConfigSourceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto
        .internal_static_google_api_servicemanagement_v1_SubmitConfigSourceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.api.servicemanagement.v1.ServiceManagerProto
        .internal_static_google_api_servicemanagement_v1_SubmitConfigSourceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.api.servicemanagement.v1.SubmitConfigSourceResponse.class,
            com.google.api.servicemanagement.v1.SubmitConfigSourceResponse.Builder.class);
  }

  private int bitField0_;
  public static final int SERVICE_CONFIG_FIELD_NUMBER = 1;
  private com.google.api.Service serviceConfig_;

  /**
   *
   *
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>.google.api.Service service_config = 1;</code>
   *
   * @return Whether the serviceConfig field is set.
   */
  @java.lang.Override
  public boolean hasServiceConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>.google.api.Service service_config = 1;</code>
   *
   * @return The serviceConfig.
   */
  @java.lang.Override
  public com.google.api.Service getServiceConfig() {
    return serviceConfig_ == null ? com.google.api.Service.getDefaultInstance() : serviceConfig_;
  }

  /**
   *
   *
   * <pre>
   * The generated service configuration.
   * </pre>
   *
   * <code>.google.api.Service service_config = 1;</code>
   */
  @java.lang.Override
  public com.google.api.ServiceOrBuilder getServiceConfigOrBuilder() {
    return serviceConfig_ == null ? com.google.api.Service.getDefaultInstance() : serviceConfig_;
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
      output.writeMessage(1, getServiceConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getServiceConfig());
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
    if (!(obj instanceof com.google.api.servicemanagement.v1.SubmitConfigSourceResponse)) {
      return super.equals(obj);
    }
    com.google.api.servicemanagement.v1.SubmitConfigSourceResponse other =
        (com.google.api.servicemanagement.v1.SubmitConfigSourceResponse) obj;

    if (hasServiceConfig() != other.hasServiceConfig()) return false;
    if (hasServiceConfig()) {
      if (!getServiceConfig().equals(other.getServiceConfig())) return false;
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
    if (hasServiceConfig()) {
      hash = (37 * hash) + SERVICE_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getServiceConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse parseFrom(
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
      com.google.api.servicemanagement.v1.SubmitConfigSourceResponse prototype) {
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
   * Response message for SubmitConfigSource method.
   * </pre>
   *
   * Protobuf type {@code google.api.servicemanagement.v1.SubmitConfigSourceResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.api.servicemanagement.v1.SubmitConfigSourceResponse)
      com.google.api.servicemanagement.v1.SubmitConfigSourceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_SubmitConfigSourceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_SubmitConfigSourceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.api.servicemanagement.v1.SubmitConfigSourceResponse.class,
              com.google.api.servicemanagement.v1.SubmitConfigSourceResponse.Builder.class);
    }

    // Construct using com.google.api.servicemanagement.v1.SubmitConfigSourceResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getServiceConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      serviceConfig_ = null;
      if (serviceConfigBuilder_ != null) {
        serviceConfigBuilder_.dispose();
        serviceConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.api.servicemanagement.v1.ServiceManagerProto
          .internal_static_google_api_servicemanagement_v1_SubmitConfigSourceResponse_descriptor;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.SubmitConfigSourceResponse
        getDefaultInstanceForType() {
      return com.google.api.servicemanagement.v1.SubmitConfigSourceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.SubmitConfigSourceResponse build() {
      com.google.api.servicemanagement.v1.SubmitConfigSourceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.api.servicemanagement.v1.SubmitConfigSourceResponse buildPartial() {
      com.google.api.servicemanagement.v1.SubmitConfigSourceResponse result =
          new com.google.api.servicemanagement.v1.SubmitConfigSourceResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.api.servicemanagement.v1.SubmitConfigSourceResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.serviceConfig_ =
            serviceConfigBuilder_ == null ? serviceConfig_ : serviceConfigBuilder_.build();
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
      if (other instanceof com.google.api.servicemanagement.v1.SubmitConfigSourceResponse) {
        return mergeFrom((com.google.api.servicemanagement.v1.SubmitConfigSourceResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.api.servicemanagement.v1.SubmitConfigSourceResponse other) {
      if (other
          == com.google.api.servicemanagement.v1.SubmitConfigSourceResponse.getDefaultInstance())
        return this;
      if (other.hasServiceConfig()) {
        mergeServiceConfig(other.getServiceConfig());
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
                input.readMessage(getServiceConfigFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.api.Service serviceConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.Service, com.google.api.Service.Builder, com.google.api.ServiceOrBuilder>
        serviceConfigBuilder_;

    /**
     *
     *
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>.google.api.Service service_config = 1;</code>
     *
     * @return Whether the serviceConfig field is set.
     */
    public boolean hasServiceConfig() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>.google.api.Service service_config = 1;</code>
     *
     * @return The serviceConfig.
     */
    public com.google.api.Service getServiceConfig() {
      if (serviceConfigBuilder_ == null) {
        return serviceConfig_ == null
            ? com.google.api.Service.getDefaultInstance()
            : serviceConfig_;
      } else {
        return serviceConfigBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>.google.api.Service service_config = 1;</code>
     */
    public Builder setServiceConfig(com.google.api.Service value) {
      if (serviceConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        serviceConfig_ = value;
      } else {
        serviceConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>.google.api.Service service_config = 1;</code>
     */
    public Builder setServiceConfig(com.google.api.Service.Builder builderForValue) {
      if (serviceConfigBuilder_ == null) {
        serviceConfig_ = builderForValue.build();
      } else {
        serviceConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>.google.api.Service service_config = 1;</code>
     */
    public Builder mergeServiceConfig(com.google.api.Service value) {
      if (serviceConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && serviceConfig_ != null
            && serviceConfig_ != com.google.api.Service.getDefaultInstance()) {
          getServiceConfigBuilder().mergeFrom(value);
        } else {
          serviceConfig_ = value;
        }
      } else {
        serviceConfigBuilder_.mergeFrom(value);
      }
      if (serviceConfig_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>.google.api.Service service_config = 1;</code>
     */
    public Builder clearServiceConfig() {
      bitField0_ = (bitField0_ & ~0x00000001);
      serviceConfig_ = null;
      if (serviceConfigBuilder_ != null) {
        serviceConfigBuilder_.dispose();
        serviceConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>.google.api.Service service_config = 1;</code>
     */
    public com.google.api.Service.Builder getServiceConfigBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getServiceConfigFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>.google.api.Service service_config = 1;</code>
     */
    public com.google.api.ServiceOrBuilder getServiceConfigOrBuilder() {
      if (serviceConfigBuilder_ != null) {
        return serviceConfigBuilder_.getMessageOrBuilder();
      } else {
        return serviceConfig_ == null
            ? com.google.api.Service.getDefaultInstance()
            : serviceConfig_;
      }
    }

    /**
     *
     *
     * <pre>
     * The generated service configuration.
     * </pre>
     *
     * <code>.google.api.Service service_config = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.Service, com.google.api.Service.Builder, com.google.api.ServiceOrBuilder>
        getServiceConfigFieldBuilder() {
      if (serviceConfigBuilder_ == null) {
        serviceConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.Service,
                com.google.api.Service.Builder,
                com.google.api.ServiceOrBuilder>(
                getServiceConfig(), getParentForChildren(), isClean());
        serviceConfig_ = null;
      }
      return serviceConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.api.servicemanagement.v1.SubmitConfigSourceResponse)
  }

  // @@protoc_insertion_point(class_scope:google.api.servicemanagement.v1.SubmitConfigSourceResponse)
  private static final com.google.api.servicemanagement.v1.SubmitConfigSourceResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.api.servicemanagement.v1.SubmitConfigSourceResponse();
  }

  public static com.google.api.servicemanagement.v1.SubmitConfigSourceResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SubmitConfigSourceResponse> PARSER =
      new com.google.protobuf.AbstractParser<SubmitConfigSourceResponse>() {
        @java.lang.Override
        public SubmitConfigSourceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SubmitConfigSourceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SubmitConfigSourceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.api.servicemanagement.v1.SubmitConfigSourceResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
