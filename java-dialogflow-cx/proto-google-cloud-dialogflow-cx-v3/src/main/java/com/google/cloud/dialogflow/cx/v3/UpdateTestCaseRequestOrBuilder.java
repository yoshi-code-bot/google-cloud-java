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
// source: google/cloud/dialogflow/cx/v3/test_case.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3;

public interface UpdateTestCaseRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.UpdateTestCaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The test case to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the testCase field is set.
   */
  boolean hasTestCase();

  /**
   *
   *
   * <pre>
   * Required. The test case to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The testCase.
   */
  com.google.cloud.dialogflow.cx.v3.TestCase getTestCase();

  /**
   *
   *
   * <pre>
   * Required. The test case to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3.TestCase test_case = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dialogflow.cx.v3.TestCaseOrBuilder getTestCaseOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The mask to specify which fields should be updated. The
   * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
   * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result]
   * cannot be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. The mask to specify which fields should be updated. The
   * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
   * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result]
   * cannot be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();

  /**
   *
   *
   * <pre>
   * Required. The mask to specify which fields should be updated. The
   * [`creationTime`][google.cloud.dialogflow.cx.v3.TestCase.creation_time] and
   * [`lastTestResult`][google.cloud.dialogflow.cx.v3.TestCase.last_test_result]
   * cannot be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
