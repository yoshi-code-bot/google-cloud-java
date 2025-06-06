/*
 * Copyright 2025 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/common.proto

// Protobuf Java Version: 3.25.8
package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * License information.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.License}
 */
public final class License extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.License)
    LicenseOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use License.newBuilder() to construct.
  private License(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private License() {
    expression_ = "";
    comments_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new License();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Common.internal_static_grafeas_v1_License_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Common.internal_static_grafeas_v1_License_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.License.class, io.grafeas.v1.License.Builder.class);
  }

  public static final int EXPRESSION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object expression_ = "";

  /**
   *
   *
   * <pre>
   * Often a single license can be used to represent the licensing terms.
   * Sometimes it is necessary to include a choice of one or more licenses
   * or some combination of license identifiers.
   * Examples: "LGPL-2.1-only OR MIT", "LGPL-2.1-only AND MIT",
   * "GPL-2.0-or-later WITH Bison-exception-2.2".
   * </pre>
   *
   * <code>string expression = 1;</code>
   *
   * @return The expression.
   */
  @java.lang.Override
  public java.lang.String getExpression() {
    java.lang.Object ref = expression_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      expression_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Often a single license can be used to represent the licensing terms.
   * Sometimes it is necessary to include a choice of one or more licenses
   * or some combination of license identifiers.
   * Examples: "LGPL-2.1-only OR MIT", "LGPL-2.1-only AND MIT",
   * "GPL-2.0-or-later WITH Bison-exception-2.2".
   * </pre>
   *
   * <code>string expression = 1;</code>
   *
   * @return The bytes for expression.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getExpressionBytes() {
    java.lang.Object ref = expression_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      expression_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int COMMENTS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object comments_ = "";

  /**
   *
   *
   * <pre>
   * Comments
   * </pre>
   *
   * <code>string comments = 2;</code>
   *
   * @return The comments.
   */
  @java.lang.Override
  public java.lang.String getComments() {
    java.lang.Object ref = comments_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      comments_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Comments
   * </pre>
   *
   * <code>string comments = 2;</code>
   *
   * @return The bytes for comments.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getCommentsBytes() {
    java.lang.Object ref = comments_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      comments_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(expression_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, expression_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comments_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, comments_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(expression_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, expression_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(comments_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, comments_);
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
    if (!(obj instanceof io.grafeas.v1.License)) {
      return super.equals(obj);
    }
    io.grafeas.v1.License other = (io.grafeas.v1.License) obj;

    if (!getExpression().equals(other.getExpression())) return false;
    if (!getComments().equals(other.getComments())) return false;
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
    hash = (37 * hash) + EXPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + getExpression().hashCode();
    hash = (37 * hash) + COMMENTS_FIELD_NUMBER;
    hash = (53 * hash) + getComments().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.License parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.License parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.License parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.License parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.License parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.License parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.License parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.License parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.License parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.License parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.License parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.License parseFrom(
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

  public static Builder newBuilder(io.grafeas.v1.License prototype) {
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
   * License information.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.License}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.License)
      io.grafeas.v1.LicenseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Common.internal_static_grafeas_v1_License_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Common.internal_static_grafeas_v1_License_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.License.class, io.grafeas.v1.License.Builder.class);
    }

    // Construct using io.grafeas.v1.License.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      expression_ = "";
      comments_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Common.internal_static_grafeas_v1_License_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.License getDefaultInstanceForType() {
      return io.grafeas.v1.License.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.License build() {
      io.grafeas.v1.License result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.License buildPartial() {
      io.grafeas.v1.License result = new io.grafeas.v1.License(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.License result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.expression_ = expression_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.comments_ = comments_;
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
      if (other instanceof io.grafeas.v1.License) {
        return mergeFrom((io.grafeas.v1.License) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.License other) {
      if (other == io.grafeas.v1.License.getDefaultInstance()) return this;
      if (!other.getExpression().isEmpty()) {
        expression_ = other.expression_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getComments().isEmpty()) {
        comments_ = other.comments_;
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
                expression_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                comments_ = input.readStringRequireUtf8();
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

    private java.lang.Object expression_ = "";

    /**
     *
     *
     * <pre>
     * Often a single license can be used to represent the licensing terms.
     * Sometimes it is necessary to include a choice of one or more licenses
     * or some combination of license identifiers.
     * Examples: "LGPL-2.1-only OR MIT", "LGPL-2.1-only AND MIT",
     * "GPL-2.0-or-later WITH Bison-exception-2.2".
     * </pre>
     *
     * <code>string expression = 1;</code>
     *
     * @return The expression.
     */
    public java.lang.String getExpression() {
      java.lang.Object ref = expression_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        expression_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Often a single license can be used to represent the licensing terms.
     * Sometimes it is necessary to include a choice of one or more licenses
     * or some combination of license identifiers.
     * Examples: "LGPL-2.1-only OR MIT", "LGPL-2.1-only AND MIT",
     * "GPL-2.0-or-later WITH Bison-exception-2.2".
     * </pre>
     *
     * <code>string expression = 1;</code>
     *
     * @return The bytes for expression.
     */
    public com.google.protobuf.ByteString getExpressionBytes() {
      java.lang.Object ref = expression_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        expression_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Often a single license can be used to represent the licensing terms.
     * Sometimes it is necessary to include a choice of one or more licenses
     * or some combination of license identifiers.
     * Examples: "LGPL-2.1-only OR MIT", "LGPL-2.1-only AND MIT",
     * "GPL-2.0-or-later WITH Bison-exception-2.2".
     * </pre>
     *
     * <code>string expression = 1;</code>
     *
     * @param value The expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpression(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      expression_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Often a single license can be used to represent the licensing terms.
     * Sometimes it is necessary to include a choice of one or more licenses
     * or some combination of license identifiers.
     * Examples: "LGPL-2.1-only OR MIT", "LGPL-2.1-only AND MIT",
     * "GPL-2.0-or-later WITH Bison-exception-2.2".
     * </pre>
     *
     * <code>string expression = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExpression() {
      expression_ = getDefaultInstance().getExpression();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Often a single license can be used to represent the licensing terms.
     * Sometimes it is necessary to include a choice of one or more licenses
     * or some combination of license identifiers.
     * Examples: "LGPL-2.1-only OR MIT", "LGPL-2.1-only AND MIT",
     * "GPL-2.0-or-later WITH Bison-exception-2.2".
     * </pre>
     *
     * <code>string expression = 1;</code>
     *
     * @param value The bytes for expression to set.
     * @return This builder for chaining.
     */
    public Builder setExpressionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      expression_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object comments_ = "";

    /**
     *
     *
     * <pre>
     * Comments
     * </pre>
     *
     * <code>string comments = 2;</code>
     *
     * @return The comments.
     */
    public java.lang.String getComments() {
      java.lang.Object ref = comments_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        comments_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Comments
     * </pre>
     *
     * <code>string comments = 2;</code>
     *
     * @return The bytes for comments.
     */
    public com.google.protobuf.ByteString getCommentsBytes() {
      java.lang.Object ref = comments_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        comments_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Comments
     * </pre>
     *
     * <code>string comments = 2;</code>
     *
     * @param value The comments to set.
     * @return This builder for chaining.
     */
    public Builder setComments(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      comments_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Comments
     * </pre>
     *
     * <code>string comments = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearComments() {
      comments_ = getDefaultInstance().getComments();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Comments
     * </pre>
     *
     * <code>string comments = 2;</code>
     *
     * @param value The bytes for comments to set.
     * @return This builder for chaining.
     */
    public Builder setCommentsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      comments_ = value;
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

    // @@protoc_insertion_point(builder_scope:grafeas.v1.License)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.License)
  private static final io.grafeas.v1.License DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.License();
  }

  public static io.grafeas.v1.License getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<License> PARSER =
      new com.google.protobuf.AbstractParser<License>() {
        @java.lang.Override
        public License parsePartialFrom(
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

  public static com.google.protobuf.Parser<License> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<License> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.License getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
