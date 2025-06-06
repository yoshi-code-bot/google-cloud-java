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
// source: google/cloud/retail/v2/generative_question_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2;

public final class GenerativeQuestionServiceProto {
  private GenerativeQuestionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UpdateGenerativeQuestionsFeatureConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UpdateGenerativeQuestionsFeatureConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_GetGenerativeQuestionsFeatureConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_GetGenerativeQuestionsFeatureConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ListGenerativeQuestionConfigsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ListGenerativeQuestionConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_ListGenerativeQuestionConfigsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_ListGenerativeQuestionConfigsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_UpdateGenerativeQuestionConfigRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_UpdateGenerativeQuestionConfigRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_BatchUpdateGenerativeQuestionConfigsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_BatchUpdateGenerativeQuestionConfigsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2_BatchUpdateGenerativeQuestionConfigsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2_BatchUpdateGenerativeQuestionConfigsResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/retail/v2/generative_ques"
          + "tion_service.proto\022\026google.cloud.retail."
          + "v2\032\034google/api/annotations.proto\032\027google"
          + "/api/client.proto\032\037google/api/field_beha"
          + "vior.proto\032\031google/api/resource.proto\0320g"
          + "oogle/cloud/retail/v2/generative_questio"
          + "n.proto\032 google/protobuf/field_mask.prot"
          + "o\"\321\001\n-UpdateGenerativeQuestionsFeatureCo"
          + "nfigRequest\022j\n#generative_questions_feat"
          + "ure_config\030\002 \001(\01328.google.cloud.retail.v"
          + "2.GenerativeQuestionsFeatureConfigB\003\340A\002\022"
          + "4\n\013update_mask\030\004 \001(\0132\032.google.protobuf.F"
          + "ieldMaskB\003\340A\001\"d\n*GetGenerativeQuestionsF"
          + "eatureConfigRequest\0226\n\007catalog\030\001 \001(\tB%\340A"
          + "\002\372A\037\n\035retail.googleapis.com/Catalog\"]\n$L"
          + "istGenerativeQuestionConfigsRequest\0225\n\006p"
          + "arent\030\001 \001(\tB%\340A\002\372A\037\n\035retail.googleapis.c"
          + "om/Catalog\"~\n%ListGenerativeQuestionConf"
          + "igsResponse\022U\n\033generative_question_confi"
          + "gs\030\001 \003(\01320.google.cloud.retail.v2.Genera"
          + "tiveQuestionConfig\"\270\001\n%UpdateGenerativeQ"
          + "uestionConfigRequest\022Y\n\032generative_quest"
          + "ion_config\030\003 \001(\01320.google.cloud.retail.v"
          + "2.GenerativeQuestionConfigB\003\340A\002\0224\n\013updat"
          + "e_mask\030\004 \001(\0132\032.google.protobuf.FieldMask"
          + "B\003\340A\001\"\272\001\n+BatchUpdateGenerativeQuestionC"
          + "onfigsRequest\0225\n\006parent\030\001 \001(\tB%\340A\001\372A\037\n\035r"
          + "etail.googleapis.com/Catalog\022T\n\010requests"
          + "\030\002 \003(\0132=.google.cloud.retail.v2.UpdateGe"
          + "nerativeQuestionConfigRequestB\003\340A\002\"\212\001\n,B"
          + "atchUpdateGenerativeQuestionConfigsRespo"
          + "nse\022Z\n\033generative_question_configs\030\001 \003(\013"
          + "20.google.cloud.retail.v2.GenerativeQues"
          + "tionConfigB\003\340A\0012\272\014\n\031GenerativeQuestionSe"
          + "rvice\022\371\002\n&UpdateGenerativeQuestionsFeatu"
          + "reConfig\022E.google.cloud.retail.v2.Update"
          + "GenerativeQuestionsFeatureConfigRequest\032"
          + "8.google.cloud.retail.v2.GenerativeQuest"
          + "ionsFeatureConfig\"\315\001\332A/generative_questi"
          + "ons_feature_config,update_mask\202\323\344\223\002\224\0012m/"
          + "v2/{generative_questions_feature_config."
          + "catalog=projects/*/locations/*/catalogs/"
          + "*}/generativeQuestionFeature:#generative"
          + "_questions_feature_config\022\200\002\n#GetGenerat"
          + "iveQuestionsFeatureConfig\022B.google.cloud"
          + ".retail.v2.GetGenerativeQuestionsFeature"
          + "ConfigRequest\0328.google.cloud.retail.v2.G"
          + "enerativeQuestionsFeatureConfig\"[\332A\007cata"
          + "log\202\323\344\223\002K\022I/v2/{catalog=projects/*/locat"
          + "ions/*/catalogs/*}/generativeQuestionFea"
          + "ture\022\361\001\n\035ListGenerativeQuestionConfigs\022<"
          + ".google.cloud.retail.v2.ListGenerativeQu"
          + "estionConfigsRequest\032=.google.cloud.reta"
          + "il.v2.ListGenerativeQuestionConfigsRespo"
          + "nse\"S\332A\006parent\202\323\344\223\002D\022B/v2/{parent=projec"
          + "ts/*/locations/*/catalogs/*}/generativeQ"
          + "uestions\022\276\002\n\036UpdateGenerativeQuestionCon"
          + "fig\022=.google.cloud.retail.v2.UpdateGener"
          + "ativeQuestionConfigRequest\0320.google.clou"
          + "d.retail.v2.GenerativeQuestionConfig\"\252\001\332"
          + "A&generative_question_config,update_mask"
          + "\202\323\344\223\002{2]/v2/{generative_question_config."
          + "catalog=projects/*/locations/*/catalogs/"
          + "*}/generativeQuestion:\032generative_questi"
          + "on_config\022\235\002\n$BatchUpdateGenerativeQuest"
          + "ionConfigs\022C.google.cloud.retail.v2.Batc"
          + "hUpdateGenerativeQuestionConfigsRequest\032"
          + "D.google.cloud.retail.v2.BatchUpdateGene"
          + "rativeQuestionConfigsResponse\"j\332A\017parent"
          + ",requests\202\323\344\223\002R\"M/v2/{parent=projects/*/"
          + "locations/*/catalogs/*}/generativeQuesti"
          + "on:batchUpdate:\001*\032I\312A\025retail.googleapis."
          + "com\322A.https://www.googleapis.com/auth/cl"
          + "oud-platformB\311\001\n\032com.google.cloud.retail"
          + ".v2B\036GenerativeQuestionServiceProtoP\001Z2c"
          + "loud.google.com/go/retail/apiv2/retailpb"
          + ";retailpb\242\002\006RETAIL\252\002\026Google.Cloud.Retail"
          + ".V2\312\002\026Google\\Cloud\\Retail\\V2\352\002\031Google::C"
          + "loud::Retail::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2.GenerativeQuestionProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2_UpdateGenerativeQuestionsFeatureConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2_UpdateGenerativeQuestionsFeatureConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UpdateGenerativeQuestionsFeatureConfigRequest_descriptor,
            new java.lang.String[] {
              "GenerativeQuestionsFeatureConfig", "UpdateMask",
            });
    internal_static_google_cloud_retail_v2_GetGenerativeQuestionsFeatureConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2_GetGenerativeQuestionsFeatureConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_GetGenerativeQuestionsFeatureConfigRequest_descriptor,
            new java.lang.String[] {
              "Catalog",
            });
    internal_static_google_cloud_retail_v2_ListGenerativeQuestionConfigsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2_ListGenerativeQuestionConfigsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ListGenerativeQuestionConfigsRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_retail_v2_ListGenerativeQuestionConfigsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2_ListGenerativeQuestionConfigsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_ListGenerativeQuestionConfigsResponse_descriptor,
            new java.lang.String[] {
              "GenerativeQuestionConfigs",
            });
    internal_static_google_cloud_retail_v2_UpdateGenerativeQuestionConfigRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2_UpdateGenerativeQuestionConfigRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_UpdateGenerativeQuestionConfigRequest_descriptor,
            new java.lang.String[] {
              "GenerativeQuestionConfig", "UpdateMask",
            });
    internal_static_google_cloud_retail_v2_BatchUpdateGenerativeQuestionConfigsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2_BatchUpdateGenerativeQuestionConfigsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_BatchUpdateGenerativeQuestionConfigsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Requests",
            });
    internal_static_google_cloud_retail_v2_BatchUpdateGenerativeQuestionConfigsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2_BatchUpdateGenerativeQuestionConfigsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2_BatchUpdateGenerativeQuestionConfigsResponse_descriptor,
            new java.lang.String[] {
              "GenerativeQuestionConfigs",
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
    com.google.cloud.retail.v2.GenerativeQuestionProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
