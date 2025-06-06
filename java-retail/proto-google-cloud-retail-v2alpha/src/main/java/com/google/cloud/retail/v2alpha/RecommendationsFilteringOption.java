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
// source: google/cloud/retail/v2alpha/common.proto

// Protobuf Java Version: 3.25.8
package com.google.cloud.retail.v2alpha;

/**
 *
 *
 * <pre>
 * If filtering for recommendations is enabled.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.retail.v2alpha.RecommendationsFilteringOption}
 */
public enum RecommendationsFilteringOption implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Value used when unset.
   * In this case, server behavior defaults to
   * [RECOMMENDATIONS_FILTERING_DISABLED][google.cloud.retail.v2alpha.RecommendationsFilteringOption.RECOMMENDATIONS_FILTERING_DISABLED].
   * </pre>
   *
   * <code>RECOMMENDATIONS_FILTERING_OPTION_UNSPECIFIED = 0;</code>
   */
  RECOMMENDATIONS_FILTERING_OPTION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Recommendation filtering is disabled.
   * </pre>
   *
   * <code>RECOMMENDATIONS_FILTERING_DISABLED = 1;</code>
   */
  RECOMMENDATIONS_FILTERING_DISABLED(1),
  /**
   *
   *
   * <pre>
   * Recommendation filtering is enabled.
   * </pre>
   *
   * <code>RECOMMENDATIONS_FILTERING_ENABLED = 3;</code>
   */
  RECOMMENDATIONS_FILTERING_ENABLED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Value used when unset.
   * In this case, server behavior defaults to
   * [RECOMMENDATIONS_FILTERING_DISABLED][google.cloud.retail.v2alpha.RecommendationsFilteringOption.RECOMMENDATIONS_FILTERING_DISABLED].
   * </pre>
   *
   * <code>RECOMMENDATIONS_FILTERING_OPTION_UNSPECIFIED = 0;</code>
   */
  public static final int RECOMMENDATIONS_FILTERING_OPTION_UNSPECIFIED_VALUE = 0;

  /**
   *
   *
   * <pre>
   * Recommendation filtering is disabled.
   * </pre>
   *
   * <code>RECOMMENDATIONS_FILTERING_DISABLED = 1;</code>
   */
  public static final int RECOMMENDATIONS_FILTERING_DISABLED_VALUE = 1;

  /**
   *
   *
   * <pre>
   * Recommendation filtering is enabled.
   * </pre>
   *
   * <code>RECOMMENDATIONS_FILTERING_ENABLED = 3;</code>
   */
  public static final int RECOMMENDATIONS_FILTERING_ENABLED_VALUE = 3;

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
  public static RecommendationsFilteringOption valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static RecommendationsFilteringOption forNumber(int value) {
    switch (value) {
      case 0:
        return RECOMMENDATIONS_FILTERING_OPTION_UNSPECIFIED;
      case 1:
        return RECOMMENDATIONS_FILTERING_DISABLED;
      case 3:
        return RECOMMENDATIONS_FILTERING_ENABLED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<RecommendationsFilteringOption>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<RecommendationsFilteringOption>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<RecommendationsFilteringOption>() {
            public RecommendationsFilteringOption findValueByNumber(int number) {
              return RecommendationsFilteringOption.forNumber(number);
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
    return com.google.cloud.retail.v2alpha.CommonProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final RecommendationsFilteringOption[] VALUES = values();

  public static RecommendationsFilteringOption valueOf(
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

  private RecommendationsFilteringOption(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.retail.v2alpha.RecommendationsFilteringOption)
}
