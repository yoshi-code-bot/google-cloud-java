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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.8
package com.google.privacy.dlp.v2;

public interface TransformationDescriptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.TransformationDescription)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The transformation type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationType type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();

  /**
   *
   *
   * <pre>
   * The transformation type.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationType type = 1;</code>
   *
   * @return The type.
   */
  com.google.privacy.dlp.v2.TransformationType getType();

  /**
   *
   *
   * <pre>
   * A description of the transformation. This is empty for a
   * RECORD_SUPPRESSION, or is the output of calling toString() on the
   * `PrimitiveTransformation` protocol buffer message for any other type of
   * transformation.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();

  /**
   *
   *
   * <pre>
   * A description of the transformation. This is empty for a
   * RECORD_SUPPRESSION, or is the output of calling toString() on the
   * `PrimitiveTransformation` protocol buffer message for any other type of
   * transformation.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * A human-readable string representation of the `RecordCondition`
   * corresponding to this transformation. Set if a `RecordCondition` was used
   * to determine whether or not to apply this transformation.
   *
   * Examples:
   *     * (age_field &gt; 85)
   *     * (age_field &lt;= 18)
   *     * (zip_field exists)
   *     * (zip_field == 01234) &amp;&amp; (city_field != "Springville")
   *     * (zip_field == 01234) &amp;&amp; (age_field &lt;= 18) &amp;&amp; (city_field exists)
   * </pre>
   *
   * <code>string condition = 3;</code>
   *
   * @return The condition.
   */
  java.lang.String getCondition();

  /**
   *
   *
   * <pre>
   * A human-readable string representation of the `RecordCondition`
   * corresponding to this transformation. Set if a `RecordCondition` was used
   * to determine whether or not to apply this transformation.
   *
   * Examples:
   *     * (age_field &gt; 85)
   *     * (age_field &lt;= 18)
   *     * (zip_field exists)
   *     * (zip_field == 01234) &amp;&amp; (city_field != "Springville")
   *     * (zip_field == 01234) &amp;&amp; (age_field &lt;= 18) &amp;&amp; (city_field exists)
   * </pre>
   *
   * <code>string condition = 3;</code>
   *
   * @return The bytes for condition.
   */
  com.google.protobuf.ByteString getConditionBytes();

  /**
   *
   *
   * <pre>
   * Set if the transformation was limited to a specific `InfoType`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 4;</code>
   *
   * @return Whether the infoType field is set.
   */
  boolean hasInfoType();

  /**
   *
   *
   * <pre>
   * Set if the transformation was limited to a specific `InfoType`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 4;</code>
   *
   * @return The infoType.
   */
  com.google.privacy.dlp.v2.InfoType getInfoType();

  /**
   *
   *
   * <pre>
   * Set if the transformation was limited to a specific `InfoType`.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.InfoType info_type = 4;</code>
   */
  com.google.privacy.dlp.v2.InfoTypeOrBuilder getInfoTypeOrBuilder();
}
