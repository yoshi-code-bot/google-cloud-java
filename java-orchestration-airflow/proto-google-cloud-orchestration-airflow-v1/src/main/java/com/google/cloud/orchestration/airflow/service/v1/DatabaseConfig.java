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
// source: google/cloud/orchestration/airflow/service/v1/environments.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.orchestration.airflow.service.v1;

/**
 *
 *
 * <pre>
 * The configuration of Cloud SQL instance that is used by the Apache Airflow
 * software.
 * </pre>
 *
 * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.DatabaseConfig}
 */
public final class DatabaseConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.orchestration.airflow.service.v1.DatabaseConfig)
    DatabaseConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use DatabaseConfig.newBuilder() to construct.
  private DatabaseConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DatabaseConfig() {
    machineType_ = "";
    zone_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DatabaseConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_DatabaseConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
        .internal_static_google_cloud_orchestration_airflow_service_v1_DatabaseConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig.class,
            com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig.Builder.class);
  }

  public static final int MACHINE_TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object machineType_ = "";

  /**
   *
   *
   * <pre>
   * Optional. Cloud SQL machine type used by Airflow database.
   * It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8
   * or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
   * Supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The machineType.
   */
  @java.lang.Override
  public java.lang.String getMachineType() {
    java.lang.Object ref = machineType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      machineType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. Cloud SQL machine type used by Airflow database.
   * It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8
   * or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
   * Supported for Cloud Composer environments in versions
   * composer-1.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for machineType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMachineTypeBytes() {
    java.lang.Object ref = machineType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      machineType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ZONE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object zone_ = "";

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine zone where the Airflow database is created. If
   * zone is provided, it must be in the region selected for the environment. If
   * zone is not provided, a zone is automatically selected. The zone can only
   * be set during environment creation. Supported for Cloud Composer
   * environments in versions composer-2.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The zone.
   */
  @java.lang.Override
  public java.lang.String getZone() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      zone_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Optional. The Compute Engine zone where the Airflow database is created. If
   * zone is provided, it must be in the region selected for the environment. If
   * zone is not provided, a zone is automatically selected. The zone can only
   * be set during environment creation. Supported for Cloud Composer
   * environments in versions composer-2.*.*-airflow-*.*.*.
   * </pre>
   *
   * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for zone.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getZoneBytes() {
    java.lang.Object ref = zone_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      zone_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(machineType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, machineType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, zone_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(machineType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, machineType_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(zone_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, zone_);
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
    if (!(obj instanceof com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig other =
        (com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig) obj;

    if (!getMachineType().equals(other.getMachineType())) return false;
    if (!getZone().equals(other.getZone())) return false;
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
    hash = (37 * hash) + MACHINE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getMachineType().hashCode();
    hash = (37 * hash) + ZONE_FIELD_NUMBER;
    hash = (53 * hash) + getZone().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig parseFrom(
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
      com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig prototype) {
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
   * The configuration of Cloud SQL instance that is used by the Apache Airflow
   * software.
   * </pre>
   *
   * Protobuf type {@code google.cloud.orchestration.airflow.service.v1.DatabaseConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.orchestration.airflow.service.v1.DatabaseConfig)
      com.google.cloud.orchestration.airflow.service.v1.DatabaseConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_DatabaseConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_DatabaseConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig.class,
              com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig.Builder.class);
    }

    // Construct using com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      machineType_ = "";
      zone_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.orchestration.airflow.service.v1.EnvironmentsOuterClass
          .internal_static_google_cloud_orchestration_airflow_service_v1_DatabaseConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig
        getDefaultInstanceForType() {
      return com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig build() {
      com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig buildPartial() {
      com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig result =
          new com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.machineType_ = machineType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.zone_ = zone_;
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
      if (other instanceof com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig) {
        return mergeFrom((com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig other) {
      if (other
          == com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig.getDefaultInstance())
        return this;
      if (!other.getMachineType().isEmpty()) {
        machineType_ = other.machineType_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getZone().isEmpty()) {
        zone_ = other.zone_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 10:
              {
                machineType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                zone_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object machineType_ = "";

    /**
     *
     *
     * <pre>
     * Optional. Cloud SQL machine type used by Airflow database.
     * It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8
     * or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
     * Supported for Cloud Composer environments in versions
     * composer-1.*.*-airflow-*.*.*.
     * </pre>
     *
     * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The machineType.
     */
    public java.lang.String getMachineType() {
      java.lang.Object ref = machineType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        machineType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Cloud SQL machine type used by Airflow database.
     * It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8
     * or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
     * Supported for Cloud Composer environments in versions
     * composer-1.*.*-airflow-*.*.*.
     * </pre>
     *
     * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for machineType.
     */
    public com.google.protobuf.ByteString getMachineTypeBytes() {
      java.lang.Object ref = machineType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        machineType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. Cloud SQL machine type used by Airflow database.
     * It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8
     * or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
     * Supported for Cloud Composer environments in versions
     * composer-1.*.*-airflow-*.*.*.
     * </pre>
     *
     * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The machineType to set.
     * @return This builder for chaining.
     */
    public Builder setMachineType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      machineType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Cloud SQL machine type used by Airflow database.
     * It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8
     * or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
     * Supported for Cloud Composer environments in versions
     * composer-1.*.*-airflow-*.*.*.
     * </pre>
     *
     * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMachineType() {
      machineType_ = getDefaultInstance().getMachineType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. Cloud SQL machine type used by Airflow database.
     * It has to be one of: db-n1-standard-2, db-n1-standard-4, db-n1-standard-8
     * or db-n1-standard-16. If not specified, db-n1-standard-2 will be used.
     * Supported for Cloud Composer environments in versions
     * composer-1.*.*-airflow-*.*.*.
     * </pre>
     *
     * <code>string machine_type = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for machineType to set.
     * @return This builder for chaining.
     */
    public Builder setMachineTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      machineType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object zone_ = "";

    /**
     *
     *
     * <pre>
     * Optional. The Compute Engine zone where the Airflow database is created. If
     * zone is provided, it must be in the region selected for the environment. If
     * zone is not provided, a zone is automatically selected. The zone can only
     * be set during environment creation. Supported for Cloud Composer
     * environments in versions composer-2.*.*-airflow-*.*.*.
     * </pre>
     *
     * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The zone.
     */
    public java.lang.String getZone() {
      java.lang.Object ref = zone_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        zone_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The Compute Engine zone where the Airflow database is created. If
     * zone is provided, it must be in the region selected for the environment. If
     * zone is not provided, a zone is automatically selected. The zone can only
     * be set during environment creation. Supported for Cloud Composer
     * environments in versions composer-2.*.*-airflow-*.*.*.
     * </pre>
     *
     * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for zone.
     */
    public com.google.protobuf.ByteString getZoneBytes() {
      java.lang.Object ref = zone_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        zone_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Optional. The Compute Engine zone where the Airflow database is created. If
     * zone is provided, it must be in the region selected for the environment. If
     * zone is not provided, a zone is automatically selected. The zone can only
     * be set during environment creation. Supported for Cloud Composer
     * environments in versions composer-2.*.*-airflow-*.*.*.
     * </pre>
     *
     * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The zone to set.
     * @return This builder for chaining.
     */
    public Builder setZone(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      zone_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The Compute Engine zone where the Airflow database is created. If
     * zone is provided, it must be in the region selected for the environment. If
     * zone is not provided, a zone is automatically selected. The zone can only
     * be set during environment creation. Supported for Cloud Composer
     * environments in versions composer-2.*.*-airflow-*.*.*.
     * </pre>
     *
     * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearZone() {
      zone_ = getDefaultInstance().getZone();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Optional. The Compute Engine zone where the Airflow database is created. If
     * zone is provided, it must be in the region selected for the environment. If
     * zone is not provided, a zone is automatically selected. The zone can only
     * be set during environment creation. Supported for Cloud Composer
     * environments in versions composer-2.*.*-airflow-*.*.*.
     * </pre>
     *
     * <code>string zone = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for zone to set.
     * @return This builder for chaining.
     */
    public Builder setZoneBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      zone_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.orchestration.airflow.service.v1.DatabaseConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.orchestration.airflow.service.v1.DatabaseConfig)
  private static final com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig();
  }

  public static com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DatabaseConfig> PARSER =
      new com.google.protobuf.AbstractParser<DatabaseConfig>() {
        @java.lang.Override
        public DatabaseConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<DatabaseConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DatabaseConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.orchestration.airflow.service.v1.DatabaseConfig
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
