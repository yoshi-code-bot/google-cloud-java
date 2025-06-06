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
// source: google/cloud/accessapproval/v1/accessapproval.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.accessapproval.v1;

public interface ApprovalRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.accessapproval.v1.ApprovalRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the request. Format is
   * "{projects|folders|organizations}/{id}/approvalRequests/{approval_request}".
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
   * The resource name of the request. Format is
   * "{projects|folders|organizations}/{id}/approvalRequests/{approval_request}".
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
   * The resource for which approval is being requested. The format of the
   * resource name is defined at
   * https://cloud.google.com/apis/design/resource_names. The resource name here
   * may either be a "full" resource name (e.g.
   * "//library.googleapis.com/shelves/shelf1/books/book2") or a "relative"
   * resource name (e.g. "shelves/shelf1/books/book2") as described in the
   * resource name specification.
   * </pre>
   *
   * <code>string requested_resource_name = 2;</code>
   *
   * @return The requestedResourceName.
   */
  java.lang.String getRequestedResourceName();

  /**
   *
   *
   * <pre>
   * The resource for which approval is being requested. The format of the
   * resource name is defined at
   * https://cloud.google.com/apis/design/resource_names. The resource name here
   * may either be a "full" resource name (e.g.
   * "//library.googleapis.com/shelves/shelf1/books/book2") or a "relative"
   * resource name (e.g. "shelves/shelf1/books/book2") as described in the
   * resource name specification.
   * </pre>
   *
   * <code>string requested_resource_name = 2;</code>
   *
   * @return The bytes for requestedResourceName.
   */
  com.google.protobuf.ByteString getRequestedResourceNameBytes();

  /**
   *
   *
   * <pre>
   * Properties related to the resource represented by requested_resource_name.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.ResourceProperties requested_resource_properties = 9;
   * </code>
   *
   * @return Whether the requestedResourceProperties field is set.
   */
  boolean hasRequestedResourceProperties();

  /**
   *
   *
   * <pre>
   * Properties related to the resource represented by requested_resource_name.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.ResourceProperties requested_resource_properties = 9;
   * </code>
   *
   * @return The requestedResourceProperties.
   */
  com.google.cloud.accessapproval.v1.ResourceProperties getRequestedResourceProperties();

  /**
   *
   *
   * <pre>
   * Properties related to the resource represented by requested_resource_name.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.ResourceProperties requested_resource_properties = 9;
   * </code>
   */
  com.google.cloud.accessapproval.v1.ResourcePropertiesOrBuilder
      getRequestedResourcePropertiesOrBuilder();

  /**
   *
   *
   * <pre>
   * The justification for which approval is being requested.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessReason requested_reason = 3;</code>
   *
   * @return Whether the requestedReason field is set.
   */
  boolean hasRequestedReason();

  /**
   *
   *
   * <pre>
   * The justification for which approval is being requested.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessReason requested_reason = 3;</code>
   *
   * @return The requestedReason.
   */
  com.google.cloud.accessapproval.v1.AccessReason getRequestedReason();

  /**
   *
   *
   * <pre>
   * The justification for which approval is being requested.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessReason requested_reason = 3;</code>
   */
  com.google.cloud.accessapproval.v1.AccessReasonOrBuilder getRequestedReasonOrBuilder();

  /**
   *
   *
   * <pre>
   * The locations for which approval is being requested.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessLocations requested_locations = 4;</code>
   *
   * @return Whether the requestedLocations field is set.
   */
  boolean hasRequestedLocations();

  /**
   *
   *
   * <pre>
   * The locations for which approval is being requested.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessLocations requested_locations = 4;</code>
   *
   * @return The requestedLocations.
   */
  com.google.cloud.accessapproval.v1.AccessLocations getRequestedLocations();

  /**
   *
   *
   * <pre>
   * The locations for which approval is being requested.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.AccessLocations requested_locations = 4;</code>
   */
  com.google.cloud.accessapproval.v1.AccessLocationsOrBuilder getRequestedLocationsOrBuilder();

  /**
   *
   *
   * <pre>
   * The time at which approval was requested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 5;</code>
   *
   * @return Whether the requestTime field is set.
   */
  boolean hasRequestTime();

  /**
   *
   *
   * <pre>
   * The time at which approval was requested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 5;</code>
   *
   * @return The requestTime.
   */
  com.google.protobuf.Timestamp getRequestTime();

  /**
   *
   *
   * <pre>
   * The time at which approval was requested.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp request_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The requested expiration for the approval. If the request is approved,
   * access will be granted from the time of approval until the expiration time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp requested_expiration = 6;</code>
   *
   * @return Whether the requestedExpiration field is set.
   */
  boolean hasRequestedExpiration();

  /**
   *
   *
   * <pre>
   * The requested expiration for the approval. If the request is approved,
   * access will be granted from the time of approval until the expiration time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp requested_expiration = 6;</code>
   *
   * @return The requestedExpiration.
   */
  com.google.protobuf.Timestamp getRequestedExpiration();

  /**
   *
   *
   * <pre>
   * The requested expiration for the approval. If the request is approved,
   * access will be granted from the time of approval until the expiration time.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp requested_expiration = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getRequestedExpirationOrBuilder();

  /**
   *
   *
   * <pre>
   * Access was approved.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.ApproveDecision approve = 7;</code>
   *
   * @return Whether the approve field is set.
   */
  boolean hasApprove();

  /**
   *
   *
   * <pre>
   * Access was approved.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.ApproveDecision approve = 7;</code>
   *
   * @return The approve.
   */
  com.google.cloud.accessapproval.v1.ApproveDecision getApprove();

  /**
   *
   *
   * <pre>
   * Access was approved.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.ApproveDecision approve = 7;</code>
   */
  com.google.cloud.accessapproval.v1.ApproveDecisionOrBuilder getApproveOrBuilder();

  /**
   *
   *
   * <pre>
   * The request was dismissed.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.DismissDecision dismiss = 8;</code>
   *
   * @return Whether the dismiss field is set.
   */
  boolean hasDismiss();

  /**
   *
   *
   * <pre>
   * The request was dismissed.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.DismissDecision dismiss = 8;</code>
   *
   * @return The dismiss.
   */
  com.google.cloud.accessapproval.v1.DismissDecision getDismiss();

  /**
   *
   *
   * <pre>
   * The request was dismissed.
   * </pre>
   *
   * <code>.google.cloud.accessapproval.v1.DismissDecision dismiss = 8;</code>
   */
  com.google.cloud.accessapproval.v1.DismissDecisionOrBuilder getDismissOrBuilder();

  com.google.cloud.accessapproval.v1.ApprovalRequest.DecisionCase getDecisionCase();
}
