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
// source: google/analytics/admin/v1alpha/audience.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

public interface AudienceFilterClauseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AudienceFilterClause)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A simple filter that a user must satisfy to be a member of the Audience.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceSimpleFilter simple_filter = 2;</code>
   *
   * @return Whether the simpleFilter field is set.
   */
  boolean hasSimpleFilter();

  /**
   *
   *
   * <pre>
   * A simple filter that a user must satisfy to be a member of the Audience.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceSimpleFilter simple_filter = 2;</code>
   *
   * @return The simpleFilter.
   */
  com.google.analytics.admin.v1alpha.AudienceSimpleFilter getSimpleFilter();

  /**
   *
   *
   * <pre>
   * A simple filter that a user must satisfy to be a member of the Audience.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceSimpleFilter simple_filter = 2;</code>
   */
  com.google.analytics.admin.v1alpha.AudienceSimpleFilterOrBuilder getSimpleFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Filters that must occur in a specific order for the user to be a member
   * of the Audience.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceSequenceFilter sequence_filter = 3;</code>
   *
   * @return Whether the sequenceFilter field is set.
   */
  boolean hasSequenceFilter();

  /**
   *
   *
   * <pre>
   * Filters that must occur in a specific order for the user to be a member
   * of the Audience.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceSequenceFilter sequence_filter = 3;</code>
   *
   * @return The sequenceFilter.
   */
  com.google.analytics.admin.v1alpha.AudienceSequenceFilter getSequenceFilter();

  /**
   *
   *
   * <pre>
   * Filters that must occur in a specific order for the user to be a member
   * of the Audience.
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.AudienceSequenceFilter sequence_filter = 3;</code>
   */
  com.google.analytics.admin.v1alpha.AudienceSequenceFilterOrBuilder getSequenceFilterOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Specifies whether this is an include or exclude filter clause.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceFilterClause.AudienceClauseType clause_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for clauseType.
   */
  int getClauseTypeValue();

  /**
   *
   *
   * <pre>
   * Required. Specifies whether this is an include or exclude filter clause.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceFilterClause.AudienceClauseType clause_type = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The clauseType.
   */
  com.google.analytics.admin.v1alpha.AudienceFilterClause.AudienceClauseType getClauseType();

  com.google.analytics.admin.v1alpha.AudienceFilterClause.FilterCase getFilterCase();
}
