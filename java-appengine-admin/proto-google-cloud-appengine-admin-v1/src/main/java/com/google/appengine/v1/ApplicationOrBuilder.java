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
// source: google/appengine/v1/application.proto

// Protobuf Java Version: 3.25.8
package com.google.appengine.v1;

public interface ApplicationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.appengine.v1.Application)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Full path to the Application resource in the API.
   * Example: `apps/myapp`.
   *
   * &#64;OutputOnly
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
   * Full path to the Application resource in the API.
   * Example: `apps/myapp`.
   *
   * &#64;OutputOnly
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
   * Identifier of the Application resource. This identifier is equivalent
   * to the project ID of the Google Cloud Platform project where you want to
   * deploy your application.
   * Example: `myapp`.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The id.
   */
  java.lang.String getId();

  /**
   *
   *
   * <pre>
   * Identifier of the Application resource. This identifier is equivalent
   * to the project ID of the Google Cloud Platform project where you want to
   * deploy your application.
   * Example: `myapp`.
   * </pre>
   *
   * <code>string id = 2;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * HTTP path dispatch rules for requests to the application that do not
   * explicitly target a service or version. Rules are order-dependent.
   * Up to 20 dispatch rules can be supported.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.UrlDispatchRule dispatch_rules = 3;</code>
   */
  java.util.List<com.google.appengine.v1.UrlDispatchRule> getDispatchRulesList();

  /**
   *
   *
   * <pre>
   * HTTP path dispatch rules for requests to the application that do not
   * explicitly target a service or version. Rules are order-dependent.
   * Up to 20 dispatch rules can be supported.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.UrlDispatchRule dispatch_rules = 3;</code>
   */
  com.google.appengine.v1.UrlDispatchRule getDispatchRules(int index);

  /**
   *
   *
   * <pre>
   * HTTP path dispatch rules for requests to the application that do not
   * explicitly target a service or version. Rules are order-dependent.
   * Up to 20 dispatch rules can be supported.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.UrlDispatchRule dispatch_rules = 3;</code>
   */
  int getDispatchRulesCount();

  /**
   *
   *
   * <pre>
   * HTTP path dispatch rules for requests to the application that do not
   * explicitly target a service or version. Rules are order-dependent.
   * Up to 20 dispatch rules can be supported.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.UrlDispatchRule dispatch_rules = 3;</code>
   */
  java.util.List<? extends com.google.appengine.v1.UrlDispatchRuleOrBuilder>
      getDispatchRulesOrBuilderList();

  /**
   *
   *
   * <pre>
   * HTTP path dispatch rules for requests to the application that do not
   * explicitly target a service or version. Rules are order-dependent.
   * Up to 20 dispatch rules can be supported.
   * </pre>
   *
   * <code>repeated .google.appengine.v1.UrlDispatchRule dispatch_rules = 3;</code>
   */
  com.google.appengine.v1.UrlDispatchRuleOrBuilder getDispatchRulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Google Apps authentication domain that controls which users can access
   * this application.
   *
   * Defaults to open access for any Google Account.
   * </pre>
   *
   * <code>string auth_domain = 6;</code>
   *
   * @return The authDomain.
   */
  java.lang.String getAuthDomain();

  /**
   *
   *
   * <pre>
   * Google Apps authentication domain that controls which users can access
   * this application.
   *
   * Defaults to open access for any Google Account.
   * </pre>
   *
   * <code>string auth_domain = 6;</code>
   *
   * @return The bytes for authDomain.
   */
  com.google.protobuf.ByteString getAuthDomainBytes();

  /**
   *
   *
   * <pre>
   * Location from which this application runs. Application instances
   * run out of the data centers in the specified location, which is also where
   * all of the application's end user content is stored.
   *
   * Defaults to `us-central`.
   *
   * View the list of
   * [supported locations](https://cloud.google.com/appengine/docs/locations).
   * </pre>
   *
   * <code>string location_id = 7;</code>
   *
   * @return The locationId.
   */
  java.lang.String getLocationId();

  /**
   *
   *
   * <pre>
   * Location from which this application runs. Application instances
   * run out of the data centers in the specified location, which is also where
   * all of the application's end user content is stored.
   *
   * Defaults to `us-central`.
   *
   * View the list of
   * [supported locations](https://cloud.google.com/appengine/docs/locations).
   * </pre>
   *
   * <code>string location_id = 7;</code>
   *
   * @return The bytes for locationId.
   */
  com.google.protobuf.ByteString getLocationIdBytes();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage bucket that can be used for storing files
   * associated with this application. This bucket is associated with the
   * application and can be used by the gcloud deployment commands.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string code_bucket = 8;</code>
   *
   * @return The codeBucket.
   */
  java.lang.String getCodeBucket();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage bucket that can be used for storing files
   * associated with this application. This bucket is associated with the
   * application and can be used by the gcloud deployment commands.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string code_bucket = 8;</code>
   *
   * @return The bytes for codeBucket.
   */
  com.google.protobuf.ByteString getCodeBucketBytes();

  /**
   *
   *
   * <pre>
   * Cookie expiration policy for this application.
   * </pre>
   *
   * <code>.google.protobuf.Duration default_cookie_expiration = 9;</code>
   *
   * @return Whether the defaultCookieExpiration field is set.
   */
  boolean hasDefaultCookieExpiration();

  /**
   *
   *
   * <pre>
   * Cookie expiration policy for this application.
   * </pre>
   *
   * <code>.google.protobuf.Duration default_cookie_expiration = 9;</code>
   *
   * @return The defaultCookieExpiration.
   */
  com.google.protobuf.Duration getDefaultCookieExpiration();

  /**
   *
   *
   * <pre>
   * Cookie expiration policy for this application.
   * </pre>
   *
   * <code>.google.protobuf.Duration default_cookie_expiration = 9;</code>
   */
  com.google.protobuf.DurationOrBuilder getDefaultCookieExpirationOrBuilder();

  /**
   *
   *
   * <pre>
   * Serving status of this application.
   * </pre>
   *
   * <code>.google.appengine.v1.Application.ServingStatus serving_status = 10;</code>
   *
   * @return The enum numeric value on the wire for servingStatus.
   */
  int getServingStatusValue();

  /**
   *
   *
   * <pre>
   * Serving status of this application.
   * </pre>
   *
   * <code>.google.appengine.v1.Application.ServingStatus serving_status = 10;</code>
   *
   * @return The servingStatus.
   */
  com.google.appengine.v1.Application.ServingStatus getServingStatus();

  /**
   *
   *
   * <pre>
   * Hostname used to reach this application, as resolved by App Engine.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string default_hostname = 11;</code>
   *
   * @return The defaultHostname.
   */
  java.lang.String getDefaultHostname();

  /**
   *
   *
   * <pre>
   * Hostname used to reach this application, as resolved by App Engine.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string default_hostname = 11;</code>
   *
   * @return The bytes for defaultHostname.
   */
  com.google.protobuf.ByteString getDefaultHostnameBytes();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage bucket that can be used by this application to store
   * content.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string default_bucket = 12;</code>
   *
   * @return The defaultBucket.
   */
  java.lang.String getDefaultBucket();

  /**
   *
   *
   * <pre>
   * Google Cloud Storage bucket that can be used by this application to store
   * content.
   *
   * &#64;OutputOnly
   * </pre>
   *
   * <code>string default_bucket = 12;</code>
   *
   * @return The bytes for defaultBucket.
   */
  com.google.protobuf.ByteString getDefaultBucketBytes();

  /**
   *
   *
   * <pre>
   * The service account associated with the application.
   * This is the app-level default identity. If no identity provided during
   * create version, Admin API will fallback to this one.
   * </pre>
   *
   * <code>string service_account = 13;</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();

  /**
   *
   *
   * <pre>
   * The service account associated with the application.
   * This is the app-level default identity. If no identity provided during
   * create version, Admin API will fallback to this one.
   * </pre>
   *
   * <code>string service_account = 13;</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   * <code>.google.appengine.v1.Application.IdentityAwareProxy iap = 14;</code>
   *
   * @return Whether the iap field is set.
   */
  boolean hasIap();

  /**
   * <code>.google.appengine.v1.Application.IdentityAwareProxy iap = 14;</code>
   *
   * @return The iap.
   */
  com.google.appengine.v1.Application.IdentityAwareProxy getIap();

  /** <code>.google.appengine.v1.Application.IdentityAwareProxy iap = 14;</code> */
  com.google.appengine.v1.Application.IdentityAwareProxyOrBuilder getIapOrBuilder();

  /**
   *
   *
   * <pre>
   * The Google Container Registry domain used for storing managed build docker
   * images for this application.
   * </pre>
   *
   * <code>string gcr_domain = 16;</code>
   *
   * @return The gcrDomain.
   */
  java.lang.String getGcrDomain();

  /**
   *
   *
   * <pre>
   * The Google Container Registry domain used for storing managed build docker
   * images for this application.
   * </pre>
   *
   * <code>string gcr_domain = 16;</code>
   *
   * @return The bytes for gcrDomain.
   */
  com.google.protobuf.ByteString getGcrDomainBytes();

  /**
   *
   *
   * <pre>
   * The type of the Cloud Firestore or Cloud Datastore database associated with
   * this application.
   * </pre>
   *
   * <code>.google.appengine.v1.Application.DatabaseType database_type = 17;</code>
   *
   * @return The enum numeric value on the wire for databaseType.
   */
  int getDatabaseTypeValue();

  /**
   *
   *
   * <pre>
   * The type of the Cloud Firestore or Cloud Datastore database associated with
   * this application.
   * </pre>
   *
   * <code>.google.appengine.v1.Application.DatabaseType database_type = 17;</code>
   *
   * @return The databaseType.
   */
  com.google.appengine.v1.Application.DatabaseType getDatabaseType();

  /**
   *
   *
   * <pre>
   * The feature specific settings to be used in the application.
   * </pre>
   *
   * <code>.google.appengine.v1.Application.FeatureSettings feature_settings = 18;</code>
   *
   * @return Whether the featureSettings field is set.
   */
  boolean hasFeatureSettings();

  /**
   *
   *
   * <pre>
   * The feature specific settings to be used in the application.
   * </pre>
   *
   * <code>.google.appengine.v1.Application.FeatureSettings feature_settings = 18;</code>
   *
   * @return The featureSettings.
   */
  com.google.appengine.v1.Application.FeatureSettings getFeatureSettings();

  /**
   *
   *
   * <pre>
   * The feature specific settings to be used in the application.
   * </pre>
   *
   * <code>.google.appengine.v1.Application.FeatureSettings feature_settings = 18;</code>
   */
  com.google.appengine.v1.Application.FeatureSettingsOrBuilder getFeatureSettingsOrBuilder();
}
