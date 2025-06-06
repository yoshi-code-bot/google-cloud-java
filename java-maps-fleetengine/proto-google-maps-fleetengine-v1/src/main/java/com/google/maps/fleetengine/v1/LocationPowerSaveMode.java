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
// source: google/maps/fleetengine/v1/vehicles.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.v1;

/**
 *
 *
 * <pre>
 * How location features are configured to behave on the mobile device when the
 * devices "battery saver" feature is on.
 * (https://developer.android.com/reference/android/os/PowerManager#getLocationPowerSaveMode())
 * </pre>
 *
 * Protobuf enum {@code maps.fleetengine.v1.LocationPowerSaveMode}
 */
public enum LocationPowerSaveMode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Undefined LocationPowerSaveMode
   * </pre>
   *
   * <code>UNKNOWN_LOCATION_POWER_SAVE_MODE = 0;</code>
   */
  UNKNOWN_LOCATION_POWER_SAVE_MODE(0),
  /**
   *
   *
   * <pre>
   * Either the location providers shouldn't be affected by battery saver, or
   * battery saver is off.
   * </pre>
   *
   * <code>LOCATION_MODE_NO_CHANGE = 1;</code>
   */
  LOCATION_MODE_NO_CHANGE(1),
  /**
   *
   *
   * <pre>
   * The GPS based location provider should be disabled when battery saver is on
   * and the device is non-interactive.
   * </pre>
   *
   * <code>LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF = 2;</code>
   */
  LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF(2),
  /**
   *
   *
   * <pre>
   * All location providers should be disabled when battery saver is on and the
   * device is non-interactive.
   * </pre>
   *
   * <code>LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF = 3;</code>
   */
  LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF(3),
  /**
   *
   *
   * <pre>
   * All the location providers will be kept available, but location fixes
   * should only be provided to foreground apps.
   * </pre>
   *
   * <code>LOCATION_MODE_FOREGROUND_ONLY = 4;</code>
   */
  LOCATION_MODE_FOREGROUND_ONLY(4),
  /**
   *
   *
   * <pre>
   * Location will not be turned off, but LocationManager will throttle all
   * requests to providers when the device is non-interactive.
   * </pre>
   *
   * <code>LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF = 5;</code>
   */
  LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Undefined LocationPowerSaveMode
   * </pre>
   *
   * <code>UNKNOWN_LOCATION_POWER_SAVE_MODE = 0;</code>
   */
  public static final int UNKNOWN_LOCATION_POWER_SAVE_MODE_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Either the location providers shouldn't be affected by battery saver, or
   * battery saver is off.
   * </pre>
   *
   * <code>LOCATION_MODE_NO_CHANGE = 1;</code>
   */
  public static final int LOCATION_MODE_NO_CHANGE_VALUE = 1;

  /**
   *
   *
   * <pre>
   * The GPS based location provider should be disabled when battery saver is on
   * and the device is non-interactive.
   * </pre>
   *
   * <code>LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF = 2;</code>
   */
  public static final int LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF_VALUE = 2;

  /**
   *
   *
   * <pre>
   * All location providers should be disabled when battery saver is on and the
   * device is non-interactive.
   * </pre>
   *
   * <code>LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF = 3;</code>
   */
  public static final int LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF_VALUE = 3;

  /**
   *
   *
   * <pre>
   * All the location providers will be kept available, but location fixes
   * should only be provided to foreground apps.
   * </pre>
   *
   * <code>LOCATION_MODE_FOREGROUND_ONLY = 4;</code>
   */
  public static final int LOCATION_MODE_FOREGROUND_ONLY_VALUE = 4;

  /**
   *
   *
   * <pre>
   * Location will not be turned off, but LocationManager will throttle all
   * requests to providers when the device is non-interactive.
   * </pre>
   *
   * <code>LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF = 5;</code>
   */
  public static final int LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF_VALUE = 5;

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
  public static LocationPowerSaveMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static LocationPowerSaveMode forNumber(int value) {
    switch (value) {
      case 0:
        return UNKNOWN_LOCATION_POWER_SAVE_MODE;
      case 1:
        return LOCATION_MODE_NO_CHANGE;
      case 2:
        return LOCATION_MODE_GPS_DISABLED_WHEN_SCREEN_OFF;
      case 3:
        return LOCATION_MODE_ALL_DISABLED_WHEN_SCREEN_OFF;
      case 4:
        return LOCATION_MODE_FOREGROUND_ONLY;
      case 5:
        return LOCATION_MODE_THROTTLE_REQUESTS_WHEN_SCREEN_OFF;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<LocationPowerSaveMode>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<LocationPowerSaveMode>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<LocationPowerSaveMode>() {
            public LocationPowerSaveMode findValueByNumber(int number) {
              return LocationPowerSaveMode.forNumber(number);
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
    return com.google.maps.fleetengine.v1.Vehicles.getDescriptor().getEnumTypes().get(1);
  }

  private static final LocationPowerSaveMode[] VALUES = values();

  public static LocationPowerSaveMode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private LocationPowerSaveMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:maps.fleetengine.v1.LocationPowerSaveMode)
}
