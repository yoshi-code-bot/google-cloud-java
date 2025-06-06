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
// source: google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto

// Protobuf Java Version: 3.25.8
package com.google.recaptchaenterprise.v1;

public interface EventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.recaptchaenterprise.v1.Event)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The user response token provided by the reCAPTCHA Enterprise
   * client-side integration on your site.
   * </pre>
   *
   * <code>string token = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The token.
   */
  java.lang.String getToken();

  /**
   *
   *
   * <pre>
   * Optional. The user response token provided by the reCAPTCHA Enterprise
   * client-side integration on your site.
   * </pre>
   *
   * <code>string token = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for token.
   */
  com.google.protobuf.ByteString getTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. The site key that was used to invoke reCAPTCHA Enterprise on your
   * site and generate the token.
   * </pre>
   *
   * <code>string site_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The siteKey.
   */
  java.lang.String getSiteKey();

  /**
   *
   *
   * <pre>
   * Optional. The site key that was used to invoke reCAPTCHA Enterprise on your
   * site and generate the token.
   * </pre>
   *
   * <code>string site_key = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for siteKey.
   */
  com.google.protobuf.ByteString getSiteKeyBytes();

  /**
   *
   *
   * <pre>
   * Optional. The user agent present in the request from the user's device
   * related to this event.
   * </pre>
   *
   * <code>string user_agent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The userAgent.
   */
  java.lang.String getUserAgent();

  /**
   *
   *
   * <pre>
   * Optional. The user agent present in the request from the user's device
   * related to this event.
   * </pre>
   *
   * <code>string user_agent = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for userAgent.
   */
  com.google.protobuf.ByteString getUserAgentBytes();

  /**
   *
   *
   * <pre>
   * Optional. The IP address in the request from the user's device related to
   * this event.
   * </pre>
   *
   * <code>
   * string user_ip_address = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The userIpAddress.
   */
  java.lang.String getUserIpAddress();

  /**
   *
   *
   * <pre>
   * Optional. The IP address in the request from the user's device related to
   * this event.
   * </pre>
   *
   * <code>
   * string user_ip_address = 4 [(.google.api.field_behavior) = OPTIONAL, (.google.api.field_info) = { ... }
   * </code>
   *
   * @return The bytes for userIpAddress.
   */
  com.google.protobuf.ByteString getUserIpAddressBytes();

  /**
   *
   *
   * <pre>
   * Optional. The expected action for this type of event. This should be the
   * same action provided at token generation time on client-side platforms
   * already integrated with recaptcha enterprise.
   * </pre>
   *
   * <code>string expected_action = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The expectedAction.
   */
  java.lang.String getExpectedAction();

  /**
   *
   *
   * <pre>
   * Optional. The expected action for this type of event. This should be the
   * same action provided at token generation time on client-side platforms
   * already integrated with recaptcha enterprise.
   * </pre>
   *
   * <code>string expected_action = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for expectedAction.
   */
  com.google.protobuf.ByteString getExpectedActionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Deprecated: use `user_info.account_id` instead.
   * Unique stable hashed user identifier for the request. The identifier must
   * be hashed using hmac-sha256 with stable secret.
   * </pre>
   *
   * <code>bytes hashed_account_id = 6 [deprecated = true, (.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @deprecated google.cloud.recaptchaenterprise.v1.Event.hashed_account_id is deprecated. See
   *     google/cloud/recaptchaenterprise/v1/recaptchaenterprise.proto;l=745
   * @return The hashedAccountId.
   */
  @java.lang.Deprecated
  com.google.protobuf.ByteString getHashedAccountId();

  /**
   *
   *
   * <pre>
   * Optional. Flag for a reCAPTCHA express request for an assessment without a
   * token. If enabled, `site_key` must reference an Express site key.
   * </pre>
   *
   * <code>bool express = 14 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The express.
   */
  boolean getExpress();

  /**
   *
   *
   * <pre>
   * Optional. The URI resource the user requested that triggered an assessment.
   * </pre>
   *
   * <code>string requested_uri = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestedUri.
   */
  java.lang.String getRequestedUri();

  /**
   *
   *
   * <pre>
   * Optional. The URI resource the user requested that triggered an assessment.
   * </pre>
   *
   * <code>string requested_uri = 8 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestedUri.
   */
  com.google.protobuf.ByteString getRequestedUriBytes();

  /**
   *
   *
   * <pre>
   * Optional. Flag for running WAF token assessment.
   * If enabled, the token must be specified, and have been created by a
   * WAF-enabled key.
   * </pre>
   *
   * <code>bool waf_token_assessment = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The wafTokenAssessment.
   */
  boolean getWafTokenAssessment();

  /**
   *
   *
   * <pre>
   * Optional. JA3 fingerprint for SSL clients. To learn how to compute this
   * fingerprint, please refer to https://github.com/salesforce/ja3.
   * </pre>
   *
   * <code>string ja3 = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ja3.
   */
  java.lang.String getJa3();

  /**
   *
   *
   * <pre>
   * Optional. JA3 fingerprint for SSL clients. To learn how to compute this
   * fingerprint, please refer to https://github.com/salesforce/ja3.
   * </pre>
   *
   * <code>string ja3 = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for ja3.
   */
  com.google.protobuf.ByteString getJa3Bytes();

  /**
   *
   *
   * <pre>
   * Optional. JA4 fingerprint for SSL clients. To learn how to compute this
   * fingerprint, please refer to https://github.com/FoxIO-LLC/ja4.
   * </pre>
   *
   * <code>string ja4 = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The ja4.
   */
  java.lang.String getJa4();

  /**
   *
   *
   * <pre>
   * Optional. JA4 fingerprint for SSL clients. To learn how to compute this
   * fingerprint, please refer to https://github.com/FoxIO-LLC/ja4.
   * </pre>
   *
   * <code>string ja4 = 18 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for ja4.
   */
  com.google.protobuf.ByteString getJa4Bytes();

  /**
   *
   *
   * <pre>
   * Optional. HTTP header information about the request.
   * </pre>
   *
   * <code>repeated string headers = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the headers.
   */
  java.util.List<java.lang.String> getHeadersList();

  /**
   *
   *
   * <pre>
   * Optional. HTTP header information about the request.
   * </pre>
   *
   * <code>repeated string headers = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of headers.
   */
  int getHeadersCount();

  /**
   *
   *
   * <pre>
   * Optional. HTTP header information about the request.
   * </pre>
   *
   * <code>repeated string headers = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The headers at the given index.
   */
  java.lang.String getHeaders(int index);

  /**
   *
   *
   * <pre>
   * Optional. HTTP header information about the request.
   * </pre>
   *
   * <code>repeated string headers = 11 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the headers at the given index.
   */
  com.google.protobuf.ByteString getHeadersBytes(int index);

  /**
   *
   *
   * <pre>
   * Optional. Flag for enabling firewall policy config assessment.
   * If this flag is enabled, the firewall policy is evaluated and a
   * suggested firewall action is returned in the response.
   * </pre>
   *
   * <code>bool firewall_policy_evaluation = 12 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The firewallPolicyEvaluation.
   */
  boolean getFirewallPolicyEvaluation();

  /**
   *
   *
   * <pre>
   * Optional. Data describing a payment transaction to be assessed. Sending
   * this data enables reCAPTCHA Enterprise Fraud Prevention and the
   * FraudPreventionAssessment component in the response.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TransactionData transaction_data = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the transactionData field is set.
   */
  boolean hasTransactionData();

  /**
   *
   *
   * <pre>
   * Optional. Data describing a payment transaction to be assessed. Sending
   * this data enables reCAPTCHA Enterprise Fraud Prevention and the
   * FraudPreventionAssessment component in the response.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TransactionData transaction_data = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The transactionData.
   */
  com.google.recaptchaenterprise.v1.TransactionData getTransactionData();

  /**
   *
   *
   * <pre>
   * Optional. Data describing a payment transaction to be assessed. Sending
   * this data enables reCAPTCHA Enterprise Fraud Prevention and the
   * FraudPreventionAssessment component in the response.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.TransactionData transaction_data = 13 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.recaptchaenterprise.v1.TransactionDataOrBuilder getTransactionDataOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Information about the user that generates this event, when they
   * can be identified. They are often identified through the use of an account
   * for logged-in requests or login/registration requests, or by providing user
   * identifiers for guest actions like checkout.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.UserInfo user_info = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the userInfo field is set.
   */
  boolean hasUserInfo();

  /**
   *
   *
   * <pre>
   * Optional. Information about the user that generates this event, when they
   * can be identified. They are often identified through the use of an account
   * for logged-in requests or login/registration requests, or by providing user
   * identifiers for guest actions like checkout.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.UserInfo user_info = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The userInfo.
   */
  com.google.recaptchaenterprise.v1.UserInfo getUserInfo();

  /**
   *
   *
   * <pre>
   * Optional. Information about the user that generates this event, when they
   * can be identified. They are often identified through the use of an account
   * for logged-in requests or login/registration requests, or by providing user
   * identifiers for guest actions like checkout.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.UserInfo user_info = 15 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.recaptchaenterprise.v1.UserInfoOrBuilder getUserInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The Fraud Prevention setting for this assessment.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Event.FraudPrevention fraud_prevention = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for fraudPrevention.
   */
  int getFraudPreventionValue();

  /**
   *
   *
   * <pre>
   * Optional. The Fraud Prevention setting for this assessment.
   * </pre>
   *
   * <code>
   * .google.cloud.recaptchaenterprise.v1.Event.FraudPrevention fraud_prevention = 17 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The fraudPrevention.
   */
  com.google.recaptchaenterprise.v1.Event.FraudPrevention getFraudPrevention();
}
