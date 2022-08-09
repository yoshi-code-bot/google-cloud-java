/*
 * Copyright 2020 Google LLC
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

package com.google.cloud.compute.v1;

public interface WeightedBackendServiceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.WeightedBackendService)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
   * </pre>
   *
   * <code>optional string backend_service = 306946058;</code>
   *
   * @return Whether the backendService field is set.
   */
  boolean hasBackendService();
  /**
   *
   *
   * <pre>
   * The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
   * </pre>
   *
   * <code>optional string backend_service = 306946058;</code>
   *
   * @return The backendService.
   */
  java.lang.String getBackendService();
  /**
   *
   *
   * <pre>
   * The full or partial URL to the default BackendService resource. Before forwarding the request to backendService, the load balancer applies any relevant headerActions specified as part of this backendServiceWeight.
   * </pre>
   *
   * <code>optional string backend_service = 306946058;</code>
   *
   * @return The bytes for backendService.
   */
  com.google.protobuf.ByteString getBackendServiceBytes();

  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   *
   * @return Whether the headerAction field is set.
   */
  boolean hasHeaderAction();
  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   *
   * @return The headerAction.
   */
  com.google.cloud.compute.v1.HttpHeaderAction getHeaderAction();
  /**
   *
   *
   * <pre>
   * Specifies changes to request and response headers that need to take effect for the selected backendService. headerAction specified here take effect before headerAction in the enclosing HttpRouteRule, PathMatcher and UrlMap. headerAction is not supported for load balancers that have their loadBalancingScheme set to EXTERNAL. Not supported when the URL map is bound to a target gRPC proxy that has validateForProxyless field set to true.
   * </pre>
   *
   * <code>optional .google.cloud.compute.v1.HttpHeaderAction header_action = 328077352;</code>
   */
  com.google.cloud.compute.v1.HttpHeaderActionOrBuilder getHeaderActionOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) . The selection of a backend service is determined only for new traffic. Once a user's request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service's session affinity policy. The value must be from 0 to 1000.
   * </pre>
   *
   * <code>optional uint32 weight = 282149496;</code>
   *
   * @return Whether the weight field is set.
   */
  boolean hasWeight();
  /**
   *
   *
   * <pre>
   * Specifies the fraction of traffic sent to a backend service, computed as weight / (sum of all weightedBackendService weights in routeAction) . The selection of a backend service is determined only for new traffic. Once a user's request has been directed to a backend service, subsequent requests are sent to the same backend service as determined by the backend service's session affinity policy. The value must be from 0 to 1000.
   * </pre>
   *
   * <code>optional uint32 weight = 282149496;</code>
   *
   * @return The weight.
   */
  int getWeight();
}