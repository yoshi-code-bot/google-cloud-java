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
// source: google/cloud/discoveryengine/v1/serving_config.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.discoveryengine.v1;

public interface ServingConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.ServingConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The MediaConfig of the serving configuration.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ServingConfig.MediaConfig media_config = 7;</code>
   *
   * @return Whether the mediaConfig field is set.
   */
  boolean hasMediaConfig();

  /**
   *
   *
   * <pre>
   * The MediaConfig of the serving configuration.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ServingConfig.MediaConfig media_config = 7;</code>
   *
   * @return The mediaConfig.
   */
  com.google.cloud.discoveryengine.v1.ServingConfig.MediaConfig getMediaConfig();

  /**
   *
   *
   * <pre>
   * The MediaConfig of the serving configuration.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ServingConfig.MediaConfig media_config = 7;</code>
   */
  com.google.cloud.discoveryengine.v1.ServingConfig.MediaConfigOrBuilder getMediaConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The GenericConfig of the serving configuration.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ServingConfig.GenericConfig generic_config = 10;</code>
   *
   * @return Whether the genericConfig field is set.
   */
  boolean hasGenericConfig();

  /**
   *
   *
   * <pre>
   * The GenericConfig of the serving configuration.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ServingConfig.GenericConfig generic_config = 10;</code>
   *
   * @return The genericConfig.
   */
  com.google.cloud.discoveryengine.v1.ServingConfig.GenericConfig getGenericConfig();

  /**
   *
   *
   * <pre>
   * The GenericConfig of the serving configuration.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.ServingConfig.GenericConfig generic_config = 10;</code>
   */
  com.google.cloud.discoveryengine.v1.ServingConfig.GenericConfigOrBuilder
      getGenericConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. Fully qualified name
   * `projects/{project}/locations/{location}/collections/{collection_id}/engines/{engine_id}/servingConfigs/{serving_config_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Immutable. Fully qualified name
   * `projects/{project}/locations/{location}/collections/{collection_id}/engines/{engine_id}/servingConfigs/{serving_config_id}`
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. The human readable serving config display name. Used in Discovery
   * UI.
   *
   * This field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();

  /**
   *
   *
   * <pre>
   * Required. The human readable serving config display name. Used in Discovery
   * UI.
   *
   * This field must be a UTF-8 encoded string with a length limit of 128
   * characters. Otherwise, an INVALID_ARGUMENT error is returned.
   * </pre>
   *
   * <code>string display_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Specifies the solution type that a serving config can
   * be associated with.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SolutionType solution_type = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for solutionType.
   */
  int getSolutionTypeValue();

  /**
   *
   *
   * <pre>
   * Required. Immutable. Specifies the solution type that a serving config can
   * be associated with.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.SolutionType solution_type = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The solutionType.
   */
  com.google.cloud.discoveryengine.v1.SolutionType getSolutionType();

  /**
   *
   *
   * <pre>
   * The id of the model to use at serving time.
   * Currently only RecommendationModels are supported.
   * Can be changed but only to a compatible model (e.g.
   * others-you-may-like CTR to others-you-may-like CVR).
   *
   * Required when [SolutionType][google.cloud.discoveryengine.v1.SolutionType]
   * is
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_RECOMMENDATION].
   * </pre>
   *
   * <code>string model_id = 4;</code>
   *
   * @return The modelId.
   */
  java.lang.String getModelId();

  /**
   *
   *
   * <pre>
   * The id of the model to use at serving time.
   * Currently only RecommendationModels are supported.
   * Can be changed but only to a compatible model (e.g.
   * others-you-may-like CTR to others-you-may-like CVR).
   *
   * Required when [SolutionType][google.cloud.discoveryengine.v1.SolutionType]
   * is
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_RECOMMENDATION].
   * </pre>
   *
   * <code>string model_id = 4;</code>
   *
   * @return The bytes for modelId.
   */
  com.google.protobuf.ByteString getModelIdBytes();

  /**
   *
   *
   * <pre>
   * How much diversity to use in recommendation model results e.g.
   * `medium-diversity` or `high-diversity`. Currently supported values:
   *
   * * `no-diversity`
   * * `low-diversity`
   * * `medium-diversity`
   * * `high-diversity`
   * * `auto-diversity`
   *
   * If not specified, we choose default based on recommendation model
   * type. Default value: `no-diversity`.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_RECOMMENDATION].
   * </pre>
   *
   * <code>string diversity_level = 5;</code>
   *
   * @return The diversityLevel.
   */
  java.lang.String getDiversityLevel();

  /**
   *
   *
   * <pre>
   * How much diversity to use in recommendation model results e.g.
   * `medium-diversity` or `high-diversity`. Currently supported values:
   *
   * * `no-diversity`
   * * `low-diversity`
   * * `medium-diversity`
   * * `high-diversity`
   * * `auto-diversity`
   *
   * If not specified, we choose default based on recommendation model
   * type. Default value: `no-diversity`.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_RECOMMENDATION][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_RECOMMENDATION].
   * </pre>
   *
   * <code>string diversity_level = 5;</code>
   *
   * @return The bytes for diversityLevel.
   */
  com.google.protobuf.ByteString getDiversityLevelBytes();

  /**
   *
   *
   * <pre>
   * The ranking expression controls the customized ranking on retrieval
   * documents. To leverage this, document embedding is required. The ranking
   * expression setting in ServingConfig applies to all search requests served
   * by the serving config. However, if `SearchRequest.ranking_expression` is
   * specified, it overrides the ServingConfig ranking expression.
   *
   * The ranking expression is a single function or multiple functions that are
   * joined by "+".
   *
   *   * ranking_expression = function, { " + ", function };
   *
   * Supported functions:
   *
   *   * double * relevance_score
   *   * double * dotProduct(embedding_field_path)
   *
   * Function variables:
   *
   *   * `relevance_score`: pre-defined keywords, used for measure relevance
   *   between query and document.
   *   * `embedding_field_path`: the document embedding field
   *   used with query embedding vector.
   *   * `dotProduct`: embedding function between embedding_field_path and query
   *   embedding vector.
   *
   *  Example ranking expression:
   *
   *    If document has an embedding field doc_embedding, the ranking expression
   *    could be `0.5 * relevance_score + 0.3 * dotProduct(doc_embedding)`.
   * </pre>
   *
   * <code>string ranking_expression = 21;</code>
   *
   * @return The rankingExpression.
   */
  java.lang.String getRankingExpression();

  /**
   *
   *
   * <pre>
   * The ranking expression controls the customized ranking on retrieval
   * documents. To leverage this, document embedding is required. The ranking
   * expression setting in ServingConfig applies to all search requests served
   * by the serving config. However, if `SearchRequest.ranking_expression` is
   * specified, it overrides the ServingConfig ranking expression.
   *
   * The ranking expression is a single function or multiple functions that are
   * joined by "+".
   *
   *   * ranking_expression = function, { " + ", function };
   *
   * Supported functions:
   *
   *   * double * relevance_score
   *   * double * dotProduct(embedding_field_path)
   *
   * Function variables:
   *
   *   * `relevance_score`: pre-defined keywords, used for measure relevance
   *   between query and document.
   *   * `embedding_field_path`: the document embedding field
   *   used with query embedding vector.
   *   * `dotProduct`: embedding function between embedding_field_path and query
   *   embedding vector.
   *
   *  Example ranking expression:
   *
   *    If document has an embedding field doc_embedding, the ranking expression
   *    could be `0.5 * relevance_score + 0.3 * dotProduct(doc_embedding)`.
   * </pre>
   *
   * <code>string ranking_expression = 21;</code>
   *
   * @return The bytes for rankingExpression.
   */
  com.google.protobuf.ByteString getRankingExpressionBytes();

  /**
   *
   *
   * <pre>
   * Output only. ServingConfig created timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. ServingConfig created timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();

  /**
   *
   *
   * <pre>
   * Output only. ServingConfig created timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. ServingConfig updated timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. ServingConfig updated timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. ServingConfig updated timestamp.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Filter controls to use in serving path.
   * All triggered filter controls will be applied.
   * Filter controls must be in the same data store as the serving config.
   * Maximum of 20 filter controls.
   * </pre>
   *
   * <code>repeated string filter_control_ids = 11;</code>
   *
   * @return A list containing the filterControlIds.
   */
  java.util.List<java.lang.String> getFilterControlIdsList();

  /**
   *
   *
   * <pre>
   * Filter controls to use in serving path.
   * All triggered filter controls will be applied.
   * Filter controls must be in the same data store as the serving config.
   * Maximum of 20 filter controls.
   * </pre>
   *
   * <code>repeated string filter_control_ids = 11;</code>
   *
   * @return The count of filterControlIds.
   */
  int getFilterControlIdsCount();

  /**
   *
   *
   * <pre>
   * Filter controls to use in serving path.
   * All triggered filter controls will be applied.
   * Filter controls must be in the same data store as the serving config.
   * Maximum of 20 filter controls.
   * </pre>
   *
   * <code>repeated string filter_control_ids = 11;</code>
   *
   * @param index The index of the element to return.
   * @return The filterControlIds at the given index.
   */
  java.lang.String getFilterControlIds(int index);

  /**
   *
   *
   * <pre>
   * Filter controls to use in serving path.
   * All triggered filter controls will be applied.
   * Filter controls must be in the same data store as the serving config.
   * Maximum of 20 filter controls.
   * </pre>
   *
   * <code>repeated string filter_control_ids = 11;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the filterControlIds at the given index.
   */
  com.google.protobuf.ByteString getFilterControlIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Boost controls to use in serving path.
   * All triggered boost controls will be applied.
   * Boost controls must be in the same data store as the serving config.
   * Maximum of 20 boost controls.
   * </pre>
   *
   * <code>repeated string boost_control_ids = 12;</code>
   *
   * @return A list containing the boostControlIds.
   */
  java.util.List<java.lang.String> getBoostControlIdsList();

  /**
   *
   *
   * <pre>
   * Boost controls to use in serving path.
   * All triggered boost controls will be applied.
   * Boost controls must be in the same data store as the serving config.
   * Maximum of 20 boost controls.
   * </pre>
   *
   * <code>repeated string boost_control_ids = 12;</code>
   *
   * @return The count of boostControlIds.
   */
  int getBoostControlIdsCount();

  /**
   *
   *
   * <pre>
   * Boost controls to use in serving path.
   * All triggered boost controls will be applied.
   * Boost controls must be in the same data store as the serving config.
   * Maximum of 20 boost controls.
   * </pre>
   *
   * <code>repeated string boost_control_ids = 12;</code>
   *
   * @param index The index of the element to return.
   * @return The boostControlIds at the given index.
   */
  java.lang.String getBoostControlIds(int index);

  /**
   *
   *
   * <pre>
   * Boost controls to use in serving path.
   * All triggered boost controls will be applied.
   * Boost controls must be in the same data store as the serving config.
   * Maximum of 20 boost controls.
   * </pre>
   *
   * <code>repeated string boost_control_ids = 12;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the boostControlIds at the given index.
   */
  com.google.protobuf.ByteString getBoostControlIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * IDs of the redirect controls. Only the first triggered redirect
   * action is applied, even if multiple apply. Maximum number of
   * specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string redirect_control_ids = 14;</code>
   *
   * @return A list containing the redirectControlIds.
   */
  java.util.List<java.lang.String> getRedirectControlIdsList();

  /**
   *
   *
   * <pre>
   * IDs of the redirect controls. Only the first triggered redirect
   * action is applied, even if multiple apply. Maximum number of
   * specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string redirect_control_ids = 14;</code>
   *
   * @return The count of redirectControlIds.
   */
  int getRedirectControlIdsCount();

  /**
   *
   *
   * <pre>
   * IDs of the redirect controls. Only the first triggered redirect
   * action is applied, even if multiple apply. Maximum number of
   * specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string redirect_control_ids = 14;</code>
   *
   * @param index The index of the element to return.
   * @return The redirectControlIds at the given index.
   */
  java.lang.String getRedirectControlIds(int index);

  /**
   *
   *
   * <pre>
   * IDs of the redirect controls. Only the first triggered redirect
   * action is applied, even if multiple apply. Maximum number of
   * specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string redirect_control_ids = 14;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the redirectControlIds at the given index.
   */
  com.google.protobuf.ByteString getRedirectControlIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Condition synonyms specifications. If multiple synonyms conditions
   * match, all matching synonyms controls in the list will execute.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string synonyms_control_ids = 15;</code>
   *
   * @return A list containing the synonymsControlIds.
   */
  java.util.List<java.lang.String> getSynonymsControlIdsList();

  /**
   *
   *
   * <pre>
   * Condition synonyms specifications. If multiple synonyms conditions
   * match, all matching synonyms controls in the list will execute.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string synonyms_control_ids = 15;</code>
   *
   * @return The count of synonymsControlIds.
   */
  int getSynonymsControlIdsCount();

  /**
   *
   *
   * <pre>
   * Condition synonyms specifications. If multiple synonyms conditions
   * match, all matching synonyms controls in the list will execute.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string synonyms_control_ids = 15;</code>
   *
   * @param index The index of the element to return.
   * @return The synonymsControlIds at the given index.
   */
  java.lang.String getSynonymsControlIds(int index);

  /**
   *
   *
   * <pre>
   * Condition synonyms specifications. If multiple synonyms conditions
   * match, all matching synonyms controls in the list will execute.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string synonyms_control_ids = 15;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the synonymsControlIds at the given index.
   */
  com.google.protobuf.ByteString getSynonymsControlIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Condition oneway synonyms specifications. If multiple oneway synonyms
   * conditions match, all matching oneway synonyms controls in the list
   * will execute. Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string oneway_synonyms_control_ids = 16;</code>
   *
   * @return A list containing the onewaySynonymsControlIds.
   */
  java.util.List<java.lang.String> getOnewaySynonymsControlIdsList();

  /**
   *
   *
   * <pre>
   * Condition oneway synonyms specifications. If multiple oneway synonyms
   * conditions match, all matching oneway synonyms controls in the list
   * will execute. Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string oneway_synonyms_control_ids = 16;</code>
   *
   * @return The count of onewaySynonymsControlIds.
   */
  int getOnewaySynonymsControlIdsCount();

  /**
   *
   *
   * <pre>
   * Condition oneway synonyms specifications. If multiple oneway synonyms
   * conditions match, all matching oneway synonyms controls in the list
   * will execute. Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string oneway_synonyms_control_ids = 16;</code>
   *
   * @param index The index of the element to return.
   * @return The onewaySynonymsControlIds at the given index.
   */
  java.lang.String getOnewaySynonymsControlIds(int index);

  /**
   *
   *
   * <pre>
   * Condition oneway synonyms specifications. If multiple oneway synonyms
   * conditions match, all matching oneway synonyms controls in the list
   * will execute. Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string oneway_synonyms_control_ids = 16;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the onewaySynonymsControlIds at the given index.
   */
  com.google.protobuf.ByteString getOnewaySynonymsControlIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Condition do not associate specifications. If multiple do not
   * associate conditions match, all matching do not associate controls in
   * the list will execute.
   * Order does not matter.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string dissociate_control_ids = 17;</code>
   *
   * @return A list containing the dissociateControlIds.
   */
  java.util.List<java.lang.String> getDissociateControlIdsList();

  /**
   *
   *
   * <pre>
   * Condition do not associate specifications. If multiple do not
   * associate conditions match, all matching do not associate controls in
   * the list will execute.
   * Order does not matter.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string dissociate_control_ids = 17;</code>
   *
   * @return The count of dissociateControlIds.
   */
  int getDissociateControlIdsCount();

  /**
   *
   *
   * <pre>
   * Condition do not associate specifications. If multiple do not
   * associate conditions match, all matching do not associate controls in
   * the list will execute.
   * Order does not matter.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string dissociate_control_ids = 17;</code>
   *
   * @param index The index of the element to return.
   * @return The dissociateControlIds at the given index.
   */
  java.lang.String getDissociateControlIds(int index);

  /**
   *
   *
   * <pre>
   * Condition do not associate specifications. If multiple do not
   * associate conditions match, all matching do not associate controls in
   * the list will execute.
   * Order does not matter.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string dissociate_control_ids = 17;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the dissociateControlIds at the given index.
   */
  com.google.protobuf.ByteString getDissociateControlIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Condition replacement specifications.
   * Applied according to the order in the list.
   * A previously replaced term can not be re-replaced.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string replacement_control_ids = 18;</code>
   *
   * @return A list containing the replacementControlIds.
   */
  java.util.List<java.lang.String> getReplacementControlIdsList();

  /**
   *
   *
   * <pre>
   * Condition replacement specifications.
   * Applied according to the order in the list.
   * A previously replaced term can not be re-replaced.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string replacement_control_ids = 18;</code>
   *
   * @return The count of replacementControlIds.
   */
  int getReplacementControlIdsCount();

  /**
   *
   *
   * <pre>
   * Condition replacement specifications.
   * Applied according to the order in the list.
   * A previously replaced term can not be re-replaced.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string replacement_control_ids = 18;</code>
   *
   * @param index The index of the element to return.
   * @return The replacementControlIds at the given index.
   */
  java.lang.String getReplacementControlIds(int index);

  /**
   *
   *
   * <pre>
   * Condition replacement specifications.
   * Applied according to the order in the list.
   * A previously replaced term can not be re-replaced.
   * Maximum number of specifications is 100.
   *
   * Can only be set if
   * [SolutionType][google.cloud.discoveryengine.v1.SolutionType] is
   * [SOLUTION_TYPE_SEARCH][google.cloud.discoveryengine.v1.SolutionType.SOLUTION_TYPE_SEARCH].
   * </pre>
   *
   * <code>repeated string replacement_control_ids = 18;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the replacementControlIds at the given index.
   */
  com.google.protobuf.ByteString getReplacementControlIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Condition ignore specifications. If multiple ignore
   * conditions match, all matching ignore controls in the list will
   * execute.
   * Order does not matter.
   * Maximum number of specifications is 100.
   * </pre>
   *
   * <code>repeated string ignore_control_ids = 19;</code>
   *
   * @return A list containing the ignoreControlIds.
   */
  java.util.List<java.lang.String> getIgnoreControlIdsList();

  /**
   *
   *
   * <pre>
   * Condition ignore specifications. If multiple ignore
   * conditions match, all matching ignore controls in the list will
   * execute.
   * Order does not matter.
   * Maximum number of specifications is 100.
   * </pre>
   *
   * <code>repeated string ignore_control_ids = 19;</code>
   *
   * @return The count of ignoreControlIds.
   */
  int getIgnoreControlIdsCount();

  /**
   *
   *
   * <pre>
   * Condition ignore specifications. If multiple ignore
   * conditions match, all matching ignore controls in the list will
   * execute.
   * Order does not matter.
   * Maximum number of specifications is 100.
   * </pre>
   *
   * <code>repeated string ignore_control_ids = 19;</code>
   *
   * @param index The index of the element to return.
   * @return The ignoreControlIds at the given index.
   */
  java.lang.String getIgnoreControlIds(int index);

  /**
   *
   *
   * <pre>
   * Condition ignore specifications. If multiple ignore
   * conditions match, all matching ignore controls in the list will
   * execute.
   * Order does not matter.
   * Maximum number of specifications is 100.
   * </pre>
   *
   * <code>repeated string ignore_control_ids = 19;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the ignoreControlIds at the given index.
   */
  com.google.protobuf.ByteString getIgnoreControlIdsBytes(int index);

  /**
   *
   *
   * <pre>
   * Condition promote specifications.
   *
   * Maximum number of specifications is 100.
   * </pre>
   *
   * <code>repeated string promote_control_ids = 26;</code>
   *
   * @return A list containing the promoteControlIds.
   */
  java.util.List<java.lang.String> getPromoteControlIdsList();

  /**
   *
   *
   * <pre>
   * Condition promote specifications.
   *
   * Maximum number of specifications is 100.
   * </pre>
   *
   * <code>repeated string promote_control_ids = 26;</code>
   *
   * @return The count of promoteControlIds.
   */
  int getPromoteControlIdsCount();

  /**
   *
   *
   * <pre>
   * Condition promote specifications.
   *
   * Maximum number of specifications is 100.
   * </pre>
   *
   * <code>repeated string promote_control_ids = 26;</code>
   *
   * @param index The index of the element to return.
   * @return The promoteControlIds at the given index.
   */
  java.lang.String getPromoteControlIds(int index);

  /**
   *
   *
   * <pre>
   * Condition promote specifications.
   *
   * Maximum number of specifications is 100.
   * </pre>
   *
   * <code>repeated string promote_control_ids = 26;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the promoteControlIds at the given index.
   */
  com.google.protobuf.ByteString getPromoteControlIdsBytes(int index);

  com.google.cloud.discoveryengine.v1.ServingConfig.VerticalConfigCase getVerticalConfigCase();
}
