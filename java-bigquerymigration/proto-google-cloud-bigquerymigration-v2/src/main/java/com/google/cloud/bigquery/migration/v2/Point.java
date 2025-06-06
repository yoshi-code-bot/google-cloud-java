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
// source: google/cloud/bigquery/migration/v2/migration_metrics.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.migration.v2;

/**
 *
 *
 * <pre>
 * A single data point in a time series.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2.Point}
 */
public final class Point extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2.Point)
    PointOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Point.newBuilder() to construct.
  private Point(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Point() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Point();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.migration.v2.MigrationMetricsProto
        .internal_static_google_cloud_bigquery_migration_v2_Point_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2.MigrationMetricsProto
        .internal_static_google_cloud_bigquery_migration_v2_Point_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2.Point.class,
            com.google.cloud.bigquery.migration.v2.Point.Builder.class);
  }

  private int bitField0_;
  public static final int INTERVAL_FIELD_NUMBER = 1;
  private com.google.cloud.bigquery.migration.v2.TimeInterval interval_;

  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * the start time does not need to be supplied, but if it is supplied, it must
   * equal the end time.  For `DELTA` metrics, the start and end time should
   * specify a non-zero interval, with subsequent points specifying contiguous
   * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
   * time should specify a non-zero interval, with subsequent points specifying
   * the same start time and increasing end times, until an event resets the
   * cumulative value to zero and sets a new start time for the following
   * points.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
   *
   * @return Whether the interval field is set.
   */
  @java.lang.Override
  public boolean hasInterval() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * the start time does not need to be supplied, but if it is supplied, it must
   * equal the end time.  For `DELTA` metrics, the start and end time should
   * specify a non-zero interval, with subsequent points specifying contiguous
   * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
   * time should specify a non-zero interval, with subsequent points specifying
   * the same start time and increasing end times, until an event resets the
   * cumulative value to zero and sets a new start time for the following
   * points.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
   *
   * @return The interval.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.TimeInterval getInterval() {
    return interval_ == null
        ? com.google.cloud.bigquery.migration.v2.TimeInterval.getDefaultInstance()
        : interval_;
  }

  /**
   *
   *
   * <pre>
   * The time interval to which the data point applies.  For `GAUGE` metrics,
   * the start time does not need to be supplied, but if it is supplied, it must
   * equal the end time.  For `DELTA` metrics, the start and end time should
   * specify a non-zero interval, with subsequent points specifying contiguous
   * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
   * time should specify a non-zero interval, with subsequent points specifying
   * the same start time and increasing end times, until an event resets the
   * cumulative value to zero and sets a new start time for the following
   * points.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.TimeIntervalOrBuilder getIntervalOrBuilder() {
    return interval_ == null
        ? com.google.cloud.bigquery.migration.v2.TimeInterval.getDefaultInstance()
        : interval_;
  }

  public static final int VALUE_FIELD_NUMBER = 2;
  private com.google.cloud.bigquery.migration.v2.TypedValue value_;

  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
   *
   * @return Whether the value field is set.
   */
  @java.lang.Override
  public boolean hasValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
   *
   * @return The value.
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.TypedValue getValue() {
    return value_ == null
        ? com.google.cloud.bigquery.migration.v2.TypedValue.getDefaultInstance()
        : value_;
  }

  /**
   *
   *
   * <pre>
   * The value of the data point.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
   */
  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.TypedValueOrBuilder getValueOrBuilder() {
    return value_ == null
        ? com.google.cloud.bigquery.migration.v2.TypedValue.getDefaultInstance()
        : value_;
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
      output.writeMessage(1, getInterval());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getValue());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getInterval());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getValue());
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
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2.Point)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2.Point other =
        (com.google.cloud.bigquery.migration.v2.Point) obj;

    if (hasInterval() != other.hasInterval()) return false;
    if (hasInterval()) {
      if (!getInterval().equals(other.getInterval())) return false;
    }
    if (hasValue() != other.hasValue()) return false;
    if (hasValue()) {
      if (!getValue().equals(other.getValue())) return false;
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
    if (hasInterval()) {
      hash = (37 * hash) + INTERVAL_FIELD_NUMBER;
      hash = (53 * hash) + getInterval().hashCode();
    }
    if (hasValue()) {
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.Point parseFrom(
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

  public static Builder newBuilder(com.google.cloud.bigquery.migration.v2.Point prototype) {
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
   * A single data point in a time series.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2.Point}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2.Point)
      com.google.cloud.bigquery.migration.v2.PointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.migration.v2.MigrationMetricsProto
          .internal_static_google_cloud_bigquery_migration_v2_Point_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2.MigrationMetricsProto
          .internal_static_google_cloud_bigquery_migration_v2_Point_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2.Point.class,
              com.google.cloud.bigquery.migration.v2.Point.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2.Point.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getIntervalFieldBuilder();
        getValueFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      interval_ = null;
      if (intervalBuilder_ != null) {
        intervalBuilder_.dispose();
        intervalBuilder_ = null;
      }
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2.MigrationMetricsProto
          .internal_static_google_cloud_bigquery_migration_v2_Point_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.Point getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2.Point.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.Point build() {
      com.google.cloud.bigquery.migration.v2.Point result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.Point buildPartial() {
      com.google.cloud.bigquery.migration.v2.Point result =
          new com.google.cloud.bigquery.migration.v2.Point(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.bigquery.migration.v2.Point result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.interval_ = intervalBuilder_ == null ? interval_ : intervalBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.value_ = valueBuilder_ == null ? value_ : valueBuilder_.build();
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
      if (other instanceof com.google.cloud.bigquery.migration.v2.Point) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2.Point) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2.Point other) {
      if (other == com.google.cloud.bigquery.migration.v2.Point.getDefaultInstance()) return this;
      if (other.hasInterval()) {
        mergeInterval(other.getInterval());
      }
      if (other.hasValue()) {
        mergeValue(other.getValue());
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
                input.readMessage(getIntervalFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getValueFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.bigquery.migration.v2.TimeInterval interval_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2.TimeInterval,
            com.google.cloud.bigquery.migration.v2.TimeInterval.Builder,
            com.google.cloud.bigquery.migration.v2.TimeIntervalOrBuilder>
        intervalBuilder_;

    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time does not need to be supplied, but if it is supplied, it must
     * equal the end time.  For `DELTA` metrics, the start and end time should
     * specify a non-zero interval, with subsequent points specifying contiguous
     * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
     * time should specify a non-zero interval, with subsequent points specifying
     * the same start time and increasing end times, until an event resets the
     * cumulative value to zero and sets a new start time for the following
     * points.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
     *
     * @return Whether the interval field is set.
     */
    public boolean hasInterval() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time does not need to be supplied, but if it is supplied, it must
     * equal the end time.  For `DELTA` metrics, the start and end time should
     * specify a non-zero interval, with subsequent points specifying contiguous
     * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
     * time should specify a non-zero interval, with subsequent points specifying
     * the same start time and increasing end times, until an event resets the
     * cumulative value to zero and sets a new start time for the following
     * points.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
     *
     * @return The interval.
     */
    public com.google.cloud.bigquery.migration.v2.TimeInterval getInterval() {
      if (intervalBuilder_ == null) {
        return interval_ == null
            ? com.google.cloud.bigquery.migration.v2.TimeInterval.getDefaultInstance()
            : interval_;
      } else {
        return intervalBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time does not need to be supplied, but if it is supplied, it must
     * equal the end time.  For `DELTA` metrics, the start and end time should
     * specify a non-zero interval, with subsequent points specifying contiguous
     * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
     * time should specify a non-zero interval, with subsequent points specifying
     * the same start time and increasing end times, until an event resets the
     * cumulative value to zero and sets a new start time for the following
     * points.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
     */
    public Builder setInterval(com.google.cloud.bigquery.migration.v2.TimeInterval value) {
      if (intervalBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        interval_ = value;
      } else {
        intervalBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time does not need to be supplied, but if it is supplied, it must
     * equal the end time.  For `DELTA` metrics, the start and end time should
     * specify a non-zero interval, with subsequent points specifying contiguous
     * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
     * time should specify a non-zero interval, with subsequent points specifying
     * the same start time and increasing end times, until an event resets the
     * cumulative value to zero and sets a new start time for the following
     * points.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
     */
    public Builder setInterval(
        com.google.cloud.bigquery.migration.v2.TimeInterval.Builder builderForValue) {
      if (intervalBuilder_ == null) {
        interval_ = builderForValue.build();
      } else {
        intervalBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time does not need to be supplied, but if it is supplied, it must
     * equal the end time.  For `DELTA` metrics, the start and end time should
     * specify a non-zero interval, with subsequent points specifying contiguous
     * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
     * time should specify a non-zero interval, with subsequent points specifying
     * the same start time and increasing end times, until an event resets the
     * cumulative value to zero and sets a new start time for the following
     * points.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
     */
    public Builder mergeInterval(com.google.cloud.bigquery.migration.v2.TimeInterval value) {
      if (intervalBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && interval_ != null
            && interval_
                != com.google.cloud.bigquery.migration.v2.TimeInterval.getDefaultInstance()) {
          getIntervalBuilder().mergeFrom(value);
        } else {
          interval_ = value;
        }
      } else {
        intervalBuilder_.mergeFrom(value);
      }
      if (interval_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time does not need to be supplied, but if it is supplied, it must
     * equal the end time.  For `DELTA` metrics, the start and end time should
     * specify a non-zero interval, with subsequent points specifying contiguous
     * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
     * time should specify a non-zero interval, with subsequent points specifying
     * the same start time and increasing end times, until an event resets the
     * cumulative value to zero and sets a new start time for the following
     * points.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
     */
    public Builder clearInterval() {
      bitField0_ = (bitField0_ & ~0x00000001);
      interval_ = null;
      if (intervalBuilder_ != null) {
        intervalBuilder_.dispose();
        intervalBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time does not need to be supplied, but if it is supplied, it must
     * equal the end time.  For `DELTA` metrics, the start and end time should
     * specify a non-zero interval, with subsequent points specifying contiguous
     * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
     * time should specify a non-zero interval, with subsequent points specifying
     * the same start time and increasing end times, until an event resets the
     * cumulative value to zero and sets a new start time for the following
     * points.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2.TimeInterval.Builder getIntervalBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getIntervalFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time does not need to be supplied, but if it is supplied, it must
     * equal the end time.  For `DELTA` metrics, the start and end time should
     * specify a non-zero interval, with subsequent points specifying contiguous
     * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
     * time should specify a non-zero interval, with subsequent points specifying
     * the same start time and increasing end times, until an event resets the
     * cumulative value to zero and sets a new start time for the following
     * points.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
     */
    public com.google.cloud.bigquery.migration.v2.TimeIntervalOrBuilder getIntervalOrBuilder() {
      if (intervalBuilder_ != null) {
        return intervalBuilder_.getMessageOrBuilder();
      } else {
        return interval_ == null
            ? com.google.cloud.bigquery.migration.v2.TimeInterval.getDefaultInstance()
            : interval_;
      }
    }

    /**
     *
     *
     * <pre>
     * The time interval to which the data point applies.  For `GAUGE` metrics,
     * the start time does not need to be supplied, but if it is supplied, it must
     * equal the end time.  For `DELTA` metrics, the start and end time should
     * specify a non-zero interval, with subsequent points specifying contiguous
     * and non-overlapping intervals.  For `CUMULATIVE` metrics, the start and end
     * time should specify a non-zero interval, with subsequent points specifying
     * the same start time and increasing end times, until an event resets the
     * cumulative value to zero and sets a new start time for the following
     * points.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TimeInterval interval = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2.TimeInterval,
            com.google.cloud.bigquery.migration.v2.TimeInterval.Builder,
            com.google.cloud.bigquery.migration.v2.TimeIntervalOrBuilder>
        getIntervalFieldBuilder() {
      if (intervalBuilder_ == null) {
        intervalBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.migration.v2.TimeInterval,
                com.google.cloud.bigquery.migration.v2.TimeInterval.Builder,
                com.google.cloud.bigquery.migration.v2.TimeIntervalOrBuilder>(
                getInterval(), getParentForChildren(), isClean());
        interval_ = null;
      }
      return intervalBuilder_;
    }

    private com.google.cloud.bigquery.migration.v2.TypedValue value_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2.TypedValue,
            com.google.cloud.bigquery.migration.v2.TypedValue.Builder,
            com.google.cloud.bigquery.migration.v2.TypedValueOrBuilder>
        valueBuilder_;

    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
     *
     * @return Whether the value field is set.
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
     *
     * @return The value.
     */
    public com.google.cloud.bigquery.migration.v2.TypedValue getValue() {
      if (valueBuilder_ == null) {
        return value_ == null
            ? com.google.cloud.bigquery.migration.v2.TypedValue.getDefaultInstance()
            : value_;
      } else {
        return valueBuilder_.getMessage();
      }
    }

    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
     */
    public Builder setValue(com.google.cloud.bigquery.migration.v2.TypedValue value) {
      if (valueBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        value_ = value;
      } else {
        valueBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
     */
    public Builder setValue(
        com.google.cloud.bigquery.migration.v2.TypedValue.Builder builderForValue) {
      if (valueBuilder_ == null) {
        value_ = builderForValue.build();
      } else {
        valueBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
     */
    public Builder mergeValue(com.google.cloud.bigquery.migration.v2.TypedValue value) {
      if (valueBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && value_ != null
            && value_ != com.google.cloud.bigquery.migration.v2.TypedValue.getDefaultInstance()) {
          getValueBuilder().mergeFrom(value);
        } else {
          value_ = value;
        }
      } else {
        valueBuilder_.mergeFrom(value);
      }
      if (value_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
     */
    public Builder clearValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      value_ = null;
      if (valueBuilder_ != null) {
        valueBuilder_.dispose();
        valueBuilder_ = null;
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
     */
    public com.google.cloud.bigquery.migration.v2.TypedValue.Builder getValueBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getValueFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
     */
    public com.google.cloud.bigquery.migration.v2.TypedValueOrBuilder getValueOrBuilder() {
      if (valueBuilder_ != null) {
        return valueBuilder_.getMessageOrBuilder();
      } else {
        return value_ == null
            ? com.google.cloud.bigquery.migration.v2.TypedValue.getDefaultInstance()
            : value_;
      }
    }

    /**
     *
     *
     * <pre>
     * The value of the data point.
     * </pre>
     *
     * <code>.google.cloud.bigquery.migration.v2.TypedValue value = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.bigquery.migration.v2.TypedValue,
            com.google.cloud.bigquery.migration.v2.TypedValue.Builder,
            com.google.cloud.bigquery.migration.v2.TypedValueOrBuilder>
        getValueFieldBuilder() {
      if (valueBuilder_ == null) {
        valueBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.bigquery.migration.v2.TypedValue,
                com.google.cloud.bigquery.migration.v2.TypedValue.Builder,
                com.google.cloud.bigquery.migration.v2.TypedValueOrBuilder>(
                getValue(), getParentForChildren(), isClean());
        value_ = null;
      }
      return valueBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2.Point)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2.Point)
  private static final com.google.cloud.bigquery.migration.v2.Point DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2.Point();
  }

  public static com.google.cloud.bigquery.migration.v2.Point getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Point> PARSER =
      new com.google.protobuf.AbstractParser<Point>() {
        @java.lang.Override
        public Point parsePartialFrom(
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

  public static com.google.protobuf.Parser<Point> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Point> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.Point getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
