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
// source: google/chat/v1/reaction.proto

// Protobuf Java Version: 3.25.5
package com.google.chat.v1;

public final class ReactionProto {
  private ReactionProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_Reaction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_Reaction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_Emoji_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_Emoji_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_CustomEmoji_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_CustomEmoji_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_EmojiReactionSummary_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_EmojiReactionSummary_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_CreateReactionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_CreateReactionRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ListReactionsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ListReactionsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_ListReactionsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_ListReactionsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_chat_v1_DeleteReactionRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_chat_v1_DeleteReactionRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\035google/chat/v1/reaction.proto\022\016google."
          + "chat.v1\032\037google/api/field_behavior.proto"
          + "\032\033google/api/field_info.proto\032\031google/ap"
          + "i/resource.proto\032\031google/chat/v1/user.pr"
          + "oto\"\314\001\n\010Reaction\022\021\n\004name\030\001 \001(\tB\003\340A\010\022\'\n\004u"
          + "ser\030\002 \001(\0132\024.google.chat.v1.UserB\003\340A\003\022)\n\005"
          + "emoji\030\003 \001(\0132\025.google.chat.v1.EmojiB\003\340A\002:"
          + "Y\352AV\n\034chat.googleapis.com/Reaction\0226spac"
          + "es/{space}/messages/{message}/reactions/"
          + "{reaction}\"_\n\005Emoji\022\026\n\007unicode\030\001 \001(\tB\003\340A"
          + "\001H\000\0223\n\014custom_emoji\030\002 \001(\0132\033.google.chat."
          + "v1.CustomEmojiH\000B\t\n\007content\"\'\n\013CustomEmo"
          + "ji\022\030\n\003uid\030\001 \001(\tB\013\340A\003\342\214\317\327\010\002\010\001\"v\n\024EmojiRea"
          + "ctionSummary\022)\n\005emoji\030\001 \001(\0132\025.google.cha"
          + "t.v1.EmojiB\003\340A\003\022 \n\016reaction_count\030\002 \001(\005B"
          + "\003\340A\003H\000\210\001\001B\021\n\017_reaction_count\"~\n\025CreateRe"
          + "actionRequest\0224\n\006parent\030\001 \001(\tB$\340A\002\372A\036\022\034c"
          + "hat.googleapis.com/Reaction\022/\n\010reaction\030"
          + "\002 \001(\0132\030.google.chat.v1.ReactionB\003\340A\002\"\222\001\n"
          + "\024ListReactionsRequest\0224\n\006parent\030\001 \001(\tB$\340"
          + "A\002\372A\036\022\034chat.googleapis.com/Reaction\022\026\n\tp"
          + "age_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB"
          + "\003\340A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\"]\n\025ListReactio"
          + "nsResponse\022+\n\treactions\030\001 \003(\0132\030.google.c"
          + "hat.v1.Reaction\022\027\n\017next_page_token\030\002 \001(\t"
          + "\"K\n\025DeleteReactionRequest\0222\n\004name\030\001 \001(\tB"
          + "$\340A\002\372A\036\n\034chat.googleapis.com/ReactionB\246\001"
          + "\n\022com.google.chat.v1B\rReactionProtoP\001Z,c"
          + "loud.google.com/go/chat/apiv1/chatpb;cha"
          + "tpb\242\002\013DYNAPIProto\252\002\023Google.Apps.Chat.V1\312"
          + "\002\023Google\\Apps\\Chat\\V1\352\002\026Google::Apps::Ch"
          + "at::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.FieldInfoProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.chat.v1.UserProto.getDescriptor(),
            });
    internal_static_google_chat_v1_Reaction_descriptor = getDescriptor().getMessageTypes().get(0);
    internal_static_google_chat_v1_Reaction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_Reaction_descriptor,
            new java.lang.String[] {
              "Name", "User", "Emoji",
            });
    internal_static_google_chat_v1_Emoji_descriptor = getDescriptor().getMessageTypes().get(1);
    internal_static_google_chat_v1_Emoji_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_Emoji_descriptor,
            new java.lang.String[] {
              "Unicode", "CustomEmoji", "Content",
            });
    internal_static_google_chat_v1_CustomEmoji_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_chat_v1_CustomEmoji_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_CustomEmoji_descriptor,
            new java.lang.String[] {
              "Uid",
            });
    internal_static_google_chat_v1_EmojiReactionSummary_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_chat_v1_EmojiReactionSummary_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_EmojiReactionSummary_descriptor,
            new java.lang.String[] {
              "Emoji", "ReactionCount",
            });
    internal_static_google_chat_v1_CreateReactionRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_chat_v1_CreateReactionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_CreateReactionRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Reaction",
            });
    internal_static_google_chat_v1_ListReactionsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_chat_v1_ListReactionsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ListReactionsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_chat_v1_ListReactionsResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_chat_v1_ListReactionsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_ListReactionsResponse_descriptor,
            new java.lang.String[] {
              "Reactions", "NextPageToken",
            });
    internal_static_google_chat_v1_DeleteReactionRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_chat_v1_DeleteReactionRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_chat_v1_DeleteReactionRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.FieldInfoProto.fieldInfo);
    registry.add(com.google.api.ResourceProto.resource);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.FieldInfoProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.chat.v1.UserProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
