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
// source: google/cloud/retail/v2alpha/product_service.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2alpha;

public interface DeleteProductRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.retail.v2alpha.DeleteProductRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Product][google.cloud.retail.v2alpha.Product], such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to delete the
   * [Product][google.cloud.retail.v2alpha.Product], regardless of whether or
   * not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Product][google.cloud.retail.v2alpha.Product] to delete does not
   * exist, a NOT_FOUND error is returned.
   *
   * The [Product][google.cloud.retail.v2alpha.Product] to delete can neither be
   * a
   * [Product.Type.COLLECTION][google.cloud.retail.v2alpha.Product.Type.COLLECTION]
   * [Product][google.cloud.retail.v2alpha.Product] member nor a
   * [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2alpha.Product] with more than one
   * [variants][google.cloud.retail.v2alpha.Product.Type.VARIANT]. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * All inventory information for the named
   * [Product][google.cloud.retail.v2alpha.Product] will be deleted.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();

  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [Product][google.cloud.retail.v2alpha.Product], such as
   * `projects/&#42;&#47;locations/global/catalogs/default_catalog/branches/default_branch/products/some_product_id`.
   *
   * If the caller does not have permission to delete the
   * [Product][google.cloud.retail.v2alpha.Product], regardless of whether or
   * not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the [Product][google.cloud.retail.v2alpha.Product] to delete does not
   * exist, a NOT_FOUND error is returned.
   *
   * The [Product][google.cloud.retail.v2alpha.Product] to delete can neither be
   * a
   * [Product.Type.COLLECTION][google.cloud.retail.v2alpha.Product.Type.COLLECTION]
   * [Product][google.cloud.retail.v2alpha.Product] member nor a
   * [Product.Type.PRIMARY][google.cloud.retail.v2alpha.Product.Type.PRIMARY]
   * [Product][google.cloud.retail.v2alpha.Product] with more than one
   * [variants][google.cloud.retail.v2alpha.Product.Type.VARIANT]. Otherwise, an
   * INVALID_ARGUMENT error is returned.
   *
   * All inventory information for the named
   * [Product][google.cloud.retail.v2alpha.Product] will be deleted.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * This value only applies to the case when the target product is of type
   * PRIMARY.
   * When deleting a product of VARIANT/COLLECTION type, this value
   * will be ignored.
   * When set to true, the subsequent variant products will be
   * deleted.
   * When set to false, if the primary product has active variant products, an
   * error will be returned.
   * </pre>
   *
   * <code>bool force = 4;</code>
   *
   * @return The force.
   */
  boolean getForce();
}
