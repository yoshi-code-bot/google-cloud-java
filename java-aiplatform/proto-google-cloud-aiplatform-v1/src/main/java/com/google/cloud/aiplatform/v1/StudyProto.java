/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1/study.proto

package com.google.cloud.aiplatform.v1;

public final class StudyProto {
  private StudyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Study_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Study_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Trial_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Trial_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Trial_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Trial_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Trial_WebAccessUrisEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Trial_WebAccessUrisEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_MetricSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_MetricSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_DoubleValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_DoubleValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_IntegerValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_IntegerValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_CategoricalValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_CategoricalValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_DiscreteValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_DiscreteValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_DiscreteValueCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_DiscreteValueCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_IntValueCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_IntValueCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_CategoricalValueCondition_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_CategoricalValueCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_DecayCurveAutomatedStoppingSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_DecayCurveAutomatedStoppingSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_MedianAutomatedStoppingSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_MedianAutomatedStoppingSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_StudySpec_ConvexAutomatedStoppingSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_StudySpec_ConvexAutomatedStoppingSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Measurement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Measurement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Measurement_Metric_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Measurement_Metric_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n&google/cloud/aiplatform/v1/study.proto"
          + "\022\032google.cloud.aiplatform.v1\032\037google/api"
          + "/field_behavior.proto\032\031google/api/resour"
          + "ce.proto\032\036google/protobuf/duration.proto"
          + "\032\034google/protobuf/struct.proto\032\037google/p"
          + "rotobuf/timestamp.proto\"\256\003\n\005Study\022\021\n\004nam"
          + "e\030\001 \001(\tB\003\340A\003\022\031\n\014display_name\030\002 \001(\tB\003\340A\002\022"
          + ">\n\nstudy_spec\030\003 \001(\0132%.google.cloud.aipla"
          + "tform.v1.StudySpecB\003\340A\002\022;\n\005state\030\004 \001(\0162\'"
          + ".google.cloud.aiplatform.v1.Study.StateB"
          + "\003\340A\003\0224\n\013create_time\030\005 \001(\0132\032.google.proto"
          + "buf.TimestampB\003\340A\003\022\034\n\017inactive_reason\030\006 "
          + "\001(\tB\003\340A\003\"G\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000"
          + "\022\n\n\006ACTIVE\020\001\022\014\n\010INACTIVE\020\002\022\r\n\tCOMPLETED\020"
          + "\003:]\352AZ\n\037aiplatform.googleapis.com/Study\022"
          + "7projects/{project}/locations/{location}"
          + "/studies/{study}\"\320\007\n\005Trial\022\021\n\004name\030\001 \001(\t"
          + "B\003\340A\003\022\017\n\002id\030\002 \001(\tB\003\340A\003\022;\n\005state\030\003 \001(\0162\'."
          + "google.cloud.aiplatform.v1.Trial.StateB\003"
          + "\340A\003\022D\n\nparameters\030\004 \003(\0132+.google.cloud.a"
          + "iplatform.v1.Trial.ParameterB\003\340A\003\022G\n\021fin"
          + "al_measurement\030\005 \001(\0132\'.google.cloud.aipl"
          + "atform.v1.MeasurementB\003\340A\003\022B\n\014measuremen"
          + "ts\030\006 \003(\0132\'.google.cloud.aiplatform.v1.Me"
          + "asurementB\003\340A\003\0223\n\nstart_time\030\007 \001(\0132\032.goo"
          + "gle.protobuf.TimestampB\003\340A\003\0221\n\010end_time\030"
          + "\010 \001(\0132\032.google.protobuf.TimestampB\003\340A\003\022\026"
          + "\n\tclient_id\030\t \001(\tB\003\340A\003\022\036\n\021infeasible_rea"
          + "son\030\n \001(\tB\003\340A\003\022?\n\ncustom_job\030\013 \001(\tB+\340A\003\372"
          + "A%\n#aiplatform.googleapis.com/CustomJob\022"
          + "R\n\017web_access_uris\030\014 \003(\01324.google.cloud."
          + "aiplatform.v1.Trial.WebAccessUrisEntryB\003"
          + "\340A\003\032R\n\tParameter\022\031\n\014parameter_id\030\001 \001(\tB\003"
          + "\340A\003\022*\n\005value\030\002 \001(\0132\026.google.protobuf.Val"
          + "ueB\003\340A\003\0324\n\022WebAccessUrisEntry\022\013\n\003key\030\001 \001"
          + "(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"f\n\005State\022\025\n\021STATE_"
          + "UNSPECIFIED\020\000\022\r\n\tREQUESTED\020\001\022\n\n\006ACTIVE\020\002"
          + "\022\014\n\010STOPPING\020\003\022\r\n\tSUCCEEDED\020\004\022\016\n\nINFEASI"
          + "BLE\020\005:l\352Ai\n\037aiplatform.googleapis.com/Tr"
          + "ial\022Fprojects/{project}/locations/{locat"
          + "ion}/studies/{study}/trials/{trial}\"\300\032\n\t"
          + "StudySpec\022j\n\031decay_curve_stopping_spec\030\004"
          + " \001(\0132E.google.cloud.aiplatform.v1.StudyS"
          + "pec.DecayCurveAutomatedStoppingSpecH\000\022k\n"
          + "\036median_automated_stopping_spec\030\005 \001(\0132A."
          + "google.cloud.aiplatform.v1.StudySpec.Med"
          + "ianAutomatedStoppingSpecH\000\022k\n\036convex_aut"
          + "omated_stopping_spec\030\t \001(\0132A.google.clou"
          + "d.aiplatform.v1.StudySpec.ConvexAutomate"
          + "dStoppingSpecH\000\022F\n\007metrics\030\001 \003(\01320.googl"
          + "e.cloud.aiplatform.v1.StudySpec.MetricSp"
          + "ecB\003\340A\002\022L\n\nparameters\030\002 \003(\01323.google.clo"
          + "ud.aiplatform.v1.StudySpec.ParameterSpec"
          + "B\003\340A\002\022B\n\talgorithm\030\003 \001(\0162/.google.cloud."
          + "aiplatform.v1.StudySpec.Algorithm\022Q\n\021obs"
          + "ervation_noise\030\006 \001(\01626.google.cloud.aipl"
          + "atform.v1.StudySpec.ObservationNoise\022b\n\032"
          + "measurement_selection_type\030\007 \001(\0162>.googl"
          + "e.cloud.aiplatform.v1.StudySpec.Measurem"
          + "entSelectionType\032\265\001\n\nMetricSpec\022\026\n\tmetri"
          + "c_id\030\001 \001(\tB\003\340A\002\022L\n\004goal\030\002 \001(\01629.google.c"
          + "loud.aiplatform.v1.StudySpec.MetricSpec."
          + "GoalTypeB\003\340A\002\"A\n\010GoalType\022\031\n\025GOAL_TYPE_U"
          + "NSPECIFIED\020\000\022\014\n\010MAXIMIZE\020\001\022\014\n\010MINIMIZE\020\002"
          + "\032\315\016\n\rParameterSpec\022`\n\021double_value_spec\030"
          + "\002 \001(\0132C.google.cloud.aiplatform.v1.Study"
          + "Spec.ParameterSpec.DoubleValueSpecH\000\022b\n\022"
          + "integer_value_spec\030\003 \001(\0132D.google.cloud."
          + "aiplatform.v1.StudySpec.ParameterSpec.In"
          + "tegerValueSpecH\000\022j\n\026categorical_value_sp"
          + "ec\030\004 \001(\0132H.google.cloud.aiplatform.v1.St"
          + "udySpec.ParameterSpec.CategoricalValueSp"
          + "ecH\000\022d\n\023discrete_value_spec\030\005 \001(\0132E.goog"
          + "le.cloud.aiplatform.v1.StudySpec.Paramet"
          + "erSpec.DiscreteValueSpecH\000\022\031\n\014parameter_"
          + "id\030\001 \001(\tB\003\340A\002\022Q\n\nscale_type\030\006 \001(\0162=.goog"
          + "le.cloud.aiplatform.v1.StudySpec.Paramet"
          + "erSpec.ScaleType\022q\n\033conditional_paramete"
          + "r_specs\030\n \003(\0132L.google.cloud.aiplatform."
          + "v1.StudySpec.ParameterSpec.ConditionalPa"
          + "rameterSpec\032o\n\017DoubleValueSpec\022\026\n\tmin_va"
          + "lue\030\001 \001(\001B\003\340A\002\022\026\n\tmax_value\030\002 \001(\001B\003\340A\002\022\032"
          + "\n\rdefault_value\030\004 \001(\001H\000\210\001\001B\020\n\016_default_v"
          + "alue\032p\n\020IntegerValueSpec\022\026\n\tmin_value\030\001 "
          + "\001(\003B\003\340A\002\022\026\n\tmax_value\030\002 \001(\003B\003\340A\002\022\032\n\rdefa"
          + "ult_value\030\004 \001(\003H\000\210\001\001B\020\n\016_default_value\032Y"
          + "\n\024CategoricalValueSpec\022\023\n\006values\030\001 \003(\tB\003"
          + "\340A\002\022\032\n\rdefault_value\030\003 \001(\tH\000\210\001\001B\020\n\016_defa"
          + "ult_value\032V\n\021DiscreteValueSpec\022\023\n\006values"
          + "\030\001 \003(\001B\003\340A\002\022\032\n\rdefault_value\030\003 \001(\001H\000\210\001\001B"
          + "\020\n\016_default_value\032\244\005\n\030ConditionalParamet"
          + "erSpec\022\205\001\n\026parent_discrete_values\030\002 \001(\0132"
          + "c.google.cloud.aiplatform.v1.StudySpec.P"
          + "arameterSpec.ConditionalParameterSpec.Di"
          + "screteValueConditionH\000\022{\n\021parent_int_val"
          + "ues\030\003 \001(\0132^.google.cloud.aiplatform.v1.S"
          + "tudySpec.ParameterSpec.ConditionalParame"
          + "terSpec.IntValueConditionH\000\022\213\001\n\031parent_c"
          + "ategorical_values\030\004 \001(\0132f.google.cloud.a"
          + "iplatform.v1.StudySpec.ParameterSpec.Con"
          + "ditionalParameterSpec.CategoricalValueCo"
          + "nditionH\000\022P\n\016parameter_spec\030\001 \001(\01323.goog"
          + "le.cloud.aiplatform.v1.StudySpec.Paramet"
          + "erSpecB\003\340A\002\032-\n\026DiscreteValueCondition\022\023\n"
          + "\006values\030\001 \003(\001B\003\340A\002\032(\n\021IntValueCondition\022"
          + "\023\n\006values\030\001 \003(\003B\003\340A\002\0320\n\031CategoricalValue"
          + "Condition\022\023\n\006values\030\001 \003(\tB\003\340A\002B\030\n\026parent"
          + "_value_condition\"n\n\tScaleType\022\032\n\026SCALE_T"
          + "YPE_UNSPECIFIED\020\000\022\025\n\021UNIT_LINEAR_SCALE\020\001"
          + "\022\022\n\016UNIT_LOG_SCALE\020\002\022\032\n\026UNIT_REVERSE_LOG"
          + "_SCALE\020\003B\026\n\024parameter_value_spec\032?\n\037Deca"
          + "yCurveAutomatedStoppingSpec\022\034\n\024use_elaps"
          + "ed_duration\030\001 \001(\010\032;\n\033MedianAutomatedStop"
          + "pingSpec\022\034\n\024use_elapsed_duration\030\001 \001(\010\032\260"
          + "\001\n\033ConvexAutomatedStoppingSpec\022\026\n\016max_st"
          + "ep_count\030\001 \001(\003\022\026\n\016min_step_count\030\002 \001(\003\022\035"
          + "\n\025min_measurement_count\030\003 \001(\003\022$\n\034learnin"
          + "g_rate_parameter_name\030\004 \001(\t\022\034\n\024use_elaps"
          + "ed_duration\030\005 \001(\010\"J\n\tAlgorithm\022\031\n\025ALGORI"
          + "THM_UNSPECIFIED\020\000\022\017\n\013GRID_SEARCH\020\002\022\021\n\rRA"
          + "NDOM_SEARCH\020\003\"H\n\020ObservationNoise\022!\n\035OBS"
          + "ERVATION_NOISE_UNSPECIFIED\020\000\022\007\n\003LOW\020\001\022\010\n"
          + "\004HIGH\020\002\"r\n\030MeasurementSelectionType\022*\n&M"
          + "EASUREMENT_SELECTION_TYPE_UNSPECIFIED\020\000\022"
          + "\024\n\020LAST_MEASUREMENT\020\001\022\024\n\020BEST_MEASUREMEN"
          + "T\020\002B\031\n\027automated_stopping_spec\"\334\001\n\013Measu"
          + "rement\0228\n\020elapsed_duration\030\001 \001(\0132\031.googl"
          + "e.protobuf.DurationB\003\340A\003\022\027\n\nstep_count\030\002"
          + " \001(\003B\003\340A\003\022D\n\007metrics\030\003 \003(\0132..google.clou"
          + "d.aiplatform.v1.Measurement.MetricB\003\340A\003\032"
          + "4\n\006Metric\022\026\n\tmetric_id\030\001 \001(\tB\003\340A\003\022\022\n\005val"
          + "ue\030\002 \001(\001B\003\340A\003B\316\001\n\036com.google.cloud.aipla"
          + "tform.v1B\nStudyProtoP\001ZDgoogle.golang.or"
          + "g/genproto/googleapis/cloud/aiplatform/v"
          + "1;aiplatform\252\002\032Google.Cloud.AIPlatform.V"
          + "1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Google:"
          + ":Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Study_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Study_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Study_descriptor,
            new java.lang.String[] {
              "Name", "DisplayName", "StudySpec", "State", "CreateTime", "InactiveReason",
            });
    internal_static_google_cloud_aiplatform_v1_Trial_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Trial_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Trial_descriptor,
            new java.lang.String[] {
              "Name",
              "Id",
              "State",
              "Parameters",
              "FinalMeasurement",
              "Measurements",
              "StartTime",
              "EndTime",
              "ClientId",
              "InfeasibleReason",
              "CustomJob",
              "WebAccessUris",
            });
    internal_static_google_cloud_aiplatform_v1_Trial_Parameter_descriptor =
        internal_static_google_cloud_aiplatform_v1_Trial_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Trial_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Trial_Parameter_descriptor,
            new java.lang.String[] {
              "ParameterId", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_Trial_WebAccessUrisEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Trial_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_Trial_WebAccessUrisEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Trial_WebAccessUrisEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_StudySpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_descriptor,
            new java.lang.String[] {
              "DecayCurveStoppingSpec",
              "MedianAutomatedStoppingSpec",
              "ConvexAutomatedStoppingSpec",
              "Metrics",
              "Parameters",
              "Algorithm",
              "ObservationNoise",
              "MeasurementSelectionType",
              "AutomatedStoppingSpec",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_MetricSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_StudySpec_MetricSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_MetricSpec_descriptor,
            new java.lang.String[] {
              "MetricId", "Goal",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_descriptor.getNestedTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_descriptor,
            new java.lang.String[] {
              "DoubleValueSpec",
              "IntegerValueSpec",
              "CategoricalValueSpec",
              "DiscreteValueSpec",
              "ParameterId",
              "ScaleType",
              "ConditionalParameterSpecs",
              "ParameterValueSpec",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_DoubleValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_DoubleValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_DoubleValueSpec_descriptor,
            new java.lang.String[] {
              "MinValue", "MaxValue", "DefaultValue", "DefaultValue",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_IntegerValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_IntegerValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_IntegerValueSpec_descriptor,
            new java.lang.String[] {
              "MinValue", "MaxValue", "DefaultValue", "DefaultValue",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_CategoricalValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_CategoricalValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_CategoricalValueSpec_descriptor,
            new java.lang.String[] {
              "Values", "DefaultValue", "DefaultValue",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_DiscreteValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_DiscreteValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_DiscreteValueSpec_descriptor,
            new java.lang.String[] {
              "Values", "DefaultValue", "DefaultValue",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(4);
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor,
            new java.lang.String[] {
              "ParentDiscreteValues",
              "ParentIntValues",
              "ParentCategoricalValues",
              "ParameterSpec",
              "ParentValueCondition",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_DiscreteValueCondition_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_DiscreteValueCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_DiscreteValueCondition_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_IntValueCondition_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_IntValueCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_IntValueCondition_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_CategoricalValueCondition_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_CategoricalValueCondition_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_ParameterSpec_ConditionalParameterSpec_CategoricalValueCondition_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_DecayCurveAutomatedStoppingSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_descriptor.getNestedTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_StudySpec_DecayCurveAutomatedStoppingSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_DecayCurveAutomatedStoppingSpec_descriptor,
            new java.lang.String[] {
              "UseElapsedDuration",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_MedianAutomatedStoppingSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_descriptor.getNestedTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_StudySpec_MedianAutomatedStoppingSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_MedianAutomatedStoppingSpec_descriptor,
            new java.lang.String[] {
              "UseElapsedDuration",
            });
    internal_static_google_cloud_aiplatform_v1_StudySpec_ConvexAutomatedStoppingSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1_StudySpec_descriptor.getNestedTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_StudySpec_ConvexAutomatedStoppingSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_StudySpec_ConvexAutomatedStoppingSpec_descriptor,
            new java.lang.String[] {
              "MaxStepCount",
              "MinStepCount",
              "MinMeasurementCount",
              "LearningRateParameterName",
              "UseElapsedDuration",
            });
    internal_static_google_cloud_aiplatform_v1_Measurement_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_Measurement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Measurement_descriptor,
            new java.lang.String[] {
              "ElapsedDuration", "StepCount", "Metrics",
            });
    internal_static_google_cloud_aiplatform_v1_Measurement_Metric_descriptor =
        internal_static_google_cloud_aiplatform_v1_Measurement_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Measurement_Metric_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Measurement_Metric_descriptor,
            new java.lang.String[] {
              "MetricId", "Value",
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
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}