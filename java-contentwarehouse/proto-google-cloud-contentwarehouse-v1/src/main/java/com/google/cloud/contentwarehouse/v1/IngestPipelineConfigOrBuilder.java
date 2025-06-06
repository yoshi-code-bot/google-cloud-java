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
// source: google/cloud/contentwarehouse/v1/pipelines.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.contentwarehouse.v1;

public interface IngestPipelineConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.IngestPipelineConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The document level acl policy config.
   * This refers to an Identity and Access (IAM) policy, which specifies access
   * controls for all documents ingested by the pipeline. The
   * [role][google.iam.v1.Binding.role] and
   * [members][google.iam.v1.Binding.role] under the policy needs to be
   * specified.
   *
   * The following roles are supported for document level acl control:
   * * roles/contentwarehouse.documentAdmin
   * * roles/contentwarehouse.documentEditor
   * * roles/contentwarehouse.documentViewer
   *
   * The following members are supported for document level acl control:
   * * user:user-email&#64;example.com
   * * group:group-email&#64;example.com
   * Note that for documents searched with LLM, only single level user or group
   * acl check is supported.
   * </pre>
   *
   * <code>.google.iam.v1.Policy document_acl_policy = 1;</code>
   *
   * @return Whether the documentAclPolicy field is set.
   */
  boolean hasDocumentAclPolicy();

  /**
   *
   *
   * <pre>
   * The document level acl policy config.
   * This refers to an Identity and Access (IAM) policy, which specifies access
   * controls for all documents ingested by the pipeline. The
   * [role][google.iam.v1.Binding.role] and
   * [members][google.iam.v1.Binding.role] under the policy needs to be
   * specified.
   *
   * The following roles are supported for document level acl control:
   * * roles/contentwarehouse.documentAdmin
   * * roles/contentwarehouse.documentEditor
   * * roles/contentwarehouse.documentViewer
   *
   * The following members are supported for document level acl control:
   * * user:user-email&#64;example.com
   * * group:group-email&#64;example.com
   * Note that for documents searched with LLM, only single level user or group
   * acl check is supported.
   * </pre>
   *
   * <code>.google.iam.v1.Policy document_acl_policy = 1;</code>
   *
   * @return The documentAclPolicy.
   */
  com.google.iam.v1.Policy getDocumentAclPolicy();

  /**
   *
   *
   * <pre>
   * The document level acl policy config.
   * This refers to an Identity and Access (IAM) policy, which specifies access
   * controls for all documents ingested by the pipeline. The
   * [role][google.iam.v1.Binding.role] and
   * [members][google.iam.v1.Binding.role] under the policy needs to be
   * specified.
   *
   * The following roles are supported for document level acl control:
   * * roles/contentwarehouse.documentAdmin
   * * roles/contentwarehouse.documentEditor
   * * roles/contentwarehouse.documentViewer
   *
   * The following members are supported for document level acl control:
   * * user:user-email&#64;example.com
   * * group:group-email&#64;example.com
   * Note that for documents searched with LLM, only single level user or group
   * acl check is supported.
   * </pre>
   *
   * <code>.google.iam.v1.Policy document_acl_policy = 1;</code>
   */
  com.google.iam.v1.PolicyOrBuilder getDocumentAclPolicyOrBuilder();

  /**
   *
   *
   * <pre>
   * The document text extraction enabled flag.
   * If the flag is set to true, DWH will perform text extraction on the raw
   * document.
   * </pre>
   *
   * <code>bool enable_document_text_extraction = 2;</code>
   *
   * @return The enableDocumentTextExtraction.
   */
  boolean getEnableDocumentTextExtraction();

  /**
   *
   *
   * <pre>
   * Optional. The name of the folder to which all ingested documents will be
   * linked during ingestion process. Format is
   * `projects/{project}/locations/{location}/documents/{folder_id}`
   * </pre>
   *
   * <code>string folder = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The folder.
   */
  java.lang.String getFolder();

  /**
   *
   *
   * <pre>
   * Optional. The name of the folder to which all ingested documents will be
   * linked during ingestion process. Format is
   * `projects/{project}/locations/{location}/documents/{folder_id}`
   * </pre>
   *
   * <code>string folder = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for folder.
   */
  com.google.protobuf.ByteString getFolderBytes();

  /**
   *
   *
   * <pre>
   * The Cloud Function resource name. The Cloud Function needs to live inside
   * consumer project and is accessible to Document AI Warehouse P4SA.
   * Only Cloud Functions V2 is supported. Cloud function execution should
   * complete within 5 minutes or this file ingestion may fail due to timeout.
   * Format: `https://{region}-{project_id}.cloudfunctions.net/{cloud_function}`
   * The following keys are available the request json payload.
   * * display_name
   * * properties
   * * plain_text
   * * reference_id
   * * document_schema_name
   * * raw_document_path
   * * raw_document_file_type
   *
   * The following keys from the cloud function json response payload will be
   * ingested to the Document AI Warehouse as part of Document proto content
   * and/or related information. The original values will be overridden if any
   * key is present in the response.
   * * display_name
   * * properties
   * * plain_text
   * * document_acl_policy
   * * folder
   * </pre>
   *
   * <code>string cloud_function = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The cloudFunction.
   */
  java.lang.String getCloudFunction();

  /**
   *
   *
   * <pre>
   * The Cloud Function resource name. The Cloud Function needs to live inside
   * consumer project and is accessible to Document AI Warehouse P4SA.
   * Only Cloud Functions V2 is supported. Cloud function execution should
   * complete within 5 minutes or this file ingestion may fail due to timeout.
   * Format: `https://{region}-{project_id}.cloudfunctions.net/{cloud_function}`
   * The following keys are available the request json payload.
   * * display_name
   * * properties
   * * plain_text
   * * reference_id
   * * document_schema_name
   * * raw_document_path
   * * raw_document_file_type
   *
   * The following keys from the cloud function json response payload will be
   * ingested to the Document AI Warehouse as part of Document proto content
   * and/or related information. The original values will be overridden if any
   * key is present in the response.
   * * display_name
   * * properties
   * * plain_text
   * * document_acl_policy
   * * folder
   * </pre>
   *
   * <code>string cloud_function = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for cloudFunction.
   */
  com.google.protobuf.ByteString getCloudFunctionBytes();
}
