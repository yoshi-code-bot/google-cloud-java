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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * Policy violation details.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.PolicyViolationDetails}
 */
public final class PolicyViolationDetails extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.PolicyViolationDetails)
    PolicyViolationDetailsOrBuilder {
  private static final long serialVersionUID = 0L;

  // Use PolicyViolationDetails.newBuilder() to construct.
  private PolicyViolationDetails(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private PolicyViolationDetails() {
    policy_ = "";
    ruleId_ = "";
    failureMessage_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new PolicyViolationDetails();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_PolicyViolationDetails_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_PolicyViolationDetails_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.PolicyViolationDetails.class,
            com.google.cloud.deploy.v1.PolicyViolationDetails.Builder.class);
  }

  public static final int POLICY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object policy_ = "";

  /**
   *
   *
   * <pre>
   * Name of the policy that was violated.
   * Policy resource will be in the format of
   * `projects/{project}/locations/{location}/policies/{policy}`.
   * </pre>
   *
   * <code>string policy = 1;</code>
   *
   * @return The policy.
   */
  @java.lang.Override
  public java.lang.String getPolicy() {
    java.lang.Object ref = policy_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      policy_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Name of the policy that was violated.
   * Policy resource will be in the format of
   * `projects/{project}/locations/{location}/policies/{policy}`.
   * </pre>
   *
   * <code>string policy = 1;</code>
   *
   * @return The bytes for policy.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPolicyBytes() {
    java.lang.Object ref = policy_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      policy_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int RULE_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ruleId_ = "";

  /**
   *
   *
   * <pre>
   * Id of the rule that triggered the policy violation.
   * </pre>
   *
   * <code>string rule_id = 2;</code>
   *
   * @return The ruleId.
   */
  @java.lang.Override
  public java.lang.String getRuleId() {
    java.lang.Object ref = ruleId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ruleId_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * Id of the rule that triggered the policy violation.
   * </pre>
   *
   * <code>string rule_id = 2;</code>
   *
   * @return The bytes for ruleId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getRuleIdBytes() {
    java.lang.Object ref = ruleId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ruleId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FAILURE_MESSAGE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object failureMessage_ = "";

  /**
   *
   *
   * <pre>
   * User readable message about why the request violated a policy. This is not
   * intended for machine parsing.
   * </pre>
   *
   * <code>string failure_message = 3;</code>
   *
   * @return The failureMessage.
   */
  @java.lang.Override
  public java.lang.String getFailureMessage() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      failureMessage_ = s;
      return s;
    }
  }

  /**
   *
   *
   * <pre>
   * User readable message about why the request violated a policy. This is not
   * intended for machine parsing.
   * </pre>
   *
   * <code>string failure_message = 3;</code>
   *
   * @return The bytes for failureMessage.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFailureMessageBytes() {
    java.lang.Object ref = failureMessage_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      failureMessage_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(policy_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, policy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, ruleId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureMessage_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, failureMessage_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(policy_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, policy_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ruleId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, ruleId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(failureMessage_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, failureMessage_);
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
    if (!(obj instanceof com.google.cloud.deploy.v1.PolicyViolationDetails)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.PolicyViolationDetails other =
        (com.google.cloud.deploy.v1.PolicyViolationDetails) obj;

    if (!getPolicy().equals(other.getPolicy())) return false;
    if (!getRuleId().equals(other.getRuleId())) return false;
    if (!getFailureMessage().equals(other.getFailureMessage())) return false;
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
    hash = (37 * hash) + POLICY_FIELD_NUMBER;
    hash = (53 * hash) + getPolicy().hashCode();
    hash = (37 * hash) + RULE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getRuleId().hashCode();
    hash = (37 * hash) + FAILURE_MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getFailureMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.PolicyViolationDetails prototype) {
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
   * Policy violation details.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.PolicyViolationDetails}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.PolicyViolationDetails)
      com.google.cloud.deploy.v1.PolicyViolationDetailsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_PolicyViolationDetails_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_PolicyViolationDetails_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.PolicyViolationDetails.class,
              com.google.cloud.deploy.v1.PolicyViolationDetails.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.PolicyViolationDetails.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      policy_ = "";
      ruleId_ = "";
      failureMessage_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_PolicyViolationDetails_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.PolicyViolationDetails getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.PolicyViolationDetails.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.PolicyViolationDetails build() {
      com.google.cloud.deploy.v1.PolicyViolationDetails result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.PolicyViolationDetails buildPartial() {
      com.google.cloud.deploy.v1.PolicyViolationDetails result =
          new com.google.cloud.deploy.v1.PolicyViolationDetails(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.deploy.v1.PolicyViolationDetails result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.policy_ = policy_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.ruleId_ = ruleId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.failureMessage_ = failureMessage_;
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
      if (other instanceof com.google.cloud.deploy.v1.PolicyViolationDetails) {
        return mergeFrom((com.google.cloud.deploy.v1.PolicyViolationDetails) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.PolicyViolationDetails other) {
      if (other == com.google.cloud.deploy.v1.PolicyViolationDetails.getDefaultInstance())
        return this;
      if (!other.getPolicy().isEmpty()) {
        policy_ = other.policy_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getRuleId().isEmpty()) {
        ruleId_ = other.ruleId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getFailureMessage().isEmpty()) {
        failureMessage_ = other.failureMessage_;
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
            case 10:
              {
                policy_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                ruleId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                failureMessage_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private java.lang.Object policy_ = "";

    /**
     *
     *
     * <pre>
     * Name of the policy that was violated.
     * Policy resource will be in the format of
     * `projects/{project}/locations/{location}/policies/{policy}`.
     * </pre>
     *
     * <code>string policy = 1;</code>
     *
     * @return The policy.
     */
    public java.lang.String getPolicy() {
      java.lang.Object ref = policy_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        policy_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Name of the policy that was violated.
     * Policy resource will be in the format of
     * `projects/{project}/locations/{location}/policies/{policy}`.
     * </pre>
     *
     * <code>string policy = 1;</code>
     *
     * @return The bytes for policy.
     */
    public com.google.protobuf.ByteString getPolicyBytes() {
      java.lang.Object ref = policy_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        policy_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Name of the policy that was violated.
     * Policy resource will be in the format of
     * `projects/{project}/locations/{location}/policies/{policy}`.
     * </pre>
     *
     * <code>string policy = 1;</code>
     *
     * @param value The policy to set.
     * @return This builder for chaining.
     */
    public Builder setPolicy(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      policy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Name of the policy that was violated.
     * Policy resource will be in the format of
     * `projects/{project}/locations/{location}/policies/{policy}`.
     * </pre>
     *
     * <code>string policy = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPolicy() {
      policy_ = getDefaultInstance().getPolicy();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Name of the policy that was violated.
     * Policy resource will be in the format of
     * `projects/{project}/locations/{location}/policies/{policy}`.
     * </pre>
     *
     * <code>string policy = 1;</code>
     *
     * @param value The bytes for policy to set.
     * @return This builder for chaining.
     */
    public Builder setPolicyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      policy_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object ruleId_ = "";

    /**
     *
     *
     * <pre>
     * Id of the rule that triggered the policy violation.
     * </pre>
     *
     * <code>string rule_id = 2;</code>
     *
     * @return The ruleId.
     */
    public java.lang.String getRuleId() {
      java.lang.Object ref = ruleId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ruleId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Id of the rule that triggered the policy violation.
     * </pre>
     *
     * <code>string rule_id = 2;</code>
     *
     * @return The bytes for ruleId.
     */
    public com.google.protobuf.ByteString getRuleIdBytes() {
      java.lang.Object ref = ruleId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ruleId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * Id of the rule that triggered the policy violation.
     * </pre>
     *
     * <code>string rule_id = 2;</code>
     *
     * @param value The ruleId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ruleId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Id of the rule that triggered the policy violation.
     * </pre>
     *
     * <code>string rule_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRuleId() {
      ruleId_ = getDefaultInstance().getRuleId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * Id of the rule that triggered the policy violation.
     * </pre>
     *
     * <code>string rule_id = 2;</code>
     *
     * @param value The bytes for ruleId to set.
     * @return This builder for chaining.
     */
    public Builder setRuleIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ruleId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object failureMessage_ = "";

    /**
     *
     *
     * <pre>
     * User readable message about why the request violated a policy. This is not
     * intended for machine parsing.
     * </pre>
     *
     * <code>string failure_message = 3;</code>
     *
     * @return The failureMessage.
     */
    public java.lang.String getFailureMessage() {
      java.lang.Object ref = failureMessage_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        failureMessage_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * User readable message about why the request violated a policy. This is not
     * intended for machine parsing.
     * </pre>
     *
     * <code>string failure_message = 3;</code>
     *
     * @return The bytes for failureMessage.
     */
    public com.google.protobuf.ByteString getFailureMessageBytes() {
      java.lang.Object ref = failureMessage_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        failureMessage_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    /**
     *
     *
     * <pre>
     * User readable message about why the request violated a policy. This is not
     * intended for machine parsing.
     * </pre>
     *
     * <code>string failure_message = 3;</code>
     *
     * @param value The failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      failureMessage_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * User readable message about why the request violated a policy. This is not
     * intended for machine parsing.
     * </pre>
     *
     * <code>string failure_message = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFailureMessage() {
      failureMessage_ = getDefaultInstance().getFailureMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * User readable message about why the request violated a policy. This is not
     * intended for machine parsing.
     * </pre>
     *
     * <code>string failure_message = 3;</code>
     *
     * @param value The bytes for failureMessage to set.
     * @return This builder for chaining.
     */
    public Builder setFailureMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      failureMessage_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.PolicyViolationDetails)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.PolicyViolationDetails)
  private static final com.google.cloud.deploy.v1.PolicyViolationDetails DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.PolicyViolationDetails();
  }

  public static com.google.cloud.deploy.v1.PolicyViolationDetails getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PolicyViolationDetails> PARSER =
      new com.google.protobuf.AbstractParser<PolicyViolationDetails>() {
        @java.lang.Override
        public PolicyViolationDetails parsePartialFrom(
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

  public static com.google.protobuf.Parser<PolicyViolationDetails> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PolicyViolationDetails> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.PolicyViolationDetails getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
