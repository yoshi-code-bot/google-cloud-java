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

public interface SubnetworkParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SubnetworkParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Tag keys/values directly bound to this resource. Tag keys and values have the same definition as resource manager tags. The field is allowed for INSERT only. The keys/values to set on the resource should be specified in either ID { : } or Namespaced format { : }. For example the following are valid inputs: * {"tagKeys/333" : "tagValues/444", "tagKeys/123" : "tagValues/456"} * {"123/environment" : "production", "345/abc" : "xyz"} Note: * Invalid combinations of ID &amp; namespaced format is not supported. For instance: {"123/environment" : "tagValues/444"} is invalid.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  int getResourceManagerTagsCount();

  /**
   *
   *
   * <pre>
   * Tag keys/values directly bound to this resource. Tag keys and values have the same definition as resource manager tags. The field is allowed for INSERT only. The keys/values to set on the resource should be specified in either ID { : } or Namespaced format { : }. For example the following are valid inputs: * {"tagKeys/333" : "tagValues/444", "tagKeys/123" : "tagValues/456"} * {"123/environment" : "production", "345/abc" : "xyz"} Note: * Invalid combinations of ID &amp; namespaced format is not supported. For instance: {"123/environment" : "tagValues/444"} is invalid.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  boolean containsResourceManagerTags(java.lang.String key);

  /** Use {@link #getResourceManagerTagsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getResourceManagerTags();

  /**
   *
   *
   * <pre>
   * Tag keys/values directly bound to this resource. Tag keys and values have the same definition as resource manager tags. The field is allowed for INSERT only. The keys/values to set on the resource should be specified in either ID { : } or Namespaced format { : }. For example the following are valid inputs: * {"tagKeys/333" : "tagValues/444", "tagKeys/123" : "tagValues/456"} * {"123/environment" : "production", "345/abc" : "xyz"} Note: * Invalid combinations of ID &amp; namespaced format is not supported. For instance: {"123/environment" : "tagValues/444"} is invalid.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getResourceManagerTagsMap();

  /**
   *
   *
   * <pre>
   * Tag keys/values directly bound to this resource. Tag keys and values have the same definition as resource manager tags. The field is allowed for INSERT only. The keys/values to set on the resource should be specified in either ID { : } or Namespaced format { : }. For example the following are valid inputs: * {"tagKeys/333" : "tagValues/444", "tagKeys/123" : "tagValues/456"} * {"123/environment" : "production", "345/abc" : "xyz"} Note: * Invalid combinations of ID &amp; namespaced format is not supported. For instance: {"123/environment" : "tagValues/444"} is invalid.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  /* nullable */
  java.lang.String getResourceManagerTagsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);

  /**
   *
   *
   * <pre>
   * Tag keys/values directly bound to this resource. Tag keys and values have the same definition as resource manager tags. The field is allowed for INSERT only. The keys/values to set on the resource should be specified in either ID { : } or Namespaced format { : }. For example the following are valid inputs: * {"tagKeys/333" : "tagValues/444", "tagKeys/123" : "tagValues/456"} * {"123/environment" : "production", "345/abc" : "xyz"} Note: * Invalid combinations of ID &amp; namespaced format is not supported. For instance: {"123/environment" : "tagValues/444"} is invalid.
   * </pre>
   *
   * <code>map&lt;string, string&gt; resource_manager_tags = 377671164;</code>
   */
  java.lang.String getResourceManagerTagsOrThrow(java.lang.String key);
}
