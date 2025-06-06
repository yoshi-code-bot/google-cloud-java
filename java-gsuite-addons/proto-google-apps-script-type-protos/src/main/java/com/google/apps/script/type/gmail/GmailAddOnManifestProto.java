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
// source: google/apps/script/type/gmail/gmail_addon_manifest.proto

// Protobuf Java Version: 3.25.8
package com.google.apps.script.type.gmail;

public final class GmailAddOnManifestProto {
  private GmailAddOnManifestProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_gmail_GmailAddOnManifest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_gmail_GmailAddOnManifest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_gmail_UniversalAction_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_gmail_UniversalAction_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_gmail_ComposeTrigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_gmail_ComposeTrigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_gmail_ContextualTrigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_gmail_ContextualTrigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_apps_script_type_gmail_UnconditionalTrigger_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_apps_script_type_gmail_UnconditionalTrigger_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/apps/script/type/gmail/gmail_ad"
          + "don_manifest.proto\022\035google.apps.script.t"
          + "ype.gmail\032.google/apps/script/type/addon"
          + "_widget_set.proto\032-google/apps/script/ty"
          + "pe/extension_point.proto\"\347\002\n\022GmailAddOnM"
          + "anifest\022I\n\020homepage_trigger\030\016 \001(\0132/.goog"
          + "le.apps.script.type.HomepageExtensionPoi"
          + "nt\022M\n\023contextual_triggers\030\003 \003(\01320.google"
          + ".apps.script.type.gmail.ContextualTrigge"
          + "r\022I\n\021universal_actions\030\004 \003(\0132..google.ap"
          + "ps.script.type.gmail.UniversalAction\022F\n\017"
          + "compose_trigger\030\014 \001(\0132-.google.apps.scri"
          + "pt.type.gmail.ComposeTrigger\022$\n\034authoriz"
          + "ation_check_function\030\007 \001(\t\"[\n\017UniversalA"
          + "ction\022\014\n\004text\030\001 \001(\t\022\023\n\topen_link\030\002 \001(\tH\000"
          + "\022\026\n\014run_function\030\003 \001(\tH\000B\r\n\013action_type\""
          + "\333\001\n\016ComposeTrigger\022@\n\007actions\030\005 \003(\0132/.go"
          + "ogle.apps.script.type.MenuItemExtensionP"
          + "oint\022O\n\014draft_access\030\004 \001(\01629.google.apps"
          + ".script.type.gmail.ComposeTrigger.DraftA"
          + "ccess\"6\n\013DraftAccess\022\017\n\013UNSPECIFIED\020\000\022\010\n"
          + "\004NONE\020\001\022\014\n\010METADATA\020\002\"\211\001\n\021ContextualTrig"
          + "ger\022L\n\runconditional\030\001 \001(\01323.google.apps"
          + ".script.type.gmail.UnconditionalTriggerH"
          + "\000\022\033\n\023on_trigger_function\030\004 \001(\tB\t\n\007trigge"
          + "r\"\026\n\024UnconditionalTriggerB\340\001\n!com.google"
          + ".apps.script.type.gmailB\027GmailAddOnManif"
          + "estProtoP\001Z<google.golang.org/genproto/g"
          + "oogleapis/apps/script/type/gmail\252\002\035Googl"
          + "e.Apps.Script.Type.Gmail\312\002\035Google\\Apps\\S"
          + "cript\\Type\\Gmail\352\002!Google::Apps::Script:"
          + ":Type::Gmailb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.apps.script.type.AddOnWidgetSetProto.getDescriptor(),
              com.google.apps.script.type.ExtensionPoint.getDescriptor(),
            });
    internal_static_google_apps_script_type_gmail_GmailAddOnManifest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_apps_script_type_gmail_GmailAddOnManifest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_gmail_GmailAddOnManifest_descriptor,
            new java.lang.String[] {
              "HomepageTrigger",
              "ContextualTriggers",
              "UniversalActions",
              "ComposeTrigger",
              "AuthorizationCheckFunction",
            });
    internal_static_google_apps_script_type_gmail_UniversalAction_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_apps_script_type_gmail_UniversalAction_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_gmail_UniversalAction_descriptor,
            new java.lang.String[] {
              "Text", "OpenLink", "RunFunction", "ActionType",
            });
    internal_static_google_apps_script_type_gmail_ComposeTrigger_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_apps_script_type_gmail_ComposeTrigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_gmail_ComposeTrigger_descriptor,
            new java.lang.String[] {
              "Actions", "DraftAccess",
            });
    internal_static_google_apps_script_type_gmail_ContextualTrigger_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_apps_script_type_gmail_ContextualTrigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_gmail_ContextualTrigger_descriptor,
            new java.lang.String[] {
              "Unconditional", "OnTriggerFunction", "Trigger",
            });
    internal_static_google_apps_script_type_gmail_UnconditionalTrigger_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_apps_script_type_gmail_UnconditionalTrigger_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_apps_script_type_gmail_UnconditionalTrigger_descriptor,
            new java.lang.String[] {});
    com.google.apps.script.type.AddOnWidgetSetProto.getDescriptor();
    com.google.apps.script.type.ExtensionPoint.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
