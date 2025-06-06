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
// source: google/cloud/gkehub/policycontroller/v1beta/policycontroller.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.gkehub.policycontroller.v1beta;

public interface PolicyContentSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.policycontroller.v1beta.PolicyContentSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * map of bundle name to BundleInstallSpec. The bundle name maps to the
   * `bundleName` key in the `policycontroller.gke.io/constraintData` annotation
   * on a constraint.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.gkehub.policycontroller.v1beta.BundleInstallSpec&gt; bundles = 1;
   * </code>
   */
  int getBundlesCount();

  /**
   *
   *
   * <pre>
   * map of bundle name to BundleInstallSpec. The bundle name maps to the
   * `bundleName` key in the `policycontroller.gke.io/constraintData` annotation
   * on a constraint.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.gkehub.policycontroller.v1beta.BundleInstallSpec&gt; bundles = 1;
   * </code>
   */
  boolean containsBundles(java.lang.String key);

  /** Use {@link #getBundlesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.gkehub.policycontroller.v1beta.BundleInstallSpec>
      getBundles();

  /**
   *
   *
   * <pre>
   * map of bundle name to BundleInstallSpec. The bundle name maps to the
   * `bundleName` key in the `policycontroller.gke.io/constraintData` annotation
   * on a constraint.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.gkehub.policycontroller.v1beta.BundleInstallSpec&gt; bundles = 1;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.gkehub.policycontroller.v1beta.BundleInstallSpec>
      getBundlesMap();

  /**
   *
   *
   * <pre>
   * map of bundle name to BundleInstallSpec. The bundle name maps to the
   * `bundleName` key in the `policycontroller.gke.io/constraintData` annotation
   * on a constraint.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.gkehub.policycontroller.v1beta.BundleInstallSpec&gt; bundles = 1;
   * </code>
   */
  /* nullable */
  com.google.cloud.gkehub.policycontroller.v1beta.BundleInstallSpec getBundlesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.gkehub.policycontroller.v1beta.BundleInstallSpec defaultValue);

  /**
   *
   *
   * <pre>
   * map of bundle name to BundleInstallSpec. The bundle name maps to the
   * `bundleName` key in the `policycontroller.gke.io/constraintData` annotation
   * on a constraint.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.gkehub.policycontroller.v1beta.BundleInstallSpec&gt; bundles = 1;
   * </code>
   */
  com.google.cloud.gkehub.policycontroller.v1beta.BundleInstallSpec getBundlesOrThrow(
      java.lang.String key);

  /**
   *
   *
   * <pre>
   * Configures the installation of the Template Library.
   * </pre>
   *
   * <code>.google.cloud.gkehub.policycontroller.v1beta.TemplateLibraryConfig template_library = 2;
   * </code>
   *
   * @return Whether the templateLibrary field is set.
   */
  boolean hasTemplateLibrary();

  /**
   *
   *
   * <pre>
   * Configures the installation of the Template Library.
   * </pre>
   *
   * <code>.google.cloud.gkehub.policycontroller.v1beta.TemplateLibraryConfig template_library = 2;
   * </code>
   *
   * @return The templateLibrary.
   */
  com.google.cloud.gkehub.policycontroller.v1beta.TemplateLibraryConfig getTemplateLibrary();

  /**
   *
   *
   * <pre>
   * Configures the installation of the Template Library.
   * </pre>
   *
   * <code>.google.cloud.gkehub.policycontroller.v1beta.TemplateLibraryConfig template_library = 2;
   * </code>
   */
  com.google.cloud.gkehub.policycontroller.v1beta.TemplateLibraryConfigOrBuilder
      getTemplateLibraryOrBuilder();
}
