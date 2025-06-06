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
// source: google/maps/mapsplatformdatasets/v1/maps_platform_datasets_service.proto

// Protobuf Java Version: 3.25.8
package com.google.maps.mapsplatformdatasets.v1;

public final class MapsPlatformDatasetsServiceProto {
  private MapsPlatformDatasetsServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nHgoogle/maps/mapsplatformdatasets/v1/ma"
          + "ps_platform_datasets_service.proto\022#goog"
          + "le.maps.mapsplatformdatasets.v1\032\034google/"
          + "api/annotations.proto\032\027google/api/client"
          + ".proto\0321google/maps/mapsplatformdatasets"
          + "/v1/dataset.proto\032@google/maps/mapsplatf"
          + "ormdatasets/v1/maps_platform_datasets.pr"
          + "oto\032\033google/protobuf/empty.proto2\341\t\n\024Map"
          + "sPlatformDatasets\022\274\001\n\rCreateDataset\0229.go"
          + "ogle.maps.mapsplatformdatasets.v1.Create"
          + "DatasetRequest\032,.google.maps.mapsplatfor"
          + "mdatasets.v1.Dataset\"B\332A\016parent,dataset\202"
          + "\323\344\223\002+\" /v1/{parent=projects/*}/datasets:"
          + "\007dataset\022\331\001\n\025UpdateDatasetMetadata\022A.goo"
          + "gle.maps.mapsplatformdatasets.v1.UpdateD"
          + "atasetMetadataRequest\032,.google.maps.maps"
          + "platformdatasets.v1.Dataset\"O\332A\023dataset,"
          + "update_mask\202\323\344\223\00232(/v1/{dataset.name=pro"
          + "jects/*/datasets/*}:\007dataset\022\243\001\n\nGetData"
          + "set\0226.google.maps.mapsplatformdatasets.v"
          + "1.GetDatasetRequest\032,.google.maps.mapspl"
          + "atformdatasets.v1.Dataset\"/\332A\004name\202\323\344\223\002\""
          + "\022 /v1/{name=projects/*/datasets/*}\022\337\001\n\022F"
          + "etchDatasetErrors\022>.google.maps.mapsplat"
          + "formdatasets.v1.FetchDatasetErrorsReques"
          + "t\032?.google.maps.mapsplatformdatasets.v1."
          + "FetchDatasetErrorsResponse\"H\332A\007dataset\202\323"
          + "\344\223\0028\0226/v1/{dataset=projects/*/datasets/*"
          + "}:fetchDatasetErrors\022\266\001\n\014ListDatasets\0228."
          + "google.maps.mapsplatformdatasets.v1.List"
          + "DatasetsRequest\0329.google.maps.mapsplatfo"
          + "rmdatasets.v1.ListDatasetsResponse\"1\332A\006p"
          + "arent\202\323\344\223\002\"\022 /v1/{parent=projects/*}/dat"
          + "asets\022\223\001\n\rDeleteDataset\0229.google.maps.ma"
          + "psplatformdatasets.v1.DeleteDatasetReque"
          + "st\032\026.google.protobuf.Empty\"/\332A\004name\202\323\344\223\002"
          + "\"* /v1/{name=projects/*/datasets/*}\032W\312A#"
          + "mapsplatformdatasets.googleapis.com\322A.ht"
          + "tps://www.googleapis.com/auth/cloud-plat"
          + "formB\206\002\n\'com.google.maps.mapsplatformdat"
          + "asets.v1B MapsPlatformDatasetsServicePro"
          + "toP\001Zacloud.google.com/go/maps/mapsplatf"
          + "ormdatasets/apiv1/mapsplatformdatasetspb"
          + ";mapsplatformdatasetspb\370\001\001\242\002\004MDV1\252\002#Goog"
          + "le.Maps.MapsPlatformDatasets.V1\312\002#Google"
          + "\\Maps\\MapsPlatformDatasets\\V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.maps.mapsplatformdatasets.v1.DatasetProto.getDescriptor(),
              com.google.maps.mapsplatformdatasets.v1.MapsPlatformDatasetsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.maps.mapsplatformdatasets.v1.DatasetProto.getDescriptor();
    com.google.maps.mapsplatformdatasets.v1.MapsPlatformDatasetsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
