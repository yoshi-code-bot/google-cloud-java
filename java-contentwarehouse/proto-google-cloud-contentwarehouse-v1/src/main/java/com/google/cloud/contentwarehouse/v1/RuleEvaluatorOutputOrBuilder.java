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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

public interface RuleEvaluatorOutputOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.RuleEvaluatorOutput)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of rules fetched from database for the given request trigger type.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule triggered_rules = 1;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.Rule> getTriggeredRulesList();

  /**
   *
   *
   * <pre>
   * List of rules fetched from database for the given request trigger type.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule triggered_rules = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.Rule getTriggeredRules(int index);

  /**
   *
   *
   * <pre>
   * List of rules fetched from database for the given request trigger type.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule triggered_rules = 1;</code>
   */
  int getTriggeredRulesCount();

  /**
   *
   *
   * <pre>
   * List of rules fetched from database for the given request trigger type.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule triggered_rules = 1;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.RuleOrBuilder>
      getTriggeredRulesOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of rules fetched from database for the given request trigger type.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule triggered_rules = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.RuleOrBuilder getTriggeredRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A subset of triggered rules that are evaluated true for a given request.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule matched_rules = 2;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.Rule> getMatchedRulesList();

  /**
   *
   *
   * <pre>
   * A subset of triggered rules that are evaluated true for a given request.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule matched_rules = 2;</code>
   */
  com.google.cloud.contentwarehouse.v1.Rule getMatchedRules(int index);

  /**
   *
   *
   * <pre>
   * A subset of triggered rules that are evaluated true for a given request.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule matched_rules = 2;</code>
   */
  int getMatchedRulesCount();

  /**
   *
   *
   * <pre>
   * A subset of triggered rules that are evaluated true for a given request.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule matched_rules = 2;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.RuleOrBuilder>
      getMatchedRulesOrBuilderList();

  /**
   *
   *
   * <pre>
   * A subset of triggered rules that are evaluated true for a given request.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.Rule matched_rules = 2;</code>
   */
  com.google.cloud.contentwarehouse.v1.RuleOrBuilder getMatchedRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A subset of triggered rules that failed the validation check(s) after
   * parsing.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.InvalidRule invalid_rules = 3;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.InvalidRule> getInvalidRulesList();

  /**
   *
   *
   * <pre>
   * A subset of triggered rules that failed the validation check(s) after
   * parsing.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.InvalidRule invalid_rules = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.InvalidRule getInvalidRules(int index);

  /**
   *
   *
   * <pre>
   * A subset of triggered rules that failed the validation check(s) after
   * parsing.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.InvalidRule invalid_rules = 3;</code>
   */
  int getInvalidRulesCount();

  /**
   *
   *
   * <pre>
   * A subset of triggered rules that failed the validation check(s) after
   * parsing.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.InvalidRule invalid_rules = 3;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.InvalidRuleOrBuilder>
      getInvalidRulesOrBuilderList();

  /**
   *
   *
   * <pre>
   * A subset of triggered rules that failed the validation check(s) after
   * parsing.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.InvalidRule invalid_rules = 3;</code>
   */
  com.google.cloud.contentwarehouse.v1.InvalidRuleOrBuilder getInvalidRulesOrBuilder(int index);
}
