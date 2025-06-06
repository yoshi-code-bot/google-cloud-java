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

/**
 *
 *
 * <pre>
 * Configuration to set up audio encoder. The encoding determines the output
 * audio format that we'd like.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.texttospeech.v1.AudioEncoding}
 */
public enum AudioEncoding implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified. Will return result
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT].
   * </pre>
   *
   * <code>AUDIO_ENCODING_UNSPECIFIED = 0;</code>
   */
  AUDIO_ENCODING_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Uncompressed 16-bit signed little-endian samples (Linear PCM).
   * Audio content returned as LINEAR16 also contains a WAV header.
   * </pre>
   *
   * <code>LINEAR16 = 1;</code>
   */
  LINEAR16(1),
  /**
   *
   *
   * <pre>
   * MP3 audio at 32kbps.
   * </pre>
   *
   * <code>MP3 = 2;</code>
   */
  MP3(2),
  /**
   *
   *
   * <pre>
   * Opus encoded audio wrapped in an ogg container. The result is a
   * file which can be played natively on Android, and in browsers (at least
   * Chrome and Firefox). The quality of the encoding is considerably higher
   * than MP3 while using approximately the same bitrate.
   * </pre>
   *
   * <code>OGG_OPUS = 3;</code>
   */
  OGG_OPUS(3),
  /**
   *
   *
   * <pre>
   * 8-bit samples that compand 14-bit audio samples using G.711 PCMU/mu-law.
   * Audio content returned as MULAW also contains a WAV header.
   * </pre>
   *
   * <code>MULAW = 5;</code>
   */
  MULAW(5),
  /**
   *
   *
   * <pre>
   * 8-bit samples that compand 14-bit audio samples using G.711 PCMU/A-law.
   * Audio content returned as ALAW also contains a WAV header.
   * </pre>
   *
   * <code>ALAW = 6;</code>
   */
  ALAW(6),
  /**
   *
   *
   * <pre>
   * Uncompressed 16-bit signed little-endian samples (Linear PCM).
   * Note that as opposed to LINEAR16, audio won't be wrapped in a WAV (or
   * any other) header.
   * </pre>
   *
   * <code>PCM = 7;</code>
   */
  PCM(7),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified. Will return result
   * [google.rpc.Code.INVALID_ARGUMENT][google.rpc.Code.INVALID_ARGUMENT].
   * </pre>
   *
   * <code>AUDIO_ENCODING_UNSPECIFIED = 0;</code>
   */
  public static final int AUDIO_ENCODING_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Uncompressed 16-bit signed little-endian samples (Linear PCM).
   * Audio content returned as LINEAR16 also contains a WAV header.
   * </pre>
   *
   * <code>LINEAR16 = 1;</code>
   */
  public static final int LINEAR16_VALUE = 1;

  /**
   *
   *
   * <pre>
   * MP3 audio at 32kbps.
   * </pre>
   *
   * <code>MP3 = 2;</code>
   */
  public static final int MP3_VALUE = 2;

  /**
   *
   *
   * <pre>
   * Opus encoded audio wrapped in an ogg container. The result is a
   * file which can be played natively on Android, and in browsers (at least
   * Chrome and Firefox). The quality of the encoding is considerably higher
   * than MP3 while using approximately the same bitrate.
   * </pre>
   *
   * <code>OGG_OPUS = 3;</code>
   */
  public static final int OGG_OPUS_VALUE = 3;

  /**
   *
   *
   * <pre>
   * 8-bit samples that compand 14-bit audio samples using G.711 PCMU/mu-law.
   * Audio content returned as MULAW also contains a WAV header.
   * </pre>
   *
   * <code>MULAW = 5;</code>
   */
  public static final int MULAW_VALUE = 5;

  /**
   *
   *
   * <pre>
   * 8-bit samples that compand 14-bit audio samples using G.711 PCMU/A-law.
   * Audio content returned as ALAW also contains a WAV header.
   * </pre>
   *
   * <code>ALAW = 6;</code>
   */
  public static final int ALAW_VALUE = 6;

  /**
   *
   *
   * <pre>
   * Uncompressed 16-bit signed little-endian samples (Linear PCM).
   * Note that as opposed to LINEAR16, audio won't be wrapped in a WAV (or
   * any other) header.
   * </pre>
   *
   * <code>PCM = 7;</code>
   */
  public static final int PCM_VALUE = 7;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AudioEncoding valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AudioEncoding forNumber(int value) {
    switch (value) {
      case 0:
        return AUDIO_ENCODING_UNSPECIFIED;
      case 1:
        return LINEAR16;
      case 2:
        return MP3;
      case 3:
        return OGG_OPUS;
      case 5:
        return MULAW;
      case 6:
        return ALAW;
      case 7:
        return PCM;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AudioEncoding> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<AudioEncoding> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<AudioEncoding>() {
        public AudioEncoding findValueByNumber(int number) {
          return AudioEncoding.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.texttospeech.v1.TextToSpeechProto.getDescriptor().getEnumTypes().get(1);
  }

  private static final AudioEncoding[] VALUES = values();

  public static AudioEncoding valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AudioEncoding(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.texttospeech.v1.AudioEncoding)
}
