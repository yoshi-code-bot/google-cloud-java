/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Cloud OS Login API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= OsLoginServiceClient =======================
 *
 * <p>Service Description: Cloud OS Login API
 *
 * <p>The Cloud OS Login API allows you to manage users and their associated SSH public keys for
 * logging into virtual machines on Google Cloud Platform.
 *
 * <p>Sample for OsLoginServiceClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated and should be regarded as a code template only.
 * // It will require modifications to work:
 * // - It may require correct/in-range values for request initialization.
 * // - It may require specifying regional endpoints when creating the service client as shown in
 * // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
 * try (OsLoginServiceClient osLoginServiceClient = OsLoginServiceClient.create()) {
 *   UserName parent = UserName.of("[USER]");
 *   OsLoginProto.SshPublicKey sshPublicKey = OsLoginProto.SshPublicKey.newBuilder().build();
 *   OsLoginProto.SshPublicKey response =
 *       osLoginServiceClient.createSshPublicKey(parent, sshPublicKey);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.cloud.oslogin.v1;

import javax.annotation.Generated;
