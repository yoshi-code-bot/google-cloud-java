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
// source: google/appengine/v1/certificate.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * An SSL certificate obtained from a certificate authority.
 * </pre>
 *
 * Protobuf type {@code google.appengine.v1.CertificateRawData}
 */
public final class CertificateRawData extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.appengine.v1.CertificateRawData)
    CertificateRawDataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use CertificateRawData.newBuilder() to construct.
  private CertificateRawData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CertificateRawData() {
    publicCertificate_ = "";
    privateKey_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CertificateRawData();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.appengine.v1.CertificateProto
        .internal_static_google_appengine_v1_CertificateRawData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.appengine.v1.CertificateProto
        .internal_static_google_appengine_v1_CertificateRawData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.appengine.v1.CertificateRawData.class,
            com.google.appengine.v1.CertificateRawData.Builder.class);
  }

  public static final int PUBLIC_CERTIFICATE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object publicCertificate_ = "";

  /**
   *
   *
   * <pre>
   * PEM encoded x.509 public key certificate. This field is set once on
   * certificate creation. Must include the header and footer. Example:
   * &lt;pre&gt;
   * -----BEGIN CERTIFICATE-----
   * &lt;certificate_value&gt;
   * -----END CERTIFICATE-----
   * &lt;/pre&gt;
   * </pre>
   *
   * <code>string public_certificate = 1;</code>
   *
   * @return The publicCertificate.
   */
  @java.lang.Override
  public java.lang.String getPublicCertificate() {
    java.lang.Object ref = publicCertificate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      publicCertificate_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * PEM encoded x.509 public key certificate. This field is set once on
   * certificate creation. Must include the header and footer. Example:
   * &lt;pre&gt;
   * -----BEGIN CERTIFICATE-----
   * &lt;certificate_value&gt;
   * -----END CERTIFICATE-----
   * &lt;/pre&gt;
   * </pre>
   *
   * <code>string public_certificate = 1;</code>
   *
   * @return The bytes for publicCertificate.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPublicCertificateBytes() {
    java.lang.Object ref = publicCertificate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      publicCertificate_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PRIVATE_KEY_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object privateKey_ = "";

  /**
   *
   *
   * <pre>
   * Unencrypted PEM encoded RSA private key. This field is set once on
   * certificate creation and then encrypted. The key size must be 2048
   * bits or fewer. Must include the header and footer. Example:
   * &lt;pre&gt;
   * -----BEGIN RSA PRIVATE KEY-----
   * &lt;unencrypted_key_value&gt;
   * -----END RSA PRIVATE KEY-----
   * &lt;/pre&gt;
   * &#64;InputOnly
   * </pre>
   *
   * <code>string private_key = 2;</code>
   *
   * @return The privateKey.
   */
  @java.lang.Override
  public java.lang.String getPrivateKey() {
    java.lang.Object ref = privateKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      privateKey_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Unencrypted PEM encoded RSA private key. This field is set once on
   * certificate creation and then encrypted. The key size must be 2048
   * bits or fewer. Must include the header and footer. Example:
   * &lt;pre&gt;
   * -----BEGIN RSA PRIVATE KEY-----
   * &lt;unencrypted_key_value&gt;
   * -----END RSA PRIVATE KEY-----
   * &lt;/pre&gt;
   * &#64;InputOnly
   * </pre>
   *
   * <code>string private_key = 2;</code>
   *
   * @return The bytes for privateKey.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPrivateKeyBytes() {
    java.lang.Object ref = privateKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      privateKey_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicCertificate_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, publicCertificate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(privateKey_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, privateKey_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(publicCertificate_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, publicCertificate_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(privateKey_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, privateKey_);
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
    if (!(obj instanceof com.google.appengine.v1.CertificateRawData)) {
      return super.equals(obj);
    }
    com.google.appengine.v1.CertificateRawData other =
        (com.google.appengine.v1.CertificateRawData) obj;

    if (!getPublicCertificate().equals(other.getPublicCertificate())) return false;
    if (!getPrivateKey().equals(other.getPrivateKey())) return false;
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
    hash = (37 * hash) + PUBLIC_CERTIFICATE_FIELD_NUMBER;
    hash = (53 * hash) + getPublicCertificate().hashCode();
    hash = (37 * hash) + PRIVATE_KEY_FIELD_NUMBER;
    hash = (53 * hash) + getPrivateKey().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.appengine.v1.CertificateRawData parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CertificateRawData parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CertificateRawData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CertificateRawData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CertificateRawData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.appengine.v1.CertificateRawData parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.appengine.v1.CertificateRawData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CertificateRawData parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.CertificateRawData parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CertificateRawData parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.appengine.v1.CertificateRawData parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.appengine.v1.CertificateRawData parseFrom(
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

  public static Builder newBuilder(com.google.appengine.v1.CertificateRawData prototype) {
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
   * An SSL certificate obtained from a certificate authority.
   * </pre>
   *
   * Protobuf type {@code google.appengine.v1.CertificateRawData}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.appengine.v1.CertificateRawData)
      com.google.appengine.v1.CertificateRawDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.appengine.v1.CertificateProto
          .internal_static_google_appengine_v1_CertificateRawData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.appengine.v1.CertificateProto
          .internal_static_google_appengine_v1_CertificateRawData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.appengine.v1.CertificateRawData.class,
              com.google.appengine.v1.CertificateRawData.Builder.class);
    }

    // Construct using com.google.appengine.v1.CertificateRawData.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      publicCertificate_ = "";
      privateKey_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.appengine.v1.CertificateProto
          .internal_static_google_appengine_v1_CertificateRawData_descriptor;
    }

    @java.lang.Override
    public com.google.appengine.v1.CertificateRawData getDefaultInstanceForType() {
      return com.google.appengine.v1.CertificateRawData.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.appengine.v1.CertificateRawData build() {
      com.google.appengine.v1.CertificateRawData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.appengine.v1.CertificateRawData buildPartial() {
      com.google.appengine.v1.CertificateRawData result =
          new com.google.appengine.v1.CertificateRawData(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.appengine.v1.CertificateRawData result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.publicCertificate_ = publicCertificate_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.privateKey_ = privateKey_;
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
      if (other instanceof com.google.appengine.v1.CertificateRawData) {
        return mergeFrom((com.google.appengine.v1.CertificateRawData) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.appengine.v1.CertificateRawData other) {
      if (other == com.google.appengine.v1.CertificateRawData.getDefaultInstance()) return this;
      if (!other.getPublicCertificate().isEmpty()) {
        publicCertificate_ = other.publicCertificate_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPrivateKey().isEmpty()) {
        privateKey_ = other.privateKey_;
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
                publicCertificate_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                privateKey_ = input.readStringRequireUtf8();
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

    private java.lang.Object publicCertificate_ = "";

    /**
     *
     *
     * <pre>
     * PEM encoded x.509 public key certificate. This field is set once on
     * certificate creation. Must include the header and footer. Example:
     * &lt;pre&gt;
     * -----BEGIN CERTIFICATE-----
     * &lt;certificate_value&gt;
     * -----END CERTIFICATE-----
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>string public_certificate = 1;</code>
     *
     * @return The publicCertificate.
     */
    public java.lang.String getPublicCertificate() {
      java.lang.Object ref = publicCertificate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        publicCertificate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * PEM encoded x.509 public key certificate. This field is set once on
     * certificate creation. Must include the header and footer. Example:
     * &lt;pre&gt;
     * -----BEGIN CERTIFICATE-----
     * &lt;certificate_value&gt;
     * -----END CERTIFICATE-----
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>string public_certificate = 1;</code>
     *
     * @return The bytes for publicCertificate.
     */
    public com.google.protobuf.ByteString getPublicCertificateBytes() {
      java.lang.Object ref = publicCertificate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        publicCertificate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * PEM encoded x.509 public key certificate. This field is set once on
     * certificate creation. Must include the header and footer. Example:
     * &lt;pre&gt;
     * -----BEGIN CERTIFICATE-----
     * &lt;certificate_value&gt;
     * -----END CERTIFICATE-----
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>string public_certificate = 1;</code>
     *
     * @param value The publicCertificate to set.
     * @return This builder for chaining.
     */
    public Builder setPublicCertificate(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      publicCertificate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * PEM encoded x.509 public key certificate. This field is set once on
     * certificate creation. Must include the header and footer. Example:
     * &lt;pre&gt;
     * -----BEGIN CERTIFICATE-----
     * &lt;certificate_value&gt;
     * -----END CERTIFICATE-----
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>string public_certificate = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPublicCertificate() {
      publicCertificate_ = getDefaultInstance().getPublicCertificate();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * PEM encoded x.509 public key certificate. This field is set once on
     * certificate creation. Must include the header and footer. Example:
     * &lt;pre&gt;
     * -----BEGIN CERTIFICATE-----
     * &lt;certificate_value&gt;
     * -----END CERTIFICATE-----
     * &lt;/pre&gt;
     * </pre>
     *
     * <code>string public_certificate = 1;</code>
     *
     * @param value The bytes for publicCertificate to set.
     * @return This builder for chaining.
     */
    public Builder setPublicCertificateBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      publicCertificate_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object privateKey_ = "";

    /**
     *
     *
     * <pre>
     * Unencrypted PEM encoded RSA private key. This field is set once on
     * certificate creation and then encrypted. The key size must be 2048
     * bits or fewer. Must include the header and footer. Example:
     * &lt;pre&gt;
     * -----BEGIN RSA PRIVATE KEY-----
     * &lt;unencrypted_key_value&gt;
     * -----END RSA PRIVATE KEY-----
     * &lt;/pre&gt;
     * &#64;InputOnly
     * </pre>
     *
     * <code>string private_key = 2;</code>
     *
     * @return The privateKey.
     */
    public java.lang.String getPrivateKey() {
      java.lang.Object ref = privateKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        privateKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Unencrypted PEM encoded RSA private key. This field is set once on
     * certificate creation and then encrypted. The key size must be 2048
     * bits or fewer. Must include the header and footer. Example:
     * &lt;pre&gt;
     * -----BEGIN RSA PRIVATE KEY-----
     * &lt;unencrypted_key_value&gt;
     * -----END RSA PRIVATE KEY-----
     * &lt;/pre&gt;
     * &#64;InputOnly
     * </pre>
     *
     * <code>string private_key = 2;</code>
     *
     * @return The bytes for privateKey.
     */
    public com.google.protobuf.ByteString getPrivateKeyBytes() {
      java.lang.Object ref = privateKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        privateKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Unencrypted PEM encoded RSA private key. This field is set once on
     * certificate creation and then encrypted. The key size must be 2048
     * bits or fewer. Must include the header and footer. Example:
     * &lt;pre&gt;
     * -----BEGIN RSA PRIVATE KEY-----
     * &lt;unencrypted_key_value&gt;
     * -----END RSA PRIVATE KEY-----
     * &lt;/pre&gt;
     * &#64;InputOnly
     * </pre>
     *
     * <code>string private_key = 2;</code>
     *
     * @param value The privateKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      privateKey_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Unencrypted PEM encoded RSA private key. This field is set once on
     * certificate creation and then encrypted. The key size must be 2048
     * bits or fewer. Must include the header and footer. Example:
     * &lt;pre&gt;
     * -----BEGIN RSA PRIVATE KEY-----
     * &lt;unencrypted_key_value&gt;
     * -----END RSA PRIVATE KEY-----
     * &lt;/pre&gt;
     * &#64;InputOnly
     * </pre>
     *
     * <code>string private_key = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPrivateKey() {
      privateKey_ = getDefaultInstance().getPrivateKey();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Unencrypted PEM encoded RSA private key. This field is set once on
     * certificate creation and then encrypted. The key size must be 2048
     * bits or fewer. Must include the header and footer. Example:
     * &lt;pre&gt;
     * -----BEGIN RSA PRIVATE KEY-----
     * &lt;unencrypted_key_value&gt;
     * -----END RSA PRIVATE KEY-----
     * &lt;/pre&gt;
     * &#64;InputOnly
     * </pre>
     *
     * <code>string private_key = 2;</code>
     *
     * @param value The bytes for privateKey to set.
     * @return This builder for chaining.
     */
    public Builder setPrivateKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      privateKey_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.appengine.v1.CertificateRawData)
  }

  // @@protoc_insertion_point(class_scope:google.appengine.v1.CertificateRawData)
  private static final com.google.appengine.v1.CertificateRawData DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.appengine.v1.CertificateRawData();
  }

  public static com.google.appengine.v1.CertificateRawData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CertificateRawData> PARSER =
      new com.google.protobuf.AbstractParser<CertificateRawData>() {
        @java.lang.Override
        public CertificateRawData parsePartialFrom(
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

  public static com.google.protobuf.Parser<CertificateRawData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CertificateRawData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.appengine.v1.CertificateRawData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
