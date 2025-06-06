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
// source: google/cloud/billing/v1/cloud_catalog.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.billing.v1;

public interface PricingInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.billing.v1.PricingInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The timestamp from which this pricing was effective within the requested
   * time range. This is guaranteed to be greater than or equal to the
   * start_time field in the request and less than the end_time field in the
   * request. If a time range was not specified in the request this field will
   * be equivalent to a time within the last 12 hours, indicating the latest
   * pricing info.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp effective_time = 1;</code>
   *
   * @return Whether the effectiveTime field is set.
   */
  boolean hasEffectiveTime();

  /**
   *
   *
   * <pre>
   * The timestamp from which this pricing was effective within the requested
   * time range. This is guaranteed to be greater than or equal to the
   * start_time field in the request and less than the end_time field in the
   * request. If a time range was not specified in the request this field will
   * be equivalent to a time within the last 12 hours, indicating the latest
   * pricing info.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp effective_time = 1;</code>
   *
   * @return The effectiveTime.
   */
  com.google.protobuf.Timestamp getEffectiveTime();

  /**
   *
   *
   * <pre>
   * The timestamp from which this pricing was effective within the requested
   * time range. This is guaranteed to be greater than or equal to the
   * start_time field in the request and less than the end_time field in the
   * request. If a time range was not specified in the request this field will
   * be equivalent to a time within the last 12 hours, indicating the latest
   * pricing info.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp effective_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEffectiveTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * An optional human readable summary of the pricing information, has a
   * maximum length of 256 characters.
   * </pre>
   *
   * <code>string summary = 2;</code>
   *
   * @return The summary.
   */
  java.lang.String getSummary();

  /**
   *
   *
   * <pre>
   * An optional human readable summary of the pricing information, has a
   * maximum length of 256 characters.
   * </pre>
   *
   * <code>string summary = 2;</code>
   *
   * @return The bytes for summary.
   */
  com.google.protobuf.ByteString getSummaryBytes();

  /**
   *
   *
   * <pre>
   * Expresses the pricing formula. See `PricingExpression` for an example.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.PricingExpression pricing_expression = 3;</code>
   *
   * @return Whether the pricingExpression field is set.
   */
  boolean hasPricingExpression();

  /**
   *
   *
   * <pre>
   * Expresses the pricing formula. See `PricingExpression` for an example.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.PricingExpression pricing_expression = 3;</code>
   *
   * @return The pricingExpression.
   */
  com.google.cloud.billing.v1.PricingExpression getPricingExpression();

  /**
   *
   *
   * <pre>
   * Expresses the pricing formula. See `PricingExpression` for an example.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.PricingExpression pricing_expression = 3;</code>
   */
  com.google.cloud.billing.v1.PricingExpressionOrBuilder getPricingExpressionOrBuilder();

  /**
   *
   *
   * <pre>
   * Aggregation Info. This can be left unspecified if the pricing expression
   * doesn't require aggregation.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.AggregationInfo aggregation_info = 4;</code>
   *
   * @return Whether the aggregationInfo field is set.
   */
  boolean hasAggregationInfo();

  /**
   *
   *
   * <pre>
   * Aggregation Info. This can be left unspecified if the pricing expression
   * doesn't require aggregation.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.AggregationInfo aggregation_info = 4;</code>
   *
   * @return The aggregationInfo.
   */
  com.google.cloud.billing.v1.AggregationInfo getAggregationInfo();

  /**
   *
   *
   * <pre>
   * Aggregation Info. This can be left unspecified if the pricing expression
   * doesn't require aggregation.
   * </pre>
   *
   * <code>.google.cloud.billing.v1.AggregationInfo aggregation_info = 4;</code>
   */
  com.google.cloud.billing.v1.AggregationInfoOrBuilder getAggregationInfoOrBuilder();

  /**
   *
   *
   * <pre>
   * Conversion rate used for currency conversion, from USD to the currency
   * specified in the request. This includes any surcharge collected for billing
   * in non USD currency. If a currency is not specified in the request this
   * defaults to 1.0.
   * Example: USD * currency_conversion_rate = JPY
   * </pre>
   *
   * <code>double currency_conversion_rate = 5;</code>
   *
   * @return The currencyConversionRate.
   */
  double getCurrencyConversionRate();
}
