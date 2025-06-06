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
// source: google/maps/routing/v2/route_travel_mode.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.routing.v2;

/**
 *
 *
 * <pre>
 * A set of values used to specify the mode of travel.
 * NOTE: `WALK`, `BICYCLE`, and `TWO_WHEELER` routes are in beta and might
 * sometimes be missing clear sidewalks, pedestrian paths, or bicycling paths.
 * You must display this warning to the user for all walking, bicycling, and
 * two-wheel routes that you display in your app.
 * </pre>
 *
 * Protobuf enum {@code google.maps.routing.v2.RouteTravelMode}
 */
public enum RouteTravelMode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No travel mode specified. Defaults to `DRIVE`.
   * </pre>
   *
   * <code>TRAVEL_MODE_UNSPECIFIED = 0;</code>
   */
  TRAVEL_MODE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Travel by passenger car.
   * </pre>
   *
   * <code>DRIVE = 1;</code>
   */
  DRIVE(1),
  /**
   *
   *
   * <pre>
   * Travel by bicycle.
   * </pre>
   *
   * <code>BICYCLE = 2;</code>
   */
  BICYCLE(2),
  /**
   *
   *
   * <pre>
   * Travel by walking.
   * </pre>
   *
   * <code>WALK = 3;</code>
   */
  WALK(3),
  /**
   *
   *
   * <pre>
   * Two-wheeled, motorized vehicle. For example, motorcycle. Note that this
   * differs from the `BICYCLE` travel mode which covers human-powered mode.
   * </pre>
   *
   * <code>TWO_WHEELER = 4;</code>
   */
  TWO_WHEELER(4),
  /**
   *
   *
   * <pre>
   * Travel by public transit routes, where available.
   * </pre>
   *
   * <code>TRANSIT = 7;</code>
   */
  TRANSIT(7),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No travel mode specified. Defaults to `DRIVE`.
   * </pre>
   *
   * <code>TRAVEL_MODE_UNSPECIFIED = 0;</code>
   */
  public static final int TRAVEL_MODE_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Travel by passenger car.
   * </pre>
   *
   * <code>DRIVE = 1;</code>
   */
  public static final int DRIVE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Travel by bicycle.
   * </pre>
   *
   * <code>BICYCLE = 2;</code>
   */
  public static final int BICYCLE_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Travel by walking.
   * </pre>
   *
   * <code>WALK = 3;</code>
   */
  public static final int WALK_VALUE = 3;

  /**
   *
   *
   * <pre>
   * Two-wheeled, motorized vehicle. For example, motorcycle. Note that this
   * differs from the `BICYCLE` travel mode which covers human-powered mode.
   * </pre>
   *
   * <code>TWO_WHEELER = 4;</code>
   */
  public static final int TWO_WHEELER_VALUE = 4;

  /**
   *
   *
   * <pre>
   * Travel by public transit routes, where available.
   * </pre>
   *
   * <code>TRANSIT = 7;</code>
   */
  public static final int TRANSIT_VALUE = 7;

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
  public static RouteTravelMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RouteTravelMode forNumber(int value) {
    switch (value) {
      case 0:
        return TRAVEL_MODE_UNSPECIFIED;
      case 1:
        return DRIVE;
      case 2:
        return BICYCLE;
      case 3:
        return WALK;
      case 4:
        return TWO_WHEELER;
      case 7:
        return TRANSIT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RouteTravelMode> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<RouteTravelMode> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<RouteTravelMode>() {
        public RouteTravelMode findValueByNumber(int number) {
          return RouteTravelMode.forNumber(number);
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
    return com.google.maps.routing.v2.RouteTravelModeProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final RouteTravelMode[] VALUES = values();

  public static RouteTravelMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private RouteTravelMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.maps.routing.v2.RouteTravelMode)
}
