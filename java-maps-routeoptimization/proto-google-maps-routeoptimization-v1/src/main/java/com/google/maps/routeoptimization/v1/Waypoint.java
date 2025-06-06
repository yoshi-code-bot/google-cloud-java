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
// source: google/maps/routeoptimization/v1/route_optimization_service.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.routeoptimization.v1;

/**
 *
 *
 * <pre>
 * Encapsulates a waypoint. Waypoints mark arrival and departure locations of
 * VisitRequests, and start and end locations of Vehicles.
 * </pre>
 *
 * Protobuf type {@code google.maps.routeoptimization.v1.Waypoint}
 */
public final class Waypoint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.maps.routeoptimization.v1.Waypoint)
    WaypointOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Waypoint.newBuilder() to construct.
  private Waypoint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Waypoint() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Waypoint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.maps.routeoptimization.v1.RouteOptimizationServiceProto
        .internal_static_google_maps_routeoptimization_v1_Waypoint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.maps.routeoptimization.v1.RouteOptimizationServiceProto
        .internal_static_google_maps_routeoptimization_v1_Waypoint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.maps.routeoptimization.v1.Waypoint.class,
            com.google.maps.routeoptimization.v1.Waypoint.Builder.class);
  }

  private int locationTypeCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object locationType_;

  public enum LocationTypeCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    LOCATION(1),
    PLACE_ID(2),
    LOCATIONTYPE_NOT_SET(0);
    private final int value;

    private LocationTypeCase(int value) {
      this.value = value;
    }

    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static LocationTypeCase valueOf(int value) {
      return forNumber(value);
    }

    public static LocationTypeCase forNumber(int value) {
      switch (value) {
        case 1:
          return LOCATION;
        case 2:
          return PLACE_ID;
        case 0:
          return LOCATIONTYPE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public LocationTypeCase getLocationTypeCase() {
    return LocationTypeCase.forNumber(locationTypeCase_);
  }

  public static final int LOCATION_FIELD_NUMBER = 1;

  /**
   *
   *
   * <pre>
   * A point specified using geographic coordinates, including an optional
   * heading.
   * </pre>
   *
   * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
   *
   * @return Whether the location field is set.
   */
  @java.lang.Override
  public boolean hasLocation() {
    return locationTypeCase_ == 1;
  }

  /**
   *
   *
   * <pre>
   * A point specified using geographic coordinates, including an optional
   * heading.
   * </pre>
   *
   * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
   *
   * @return The location.
   */
  @java.lang.Override
  public com.google.maps.routeoptimization.v1.Location getLocation() {
    if (locationTypeCase_ == 1) {
      return (com.google.maps.routeoptimization.v1.Location) locationType_;
    }
    return com.google.maps.routeoptimization.v1.Location.getDefaultInstance();
  }

  /**
   *
   *
   * <pre>
   * A point specified using geographic coordinates, including an optional
   * heading.
   * </pre>
   *
   * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
   */
  @java.lang.Override
  public com.google.maps.routeoptimization.v1.LocationOrBuilder getLocationOrBuilder() {
    if (locationTypeCase_ == 1) {
      return (com.google.maps.routeoptimization.v1.Location) locationType_;
    }
    return com.google.maps.routeoptimization.v1.Location.getDefaultInstance();
  }

  public static final int PLACE_ID_FIELD_NUMBER = 2;

  /**
   *
   *
   * <pre>
   * The POI Place ID associated with the waypoint.
   * </pre>
   *
   * <code>string place_id = 2;</code>
   *
   * @return Whether the placeId field is set.
   */
  public boolean hasPlaceId() {
    return locationTypeCase_ == 2;
  }

  /**
   *
   *
   * <pre>
   * The POI Place ID associated with the waypoint.
   * </pre>
   *
   * <code>string place_id = 2;</code>
   *
   * @return The placeId.
   */
  public java.lang.String getPlaceId() {
    java.lang.Object ref = "";
    if (locationTypeCase_ == 2) {
      ref = locationType_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (locationTypeCase_ == 2) {
        locationType_ = s;
      }
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The POI Place ID associated with the waypoint.
   * </pre>
   *
   * <code>string place_id = 2;</code>
   *
   * @return The bytes for placeId.
   */
  public com.google.protobuf.ByteString getPlaceIdBytes() {
    java.lang.Object ref = "";
    if (locationTypeCase_ == 2) {
      ref = locationType_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (locationTypeCase_ == 2) {
        locationType_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIDE_OF_ROAD_FIELD_NUMBER = 3;
  private boolean sideOfRoad_ = false;

  /**
   *
   *
   * <pre>
   * Optional. Indicates that the location of this waypoint is meant to have a
   * preference for the vehicle to stop at a particular side of road. When you
   * set this value, the route will pass through the location so that the
   * vehicle can stop at the side of road that the location is biased towards
   * from the center of the road. This option doesn't work for the 'WALKING'
   * travel mode.
   * </pre>
   *
   * <code>bool side_of_road = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The sideOfRoad.
   */
  @java.lang.Override
  public boolean getSideOfRoad() {
    return sideOfRoad_;
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
    if (locationTypeCase_ == 1) {
      output.writeMessage(1, (com.google.maps.routeoptimization.v1.Location) locationType_);
    }
    if (locationTypeCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, locationType_);
    }
    if (sideOfRoad_ != false) {
      output.writeBool(3, sideOfRoad_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (locationTypeCase_ == 1) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              1, (com.google.maps.routeoptimization.v1.Location) locationType_);
    }
    if (locationTypeCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, locationType_);
    }
    if (sideOfRoad_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, sideOfRoad_);
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
    if (!(obj instanceof com.google.maps.routeoptimization.v1.Waypoint)) {
      return super.equals(obj);
    }
    com.google.maps.routeoptimization.v1.Waypoint other =
        (com.google.maps.routeoptimization.v1.Waypoint) obj;

    if (getSideOfRoad() != other.getSideOfRoad()) return false;
    if (!getLocationTypeCase().equals(other.getLocationTypeCase())) return false;
    switch (locationTypeCase_) {
      case 1:
        if (!getLocation().equals(other.getLocation())) return false;
        break;
      case 2:
        if (!getPlaceId().equals(other.getPlaceId())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + SIDE_OF_ROAD_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getSideOfRoad());
    switch (locationTypeCase_) {
      case 1:
        hash = (37 * hash) + LOCATION_FIELD_NUMBER;
        hash = (53 * hash) + getLocation().hashCode();
        break;
      case 2:
        hash = (37 * hash) + PLACE_ID_FIELD_NUMBER;
        hash = (53 * hash) + getPlaceId().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.maps.routeoptimization.v1.Waypoint parseFrom(
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

  public static Builder newBuilder(com.google.maps.routeoptimization.v1.Waypoint prototype) {
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
   * Encapsulates a waypoint. Waypoints mark arrival and departure locations of
   * VisitRequests, and start and end locations of Vehicles.
   * </pre>
   *
   * Protobuf type {@code google.maps.routeoptimization.v1.Waypoint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.maps.routeoptimization.v1.Waypoint)
      com.google.maps.routeoptimization.v1.WaypointOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.maps.routeoptimization.v1.RouteOptimizationServiceProto
          .internal_static_google_maps_routeoptimization_v1_Waypoint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.maps.routeoptimization.v1.RouteOptimizationServiceProto
          .internal_static_google_maps_routeoptimization_v1_Waypoint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.maps.routeoptimization.v1.Waypoint.class,
              com.google.maps.routeoptimization.v1.Waypoint.Builder.class);
    }

    // Construct using com.google.maps.routeoptimization.v1.Waypoint.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (locationBuilder_ != null) {
        locationBuilder_.clear();
      }
      sideOfRoad_ = false;
      locationTypeCase_ = 0;
      locationType_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.maps.routeoptimization.v1.RouteOptimizationServiceProto
          .internal_static_google_maps_routeoptimization_v1_Waypoint_descriptor;
    }

    @java.lang.Override
    public com.google.maps.routeoptimization.v1.Waypoint getDefaultInstanceForType() {
      return com.google.maps.routeoptimization.v1.Waypoint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.maps.routeoptimization.v1.Waypoint build() {
      com.google.maps.routeoptimization.v1.Waypoint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.maps.routeoptimization.v1.Waypoint buildPartial() {
      com.google.maps.routeoptimization.v1.Waypoint result =
          new com.google.maps.routeoptimization.v1.Waypoint(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.maps.routeoptimization.v1.Waypoint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.sideOfRoad_ = sideOfRoad_;
      }
    }

    private void buildPartialOneofs(com.google.maps.routeoptimization.v1.Waypoint result) {
      result.locationTypeCase_ = locationTypeCase_;
      result.locationType_ = this.locationType_;
      if (locationTypeCase_ == 1 && locationBuilder_ != null) {
        result.locationType_ = locationBuilder_.build();
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
      if (other instanceof com.google.maps.routeoptimization.v1.Waypoint) {
        return mergeFrom((com.google.maps.routeoptimization.v1.Waypoint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.maps.routeoptimization.v1.Waypoint other) {
      if (other == com.google.maps.routeoptimization.v1.Waypoint.getDefaultInstance()) return this;
      if (other.getSideOfRoad() != false) {
        setSideOfRoad(other.getSideOfRoad());
      }
      switch (other.getLocationTypeCase()) {
        case LOCATION:
          {
            mergeLocation(other.getLocation());
            break;
          }
        case PLACE_ID:
          {
            locationTypeCase_ = 2;
            locationType_ = other.locationType_;
            onChanged();
            break;
          }
        case LOCATIONTYPE_NOT_SET:
          {
            break;
          }
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
                input.readMessage(getLocationFieldBuilder().getBuilder(), extensionRegistry);
                locationTypeCase_ = 1;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                locationTypeCase_ = 2;
                locationType_ = s;
                break;
              } // case 18
            case 24:
              {
                sideOfRoad_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private int locationTypeCase_ = 0;
    private java.lang.Object locationType_;

    public LocationTypeCase getLocationTypeCase() {
      return LocationTypeCase.forNumber(locationTypeCase_);
    }

    public Builder clearLocationType() {
      locationTypeCase_ = 0;
      locationType_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.routeoptimization.v1.Location,
            com.google.maps.routeoptimization.v1.Location.Builder,
            com.google.maps.routeoptimization.v1.LocationOrBuilder>
        locationBuilder_;

    /**
     *
     *
     * <pre>
     * A point specified using geographic coordinates, including an optional
     * heading.
     * </pre>
     *
     * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
     *
     * @return Whether the location field is set.
     */
    @java.lang.Override
    public boolean hasLocation() {
      return locationTypeCase_ == 1;
    }

    /**
     *
     *
     * <pre>
     * A point specified using geographic coordinates, including an optional
     * heading.
     * </pre>
     *
     * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
     *
     * @return The location.
     */
    @java.lang.Override
    public com.google.maps.routeoptimization.v1.Location getLocation() {
      if (locationBuilder_ == null) {
        if (locationTypeCase_ == 1) {
          return (com.google.maps.routeoptimization.v1.Location) locationType_;
        }
        return com.google.maps.routeoptimization.v1.Location.getDefaultInstance();
      } else {
        if (locationTypeCase_ == 1) {
          return locationBuilder_.getMessage();
        }
        return com.google.maps.routeoptimization.v1.Location.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * A point specified using geographic coordinates, including an optional
     * heading.
     * </pre>
     *
     * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
     */
    public Builder setLocation(com.google.maps.routeoptimization.v1.Location value) {
      if (locationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        locationType_ = value;
        onChanged();
      } else {
        locationBuilder_.setMessage(value);
      }
      locationTypeCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * A point specified using geographic coordinates, including an optional
     * heading.
     * </pre>
     *
     * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
     */
    public Builder setLocation(
        com.google.maps.routeoptimization.v1.Location.Builder builderForValue) {
      if (locationBuilder_ == null) {
        locationType_ = builderForValue.build();
        onChanged();
      } else {
        locationBuilder_.setMessage(builderForValue.build());
      }
      locationTypeCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * A point specified using geographic coordinates, including an optional
     * heading.
     * </pre>
     *
     * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
     */
    public Builder mergeLocation(com.google.maps.routeoptimization.v1.Location value) {
      if (locationBuilder_ == null) {
        if (locationTypeCase_ == 1
            && locationType_
                != com.google.maps.routeoptimization.v1.Location.getDefaultInstance()) {
          locationType_ =
              com.google.maps.routeoptimization.v1.Location.newBuilder(
                      (com.google.maps.routeoptimization.v1.Location) locationType_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          locationType_ = value;
        }
        onChanged();
      } else {
        if (locationTypeCase_ == 1) {
          locationBuilder_.mergeFrom(value);
        } else {
          locationBuilder_.setMessage(value);
        }
      }
      locationTypeCase_ = 1;
      return this;
    }

    /**
     *
     *
     * <pre>
     * A point specified using geographic coordinates, including an optional
     * heading.
     * </pre>
     *
     * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
     */
    public Builder clearLocation() {
      if (locationBuilder_ == null) {
        if (locationTypeCase_ == 1) {
          locationTypeCase_ = 0;
          locationType_ = null;
          onChanged();
        }
      } else {
        if (locationTypeCase_ == 1) {
          locationTypeCase_ = 0;
          locationType_ = null;
        }
        locationBuilder_.clear();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * A point specified using geographic coordinates, including an optional
     * heading.
     * </pre>
     *
     * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
     */
    public com.google.maps.routeoptimization.v1.Location.Builder getLocationBuilder() {
      return getLocationFieldBuilder().getBuilder();
    }

    /**
     *
     *
     * <pre>
     * A point specified using geographic coordinates, including an optional
     * heading.
     * </pre>
     *
     * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
     */
    @java.lang.Override
    public com.google.maps.routeoptimization.v1.LocationOrBuilder getLocationOrBuilder() {
      if ((locationTypeCase_ == 1) && (locationBuilder_ != null)) {
        return locationBuilder_.getMessageOrBuilder();
      } else {
        if (locationTypeCase_ == 1) {
          return (com.google.maps.routeoptimization.v1.Location) locationType_;
        }
        return com.google.maps.routeoptimization.v1.Location.getDefaultInstance();
      }
    }

    /**
     *
     *
     * <pre>
     * A point specified using geographic coordinates, including an optional
     * heading.
     * </pre>
     *
     * <code>.google.maps.routeoptimization.v1.Location location = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.maps.routeoptimization.v1.Location,
            com.google.maps.routeoptimization.v1.Location.Builder,
            com.google.maps.routeoptimization.v1.LocationOrBuilder>
        getLocationFieldBuilder() {
      if (locationBuilder_ == null) {
        if (!(locationTypeCase_ == 1)) {
          locationType_ = com.google.maps.routeoptimization.v1.Location.getDefaultInstance();
        }
        locationBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.maps.routeoptimization.v1.Location,
                com.google.maps.routeoptimization.v1.Location.Builder,
                com.google.maps.routeoptimization.v1.LocationOrBuilder>(
                (com.google.maps.routeoptimization.v1.Location) locationType_,
                getParentForChildren(),
                isClean());
        locationType_ = null;
      }
      locationTypeCase_ = 1;
      onChanged();
      return locationBuilder_;
    }

    /**
     *
     *
     * <pre>
     * The POI Place ID associated with the waypoint.
     * </pre>
     *
     * <code>string place_id = 2;</code>
     *
     * @return Whether the placeId field is set.
     */
    @java.lang.Override
    public boolean hasPlaceId() {
      return locationTypeCase_ == 2;
    }

    /**
     *
     *
     * <pre>
     * The POI Place ID associated with the waypoint.
     * </pre>
     *
     * <code>string place_id = 2;</code>
     *
     * @return The placeId.
     */
    @java.lang.Override
    public java.lang.String getPlaceId() {
      java.lang.Object ref = "";
      if (locationTypeCase_ == 2) {
        ref = locationType_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (locationTypeCase_ == 2) {
          locationType_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The POI Place ID associated with the waypoint.
     * </pre>
     *
     * <code>string place_id = 2;</code>
     *
     * @return The bytes for placeId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getPlaceIdBytes() {
      java.lang.Object ref = "";
      if (locationTypeCase_ == 2) {
        ref = locationType_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (locationTypeCase_ == 2) {
          locationType_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The POI Place ID associated with the waypoint.
     * </pre>
     *
     * <code>string place_id = 2;</code>
     *
     * @param value The placeId to set.
     * @return This builder for chaining.
     */
    public Builder setPlaceId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      locationTypeCase_ = 2;
      locationType_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The POI Place ID associated with the waypoint.
     * </pre>
     *
     * <code>string place_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPlaceId() {
      if (locationTypeCase_ == 2) {
        locationTypeCase_ = 0;
        locationType_ = null;
        onChanged();
      }
      return this;
    }

    /**
     *
     *
     * <pre>
     * The POI Place ID associated with the waypoint.
     * </pre>
     *
     * <code>string place_id = 2;</code>
     *
     * @param value The bytes for placeId to set.
     * @return This builder for chaining.
     */
    public Builder setPlaceIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      locationTypeCase_ = 2;
      locationType_ = value;
      onChanged();
      return this;
    }

    private boolean sideOfRoad_;

    /**
     *
     *
     * <pre>
     * Optional. Indicates that the location of this waypoint is meant to have a
     * preference for the vehicle to stop at a particular side of road. When you
     * set this value, the route will pass through the location so that the
     * vehicle can stop at the side of road that the location is biased towards
     * from the center of the road. This option doesn't work for the 'WALKING'
     * travel mode.
     * </pre>
     *
     * <code>bool side_of_road = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The sideOfRoad.
     */
    @java.lang.Override
    public boolean getSideOfRoad() {
      return sideOfRoad_;
    }

    /**
     *
     *
     * <pre>
     * Optional. Indicates that the location of this waypoint is meant to have a
     * preference for the vehicle to stop at a particular side of road. When you
     * set this value, the route will pass through the location so that the
     * vehicle can stop at the side of road that the location is biased towards
     * from the center of the road. This option doesn't work for the 'WALKING'
     * travel mode.
     * </pre>
     *
     * <code>bool side_of_road = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The sideOfRoad to set.
     * @return This builder for chaining.
     */
    public Builder setSideOfRoad(boolean value) {

      sideOfRoad_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Indicates that the location of this waypoint is meant to have a
     * preference for the vehicle to stop at a particular side of road. When you
     * set this value, the route will pass through the location so that the
     * vehicle can stop at the side of road that the location is biased towards
     * from the center of the road. This option doesn't work for the 'WALKING'
     * travel mode.
     * </pre>
     *
     * <code>bool side_of_road = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSideOfRoad() {
      bitField0_ = (bitField0_ & ~0x00000004);
      sideOfRoad_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.maps.routeoptimization.v1.Waypoint)
  }

  // @@protoc_insertion_point(class_scope:google.maps.routeoptimization.v1.Waypoint)
  private static final com.google.maps.routeoptimization.v1.Waypoint DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.maps.routeoptimization.v1.Waypoint();
  }

  public static com.google.maps.routeoptimization.v1.Waypoint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Waypoint> PARSER =
      new com.google.protobuf.AbstractParser<Waypoint>() {
        @java.lang.Override
        public Waypoint parsePartialFrom(
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

  public static com.google.protobuf.Parser<Waypoint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Waypoint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.maps.routeoptimization.v1.Waypoint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
