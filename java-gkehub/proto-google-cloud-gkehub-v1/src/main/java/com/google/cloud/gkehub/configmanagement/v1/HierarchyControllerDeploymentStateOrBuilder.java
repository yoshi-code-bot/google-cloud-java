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
// source: google/cloud/gkehub/v1/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.configmanagement.v1;

public interface HierarchyControllerDeploymentStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1.HierarchyControllerDeploymentState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The deployment state for open source HNC (e.g. v0.7.0-hc.0)
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState hnc = 1;</code>
   *
   * @return The enum numeric value on the wire for hnc.
   */
  int getHncValue();

  /**
   *
   *
   * <pre>
   * The deployment state for open source HNC (e.g. v0.7.0-hc.0)
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState hnc = 1;</code>
   *
   * @return The hnc.
   */
  com.google.cloud.gkehub.configmanagement.v1.DeploymentState getHnc();

  /**
   *
   *
   * <pre>
   * The deployment state for Hierarchy Controller extension (e.g. v0.7.0-hc.1)
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState extension = 2;</code>
   *
   * @return The enum numeric value on the wire for extension.
   */
  int getExtensionValue();

  /**
   *
   *
   * <pre>
   * The deployment state for Hierarchy Controller extension (e.g. v0.7.0-hc.1)
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.DeploymentState extension = 2;</code>
   *
   * @return The extension.
   */
  com.google.cloud.gkehub.configmanagement.v1.DeploymentState getExtension();
}
