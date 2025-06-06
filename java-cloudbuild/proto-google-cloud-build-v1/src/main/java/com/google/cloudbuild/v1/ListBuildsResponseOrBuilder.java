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
// source: google/devtools/cloudbuild/v1/cloudbuild.proto

// Protobuf Java Version: 3.25.8
package com.google.cloudbuild.v1;

public interface ListBuildsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudbuild.v1.ListBuildsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Builds will be sorted by `create_time`, descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
   */
  java.util.List<com.google.cloudbuild.v1.Build> getBuildsList();

  /**
   *
   *
   * <pre>
   * Builds will be sorted by `create_time`, descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
   */
  com.google.cloudbuild.v1.Build getBuilds(int index);

  /**
   *
   *
   * <pre>
   * Builds will be sorted by `create_time`, descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
   */
  int getBuildsCount();

  /**
   *
   *
   * <pre>
   * Builds will be sorted by `create_time`, descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
   */
  java.util.List<? extends com.google.cloudbuild.v1.BuildOrBuilder> getBuildsOrBuilderList();

  /**
   *
   *
   * <pre>
   * Builds will be sorted by `create_time`, descending.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudbuild.v1.Build builds = 1;</code>
   */
  com.google.cloudbuild.v1.BuildOrBuilder getBuildsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to receive the next page of results.
   * This will be absent if the end of the response list has been reached.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * Token to receive the next page of results.
   * This will be absent if the end of the response list has been reached.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
