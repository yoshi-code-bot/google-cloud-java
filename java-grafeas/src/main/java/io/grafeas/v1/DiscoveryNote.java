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
// source: grafeas/v1/discovery.proto

// Protobuf Java Version: 3.25.8
package io.grafeas.v1;

/**
 *
 *
 * <pre>
 * A note that indicates a type of analysis a provider would perform. This note
 * exists in a provider's project. A `Discovery` occurrence is created in a
 * consumer's project at the start of analysis.
 * </pre>
 *
 * Protobuf type {@code grafeas.v1.DiscoveryNote}
 */
public final class DiscoveryNote extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:grafeas.v1.DiscoveryNote)
    DiscoveryNoteOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DiscoveryNote.newBuilder() to construct.
  private DiscoveryNote(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiscoveryNote() {
    analysisKind_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiscoveryNote();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return io.grafeas.v1.Discovery.internal_static_grafeas_v1_DiscoveryNote_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grafeas.v1.Discovery.internal_static_grafeas_v1_DiscoveryNote_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grafeas.v1.DiscoveryNote.class, io.grafeas.v1.DiscoveryNote.Builder.class);
  }

  public static final int ANALYSIS_KIND_FIELD_NUMBER = 1;
  private int analysisKind_ = 0;

  /**
   *
   *
   * <pre>
   * Required. Immutable. The kind of analysis that is handled by this
   * discovery.
   * </pre>
   *
   * <code>.grafeas.v1.NoteKind analysis_kind = 1;</code>
   *
   * @return The enum numeric value on the wire for analysisKind.
   */
  @java.lang.Override
  public int getAnalysisKindValue() {
    return analysisKind_;
  }

  /**
   *
   *
   * <pre>
   * Required. Immutable. The kind of analysis that is handled by this
   * discovery.
   * </pre>
   *
   * <code>.grafeas.v1.NoteKind analysis_kind = 1;</code>
   *
   * @return The analysisKind.
   */
  @java.lang.Override
  public io.grafeas.v1.NoteKind getAnalysisKind() {
    io.grafeas.v1.NoteKind result = io.grafeas.v1.NoteKind.forNumber(analysisKind_);
    return result == null ? io.grafeas.v1.NoteKind.UNRECOGNIZED : result;
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (analysisKind_ != io.grafeas.v1.NoteKind.NOTE_KIND_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, analysisKind_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (analysisKind_ != io.grafeas.v1.NoteKind.NOTE_KIND_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, analysisKind_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof io.grafeas.v1.DiscoveryNote)) {
      return super.equals(obj);
    }
    io.grafeas.v1.DiscoveryNote other = (io.grafeas.v1.DiscoveryNote) obj;

    if (analysisKind_ != other.analysisKind_) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + ANALYSIS_KIND_FIELD_NUMBER;
    hash = (53 * hash) + analysisKind_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.grafeas.v1.DiscoveryNote parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.DiscoveryNote parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.DiscoveryNote parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.DiscoveryNote parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.DiscoveryNote parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static io.grafeas.v1.DiscoveryNote parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static io.grafeas.v1.DiscoveryNote parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.DiscoveryNote parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.DiscoveryNote parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.DiscoveryNote parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static io.grafeas.v1.DiscoveryNote parseFrom(com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static io.grafeas.v1.DiscoveryNote parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(io.grafeas.v1.DiscoveryNote prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }

  /**
   *
   *
   * <pre>
   * A note that indicates a type of analysis a provider would perform. This note
   * exists in a provider's project. A `Discovery` occurrence is created in a
   * consumer's project at the start of analysis.
   * </pre>
   *
   * Protobuf type {@code grafeas.v1.DiscoveryNote}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:grafeas.v1.DiscoveryNote)
      io.grafeas.v1.DiscoveryNoteOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return io.grafeas.v1.Discovery.internal_static_grafeas_v1_DiscoveryNote_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grafeas.v1.Discovery.internal_static_grafeas_v1_DiscoveryNote_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grafeas.v1.DiscoveryNote.class, io.grafeas.v1.DiscoveryNote.Builder.class);
    }

    // Construct using io.grafeas.v1.DiscoveryNote.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      analysisKind_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return io.grafeas.v1.Discovery.internal_static_grafeas_v1_DiscoveryNote_descriptor;
    }

    @java.lang.Override
    public io.grafeas.v1.DiscoveryNote getDefaultInstanceForType() {
      return io.grafeas.v1.DiscoveryNote.getDefaultInstance();
    }

    @java.lang.Override
    public io.grafeas.v1.DiscoveryNote build() {
      io.grafeas.v1.DiscoveryNote result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.grafeas.v1.DiscoveryNote buildPartial() {
      io.grafeas.v1.DiscoveryNote result = new io.grafeas.v1.DiscoveryNote(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(io.grafeas.v1.DiscoveryNote result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.analysisKind_ = analysisKind_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grafeas.v1.DiscoveryNote) {
        return mergeFrom((io.grafeas.v1.DiscoveryNote) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grafeas.v1.DiscoveryNote other) {
      if (other == io.grafeas.v1.DiscoveryNote.getDefaultInstance()) return this;
      if (other.analysisKind_ != 0) {
        setAnalysisKindValue(other.getAnalysisKindValue());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                analysisKind_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private int analysisKind_ = 0;

    /**
     *
     *
     * <pre>
     * Required. Immutable. The kind of analysis that is handled by this
     * discovery.
     * </pre>
     *
     * <code>.grafeas.v1.NoteKind analysis_kind = 1;</code>
     *
     * @return The enum numeric value on the wire for analysisKind.
     */
    @java.lang.Override
    public int getAnalysisKindValue() {
      return analysisKind_;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The kind of analysis that is handled by this
     * discovery.
     * </pre>
     *
     * <code>.grafeas.v1.NoteKind analysis_kind = 1;</code>
     *
     * @param value The enum numeric value on the wire for analysisKind to set.
     * @return This builder for chaining.
     */
    public Builder setAnalysisKindValue(int value) {
      analysisKind_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The kind of analysis that is handled by this
     * discovery.
     * </pre>
     *
     * <code>.grafeas.v1.NoteKind analysis_kind = 1;</code>
     *
     * @return The analysisKind.
     */
    @java.lang.Override
    public io.grafeas.v1.NoteKind getAnalysisKind() {
      io.grafeas.v1.NoteKind result = io.grafeas.v1.NoteKind.forNumber(analysisKind_);
      return result == null ? io.grafeas.v1.NoteKind.UNRECOGNIZED : result;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The kind of analysis that is handled by this
     * discovery.
     * </pre>
     *
     * <code>.grafeas.v1.NoteKind analysis_kind = 1;</code>
     *
     * @param value The analysisKind to set.
     * @return This builder for chaining.
     */
    public Builder setAnalysisKind(io.grafeas.v1.NoteKind value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      analysisKind_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Required. Immutable. The kind of analysis that is handled by this
     * discovery.
     * </pre>
     *
     * <code>.grafeas.v1.NoteKind analysis_kind = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAnalysisKind() {
      bitField0_ = (bitField0_ & ~0x00000001);
      analysisKind_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:grafeas.v1.DiscoveryNote)
  }

  // @@protoc_insertion_point(class_scope:grafeas.v1.DiscoveryNote)
  private static final io.grafeas.v1.DiscoveryNote DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new io.grafeas.v1.DiscoveryNote();
  }

  public static io.grafeas.v1.DiscoveryNote getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiscoveryNote> PARSER =
      new com.google.protobuf.AbstractParser<DiscoveryNote>() {
        @java.lang.Override
        public DiscoveryNote parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<DiscoveryNote> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiscoveryNote> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.grafeas.v1.DiscoveryNote getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
