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
// source: google/maps/places/v1/address_descriptor.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.places.v1;

public final class AddressDescriptorProto {
  private AddressDescriptorProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_AddressDescriptor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_AddressDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_AddressDescriptor_Landmark_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_AddressDescriptor_Landmark_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_maps_places_v1_AddressDescriptor_Area_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_maps_places_v1_AddressDescriptor_Area_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/maps/places/v1/address_descript"
          + "or.proto\022\025google.maps.places.v1\032\031google/"
          + "api/resource.proto\032 google/type/localize"
          + "d_text.proto\"\226\007\n\021AddressDescriptor\022D\n\tla"
          + "ndmarks\030\001 \003(\01321.google.maps.places.v1.Ad"
          + "dressDescriptor.Landmark\022<\n\005areas\030\002 \003(\0132"
          + "-.google.maps.places.v1.AddressDescripto"
          + "r.Area\032\336\003\n\010Landmark\022.\n\004name\030\001 \001(\tB \372A\035\n\033"
          + "places.googleapis.com/Place\022\020\n\010place_id\030"
          + "\002 \001(\t\0220\n\014display_name\030\003 \001(\0132\032.google.typ"
          + "e.LocalizedText\022\r\n\005types\030\004 \003(\t\022c\n\024spatia"
          + "l_relationship\030\005 \001(\0162E.google.maps.place"
          + "s.v1.AddressDescriptor.Landmark.SpatialR"
          + "elationship\022%\n\035straight_line_distance_me"
          + "ters\030\006 \001(\002\022#\n\026travel_distance_meters\030\007 \001"
          + "(\002H\000\210\001\001\"\202\001\n\023SpatialRelationship\022\010\n\004NEAR\020"
          + "\000\022\n\n\006WITHIN\020\001\022\n\n\006BESIDE\020\002\022\023\n\017ACROSS_THE_"
          + "ROAD\020\003\022\021\n\rDOWN_THE_ROAD\020\004\022\025\n\021AROUND_THE_"
          + "CORNER\020\005\022\n\n\006BEHIND\020\006B\031\n\027_travel_distance"
          + "_meters\032\233\002\n\004Area\022.\n\004name\030\001 \001(\tB \372A\035\n\033pla"
          + "ces.googleapis.com/Place\022\020\n\010place_id\030\002 \001"
          + "(\t\0220\n\014display_name\030\003 \001(\0132\032.google.type.L"
          + "ocalizedText\022N\n\013containment\030\004 \001(\01629.goog"
          + "le.maps.places.v1.AddressDescriptor.Area"
          + ".Containment\"O\n\013Containment\022\033\n\027CONTAINME"
          + "NT_UNSPECIFIED\020\000\022\n\n\006WITHIN\020\001\022\r\n\tOUTSKIRT"
          + "S\020\002\022\010\n\004NEAR\020\003B\247\001\n\031com.google.maps.places"
          + ".v1B\026AddressDescriptorProtoP\001Z7cloud.goo"
          + "gle.com/go/maps/places/apiv1/placespb;pl"
          + "acespb\242\002\006GMPSV1\252\002\025Google.Maps.Places.V1\312"
          + "\002\025Google\\Maps\\Places\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.ResourceProto.getDescriptor(),
              com.google.type.LocalizedTextProto.getDescriptor(),
            });
    internal_static_google_maps_places_v1_AddressDescriptor_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_maps_places_v1_AddressDescriptor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_AddressDescriptor_descriptor,
            new java.lang.String[] {
              "Landmarks", "Areas",
            });
    internal_static_google_maps_places_v1_AddressDescriptor_Landmark_descriptor =
        internal_static_google_maps_places_v1_AddressDescriptor_descriptor.getNestedTypes().get(0);
    internal_static_google_maps_places_v1_AddressDescriptor_Landmark_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_AddressDescriptor_Landmark_descriptor,
            new java.lang.String[] {
              "Name",
              "PlaceId",
              "DisplayName",
              "Types",
              "SpatialRelationship",
              "StraightLineDistanceMeters",
              "TravelDistanceMeters",
            });
    internal_static_google_maps_places_v1_AddressDescriptor_Area_descriptor =
        internal_static_google_maps_places_v1_AddressDescriptor_descriptor.getNestedTypes().get(1);
    internal_static_google_maps_places_v1_AddressDescriptor_Area_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_maps_places_v1_AddressDescriptor_Area_descriptor,
            new java.lang.String[] {
              "Name", "PlaceId", "DisplayName", "Containment",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.ResourceProto.getDescriptor();
    com.google.type.LocalizedTextProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
