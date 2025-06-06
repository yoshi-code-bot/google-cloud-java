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
// source: google/cloud/talent/v4beta1/filters.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.talent.v4beta1;

public interface LocationFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.talent.v4beta1.LocationFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The address name, such as "Mountain View" or "Bay Area".
   * </pre>
   *
   * <code>string address = 1;</code>
   *
   * @return The address.
   */
  java.lang.String getAddress();

  /**
   *
   *
   * <pre>
   * The address name, such as "Mountain View" or "Bay Area".
   * </pre>
   *
   * <code>string address = 1;</code>
   *
   * @return The bytes for address.
   */
  com.google.protobuf.ByteString getAddressBytes();

  /**
   *
   *
   * <pre>
   * CLDR region code of the country/region. This field may be used in two ways:
   *
   * 1) If telecommute preference is not set, this field is used address
   * ambiguity of the user-input address. For example, "Liverpool" may refer to
   * "Liverpool, NY, US" or "Liverpool, UK". This region code biases the
   * address resolution toward a specific country or territory. If this field is
   * not set, address resolution is biased toward the United States by default.
   *
   * 2) If telecommute preference is set to TELECOMMUTE_ALLOWED, the
   * telecommute location filter will be limited to the region specified in this
   * field. If this field is not set, the telecommute job locations will not be
   *
   * See
   * https://unicode-org.github.io/cldr-staging/charts/latest/supplemental/territory_information.html
   * for details. Example: "CH" for Switzerland.
   * </pre>
   *
   * <code>string region_code = 2;</code>
   *
   * @return The regionCode.
   */
  java.lang.String getRegionCode();

  /**
   *
   *
   * <pre>
   * CLDR region code of the country/region. This field may be used in two ways:
   *
   * 1) If telecommute preference is not set, this field is used address
   * ambiguity of the user-input address. For example, "Liverpool" may refer to
   * "Liverpool, NY, US" or "Liverpool, UK". This region code biases the
   * address resolution toward a specific country or territory. If this field is
   * not set, address resolution is biased toward the United States by default.
   *
   * 2) If telecommute preference is set to TELECOMMUTE_ALLOWED, the
   * telecommute location filter will be limited to the region specified in this
   * field. If this field is not set, the telecommute job locations will not be
   *
   * See
   * https://unicode-org.github.io/cldr-staging/charts/latest/supplemental/territory_information.html
   * for details. Example: "CH" for Switzerland.
   * </pre>
   *
   * <code>string region_code = 2;</code>
   *
   * @return The bytes for regionCode.
   */
  com.google.protobuf.ByteString getRegionCodeBytes();

  /**
   *
   *
   * <pre>
   * The latitude and longitude of the geographic center to search from. This
   * field is ignored if `address` is provided.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 3;</code>
   *
   * @return Whether the latLng field is set.
   */
  boolean hasLatLng();

  /**
   *
   *
   * <pre>
   * The latitude and longitude of the geographic center to search from. This
   * field is ignored if `address` is provided.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 3;</code>
   *
   * @return The latLng.
   */
  com.google.type.LatLng getLatLng();

  /**
   *
   *
   * <pre>
   * The latitude and longitude of the geographic center to search from. This
   * field is ignored if `address` is provided.
   * </pre>
   *
   * <code>.google.type.LatLng lat_lng = 3;</code>
   */
  com.google.type.LatLngOrBuilder getLatLngOrBuilder();

  /**
   *
   *
   * <pre>
   * The distance_in_miles is applied when the location being searched for is
   * identified as a city or smaller. This field is ignored if the location
   * being searched for is a state or larger.
   * </pre>
   *
   * <code>double distance_in_miles = 4;</code>
   *
   * @return The distanceInMiles.
   */
  double getDistanceInMiles();

  /**
   *
   *
   * <pre>
   * Allows the client to return jobs without a
   * set location, specifically, telecommuting jobs (telecommuting is considered
   * by the service as a special location).
   * [Job.posting_region][google.cloud.talent.v4beta1.Job.posting_region]
   * indicates if a job permits telecommuting. If this field is set to
   * [TelecommutePreference.TELECOMMUTE_ALLOWED][google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference.TELECOMMUTE_ALLOWED],
   * telecommuting jobs are searched, and
   * [address][google.cloud.talent.v4beta1.LocationFilter.address] and
   * [lat_lng][google.cloud.talent.v4beta1.LocationFilter.lat_lng] are ignored.
   * If not set or set to
   * [TelecommutePreference.TELECOMMUTE_EXCLUDED][google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference.TELECOMMUTE_EXCLUDED],
   * the telecommute status of the jobs is ignored. Jobs that have
   * [PostingRegion.TELECOMMUTE][google.cloud.talent.v4beta1.PostingRegion.TELECOMMUTE]
   * and have additional
   * [Job.addresses][google.cloud.talent.v4beta1.Job.addresses] may still be
   * matched based on other location filters using
   * [address][google.cloud.talent.v4beta1.LocationFilter.address] or
   * [latlng][].
   *
   * This filter can be used by itself to search exclusively for telecommuting
   * jobs, or it can be combined with another location
   * filter to search for a combination of job locations,
   * such as "Mountain View" or "telecommuting" jobs. However, when used in
   * combination with other location filters, telecommuting jobs can be
   * treated as less relevant than other jobs in the search response.
   *
   * This field is only used for job search requests.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference telecommute_preference = 5;
   * </code>
   *
   * @return The enum numeric value on the wire for telecommutePreference.
   */
  int getTelecommutePreferenceValue();

  /**
   *
   *
   * <pre>
   * Allows the client to return jobs without a
   * set location, specifically, telecommuting jobs (telecommuting is considered
   * by the service as a special location).
   * [Job.posting_region][google.cloud.talent.v4beta1.Job.posting_region]
   * indicates if a job permits telecommuting. If this field is set to
   * [TelecommutePreference.TELECOMMUTE_ALLOWED][google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference.TELECOMMUTE_ALLOWED],
   * telecommuting jobs are searched, and
   * [address][google.cloud.talent.v4beta1.LocationFilter.address] and
   * [lat_lng][google.cloud.talent.v4beta1.LocationFilter.lat_lng] are ignored.
   * If not set or set to
   * [TelecommutePreference.TELECOMMUTE_EXCLUDED][google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference.TELECOMMUTE_EXCLUDED],
   * the telecommute status of the jobs is ignored. Jobs that have
   * [PostingRegion.TELECOMMUTE][google.cloud.talent.v4beta1.PostingRegion.TELECOMMUTE]
   * and have additional
   * [Job.addresses][google.cloud.talent.v4beta1.Job.addresses] may still be
   * matched based on other location filters using
   * [address][google.cloud.talent.v4beta1.LocationFilter.address] or
   * [latlng][].
   *
   * This filter can be used by itself to search exclusively for telecommuting
   * jobs, or it can be combined with another location
   * filter to search for a combination of job locations,
   * such as "Mountain View" or "telecommuting" jobs. However, when used in
   * combination with other location filters, telecommuting jobs can be
   * treated as less relevant than other jobs in the search response.
   *
   * This field is only used for job search requests.
   * </pre>
   *
   * <code>
   * .google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference telecommute_preference = 5;
   * </code>
   *
   * @return The telecommutePreference.
   */
  com.google.cloud.talent.v4beta1.LocationFilter.TelecommutePreference getTelecommutePreference();

  /**
   *
   *
   * <pre>
   * Whether to apply negation to the filter so profiles matching the filter
   * are excluded.
   * </pre>
   *
   * <code>bool negated = 6;</code>
   *
   * @return The negated.
   */
  boolean getNegated();
}
