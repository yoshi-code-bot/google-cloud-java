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

public interface SecurityPolicyRuleRateLimitOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
   * </pre>
   *
   * <code>optional int32 ban_duration_sec = 42896726;</code>
   *
   * @return Whether the banDurationSec field is set.
   */
  boolean hasBanDurationSec();

  /**
   *
   *
   * <pre>
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
   * </pre>
   *
   * <code>optional int32 ban_duration_sec = 42896726;</code>
   *
   * @return The banDurationSec.
   */
  int getBanDurationSec();

  /**
   *
   *
   * <pre>
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key will be banned for the configured 'ban_duration_sec' when the number of requests that exceed the 'rate_limit_threshold' also exceed this 'ban_threshold'.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThreshold ban_threshold = 501208123;
   * </code>
   *
   * @return Whether the banThreshold field is set.
   */
  boolean hasBanThreshold();

  /**
   *
   *
   * <pre>
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key will be banned for the configured 'ban_duration_sec' when the number of requests that exceed the 'rate_limit_threshold' also exceed this 'ban_threshold'.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThreshold ban_threshold = 501208123;
   * </code>
   *
   * @return The banThreshold.
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThreshold getBanThreshold();

  /**
   *
   *
   * <pre>
   * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key will be banned for the configured 'ban_duration_sec' when the number of requests that exceed the 'rate_limit_threshold' also exceed this 'ban_threshold'.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThreshold ban_threshold = 501208123;
   * </code>
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThresholdOrBuilder
      getBanThresholdOrBuilder();

  /**
   *
   *
   * <pre>
   * Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
   * </pre>
   *
   * <code>optional string conform_action = 517612367;</code>
   *
   * @return Whether the conformAction field is set.
   */
  boolean hasConformAction();

  /**
   *
   *
   * <pre>
   * Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
   * </pre>
   *
   * <code>optional string conform_action = 517612367;</code>
   *
   * @return The conformAction.
   */
  java.lang.String getConformAction();

  /**
   *
   *
   * <pre>
   * Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
   * </pre>
   *
   * <code>optional string conform_action = 517612367;</code>
   *
   * @return The bytes for conformAction.
   */
  com.google.protobuf.ByteString getConformActionBytes();

  /**
   *
   *
   * <pre>
   * Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if "enforceOnKey" is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under "enforceOnKeyName". The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under "enforceOnKeyName". The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL. - HTTP_PATH: The URL path of the HTTP request. The key value is truncated to the first 128 bytes. - SNI: Server name indication in the TLS session of the HTTPS request. The key value is truncated to the first 128 bytes. The key type defaults to ALL on a HTTP session. - REGION_CODE: The country/region from which the request originates. - TLS_JA3_FINGERPRINT: JA3 TLS/SSL fingerprint if the client connects using HTTPS, HTTP/2 or HTTP/3. If not available, the key type defaults to ALL. - USER_IP: The IP address of the originating client, which is resolved based on "userIpRequestHeaders" configured with the security policy. If there is no "userIpRequestHeaders" configuration or an IP address cannot be resolved from it, the key type defaults to IP. - TLS_JA4_FINGERPRINT: JA4 TLS/SSL fingerprint if the client connects using HTTPS, HTTP/2 or HTTP/3. If not available, the key type defaults to ALL.
   * Check the EnforceOnKey enum for the list of possible values.
   * </pre>
   *
   * <code>optional string enforce_on_key = 416648956;</code>
   *
   * @return Whether the enforceOnKey field is set.
   */
  boolean hasEnforceOnKey();

  /**
   *
   *
   * <pre>
   * Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if "enforceOnKey" is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under "enforceOnKeyName". The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under "enforceOnKeyName". The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL. - HTTP_PATH: The URL path of the HTTP request. The key value is truncated to the first 128 bytes. - SNI: Server name indication in the TLS session of the HTTPS request. The key value is truncated to the first 128 bytes. The key type defaults to ALL on a HTTP session. - REGION_CODE: The country/region from which the request originates. - TLS_JA3_FINGERPRINT: JA3 TLS/SSL fingerprint if the client connects using HTTPS, HTTP/2 or HTTP/3. If not available, the key type defaults to ALL. - USER_IP: The IP address of the originating client, which is resolved based on "userIpRequestHeaders" configured with the security policy. If there is no "userIpRequestHeaders" configuration or an IP address cannot be resolved from it, the key type defaults to IP. - TLS_JA4_FINGERPRINT: JA4 TLS/SSL fingerprint if the client connects using HTTPS, HTTP/2 or HTTP/3. If not available, the key type defaults to ALL.
   * Check the EnforceOnKey enum for the list of possible values.
   * </pre>
   *
   * <code>optional string enforce_on_key = 416648956;</code>
   *
   * @return The enforceOnKey.
   */
  java.lang.String getEnforceOnKey();

  /**
   *
   *
   * <pre>
   * Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if "enforceOnKey" is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under "enforceOnKeyName". The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key defaults to the source IP address of the request i.e. key type IP. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under "enforceOnKeyName". The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL. - HTTP_PATH: The URL path of the HTTP request. The key value is truncated to the first 128 bytes. - SNI: Server name indication in the TLS session of the HTTPS request. The key value is truncated to the first 128 bytes. The key type defaults to ALL on a HTTP session. - REGION_CODE: The country/region from which the request originates. - TLS_JA3_FINGERPRINT: JA3 TLS/SSL fingerprint if the client connects using HTTPS, HTTP/2 or HTTP/3. If not available, the key type defaults to ALL. - USER_IP: The IP address of the originating client, which is resolved based on "userIpRequestHeaders" configured with the security policy. If there is no "userIpRequestHeaders" configuration or an IP address cannot be resolved from it, the key type defaults to IP. - TLS_JA4_FINGERPRINT: JA4 TLS/SSL fingerprint if the client connects using HTTPS, HTTP/2 or HTTP/3. If not available, the key type defaults to ALL.
   * Check the EnforceOnKey enum for the list of possible values.
   * </pre>
   *
   * <code>optional string enforce_on_key = 416648956;</code>
   *
   * @return The bytes for enforceOnKey.
   */
  com.google.protobuf.ByteString getEnforceOnKeyBytes();

  /**
   *
   *
   * <pre>
   * If specified, any combination of values of enforce_on_key_type/enforce_on_key_name is treated as the key on which ratelimit threshold/action is enforced. You can specify up to 3 enforce_on_key_configs. If enforce_on_key_configs is specified, enforce_on_key must not be specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig enforce_on_key_configs = 33906478;
   * </code>
   */
  java.util.List<com.google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig>
      getEnforceOnKeyConfigsList();

  /**
   *
   *
   * <pre>
   * If specified, any combination of values of enforce_on_key_type/enforce_on_key_name is treated as the key on which ratelimit threshold/action is enforced. You can specify up to 3 enforce_on_key_configs. If enforce_on_key_configs is specified, enforce_on_key must not be specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig enforce_on_key_configs = 33906478;
   * </code>
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig
      getEnforceOnKeyConfigs(int index);

  /**
   *
   *
   * <pre>
   * If specified, any combination of values of enforce_on_key_type/enforce_on_key_name is treated as the key on which ratelimit threshold/action is enforced. You can specify up to 3 enforce_on_key_configs. If enforce_on_key_configs is specified, enforce_on_key must not be specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig enforce_on_key_configs = 33906478;
   * </code>
   */
  int getEnforceOnKeyConfigsCount();

  /**
   *
   *
   * <pre>
   * If specified, any combination of values of enforce_on_key_type/enforce_on_key_name is treated as the key on which ratelimit threshold/action is enforced. You can specify up to 3 enforce_on_key_configs. If enforce_on_key_configs is specified, enforce_on_key must not be specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig enforce_on_key_configs = 33906478;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.compute.v1
                  .SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfigOrBuilder>
      getEnforceOnKeyConfigsOrBuilderList();

  /**
   *
   *
   * <pre>
   * If specified, any combination of values of enforce_on_key_type/enforce_on_key_name is treated as the key on which ratelimit threshold/action is enforced. You can specify up to 3 enforce_on_key_configs. If enforce_on_key_configs is specified, enforce_on_key must not be specified.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfig enforce_on_key_configs = 33906478;
   * </code>
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsEnforceOnKeyConfigOrBuilder
      getEnforceOnKeyConfigsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
   * </pre>
   *
   * <code>optional string enforce_on_key_name = 132555246;</code>
   *
   * @return Whether the enforceOnKeyName field is set.
   */
  boolean hasEnforceOnKeyName();

  /**
   *
   *
   * <pre>
   * Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
   * </pre>
   *
   * <code>optional string enforce_on_key_name = 132555246;</code>
   *
   * @return The enforceOnKeyName.
   */
  java.lang.String getEnforceOnKeyName();

  /**
   *
   *
   * <pre>
   * Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
   * </pre>
   *
   * <code>optional string enforce_on_key_name = 132555246;</code>
   *
   * @return The bytes for enforceOnKeyName.
   */
  com.google.protobuf.ByteString getEnforceOnKeyNameBytes();

  /**
   *
   *
   * <pre>
   * Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are `deny(STATUS)`, where valid values for `STATUS` are 403, 404, 429, and 502, and `redirect`, where the redirect parameters come from `exceedRedirectOptions` below. The `redirect` action is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>optional string exceed_action = 167159073;</code>
   *
   * @return Whether the exceedAction field is set.
   */
  boolean hasExceedAction();

  /**
   *
   *
   * <pre>
   * Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are `deny(STATUS)`, where valid values for `STATUS` are 403, 404, 429, and 502, and `redirect`, where the redirect parameters come from `exceedRedirectOptions` below. The `redirect` action is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>optional string exceed_action = 167159073;</code>
   *
   * @return The exceedAction.
   */
  java.lang.String getExceedAction();

  /**
   *
   *
   * <pre>
   * Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are `deny(STATUS)`, where valid values for `STATUS` are 403, 404, 429, and 502, and `redirect`, where the redirect parameters come from `exceedRedirectOptions` below. The `redirect` action is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>optional string exceed_action = 167159073;</code>
   *
   * @return The bytes for exceedAction.
   */
  com.google.protobuf.ByteString getExceedActionBytes();

  /**
   *
   *
   * <pre>
   * Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyRuleRedirectOptions exceed_redirect_options = 473646694;
   * </code>
   *
   * @return Whether the exceedRedirectOptions field is set.
   */
  boolean hasExceedRedirectOptions();

  /**
   *
   *
   * <pre>
   * Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyRuleRedirectOptions exceed_redirect_options = 473646694;
   * </code>
   *
   * @return The exceedRedirectOptions.
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleRedirectOptions getExceedRedirectOptions();

  /**
   *
   *
   * <pre>
   * Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect. This field is only supported in Global Security Policies of type CLOUD_ARMOR.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyRuleRedirectOptions exceed_redirect_options = 473646694;
   * </code>
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleRedirectOptionsOrBuilder
      getExceedRedirectOptionsOrBuilder();

  /**
   *
   *
   * <pre>
   * Threshold at which to begin ratelimiting.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThreshold rate_limit_threshold = 315875208;
   * </code>
   *
   * @return Whether the rateLimitThreshold field is set.
   */
  boolean hasRateLimitThreshold();

  /**
   *
   *
   * <pre>
   * Threshold at which to begin ratelimiting.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThreshold rate_limit_threshold = 315875208;
   * </code>
   *
   * @return The rateLimitThreshold.
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThreshold getRateLimitThreshold();

  /**
   *
   *
   * <pre>
   * Threshold at which to begin ratelimiting.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThreshold rate_limit_threshold = 315875208;
   * </code>
   */
  com.google.cloud.compute.v1.SecurityPolicyRuleRateLimitOptionsThresholdOrBuilder
      getRateLimitThresholdOrBuilder();
}
