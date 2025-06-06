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
// source: google/cloud/dialogflow/cx/v3beta1/flow.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.dialogflow.cx.v3beta1;

/**
 *
 *
 * <pre>
 * Settings related to NLU.
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.NluSettings}
 */
public final class NluSettings extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.cx.v3beta1.NluSettings)
    NluSettingsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use NluSettings.newBuilder() to construct.
  private NluSettings(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NluSettings() {
    modelType_ = 0;
    modelTrainingMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NluSettings();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.cx.v3beta1.FlowProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.cx.v3beta1.FlowProto
        .internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.cx.v3beta1.NluSettings.class,
            com.google.cloud.dialogflow.cx.v3beta1.NluSettings.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * NLU model type.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType}
   */
  public enum ModelType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not specified. `MODEL_TYPE_STANDARD` will be used.
     * </pre>
     *
     * <code>MODEL_TYPE_UNSPECIFIED = 0;</code>
     */
    MODEL_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Use standard NLU model.
     * </pre>
     *
     * <code>MODEL_TYPE_STANDARD = 1;</code>
     */
    MODEL_TYPE_STANDARD(1),
    /**
     *
     *
     * <pre>
     * Use advanced NLU model.
     * </pre>
     *
     * <code>MODEL_TYPE_ADVANCED = 3;</code>
     */
    MODEL_TYPE_ADVANCED(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not specified. `MODEL_TYPE_STANDARD` will be used.
     * </pre>
     *
     * <code>MODEL_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int MODEL_TYPE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * Use standard NLU model.
     * </pre>
     *
     * <code>MODEL_TYPE_STANDARD = 1;</code>
     */
    public static final int MODEL_TYPE_STANDARD_VALUE = 1;

    /**
     *
     *
     * <pre>
     * Use advanced NLU model.
     * </pre>
     *
     * <code>MODEL_TYPE_ADVANCED = 3;</code>
     */
    public static final int MODEL_TYPE_ADVANCED_VALUE = 3;

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
    public static ModelType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ModelType forNumber(int value) {
      switch (value) {
        case 0:
          return MODEL_TYPE_UNSPECIFIED;
        case 1:
          return MODEL_TYPE_STANDARD;
        case 3:
          return MODEL_TYPE_ADVANCED;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ModelType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ModelType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ModelType>() {
          public ModelType findValueByNumber(int number) {
            return ModelType.forNumber(number);
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
      return com.google.cloud.dialogflow.cx.v3beta1.NluSettings.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final ModelType[] VALUES = values();

    public static ModelType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ModelType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType)
  }

  /**
   *
   *
   * <pre>
   * NLU model training mode.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode}
   */
  public enum ModelTrainingMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not specified. `MODEL_TRAINING_MODE_AUTOMATIC` will be used.
     * </pre>
     *
     * <code>MODEL_TRAINING_MODE_UNSPECIFIED = 0;</code>
     */
    MODEL_TRAINING_MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * NLU model training is automatically triggered when a flow gets modified.
     * User can also manually trigger model training in this mode.
     * </pre>
     *
     * <code>MODEL_TRAINING_MODE_AUTOMATIC = 1;</code>
     */
    MODEL_TRAINING_MODE_AUTOMATIC(1),
    /**
     *
     *
     * <pre>
     * User needs to manually trigger NLU model training. Best for large flows
     * whose models take long time to train.
     * </pre>
     *
     * <code>MODEL_TRAINING_MODE_MANUAL = 2;</code>
     */
    MODEL_TRAINING_MODE_MANUAL(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not specified. `MODEL_TRAINING_MODE_AUTOMATIC` will be used.
     * </pre>
     *
     * <code>MODEL_TRAINING_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int MODEL_TRAINING_MODE_UNSPECIFIED_VALUE = 0;

    /**
     *
     *
     * <pre>
     * NLU model training is automatically triggered when a flow gets modified.
     * User can also manually trigger model training in this mode.
     * </pre>
     *
     * <code>MODEL_TRAINING_MODE_AUTOMATIC = 1;</code>
     */
    public static final int MODEL_TRAINING_MODE_AUTOMATIC_VALUE = 1;

    /**
     *
     *
     * <pre>
     * User needs to manually trigger NLU model training. Best for large flows
     * whose models take long time to train.
     * </pre>
     *
     * <code>MODEL_TRAINING_MODE_MANUAL = 2;</code>
     */
    public static final int MODEL_TRAINING_MODE_MANUAL_VALUE = 2;

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
    public static ModelTrainingMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ModelTrainingMode forNumber(int value) {
      switch (value) {
        case 0:
          return MODEL_TRAINING_MODE_UNSPECIFIED;
        case 1:
          return MODEL_TRAINING_MODE_AUTOMATIC;
        case 2:
          return MODEL_TRAINING_MODE_MANUAL;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ModelTrainingMode>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ModelTrainingMode>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<ModelTrainingMode>() {
              public ModelTrainingMode findValueByNumber(int number) {
                return ModelTrainingMode.forNumber(number);
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
      return com.google.cloud.dialogflow.cx.v3beta1.NluSettings.getDescriptor()
          .getEnumTypes()
          .get(1);
    }

    private static final ModelTrainingMode[] VALUES = values();

    public static ModelTrainingMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ModelTrainingMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode)
  }

  public static final int MODEL_TYPE_FIELD_NUMBER = 1;
  private int modelType_ = 0;

  /**
   *
   *
   * <pre>
   * Indicates the type of NLU model.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType model_type = 1;</code>
   *
   * @return The enum numeric value on the wire for modelType.
   */
  @java.lang.Override
  public int getModelTypeValue() {
    return modelType_;
  }

  /**
   *
   *
   * <pre>
   * Indicates the type of NLU model.
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType model_type = 1;</code>
   *
   * @return The modelType.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType getModelType() {
    com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType result =
        com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType.forNumber(modelType_);
    return result == null
        ? com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType.UNRECOGNIZED
        : result;
  }

  public static final int CLASSIFICATION_THRESHOLD_FIELD_NUMBER = 3;
  private float classificationThreshold_ = 0F;

  /**
   *
   *
   * <pre>
   * To filter out false positive results and still get variety in matched
   * natural language inputs for your agent, you can tune the machine learning
   * classification threshold. If the returned score value is less than the
   * threshold value, then a no-match event will be triggered. The score values
   * range from 0.0 (completely uncertain) to 1.0 (completely certain). If set
   * to 0.0, the default of 0.3 is used. You can set a separate classification
   * threshold for the flow in each language enabled for the agent.
   * </pre>
   *
   * <code>float classification_threshold = 3;</code>
   *
   * @return The classificationThreshold.
   */
  @java.lang.Override
  public float getClassificationThreshold() {
    return classificationThreshold_;
  }

  public static final int MODEL_TRAINING_MODE_FIELD_NUMBER = 4;
  private int modelTrainingMode_ = 0;

  /**
   *
   *
   * <pre>
   * Indicates NLU model training mode.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode model_training_mode = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for modelTrainingMode.
   */
  @java.lang.Override
  public int getModelTrainingModeValue() {
    return modelTrainingMode_;
  }

  /**
   *
   *
   * <pre>
   * Indicates NLU model training mode.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode model_training_mode = 4;
   * </code>
   *
   * @return The modelTrainingMode.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode
      getModelTrainingMode() {
    com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode result =
        com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode.forNumber(
            modelTrainingMode_);
    return result == null
        ? com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode.UNRECOGNIZED
        : result;
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
    if (modelType_
        != com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType.MODEL_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, modelType_);
    }
    if (java.lang.Float.floatToRawIntBits(classificationThreshold_) != 0) {
      output.writeFloat(3, classificationThreshold_);
    }
    if (modelTrainingMode_
        != com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode
            .MODEL_TRAINING_MODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(4, modelTrainingMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (modelType_
        != com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType.MODEL_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, modelType_);
    }
    if (java.lang.Float.floatToRawIntBits(classificationThreshold_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(3, classificationThreshold_);
    }
    if (modelTrainingMode_
        != com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode
            .MODEL_TRAINING_MODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, modelTrainingMode_);
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
    if (!(obj instanceof com.google.cloud.dialogflow.cx.v3beta1.NluSettings)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.cx.v3beta1.NluSettings other =
        (com.google.cloud.dialogflow.cx.v3beta1.NluSettings) obj;

    if (modelType_ != other.modelType_) return false;
    if (java.lang.Float.floatToIntBits(getClassificationThreshold())
        != java.lang.Float.floatToIntBits(other.getClassificationThreshold())) return false;
    if (modelTrainingMode_ != other.modelTrainingMode_) return false;
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
    hash = (37 * hash) + MODEL_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + modelType_;
    hash = (37 * hash) + CLASSIFICATION_THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getClassificationThreshold());
    hash = (37 * hash) + MODEL_TRAINING_MODE_FIELD_NUMBER;
    hash = (53 * hash) + modelTrainingMode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings parseFrom(
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

  public static Builder newBuilder(com.google.cloud.dialogflow.cx.v3beta1.NluSettings prototype) {
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
   * Settings related to NLU.
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.cx.v3beta1.NluSettings}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.cx.v3beta1.NluSettings)
      com.google.cloud.dialogflow.cx.v3beta1.NluSettingsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.cx.v3beta1.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.cx.v3beta1.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.cx.v3beta1.NluSettings.class,
              com.google.cloud.dialogflow.cx.v3beta1.NluSettings.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.cx.v3beta1.NluSettings.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      modelType_ = 0;
      classificationThreshold_ = 0F;
      modelTrainingMode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.FlowProto
          .internal_static_google_cloud_dialogflow_cx_v3beta1_NluSettings_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.NluSettings getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.cx.v3beta1.NluSettings.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.NluSettings build() {
      com.google.cloud.dialogflow.cx.v3beta1.NluSettings result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.NluSettings buildPartial() {
      com.google.cloud.dialogflow.cx.v3beta1.NluSettings result =
          new com.google.cloud.dialogflow.cx.v3beta1.NluSettings(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.dialogflow.cx.v3beta1.NluSettings result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.modelType_ = modelType_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.classificationThreshold_ = classificationThreshold_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.modelTrainingMode_ = modelTrainingMode_;
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
      if (other instanceof com.google.cloud.dialogflow.cx.v3beta1.NluSettings) {
        return mergeFrom((com.google.cloud.dialogflow.cx.v3beta1.NluSettings) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.cx.v3beta1.NluSettings other) {
      if (other == com.google.cloud.dialogflow.cx.v3beta1.NluSettings.getDefaultInstance())
        return this;
      if (other.modelType_ != 0) {
        setModelTypeValue(other.getModelTypeValue());
      }
      if (other.getClassificationThreshold() != 0F) {
        setClassificationThreshold(other.getClassificationThreshold());
      }
      if (other.modelTrainingMode_ != 0) {
        setModelTrainingModeValue(other.getModelTrainingModeValue());
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
                modelType_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 29:
              {
                classificationThreshold_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 29
            case 32:
              {
                modelTrainingMode_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 32
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

    private int modelType_ = 0;

    /**
     *
     *
     * <pre>
     * Indicates the type of NLU model.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType model_type = 1;</code>
     *
     * @return The enum numeric value on the wire for modelType.
     */
    @java.lang.Override
    public int getModelTypeValue() {
      return modelType_;
    }

    /**
     *
     *
     * <pre>
     * Indicates the type of NLU model.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType model_type = 1;</code>
     *
     * @param value The enum numeric value on the wire for modelType to set.
     * @return This builder for chaining.
     */
    public Builder setModelTypeValue(int value) {
      modelType_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates the type of NLU model.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType model_type = 1;</code>
     *
     * @return The modelType.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType getModelType() {
      com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType result =
          com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType.forNumber(modelType_);
      return result == null
          ? com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Indicates the type of NLU model.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType model_type = 1;</code>
     *
     * @param value The modelType to set.
     * @return This builder for chaining.
     */
    public Builder setModelType(
        com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      modelType_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates the type of NLU model.
     * </pre>
     *
     * <code>.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelType model_type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModelType() {
      bitField0_ = (bitField0_ & ~0x00000001);
      modelType_ = 0;
      onChanged();
      return this;
    }

    private float classificationThreshold_;

    /**
     *
     *
     * <pre>
     * To filter out false positive results and still get variety in matched
     * natural language inputs for your agent, you can tune the machine learning
     * classification threshold. If the returned score value is less than the
     * threshold value, then a no-match event will be triggered. The score values
     * range from 0.0 (completely uncertain) to 1.0 (completely certain). If set
     * to 0.0, the default of 0.3 is used. You can set a separate classification
     * threshold for the flow in each language enabled for the agent.
     * </pre>
     *
     * <code>float classification_threshold = 3;</code>
     *
     * @return The classificationThreshold.
     */
    @java.lang.Override
    public float getClassificationThreshold() {
      return classificationThreshold_;
    }

    /**
     *
     *
     * <pre>
     * To filter out false positive results and still get variety in matched
     * natural language inputs for your agent, you can tune the machine learning
     * classification threshold. If the returned score value is less than the
     * threshold value, then a no-match event will be triggered. The score values
     * range from 0.0 (completely uncertain) to 1.0 (completely certain). If set
     * to 0.0, the default of 0.3 is used. You can set a separate classification
     * threshold for the flow in each language enabled for the agent.
     * </pre>
     *
     * <code>float classification_threshold = 3;</code>
     *
     * @param value The classificationThreshold to set.
     * @return This builder for chaining.
     */
    public Builder setClassificationThreshold(float value) {

      classificationThreshold_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * To filter out false positive results and still get variety in matched
     * natural language inputs for your agent, you can tune the machine learning
     * classification threshold. If the returned score value is less than the
     * threshold value, then a no-match event will be triggered. The score values
     * range from 0.0 (completely uncertain) to 1.0 (completely certain). If set
     * to 0.0, the default of 0.3 is used. You can set a separate classification
     * threshold for the flow in each language enabled for the agent.
     * </pre>
     *
     * <code>float classification_threshold = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClassificationThreshold() {
      bitField0_ = (bitField0_ & ~0x00000002);
      classificationThreshold_ = 0F;
      onChanged();
      return this;
    }

    private int modelTrainingMode_ = 0;

    /**
     *
     *
     * <pre>
     * Indicates NLU model training mode.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode model_training_mode = 4;
     * </code>
     *
     * @return The enum numeric value on the wire for modelTrainingMode.
     */
    @java.lang.Override
    public int getModelTrainingModeValue() {
      return modelTrainingMode_;
    }

    /**
     *
     *
     * <pre>
     * Indicates NLU model training mode.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode model_training_mode = 4;
     * </code>
     *
     * @param value The enum numeric value on the wire for modelTrainingMode to set.
     * @return This builder for chaining.
     */
    public Builder setModelTrainingModeValue(int value) {
      modelTrainingMode_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates NLU model training mode.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode model_training_mode = 4;
     * </code>
     *
     * @return The modelTrainingMode.
     */
    @java.lang.Override
    public com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode
        getModelTrainingMode() {
      com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode result =
          com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode.forNumber(
              modelTrainingMode_);
      return result == null
          ? com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode.UNRECOGNIZED
          : result;
    }

    /**
     *
     *
     * <pre>
     * Indicates NLU model training mode.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode model_training_mode = 4;
     * </code>
     *
     * @param value The modelTrainingMode to set.
     * @return This builder for chaining.
     */
    public Builder setModelTrainingMode(
        com.google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      modelTrainingMode_ = value.getNumber();
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Indicates NLU model training mode.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.cx.v3beta1.NluSettings.ModelTrainingMode model_training_mode = 4;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearModelTrainingMode() {
      bitField0_ = (bitField0_ & ~0x00000004);
      modelTrainingMode_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.cx.v3beta1.NluSettings)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.cx.v3beta1.NluSettings)
  private static final com.google.cloud.dialogflow.cx.v3beta1.NluSettings DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.cx.v3beta1.NluSettings();
  }

  public static com.google.cloud.dialogflow.cx.v3beta1.NluSettings getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NluSettings> PARSER =
      new com.google.protobuf.AbstractParser<NluSettings>() {
        @java.lang.Override
        public NluSettings parsePartialFrom(
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

  public static com.google.protobuf.Parser<NluSettings> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NluSettings> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.cx.v3beta1.NluSettings getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
