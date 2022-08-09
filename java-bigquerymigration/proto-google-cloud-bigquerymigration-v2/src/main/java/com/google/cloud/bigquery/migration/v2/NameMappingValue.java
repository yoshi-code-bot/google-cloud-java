/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/bigquery/migration/v2/translation_config.proto

package com.google.cloud.bigquery.migration.v2;

/**
 *
 *
 * <pre>
 * The potential components of a full name mapping that will be mapped
 * during translation in the target data warehouse.
 * </pre>
 *
 * Protobuf type {@code google.cloud.bigquery.migration.v2.NameMappingValue}
 */
public final class NameMappingValue extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.bigquery.migration.v2.NameMappingValue)
    NameMappingValueOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NameMappingValue.newBuilder() to construct.
  private NameMappingValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NameMappingValue() {
    database_ = "";
    schema_ = "";
    relation_ = "";
    attribute_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NameMappingValue();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private NameMappingValue(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              database_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              schema_ = s;
              break;
            }
          case 26:
            {
              java.lang.String s = input.readStringRequireUtf8();

              relation_ = s;
              break;
            }
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              attribute_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.bigquery.migration.v2.TranslationConfigProto
        .internal_static_google_cloud_bigquery_migration_v2_NameMappingValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.bigquery.migration.v2.TranslationConfigProto
        .internal_static_google_cloud_bigquery_migration_v2_NameMappingValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.bigquery.migration.v2.NameMappingValue.class,
            com.google.cloud.bigquery.migration.v2.NameMappingValue.Builder.class);
  }

  public static final int DATABASE_FIELD_NUMBER = 1;
  private volatile java.lang.Object database_;
  /**
   *
   *
   * <pre>
   * The database name (BigQuery project ID equivalent in the target data
   * warehouse).
   * </pre>
   *
   * <code>string database = 1;</code>
   *
   * @return The database.
   */
  @java.lang.Override
  public java.lang.String getDatabase() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      database_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The database name (BigQuery project ID equivalent in the target data
   * warehouse).
   * </pre>
   *
   * <code>string database = 1;</code>
   *
   * @return The bytes for database.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDatabaseBytes() {
    java.lang.Object ref = database_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      database_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCHEMA_FIELD_NUMBER = 2;
  private volatile java.lang.Object schema_;
  /**
   *
   *
   * <pre>
   * The schema name (BigQuery dataset equivalent in the target data warehouse).
   * </pre>
   *
   * <code>string schema = 2;</code>
   *
   * @return The schema.
   */
  @java.lang.Override
  public java.lang.String getSchema() {
    java.lang.Object ref = schema_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      schema_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The schema name (BigQuery dataset equivalent in the target data warehouse).
   * </pre>
   *
   * <code>string schema = 2;</code>
   *
   * @return The bytes for schema.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSchemaBytes() {
    java.lang.Object ref = schema_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      schema_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RELATION_FIELD_NUMBER = 3;
  private volatile java.lang.Object relation_;
  /**
   *
   *
   * <pre>
   * The relation name (BigQuery table or view equivalent in the target data
   * warehouse).
   * </pre>
   *
   * <code>string relation = 3;</code>
   *
   * @return The relation.
   */
  @java.lang.Override
  public java.lang.String getRelation() {
    java.lang.Object ref = relation_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      relation_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The relation name (BigQuery table or view equivalent in the target data
   * warehouse).
   * </pre>
   *
   * <code>string relation = 3;</code>
   *
   * @return The bytes for relation.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRelationBytes() {
    java.lang.Object ref = relation_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      relation_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ATTRIBUTE_FIELD_NUMBER = 4;
  private volatile java.lang.Object attribute_;
  /**
   *
   *
   * <pre>
   * The attribute name (BigQuery column equivalent in the target data
   * warehouse).
   * </pre>
   *
   * <code>string attribute = 4;</code>
   *
   * @return The attribute.
   */
  @java.lang.Override
  public java.lang.String getAttribute() {
    java.lang.Object ref = attribute_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      attribute_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The attribute name (BigQuery column equivalent in the target data
   * warehouse).
   * </pre>
   *
   * <code>string attribute = 4;</code>
   *
   * @return The bytes for attribute.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getAttributeBytes() {
    java.lang.Object ref = attribute_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      attribute_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(database_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, database_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schema_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, schema_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relation_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, relation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attribute_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, attribute_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(database_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, database_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(schema_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, schema_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(relation_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, relation_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(attribute_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, attribute_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.bigquery.migration.v2.NameMappingValue)) {
      return super.equals(obj);
    }
    com.google.cloud.bigquery.migration.v2.NameMappingValue other =
        (com.google.cloud.bigquery.migration.v2.NameMappingValue) obj;

    if (!getDatabase().equals(other.getDatabase())) return false;
    if (!getSchema().equals(other.getSchema())) return false;
    if (!getRelation().equals(other.getRelation())) return false;
    if (!getAttribute().equals(other.getAttribute())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + DATABASE_FIELD_NUMBER;
    hash = (53 * hash) + getDatabase().hashCode();
    hash = (37 * hash) + SCHEMA_FIELD_NUMBER;
    hash = (53 * hash) + getSchema().hashCode();
    hash = (37 * hash) + RELATION_FIELD_NUMBER;
    hash = (53 * hash) + getRelation().hashCode();
    hash = (37 * hash) + ATTRIBUTE_FIELD_NUMBER;
    hash = (53 * hash) + getAttribute().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue parseFrom(
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
      com.google.cloud.bigquery.migration.v2.NameMappingValue prototype) {
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
   * The potential components of a full name mapping that will be mapped
   * during translation in the target data warehouse.
   * </pre>
   *
   * Protobuf type {@code google.cloud.bigquery.migration.v2.NameMappingValue}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.bigquery.migration.v2.NameMappingValue)
      com.google.cloud.bigquery.migration.v2.NameMappingValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.bigquery.migration.v2.TranslationConfigProto
          .internal_static_google_cloud_bigquery_migration_v2_NameMappingValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.bigquery.migration.v2.TranslationConfigProto
          .internal_static_google_cloud_bigquery_migration_v2_NameMappingValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.bigquery.migration.v2.NameMappingValue.class,
              com.google.cloud.bigquery.migration.v2.NameMappingValue.Builder.class);
    }

    // Construct using com.google.cloud.bigquery.migration.v2.NameMappingValue.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      database_ = "";

      schema_ = "";

      relation_ = "";

      attribute_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.bigquery.migration.v2.TranslationConfigProto
          .internal_static_google_cloud_bigquery_migration_v2_NameMappingValue_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.NameMappingValue getDefaultInstanceForType() {
      return com.google.cloud.bigquery.migration.v2.NameMappingValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.NameMappingValue build() {
      com.google.cloud.bigquery.migration.v2.NameMappingValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.bigquery.migration.v2.NameMappingValue buildPartial() {
      com.google.cloud.bigquery.migration.v2.NameMappingValue result =
          new com.google.cloud.bigquery.migration.v2.NameMappingValue(this);
      result.database_ = database_;
      result.schema_ = schema_;
      result.relation_ = relation_;
      result.attribute_ = attribute_;
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
      if (other instanceof com.google.cloud.bigquery.migration.v2.NameMappingValue) {
        return mergeFrom((com.google.cloud.bigquery.migration.v2.NameMappingValue) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.bigquery.migration.v2.NameMappingValue other) {
      if (other == com.google.cloud.bigquery.migration.v2.NameMappingValue.getDefaultInstance())
        return this;
      if (!other.getDatabase().isEmpty()) {
        database_ = other.database_;
        onChanged();
      }
      if (!other.getSchema().isEmpty()) {
        schema_ = other.schema_;
        onChanged();
      }
      if (!other.getRelation().isEmpty()) {
        relation_ = other.relation_;
        onChanged();
      }
      if (!other.getAttribute().isEmpty()) {
        attribute_ = other.attribute_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.cloud.bigquery.migration.v2.NameMappingValue parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.bigquery.migration.v2.NameMappingValue) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object database_ = "";
    /**
     *
     *
     * <pre>
     * The database name (BigQuery project ID equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string database = 1;</code>
     *
     * @return The database.
     */
    public java.lang.String getDatabase() {
      java.lang.Object ref = database_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        database_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The database name (BigQuery project ID equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string database = 1;</code>
     *
     * @return The bytes for database.
     */
    public com.google.protobuf.ByteString getDatabaseBytes() {
      java.lang.Object ref = database_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        database_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The database name (BigQuery project ID equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string database = 1;</code>
     *
     * @param value The database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabase(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      database_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The database name (BigQuery project ID equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string database = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDatabase() {

      database_ = getDefaultInstance().getDatabase();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The database name (BigQuery project ID equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string database = 1;</code>
     *
     * @param value The bytes for database to set.
     * @return This builder for chaining.
     */
    public Builder setDatabaseBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      database_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object schema_ = "";
    /**
     *
     *
     * <pre>
     * The schema name (BigQuery dataset equivalent in the target data warehouse).
     * </pre>
     *
     * <code>string schema = 2;</code>
     *
     * @return The schema.
     */
    public java.lang.String getSchema() {
      java.lang.Object ref = schema_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        schema_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The schema name (BigQuery dataset equivalent in the target data warehouse).
     * </pre>
     *
     * <code>string schema = 2;</code>
     *
     * @return The bytes for schema.
     */
    public com.google.protobuf.ByteString getSchemaBytes() {
      java.lang.Object ref = schema_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        schema_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The schema name (BigQuery dataset equivalent in the target data warehouse).
     * </pre>
     *
     * <code>string schema = 2;</code>
     *
     * @param value The schema to set.
     * @return This builder for chaining.
     */
    public Builder setSchema(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      schema_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema name (BigQuery dataset equivalent in the target data warehouse).
     * </pre>
     *
     * <code>string schema = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSchema() {

      schema_ = getDefaultInstance().getSchema();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema name (BigQuery dataset equivalent in the target data warehouse).
     * </pre>
     *
     * <code>string schema = 2;</code>
     *
     * @param value The bytes for schema to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      schema_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object relation_ = "";
    /**
     *
     *
     * <pre>
     * The relation name (BigQuery table or view equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string relation = 3;</code>
     *
     * @return The relation.
     */
    public java.lang.String getRelation() {
      java.lang.Object ref = relation_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        relation_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The relation name (BigQuery table or view equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string relation = 3;</code>
     *
     * @return The bytes for relation.
     */
    public com.google.protobuf.ByteString getRelationBytes() {
      java.lang.Object ref = relation_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        relation_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The relation name (BigQuery table or view equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string relation = 3;</code>
     *
     * @param value The relation to set.
     * @return This builder for chaining.
     */
    public Builder setRelation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      relation_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The relation name (BigQuery table or view equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string relation = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRelation() {

      relation_ = getDefaultInstance().getRelation();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The relation name (BigQuery table or view equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string relation = 3;</code>
     *
     * @param value The bytes for relation to set.
     * @return This builder for chaining.
     */
    public Builder setRelationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      relation_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object attribute_ = "";
    /**
     *
     *
     * <pre>
     * The attribute name (BigQuery column equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string attribute = 4;</code>
     *
     * @return The attribute.
     */
    public java.lang.String getAttribute() {
      java.lang.Object ref = attribute_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        attribute_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The attribute name (BigQuery column equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string attribute = 4;</code>
     *
     * @return The bytes for attribute.
     */
    public com.google.protobuf.ByteString getAttributeBytes() {
      java.lang.Object ref = attribute_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        attribute_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The attribute name (BigQuery column equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string attribute = 4;</code>
     *
     * @param value The attribute to set.
     * @return This builder for chaining.
     */
    public Builder setAttribute(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      attribute_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The attribute name (BigQuery column equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string attribute = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAttribute() {

      attribute_ = getDefaultInstance().getAttribute();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The attribute name (BigQuery column equivalent in the target data
     * warehouse).
     * </pre>
     *
     * <code>string attribute = 4;</code>
     *
     * @param value The bytes for attribute to set.
     * @return This builder for chaining.
     */
    public Builder setAttributeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      attribute_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.bigquery.migration.v2.NameMappingValue)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.bigquery.migration.v2.NameMappingValue)
  private static final com.google.cloud.bigquery.migration.v2.NameMappingValue DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.bigquery.migration.v2.NameMappingValue();
  }

  public static com.google.cloud.bigquery.migration.v2.NameMappingValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NameMappingValue> PARSER =
      new com.google.protobuf.AbstractParser<NameMappingValue>() {
        @java.lang.Override
        public NameMappingValue parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new NameMappingValue(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<NameMappingValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NameMappingValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.bigquery.migration.v2.NameMappingValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}