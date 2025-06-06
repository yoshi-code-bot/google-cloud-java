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
// source: google/cloud/visionai/v1/warehouse.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.visionai.v1;

public interface SearchResultItemOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.visionai.v1.SearchResultItem)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the asset.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string asset = 1;</code>
   *
   * @return The asset.
   */
  java.lang.String getAsset();

  /**
   *
   *
   * <pre>
   * The resource name of the asset.
   * Format:
   * `projects/{project_number}/locations/{location_id}/corpora/{corpus_id}/assets/{asset_id}`
   * </pre>
   *
   * <code>string asset = 1;</code>
   *
   * @return The bytes for asset.
   */
  com.google.protobuf.ByteString getAssetBytes();

  /**
   *
   *
   * <pre>
   * The matched asset segments.
   * Deprecated: please use singular `segment` field.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.Partition.TemporalPartition segments = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<com.google.cloud.visionai.v1.Partition.TemporalPartition> getSegmentsList();

  /**
   *
   *
   * <pre>
   * The matched asset segments.
   * Deprecated: please use singular `segment` field.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.Partition.TemporalPartition segments = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.visionai.v1.Partition.TemporalPartition getSegments(int index);

  /**
   *
   *
   * <pre>
   * The matched asset segments.
   * Deprecated: please use singular `segment` field.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.Partition.TemporalPartition segments = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  int getSegmentsCount();

  /**
   *
   *
   * <pre>
   * The matched asset segments.
   * Deprecated: please use singular `segment` field.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.Partition.TemporalPartition segments = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  java.util.List<? extends com.google.cloud.visionai.v1.Partition.TemporalPartitionOrBuilder>
      getSegmentsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The matched asset segments.
   * Deprecated: please use singular `segment` field.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.Partition.TemporalPartition segments = 2 [deprecated = true];
   * </code>
   */
  @java.lang.Deprecated
  com.google.cloud.visionai.v1.Partition.TemporalPartitionOrBuilder getSegmentsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The matched asset segment.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Partition.TemporalPartition segment = 5;</code>
   *
   * @return Whether the segment field is set.
   */
  boolean hasSegment();

  /**
   *
   *
   * <pre>
   * The matched asset segment.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Partition.TemporalPartition segment = 5;</code>
   *
   * @return The segment.
   */
  com.google.cloud.visionai.v1.Partition.TemporalPartition getSegment();

  /**
   *
   *
   * <pre>
   * The matched asset segment.
   * </pre>
   *
   * <code>.google.cloud.visionai.v1.Partition.TemporalPartition segment = 5;</code>
   */
  com.google.cloud.visionai.v1.Partition.TemporalPartitionOrBuilder getSegmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Available to IMAGE corpus types.
   * Relevance of this `SearchResultItem` to user search query (text query or
   * image query).
   * By default this represents cosine similarity between the query and the
   * retrieved media content. The value is in the range of [-1, 1].
   * Note that search ranking is not only decided by this relevance score,
   * but also other factors such as the match of annotations.
   * </pre>
   *
   * <code>double relevance = 6;</code>
   *
   * @return The relevance.
   */
  double getRelevance();

  /**
   *
   *
   * <pre>
   * Search result annotations specified by result_annotation_keys in search
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Annotation requested_annotations = 3;</code>
   */
  java.util.List<com.google.cloud.visionai.v1.Annotation> getRequestedAnnotationsList();

  /**
   *
   *
   * <pre>
   * Search result annotations specified by result_annotation_keys in search
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Annotation requested_annotations = 3;</code>
   */
  com.google.cloud.visionai.v1.Annotation getRequestedAnnotations(int index);

  /**
   *
   *
   * <pre>
   * Search result annotations specified by result_annotation_keys in search
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Annotation requested_annotations = 3;</code>
   */
  int getRequestedAnnotationsCount();

  /**
   *
   *
   * <pre>
   * Search result annotations specified by result_annotation_keys in search
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Annotation requested_annotations = 3;</code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.AnnotationOrBuilder>
      getRequestedAnnotationsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Search result annotations specified by result_annotation_keys in search
   * request.
   * </pre>
   *
   * <code>repeated .google.cloud.visionai.v1.Annotation requested_annotations = 3;</code>
   */
  com.google.cloud.visionai.v1.AnnotationOrBuilder getRequestedAnnotationsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Criteria or facet-selection based annotation matching results associated to
   * this search result item. Only contains results for criteria or
   * facet_selections with fetch_matched_annotations=true.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.AnnotationMatchingResult annotation_matching_results = 4;
   * </code>
   */
  java.util.List<com.google.cloud.visionai.v1.AnnotationMatchingResult>
      getAnnotationMatchingResultsList();

  /**
   *
   *
   * <pre>
   * Criteria or facet-selection based annotation matching results associated to
   * this search result item. Only contains results for criteria or
   * facet_selections with fetch_matched_annotations=true.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.AnnotationMatchingResult annotation_matching_results = 4;
   * </code>
   */
  com.google.cloud.visionai.v1.AnnotationMatchingResult getAnnotationMatchingResults(int index);

  /**
   *
   *
   * <pre>
   * Criteria or facet-selection based annotation matching results associated to
   * this search result item. Only contains results for criteria or
   * facet_selections with fetch_matched_annotations=true.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.AnnotationMatchingResult annotation_matching_results = 4;
   * </code>
   */
  int getAnnotationMatchingResultsCount();

  /**
   *
   *
   * <pre>
   * Criteria or facet-selection based annotation matching results associated to
   * this search result item. Only contains results for criteria or
   * facet_selections with fetch_matched_annotations=true.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.AnnotationMatchingResult annotation_matching_results = 4;
   * </code>
   */
  java.util.List<? extends com.google.cloud.visionai.v1.AnnotationMatchingResultOrBuilder>
      getAnnotationMatchingResultsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Criteria or facet-selection based annotation matching results associated to
   * this search result item. Only contains results for criteria or
   * facet_selections with fetch_matched_annotations=true.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.visionai.v1.AnnotationMatchingResult annotation_matching_results = 4;
   * </code>
   */
  com.google.cloud.visionai.v1.AnnotationMatchingResultOrBuilder
      getAnnotationMatchingResultsOrBuilder(int index);
}
