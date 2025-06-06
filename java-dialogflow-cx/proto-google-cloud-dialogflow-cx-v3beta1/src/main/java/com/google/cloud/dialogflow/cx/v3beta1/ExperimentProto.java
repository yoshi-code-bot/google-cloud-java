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
// source: google/cloud/dialogflow/cx/v3beta1/experiment.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3beta1;

public final class ExperimentProto {
  private ExperimentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Definition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Definition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_ConfidenceInterval_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_ConfidenceInterval_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_Metric_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_Metric_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_VersionMetrics_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_VersionMetrics_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_Variant_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_Variant_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_RolloutStep_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_RolloutStep_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutState_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutState_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_VariantsHistory_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_VariantsHistory_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListExperimentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListExperimentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListExperimentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_ListExperimentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_GetExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_CreateExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_StartExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_StartExperimentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_cx_v3beta1_StopExperimentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_cx_v3beta1_StopExperimentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "3google/cloud/dialogflow/cx/v3beta1/experiment.proto\022\"google.cloud.dialogflow.c"
          + "x.v3beta1\032\034google/api/annotations.proto\032"
          + "\027google/api/client.proto\032\037google/api/fie"
          + "ld_behavior.proto\032\031google/api/resource.p"
          + "roto\032\036google/protobuf/duration.proto\032\033google/protobuf/empty.proto\032"
          + " google/protobuf/field_mask.proto\032\037google/protobuf/timestamp.proto\"\267\021\n\n"
          + "Experiment\022\014\n"
          + "\004name\030\001 \001(\t\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022\023\n"
          + "\013description\030\003 \001(\t\022C\n"
          + "\005state\030\004 \001(\01624.google.cloud."
          + "dialogflow.cx.v3beta1.Experiment.State\022M\n\n"
          + "definition\030\005"
          + " \001(\01329.google.cloud.dialogflow.cx.v3beta1.Experiment.Definition\022I\n"
          + "\016rollout_config\030\016"
          + " \001(\01321.google.cloud.dialogflow.cx.v3beta1.RolloutConfig\022G\n\r"
          + "rollout_state\030\017"
          + " \001(\01320.google.cloud.dialogflow.cx.v3beta1.RolloutState\022\036\n"
          + "\026rollout_failure_reason\030\020 \001(\t\022E\n"
          + "\006result\030\006 \001(\01325.goog"
          + "le.cloud.dialogflow.cx.v3beta1.Experiment.Result\022/\n"
          + "\013create_time\030\007 \001(\0132\032.google.protobuf.Timestamp\022.\n\n"
          + "start_time\030\010 \001(\0132\032.google.protobuf.Timestamp\022,\n"
          + "\010end_time\030\t \001(\0132\032.google.protobuf.Timestamp\0224\n"
          + "\020last_update_time\030\n"
          + " \001(\0132\032.google.protobuf.Timestamp\0224\n"
          + "\021experiment_length\030\013 \001(\0132\031.google.protobuf.Duration\022M\n"
          + "\020variants_history\030\014"
          + " \003(\01323.google.cloud.dialogflow.cx.v3beta1.VariantsHistory\032|\n\n"
          + "Definition\022\021\n"
          + "\tcondition\030\001 \001(\t\022O\n"
          + "\020version_variants\030\002 \001(\01323."
          + "google.cloud.dialogflow.cx.v3beta1.VersionVariantsH\000B\n\n"
          + "\010variants\032\244\010\n"
          + "\006Result\022]\n"
          + "\017version_metrics\030\001 \003(\0132D.google.cloud.dial"
          + "ogflow.cx.v3beta1.Experiment.Result.VersionMetrics\0224\n"
          + "\020last_update_time\030\002 \001(\0132\032.google.protobuf.Timestamp\032g\n"
          + "\022ConfidenceInterval\022\030\n"
          + "\020confidence_level\030\001 \001(\001\022\r\n"
          + "\005ratio\030\002 \001(\001\022\023\n"
          + "\013lower_bound\030\003 \001(\001\022\023\n"
          + "\013upper_bound\030\004 \001(\001\032\277\002\n"
          + "\006Metric\022N\n"
          + "\004type\030\001 \001(\0162@.goo"
          + "gle.cloud.dialogflow.cx.v3beta1.Experiment.Result.MetricType\022S\n\n"
          + "count_type\030\005 \001(\016"
          + "2?.google.cloud.dialogflow.cx.v3beta1.Experiment.Result.CountType\022\017\n"
          + "\005ratio\030\002 \001(\001H\000\022\017\n"
          + "\005count\030\004 \001(\001H\000\022e\n"
          + "\023confidence_interval\030\003 \001(\0132H.google.cloud.dialogflow.cx.v3"
          + "beta1.Experiment.Result.ConfidenceIntervalB\007\n"
          + "\005value\032\257\001\n"
          + "\016VersionMetrics\0227\n"
          + "\007version\030\001 \001(\tB&\372A#\n"
          + "!dialogflow.googleapis.com/Version\022M\n"
          + "\007metrics\030\002 \003(\0132<.google.cloud."
          + "dialogflow.cx.v3beta1.Experiment.Result.Metric\022\025\n\r"
          + "session_count\030\003 \001(\005\"\266\001\n\n"
          + "MetricType\022\026\n"
          + "\022METRIC_UNSPECIFIED\020\000\022&\n"
          + "\"CONTAINED_SESSION_NO_CALLBACK_RATE\020\001\022\033\n"
          + "\027LIVE_AGENT_HANDOFF_RATE\020\002\022\031\n"
          + "\025CALLBACK_SESSION_RATE\020\003\022\032\n"
          + "\026ABANDONED_SESSION_RATE\020\004\022\024\n"
          + "\020SESSION_END_RATE\020\005\"o\n"
          + "\tCountType\022\032\n"
          + "\026COUNT_TYPE_UNSPECIFIED\020\000\022\030\n"
          + "\024TOTAL_NO_MATCH_COUNT\020\001\022\024\n"
          + "\020TOTAL_TURN_COUNT\020\002\022\026\n"
          + "\022AVERAGE_TURN_COUNT\020\003\"T\n"
          + "\005State\022\025\n"
          + "\021STATE_UNSPECIFIED\020\000\022\t\n"
          + "\005DRAFT\020\001\022\013\n"
          + "\007RUNNING\020\002\022\010\n"
          + "\004DONE\020\003\022\022\n"
          + "\016ROLLOUT_FAILED\020\004:\226\001\352A\222\001\n"
          + "$dialogflow.googleapis.com/Experiment\022jprojects/{project}/l"
          + "ocations/{location}/agents/{agent}/envir"
          + "onments/{environment}/experiments/{experiment}\"\262\001\n"
          + "\017VersionVariants\022M\n"
          + "\010variants\030\001"
          + " \003(\0132;.google.cloud.dialogflow.cx.v3beta1.VersionVariants.Variant\032P\n"
          + "\007Variant\022\017\n"
          + "\007version\030\001 \001(\t\022\032\n"
          + "\022traffic_allocation\030\002 \001(\002\022\030\n"
          + "\020is_control_group\030\003 \001(\010\"\212\002\n\r"
          + "RolloutConfig\022T\n\r"
          + "rollout_steps\030\001 \003(\0132=.google.cl"
          + "oud.dialogflow.cx.v3beta1.RolloutConfig.RolloutStep\022\031\n"
          + "\021rollout_condition\030\002 \001(\t\022\031\n"
          + "\021failure_condition\030\003 \001(\t\032m\n"
          + "\013RolloutStep\022\024\n"
          + "\014display_name\030\001 \001(\t\022\027\n"
          + "\017traffic_percent\030\002 \001(\005\022/\n"
          + "\014min_duration\030\003 \001(\0132\031.google.protobuf.Duration\"`\n"
          + "\014RolloutState\022\014\n"
          + "\004step\030\001 \001(\t\022\022\n\n"
          + "step_index\030\003 \001(\005\022.\n\n"
          + "start_time\030\002 \001(\0132\032.google.protobuf.Timestamp\"\237\001\n"
          + "\017VariantsHistory\022O\n"
          + "\020version_variants\030\001 \001(\013"
          + "23.google.cloud.dialogflow.cx.v3beta1.VersionVariantsH\000\022/\n"
          + "\013update_time\030\002 \001(\0132\032.google.protobuf.TimestampB\n\n"
          + "\010variants\"}\n"
          + "\026ListExperimentsRequest\022<\n"
          + "\006parent\030\001 \001(\tB,"
          + "\340A\002\372A&\022$dialogflow.googleapis.com/Experiment\022\021\n"
          + "\tpage_size\030\002 \001(\005\022\022\n\n"
          + "page_token\030\003 \001(\t\"w\n"
          + "\027ListExperimentsResponse\022C\n"
          + "\013experiments\030\001"
          + " \003(\0132..google.cloud.dialogflow.cx.v3beta1.Experiment\022\027\n"
          + "\017next_page_token\030\002 \001(\t\"R\n"
          + "\024GetExperimentRequest\022:\n"
          + "\004name\030\001 \001(\tB,\340A\002\372A&\n"
          + "$dialogflow.googleapis.com/Experiment\"\240\001\n"
          + "\027CreateExperimentRequest\022<\n"
          + "\006parent\030\001 \001("
          + "\tB,\340A\002\372A&\022$dialogflow.googleapis.com/Experiment\022G\n\n"
          + "experiment\030\002 \001(\0132."
          + ".google.cloud.dialogflow.cx.v3beta1.ExperimentB\003\340A\002\"\230\001\n"
          + "\027UpdateExperimentRequest\022G\n\n"
          + "experiment\030\001"
          + " \001(\0132..google.cloud.dialogflow.cx.v3beta1.ExperimentB\003\340A\002\0224\n"
          + "\013update_mask\030\002 \001(\0132\032.google.protobuf.FieldMaskB\003\340A\002\"U\n"
          + "\027DeleteExperimentRequest\022:\n"
          + "\004name\030\001 \001(\tB,\340A\002\372A&\n"
          + "$dialogflow.googleapis.com/Experiment\"T\n"
          + "\026StartExperimentRequest\022:\n"
          + "\004name\030\001 \001(\tB,\340A\002\372A&\n"
          + "$dialogflow.googleapis.com/Experiment\"S\n"
          + "\025StopExperimentRequest\022:\n"
          + "\004name\030\001 \001(\tB,\340A\002\372A&\n"
          + "$dialogflow.googleapis.com/Experiment2\335\r\n"
          + "\013Experiments\022\351\001\n"
          + "\017ListExperiments\022:.google.cloud.dialogflow.cx.v3beta1.ListExperimentsRequest"
          + "\032;.google.cloud.dialogflow.cx.v3beta1.Li"
          + "stExperimentsResponse\"]\332A\006parent\202\323\344\223\002N\022L"
          + "/v3beta1/{parent=projects/*/locations/*/agents/*/environments/*}/experiments\022\326\001\n"
          + "\r"
          + "GetExperiment\0228.google.cloud.dialogflow.cx.v3beta1.GetExperimentRequest\032..googl"
          + "e.cloud.dialogflow.cx.v3beta1.Experiment"
          + "\"[\332A\004name\202\323\344\223\002N\022L/v3beta1/{name=projects"
          + "/*/locations/*/agents/*/environments/*/experiments/*}\022\365\001\n"
          + "\020CreateExperiment\022;.google.cloud.dialogflow.cx.v3beta1.CreateEx"
          + "perimentRequest\032..google.cloud.dialogflo"
          + "w.cx.v3beta1.Experiment\"t\332A\021parent,exper"
          + "iment\202\323\344\223\002Z\"L/v3beta1/{parent=projects/*"
          + "/locations/*/agents/*/environments/*}/experiments:\n"
          + "experiment\022\206\002\n"
          + "\020UpdateExperiment\022;.google.cloud.dialogflow.cx.v3beta1."
          + "UpdateExperimentRequest\032..google.cloud.d"
          + "ialogflow.cx.v3beta1.Experiment\"\204\001\332A\026exp"
          + "eriment,update_mask\202\323\344\223\002e2W/v3beta1/{exp"
          + "eriment.name=projects/*/locations/*/agents/*/environments/*/experiments/*}:\n"
          + "experiment\022\304\001\n"
          + "\020DeleteExperiment\022;.google.cloud.dialogflow.cx.v3beta1.DeleteExperimen"
          + "tRequest\032\026.google.protobuf.Empty\"[\332A\004nam"
          + "e\202\323\344\223\002N*L/v3beta1/{name=projects/*/locat"
          + "ions/*/agents/*/environments/*/experiments/*}\022\343\001\n"
          + "\017StartExperiment\022:.google.cloud.dialogflow.cx.v3beta1.StartExperimentRe"
          + "quest\032..google.cloud.dialogflow.cx.v3bet"
          + "a1.Experiment\"d\332A\004name\202\323\344\223\002W\"R/v3beta1/{"
          + "name=projects/*/locations/*/agents/*/environments/*/experiments/*}:start:\001*\022\340\001\n"
          + "\016StopExperiment\0229.google.cloud.dialogflow"
          + ".cx.v3beta1.StopExperimentRequest\032..google.cloud.dialogflow.cx.v3beta1.Experimen"
          + "t\"c\332A\004name\202\323\344\223\002V\"Q/v3beta1/{name=project"
          + "s/*/locations/*/agents/*/environments/*/"
          + "experiments/*}:stop:\001*\032x\312A\031dialogflow.go"
          + "ogleapis.com\322AYhttps://www.googleapis.co"
          + "m/auth/cloud-platform,https://www.googleapis.com/auth/dialogflowB\306\001\n"
          + "&com.google.cloud.dialogflow.cx.v3beta1B\017ExperimentP"
          + "rotoP\001Z6cloud.google.com/go/dialogflow/c"
          + "x/apiv3beta1/cxpb;cxpb\242\002\002DF\252\002\"Google.Clo"
          + "ud.Dialogflow.Cx.V3Beta1\352\002&Google::Cloud::Dialogflow::CX::V3beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "State",
              "Definition",
              "RolloutConfig",
              "RolloutState",
              "RolloutFailureReason",
              "Result",
              "CreateTime",
              "StartTime",
              "EndTime",
              "LastUpdateTime",
              "ExperimentLength",
              "VariantsHistory",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Definition_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Definition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Definition_descriptor,
            new java.lang.String[] {
              "Condition", "VersionVariants", "Variants",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_descriptor,
            new java.lang.String[] {
              "VersionMetrics", "LastUpdateTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_ConfidenceInterval_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_ConfidenceInterval_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_ConfidenceInterval_descriptor,
            new java.lang.String[] {
              "ConfidenceLevel", "Ratio", "LowerBound", "UpperBound",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_Metric_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_Metric_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_Metric_descriptor,
            new java.lang.String[] {
              "Type", "CountType", "Ratio", "Count", "ConfidenceInterval", "Value",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_VersionMetrics_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_VersionMetrics_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_Experiment_Result_VersionMetrics_descriptor,
            new java.lang.String[] {
              "Version", "Metrics", "SessionCount",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_descriptor,
            new java.lang.String[] {
              "Variants",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_Variant_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_Variant_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_VersionVariants_Variant_descriptor,
            new java.lang.String[] {
              "Version", "TrafficAllocation", "IsControlGroup",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_descriptor,
            new java.lang.String[] {
              "RolloutSteps", "RolloutCondition", "FailureCondition",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_RolloutStep_descriptor =
        internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_RolloutStep_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutConfig_RolloutStep_descriptor,
            new java.lang.String[] {
              "DisplayName", "TrafficPercent", "MinDuration",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutState_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutState_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_RolloutState_descriptor,
            new java.lang.String[] {
              "Step", "StepIndex", "StartTime",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_VariantsHistory_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_cx_v3beta1_VariantsHistory_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_VariantsHistory_descriptor,
            new java.lang.String[] {
              "VersionVariants", "UpdateTime", "Variants",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListExperimentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListExperimentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListExperimentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListExperimentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_cx_v3beta1_ListExperimentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_ListExperimentsResponse_descriptor,
            new java.lang.String[] {
              "Experiments", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_cx_v3beta1_GetExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_GetExperimentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_cx_v3beta1_CreateExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_CreateExperimentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Experiment",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_UpdateExperimentRequest_descriptor,
            new java.lang.String[] {
              "Experiment", "UpdateMask",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_DeleteExperimentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_StartExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_dialogflow_cx_v3beta1_StartExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_StartExperimentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_dialogflow_cx_v3beta1_StopExperimentRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_dialogflow_cx_v3beta1_StopExperimentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_cx_v3beta1_StopExperimentRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
