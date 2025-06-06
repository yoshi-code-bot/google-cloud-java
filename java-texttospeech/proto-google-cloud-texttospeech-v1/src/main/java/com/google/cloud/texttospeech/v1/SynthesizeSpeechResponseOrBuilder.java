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
// source: google/cloud/texttospeech/v1/cloud_tts.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.texttospeech.v1;

public interface SynthesizeSpeechResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.texttospeech.v1.SynthesizeSpeechResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The audio data bytes encoded as specified in the request, including the
   * header for encodings that are wrapped in containers (e.g. MP3, OGG_OPUS).
   * For LINEAR16 audio, we include the WAV header. Note: as
   * with all bytes fields, protobuffers use a pure binary representation,
   * whereas JSON representations use base64.
   * </pre>
   *
   * <code>bytes audio_content = 1;</code>
   *
   * @return The audioContent.
   */
  com.google.protobuf.ByteString getAudioContent();
}
