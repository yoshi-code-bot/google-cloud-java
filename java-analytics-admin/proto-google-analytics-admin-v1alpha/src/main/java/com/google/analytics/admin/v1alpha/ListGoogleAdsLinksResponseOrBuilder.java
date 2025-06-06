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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.8
package com.google.analytics.admin.v1alpha;

public interface ListGoogleAdsLinksResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.ListGoogleAdsLinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * List of GoogleAdsLinks.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_links = 1;</code>
   */
  java.util.List<com.google.analytics.admin.v1alpha.GoogleAdsLink> getGoogleAdsLinksList();

  /**
   *
   *
   * <pre>
   * List of GoogleAdsLinks.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_links = 1;</code>
   */
  com.google.analytics.admin.v1alpha.GoogleAdsLink getGoogleAdsLinks(int index);

  /**
   *
   *
   * <pre>
   * List of GoogleAdsLinks.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_links = 1;</code>
   */
  int getGoogleAdsLinksCount();

  /**
   *
   *
   * <pre>
   * List of GoogleAdsLinks.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_links = 1;</code>
   */
  java.util.List<? extends com.google.analytics.admin.v1alpha.GoogleAdsLinkOrBuilder>
      getGoogleAdsLinksOrBuilderList();

  /**
   *
   *
   * <pre>
   * List of GoogleAdsLinks.
   * </pre>
   *
   * <code>repeated .google.analytics.admin.v1alpha.GoogleAdsLink google_ads_links = 1;</code>
   */
  com.google.analytics.admin.v1alpha.GoogleAdsLinkOrBuilder getGoogleAdsLinksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();

  /**
   *
   *
   * <pre>
   * A token, which can be sent as `page_token` to retrieve the next page.
   * If this field is omitted, there are no subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
