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
// source: google/cloud/datalabeling/v1beta1/annotation.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.datalabeling.v1beta1;

public final class AnnotationOuterClass {
  private AnnotationOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_Annotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_Annotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_Vertex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_Vertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_NormalizedVertex_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_NormalizedVertex_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_BoundingPoly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_BoundingPoly_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_NormalizedBoundingPoly_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_NormalizedBoundingPoly_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ImageBoundingPolyAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ImageBoundingPolyAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_Polyline_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_Polyline_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_NormalizedPolyline_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_NormalizedPolyline_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ImagePolylineAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ImagePolylineAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_AnnotationColorsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_AnnotationColorsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_TextClassificationAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_TextClassificationAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_SequentialSegment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_SequentialSegment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_TimeSegment_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_TimeSegment_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ObjectTrackingFrame_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ObjectTrackingFrame_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_VideoObjectTrackingAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_VideoObjectTrackingAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_VideoEventAnnotation_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_VideoEventAnnotation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_AnnotationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_OperatorMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_OperatorMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n"
          + "2google/cloud/datalabeling/v1beta1/annotation.proto\022!google.cloud.datalabeling."
          + "v1beta1\032;google/cloud/datalabeling/v1bet"
          + "a1/annotation_spec_set.proto\032\036google/protobuf/duration.proto\"\342\002\n\n"
          + "Annotation\022\014\n"
          + "\004name\030\001 \001(\t\022N\n"
          + "\021annotation_source\030\002 \001(\01623.g"
          + "oogle.cloud.datalabeling.v1beta1.AnnotationSource\022L\n"
          + "\020annotation_value\030\003 \001(\01322.go"
          + "ogle.cloud.datalabeling.v1beta1.AnnotationValue\022R\n"
          + "\023annotation_metadata\030\004 \001(\01325.g"
          + "oogle.cloud.datalabeling.v1beta1.AnnotationMetadata\022T\n"
          + "\024annotation_sentiment\030\006 \001("
          + "\01626.google.cloud.datalabeling.v1beta1.AnnotationSentiment\"\321\007\n"
          + "\017AnnotationValue\022k\n"
          + "\037image_classification_annotation\030\001 \001(\0132@"
          + ".google.cloud.datalabeling.v1beta1.ImageClassificationAnnotationH\000\022h\n"
          + "\036image_bounding_poly_annotation\030\002 \001(\0132>.google.clou"
          + "d.datalabeling.v1beta1.ImageBoundingPolyAnnotationH\000\022_\n"
          + "\031image_polyline_annotation\030\010"
          + " \001(\0132:.google.cloud.datalabeling.v1beta1.ImagePolylineAnnotationH\000\022g\n"
          + "\035image_segmentation_annotation\030\t \001(\0132>.google.cl"
          + "oud.datalabeling.v1beta1.ImageSegmentationAnnotationH\000\022i\n"
          + "\036text_classification_annotation\030\003 \001(\0132?.google.cloud.datalabeli"
          + "ng.v1beta1.TextClassificationAnnotationH\000\022n\n"
          + "!text_entity_extraction_annotation\030\n"
          + " \001(\0132A.google.cloud.datalabeling.v1beta1.TextEntityExtractionAnnotationH\000\022k\n"
          + "\037video_classification_annotation\030\004 \001(\0132@.goo"
          + "gle.cloud.datalabeling.v1beta1.VideoClassificationAnnotationH\000\022l\n"
          + " video_object_tracking_annotation\030\005 \001(\0132@.google.cloud."
          + "datalabeling.v1beta1.VideoObjectTrackingAnnotationH\000\022Y\n"
          + "\026video_event_annotation\030\006"
          + " \001(\01327.google.cloud.datalabeling.v1beta1.VideoEventAnnotationH\000B\014\n\n"
          + "value_type\"k\n"
          + "\035ImageClassificationAnnotation\022J\n"
          + "\017annotation_spec\030\001"
          + " \001(\01321.google.cloud.datalabeling.v1beta1.AnnotationSpec\"\036\n"
          + "\006Vertex\022\t\n"
          + "\001x\030\001 \001(\005\022\t\n"
          + "\001y\030\002 \001(\005\"(\n"
          + "\020NormalizedVertex\022\t\n"
          + "\001x\030\001 \001(\002\022\t\n"
          + "\001y\030\002 \001(\002\"K\n"
          + "\014BoundingPoly\022;\n"
          + "\010vertices\030\001 \003(\0132).google.cloud.datalabeling.v1beta1.Vertex\"j\n"
          + "\026NormalizedBoundingPoly\022P\n"
          + "\023normalized_vertices\030\001 \003(\01323.googl"
          + "e.cloud.datalabeling.v1beta1.NormalizedVertex\"\242\002\n"
          + "\033ImageBoundingPolyAnnotation\022H\n"
          + "\r"
          + "bounding_poly\030\002"
          + " \001(\0132/.google.cloud.datalabeling.v1beta1.BoundingPolyH\000\022]\n"
          + "\030normalized_bounding_poly\030\003 \001(\01329.google.cloud"
          + ".datalabeling.v1beta1.NormalizedBoundingPolyH\000\022J\n"
          + "\017annotation_spec\030\001 \001(\01321.google"
          + ".cloud.datalabeling.v1beta1.AnnotationSpecB\016\n"
          + "\014bounded_area\"G\n"
          + "\010Polyline\022;\n"
          + "\010vertices\030\001 \003(\0132).google.cloud.datalabeling.v1beta1.Vertex\"f\n"
          + "\022NormalizedPolyline\022P\n"
          + "\023normalized_vertices\030\001"
          + " \003(\01323.google.cloud.datalabeling.v1beta1.NormalizedVertex\"\204\002\n"
          + "\027ImagePolylineAnnotation\022?\n"
          + "\010polyline\030\002 \001("
          + "\0132+.google.cloud.datalabeling.v1beta1.PolylineH\000\022T\n"
          + "\023normalized_polyline\030\003 \001(\01325."
          + "google.cloud.datalabeling.v1beta1.NormalizedPolylineH\000\022J\n"
          + "\017annotation_spec\030\001 \001(\0132"
          + "1.google.cloud.datalabeling.v1beta1.AnnotationSpecB\006\n"
          + "\004poly\"\242\002\n"
          + "\033ImageSegmentationAnnotation\022o\n"
          + "\021annotation_colors\030\001 \003(\0132T.google.cloud.datalabeling.v1beta1.ImageS"
          + "egmentationAnnotation.AnnotationColorsEntry\022\021\n"
          + "\tmime_type\030\002 \001(\t\022\023\n"
          + "\013image_bytes\030\003 \001(\014\032j\n"
          + "\025AnnotationColorsEntry\022\013\n"
          + "\003key\030\001 \001(\t\022@\n"
          + "\005value\030\002"
          + " \001(\01321.google.cloud.datalabeling.v1beta1.AnnotationSpec:\0028\001\"j\n"
          + "\034TextClassificationAnnotation\022J\n"
          + "\017annotation_spec\030\001"
          + " \001(\01321.google.cloud.datalabeling.v1beta1.AnnotationSpec\"\276\001\n"
          + "\036TextEntityExtractionAnnotation\022J\n"
          + "\017annotation_spec\030\001 \001(\0132"
          + "1.google.cloud.datalabeling.v1beta1.AnnotationSpec\022P\n"
          + "\022sequential_segment\030\002 \001(\01324"
          + ".google.cloud.datalabeling.v1beta1.SequentialSegment\"/\n"
          + "\021SequentialSegment\022\r\n"
          + "\005start\030\001 \001(\005\022\013\n"
          + "\003end\030\002 \001(\005\"w\n"
          + "\013TimeSegment\0224\n"
          + "\021start_time_offset\030\001 \001(\0132\031.google.protobuf.Duration\0222\n"
          + "\017end_time_offset\030\002 \001(\0132\031.google.protobuf.Duration\"\261\001\n"
          + "\035VideoClassificationAnnotation\022D\n"
          + "\014time_segment\030\001 \001(\0132."
          + ".google.cloud.datalabeling.v1beta1.TimeSegment\022J\n"
          + "\017annotation_spec\030\002 \001(\01321.google"
          + ".cloud.datalabeling.v1beta1.AnnotationSpec\"\376\001\n"
          + "\023ObjectTrackingFrame\022H\n\r"
          + "bounding_poly\030\001"
          + " \001(\0132/.google.cloud.datalabeling.v1beta1.BoundingPolyH\000\022]\n"
          + "\030normalized_bounding_poly\030\002"
          + " \001(\01329.google.cloud.datalabeling.v1beta1.NormalizedBoundingPolyH\000\022.\n"
          + "\013time_offset\030\003 \001(\0132\031.google.protobuf.DurationB\016\n"
          + "\014bounded_area\"\211\002\n"
          + "\035VideoObjectTrackingAnnotation\022J\n"
          + "\017annotation_spec\030\001 \001(\01321"
          + ".google.cloud.datalabeling.v1beta1.AnnotationSpec\022D\n"
          + "\014time_segment\030\002 \001(\0132..google"
          + ".cloud.datalabeling.v1beta1.TimeSegment\022V\n"
          + "\026object_tracking_frames\030\003 \003(\01326.google"
          + ".cloud.datalabeling.v1beta1.ObjectTrackingFrame\"\250\001\n"
          + "\024VideoEventAnnotation\022J\n"
          + "\017annotation_spec\030\001"
          + " \001(\01321.google.cloud.datalabeling.v1beta1.AnnotationSpec\022D\n"
          + "\014time_segment\030\002"
          + " \001(\0132..google.cloud.datalabeling.v1beta1.TimeSegment\"d\n"
          + "\022AnnotationMetadata\022N\n"
          + "\021operator_metadata\030\002 \001(\01323.google.clo"
          + "ud.datalabeling.v1beta1.OperatorMetadata\"]\n"
          + "\020OperatorMetadata\022\r\n"
          + "\005score\030\001 \001(\002\022\023\n"
          + "\013total_votes\030\002 \001(\005\022\023\n"
          + "\013label_votes\030\003 \001(\005\022\020\n"
          + "\010comments\030\004 \003(\t*C\n"
          + "\020AnnotationSource\022!\n"
          + "\035ANNOTATION_SOURCE_UNSPECIFIED\020\000\022\014\n"
          + "\010OPERATOR\020\003*W\n"
          + "\023AnnotationSentiment\022$\n"
          + " ANNOTATION_SENTIMENT_UNSPECIFIED\020\000\022\014\n"
          + "\010NEGATIVE\020\001\022\014\n"
          + "\010POSITIVE\020\002*\221\004\n"
          + "\016AnnotationType\022\037\n"
          + "\033ANNOTATION_TYPE_UNSPECIFIED\020\000\022#\n"
          + "\037IMAGE_CLASSIFICATION_ANNOTATION\020\001\022!\n"
          + "\035IMAGE_BOUNDING_BOX_ANNOTATION\020\002\022*\n"
          + "&IMAGE_ORIENTED_BOUNDING_BOX_ANNOTATION\020\r"
          + "\022\"\n"
          + "\036IMAGE_BOUNDING_POLY_ANNOTATION\020\n"
          + "\022\035\n"
          + "\031IMAGE_POLYLINE_ANNOTATION\020\013\022!\n"
          + "\035IMAGE_SEGMENTATION_ANNOTATION\020\014\022)\n"
          + "%VIDEO_SHOTS_CLASSIFICATION_ANNOTATION\020\003\022$\n"
          + " VIDEO_OBJECT_TRACKING_ANNOTATION\020\004\022%\n"
          + "!VIDEO_OBJECT_DETECTION_ANNOTATION\020\005\022\032\n"
          + "\026VIDEO_EVENT_ANNOTATION\020\006\022\"\n"
          + "\036TEXT_CLASSIFICATION_ANNOTATION\020\010\022%\n"
          + "!TEXT_ENTITY_EXTRACTION_ANNOTATION\020\t\022%\n"
          + "!GENERAL_CLASSIFICATION_ANNOTATION\020\016B\343\001\n"
          + "%com.google.cloud.datalabeling.v1beta1P\001ZIcloud.goo"
          + "gle.com/go/datalabeling/apiv1beta1/datalabelingpb;datalabelingpb\252\002!Google.Cloud."
          + "DataLabeling.V1Beta1\312\002!Google\\Cloud\\Data"
          + "Labeling\\V1beta1\352\002$Google::Cloud::DataLabeling::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOuterClass.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_datalabeling_v1beta1_Annotation_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_Annotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_Annotation_descriptor,
            new java.lang.String[] {
              "Name",
              "AnnotationSource",
              "AnnotationValue",
              "AnnotationMetadata",
              "AnnotationSentiment",
            });
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationValue_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_AnnotationValue_descriptor,
            new java.lang.String[] {
              "ImageClassificationAnnotation",
              "ImageBoundingPolyAnnotation",
              "ImagePolylineAnnotation",
              "ImageSegmentationAnnotation",
              "TextClassificationAnnotation",
              "TextEntityExtractionAnnotation",
              "VideoClassificationAnnotation",
              "VideoObjectTrackingAnnotation",
              "VideoEventAnnotation",
              "ValueType",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationAnnotation_descriptor,
            new java.lang.String[] {
              "AnnotationSpec",
            });
    internal_static_google_cloud_datalabeling_v1beta1_Vertex_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datalabeling_v1beta1_Vertex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_Vertex_descriptor,
            new java.lang.String[] {
              "X", "Y",
            });
    internal_static_google_cloud_datalabeling_v1beta1_NormalizedVertex_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datalabeling_v1beta1_NormalizedVertex_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_NormalizedVertex_descriptor,
            new java.lang.String[] {
              "X", "Y",
            });
    internal_static_google_cloud_datalabeling_v1beta1_BoundingPoly_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datalabeling_v1beta1_BoundingPoly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_BoundingPoly_descriptor,
            new java.lang.String[] {
              "Vertices",
            });
    internal_static_google_cloud_datalabeling_v1beta1_NormalizedBoundingPoly_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datalabeling_v1beta1_NormalizedBoundingPoly_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_NormalizedBoundingPoly_descriptor,
            new java.lang.String[] {
              "NormalizedVertices",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ImageBoundingPolyAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_datalabeling_v1beta1_ImageBoundingPolyAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ImageBoundingPolyAnnotation_descriptor,
            new java.lang.String[] {
              "BoundingPoly", "NormalizedBoundingPoly", "AnnotationSpec", "BoundedArea",
            });
    internal_static_google_cloud_datalabeling_v1beta1_Polyline_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_datalabeling_v1beta1_Polyline_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_Polyline_descriptor,
            new java.lang.String[] {
              "Vertices",
            });
    internal_static_google_cloud_datalabeling_v1beta1_NormalizedPolyline_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_datalabeling_v1beta1_NormalizedPolyline_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_NormalizedPolyline_descriptor,
            new java.lang.String[] {
              "NormalizedVertices",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ImagePolylineAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_datalabeling_v1beta1_ImagePolylineAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ImagePolylineAnnotation_descriptor,
            new java.lang.String[] {
              "Polyline", "NormalizedPolyline", "AnnotationSpec", "Poly",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_descriptor,
            new java.lang.String[] {
              "AnnotationColors", "MimeType", "ImageBytes",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_AnnotationColorsEntry_descriptor =
        internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_AnnotationColorsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ImageSegmentationAnnotation_AnnotationColorsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_datalabeling_v1beta1_TextClassificationAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_datalabeling_v1beta1_TextClassificationAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_TextClassificationAnnotation_descriptor,
            new java.lang.String[] {
              "AnnotationSpec",
            });
    internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionAnnotation_descriptor,
            new java.lang.String[] {
              "AnnotationSpec", "SequentialSegment",
            });
    internal_static_google_cloud_datalabeling_v1beta1_SequentialSegment_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_datalabeling_v1beta1_SequentialSegment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_SequentialSegment_descriptor,
            new java.lang.String[] {
              "Start", "End",
            });
    internal_static_google_cloud_datalabeling_v1beta1_TimeSegment_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_datalabeling_v1beta1_TimeSegment_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_TimeSegment_descriptor,
            new java.lang.String[] {
              "StartTimeOffset", "EndTimeOffset",
            });
    internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationAnnotation_descriptor,
            new java.lang.String[] {
              "TimeSegment", "AnnotationSpec",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ObjectTrackingFrame_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_datalabeling_v1beta1_ObjectTrackingFrame_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ObjectTrackingFrame_descriptor,
            new java.lang.String[] {
              "BoundingPoly", "NormalizedBoundingPoly", "TimeOffset", "BoundedArea",
            });
    internal_static_google_cloud_datalabeling_v1beta1_VideoObjectTrackingAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(18);
    internal_static_google_cloud_datalabeling_v1beta1_VideoObjectTrackingAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_VideoObjectTrackingAnnotation_descriptor,
            new java.lang.String[] {
              "AnnotationSpec", "TimeSegment", "ObjectTrackingFrames",
            });
    internal_static_google_cloud_datalabeling_v1beta1_VideoEventAnnotation_descriptor =
        getDescriptor().getMessageTypes().get(19);
    internal_static_google_cloud_datalabeling_v1beta1_VideoEventAnnotation_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_VideoEventAnnotation_descriptor,
            new java.lang.String[] {
              "AnnotationSpec", "TimeSegment",
            });
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(20);
    internal_static_google_cloud_datalabeling_v1beta1_AnnotationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_AnnotationMetadata_descriptor,
            new java.lang.String[] {
              "OperatorMetadata",
            });
    internal_static_google_cloud_datalabeling_v1beta1_OperatorMetadata_descriptor =
        getDescriptor().getMessageTypes().get(21);
    internal_static_google_cloud_datalabeling_v1beta1_OperatorMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_OperatorMetadata_descriptor,
            new java.lang.String[] {
              "Score", "TotalVotes", "LabelVotes", "Comments",
            });
    com.google.cloud.datalabeling.v1beta1.AnnotationSpecSetOuterClass.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
