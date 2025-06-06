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
// source: google/cloud/scheduler/v1/cloudscheduler.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.scheduler.v1;

public interface ListJobsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.scheduler.v1.ListJobsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.scheduler.v1.Job jobs = 1;</code>
   */
  java.util.List<com.google.cloud.scheduler.v1.Job> getJobsList();

  /**
   *
   *
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.scheduler.v1.Job jobs = 1;</code>
   */
  com.google.cloud.scheduler.v1.Job getJobs(int index);

  /**
   *
   *
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.scheduler.v1.Job jobs = 1;</code>
   */
  int getJobsCount();

  /**
   *
   *
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.scheduler.v1.Job jobs = 1;</code>
   */
  java.util.List<? extends com.google.cloud.scheduler.v1.JobOrBuilder> getJobsOrBuilderList();

  /**
   *
   *
   * <pre>
   * The list of jobs.
   * </pre>
   *
   * <code>repeated .google.cloud.scheduler.v1.Job jobs = 1;</code>
   */
  com.google.cloud.scheduler.v1.JobOrBuilder getJobsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token to retrieve next page of results. Pass this value in the
   * [page_token][google.cloud.scheduler.v1.ListJobsRequest.page_token] field in
   * the subsequent call to
   * [ListJobs][google.cloud.scheduler.v1.CloudScheduler.ListJobs] to retrieve
   * the next page of results. If this is empty it indicates that there are no
   * more results through which to paginate.
   *
   * The page token is valid for only 2 hours.
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
   * A token to retrieve next page of results. Pass this value in the
   * [page_token][google.cloud.scheduler.v1.ListJobsRequest.page_token] field in
   * the subsequent call to
   * [ListJobs][google.cloud.scheduler.v1.CloudScheduler.ListJobs] to retrieve
   * the next page of results. If this is empty it indicates that there are no
   * more results through which to paginate.
   *
   * The page token is valid for only 2 hours.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
