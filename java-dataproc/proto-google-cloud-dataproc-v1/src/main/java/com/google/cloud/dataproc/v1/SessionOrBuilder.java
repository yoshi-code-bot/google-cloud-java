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
// source: google/cloud/dataproc/v1/sessions.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dataproc.v1;

public interface SessionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.Session)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the session.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. The resource name of the session.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. A session UUID (Unique Universal Identifier). The service
   * generates this value when it creates the session.
   * </pre>
   *
   * <code>string uuid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uuid.
   */
  java.lang.String getUuid();

  /**
   *
   *
   * <pre>
   * Output only. A session UUID (Unique Universal Identifier). The service
   * generates this value when it creates the session.
   * </pre>
   *
   * <code>string uuid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uuid.
   */
  com.google.protobuf.ByteString getUuidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the session was created.
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
   * Output only. The time when the session was created.
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
   * Output only. The time when the session was created.
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
   * Optional. Jupyter session config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JupyterConfig jupyter_session = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the jupyterSession field is set.
   */
  boolean hasJupyterSession();

  /**
   *
   *
   * <pre>
   * Optional. Jupyter session config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JupyterConfig jupyter_session = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The jupyterSession.
   */
  com.google.cloud.dataproc.v1.JupyterConfig getJupyterSession();

  /**
   *
   *
   * <pre>
   * Optional. Jupyter session config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.JupyterConfig jupyter_session = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.JupyterConfigOrBuilder getJupyterSessionOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Spark Connect session config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkConnectConfig spark_connect_session = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the sparkConnectSession field is set.
   */
  boolean hasSparkConnectSession();

  /**
   *
   *
   * <pre>
   * Optional. Spark Connect session config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkConnectConfig spark_connect_session = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sparkConnectSession.
   */
  com.google.cloud.dataproc.v1.SparkConnectConfig getSparkConnectSession();

  /**
   *
   *
   * <pre>
   * Optional. Spark Connect session config.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.SparkConnectConfig spark_connect_session = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.SparkConnectConfigOrBuilder getSparkConnectSessionOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Runtime information about session execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeInfo runtime_info = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the runtimeInfo field is set.
   */
  boolean hasRuntimeInfo();

  /**
   *
   *
   * <pre>
   * Output only. Runtime information about session execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeInfo runtime_info = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The runtimeInfo.
   */
  com.google.cloud.dataproc.v1.RuntimeInfo getRuntimeInfo();

  /**
   *
   *
   * <pre>
   * Output only. Runtime information about session execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeInfo runtime_info = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.RuntimeInfoOrBuilder getRuntimeInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A state of the session.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.Session.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * Output only. A state of the session.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.Session.State state = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.dataproc.v1.Session.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Session state details, such as the failure
   * description if the state is `FAILED`.
   * </pre>
   *
   * <code>string state_message = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateMessage.
   */
  java.lang.String getStateMessage();

  /**
   *
   *
   * <pre>
   * Output only. Session state details, such as the failure
   * description if the state is `FAILED`.
   * </pre>
   *
   * <code>string state_message = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateMessage.
   */
  com.google.protobuf.ByteString getStateMessageBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time when the session entered the current state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the stateTime field is set.
   */
  boolean hasStateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the session entered the current state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The stateTime.
   */
  com.google.protobuf.Timestamp getStateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time when the session entered the current state.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp state_time = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The email address of the user who created the session.
   * </pre>
   *
   * <code>string creator = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The creator.
   */
  java.lang.String getCreator();

  /**
   *
   *
   * <pre>
   * Output only. The email address of the user who created the session.
   * </pre>
   *
   * <code>string creator = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for creator.
   */
  com.google.protobuf.ByteString getCreatorBytes();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with the session.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a session.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with the session.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a session.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);

  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with the session.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a session.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with the session.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a session.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Optional. The labels to associate with the session.
   * Label **keys** must contain 1 to 63 characters, and must conform to
   * [RFC 1035](https://www.ietf.org/rfc/rfc1035.txt).
   * Label **values** may be empty, but, if present, must contain 1 to 63
   * characters, and must conform to [RFC
   * 1035](https://www.ietf.org/rfc/rfc1035.txt). No more than 32 labels can be
   * associated with a session.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Runtime configuration for the session execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeConfig runtime_config = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the runtimeConfig field is set.
   */
  boolean hasRuntimeConfig();

  /**
   *
   *
   * <pre>
   * Optional. Runtime configuration for the session execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeConfig runtime_config = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The runtimeConfig.
   */
  com.google.cloud.dataproc.v1.RuntimeConfig getRuntimeConfig();

  /**
   *
   *
   * <pre>
   * Optional. Runtime configuration for the session execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RuntimeConfig runtime_config = 12 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.RuntimeConfigOrBuilder getRuntimeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Environment configuration for the session execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EnvironmentConfig environment_config = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the environmentConfig field is set.
   */
  boolean hasEnvironmentConfig();

  /**
   *
   *
   * <pre>
   * Optional. Environment configuration for the session execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EnvironmentConfig environment_config = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The environmentConfig.
   */
  com.google.cloud.dataproc.v1.EnvironmentConfig getEnvironmentConfig();

  /**
   *
   *
   * <pre>
   * Optional. Environment configuration for the session execution.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.EnvironmentConfig environment_config = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.EnvironmentConfigOrBuilder getEnvironmentConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The email address of the user who owns the session.
   * </pre>
   *
   * <code>string user = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The user.
   */
  java.lang.String getUser();

  /**
   *
   *
   * <pre>
   * Optional. The email address of the user who owns the session.
   * </pre>
   *
   * <code>string user = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for user.
   */
  com.google.protobuf.ByteString getUserBytes();

  /**
   *
   *
   * <pre>
   * Output only. Historical state information for the session.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Session.SessionStateHistory state_history = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.cloud.dataproc.v1.Session.SessionStateHistory> getStateHistoryList();

  /**
   *
   *
   * <pre>
   * Output only. Historical state information for the session.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Session.SessionStateHistory state_history = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.Session.SessionStateHistory getStateHistory(int index);

  /**
   *
   *
   * <pre>
   * Output only. Historical state information for the session.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Session.SessionStateHistory state_history = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getStateHistoryCount();

  /**
   *
   *
   * <pre>
   * Output only. Historical state information for the session.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Session.SessionStateHistory state_history = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.cloud.dataproc.v1.Session.SessionStateHistoryOrBuilder>
      getStateHistoryOrBuilderList();

  /**
   *
   *
   * <pre>
   * Output only. Historical state information for the session.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.dataproc.v1.Session.SessionStateHistory state_history = 15 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.dataproc.v1.Session.SessionStateHistoryOrBuilder getStateHistoryOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. The session template used by the session.
   *
   * Only resource names, including project ID and location, are valid.
   *
   * Example:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/sessionTemplates/[template_id]`
   * * `projects/[project_id]/locations/[dataproc_region]/sessionTemplates/[template_id]`
   *
   * The template must be in the same project and Dataproc region as the
   * session.
   * </pre>
   *
   * <code>
   * string session_template = 16 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The sessionTemplate.
   */
  java.lang.String getSessionTemplate();

  /**
   *
   *
   * <pre>
   * Optional. The session template used by the session.
   *
   * Only resource names, including project ID and location, are valid.
   *
   * Example:
   * * `https://www.googleapis.com/compute/v1/projects/[project_id]/locations/[dataproc_region]/sessionTemplates/[template_id]`
   * * `projects/[project_id]/locations/[dataproc_region]/sessionTemplates/[template_id]`
   *
   * The template must be in the same project and Dataproc region as the
   * session.
   * </pre>
   *
   * <code>
   * string session_template = 16 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for sessionTemplate.
   */
  com.google.protobuf.ByteString getSessionTemplateBytes();

  com.google.cloud.dataproc.v1.Session.SessionConfigCase getSessionConfigCase();
}
