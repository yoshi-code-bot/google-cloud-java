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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.migrationcenter.v1;

/**
 *
 *
 * <pre>
 * Describes the fit level of an asset for migration to a specific target.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.FitDescriptor}
 */
public final class FitDescriptor extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.FitDescriptor)
    FitDescriptorOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use FitDescriptor.newBuilder() to construct.
  private FitDescriptor(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FitDescriptor() {
    fitLevel_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FitDescriptor();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_FitDescriptor_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_FitDescriptor_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.FitDescriptor.class,
            com.google.cloud.migrationcenter.v1.FitDescriptor.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Fit level.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.migrationcenter.v1.FitDescriptor.FitLevel}
   */
  public enum FitLevel implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not enough information.
     * </pre>
     *
     * <code>FIT_LEVEL_UNSPECIFIED = 0;</code>
     */
    FIT_LEVEL_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Fit.
     * </pre>
     *
     * <code>FIT = 1;</code>
     */
    FIT(1),
    /**
     *
     *
     * <pre>
     * No Fit.
     * </pre>
     *
     * <code>NO_FIT = 2;</code>
     */
    NO_FIT(2),
    /**
     *
     *
     * <pre>
     * Fit with effort.
     * </pre>
     *
     * <code>REQUIRES_EFFORT = 3;</code>
     */
    REQUIRES_EFFORT(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not enough information.
     * </pre>
     *
     * <code>FIT_LEVEL_UNSPECIFIED = 0;</code>
     */
    public static final int FIT_LEVEL_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Fit.
     * </pre>
     *
     * <code>FIT = 1;</code>
     */
    public static final int FIT_VALUE = 1;

    /**
     *
     *
     * <pre>
     * No Fit.
     * </pre>
     *
     * <code>NO_FIT = 2;</code>
     */
    public static final int NO_FIT_VALUE = 2;

    /**
     *
     *
     * <pre>
     * Fit with effort.
     * </pre>
     *
     * <code>REQUIRES_EFFORT = 3;</code>
     */
    public static final int REQUIRES_EFFORT_VALUE = 3;

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
    public static FitLevel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static FitLevel forNumber(int value) {
      switch (value) {
        case 0:
          return FIT_LEVEL_UNSPECIFIED;
        case 1:
          return FIT;
        case 2:
          return NO_FIT;
        case 3:
          return REQUIRES_EFFORT;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<FitLevel> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<FitLevel> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<FitLevel>() {
          public FitLevel findValueByNumber(int number) {
            return FitLevel.forNumber(number);
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
      return com.google.cloud.migrationcenter.v1.FitDescriptor.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final FitLevel[] VALUES = values();

    public static FitLevel valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private FitLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.migrationcenter.v1.FitDescriptor.FitLevel)
  }

  public static final int FIT_LEVEL_FIELD_NUMBER = 1;
  private int fitLevel_ = 0;

  /**
   *
   *
   * <pre>
   * Fit level.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel fit_level = 1;</code>
   *
   * @return The enum numeric value on the wire for fitLevel.
   */
  @java.lang.Override
  public int getFitLevelValue() {
    return fitLevel_;
  }

  /**
   *
   *
   * <pre>
   * Fit level.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel fit_level = 1;</code>
   *
   * @return The fitLevel.
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel getFitLevel() {
    com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel result =
        com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel.forNumber(fitLevel_);
    return result == null
        ? com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel.UNRECOGNIZED
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
    if (fitLevel_
        != com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel.FIT_LEVEL_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, fitLevel_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (fitLevel_
        != com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel.FIT_LEVEL_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, fitLevel_);
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.FitDescriptor)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.FitDescriptor other =
        (com.google.cloud.migrationcenter.v1.FitDescriptor) obj;

    if (fitLevel_ != other.fitLevel_) return false;
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
    hash = (37 * hash) + FIT_LEVEL_FIELD_NUMBER;
    hash = (53 * hash) + fitLevel_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor parseFrom(
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

  public static Builder newBuilder(com.google.cloud.migrationcenter.v1.FitDescriptor prototype) {
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
   * Describes the fit level of an asset for migration to a specific target.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.FitDescriptor}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.FitDescriptor)
      com.google.cloud.migrationcenter.v1.FitDescriptorOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_FitDescriptor_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_FitDescriptor_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.FitDescriptor.class,
              com.google.cloud.migrationcenter.v1.FitDescriptor.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.FitDescriptor.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      fitLevel_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_FitDescriptor_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.FitDescriptor getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.FitDescriptor.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.FitDescriptor build() {
      com.google.cloud.migrationcenter.v1.FitDescriptor result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.FitDescriptor buildPartial() {
      com.google.cloud.migrationcenter.v1.FitDescriptor result =
          new com.google.cloud.migrationcenter.v1.FitDescriptor(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.migrationcenter.v1.FitDescriptor result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.fitLevel_ = fitLevel_;
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
      if (other instanceof com.google.cloud.migrationcenter.v1.FitDescriptor) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.FitDescriptor) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.migrationcenter.v1.FitDescriptor other) {
      if (other == com.google.cloud.migrationcenter.v1.FitDescriptor.getDefaultInstance())
        return this;
      if (other.fitLevel_ != 0) {
        setFitLevelValue(other.getFitLevelValue());
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
            case 8:
              {
                fitLevel_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int fitLevel_ = 0;

    /**
     *
     *
     * <pre>
     * Fit level.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel fit_level = 1;</code>
     *
     * @return The enum numeric value on the wire for fitLevel.
     */
    @java.lang.Override
    public int getFitLevelValue() {
      return fitLevel_;
    }

    /**
     *
     *
     * <pre>
     * Fit level.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel fit_level = 1;</code>
     *
     * @param value The enum numeric value on the wire for fitLevel to set.
     * @return This builder for chaining.
     */
    public Builder setFitLevelValue(int value) {
      fitLevel_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Fit level.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel fit_level = 1;</code>
     *
     * @return The fitLevel.
     */
    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel getFitLevel() {
      com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel result =
          com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel.forNumber(fitLevel_);
      return result == null
          ? com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Fit level.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel fit_level = 1;</code>
     *
     * @param value The fitLevel to set.
     * @return This builder for chaining.
     */
    public Builder setFitLevel(com.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      fitLevel_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Fit level.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.FitDescriptor.FitLevel fit_level = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFitLevel() {
      bitField0_ = (bitField0_ & ~0x00000001);
      fitLevel_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.FitDescriptor)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.FitDescriptor)
  private static final com.google.cloud.migrationcenter.v1.FitDescriptor DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.FitDescriptor();
  }

  public static com.google.cloud.migrationcenter.v1.FitDescriptor getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FitDescriptor> PARSER =
      new com.google.protobuf.AbstractParser<FitDescriptor>() {
        @java.lang.Override
        public FitDescriptor parsePartialFrom(
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

  public static com.google.protobuf.Parser<FitDescriptor> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FitDescriptor> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.FitDescriptor getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
