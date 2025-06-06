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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

public interface RouteAsPathOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.RouteAsPath)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * [Output Only] The AS numbers of the AS Path.
   * </pre>
   *
   * <code>repeated uint32 as_lists = 134112584;</code>
   *
   * @return A list containing the asLists.
   */
  java.util.List<java.lang.Integer> getAsListsList();

  /**
   *
   *
   * <pre>
   * [Output Only] The AS numbers of the AS Path.
   * </pre>
   *
   * <code>repeated uint32 as_lists = 134112584;</code>
   *
   * @return The count of asLists.
   */
  int getAsListsCount();

  /**
   *
   *
   * <pre>
   * [Output Only] The AS numbers of the AS Path.
   * </pre>
   *
   * <code>repeated uint32 as_lists = 134112584;</code>
   *
   * @param index The index of the element to return.
   * @return The asLists at the given index.
   */
  int getAsLists(int index);

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
   * Check the PathSegmentType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string path_segment_type = 513464992;</code>
   *
   * @return Whether the pathSegmentType field is set.
   */
  boolean hasPathSegmentType();

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
   * Check the PathSegmentType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string path_segment_type = 513464992;</code>
   *
   * @return The pathSegmentType.
   */
  java.lang.String getPathSegmentType();

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
   * Check the PathSegmentType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string path_segment_type = 513464992;</code>
   *
   * @return The bytes for pathSegmentType.
   */
  com.google.protobuf.ByteString getPathSegmentTypeBytes();
}
