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

public interface BatchDocumentInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.translation.v3beta1.BatchDocumentInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location for the source input.
   * This can be a single file (for example,
   * `gs://translation-test/input.docx`) or a wildcard (for example,
   * `gs://translation-test/&#42;`).
   *
   * File mime type is determined based on extension. Supported mime type
   * includes:
   * - `pdf`, application/pdf
   * - `docx`,
   * application/vnd.openxmlformats-officedocument.wordprocessingml.document
   * - `pptx`,
   * application/vnd.openxmlformats-officedocument.presentationml.presentation
   * - `xlsx`,
   * application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   *
   * The max file size to support for `.docx`, `.pptx` and `.xlsx` is 100MB.
   * The max file size to support for `.pdf` is 1GB and the max page limit is
   * 1000 pages.
   * The max file size to support for all input documents is 1GB.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location for the source input.
   * This can be a single file (for example,
   * `gs://translation-test/input.docx`) or a wildcard (for example,
   * `gs://translation-test/&#42;`).
   *
   * File mime type is determined based on extension. Supported mime type
   * includes:
   * - `pdf`, application/pdf
   * - `docx`,
   * application/vnd.openxmlformats-officedocument.wordprocessingml.document
   * - `pptx`,
   * application/vnd.openxmlformats-officedocument.presentationml.presentation
   * - `xlsx`,
   * application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   *
   * The max file size to support for `.docx`, `.pptx` and `.xlsx` is 100MB.
   * The max file size to support for `.pdf` is 1GB and the max page limit is
   * 1000 pages.
   * The max file size to support for all input documents is 1GB.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.translate.v3beta1.GcsSource getGcsSource();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage location for the source input.
   * This can be a single file (for example,
   * `gs://translation-test/input.docx`) or a wildcard (for example,
   * `gs://translation-test/&#42;`).
   *
   * File mime type is determined based on extension. Supported mime type
   * includes:
   * - `pdf`, application/pdf
   * - `docx`,
   * application/vnd.openxmlformats-officedocument.wordprocessingml.document
   * - `pptx`,
   * application/vnd.openxmlformats-officedocument.presentationml.presentation
   * - `xlsx`,
   * application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
   *
   * The max file size to support for `.docx`, `.pptx` and `.xlsx` is 100MB.
   * The max file size to support for `.pdf` is 1GB and the max page limit is
   * 1000 pages.
   * The max file size to support for all input documents is 1GB.
   * </pre>
   *
   * <code>.google.cloud.translation.v3beta1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.translate.v3beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  com.google.cloud.translate.v3beta1.BatchDocumentInputConfig.SourceCase getSourceCase();
}
