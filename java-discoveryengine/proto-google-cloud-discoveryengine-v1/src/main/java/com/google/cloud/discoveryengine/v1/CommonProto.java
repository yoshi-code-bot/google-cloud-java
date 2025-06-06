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
// source: google/cloud/discoveryengine/v1/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public final class CommonProto {
  private CommonProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Interval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Interval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_CustomAttribute_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_CustomAttribute_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_UserInfo_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_UserInfo_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_DoubleList_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_DoubleList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Principal_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Principal_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_HealthcareFhirConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_HealthcareFhirConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_SearchLinkPromotion_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_SearchLinkPromotion_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ",google/cloud/discoveryengine/v1/common"
          + ".proto\022\037google.cloud.discoveryengine.v1\032"
          + "\037google/api/field_behavior.proto\032\031google/api/resource.proto\"x\n"
          + "\010Interval\022\021\n"
          + "\007minimum\030\001 \001(\001H\000\022\033\n"
          + "\021exclusive_minimum\030\002 \001(\001H\000\022\021\n"
          + "\007maximum\030\003 \001(\001H\001\022\033\n"
          + "\021exclusive_maximum\030\004 \001(\001H\001B\005\n"
          + "\003minB\005\n"
          + "\003max\"0\n"
          + "\017CustomAttribute\022\014\n"
          + "\004text\030\001 \003(\t\022\017\n"
          + "\007numbers\030\002 \003(\001\"G\n"
          + "\010UserInfo\022\017\n"
          + "\007user_id\030\001 \001(\t\022\022\n\n"
          + "user_agent\030\002 \001(\t\022\026\n"
          + "\ttime_zone\030\003 \001(\tB\003\340A\001\"\034\n\n"
          + "DoubleList\022\016\n"
          + "\006values\030\001 \003(\001\"]\n"
          + "\tPrincipal\022\021\n"
          + "\007user_id\030\001 \001(\tH\000\022\022\n"
          + "\010group_id\030\002 \001(\tH\000\022\034\n"
          + "\022external_entity_id\030\003 \001(\tH\000B\013\n"
          + "\tprincipal\"n\n"
          + "\024HealthcareFhirConfig\022\"\n"
          + "\032enable_configurable_schema\030\001 \001(\010\0222\n"
          + "*enable_static_indexing_for_batch_ingestion\030\002 \001(\010\"\306\001\n"
          + "\023SearchLinkPromotion\022\022\n"
          + "\005title\030\001 \001(\tB\003\340A\002\022\020\n"
          + "\003uri\030\002 \001(\tB\003\340A\001\022A\n"
          + "\010document\030\006 \001(\tB/\340A\001\372A)\n"
          + "\'discoveryengine.googleapis.com/Document\022\026\n"
          + "\timage_uri\030\003 \001(\tB\003\340A\001\022\030\n"
          + "\013description\030\004 \001(\tB\003\340A\001\022\024\n"
          + "\007enabled\030\005 \001(\010B\003\340A\001*b\n"
          + "\020IndustryVertical\022!\n"
          + "\035INDUSTRY_VERTICAL_UNSPECIFIED\020\000\022\013\n"
          + "\007GENERIC\020\001\022\t\n"
          + "\005MEDIA\020\002\022\023\n"
          + "\017HEALTHCARE_FHIR\020\007*\244\001\n"
          + "\014SolutionType\022\035\n"
          + "\031SOLUTION_TYPE_UNSPECIFIED\020\000\022 \n"
          + "\034SOLUTION_TYPE_RECOMMENDATION\020\001\022\030\n"
          + "\024SOLUTION_TYPE_SEARCH\020\002\022\026\n"
          + "\022SOLUTION_TYPE_CHAT\020\003\022!\n"
          + "\035SOLUTION_TYPE_GENERATIVE_CHAT\020\004*h\n\r"
          + "SearchUseCase\022\037\n"
          + "\033SEARCH_USE_CASE_UNSPECIFIED\020\000\022\032\n"
          + "\026SEARCH_USE_CASE_SEARCH\020\001\022\032\n"
          + "\026SEARCH_USE_CASE_BROWSE\020\002*_\n\n"
          + "SearchTier\022\033\n"
          + "\027SEARCH_TIER_UNSPECIFIED\020\000\022\030\n"
          + "\024SEARCH_TIER_STANDARD\020\001\022\032\n"
          + "\026SEARCH_TIER_ENTERPRISE\020\002*C\n"
          + "\013SearchAddOn\022\035\n"
          + "\031SEARCH_ADD_ON_UNSPECIFIED\020\000\022\025\n"
          + "\021SEARCH_ADD_ON_LLM\020\001B\332\r\n"
          + "#com.google.cloud.discoveryengine.v1B\013CommonProtoP\001ZMcloud.google.com/go/di"
          + "scoveryengine/apiv1/discoveryenginepb;di"
          + "scoveryenginepb\242\002\017DISCOVERYENGINE\252\002\037Goog"
          + "le.Cloud.DiscoveryEngine.V1\312\002\037Google\\Clo"
          + "ud\\DiscoveryEngine\\V1\352\002\"Google::Cloud::DiscoveryEngine::V1\352A\346\001\n"
          + "%discoveryengine.googleapis.com/Branch\022Qprojects/{project"
          + "}/locations/{location}/dataStores/{data_store}/branches/{branch}\022jprojects/{proj"
          + "ect}/locations/{location}/collections/{c"
          + "ollection}/dataStores/{data_store}/branches/{branch}\352Am\n"
          + ")discoveryengine.googleapis.com/Collection\022@projects/{project}/l"
          + "ocations/{location}/collections/{collection}\352AR\n"
          + "\'discoveryengine.googleapis.com/"
          + "Location\022\'projects/{project}/locations/{location}\352A}\n"
          + ".discoveryengine.googleapis.com/GroundingConfig\022Kprojects/{project}"
          + "/locations/{location}/groundingConfigs/{grounding_config}\352Aw\n"
          + ",discoveryengine.googleapis.com/RankingConfig\022Gprojects/{pr"
          + "oject}/locations/{location}/rankingConfigs/{ranking_config}\352Aw\n"
          + ",discoveryengine.googleapis.com/LicenseConfig\022Gprojects/{"
          + "project}/locations/{location}/licenseConfigs/{license_config}\352Ak\n"
          + "(discoveryengine.googleapis.com/UserStore\022?projects/{pr"
          + "oject}/locations/{location}/userStores/{user_store}\352Ay\n"
          + "#healthcare.googleapis.com/FhirStore\022Rprojects/{project}/location"
          + "s/{location}/datasets/{dataset}/fhirStores/{fhir_store}\352A\244\001\n"
          + "&healthcare.googleapis.com/FhirResource\022zprojects/{project}/"
          + "locations/{location}/datasets/{dataset}/"
          + "fhirStores/{fhir_store}/fhir/{resource_type}/{fhir_resource_id}\352Ay\n"
          + "\"cloudkms.googleapis.com/CryptoKeys\022Sprojects/{projec"
          + "t}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}\352A\247\001\n"
          + ")cloudkms.googleapis.com/CryptoKeyVersions\022zproj"
          + "ects/{project}/locations/{location}/keyRings/{key_ring}/cryptoKeys/{crypto_key}/"
          + "cryptoKeyVersions/{crypto_key_version}b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_Interval_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Interval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Interval_descriptor,
            new java.lang.String[] {
              "Minimum", "ExclusiveMinimum", "Maximum", "ExclusiveMaximum", "Min", "Max",
            });
    internal_static_google_cloud_discoveryengine_v1_CustomAttribute_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_CustomAttribute_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_CustomAttribute_descriptor,
            new java.lang.String[] {
              "Text", "Numbers",
            });
    internal_static_google_cloud_discoveryengine_v1_UserInfo_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_UserInfo_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_UserInfo_descriptor,
            new java.lang.String[] {
              "UserId", "UserAgent", "TimeZone",
            });
    internal_static_google_cloud_discoveryengine_v1_DoubleList_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_DoubleList_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_DoubleList_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_discoveryengine_v1_Principal_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1_Principal_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Principal_descriptor,
            new java.lang.String[] {
              "UserId", "GroupId", "ExternalEntityId", "Principal",
            });
    internal_static_google_cloud_discoveryengine_v1_HealthcareFhirConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1_HealthcareFhirConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_HealthcareFhirConfig_descriptor,
            new java.lang.String[] {
              "EnableConfigurableSchema", "EnableStaticIndexingForBatchIngestion",
            });
    internal_static_google_cloud_discoveryengine_v1_SearchLinkPromotion_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1_SearchLinkPromotion_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_SearchLinkPromotion_descriptor,
            new java.lang.String[] {
              "Title", "Uri", "Document", "ImageUri", "Description", "Enabled",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceDefinition);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
