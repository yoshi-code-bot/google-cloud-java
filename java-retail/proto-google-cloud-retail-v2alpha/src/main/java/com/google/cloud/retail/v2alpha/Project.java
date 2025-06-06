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
// source: google/cloud/retail/v2alpha/project.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2alpha;

/**
 *
 *
 * <pre>
 * Metadata that describes a Cloud Retail Project.
 * </pre>
 *
 * Protobuf type {@code google.cloud.retail.v2alpha.Project}
 */
public final class Project extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.retail.v2alpha.Project)
    ProjectOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use Project.newBuilder() to construct.
  private Project(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Project() {
    name_ = "";
    enrolledSolutions_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Project();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.retail.v2alpha.ProjectProto
        .internal_static_google_cloud_retail_v2alpha_Project_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.retail.v2alpha.ProjectProto
        .internal_static_google_cloud_retail_v2alpha_Project_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.retail.v2alpha.Project.class,
            com.google.cloud.retail.v2alpha.Project.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";

  /**
   *
   *
   * <pre>
   * Output only. Full resource name of the retail project, such as
   * `projects/{project_id_or_number}/retailProject`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Output only. Full resource name of the retail project, such as
   * `projects/{project_id_or_number}/retailProject`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENROLLED_SOLUTIONS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> enrolledSolutions_;

  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.cloud.retail.v2alpha.SolutionType>
      enrolledSolutions_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.cloud.retail.v2alpha.SolutionType>() {
            public com.google.cloud.retail.v2alpha.SolutionType convert(java.lang.Integer from) {
              com.google.cloud.retail.v2alpha.SolutionType result =
                  com.google.cloud.retail.v2alpha.SolutionType.forNumber(from);
              return result == null
                  ? com.google.cloud.retail.v2alpha.SolutionType.UNRECOGNIZED
                  : result;
            }
          };

  /**
   *
   *
   * <pre>
   * Output only. Retail API solutions that the project has enrolled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enrolledSolutions.
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.retail.v2alpha.SolutionType> getEnrolledSolutionsList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.cloud.retail.v2alpha.SolutionType>(
        enrolledSolutions_, enrolledSolutions_converter_);
  }

  /**
   *
   *
   * <pre>
   * Output only. Retail API solutions that the project has enrolled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The count of enrolledSolutions.
   */
  @java.lang.Override
  public int getEnrolledSolutionsCount() {
    return enrolledSolutions_.size();
  }

  /**
   *
   *
   * <pre>
   * Output only. Retail API solutions that the project has enrolled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the element to return.
   * @return The enrolledSolutions at the given index.
   */
  @java.lang.Override
  public com.google.cloud.retail.v2alpha.SolutionType getEnrolledSolutions(int index) {
    return enrolledSolutions_converter_.convert(enrolledSolutions_.get(index));
  }

  /**
   *
   *
   * <pre>
   * Output only. Retail API solutions that the project has enrolled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return A list containing the enum numeric values on the wire for enrolledSolutions.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getEnrolledSolutionsValueList() {
    return enrolledSolutions_;
  }

  /**
   *
   *
   * <pre>
   * Output only. Retail API solutions that the project has enrolled.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of enrolledSolutions at the given index.
   */
  @java.lang.Override
  public int getEnrolledSolutionsValue(int index) {
    return enrolledSolutions_.get(index);
  }

  private int enrolledSolutionsMemoizedSerializedSize;

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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (getEnrolledSolutionsList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(enrolledSolutionsMemoizedSerializedSize);
    }
    for (int i = 0; i < enrolledSolutions_.size(); i++) {
      output.writeEnumNoTag(enrolledSolutions_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < enrolledSolutions_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(enrolledSolutions_.get(i));
      }
      size += dataSize;
      if (!getEnrolledSolutionsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      enrolledSolutionsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.retail.v2alpha.Project)) {
      return super.equals(obj);
    }
    com.google.cloud.retail.v2alpha.Project other = (com.google.cloud.retail.v2alpha.Project) obj;

    if (!getName().equals(other.getName())) return false;
    if (!enrolledSolutions_.equals(other.enrolledSolutions_)) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (getEnrolledSolutionsCount() > 0) {
      hash = (37 * hash) + ENROLLED_SOLUTIONS_FIELD_NUMBER;
      hash = (53 * hash) + enrolledSolutions_.hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.retail.v2alpha.Project parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.Project parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.Project parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.Project parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.Project parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.retail.v2alpha.Project parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.Project parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.Project parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.Project parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.Project parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.retail.v2alpha.Project parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.retail.v2alpha.Project parseFrom(
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

  public static Builder newBuilder(com.google.cloud.retail.v2alpha.Project prototype) {
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
   * Metadata that describes a Cloud Retail Project.
   * </pre>
   *
   * Protobuf type {@code google.cloud.retail.v2alpha.Project}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.retail.v2alpha.Project)
      com.google.cloud.retail.v2alpha.ProjectOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.retail.v2alpha.ProjectProto
          .internal_static_google_cloud_retail_v2alpha_Project_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.retail.v2alpha.ProjectProto
          .internal_static_google_cloud_retail_v2alpha_Project_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.retail.v2alpha.Project.class,
              com.google.cloud.retail.v2alpha.Project.Builder.class);
    }

    // Construct using com.google.cloud.retail.v2alpha.Project.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      enrolledSolutions_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.retail.v2alpha.ProjectProto
          .internal_static_google_cloud_retail_v2alpha_Project_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.Project getDefaultInstanceForType() {
      return com.google.cloud.retail.v2alpha.Project.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.Project build() {
      com.google.cloud.retail.v2alpha.Project result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.retail.v2alpha.Project buildPartial() {
      com.google.cloud.retail.v2alpha.Project result =
          new com.google.cloud.retail.v2alpha.Project(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.retail.v2alpha.Project result) {
      if (((bitField0_ & 0x00000002) != 0)) {
        enrolledSolutions_ = java.util.Collections.unmodifiableList(enrolledSolutions_);
        bitField0_ = (bitField0_ & ~0x00000002);
      }
      result.enrolledSolutions_ = enrolledSolutions_;
    }

    private void buildPartial0(com.google.cloud.retail.v2alpha.Project result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
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
      if (other instanceof com.google.cloud.retail.v2alpha.Project) {
        return mergeFrom((com.google.cloud.retail.v2alpha.Project) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.retail.v2alpha.Project other) {
      if (other == com.google.cloud.retail.v2alpha.Project.getDefaultInstance()) return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.enrolledSolutions_.isEmpty()) {
        if (enrolledSolutions_.isEmpty()) {
          enrolledSolutions_ = other.enrolledSolutions_;
          bitField0_ = (bitField0_ & ~0x00000002);
        } else {
          ensureEnrolledSolutionsIsMutable();
          enrolledSolutions_.addAll(other.enrolledSolutions_);
        }
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                int tmpRaw = input.readEnum();
                ensureEnrolledSolutionsIsMutable();
                enrolledSolutions_.add(tmpRaw);
                break;
              } // case 16
            case 18:
              {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while (input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureEnrolledSolutionsIsMutable();
                  enrolledSolutions_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
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

    private java.lang.Object name_ = "";

    /**
     *
     *
     * <pre>
     * Output only. Full resource name of the retail project, such as
     * `projects/{project_id_or_number}/retailProject`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Full resource name of the retail project, such as
     * `projects/{project_id_or_number}/retailProject`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Full resource name of the retail project, such as
     * `projects/{project_id_or_number}/retailProject`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Full resource name of the retail project, such as
     * `projects/{project_id_or_number}/retailProject`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Full resource name of the retail project, such as
     * `projects/{project_id_or_number}/retailProject`.
     * </pre>
     *
     * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<java.lang.Integer> enrolledSolutions_ =
        java.util.Collections.emptyList();

    private void ensureEnrolledSolutionsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        enrolledSolutions_ = new java.util.ArrayList<java.lang.Integer>(enrolledSolutions_);
        bitField0_ |= 0x00000002;
      }
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return A list containing the enrolledSolutions.
     */
    public java.util.List<com.google.cloud.retail.v2alpha.SolutionType> getEnrolledSolutionsList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.cloud.retail.v2alpha.SolutionType>(
          enrolledSolutions_, enrolledSolutions_converter_);
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The count of enrolledSolutions.
     */
    public int getEnrolledSolutionsCount() {
      return enrolledSolutions_.size();
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index of the element to return.
     * @return The enrolledSolutions at the given index.
     */
    public com.google.cloud.retail.v2alpha.SolutionType getEnrolledSolutions(int index) {
      return enrolledSolutions_converter_.convert(enrolledSolutions_.get(index));
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The enrolledSolutions to set.
     * @return This builder for chaining.
     */
    public Builder setEnrolledSolutions(
        int index, com.google.cloud.retail.v2alpha.SolutionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEnrolledSolutionsIsMutable();
      enrolledSolutions_.set(index, value.getNumber());
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enrolledSolutions to add.
     * @return This builder for chaining.
     */
    public Builder addEnrolledSolutions(com.google.cloud.retail.v2alpha.SolutionType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureEnrolledSolutionsIsMutable();
      enrolledSolutions_.add(value.getNumber());
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param values The enrolledSolutions to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnrolledSolutions(
        java.lang.Iterable<? extends com.google.cloud.retail.v2alpha.SolutionType> values) {
      ensureEnrolledSolutionsIsMutable();
      for (com.google.cloud.retail.v2alpha.SolutionType value : values) {
        enrolledSolutions_.add(value.getNumber());
      }
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnrolledSolutions() {
      enrolledSolutions_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return A list containing the enum numeric values on the wire for enrolledSolutions.
     */
    public java.util.List<java.lang.Integer> getEnrolledSolutionsValueList() {
      return java.util.Collections.unmodifiableList(enrolledSolutions_);
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of enrolledSolutions at the given index.
     */
    public int getEnrolledSolutionsValue(int index) {
      return enrolledSolutions_.get(index);
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for enrolledSolutions to set.
     * @return This builder for chaining.
     */
    public Builder setEnrolledSolutionsValue(int index, int value) {
      ensureEnrolledSolutionsIsMutable();
      enrolledSolutions_.set(index, value);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for enrolledSolutions to add.
     * @return This builder for chaining.
     */
    public Builder addEnrolledSolutionsValue(int value) {
      ensureEnrolledSolutionsIsMutable();
      enrolledSolutions_.add(value);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Output only. Retail API solutions that the project has enrolled.
     * </pre>
     *
     * <code>
     * repeated .google.cloud.retail.v2alpha.SolutionType enrolled_solutions = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param values The enum numeric values on the wire for enrolledSolutions to add.
     * @return This builder for chaining.
     */
    public Builder addAllEnrolledSolutionsValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureEnrolledSolutionsIsMutable();
      for (int value : values) {
        enrolledSolutions_.add(value);
      }
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

    // @@protoc_insertion_point(builder_scope:google.cloud.retail.v2alpha.Project)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.retail.v2alpha.Project)
  private static final com.google.cloud.retail.v2alpha.Project DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.retail.v2alpha.Project();
  }

  public static com.google.cloud.retail.v2alpha.Project getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Project> PARSER =
      new com.google.protobuf.AbstractParser<Project>() {
        @java.lang.Override
        public Project parsePartialFrom(
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

  public static com.google.protobuf.Parser<Project> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Project> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.retail.v2alpha.Project getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
