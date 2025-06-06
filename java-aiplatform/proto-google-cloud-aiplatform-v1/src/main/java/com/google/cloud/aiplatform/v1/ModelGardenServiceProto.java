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
// source: google/cloud/aiplatform/v1/model_garden_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1;

public final class ModelGardenServiceProto {
  private ModelGardenServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/aiplatform/v1/model_garde"
          + "n_service.proto\022\032google.cloud.aiplatform"
          + ".v1\032\034google/api/annotations.proto\032\027googl"
          + "e/api/client.proto\032\037google/api/field_beh"
          + "avior.proto\032\031google/api/resource.proto\0320"
          + "google/cloud/aiplatform/v1/publisher_mod"
          + "el.proto\"\376\001\n\030GetPublisherModelRequest\022>\n"
          + "\004name\030\001 \001(\tB0\340A\002\372A*\n(aiplatform.googleap"
          + "is.com/PublisherModel\022\032\n\rlanguage_code\030\002"
          + " \001(\tB\003\340A\001\022A\n\004view\030\003 \001(\0162..google.cloud.a"
          + "iplatform.v1.PublisherModelViewB\003\340A\001\022\"\n\025"
          + "is_hugging_face_model\030\005 \001(\010B\003\340A\001\022\037\n\022hugg"
          + "ing_face_token\030\006 \001(\tB\003\340A\001*\241\001\n\022PublisherM"
          + "odelView\022$\n PUBLISHER_MODEL_VIEW_UNSPECI"
          + "FIED\020\000\022\036\n\032PUBLISHER_MODEL_VIEW_BASIC\020\001\022\035"
          + "\n\031PUBLISHER_MODEL_VIEW_FULL\020\002\022&\n\"PUBLISH"
          + "ER_MODEL_VERSION_VIEW_BASIC\020\0032\214\002\n\022ModelG"
          + "ardenService\022\246\001\n\021GetPublisherModel\0224.goo"
          + "gle.cloud.aiplatform.v1.GetPublisherMode"
          + "lRequest\032*.google.cloud.aiplatform.v1.Pu"
          + "blisherModel\"/\332A\004name\202\323\344\223\002\"\022 /v1/{name=p"
          + "ublishers/*/models/*}\032M\312A\031aiplatform.goo"
          + "gleapis.com\322A.https://www.googleapis.com"
          + "/auth/cloud-platformB\325\001\n\036com.google.clou"
          + "d.aiplatform.v1B\027ModelGardenServiceProto"
          + "P\001Z>cloud.google.com/go/aiplatform/apiv1"
          + "/aiplatformpb;aiplatformpb\252\002\032Google.Clou"
          + "d.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatfor"
          + "m\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.PublisherModelProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetPublisherModelRequest_descriptor,
            new java.lang.String[] {
              "Name", "LanguageCode", "View", "IsHuggingFaceModel", "HuggingFaceToken",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.PublisherModelProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
