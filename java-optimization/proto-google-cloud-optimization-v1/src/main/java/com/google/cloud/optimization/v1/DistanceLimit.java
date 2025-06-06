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
// source: google/cloud/optimization/v1/fleet_routing.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.optimization.v1;

/**
 *
 *
 * <pre>
 * A limit defining a maximum distance which can be traveled. It can be either
 * hard or soft.
 *
 * If a soft limit is defined, both `soft_max_meters` and
 * `cost_per_kilometer_above_soft_max` must be defined and be nonnegative.
 * </pre>
 *
 * Protobuf type {@code google.cloud.optimization.v1.DistanceLimit}
 */
public final class DistanceLimit extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.optimization.v1.DistanceLimit)
    DistanceLimitOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DistanceLimit.newBuilder() to construct.
  private DistanceLimit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DistanceLimit() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DistanceLimit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.optimization.v1.FleetRoutingProto
        .internal_static_google_cloud_optimization_v1_DistanceLimit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.optimization.v1.FleetRoutingProto
        .internal_static_google_cloud_optimization_v1_DistanceLimit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.optimization.v1.DistanceLimit.class,
            com.google.cloud.optimization.v1.DistanceLimit.Builder.class);
  }

  private int bitField0_;
  public static final int MAX_METERS_FIELD_NUMBER = 1;
  private long maxMeters_ = 0L;

  /**
   *
   *
   * <pre>
   * A hard limit constraining the distance to be at most max_meters. The limit
   * must be nonnegative.
   * </pre>
   *
   * <code>optional int64 max_meters = 1;</code>
   *
   * @return Whether the maxMeters field is set.
   */
  @java.lang.Override
  public boolean hasMaxMeters() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * A hard limit constraining the distance to be at most max_meters. The limit
   * must be nonnegative.
   * </pre>
   *
   * <code>optional int64 max_meters = 1;</code>
   *
   * @return The maxMeters.
   */
  @java.lang.Override
  public long getMaxMeters() {
    return maxMeters_;
  }

  public static final int SOFT_MAX_METERS_FIELD_NUMBER = 2;
  private long softMaxMeters_ = 0L;

  /**
   *
   *
   * <pre>
   * A soft limit not enforcing a maximum distance limit, but when violated
   * results in a cost which adds up to other costs defined in the model,
   * with the same unit.
   *
   * If defined soft_max_meters must be less than max_meters and must be
   * nonnegative.
   * </pre>
   *
   * <code>optional int64 soft_max_meters = 2;</code>
   *
   * @return Whether the softMaxMeters field is set.
   */
  @java.lang.Override
  public boolean hasSoftMaxMeters() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * A soft limit not enforcing a maximum distance limit, but when violated
   * results in a cost which adds up to other costs defined in the model,
   * with the same unit.
   *
   * If defined soft_max_meters must be less than max_meters and must be
   * nonnegative.
   * </pre>
   *
   * <code>optional int64 soft_max_meters = 2;</code>
   *
   * @return The softMaxMeters.
   */
  @java.lang.Override
  public long getSoftMaxMeters() {
    return softMaxMeters_;
  }

  public static final int COST_PER_KILOMETER_BELOW_SOFT_MAX_FIELD_NUMBER = 4;
  private double costPerKilometerBelowSoftMax_ = 0D;

  /**
   *
   *
   * <pre>
   * Cost per kilometer incurred, increasing up to `soft_max_meters`, with
   * formula:
   * ```
   *   min(distance_meters, soft_max_meters) / 1000.0 *
   *   cost_per_kilometer_below_soft_max.
   * ```
   * This cost is not supported in `route_distance_limit`.
   * </pre>
   *
   * <code>optional double cost_per_kilometer_below_soft_max = 4;</code>
   *
   * @return Whether the costPerKilometerBelowSoftMax field is set.
   */
  @java.lang.Override
  public boolean hasCostPerKilometerBelowSoftMax() {
    return ((bitField0_ & 0x00000004) != 0);
  }

  /**
   *
   *
   * <pre>
   * Cost per kilometer incurred, increasing up to `soft_max_meters`, with
   * formula:
   * ```
   *   min(distance_meters, soft_max_meters) / 1000.0 *
   *   cost_per_kilometer_below_soft_max.
   * ```
   * This cost is not supported in `route_distance_limit`.
   * </pre>
   *
   * <code>optional double cost_per_kilometer_below_soft_max = 4;</code>
   *
   * @return The costPerKilometerBelowSoftMax.
   */
  @java.lang.Override
  public double getCostPerKilometerBelowSoftMax() {
    return costPerKilometerBelowSoftMax_;
  }

  public static final int COST_PER_KILOMETER_ABOVE_SOFT_MAX_FIELD_NUMBER = 3;
  private double costPerKilometerAboveSoftMax_ = 0D;

  /**
   *
   *
   * <pre>
   * Cost per kilometer incurred if distance is above `soft_max_meters` limit.
   * The additional cost is 0 if the distance is under the limit, otherwise the
   * formula used to compute the cost is the following:
   * ```
   *   (distance_meters - soft_max_meters) / 1000.0 *
   *   cost_per_kilometer_above_soft_max.
   * ```
   * The cost must be nonnegative.
   * </pre>
   *
   * <code>optional double cost_per_kilometer_above_soft_max = 3;</code>
   *
   * @return Whether the costPerKilometerAboveSoftMax field is set.
   */
  @java.lang.Override
  public boolean hasCostPerKilometerAboveSoftMax() {
    return ((bitField0_ & 0x00000008) != 0);
  }

  /**
   *
   *
   * <pre>
   * Cost per kilometer incurred if distance is above `soft_max_meters` limit.
   * The additional cost is 0 if the distance is under the limit, otherwise the
   * formula used to compute the cost is the following:
   * ```
   *   (distance_meters - soft_max_meters) / 1000.0 *
   *   cost_per_kilometer_above_soft_max.
   * ```
   * The cost must be nonnegative.
   * </pre>
   *
   * <code>optional double cost_per_kilometer_above_soft_max = 3;</code>
   *
   * @return The costPerKilometerAboveSoftMax.
   */
  @java.lang.Override
  public double getCostPerKilometerAboveSoftMax() {
    return costPerKilometerAboveSoftMax_;
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
      output.writeInt64(1, maxMeters_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(2, softMaxMeters_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeDouble(3, costPerKilometerAboveSoftMax_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeDouble(4, costPerKilometerBelowSoftMax_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, maxMeters_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, softMaxMeters_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(3, costPerKilometerAboveSoftMax_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeDoubleSize(4, costPerKilometerBelowSoftMax_);
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
    if (!(obj instanceof com.google.cloud.optimization.v1.DistanceLimit)) {
      return super.equals(obj);
    }
    com.google.cloud.optimization.v1.DistanceLimit other =
        (com.google.cloud.optimization.v1.DistanceLimit) obj;

    if (hasMaxMeters() != other.hasMaxMeters()) return false;
    if (hasMaxMeters()) {
      if (getMaxMeters() != other.getMaxMeters()) return false;
    }
    if (hasSoftMaxMeters() != other.hasSoftMaxMeters()) return false;
    if (hasSoftMaxMeters()) {
      if (getSoftMaxMeters() != other.getSoftMaxMeters()) return false;
    }
    if (hasCostPerKilometerBelowSoftMax() != other.hasCostPerKilometerBelowSoftMax()) return false;
    if (hasCostPerKilometerBelowSoftMax()) {
      if (java.lang.Double.doubleToLongBits(getCostPerKilometerBelowSoftMax())
          != java.lang.Double.doubleToLongBits(other.getCostPerKilometerBelowSoftMax()))
        return false;
    }
    if (hasCostPerKilometerAboveSoftMax() != other.hasCostPerKilometerAboveSoftMax()) return false;
    if (hasCostPerKilometerAboveSoftMax()) {
      if (java.lang.Double.doubleToLongBits(getCostPerKilometerAboveSoftMax())
          != java.lang.Double.doubleToLongBits(other.getCostPerKilometerAboveSoftMax()))
        return false;
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
    if (hasMaxMeters()) {
      hash = (37 * hash) + MAX_METERS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMaxMeters());
    }
    if (hasSoftMaxMeters()) {
      hash = (37 * hash) + SOFT_MAX_METERS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getSoftMaxMeters());
    }
    if (hasCostPerKilometerBelowSoftMax()) {
      hash = (37 * hash) + COST_PER_KILOMETER_BELOW_SOFT_MAX_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getCostPerKilometerBelowSoftMax()));
    }
    if (hasCostPerKilometerAboveSoftMax()) {
      hash = (37 * hash) + COST_PER_KILOMETER_ABOVE_SOFT_MAX_FIELD_NUMBER;
      hash =
          (53 * hash)
              + com.google.protobuf.Internal.hashLong(
                  java.lang.Double.doubleToLongBits(getCostPerKilometerAboveSoftMax()));
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.optimization.v1.DistanceLimit parseFrom(
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

  public static Builder newBuilder(com.google.cloud.optimization.v1.DistanceLimit prototype) {
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
   * A limit defining a maximum distance which can be traveled. It can be either
   * hard or soft.
   *
   * If a soft limit is defined, both `soft_max_meters` and
   * `cost_per_kilometer_above_soft_max` must be defined and be nonnegative.
   * </pre>
   *
   * Protobuf type {@code google.cloud.optimization.v1.DistanceLimit}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.optimization.v1.DistanceLimit)
      com.google.cloud.optimization.v1.DistanceLimitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.optimization.v1.FleetRoutingProto
          .internal_static_google_cloud_optimization_v1_DistanceLimit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.optimization.v1.FleetRoutingProto
          .internal_static_google_cloud_optimization_v1_DistanceLimit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.optimization.v1.DistanceLimit.class,
              com.google.cloud.optimization.v1.DistanceLimit.Builder.class);
    }

    // Construct using com.google.cloud.optimization.v1.DistanceLimit.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maxMeters_ = 0L;
      softMaxMeters_ = 0L;
      costPerKilometerBelowSoftMax_ = 0D;
      costPerKilometerAboveSoftMax_ = 0D;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.optimization.v1.FleetRoutingProto
          .internal_static_google_cloud_optimization_v1_DistanceLimit_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.DistanceLimit getDefaultInstanceForType() {
      return com.google.cloud.optimization.v1.DistanceLimit.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.DistanceLimit build() {
      com.google.cloud.optimization.v1.DistanceLimit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.DistanceLimit buildPartial() {
      com.google.cloud.optimization.v1.DistanceLimit result =
          new com.google.cloud.optimization.v1.DistanceLimit(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.optimization.v1.DistanceLimit result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxMeters_ = maxMeters_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.softMaxMeters_ = softMaxMeters_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.costPerKilometerBelowSoftMax_ = costPerKilometerBelowSoftMax_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.costPerKilometerAboveSoftMax_ = costPerKilometerAboveSoftMax_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.cloud.optimization.v1.DistanceLimit) {
        return mergeFrom((com.google.cloud.optimization.v1.DistanceLimit) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.optimization.v1.DistanceLimit other) {
      if (other == com.google.cloud.optimization.v1.DistanceLimit.getDefaultInstance()) return this;
      if (other.hasMaxMeters()) {
        setMaxMeters(other.getMaxMeters());
      }
      if (other.hasSoftMaxMeters()) {
        setSoftMaxMeters(other.getSoftMaxMeters());
      }
      if (other.hasCostPerKilometerBelowSoftMax()) {
        setCostPerKilometerBelowSoftMax(other.getCostPerKilometerBelowSoftMax());
      }
      if (other.hasCostPerKilometerAboveSoftMax()) {
        setCostPerKilometerAboveSoftMax(other.getCostPerKilometerAboveSoftMax());
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
                maxMeters_ = input.readInt64();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                softMaxMeters_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 25:
              {
                costPerKilometerAboveSoftMax_ = input.readDouble();
                bitField0_ |= 0x00000008;
                break;
              } // case 25
            case 33:
              {
                costPerKilometerBelowSoftMax_ = input.readDouble();
                bitField0_ |= 0x00000004;
                break;
              } // case 33
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

    private long maxMeters_;

    /**
     *
     *
     * <pre>
     * A hard limit constraining the distance to be at most max_meters. The limit
     * must be nonnegative.
     * </pre>
     *
     * <code>optional int64 max_meters = 1;</code>
     *
     * @return Whether the maxMeters field is set.
     */
    @java.lang.Override
    public boolean hasMaxMeters() {
      return ((bitField0_ & 0x00000001) != 0);
    }

    /**
     *
     *
     * <pre>
     * A hard limit constraining the distance to be at most max_meters. The limit
     * must be nonnegative.
     * </pre>
     *
     * <code>optional int64 max_meters = 1;</code>
     *
     * @return The maxMeters.
     */
    @java.lang.Override
    public long getMaxMeters() {
      return maxMeters_;
    }

    /**
     *
     *
     * <pre>
     * A hard limit constraining the distance to be at most max_meters. The limit
     * must be nonnegative.
     * </pre>
     *
     * <code>optional int64 max_meters = 1;</code>
     *
     * @param value The maxMeters to set.
     * @return This builder for chaining.
     */
    public Builder setMaxMeters(long value) {

      maxMeters_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A hard limit constraining the distance to be at most max_meters. The limit
     * must be nonnegative.
     * </pre>
     *
     * <code>optional int64 max_meters = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxMeters() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxMeters_ = 0L;
      onChanged();
      return this;
    }

    private long softMaxMeters_;

    /**
     *
     *
     * <pre>
     * A soft limit not enforcing a maximum distance limit, but when violated
     * results in a cost which adds up to other costs defined in the model,
     * with the same unit.
     *
     * If defined soft_max_meters must be less than max_meters and must be
     * nonnegative.
     * </pre>
     *
     * <code>optional int64 soft_max_meters = 2;</code>
     *
     * @return Whether the softMaxMeters field is set.
     */
    @java.lang.Override
    public boolean hasSoftMaxMeters() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * A soft limit not enforcing a maximum distance limit, but when violated
     * results in a cost which adds up to other costs defined in the model,
     * with the same unit.
     *
     * If defined soft_max_meters must be less than max_meters and must be
     * nonnegative.
     * </pre>
     *
     * <code>optional int64 soft_max_meters = 2;</code>
     *
     * @return The softMaxMeters.
     */
    @java.lang.Override
    public long getSoftMaxMeters() {
      return softMaxMeters_;
    }

    /**
     *
     *
     * <pre>
     * A soft limit not enforcing a maximum distance limit, but when violated
     * results in a cost which adds up to other costs defined in the model,
     * with the same unit.
     *
     * If defined soft_max_meters must be less than max_meters and must be
     * nonnegative.
     * </pre>
     *
     * <code>optional int64 soft_max_meters = 2;</code>
     *
     * @param value The softMaxMeters to set.
     * @return This builder for chaining.
     */
    public Builder setSoftMaxMeters(long value) {

      softMaxMeters_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * A soft limit not enforcing a maximum distance limit, but when violated
     * results in a cost which adds up to other costs defined in the model,
     * with the same unit.
     *
     * If defined soft_max_meters must be less than max_meters and must be
     * nonnegative.
     * </pre>
     *
     * <code>optional int64 soft_max_meters = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSoftMaxMeters() {
      bitField0_ = (bitField0_ & ~0x00000002);
      softMaxMeters_ = 0L;
      onChanged();
      return this;
    }

    private double costPerKilometerBelowSoftMax_;

    /**
     *
     *
     * <pre>
     * Cost per kilometer incurred, increasing up to `soft_max_meters`, with
     * formula:
     * ```
     *   min(distance_meters, soft_max_meters) / 1000.0 *
     *   cost_per_kilometer_below_soft_max.
     * ```
     * This cost is not supported in `route_distance_limit`.
     * </pre>
     *
     * <code>optional double cost_per_kilometer_below_soft_max = 4;</code>
     *
     * @return Whether the costPerKilometerBelowSoftMax field is set.
     */
    @java.lang.Override
    public boolean hasCostPerKilometerBelowSoftMax() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * Cost per kilometer incurred, increasing up to `soft_max_meters`, with
     * formula:
     * ```
     *   min(distance_meters, soft_max_meters) / 1000.0 *
     *   cost_per_kilometer_below_soft_max.
     * ```
     * This cost is not supported in `route_distance_limit`.
     * </pre>
     *
     * <code>optional double cost_per_kilometer_below_soft_max = 4;</code>
     *
     * @return The costPerKilometerBelowSoftMax.
     */
    @java.lang.Override
    public double getCostPerKilometerBelowSoftMax() {
      return costPerKilometerBelowSoftMax_;
    }

    /**
     *
     *
     * <pre>
     * Cost per kilometer incurred, increasing up to `soft_max_meters`, with
     * formula:
     * ```
     *   min(distance_meters, soft_max_meters) / 1000.0 *
     *   cost_per_kilometer_below_soft_max.
     * ```
     * This cost is not supported in `route_distance_limit`.
     * </pre>
     *
     * <code>optional double cost_per_kilometer_below_soft_max = 4;</code>
     *
     * @param value The costPerKilometerBelowSoftMax to set.
     * @return This builder for chaining.
     */
    public Builder setCostPerKilometerBelowSoftMax(double value) {

      costPerKilometerBelowSoftMax_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Cost per kilometer incurred, increasing up to `soft_max_meters`, with
     * formula:
     * ```
     *   min(distance_meters, soft_max_meters) / 1000.0 *
     *   cost_per_kilometer_below_soft_max.
     * ```
     * This cost is not supported in `route_distance_limit`.
     * </pre>
     *
     * <code>optional double cost_per_kilometer_below_soft_max = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCostPerKilometerBelowSoftMax() {
      bitField0_ = (bitField0_ & ~0x00000004);
      costPerKilometerBelowSoftMax_ = 0D;
      onChanged();
      return this;
    }

    private double costPerKilometerAboveSoftMax_;

    /**
     *
     *
     * <pre>
     * Cost per kilometer incurred if distance is above `soft_max_meters` limit.
     * The additional cost is 0 if the distance is under the limit, otherwise the
     * formula used to compute the cost is the following:
     * ```
     *   (distance_meters - soft_max_meters) / 1000.0 *
     *   cost_per_kilometer_above_soft_max.
     * ```
     * The cost must be nonnegative.
     * </pre>
     *
     * <code>optional double cost_per_kilometer_above_soft_max = 3;</code>
     *
     * @return Whether the costPerKilometerAboveSoftMax field is set.
     */
    @java.lang.Override
    public boolean hasCostPerKilometerAboveSoftMax() {
      return ((bitField0_ & 0x00000008) != 0);
    }

    /**
     *
     *
     * <pre>
     * Cost per kilometer incurred if distance is above `soft_max_meters` limit.
     * The additional cost is 0 if the distance is under the limit, otherwise the
     * formula used to compute the cost is the following:
     * ```
     *   (distance_meters - soft_max_meters) / 1000.0 *
     *   cost_per_kilometer_above_soft_max.
     * ```
     * The cost must be nonnegative.
     * </pre>
     *
     * <code>optional double cost_per_kilometer_above_soft_max = 3;</code>
     *
     * @return The costPerKilometerAboveSoftMax.
     */
    @java.lang.Override
    public double getCostPerKilometerAboveSoftMax() {
      return costPerKilometerAboveSoftMax_;
    }

    /**
     *
     *
     * <pre>
     * Cost per kilometer incurred if distance is above `soft_max_meters` limit.
     * The additional cost is 0 if the distance is under the limit, otherwise the
     * formula used to compute the cost is the following:
     * ```
     *   (distance_meters - soft_max_meters) / 1000.0 *
     *   cost_per_kilometer_above_soft_max.
     * ```
     * The cost must be nonnegative.
     * </pre>
     *
     * <code>optional double cost_per_kilometer_above_soft_max = 3;</code>
     *
     * @param value The costPerKilometerAboveSoftMax to set.
     * @return This builder for chaining.
     */
    public Builder setCostPerKilometerAboveSoftMax(double value) {

      costPerKilometerAboveSoftMax_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Cost per kilometer incurred if distance is above `soft_max_meters` limit.
     * The additional cost is 0 if the distance is under the limit, otherwise the
     * formula used to compute the cost is the following:
     * ```
     *   (distance_meters - soft_max_meters) / 1000.0 *
     *   cost_per_kilometer_above_soft_max.
     * ```
     * The cost must be nonnegative.
     * </pre>
     *
     * <code>optional double cost_per_kilometer_above_soft_max = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCostPerKilometerAboveSoftMax() {
      bitField0_ = (bitField0_ & ~0x00000008);
      costPerKilometerAboveSoftMax_ = 0D;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.optimization.v1.DistanceLimit)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.optimization.v1.DistanceLimit)
  private static final com.google.cloud.optimization.v1.DistanceLimit DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.optimization.v1.DistanceLimit();
  }

  public static com.google.cloud.optimization.v1.DistanceLimit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DistanceLimit> PARSER =
      new com.google.protobuf.AbstractParser<DistanceLimit>() {
        @java.lang.Override
        public DistanceLimit parsePartialFrom(
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

  public static com.google.protobuf.Parser<DistanceLimit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DistanceLimit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.optimization.v1.DistanceLimit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
