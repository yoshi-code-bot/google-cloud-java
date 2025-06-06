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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.bigquery.analyticshub.v1;

public interface SharingEnvironmentConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Default Analytics Hub data exchange, used for secured data sharing.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.DefaultExchangeConfig default_exchange_config = 1;
   * </code>
   *
   * @return Whether the defaultExchangeConfig field is set.
   */
  boolean hasDefaultExchangeConfig();

  /**
   *
   *
   * <pre>
   * Default Analytics Hub data exchange, used for secured data sharing.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.DefaultExchangeConfig default_exchange_config = 1;
   * </code>
   *
   * @return The defaultExchangeConfig.
   */
  com.google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.DefaultExchangeConfig
      getDefaultExchangeConfig();

  /**
   *
   *
   * <pre>
   * Default Analytics Hub data exchange, used for secured data sharing.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.DefaultExchangeConfig default_exchange_config = 1;
   * </code>
   */
  com.google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.DefaultExchangeConfigOrBuilder
      getDefaultExchangeConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Data Clean Room (DCR), used for privacy-safe and secured data sharing.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.DcrExchangeConfig dcr_exchange_config = 2;
   * </code>
   *
   * @return Whether the dcrExchangeConfig field is set.
   */
  boolean hasDcrExchangeConfig();

  /**
   *
   *
   * <pre>
   * Data Clean Room (DCR), used for privacy-safe and secured data sharing.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.DcrExchangeConfig dcr_exchange_config = 2;
   * </code>
   *
   * @return The dcrExchangeConfig.
   */
  com.google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.DcrExchangeConfig
      getDcrExchangeConfig();

  /**
   *
   *
   * <pre>
   * Data Clean Room (DCR), used for privacy-safe and secured data sharing.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.DcrExchangeConfig dcr_exchange_config = 2;
   * </code>
   */
  com.google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.DcrExchangeConfigOrBuilder
      getDcrExchangeConfigOrBuilder();

  com.google.cloud.bigquery.analyticshub.v1.SharingEnvironmentConfig.EnvironmentCase
      getEnvironmentCase();
}
