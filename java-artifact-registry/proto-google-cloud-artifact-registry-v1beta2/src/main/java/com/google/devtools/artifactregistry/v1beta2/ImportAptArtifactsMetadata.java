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
// source: google/devtools/artifactregistry/v1beta2/apt_artifact.proto

// Protobuf Java Version: 3.25.8
package com.google.devtools.artifactregistry.v1beta2;

/**
 *
 *
 * <pre>
 * The operation metadata for importing artifacts.
 * </pre>
 *
 * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata}
 */
public final class ImportAptArtifactsMetadata extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata)
    ImportAptArtifactsMetadataOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use ImportAptArtifactsMetadata.newBuilder() to construct.
  private ImportAptArtifactsMetadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportAptArtifactsMetadata() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportAptArtifactsMetadata();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.artifactregistry.v1beta2.AptArtifactProto
        .internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsMetadata_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.artifactregistry.v1beta2.AptArtifactProto
        .internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsMetadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata.class,
            com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata.Builder.class);
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
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata)) {
      return super.equals(obj);
    }
    com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata other =
        (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata) obj;

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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata parseFrom(
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

  public static Builder newBuilder(
      com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata prototype) {
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
   * The operation metadata for importing artifacts.
   * </pre>
   *
   * Protobuf type {@code google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata)
      com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.artifactregistry.v1beta2.AptArtifactProto
          .internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsMetadata_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.artifactregistry.v1beta2.AptArtifactProto
          .internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsMetadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata.class,
              com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata.Builder
                  .class);
    }

    // Construct using
    // com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.artifactregistry.v1beta2.AptArtifactProto
          .internal_static_google_devtools_artifactregistry_v1beta2_ImportAptArtifactsMetadata_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata
        getDefaultInstanceForType() {
      return com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata build() {
      com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata buildPartial() {
      com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata result =
          new com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata(this);
      onBuilt();
      return result;
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
      if (other
          instanceof com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata) {
        return mergeFrom(
            (com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata other) {
      if (other
          == com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata
              .getDefaultInstance()) return this;
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

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata)
  private static final com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata();
  }

  public static com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportAptArtifactsMetadata> PARSER =
      new com.google.protobuf.AbstractParser<ImportAptArtifactsMetadata>() {
        @java.lang.Override
        public ImportAptArtifactsMetadata parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportAptArtifactsMetadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportAptArtifactsMetadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.artifactregistry.v1beta2.ImportAptArtifactsMetadata
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
