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
// source: google/devtools/artifactregistry/v1/vpcsc_config.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1;

public interface VPCSCConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1.VPCSCConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the project's VPC SC Config.
   *
   * Always of the form:
   * projects/{projectID}/locations/{location}/vpcscConfig
   *
   * In update request: never set
   * In response: always set
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * The name of the project's VPC SC Config.
   *
   * Always of the form:
   * projects/{projectID}/locations/{location}/vpcscConfig
   *
   * In update request: never set
   * In response: always set
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The project per location VPC SC policy that defines the VPC SC behavior for
   * the Remote Repository (Allow/Deny).
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy vpcsc_policy = 2;</code>
   *
   * @return The enum numeric value on the wire for vpcscPolicy.
   */
  int getVpcscPolicyValue();

  /**
   *
   *
   * <pre>
   * The project per location VPC SC policy that defines the VPC SC behavior for
   * the Remote Repository (Allow/Deny).
   * </pre>
   *
   * <code>.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy vpcsc_policy = 2;</code>
   *
   * @return The vpcscPolicy.
   */
  com.google.devtools.artifactregistry.v1.VPCSCConfig.VPCSCPolicy getVpcscPolicy();
}
