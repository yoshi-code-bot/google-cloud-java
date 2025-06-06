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
// source: google/cloud/discoveryengine/v1/control.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public final class ControlProto {
  private ControlProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Condition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Condition_QueryTerm_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Condition_QueryTerm_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Condition_TimeRange_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Condition_TimeRange_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_ControlPoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_ControlPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_FilterAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_FilterAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_RedirectAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_RedirectAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_SynonymsAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_SynonymsAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1_Control_PromoteAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1_Control_PromoteAction_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "-google/cloud/discoveryengine/v1/control.proto\022\037google.cloud.discoveryengine.v1"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032,google/cloud/disco"
          + "veryengine/v1/common.proto\032\037google/protobuf/timestamp.proto\"\334\002\n"
          + "\tCondition\022I\n"
          + "\013query_terms\030\002"
          + " \003(\01324.google.cloud.discoveryengine.v1.Condition.QueryTerm\022O\n"
          + "\021active_time_range\030\003"
          + " \003(\01324.google.cloud.discoveryengine.v1.Condition.TimeRange\022\030\n"
          + "\013query_regex\030\004 \001(\tB\003\340A\001\032.\n"
          + "\tQueryTerm\022\r\n"
          + "\005value\030\001 \001(\t\022\022\n\n"
          + "full_match\030\002 \001(\010\032i\n"
          + "\tTimeRange\022.\n\n"
          + "start_time\030\001 \001(\0132\032.google.protobuf.Timestamp\022,\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.Timestamp\"\270\022\n"
          + "\007Control\022L\n"
          + "\014boost_action\030\006"
          + " \001(\01324.google.cloud.discoveryengine.v1.Control.BoostActionH\000\022N\n\r"
          + "filter_action\030\007 "
          + "\001(\01325.google.cloud.discoveryengine.v1.Control.FilterActionH\000\022R\n"
          + "\017redirect_action\030\t"
          + " \001(\01327.google.cloud.discoveryengine.v1.Control.RedirectActionH\000\022R\n"
          + "\017synonyms_action\030\n"
          + " \001(\01327.google.cloud.discoveryengine.v1.Control.SynonymsActionH\000\022P\n"
          + "\016promote_action\030\017"
          + " \001(\01326.google.cloud.discoveryengine.v1.Control.PromoteActionH\000\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\005\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022*\n"
          + "\035associated_serving_config_ids\030\003 \003(\tB\003\340A\003\022L\n\r"
          + "solution_type\030\004 \001(\0162-.google.cloud.d"
          + "iscoveryengine.v1.SolutionTypeB\006\340A\002\340A\005\022A\n"
          + "\tuse_cases\030\010 \003(\0162..google.cloud.discoveryengine.v1.SearchUseCase\022>\n\n"
          + "conditions\030\005 \003(\0132*.google.cloud.discoveryengine.v1.Condition\032\233\007\n"
          + "\013BoostAction\022\032\n"
          + "\013fixed_boost\030\004 \001(\002B\003\340A\001H\000\022t\n"
          + "\030interpolation_boost_spec\030\005 \001(\0132K.google.cloud.discoveryengine.v"
          + "1.Control.BoostAction.InterpolationBoostSpecB\003\340A\001H\000\022\021\n"
          + "\005boost\030\001 \001(\002B\002\030\001\022\023\n"
          + "\006filter\030\002 \001(\tB\003\340A\002\022D\n\n"
          + "data_store\030\003 \001(\tB0\340A\002\372A*\n"
          + "(discoveryengine.googleapis.com/DataStore\032\375\004\n"
          + "\026InterpolationBoostSpec\022\027\n\n"
          + "field_name\030\001 \001(\tB\003\340A\001\022v\n"
          + "\016attribute_type\030\002 \001(\0162Y.google.cloud.discoveryengine.v1.Control."
          + "BoostAction.InterpolationBoostSpec.AttributeTypeB\003\340A\001\022~\n"
          + "\022interpolation_type\030\003 \001(\0162].google.cloud.discoveryengine.v1.Cont"
          + "rol.BoostAction.InterpolationBoostSpec.InterpolationTypeB\003\340A\001\022u\n"
          + "\016control_points\030\004 \003(\0132X.google.cloud.discoveryengine.v1."
          + "Control.BoostAction.InterpolationBoostSpec.ControlPointB\003\340A\001\032G\n"
          + "\014ControlPoint\022\034\n"
          + "\017attribute_value\030\001 \001(\tB\003\340A\001\022\031\n"
          + "\014boost_amount\030\002 \001(\002B\003\340A\001\"M\n\r"
          + "AttributeType\022\036\n"
          + "\032ATTRIBUTE_TYPE_UNSPECIFIED\020\000\022\r\n"
          + "\tNUMERICAL\020\001\022\r\n"
          + "\tFRESHNESS\020\002\"C\n"
          + "\021InterpolationType\022\"\n"
          + "\036INTERPOLATION_TYPE_UNSPECIFIED\020\000\022\n\n"
          + "\006LINEAR\020\001B\014\n\n"
          + "boost_spec\032i\n"
          + "\014FilterAction\022\023\n"
          + "\006filter\030\001 \001(\tB\003\340A\002\022D\n\n"
          + "data_store\030\002 \001(\tB0\340A\002\372A*\n"
          + "(discoveryengine.googleapis.com/DataStore\032+\n"
          + "\016RedirectAction\022\031\n"
          + "\014redirect_uri\030\001 \001(\tB\003\340A\002\032\"\n"
          + "\016SynonymsAction\022\020\n"
          + "\010synonyms\030\001 \003(\t\032\257\001\n\r"
          + "PromoteAction\022D\n\n"
          + "data_store\030\001 \001(\tB0\340A\002\372A*\n"
          + "(discoveryengine.googleapis.com/DataStore\022X\n"
          + "\025search_link_promotion\030\002 \001"
          + "(\01324.google.cloud.discoveryengine.v1.SearchLinkPromotionB\003\340A\002:\323\002\352A\317\002\n"
          + "&discoveryengine.googleapis.com/Control\022Rprojects/{"
          + "project}/locations/{location}/dataStores/{data_store}/controls/{control}\022kprojec"
          + "ts/{project}/locations/{location}/collections/{collection}/dataStores/{data_stor"
          + "e}/controls/{control}\022dprojects/{project}/locations/{location}/collections/{coll"
          + "ection}/engines/{engine}/controls/{control}B\010\n"
          + "\006actionB\377\001\n"
          + "#com.google.cloud.discoveryengine.v1B\014ControlProtoP\001ZMcloud.goo"
          + "gle.com/go/discoveryengine/apiv1/discove"
          + "ryenginepb;discoveryenginepb\242\002\017DISCOVERY"
          + "ENGINE\252\002\037Google.Cloud.DiscoveryEngine.V1"
          + "\312\002\037Google\\Cloud\\DiscoveryEngine\\V1\352\002\"Goo"
          + "gle::Cloud::DiscoveryEngine::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1.CommonProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1_Condition_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Condition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Condition_descriptor,
            new java.lang.String[] {
              "QueryTerms", "ActiveTimeRange", "QueryRegex",
            });
    internal_static_google_cloud_discoveryengine_v1_Condition_QueryTerm_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Condition_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Condition_QueryTerm_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Condition_QueryTerm_descriptor,
            new java.lang.String[] {
              "Value", "FullMatch",
            });
    internal_static_google_cloud_discoveryengine_v1_Condition_TimeRange_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Condition_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1_Condition_TimeRange_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Condition_TimeRange_descriptor,
            new java.lang.String[] {
              "StartTime", "EndTime",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_Control_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_descriptor,
            new java.lang.String[] {
              "BoostAction",
              "FilterAction",
              "RedirectAction",
              "SynonymsAction",
              "PromoteAction",
              "Name",
              "DisplayName",
              "AssociatedServingConfigIds",
              "SolutionType",
              "UseCases",
              "Conditions",
              "Action",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_descriptor,
            new java.lang.String[] {
              "FixedBoost", "InterpolationBoostSpec", "Boost", "Filter", "DataStore", "BoostSpec",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_descriptor,
            new java.lang.String[] {
              "FieldName", "AttributeType", "InterpolationType", "ControlPoints",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_ControlPoint_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_ControlPoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_BoostAction_InterpolationBoostSpec_ControlPoint_descriptor,
            new java.lang.String[] {
              "AttributeValue", "BoostAmount",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_FilterAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1_Control_FilterAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_FilterAction_descriptor,
            new java.lang.String[] {
              "Filter", "DataStore",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_RedirectAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1_Control_RedirectAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_RedirectAction_descriptor,
            new java.lang.String[] {
              "RedirectUri",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_SynonymsAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1_Control_SynonymsAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_SynonymsAction_descriptor,
            new java.lang.String[] {
              "Synonyms",
            });
    internal_static_google_cloud_discoveryengine_v1_Control_PromoteAction_descriptor =
        internal_static_google_cloud_discoveryengine_v1_Control_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1_Control_PromoteAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1_Control_PromoteAction_descriptor,
            new java.lang.String[] {
              "DataStore", "SearchLinkPromotion",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1.CommonProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
