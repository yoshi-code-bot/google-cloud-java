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
// source: google/devtools/cloudprofiler/v2/profiler.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.cloudprofiler.v2;

public interface ListProfilesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudprofiler.v2.ListProfilesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of profiles fetched.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
   */
  java.util.List<com.google.devtools.cloudprofiler.v2.Profile> getProfilesList();

  /**
   *
   *
   * <pre>
   * List of profiles fetched.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
   */
  com.google.devtools.cloudprofiler.v2.Profile getProfiles(int index);

  /**
   *
   *
   * <pre>
   * List of profiles fetched.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
   */
  int getProfilesCount();

  /**
   *
   *
   * <pre>
   * List of profiles fetched.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
   */
  java.util.List<? extends com.google.devtools.cloudprofiler.v2.ProfileOrBuilder>
      getProfilesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of profiles fetched.
   * </pre>
   *
   * <code>repeated .google.devtools.cloudprofiler.v2.Profile profiles = 1;</code>
   */
  com.google.devtools.cloudprofiler.v2.ProfileOrBuilder getProfilesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Token to receive the next page of results.
   * This field maybe empty if there are no more profiles to fetch.
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
   * This field maybe empty if there are no more profiles to fetch.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Number of profiles that were skipped in the current page since they were
   * not able to be fetched successfully. This should typically be zero. A
   * non-zero value may indicate a transient failure, in which case if the
   * number is too high for your use case, the call may be retried.
   * </pre>
   *
   * <code>int32 skipped_profiles = 3;</code>
   *
   * @return The skippedProfiles.
   */
  int getSkippedProfiles();
}
