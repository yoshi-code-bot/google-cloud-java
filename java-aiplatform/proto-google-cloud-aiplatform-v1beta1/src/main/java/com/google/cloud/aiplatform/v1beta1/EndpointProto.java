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
// source: google/cloud/aiplatform/v1beta1/endpoint.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.aiplatform.v1beta1;

public final class EndpointProto {
  private EndpointProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_Status_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_Status_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_SystemLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_SystemLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PredictRequestResponseLoggingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PredictRequestResponseLoggingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModelConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_PublisherModelConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ClientConnectionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ClientConnectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_FasterDeploymentConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_FasterDeploymentConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_RolloutOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_RolloutOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_RagConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_RagConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_DraftModelSpeculation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_DraftModelSpeculation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_NgramSpeculation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_NgramSpeculation_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + ".google/cloud/aiplatform/v1beta1/endpoint.proto\022\037google.cloud.aiplatform.v1beta"
          + "1\032\037google/api/field_behavior.proto\032\031goog"
          + "le/api/resource.proto\0325google/cloud/aiplatform/v1beta1/encryption_spec.proto\0321go"
          + "ogle/cloud/aiplatform/v1beta1/explanation.proto\032(google/cloud/aiplatform/v1beta1"
          + "/io.proto\0327google/cloud/aiplatform/v1beta1/machine_resources.proto\0328google/cloud"
          + "/aiplatform/v1beta1/service_networking.p"
          + "roto\032\036google/protobuf/duration.proto\032\037google/protobuf/timestamp.proto\"\216\014\n"
          + "\010Endpoint\022\021\n"
          + "\004name\030\001 \001(\tB\003\340A\003\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022\023\n"
          + "\013description\030\003 \001(\t\022L\n"
          + "\017deployed_models\030\004"
          + " \003(\0132..google.cloud.aiplatform.v1beta1.DeployedModelB\003\340A\003\022R\n\r"
          + "traffic_split\030\005"
          + " \003(\0132;.google.cloud.aiplatform.v1beta1.Endpoint.TrafficSplitEntry\022\014\n"
          + "\004etag\030\006 \001(\t\022E\n"
          + "\006labels\030\007"
          + " \003(\01325.google.cloud.aiplatform.v1beta1.Endpoint.LabelsEntry\0224\n"
          + "\013create_time\030\010 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\0224\n"
          + "\013update_time\030\t \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022H\n"
          + "\017encryption_spec\030\n"
          + " \001(\0132/.google.cloud.aiplatform.v1beta1.EncryptionSpec\0227\n"
          + "\007network\030\r"
          + " \001(\tB&\340A\001\372A \n"
          + "\036compute.googleapis.com/Network\022*\n"
          + "\036enable_private_service_connect\030\021 \001(\010B\002\030\001\022i\n"
          + "\036private_service_connect_config\030\025 \001(\0132"
          + "<.google.cloud.aiplatform.v1beta1.PrivateServiceConnectConfigB\003\340A\001\022g\n"
          + "\037model_deployment_monitoring_job\030\016 \001(\tB>\340A\003\372A8\n"
          + "6aiplatform.googleapis.com/ModelDeploymentMonitoringJob\022u\n"
          + "\'predict_request_response_logging_config\030\022 \001(\0132D.google.cloud.aipl"
          + "atform.v1beta1.PredictRequestResponseLoggingConfig\022\"\n"
          + "\032dedicated_endpoint_enabled\030\030 \001(\010\022#\n"
          + "\026dedicated_endpoint_dns\030\031 \001(\tB\003\340A\003\022Y\n"
          + "\030client_connection_config\030\027 \001(\01327."
          + "google.cloud.aiplatform.v1beta1.ClientConnectionConfig\022\032\n\r"
          + "satisfies_pzs\030\033 \001(\010B\003\340A\003\022\032\n\r"
          + "satisfies_pzi\030\034 \001(\010B\003\340A\003\022j\n"
          + "\037gen_ai_advanced_features_config\030\035 \001(\0132<.google"
          + ".cloud.aiplatform.v1beta1.GenAiAdvancedFeaturesConfigB\003\340A\001\0323\n"
          + "\021TrafficSplitEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\005:\0028\001\032-\n"
          + "\013LabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001:\265\001\352A\261\001\n"
          + "\"aiplatform.googleapis.com/Endpoint\022<projects/{project}/locations/{locatio"
          + "n}/endpoints/{endpoint}\022Mprojects/{proje"
          + "ct}/locations/{location}/publishers/{publisher}/models/{model}\"\343\n\n\r"
          + "DeployedModel\022R\n"
          + "\023dedicated_resources\030\007 \001(\01323.google.c"
          + "loud.aiplatform.v1beta1.DedicatedResourcesH\000\022R\n"
          + "\023automatic_resources\030\010 \001(\01323.goog"
          + "le.cloud.aiplatform.v1beta1.AutomaticResourcesH\000\022Q\n"
          + "\020shared_resources\030\021 \001(\tB5\372A2\n"
          + "0aiplatform.googleapis.com/DeploymentResourcePoolH\000\022\017\n"
          + "\002id\030\001 \001(\tB\003\340A\005\0223\n"
          + "\005model\030\002 \001(\tB$\372A!\n"
          + "\037aiplatform.googleapis.com/Model\022\035\n"
          + "\020model_version_id\030\022 \001(\tB\003\340A\003\022\024\n"
          + "\014display_name\030\003 \001(\t\0224\n"
          + "\013create_time\030\006 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022J\n"
          + "\020explanation_spec\030\t"
          + " \001(\01320.google.cloud.aiplatform.v1beta1.ExplanationSpec\022\034\n"
          + "\024disable_explanations\030\023 \001(\010\022\027\n"
          + "\017service_account\030\013 \001(\t\022 \n"
          + "\030enable_container_logging\030\014 \001(\010\022\035\n"
          + "\025enable_access_logging\030\r"
          + " \001(\010\022Q\n"
          + "\021private_endpoints\030\016"
          + " \001(\01321.google.cloud.aiplatform.v1beta1.PrivateEndpointsB\003\340A\003\022Y\n"
          + "\030faster_deployment_config\030\027 \001(\01327.google.cloud.aip"
          + "latform.v1beta1.FasterDeploymentConfig\022H\n"
          + "\017rollout_options\030\031"
          + " \001(\0132/.google.cloud.aiplatform.v1beta1.RolloutOptions\022J\n"
          + "\006status\030\032"
          + " \001(\01325.google.cloud.aiplatform.v1beta1.DeployedModel.StatusB\003\340A\003\022W\n\r"
          + "system_labels\030\034"
          + " \003(\0132@.google.cloud.aiplatform.v1beta1.DeployedModel.SystemLabelsEntry\022\025\n"
          + "\r"
          + "checkpoint_id\030\035 \001(\t\022`\n"
          + "\031speculative_decoding_spec\030\036 \001(\01328.google.cloud.aiplatfor"
          + "m.v1beta1.SpeculativeDecodingSpecB\003\340A\001\032\177\n"
          + "\006Status\022\024\n"
          + "\007message\030\001 \001(\tB\003\340A\003\0229\n"
          + "\020last_update_time\030\002"
          + " \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022$\n"
          + "\027available_replica_count\030\003 \001(\005B\003\340A\003\0323\n"
          + "\021SystemLabelsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001B\026\n"
          + "\024prediction_resources\"\217\001\n"
          + "\020PrivateEndpoints\022\035\n"
          + "\020predict_http_uri\030\001 \001(\tB\003\340A\003\022\035\n"
          + "\020explain_http_uri\030\002 \001(\tB\003\340A\003\022\034\n"
          + "\017health_http_uri\030\003 \001(\tB\003\340A\003\022\037\n"
          + "\022service_attachment\030\004 \001(\tB\003\340A\003\"\364\001\n"
          + "#PredictRequestResponseLoggingConfig\022\017\n"
          + "\007enabled\030\001 \001(\010\022\025\n\r"
          + "sampling_rate\030\002 \001(\001\022R\n"
          + "\024bigquery_destination\030\003"
          + " \001(\01324.google.cloud.aiplatform.v1beta1.BigQueryDestination\0224\n"
          + "\'request_response_logging_schema_version\030\004 \001(\tB\003\340A\003\022\033\n"
          + "\023enable_otel_logging\030\006 \001(\010\"t\n"
          + "\024PublisherModelConfig\022\\\n"
          + "\016logging_config\030\003"
          + " \001(\0132D.google.cloud.aiplatform.v1beta1.PredictRequestResponseLoggingConfig\"N\n"
          + "\026ClientConnectionConfig\0224\n"
          + "\021inference_timeout\030\001 \001(\0132\031.google.protobuf.Duration\"5\n"
          + "\026FasterDeploymentConfig\022\033\n"
          + "\023fast_tryout_enabled\030\002 \001(\010\"\367\001\n"
          + "\016RolloutOptions\022\"\n"
          + "\030max_unavailable_replicas\030\003 \001(\005H\000\022$\n"
          + "\032max_unavailable_percentage\030\004 \001(\005H\000\022\034\n"
          + "\022max_surge_replicas\030\005 \001(\005H\001\022\036\n"
          + "\024max_surge_percentage\030\006 \001(\005H\001\022\037\n"
          + "\027previous_deployed_model\030\001 \001(\t\022\034\n"
          + "\017revision_number\030\002 \001(\005B\003\340A\003B\021\n"
          + "\017max_unavailableB\013\n"
          + "\tmax_surge\"\232\001\n"
          + "\033GenAiAdvancedFeaturesConfig\022Z\n\n"
          + "rag_config\030\001 \001(\0132F.googl"
          + "e.cloud.aiplatform.v1beta1.GenAiAdvancedFeaturesConfig.RagConfig\032\037\n"
          + "\tRagConfig\022\022\n"
          + "\n"
          + "enable_rag\030\001 \001(\010\"\243\003\n"
          + "\027SpeculativeDecodingSpec\022q\n"
          + "\027draft_model_speculation\030\002 \001(\0132N"
          + ".google.cloud.aiplatform.v1beta1.Specula"
          + "tiveDecodingSpec.DraftModelSpeculationH\000\022f\n"
          + "\021ngram_speculation\030\003 \001(\0132I.google.clo"
          + "ud.aiplatform.v1beta1.SpeculativeDecodingSpec.NgramSpeculationH\000\022\037\n"
          + "\027speculative_token_count\030\001 \001(\005\032U\n"
          + "\025DraftModelSpeculation\022<\n"
          + "\013draft_model\030\001 \001(\tB\'\340A\002\372A!\n"
          + "\037aiplatform.googleapis.com/Model\032&\n"
          + "\020NgramSpeculation\022\022\n\n"
          + "ngram_size\030\001 \001(\005B\r\n"
          + "\013speculationB\344\001\n"
          + "#com.google.cloud.aiplatform.v1beta1B\r"
          + "EndpointProtoP\001ZCcloud.google.com/go/aiplatform/apiv1beta1/aiplatformpb;aiplatf"
          + "ormpb\252\002\037Google.Cloud.AIPlatform.V1Beta1\312"
          + "\002\037Google\\Cloud\\AIPlatform\\V1beta1\352\002\"Goog"
          + "le::Cloud::AIPlatform::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor(),
              com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "DeployedModels",
              "TrafficSplit",
              "Etag",
              "Labels",
              "CreateTime",
              "UpdateTime",
              "EncryptionSpec",
              "Network",
              "EnablePrivateServiceConnect",
              "PrivateServiceConnectConfig",
              "ModelDeploymentMonitoringJob",
              "PredictRequestResponseLoggingConfig",
              "DedicatedEndpointEnabled",
              "DedicatedEndpointDns",
              "ClientConnectionConfig",
              "SatisfiesPzs",
              "SatisfiesPzi",
              "GenAiAdvancedFeaturesConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Endpoint_TrafficSplitEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Endpoint_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Endpoint_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor,
            new java.lang.String[] {
              "DedicatedResources",
              "AutomaticResources",
              "SharedResources",
              "Id",
              "Model",
              "ModelVersionId",
              "DisplayName",
              "CreateTime",
              "ExplanationSpec",
              "DisableExplanations",
              "ServiceAccount",
              "EnableContainerLogging",
              "EnableAccessLogging",
              "PrivateEndpoints",
              "FasterDeploymentConfig",
              "RolloutOptions",
              "Status",
              "SystemLabels",
              "CheckpointId",
              "SpeculativeDecodingSpec",
              "PredictionResources",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_Status_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_Status_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_Status_descriptor,
            new java.lang.String[] {
              "Message", "LastUpdateTime", "AvailableReplicaCount",
            });
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_SystemLabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_SystemLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_DeployedModel_SystemLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PrivateEndpoints_descriptor,
            new java.lang.String[] {
              "PredictHttpUri", "ExplainHttpUri", "HealthHttpUri", "ServiceAttachment",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequestResponseLoggingConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1beta1_PredictRequestResponseLoggingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PredictRequestResponseLoggingConfig_descriptor,
            new java.lang.String[] {
              "Enabled",
              "SamplingRate",
              "BigqueryDestination",
              "RequestResponseLoggingSchemaVersion",
              "EnableOtelLogging",
            });
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModelConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1beta1_PublisherModelConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_PublisherModelConfig_descriptor,
            new java.lang.String[] {
              "LoggingConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ClientConnectionConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1beta1_ClientConnectionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ClientConnectionConfig_descriptor,
            new java.lang.String[] {
              "InferenceTimeout",
            });
    internal_static_google_cloud_aiplatform_v1beta1_FasterDeploymentConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1beta1_FasterDeploymentConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_FasterDeploymentConfig_descriptor,
            new java.lang.String[] {
              "FastTryoutEnabled",
            });
    internal_static_google_cloud_aiplatform_v1beta1_RolloutOptions_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1beta1_RolloutOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_RolloutOptions_descriptor,
            new java.lang.String[] {
              "MaxUnavailableReplicas",
              "MaxUnavailablePercentage",
              "MaxSurgeReplicas",
              "MaxSurgePercentage",
              "PreviousDeployedModel",
              "RevisionNumber",
              "MaxUnavailable",
              "MaxSurge",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_descriptor,
            new java.lang.String[] {
              "RagConfig",
            });
    internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_RagConfig_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_RagConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_GenAiAdvancedFeaturesConfig_RagConfig_descriptor,
            new java.lang.String[] {
              "EnableRag",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_descriptor,
            new java.lang.String[] {
              "DraftModelSpeculation", "NgramSpeculation", "SpeculativeTokenCount", "Speculation",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_DraftModelSpeculation_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_DraftModelSpeculation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_DraftModelSpeculation_descriptor,
            new java.lang.String[] {
              "DraftModel",
            });
    internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_NgramSpeculation_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_NgramSpeculation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_SpeculativeDecodingSpec_NgramSpeculation_descriptor,
            new java.lang.String[] {
              "NgramSize",
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
    com.google.cloud.aiplatform.v1beta1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ExplanationProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.MachineResourcesProto.getDescriptor();
    com.google.cloud.aiplatform.v1beta1.ServiceNetworkingProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
