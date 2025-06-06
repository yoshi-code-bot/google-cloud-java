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
// source: google/cloud/translate/v3beta1/translation_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.translate.v3beta1;

public interface BatchTranslateDocumentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.BatchTranslateDocumentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Total number of pages to translate in all documents. Documents without
   * clear page definition (such as XLSX) are not counted.
   * </pre>
   *
   * <code>int64 total_pages = 1;</code>
   *
   * @return The totalPages.
   */
  long getTotalPages();

  /**
   *
   *
   * <pre>
   * Number of successfully translated pages in all documents. Documents without
   * clear page definition (such as XLSX) are not counted.
   * </pre>
   *
   * <code>int64 translated_pages = 2;</code>
   *
   * @return The translatedPages.
   */
  long getTranslatedPages();

  /**
   *
   *
   * <pre>
   * Number of pages that failed to process in all documents. Documents without
   * clear page definition (such as XLSX) are not counted.
   * </pre>
   *
   * <code>int64 failed_pages = 3;</code>
   *
   * @return The failedPages.
   */
  long getFailedPages();

  /**
   *
   *
   * <pre>
   * Number of billable pages in documents with clear page definition (such as
   * PDF, DOCX, PPTX)
   * </pre>
   *
   * <code>int64 total_billable_pages = 4;</code>
   *
   * @return The totalBillablePages.
   */
  long getTotalBillablePages();

  /**
   *
   *
   * <pre>
   * Total number of characters (Unicode codepoints) in all documents.
   * </pre>
   *
   * <code>int64 total_characters = 5;</code>
   *
   * @return The totalCharacters.
   */
  long getTotalCharacters();

  /**
   *
   *
   * <pre>
   * Number of successfully translated characters (Unicode codepoints) in all
   * documents.
   * </pre>
   *
   * <code>int64 translated_characters = 6;</code>
   *
   * @return The translatedCharacters.
   */
  long getTranslatedCharacters();

  /**
   *
   *
   * <pre>
   * Number of characters that have failed to process (Unicode codepoints) in
   * all documents.
   * </pre>
   *
   * <code>int64 failed_characters = 7;</code>
   *
   * @return The failedCharacters.
   */
  long getFailedCharacters();

  /**
   *
   *
   * <pre>
   * Number of billable characters (Unicode codepoints) in documents without
   * clear page definition, such as XLSX.
   * </pre>
   *
   * <code>int64 total_billable_characters = 8;</code>
   *
   * @return The totalBillableCharacters.
   */
  long getTotalBillableCharacters();

  /**
   *
   *
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 9;</code>
   *
   * @return Whether the submitTime field is set.
   */
  boolean hasSubmitTime();

  /**
   *
   *
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 9;</code>
   *
   * @return The submitTime.
   */
  com.google.protobuf.Timestamp getSubmitTime();

  /**
   *
   *
   * <pre>
   * Time when the operation was submitted.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp submit_time = 9;</code>
   */
  com.google.protobuf.TimestampOrBuilder getSubmitTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 10;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();

  /**
   *
   *
   * <pre>
   * The time when the operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 10;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();

  /**
   *
   *
   * <pre>
   * The time when the operation is finished and
   * [google.longrunning.Operation.done][google.longrunning.Operation.done] is
   * set to true.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 10;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
