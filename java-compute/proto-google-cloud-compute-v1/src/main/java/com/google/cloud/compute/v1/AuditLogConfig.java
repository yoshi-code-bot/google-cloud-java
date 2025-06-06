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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * Provides the configuration for logging a type of permissions. Example: { "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose&#64;example.com" ] }, { "log_type": "DATA_WRITE" } ] } This enables 'DATA_READ' and 'DATA_WRITE' logging, while exempting jose&#64;example.com from DATA_READ logging.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.AuditLogConfig}
 */
public final class AuditLogConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.AuditLogConfig)
    AuditLogConfigOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use AuditLogConfig.newBuilder() to construct.
  private AuditLogConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AuditLogConfig() {
    exemptedMembers_ = com.google.protobuf.LazyStringArrayList.emptyList();
    logType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AuditLogConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AuditLogConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_AuditLogConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.AuditLogConfig.class,
            com.google.cloud.compute.v1.AuditLogConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * The log type that this config enables.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.AuditLogConfig.LogType}
   */
  public enum LogType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOG_TYPE = 0;</code>
     */
    UNDEFINED_LOG_TYPE(0),
    /**
     *
     *
     * <pre>
     * Admin reads. Example: CloudIAM getIamPolicy
     * </pre>
     *
     * <code>ADMIN_READ = 128951462;</code>
     */
    ADMIN_READ(128951462),
    /**
     *
     *
     * <pre>
     * Data reads. Example: CloudSQL Users list
     * </pre>
     *
     * <code>DATA_READ = 305224971;</code>
     */
    DATA_READ(305224971),
    /**
     *
     *
     * <pre>
     * Data writes. Example: CloudSQL Users create
     * </pre>
     *
     * <code>DATA_WRITE = 340181738;</code>
     */
    DATA_WRITE(340181738),
    /**
     *
     *
     * <pre>
     * Default case. Should never be this.
     * </pre>
     *
     * <code>LOG_TYPE_UNSPECIFIED = 154527053;</code>
     */
    LOG_TYPE_UNSPECIFIED(154527053),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_LOG_TYPE = 0;</code>
     */
    public static final int UNDEFINED_LOG_TYPE_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Admin reads. Example: CloudIAM getIamPolicy
     * </pre>
     *
     * <code>ADMIN_READ = 128951462;</code>
     */
    public static final int ADMIN_READ_VALUE = 128951462;

    /**
     *
     *
     * <pre>
     * Data reads. Example: CloudSQL Users list
     * </pre>
     *
     * <code>DATA_READ = 305224971;</code>
     */
    public static final int DATA_READ_VALUE = 305224971;

    /**
     *
     *
     * <pre>
     * Data writes. Example: CloudSQL Users create
     * </pre>
     *
     * <code>DATA_WRITE = 340181738;</code>
     */
    public static final int DATA_WRITE_VALUE = 340181738;

    /**
     *
     *
     * <pre>
     * Default case. Should never be this.
     * </pre>
     *
     * <code>LOG_TYPE_UNSPECIFIED = 154527053;</code>
     */
    public static final int LOG_TYPE_UNSPECIFIED_VALUE = 154527053;

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
    public static LogType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static LogType forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_LOG_TYPE;
        case 128951462:
          return ADMIN_READ;
        case 305224971:
          return DATA_READ;
        case 340181738:
          return DATA_WRITE;
        case 154527053:
          return LOG_TYPE_UNSPECIFIED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<LogType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<LogType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<LogType>() {
          public LogType findValueByNumber(int number) {
            return LogType.forNumber(number);
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
      return com.google.cloud.compute.v1.AuditLogConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final LogType[] VALUES = values();

    public static LogType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private LogType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.AuditLogConfig.LogType)
  }

  private int bitField0_;
  public static final int EXEMPTED_MEMBERS_FIELD_NUMBER = 232615576;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList exemptedMembers_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
   * </pre>
   *
   * <code>repeated string exempted_members = 232615576;</code>
   *
   * @return A list containing the exemptedMembers.
   */
  public com.google.protobuf.ProtocolStringList getExemptedMembersList() {
    return exemptedMembers_;
  }

  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
   * </pre>
   *
   * <code>repeated string exempted_members = 232615576;</code>
   *
   * @return The count of exemptedMembers.
   */
  public int getExemptedMembersCount() {
    return exemptedMembers_.size();
  }

  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
   * </pre>
   *
   * <code>repeated string exempted_members = 232615576;</code>
   *
   * @param index The index of the element to return.
   * @return The exemptedMembers at the given index.
   */
  public java.lang.String getExemptedMembers(int index) {
    return exemptedMembers_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
   * </pre>
   *
   * <code>repeated string exempted_members = 232615576;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the exemptedMembers at the given index.
   */
  public com.google.protobuf.ByteString getExemptedMembersBytes(int index) {
    return exemptedMembers_.getByteString(index);
  }

  public static final int IGNORE_CHILD_EXEMPTIONS_FIELD_NUMBER = 70141850;
  private boolean ignoreChildExemptions_ = false;

  /**
   * <code>optional bool ignore_child_exemptions = 70141850;</code>
   *
   * @return Whether the ignoreChildExemptions field is set.
   */
  @java.lang.Override
  public boolean hasIgnoreChildExemptions() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   * <code>optional bool ignore_child_exemptions = 70141850;</code>
   *
   * @return The ignoreChildExemptions.
   */
  @java.lang.Override
  public boolean getIgnoreChildExemptions() {
    return ignoreChildExemptions_;
  }

  public static final int LOG_TYPE_FIELD_NUMBER = 403115861;

  @SuppressWarnings("serial")
  private volatile java.lang.Object logType_ = "";

  /**
   *
   *
   * <pre>
   * The log type that this config enables.
   * Check the LogType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_type = 403115861;</code>
   *
   * @return Whether the logType field is set.
   */
  @java.lang.Override
  public boolean hasLogType() {
    return ((bitField0_ & 0x00000002) != 0);
  }

  /**
   *
   *
   * <pre>
   * The log type that this config enables.
   * Check the LogType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_type = 403115861;</code>
   *
   * @return The logType.
   */
  @java.lang.Override
  public java.lang.String getLogType() {
    java.lang.Object ref = logType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      logType_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * The log type that this config enables.
   * Check the LogType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string log_type = 403115861;</code>
   *
   * @return The bytes for logType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLogTypeBytes() {
    java.lang.Object ref = logType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      logType_ = b;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeBool(70141850, ignoreChildExemptions_);
    }
    for (int i = 0; i < exemptedMembers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(
          output, 232615576, exemptedMembers_.getRaw(i));
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 403115861, logType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size +=
          com.google.protobuf.CodedOutputStream.computeBoolSize(70141850, ignoreChildExemptions_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < exemptedMembers_.size(); i++) {
        dataSize += computeStringSizeNoTag(exemptedMembers_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getExemptedMembersList().size();
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(403115861, logType_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.AuditLogConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.AuditLogConfig other =
        (com.google.cloud.compute.v1.AuditLogConfig) obj;

    if (!getExemptedMembersList().equals(other.getExemptedMembersList())) return false;
    if (hasIgnoreChildExemptions() != other.hasIgnoreChildExemptions()) return false;
    if (hasIgnoreChildExemptions()) {
      if (getIgnoreChildExemptions() != other.getIgnoreChildExemptions()) return false;
    }
    if (hasLogType() != other.hasLogType()) return false;
    if (hasLogType()) {
      if (!getLogType().equals(other.getLogType())) return false;
    }
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
    if (getExemptedMembersCount() > 0) {
      hash = (37 * hash) + EXEMPTED_MEMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getExemptedMembersList().hashCode();
    }
    if (hasIgnoreChildExemptions()) {
      hash = (37 * hash) + IGNORE_CHILD_EXEMPTIONS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getIgnoreChildExemptions());
    }
    if (hasLogType()) {
      hash = (37 * hash) + LOG_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getLogType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.AuditLogConfig parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.AuditLogConfig prototype) {
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
   * Provides the configuration for logging a type of permissions. Example: { "audit_log_configs": [ { "log_type": "DATA_READ", "exempted_members": [ "user:jose&#64;example.com" ] }, { "log_type": "DATA_WRITE" } ] } This enables 'DATA_READ' and 'DATA_WRITE' logging, while exempting jose&#64;example.com from DATA_READ logging.
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.AuditLogConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.AuditLogConfig)
      com.google.cloud.compute.v1.AuditLogConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AuditLogConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AuditLogConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.AuditLogConfig.class,
              com.google.cloud.compute.v1.AuditLogConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.AuditLogConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      exemptedMembers_ = com.google.protobuf.LazyStringArrayList.emptyList();
      ignoreChildExemptions_ = false;
      logType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_AuditLogConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AuditLogConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.AuditLogConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AuditLogConfig build() {
      com.google.cloud.compute.v1.AuditLogConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.AuditLogConfig buildPartial() {
      com.google.cloud.compute.v1.AuditLogConfig result =
          new com.google.cloud.compute.v1.AuditLogConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.AuditLogConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        exemptedMembers_.makeImmutable();
        result.exemptedMembers_ = exemptedMembers_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ignoreChildExemptions_ = ignoreChildExemptions_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.logType_ = logType_;
        to_bitField0_ |= 0x00000002;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.AuditLogConfig) {
        return mergeFrom((com.google.cloud.compute.v1.AuditLogConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.AuditLogConfig other) {
      if (other == com.google.cloud.compute.v1.AuditLogConfig.getDefaultInstance()) return this;
      if (!other.exemptedMembers_.isEmpty()) {
        if (exemptedMembers_.isEmpty()) {
          exemptedMembers_ = other.exemptedMembers_;
          bitField0_ |= 0x00000001;
        } else {
          ensureExemptedMembersIsMutable();
          exemptedMembers_.addAll(other.exemptedMembers_);
        }
        onChanged();
      }
      if (other.hasIgnoreChildExemptions()) {
        setIgnoreChildExemptions(other.getIgnoreChildExemptions());
      }
      if (other.hasLogType()) {
        logType_ = other.logType_;
        bitField0_ |= 0x00000004;
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
            case 561134800:
              {
                ignoreChildExemptions_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 561134800
            case 1860924610:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureExemptedMembersIsMutable();
                exemptedMembers_.add(s);
                break;
              } // case 1860924610
            case -1070040406:
              {
                logType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case -1070040406
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

    private com.google.protobuf.LazyStringArrayList exemptedMembers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureExemptedMembersIsMutable() {
      if (!exemptedMembers_.isModifiable()) {
        exemptedMembers_ = new com.google.protobuf.LazyStringArrayList(exemptedMembers_);
      }
      bitField0_ |= 0x00000001;
    }

    /**
     *
     *
     * <pre>
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * </pre>
     *
     * <code>repeated string exempted_members = 232615576;</code>
     *
     * @return A list containing the exemptedMembers.
     */
    public com.google.protobuf.ProtocolStringList getExemptedMembersList() {
      exemptedMembers_.makeImmutable();
      return exemptedMembers_;
    }

    /**
     *
     *
     * <pre>
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * </pre>
     *
     * <code>repeated string exempted_members = 232615576;</code>
     *
     * @return The count of exemptedMembers.
     */
    public int getExemptedMembersCount() {
      return exemptedMembers_.size();
    }

    /**
     *
     *
     * <pre>
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * </pre>
     *
     * <code>repeated string exempted_members = 232615576;</code>
     *
     * @param index The index of the element to return.
     * @return The exemptedMembers at the given index.
     */
    public java.lang.String getExemptedMembers(int index) {
      return exemptedMembers_.get(index);
    }

    /**
     *
     *
     * <pre>
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * </pre>
     *
     * <code>repeated string exempted_members = 232615576;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the exemptedMembers at the given index.
     */
    public com.google.protobuf.ByteString getExemptedMembersBytes(int index) {
      return exemptedMembers_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * </pre>
     *
     * <code>repeated string exempted_members = 232615576;</code>
     *
     * @param index The index to set the value at.
     * @param value The exemptedMembers to set.
     * @return This builder for chaining.
     */
    public Builder setExemptedMembers(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureExemptedMembersIsMutable();
      exemptedMembers_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * </pre>
     *
     * <code>repeated string exempted_members = 232615576;</code>
     *
     * @param value The exemptedMembers to add.
     * @return This builder for chaining.
     */
    public Builder addExemptedMembers(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureExemptedMembersIsMutable();
      exemptedMembers_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * </pre>
     *
     * <code>repeated string exempted_members = 232615576;</code>
     *
     * @param values The exemptedMembers to add.
     * @return This builder for chaining.
     */
    public Builder addAllExemptedMembers(java.lang.Iterable<java.lang.String> values) {
      ensureExemptedMembersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, exemptedMembers_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * </pre>
     *
     * <code>repeated string exempted_members = 232615576;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExemptedMembers() {
      exemptedMembers_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Specifies the identities that do not cause logging for this type of permission. Follows the same format of Binding.members.
     * </pre>
     *
     * <code>repeated string exempted_members = 232615576;</code>
     *
     * @param value The bytes of the exemptedMembers to add.
     * @return This builder for chaining.
     */
    public Builder addExemptedMembersBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureExemptedMembersIsMutable();
      exemptedMembers_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean ignoreChildExemptions_;

    /**
     * <code>optional bool ignore_child_exemptions = 70141850;</code>
     *
     * @return Whether the ignoreChildExemptions field is set.
     */
    @java.lang.Override
    public boolean hasIgnoreChildExemptions() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     * <code>optional bool ignore_child_exemptions = 70141850;</code>
     *
     * @return The ignoreChildExemptions.
     */
    @java.lang.Override
    public boolean getIgnoreChildExemptions() {
      return ignoreChildExemptions_;
    }

    /**
     * <code>optional bool ignore_child_exemptions = 70141850;</code>
     *
     * @param value The ignoreChildExemptions to set.
     * @return This builder for chaining.
     */
    public Builder setIgnoreChildExemptions(boolean value) {

      ignoreChildExemptions_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     * <code>optional bool ignore_child_exemptions = 70141850;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIgnoreChildExemptions() {
      bitField0_ = (bitField0_ & ~0x00000002);
      ignoreChildExemptions_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object logType_ = "";

    /**
     *
     *
     * <pre>
     * The log type that this config enables.
     * Check the LogType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_type = 403115861;</code>
     *
     * @return Whether the logType field is set.
     */
    public boolean hasLogType() {
      return ((bitField0_ & 0x00000004) != 0);
    }

    /**
     *
     *
     * <pre>
     * The log type that this config enables.
     * Check the LogType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_type = 403115861;</code>
     *
     * @return The logType.
     */
    public java.lang.String getLogType() {
      java.lang.Object ref = logType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        logType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The log type that this config enables.
     * Check the LogType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_type = 403115861;</code>
     *
     * @return The bytes for logType.
     */
    public com.google.protobuf.ByteString getLogTypeBytes() {
      java.lang.Object ref = logType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        logType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * The log type that this config enables.
     * Check the LogType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_type = 403115861;</code>
     *
     * @param value The logType to set.
     * @return This builder for chaining.
     */
    public Builder setLogType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      logType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The log type that this config enables.
     * Check the LogType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_type = 403115861;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLogType() {
      logType_ = getDefaultInstance().getLogType();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * The log type that this config enables.
     * Check the LogType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string log_type = 403115861;</code>
     *
     * @param value The bytes for logType to set.
     * @return This builder for chaining.
     */
    public Builder setLogTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      logType_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.AuditLogConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.AuditLogConfig)
  private static final com.google.cloud.compute.v1.AuditLogConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.AuditLogConfig();
  }

  public static com.google.cloud.compute.v1.AuditLogConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AuditLogConfig> PARSER =
      new com.google.protobuf.AbstractParser<AuditLogConfig>() {
        @java.lang.Override
        public AuditLogConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<AuditLogConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AuditLogConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.AuditLogConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
