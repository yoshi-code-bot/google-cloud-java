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
// source: google/maps/areainsights/v1/area_insights_service.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.areainsights.v1;

/**
 *
 *
 * <pre>
 * Average user rating filters.
 * </pre>
 *
 * Protobuf type {@code google.maps.areainsights.v1.RatingFilter}
 */
public final class RatingFilter extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.areainsights.v1.RatingFilter)
    RatingFilterOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use RatingFilter.newBuilder() to construct.
  private RatingFilter(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RatingFilter() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RatingFilter();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.areainsights.v1.AreaInsightsServiceProto
        .internal_static_google_maps_areainsights_v1_RatingFilter_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.areainsights.v1.AreaInsightsServiceProto
        .internal_static_google_maps_areainsights_v1_RatingFilter_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.areainsights.v1.RatingFilter.class,
            com.google.maps.areainsights.v1.RatingFilter.Builder.class);
  }

  private int bitField0_;
  public static final int MIN_RATING_FIELD_NUMBER = 5;
  private float minRating_ = 0F;

  /**
   *
   *
   * <pre>
   * Optional. Restricts results to places whose average user rating is greater
   * than or equal to min_rating. Values must be between 1.0 and 5.0.
   * </pre>
   *
   * <code>optional float min_rating = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the minRating field is set.
   */
  @java.lang.Override
  public boolean hasMinRating() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. Restricts results to places whose average user rating is greater
   * than or equal to min_rating. Values must be between 1.0 and 5.0.
   * </pre>
   *
   * <code>optional float min_rating = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The minRating.
   */
  @java.lang.Override
  public float getMinRating() {
    return minRating_;
  }

  public static final int MAX_RATING_FIELD_NUMBER = 6;
  private float maxRating_ = 0F;

  /**
   *
   *
   * <pre>
   * Optional. Restricts results to places whose average user rating is strictly
   * less than or equal to max_rating. Values must be between 1.0 and 5.0.
   * </pre>
   *
   * <code>optional float max_rating = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the maxRating field is set.
   */
  @java.lang.Override
  public boolean hasMaxRating() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * Optional. Restricts results to places whose average user rating is strictly
   * less than or equal to max_rating. Values must be between 1.0 and 5.0.
   * </pre>
   *
   * <code>optional float max_rating = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The maxRating.
   */
  @java.lang.Override
  public float getMaxRating() {
    return maxRating_;
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
      output.writeFloat(5, minRating_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeFloat(6, maxRating_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(5, minRating_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(6, maxRating_);
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
    if (!(obj instanceof com.google.maps.areainsights.v1.RatingFilter)) {
      return super.equals(obj);
    }
    com.google.maps.areainsights.v1.RatingFilter other =
        (com.google.maps.areainsights.v1.RatingFilter) obj;

    if (hasMinRating() != other.hasMinRating()) return false;
    if (hasMinRating()) {
      if (java.lang.Float.floatToIntBits(getMinRating())
          != java.lang.Float.floatToIntBits(other.getMinRating())) return false;
    }
    if (hasMaxRating() != other.hasMaxRating()) return false;
    if (hasMaxRating()) {
      if (java.lang.Float.floatToIntBits(getMaxRating())
          != java.lang.Float.floatToIntBits(other.getMaxRating())) return false;
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
    if (hasMinRating()) {
      hash = (37 * hash) + MIN_RATING_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getMinRating());
    }
    if (hasMaxRating()) {
      hash = (37 * hash) + MAX_RATING_FIELD_NUMBER;
      hash = (53 * hash) + java.lang.Float.floatToIntBits(getMaxRating());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.areainsights.v1.RatingFilter parseFrom(
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

  public static Builder newBuilder(com.google.maps.areainsights.v1.RatingFilter prototype) {
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
   * Average user rating filters.
   * </pre>
   *
   * Protobuf type {@code google.maps.areainsights.v1.RatingFilter}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.areainsights.v1.RatingFilter)
      com.google.maps.areainsights.v1.RatingFilterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.areainsights.v1.AreaInsightsServiceProto
          .internal_static_google_maps_areainsights_v1_RatingFilter_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.areainsights.v1.AreaInsightsServiceProto
          .internal_static_google_maps_areainsights_v1_RatingFilter_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.areainsights.v1.RatingFilter.class,
              com.google.maps.areainsights.v1.RatingFilter.Builder.class);
    }

    // Construct using com.google.maps.areainsights.v1.RatingFilter.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      minRating_ = 0F;
      maxRating_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.areainsights.v1.AreaInsightsServiceProto
          .internal_static_google_maps_areainsights_v1_RatingFilter_descriptor;
    }

    @java.lang.Override
    public com.google.maps.areainsights.v1.RatingFilter getDefaultInstanceForType() {
      return com.google.maps.areainsights.v1.RatingFilter.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.areainsights.v1.RatingFilter build() {
      com.google.maps.areainsights.v1.RatingFilter result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.areainsights.v1.RatingFilter buildPartial() {
      com.google.maps.areainsights.v1.RatingFilter result =
          new com.google.maps.areainsights.v1.RatingFilter(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.areainsights.v1.RatingFilter result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.minRating_ = minRating_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.maxRating_ = maxRating_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.maps.areainsights.v1.RatingFilter) {
        return mergeFrom((com.google.maps.areainsights.v1.RatingFilter) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.areainsights.v1.RatingFilter other) {
      if (other == com.google.maps.areainsights.v1.RatingFilter.getDefaultInstance()) return this;
      if (other.hasMinRating()) {
        setMinRating(other.getMinRating());
      }
      if (other.hasMaxRating()) {
        setMaxRating(other.getMaxRating());
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
            case 45:
              {
                minRating_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 45
            case 53:
              {
                maxRating_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 53
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

    private float minRating_;

    /**
     *
     *
     * <pre>
     * Optional. Restricts results to places whose average user rating is greater
     * than or equal to min_rating. Values must be between 1.0 and 5.0.
     * </pre>
     *
     * <code>optional float min_rating = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the minRating field is set.
     */
    @java.lang.Override
    public boolean hasMinRating() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Restricts results to places whose average user rating is greater
     * than or equal to min_rating. Values must be between 1.0 and 5.0.
     * </pre>
     *
     * <code>optional float min_rating = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The minRating.
     */
    @java.lang.Override
    public float getMinRating() {
      return minRating_;
    }

    /**
     *
     *
     * <pre>
     * Optional. Restricts results to places whose average user rating is greater
     * than or equal to min_rating. Values must be between 1.0 and 5.0.
     * </pre>
     *
     * <code>optional float min_rating = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The minRating to set.
     * @return This builder for chaining.
     */
    public Builder setMinRating(float value) {

      minRating_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Restricts results to places whose average user rating is greater
     * than or equal to min_rating. Values must be between 1.0 and 5.0.
     * </pre>
     *
     * <code>optional float min_rating = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinRating() {
      bitField0_ = (bitField0_ & ~0x00000001);
      minRating_ = 0F;
      onChanged();
      return this;
    }

    private float maxRating_;

    /**
     *
     *
     * <pre>
     * Optional. Restricts results to places whose average user rating is strictly
     * less than or equal to max_rating. Values must be between 1.0 and 5.0.
     * </pre>
     *
     * <code>optional float max_rating = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return Whether the maxRating field is set.
     */
    @java.lang.Override
    public boolean hasMaxRating() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Optional. Restricts results to places whose average user rating is strictly
     * less than or equal to max_rating. Values must be between 1.0 and 5.0.
     * </pre>
     *
     * <code>optional float max_rating = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The maxRating.
     */
    @java.lang.Override
    public float getMaxRating() {
      return maxRating_;
    }

    /**
     *
     *
     * <pre>
     * Optional. Restricts results to places whose average user rating is strictly
     * less than or equal to max_rating. Values must be between 1.0 and 5.0.
     * </pre>
     *
     * <code>optional float max_rating = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The maxRating to set.
     * @return This builder for chaining.
     */
    public Builder setMaxRating(float value) {

      maxRating_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Restricts results to places whose average user rating is strictly
     * less than or equal to max_rating. Values must be between 1.0 and 5.0.
     * </pre>
     *
     * <code>optional float max_rating = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxRating() {
      bitField0_ = (bitField0_ & ~0x00000002);
      maxRating_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.maps.areainsights.v1.RatingFilter)
  }

  // @@protoc_insertion_point(class_scope:google.maps.areainsights.v1.RatingFilter)
  private static final com.google.maps.areainsights.v1.RatingFilter DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.areainsights.v1.RatingFilter();
  }

  public static com.google.maps.areainsights.v1.RatingFilter getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RatingFilter> PARSER =
      new com.google.protobuf.AbstractParser<RatingFilter>() {
        @java.lang.Override
        public RatingFilter parsePartialFrom(
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

  public static com.google.protobuf.Parser<RatingFilter> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RatingFilter> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.areainsights.v1.RatingFilter getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
