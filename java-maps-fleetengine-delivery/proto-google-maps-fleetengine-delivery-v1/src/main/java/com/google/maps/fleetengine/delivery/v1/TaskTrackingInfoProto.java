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
// source: google/maps/fleetengine/delivery/v1/task_tracking_info.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.fleetengine.delivery.v1;

public final class TaskTrackingInfoProto {
  private TaskTrackingInfoProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_maps_fleetengine_delivery_v1_TaskTrackingInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_maps_fleetengine_delivery_v1_TaskTrackingInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/maps/fleetengine/delivery/v1/ta"
          + "sk_tracking_info.proto\022\034maps.fleetengine"
          + ".delivery.v1\032\037google/api/field_behavior."
          + "proto\032\031google/api/resource.proto\0320google"
          + "/maps/fleetengine/delivery/v1/common.pro"
          + "to\032;google/maps/fleetengine/delivery/v1/"
          + "delivery_vehicles.proto\032/google/maps/fle"
          + "etengine/delivery/v1/tasks.proto\032\037google"
          + "/protobuf/timestamp.proto\032\036google/protob"
          + "uf/wrappers.proto\032\030google/type/latlng.pr"
          + "oto\"\256\007\n\020TaskTrackingInfo\022\014\n\004name\030\001 \001(\t\022\030"
          + "\n\013tracking_id\030\002 \001(\tB\003\340A\005\022O\n\020vehicle_loca"
          + "tion\030\003 \001(\01325.maps.fleetengine.delivery.v"
          + "1.DeliveryVehicleLocation\0222\n\025route_polyl"
          + "ine_points\030\004 \003(\0132\023.google.type.LatLng\0229\n"
          + "\024remaining_stop_count\030\005 \001(\0132\033.google.pro"
          + "tobuf.Int32Value\022F\n!remaining_driving_di"
          + "stance_meters\030\006 \001(\0132\033.google.protobuf.In"
          + "t32Value\022:\n\026estimated_arrival_time\030\007 \001(\013"
          + "2\032.google.protobuf.Timestamp\022B\n\036estimate"
          + "d_task_completion_time\030\010 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\0227\n\005state\030\013 \001(\0162(.maps.f"
          + "leetengine.delivery.v1.Task.State\022D\n\014tas"
          + "k_outcome\030\t \001(\0162..maps.fleetengine.deliv"
          + "ery.v1.Task.TaskOutcome\0225\n\021task_outcome_"
          + "time\030\014 \001(\0132\032.google.protobuf.Timestamp\022I"
          + "\n\020planned_location\030\n \001(\0132*.maps.fleeteng"
          + "ine.delivery.v1.LocationInfoB\003\340A\005\022D\n\022tar"
          + "get_time_window\030\r \001(\0132(.maps.fleetengine"
          + ".delivery.v1.TimeWindow\022?\n\nattributes\030\016 "
          + "\003(\0132+.maps.fleetengine.delivery.v1.TaskA"
          + "ttribute:b\352A_\n+fleetengine.googleapis.co"
          + "m/TaskTrackingInfo\0220providers/{provider}"
          + "/taskTrackingInfo/{tracking}B\212\002\n\'com.goo"
          + "gle.maps.fleetengine.delivery.v1B\025TaskTr"
          + "ackingInfoProtoP\001ZIcloud.google.com/go/m"
          + "aps/fleetengine/delivery/apiv1/deliveryp"
          + "b;deliverypb\242\002\004CFED\252\002#Google.Maps.FleetE"
          + "ngine.Delivery.V1\312\002#Google\\Maps\\FleetEng"
          + "ine\\Delivery\\V1\352\002\'Google::Maps::FleetEng"
          + "ine::Delivery::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.maps.fleetengine.delivery.v1.Common.getDescriptor(),
              com.google.maps.fleetengine.delivery.v1.DeliveryVehicles.getDescriptor(),
              com.google.maps.fleetengine.delivery.v1.Tasks.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
              com.google.type.LatLngProto.getDescriptor(),
            });
    internal_static_maps_fleetengine_delivery_v1_TaskTrackingInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_maps_fleetengine_delivery_v1_TaskTrackingInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_maps_fleetengine_delivery_v1_TaskTrackingInfo_descriptor,
            new java.lang.String[] {
              "Name",
              "TrackingId",
              "VehicleLocation",
              "RoutePolylinePoints",
              "RemainingStopCount",
              "RemainingDrivingDistanceMeters",
              "EstimatedArrivalTime",
              "EstimatedTaskCompletionTime",
              "State",
              "TaskOutcome",
              "TaskOutcomeTime",
              "PlannedLocation",
              "TargetTimeWindow",
              "Attributes",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.maps.fleetengine.delivery.v1.Common.getDescriptor();
    com.google.maps.fleetengine.delivery.v1.DeliveryVehicles.getDescriptor();
    com.google.maps.fleetengine.delivery.v1.Tasks.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.type.LatLngProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
