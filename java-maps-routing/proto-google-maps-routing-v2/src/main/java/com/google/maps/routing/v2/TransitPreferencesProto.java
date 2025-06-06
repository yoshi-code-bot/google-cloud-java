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
// source: google/maps/routing/v2/transit_preferences.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.routing.v2;

public final class TransitPreferencesProto {
  private TransitPreferencesProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_routing_v2_TransitPreferences_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_routing_v2_TransitPreferences_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/maps/routing/v2/transit_prefere"
          + "nces.proto\022\026google.maps.routing.v2\"\264\003\n\022T"
          + "ransitPreferences\022Z\n\024allowed_travel_mode"
          + "s\030\001 \003(\0162<.google.maps.routing.v2.Transit"
          + "Preferences.TransitTravelMode\022_\n\022routing"
          + "_preference\030\002 \001(\0162C.google.maps.routing."
          + "v2.TransitPreferences.TransitRoutingPref"
          + "erence\"r\n\021TransitTravelMode\022#\n\037TRANSIT_T"
          + "RAVEL_MODE_UNSPECIFIED\020\000\022\007\n\003BUS\020\001\022\n\n\006SUB"
          + "WAY\020\002\022\t\n\005TRAIN\020\003\022\016\n\nLIGHT_RAIL\020\004\022\010\n\004RAIL"
          + "\020\005\"m\n\030TransitRoutingPreference\022*\n&TRANSI"
          + "T_ROUTING_PREFERENCE_UNSPECIFIED\020\000\022\020\n\014LE"
          + "SS_WALKING\020\001\022\023\n\017FEWER_TRANSFERS\020\002B\311\001\n\032co"
          + "m.google.maps.routing.v2B\027TransitPrefere"
          + "ncesProtoP\001Z:cloud.google.com/go/maps/ro"
          + "uting/apiv2/routingpb;routingpb\242\002\005GMRV2\252"
          + "\002\026Google.Maps.Routing.V2\312\002\026Google\\Maps\\R"
          + "outing\\V2\352\002\031Google::Maps::Routing::V2b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_maps_routing_v2_TransitPreferences_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_routing_v2_TransitPreferences_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_routing_v2_TransitPreferences_descriptor,
            new java.lang.String[] {
              "AllowedTravelModes", "RoutingPreference",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
