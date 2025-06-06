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
// source: google/cloud/securitycenter/settings/v1beta1/component_settings.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.securitycenter.settings.v1beta1;

public interface ComponentSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.settings.v1beta1.ComponentSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of the component settings.
   * Formats:
   *  * `organizations/{organization}/components/{component}/settings`
   *  * `folders/{folder}/components/{component}/settings`
   *  * `projects/{project}/components/{component}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/components/{component}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/components/{component}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/components/{component}/settings`
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
   * The relative resource name of the component settings.
   * Formats:
   *  * `organizations/{organization}/components/{component}/settings`
   *  * `folders/{folder}/components/{component}/settings`
   *  * `projects/{project}/components/{component}/settings`
   *  * `projects/{project}/locations/{location}/clusters/{cluster}/components/{component}/settings`
   *  * `projects/{project}/regions/{region}/clusters/{cluster}/components/{component}/settings`
   *  * `projects/{project}/zones/{zone}/clusters/{cluster}/components/{component}/settings`
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
   * ENABLE to enable component, DISABLE to disable and INHERIT to inherit
   * setting from ancestors.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.ComponentEnablementState state = 2;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();

  /**
   *
   *
   * <pre>
   * ENABLE to enable component, DISABLE to disable and INHERIT to inherit
   * setting from ancestors.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.settings.v1beta1.ComponentEnablementState state = 2;</code>
   *
   * @return The state.
   */
  com.google.cloud.securitycenter.settings.v1beta1.ComponentEnablementState getState();

  /**
   *
   *
   * <pre>
   * Output only. The service account to be used for security center component.
   * The component must have permission to "act as" the service account.
   * </pre>
   *
   * <code>string project_service_account = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The projectServiceAccount.
   */
  java.lang.String getProjectServiceAccount();

  /**
   *
   *
   * <pre>
   * Output only. The service account to be used for security center component.
   * The component must have permission to "act as" the service account.
   * </pre>
   *
   * <code>string project_service_account = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for projectServiceAccount.
   */
  com.google.protobuf.ByteString getProjectServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * Settings for detectors.  Not all detectors must have settings present at
   * each and every level in the hierarchy.  If it is not present the setting
   * will be inherited from its ancestors folders, organizations or the
   * defaults.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.ComponentSettings.DetectorSettings&gt; detector_settings = 4;
   * </code>
   */
  int getDetectorSettingsCount();

  /**
   *
   *
   * <pre>
   * Settings for detectors.  Not all detectors must have settings present at
   * each and every level in the hierarchy.  If it is not present the setting
   * will be inherited from its ancestors folders, organizations or the
   * defaults.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.ComponentSettings.DetectorSettings&gt; detector_settings = 4;
   * </code>
   */
  boolean containsDetectorSettings(java.lang.String key);

  /** Use {@link #getDetectorSettingsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<
          java.lang.String,
          com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings.DetectorSettings>
      getDetectorSettings();

  /**
   *
   *
   * <pre>
   * Settings for detectors.  Not all detectors must have settings present at
   * each and every level in the hierarchy.  If it is not present the setting
   * will be inherited from its ancestors folders, organizations or the
   * defaults.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.ComponentSettings.DetectorSettings&gt; detector_settings = 4;
   * </code>
   */
  java.util.Map<
          java.lang.String,
          com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings.DetectorSettings>
      getDetectorSettingsMap();

  /**
   *
   *
   * <pre>
   * Settings for detectors.  Not all detectors must have settings present at
   * each and every level in the hierarchy.  If it is not present the setting
   * will be inherited from its ancestors folders, organizations or the
   * defaults.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.ComponentSettings.DetectorSettings&gt; detector_settings = 4;
   * </code>
   */
  /* nullable */
  com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings.DetectorSettings
      getDetectorSettingsOrDefault(
          java.lang.String key,
          /* nullable */
          com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings.DetectorSettings
              defaultValue);

  /**
   *
   *
   * <pre>
   * Settings for detectors.  Not all detectors must have settings present at
   * each and every level in the hierarchy.  If it is not present the setting
   * will be inherited from its ancestors folders, organizations or the
   * defaults.
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.securitycenter.settings.v1beta1.ComponentSettings.DetectorSettings&gt; detector_settings = 4;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings.DetectorSettings
      getDetectorSettingsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. An fingerprint used for optimistic concurrency. If none is provided
   * on updates then the existing metadata will be blindly overwritten.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();

  /**
   *
   *
   * <pre>
   * Output only. An fingerprint used for optimistic concurrency. If none is provided
   * on updates then the existing metadata will be blindly overwritten.
   * </pre>
   *
   * <code>string etag = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. The time these settings were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time these settings were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();

  /**
   *
   *
   * <pre>
   * Output only. The time these settings were last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Container Threate Detection specific settings
   * For component, expect CONTAINER_THREAT_DETECTION
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.ContainerThreatDetectionSettings container_threat_detection_settings = 41;
   * </code>
   *
   * @return Whether the containerThreatDetectionSettings field is set.
   */
  boolean hasContainerThreatDetectionSettings();

  /**
   *
   *
   * <pre>
   * Container Threate Detection specific settings
   * For component, expect CONTAINER_THREAT_DETECTION
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.ContainerThreatDetectionSettings container_threat_detection_settings = 41;
   * </code>
   *
   * @return The containerThreatDetectionSettings.
   */
  com.google.cloud.securitycenter.settings.v1beta1.ContainerThreatDetectionSettings
      getContainerThreatDetectionSettings();

  /**
   *
   *
   * <pre>
   * Container Threate Detection specific settings
   * For component, expect CONTAINER_THREAT_DETECTION
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.ContainerThreatDetectionSettings container_threat_detection_settings = 41;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.ContainerThreatDetectionSettingsOrBuilder
      getContainerThreatDetectionSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Event Threat Detection specific settings
   * For component, expect EVENT_THREAT_DETECTION
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.EventThreatDetectionSettings event_threat_detection_settings = 42;
   * </code>
   *
   * @return Whether the eventThreatDetectionSettings field is set.
   */
  boolean hasEventThreatDetectionSettings();

  /**
   *
   *
   * <pre>
   * Event Threat Detection specific settings
   * For component, expect EVENT_THREAT_DETECTION
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.EventThreatDetectionSettings event_threat_detection_settings = 42;
   * </code>
   *
   * @return The eventThreatDetectionSettings.
   */
  com.google.cloud.securitycenter.settings.v1beta1.EventThreatDetectionSettings
      getEventThreatDetectionSettings();

  /**
   *
   *
   * <pre>
   * Event Threat Detection specific settings
   * For component, expect EVENT_THREAT_DETECTION
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.EventThreatDetectionSettings event_threat_detection_settings = 42;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.EventThreatDetectionSettingsOrBuilder
      getEventThreatDetectionSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Security Health Analytics specific settings
   * For component, expect SECURITY_HEALTH_ANALYTICS
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings security_health_analytics_settings = 44;
   * </code>
   *
   * @return Whether the securityHealthAnalyticsSettings field is set.
   */
  boolean hasSecurityHealthAnalyticsSettings();

  /**
   *
   *
   * <pre>
   * Security Health Analytics specific settings
   * For component, expect SECURITY_HEALTH_ANALYTICS
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings security_health_analytics_settings = 44;
   * </code>
   *
   * @return The securityHealthAnalyticsSettings.
   */
  com.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings
      getSecurityHealthAnalyticsSettings();

  /**
   *
   *
   * <pre>
   * Security Health Analytics specific settings
   * For component, expect SECURITY_HEALTH_ANALYTICS
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettings security_health_analytics_settings = 44;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.SecurityHealthAnalyticsSettingsOrBuilder
      getSecurityHealthAnalyticsSettingsOrBuilder();

  /**
   *
   *
   * <pre>
   * Web Security Scanner specific settings
   * For component, expect WEB_SECURITY_SCANNER
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.WebSecurityScanner web_security_scanner_settings = 40;
   * </code>
   *
   * @return Whether the webSecurityScannerSettings field is set.
   */
  boolean hasWebSecurityScannerSettings();

  /**
   *
   *
   * <pre>
   * Web Security Scanner specific settings
   * For component, expect WEB_SECURITY_SCANNER
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.WebSecurityScanner web_security_scanner_settings = 40;
   * </code>
   *
   * @return The webSecurityScannerSettings.
   */
  com.google.cloud.securitycenter.settings.v1beta1.WebSecurityScanner
      getWebSecurityScannerSettings();

  /**
   *
   *
   * <pre>
   * Web Security Scanner specific settings
   * For component, expect WEB_SECURITY_SCANNER
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.settings.v1beta1.WebSecurityScanner web_security_scanner_settings = 40;
   * </code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.WebSecurityScannerOrBuilder
      getWebSecurityScannerSettingsOrBuilder();

  com.google.cloud.securitycenter.settings.v1beta1.ComponentSettings.SpecificSettingsCase
      getSpecificSettingsCase();
}
