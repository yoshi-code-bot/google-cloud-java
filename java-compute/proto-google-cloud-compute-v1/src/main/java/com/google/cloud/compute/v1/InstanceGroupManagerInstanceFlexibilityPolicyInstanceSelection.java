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
 * </pre>
 *
 * Protobuf type {@code
 * google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection}
 */
public final class InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection)
    InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.newBuilder() to construct.
  private InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection() {
    machineTypes_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.class,
            com.google.cloud.compute.v1
                .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.Builder.class);
  }

  private int bitField0_;
  public static final int MACHINE_TYPES_FIELD_NUMBER = 79720065;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList machineTypes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();

  /**
   *
   *
   * <pre>
   * Full machine-type names, e.g. "n1-standard-16".
   * </pre>
   *
   * <code>repeated string machine_types = 79720065;</code>
   *
   * @return A list containing the machineTypes.
   */
  public com.google.protobuf.ProtocolStringList getMachineTypesList() {
    return machineTypes_;
  }

  /**
   *
   *
   * <pre>
   * Full machine-type names, e.g. "n1-standard-16".
   * </pre>
   *
   * <code>repeated string machine_types = 79720065;</code>
   *
   * @return The count of machineTypes.
   */
  public int getMachineTypesCount() {
    return machineTypes_.size();
  }

  /**
   *
   *
   * <pre>
   * Full machine-type names, e.g. "n1-standard-16".
   * </pre>
   *
   * <code>repeated string machine_types = 79720065;</code>
   *
   * @param index The index of the element to return.
   * @return The machineTypes at the given index.
   */
  public java.lang.String getMachineTypes(int index) {
    return machineTypes_.get(index);
  }

  /**
   *
   *
   * <pre>
   * Full machine-type names, e.g. "n1-standard-16".
   * </pre>
   *
   * <code>repeated string machine_types = 79720065;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the machineTypes at the given index.
   */
  public com.google.protobuf.ByteString getMachineTypesBytes(int index) {
    return machineTypes_.getByteString(index);
  }

  public static final int RANK_FIELD_NUMBER = 3492908;
  private int rank_ = 0;

  /**
   *
   *
   * <pre>
   * Preference of this instance selection. Lower number means higher preference. MIG will first try to create a VM based on the machine-type with lowest rank and fallback to next rank based on availability. Machine types and instance selections with the same rank have the same preference.
   * </pre>
   *
   * <code>optional int32 rank = 3492908;</code>
   *
   * @return Whether the rank field is set.
   */
  @java.lang.Override
  public boolean hasRank() {
    return ((bitField0_ & 0x00000001) != 0);
  }

  /**
   *
   *
   * <pre>
   * Preference of this instance selection. Lower number means higher preference. MIG will first try to create a VM based on the machine-type with lowest rank and fallback to next rank based on availability. Machine types and instance selections with the same rank have the same preference.
   * </pre>
   *
   * <code>optional int32 rank = 3492908;</code>
   *
   * @return The rank.
   */
  @java.lang.Override
  public int getRank() {
    return rank_;
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
      output.writeInt32(3492908, rank_);
    }
    for (int i = 0; i < machineTypes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 79720065, machineTypes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3492908, rank_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < machineTypes_.size(); i++) {
        dataSize += computeStringSizeNoTag(machineTypes_.getRaw(i));
      }
      size += dataSize;
      size += 5 * getMachineTypesList().size();
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
    if (!(obj
        instanceof
        com.google.cloud.compute.v1
            .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
        other =
            (com.google.cloud.compute.v1
                    .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection)
                obj;

    if (!getMachineTypesList().equals(other.getMachineTypesList())) return false;
    if (hasRank() != other.hasRank()) return false;
    if (hasRank()) {
      if (getRank() != other.getRank()) return false;
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
    if (getMachineTypesCount() > 0) {
      hash = (37 * hash) + MACHINE_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getMachineTypesList().hashCode();
    }
    if (hasRank()) {
      hash = (37 * hash) + RANK_FIELD_NUMBER;
      hash = (53 * hash) + getRank();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      parseFrom(
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
      com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
          prototype) {
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
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection)
      com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1
                  .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.class,
              com.google.cloud.compute.v1
                  .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      machineTypes_ = com.google.protobuf.LazyStringArrayList.emptyList();
      rank_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1
            .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1
            .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
        build() {
      com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
          result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1
            .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
        buildPartial() {
      com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
          result =
              new com.google.cloud.compute.v1
                  .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
            result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        machineTypes_.makeImmutable();
        result.machineTypes_ = machineTypes_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.rank_ = rank_;
        to_bitField0_ |= 0x00000001;
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
      if (other
          instanceof
          com.google.cloud.compute.v1
              .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection) {
        return mergeFrom(
            (com.google.cloud.compute.v1
                    .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
            other) {
      if (other
          == com.google.cloud.compute.v1
              .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection.getDefaultInstance())
        return this;
      if (!other.machineTypes_.isEmpty()) {
        if (machineTypes_.isEmpty()) {
          machineTypes_ = other.machineTypes_;
          bitField0_ |= 0x00000001;
        } else {
          ensureMachineTypesIsMutable();
          machineTypes_.addAll(other.machineTypes_);
        }
        onChanged();
      }
      if (other.hasRank()) {
        setRank(other.getRank());
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
            case 27943264:
              {
                rank_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 27943264
            case 637760522:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureMachineTypesIsMutable();
                machineTypes_.add(s);
                break;
              } // case 637760522
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

    private com.google.protobuf.LazyStringArrayList machineTypes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureMachineTypesIsMutable() {
      if (!machineTypes_.isModifiable()) {
        machineTypes_ = new com.google.protobuf.LazyStringArrayList(machineTypes_);
      }
      bitField0_ |= 0x00000001;
    }

    /**
     *
     *
     * <pre>
     * Full machine-type names, e.g. "n1-standard-16".
     * </pre>
     *
     * <code>repeated string machine_types = 79720065;</code>
     *
     * @return A list containing the machineTypes.
     */
    public com.google.protobuf.ProtocolStringList getMachineTypesList() {
      machineTypes_.makeImmutable();
      return machineTypes_;
    }

    /**
     *
     *
     * <pre>
     * Full machine-type names, e.g. "n1-standard-16".
     * </pre>
     *
     * <code>repeated string machine_types = 79720065;</code>
     *
     * @return The count of machineTypes.
     */
    public int getMachineTypesCount() {
      return machineTypes_.size();
    }

    /**
     *
     *
     * <pre>
     * Full machine-type names, e.g. "n1-standard-16".
     * </pre>
     *
     * <code>repeated string machine_types = 79720065;</code>
     *
     * @param index The index of the element to return.
     * @return The machineTypes at the given index.
     */
    public java.lang.String getMachineTypes(int index) {
      return machineTypes_.get(index);
    }

    /**
     *
     *
     * <pre>
     * Full machine-type names, e.g. "n1-standard-16".
     * </pre>
     *
     * <code>repeated string machine_types = 79720065;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the machineTypes at the given index.
     */
    public com.google.protobuf.ByteString getMachineTypesBytes(int index) {
      return machineTypes_.getByteString(index);
    }

    /**
     *
     *
     * <pre>
     * Full machine-type names, e.g. "n1-standard-16".
     * </pre>
     *
     * <code>repeated string machine_types = 79720065;</code>
     *
     * @param index The index to set the value at.
     * @param value The machineTypes to set.
     * @return This builder for chaining.
     */
    public Builder setMachineTypes(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMachineTypesIsMutable();
      machineTypes_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full machine-type names, e.g. "n1-standard-16".
     * </pre>
     *
     * <code>repeated string machine_types = 79720065;</code>
     *
     * @param value The machineTypes to add.
     * @return This builder for chaining.
     */
    public Builder addMachineTypes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureMachineTypesIsMutable();
      machineTypes_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full machine-type names, e.g. "n1-standard-16".
     * </pre>
     *
     * <code>repeated string machine_types = 79720065;</code>
     *
     * @param values The machineTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllMachineTypes(java.lang.Iterable<java.lang.String> values) {
      ensureMachineTypesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, machineTypes_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full machine-type names, e.g. "n1-standard-16".
     * </pre>
     *
     * <code>repeated string machine_types = 79720065;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMachineTypes() {
      machineTypes_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Full machine-type names, e.g. "n1-standard-16".
     * </pre>
     *
     * <code>repeated string machine_types = 79720065;</code>
     *
     * @param value The bytes of the machineTypes to add.
     * @return This builder for chaining.
     */
    public Builder addMachineTypesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureMachineTypesIsMutable();
      machineTypes_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int rank_;

    /**
     *
     *
     * <pre>
     * Preference of this instance selection. Lower number means higher preference. MIG will first try to create a VM based on the machine-type with lowest rank and fallback to next rank based on availability. Machine types and instance selections with the same rank have the same preference.
     * </pre>
     *
     * <code>optional int32 rank = 3492908;</code>
     *
     * @return Whether the rank field is set.
     */
    @java.lang.Override
    public boolean hasRank() {
      return ((bitField0_ & 0x00000002) != 0);
    }

    /**
     *
     *
     * <pre>
     * Preference of this instance selection. Lower number means higher preference. MIG will first try to create a VM based on the machine-type with lowest rank and fallback to next rank based on availability. Machine types and instance selections with the same rank have the same preference.
     * </pre>
     *
     * <code>optional int32 rank = 3492908;</code>
     *
     * @return The rank.
     */
    @java.lang.Override
    public int getRank() {
      return rank_;
    }

    /**
     *
     *
     * <pre>
     * Preference of this instance selection. Lower number means higher preference. MIG will first try to create a VM based on the machine-type with lowest rank and fallback to next rank based on availability. Machine types and instance selections with the same rank have the same preference.
     * </pre>
     *
     * <code>optional int32 rank = 3492908;</code>
     *
     * @param value The rank to set.
     * @return This builder for chaining.
     */
    public Builder setRank(int value) {

      rank_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Preference of this instance selection. Lower number means higher preference. MIG will first try to create a VM based on the machine-type with lowest rank and fallback to next rank based on availability. Machine types and instance selections with the same rank have the same preference.
     * </pre>
     *
     * <code>optional int32 rank = 3492908;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRank() {
      bitField0_ = (bitField0_ & ~0x00000002);
      rank_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection)
  private static final com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1
            .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection();
  }

  public static com.google.cloud.compute.v1
          .InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<
          InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
      PARSER =
          new com.google.protobuf.AbstractParser<
              InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>() {
            @java.lang.Override
            public InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<
          InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstanceGroupManagerInstanceFlexibilityPolicyInstanceSelection
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
