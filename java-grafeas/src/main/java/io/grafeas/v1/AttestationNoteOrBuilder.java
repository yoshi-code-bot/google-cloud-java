/*
 * Copyright 2025 The Grafeas Authors. All rights reserved.
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
// source: grafeas/v1/attestation.proto

// Protobuf Java Version: 3.25.8
package io.grafeas.v1;

public interface AttestationNoteOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:grafeas.v1.AttestationNote)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Hint hints at the purpose of the attestation authority.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationNote.Hint hint = 1;</code>
   *
   * @return Whether the hint field is set.
   */
  boolean hasHint();

  /**
   *
   *
   * <pre>
   * Hint hints at the purpose of the attestation authority.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationNote.Hint hint = 1;</code>
   *
   * @return The hint.
   */
  io.grafeas.v1.AttestationNote.Hint getHint();

  /**
   *
   *
   * <pre>
   * Hint hints at the purpose of the attestation authority.
   * </pre>
   *
   * <code>.grafeas.v1.AttestationNote.Hint hint = 1;</code>
   */
  io.grafeas.v1.AttestationNote.HintOrBuilder getHintOrBuilder();
}
