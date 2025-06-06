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
// source: google/cloud/contactcenterinsights/v1/resources.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contactcenterinsights.v1;

public interface QaScorecardRevisionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contactcenterinsights.v1.QaScorecardRevision)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifier. The name of the scorecard revision.
   * Format:
   * projects/{project}/locations/{location}/qaScorecards/{qa_scorecard}/revisions/{revision}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Identifier. The name of the scorecard revision.
   * Format:
   * projects/{project}/locations/{location}/qaScorecards/{qa_scorecard}/revisions/{revision}
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IDENTIFIER];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The snapshot of the scorecard at the time of this revision's creation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.QaScorecard snapshot = 2;</code>
   *
   * @return Whether the snapshot field is set.
   */
  boolean hasSnapshot();

  /**
   *
   *
   * <pre>
   * The snapshot of the scorecard at the time of this revision's creation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.QaScorecard snapshot = 2;</code>
   *
   * @return The snapshot.
   */
  com.google.cloud.contactcenterinsights.v1.QaScorecard getSnapshot();

  /**
   *
   *
   * <pre>
   * The snapshot of the scorecard at the time of this revision's creation.
   * </pre>
   *
   * <code>.google.cloud.contactcenterinsights.v1.QaScorecard snapshot = 2;</code>
   */
  com.google.cloud.contactcenterinsights.v1.QaScorecardOrBuilder getSnapshotOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp that the revision was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Alternative IDs for this revision of the scorecard, e.g.,
   * `latest`.
   * </pre>
   *
   * <code>repeated string alternate_ids = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the alternateIds.
   */
  java.util.List<java.lang.String> getAlternateIdsList();

  /**
   *
   *
   * <pre>
   * Output only. Alternative IDs for this revision of the scorecard, e.g.,
   * `latest`.
   * </pre>
   *
   * <code>repeated string alternate_ids = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of alternateIds.
   */
  int getAlternateIdsCount();

  /**
   *
   *
   * <pre>
   * Output only. Alternative IDs for this revision of the scorecard, e.g.,
   * `latest`.
   * </pre>
   *
   * <code>repeated string alternate_ids = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The alternateIds at the given index.
   */
  java.lang.String getAlternateIds(int index);

  /**
   *
   *
   * <pre>
   * Output only. Alternative IDs for this revision of the scorecard, e.g.,
   * `latest`.
   * </pre>
   *
   * <code>repeated string alternate_ids = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the alternateIds at the given index.
   */
  com.google.protobuf.ByteString getAlternateIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. State of the scorecard revision, indicating whether it's ready
   * to be used in analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.QaScorecardRevision.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. State of the scorecard revision, indicating whether it's ready
   * to be used in analysis.
   * </pre>
   *
   * <code>
   * .google.cloud.contactcenterinsights.v1.QaScorecardRevision.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.contactcenterinsights.v1.QaScorecardRevision.State getState();
}
